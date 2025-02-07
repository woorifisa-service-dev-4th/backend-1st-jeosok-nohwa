import java.util.Date;
import java.util.List;

/**
 * 사용자별 하루 채팅 내역을 저장하는 채팅방 클래스
 */class ChatRoom {
    /** 채팅방을 소유한 사용자 ID */
    private Long userId;

    /** 채팅방 생성 날짜 */
    private Date createdAt;

    /** 채팅 메시지 리스트 */
    private List<Chat> chatList;

    /**
     * ChatRoom 생성자
     * @param userId 사용자 ID
     */
    public ChatRoom(Long userId) {
        this.userId = userId;
        this.createdAt = new Date();
    }

    /**
     * 새로운 채팅 메시지 추가
     * @param chat 채팅 메시지 객체
     */
    public void addMessage(Chat chat) {
        chatList.add(chat);
    }

    /**
     * 채팅 내역 반환
     * @return 채팅 메시지 리스트
     */
    public List<Chat> getChatHistory() {
        return chatList;
    }
}
