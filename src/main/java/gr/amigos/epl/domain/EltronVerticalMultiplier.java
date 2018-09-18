package gr.amigos.epl.domain;

public enum EltronVerticalMultiplier {

    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8);

    private int value;

    EltronVerticalMultiplier(int value) {
        this.value = value;
    }

    public String getValue() {
        return String.valueOf(value);
    }
}
