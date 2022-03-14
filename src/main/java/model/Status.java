package model;

/**  Статусы тикета, используемые в тестах */
public enum Status {
    OPEN(200),
    CLOSED(404),
    ;

    private final int code;

    Status(int code) {
        this.code=code;
    }

    public int getCode() {
        return code;
    }
}
