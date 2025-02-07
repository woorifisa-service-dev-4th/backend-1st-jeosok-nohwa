/**
 * 건강 관련 뉴스를 저장하는 클래스
 */class NewsCrawling {
    /** 뉴스 ID */
    private Long id;
    /** 뉴스 내용 */
    private String content;
    /** 뉴스 카테고리 (운동, 영양 등) */
    private String category;

    /**
     * NewsCrawling 생성자
     * @param id 뉴스 ID
     * @param content 뉴스 내용
     * @param category 뉴스 카테고리
     */
    public NewsCrawling(Long id, String content, String category) {
        this.id = id;
        this.content = content;
        this.category = category;
    }

    /**
     * 뉴스 정보 반환
     * @return 뉴스 정보 문자열
     */
    public String getNewsDetails() {
        return String.format("[%s] %s", category, content);
    }
}