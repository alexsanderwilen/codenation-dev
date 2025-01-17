package br.com.codenation.challenge.core.enums;

public enum ErrorLevel {

    ERROR(1, "ERROR"),
    WARNING(2, "WARNING"),
    DEBUG(3, "DEBUG");

    private int cod;
    private String description;

    ErrorLevel(int cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public static ErrorLevel toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }

        for (ErrorLevel errorLevel : ErrorLevel.values()) {
            if (cod.equals(errorLevel.getCod())) {
                return errorLevel;
            }
        }

        throw new IllegalArgumentException("Invalid id: " + cod);
    }

    public int getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }
}
