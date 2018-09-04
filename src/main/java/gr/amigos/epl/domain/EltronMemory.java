package gr.amigos.epl.domain;

public enum EltronMemory {

    IMAGE("Image"),
    FORM("Form"),
    STORED("Stored"),
    WRITES("Writes"),
    SESSION("Session"),
    NONE("—");

    private String value;

    EltronMemory(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
