package gr.amigos.epl.domain;

public enum EltronReverseImage {

    NORMAL("N"),
    REVERSE("R");

    private String value;

    EltronReverseImage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
