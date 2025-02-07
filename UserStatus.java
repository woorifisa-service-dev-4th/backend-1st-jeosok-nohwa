/**
 * 계정 상태를 나타내는 Enum.
 */
public enum UserStatus {
    /** 활성 상태 (정상적으로 사용 가능) */
    ACTIVE,

    /** 휴먼 계정 상태 (일정 기간 활동 없음) */
    INACTIVE,

    /** 탈퇴된 계정 (더 이상 사용 불가) */
    DELETED
}
