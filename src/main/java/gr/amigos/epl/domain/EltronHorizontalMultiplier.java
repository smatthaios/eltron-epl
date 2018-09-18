package gr.amigos.epl.domain;

public enum EltronHorizontalMultiplier {

    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    EIGHT(8);

    private int value;

    EltronHorizontalMultiplier(int value) {
        this.value = value;
    }

    public String getValue() {
        return String.valueOf(value);
    }
}
