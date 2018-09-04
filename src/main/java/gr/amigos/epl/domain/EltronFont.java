package gr.amigos.epl.domain;

public enum EltronFont {

    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5);

    private int value;

    EltronFont(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
