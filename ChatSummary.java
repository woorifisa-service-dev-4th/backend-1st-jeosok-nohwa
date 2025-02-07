import java.util.Date;

/**
 * ChatGPT 대화 요약을 저장하는 클래스
 */class ChatSummary {
    /** 요약 ID */
    private Long id;

    /** 긴 요약 내용 */
    private String longSummary;

    /** 짧은 요약 내용 */
    private String shortSummary;

    /** 요약 생성 시간 */
    private Date createdAt;

    /** 기록 날짜 */
    private Date recordDate;

    /**
     * ChatSummary 생성자
     * @param id 요약 ID
     * @param longSummary 긴 요약 내용
     * @param shortSummary 짧은 요약 내용
     * @param recordDate 기록 날짜
     */
    public ChatSummary(Long id, String longSummary, String shortSummary, Date recordDate) {
        this.id = id;
        this.longSummary = longSummary;
        this.shortSummary = shortSummary;
        this.createdAt = new Date();
        this.recordDate = recordDate;
    }

    /**
     * 요약 정보 반환
     * @return 요약 정보 문자열
     */
    public String getSummary() {
        return String.format("Summary [%s]: %s", recordDate, shortSummary);
    }
}
