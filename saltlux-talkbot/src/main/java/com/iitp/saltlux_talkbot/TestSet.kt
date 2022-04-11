package com.iitp.saltlux_talkbot


typealias Answer = String

internal val personalInformation = listOf(
    // 필수 질문
    "32살", // 연령
    "남자", // 성별
    "서울시 강남구", // 거주지
    "아니오", // 호흡기질환
    "1회", // 백신 접종 횟수
)

internal val personalInformationWithPrev = listOf(
    // 필수 질문
    "이전으로", // 이전으로
    "32살", // 연령
    "이전으로", // 이전으로
    "39살", // 연령
    "남자", // 성별
    "이전으로", // 이전으로
    "여자", // 성별
    "서울시 강남구", // 거주지
    "이전으로", // 이전으로
    "서울시 서초구", // 거주지
    "아니오", // 호흡기질환
    "이전으로", // 이전으로
    "네", // 호흡기질환
    "1회", // 백신 접종 횟수
    "이전으로", // 이전으로
    "0회", // 백신 접종 횟수
)

internal val testAnswerSetResultAbnormal = personalInformation + listOf(
    // 비대면 문진
    "네", "맞습니다", // 확진자 접촉.
)


// 정상종료 테스트셋
internal val testAnswerSetResultNormal = personalInformationWithPrev + listOf(
    // 비대면 문진
    "아니오", "맞습니다", // 확진자 접촉.
    "아니오", "맞습니다", // 해외의료기관방문이력.
    "아니오", "맞습니다", // 자가격리이력.
    "아니오", "맞습니다", // 발열감.
    // 비대면 증상 문진
    "아니오", "맞습니다", // 기침.
    "아니오", // 피로감.
    "아니오", // 근육통.
    "아니오", // 가래.
    "아니오", // 숨참.
    "아니오", // 흉통.
    "아니오", // 오한.
    "아니오", // 두통.
    "아니오", // 목따가움.
    "아니오", // 어지러움.
    "아니오", // 설사.
    "아니오", // 콧물.
    "아니오", // 피가래.
    "아니오", // 코막힘.
)

fun List<Answer>.toTalks() = mapIndexed { index, answer ->
    Talk(
        id = 10000 + index,
        type = TalkType.MESSAGE,
        talker = Talker.USER,
        message = answer,
        canGoPrevious = false,
        answerType = AnswerType.NONE,
        voiceFilePath = ""
    )
}