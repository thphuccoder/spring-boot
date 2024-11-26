package tech.bumbii.identity_service.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(999, "Uncategorized exception"),
    USERNAME_INVALID(1003, "Username must be at least 3 characters"),
    PASSWORD_INVALID(1004, "Password must be at least 8 characters"),
    INVALID_KEY(1001, "Invalid message key"),
    USER_EXISTED(1002, "User existed");

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
    private int code;
    private String message;


    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
