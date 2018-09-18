package gr.amigos.epl.domain;

public enum EltronRotation {

    NO_ROTATION(0),
    NINTY_DEGREES(90),
    ONE_HUNDRED_EIGHTY_DEGREES(180),
    TWO_HUNDRED_SEVENTY_DEGREES(270);

    private int value;

    EltronRotation(int value) {
        this.value = value;
    }

    public String getValue() {
        return String.valueOf(value);
    }
}
