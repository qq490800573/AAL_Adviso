package com.iitp.saltlux_talkbot.chatbot

internal data class Chat(
    var id: Int,
    val type: ChatType,
    val category: String = "",
    val subCategory: String = "",
    val text: String = "",
    val ttsText: String = ""
)

internal enum class ChatType(val value: String) {
    MESSAGE("message"), INFORMATION("information"), EMERGENCY("emergency")
}

internal fun Message.toChat(id: Int): Chat {
    return Chat(
        id = id,
        type = when (type) {
            MessageType.UUID -> error("The uuid type cannot be chat.")
            MessageType.MESSAGE -> ChatType.MESSAGE
            MessageType.INFORMATION -> ChatType.INFORMATION
            MessageType.EMERGENCY -> ChatType.EMERGENCY
        },
        category = category,
        subCategory = subCategory,
        text = message,
        ttsText = ttsMessage ?: ""
    )
}