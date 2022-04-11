package com.iitp.saltlux_talkbot

import com.iitp.saltlux_talkbot.chatbot.Chat
import com.iitp.saltlux_talkbot.chatbot.ChatType
import com.iitp.saltlux_talkbot.stt.Transcript

data class Talk(
    val id: Int,
    val type: TalkType,
    val answerType: AnswerType,
    val talker: Talker,
    val message: String,
    var voiceFilePath: String = "",
    val canGoPrevious: Boolean = false
)

enum class Talker {
    USER, BOT
}

enum class TalkType {
    MESSAGE, END, INFORMATION, SENSOR, EMERGENCY
}

enum class AnswerType {
    AGE, GENDER, LOCATION, TIMES, YES_OR_NO, RIGHT_OR_WRONG, NONE
}

internal fun Chat.toTalk(id: Int): Talk {
    val talkType = when (type) {
        ChatType.MESSAGE -> when (category) {
            "센서" -> TalkType.SENSOR
            else -> TalkType.MESSAGE
        }
        ChatType.INFORMATION -> TalkType.INFORMATION
        ChatType.EMERGENCY -> when (subCategory) {
            "문진정상완료" -> TalkType.END
            else -> TalkType.EMERGENCY
        }
    }

    val answerType = if (talkType == TalkType.MESSAGE) {
        when (category) {
            "필수질문" -> when (subCategory) {
                "연령" -> AnswerType.AGE
                "성별" -> AnswerType.GENDER
                "거주지역" -> AnswerType.LOCATION
                "호흡기질환" -> AnswerType.YES_OR_NO
                "백신접종횟수" -> AnswerType.TIMES
                else -> AnswerType.NONE
            }
            "비대면문진" -> if (subCategory.contains("재확인")) AnswerType.RIGHT_OR_WRONG else AnswerType.YES_OR_NO
            "비대면증상문진" -> if (subCategory.contains("재확인")) AnswerType.RIGHT_OR_WRONG else AnswerType.YES_OR_NO
            else -> AnswerType.NONE
        }
    } else AnswerType.NONE

    val canGoPrevious = when (category) {
        "필수질문" -> subCategory != "연령"
        "비대면문진" -> text.contains("지금부터")
        "비대면증상문진" -> !text.contains("지금부터")
        else -> false
    }

    val message = if (type == ChatType.INFORMATION) "$subCategory : $text"
    else text.replace("?", "?\n")
        .replace(".", ".\n")
        .replace("\n ", "\n")

    return Talk(
        id = id, type = talkType, answerType = answerType,
        talker = Talker.BOT, message = message, canGoPrevious = canGoPrevious
    )
}

internal fun Transcript.toTalk(id: Int): Talk {
    return Talk(
        id = id,
        type = TalkType.MESSAGE,
        answerType = AnswerType.NONE,
        talker = Talker.USER,
        message = text,
        voiceFilePath = ""
    )
}