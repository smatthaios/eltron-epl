package gr.amigos.epl.domain;

public class EltronElement {

    private EltronCommand eltronCommand;
    private int horizontalStartPosition;
    private int verticalStartPosition;
    private EltronRotation eltronRotation;
    private EltronFont eltronFont;
    private EltronHorizontalMultiplier eltronHorizontalMultiplier;
    private EltronVerticalMultiplier eltronVerticalMultiplier;
    private EltronReverseImage eltronReverseImage;
    private String data;

    public EltronElement(EltronCommand eltronCommand, int horizontalStartPosition, int verticalStartPosition, EltronRotation eltronRotation, EltronFont eltronFont, EltronHorizontalMultiplier eltronHorizontalMultiplier, EltronVerticalMultiplier eltronVerticalMultiplier, EltronReverseImage eltronReverseImage, String data) {
        this.eltronCommand = eltronCommand;
        this.horizontalStartPosition = horizontalStartPosition;
        this.verticalStartPosition = verticalStartPosition;
        this.eltronRotation = eltronRotation;
        this.eltronFont = eltronFont;
        this.eltronHorizontalMultiplier = eltronHorizontalMultiplier;
        this.eltronVerticalMultiplier = eltronVerticalMultiplier;
        this.eltronReverseImage = eltronReverseImage;
        this.data = data;
    }

    public String getPrintCode(){
        return String.format("%s%s,%s,%s,%s,%s,%s,%s,\"%s\"",
                eltronCommand.getValue(),
                horizontalStartPosition,
                verticalStartPosition,
                eltronRotation.getValue(),
                eltronFont.getValue(),
                eltronHorizontalMultiplier.getValue(),
                eltronVerticalMultiplier.getValue(),
                eltronReverseImage.getValue(),
                data);
    }

    public EltronCommand getEltronCommand() {
        return eltronCommand;
    }

    public int getHorizontalStartPosition() {
        return horizontalStartPosition;
    }

    public int getVerticalStartPosition() {
        return verticalStartPosition;
    }

    public EltronRotation getEltronRotation() {
        return eltronRotation;
    }

    public EltronFont getEltronFont() {
        return eltronFont;
    }

    public EltronHorizontalMultiplier getEltronHorizontalMultiplier() {
        return eltronHorizontalMultiplier;
    }

    public EltronVerticalMultiplier getEltronVerticalMultiplier() {
        return eltronVerticalMultiplier;
    }

    public EltronReverseImage getEltronReverseImage() {
        return eltronReverseImage;
    }

    public String getData() {
        return data;
    }
}
