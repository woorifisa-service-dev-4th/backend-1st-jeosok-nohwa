/**
 * 사용자(User) 정보를 관리하는 클래스
 */class User {
    /** 사용자 고유 ID */
    private Long id;
    /** 사용자 닉네임 */
    private String nickname;
    /** 사용자 이메일 */
    private String email;
    /** 사용자 키 (cm) */
    private double height;
    /** 사용자 몸무게 (kg) */
    private double weight;
    /** BMI 지수 */
    private double bmi;
    /** 프로필 사진 URL */
    private String profilePicture;
    /** 계정 상태 (ACTIVE, INACTIVE, DELETED) */
    private String status;
    /** 관리자 여부 */
    private boolean isAdmin;

    /**
     * 사용자 객체 생성자
     * @param id 사용자 ID
     * @param nickname 닉네임
     * @param email 이메일
     * @param height 키(cm)
     * @param weight 몸무게(kg)
     */
    public User(Long id, String nickname, String email, double height, double weight) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.height = height;
        this.weight = weight;
        this.bmi = calculateBMI();
        this.status = "ACTIVE";
        this.isAdmin = false;
    }

    /**
     * BMI 계산
     * @return 계산된 BMI 값
     */
    public double calculateBMI() {
        return weight / ((height / 100) * (height / 100));
    }

    /**
     * 사용자 프로필 업데이트
     * @param nickname 새로운 닉네임
     * @param height 새로운 키
     * @param weight 새로운 몸무게
     */
    public void updateProfile(String nickname, double height, double weight) {
        this.nickname = nickname;
        this.height = height;
        this.weight = weight;
        this.bmi = calculateBMI();
    }

    /** 계정을 탈퇴 상태로 변경 */
    public void deleteAccount() {
        this.status = "DELETED";
    }

    /**
     * 사용자 정보 반환
     * @return 사용자 정보 문자열
     */
    public String getUserInfo() {
        return String.format("User: %s (%s) | BMI: %.2f | Status: %s", nickname, email, bmi, status);
    }
}
