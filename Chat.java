import java.util.Date;

/**
 * ChatGPT와의 채팅 메시지를 저장하는 클래스
 */class Chat {
    /** 채팅 메시지 ID */
    private Long id;
    /** 채팅 메시지 내용 */
    private String content;
    /** 채팅이 생성된 시간 */
    private Date createdAt;
    /** 기록된 날짜 */
    private Date recordDate;
    /** 채팅 타입 (USER, GPT) */
    private String type;
    /** 해당 채팅이 속한 채팅방 ID */
    private Long chatRoomId;

    /**
     * Chat 객체 생성자
     * @param id 채팅 ID
     * @param content 메시지 내용
     * @param recordDate 기록된 날짜
     * @param type 채팅 유형
     * @param chatRoomId 채팅방 ID
     */
    public Chat(Long id, String content, Date recordDate, String type, Long chatRoomId) {
        this.id = id;
        this.content = content;
        this.createdAt = new Date();
        this.recordDate = recordDate;
        this.type = type;
        this.chatRoomId = chatRoomId;
    }

    /**
     * 채팅 메시지 반환
     * @return 채팅 메시지 문자열
     */
    public String getMessage() {
        return String.format("[%s] %s: %s", createdAt, type, content);
    }
}
