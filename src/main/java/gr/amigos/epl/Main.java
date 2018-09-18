package gr.amigos.epl;

import gr.amigos.epl.domain.EltronCommand;
import gr.amigos.epl.domain.EltronBaseElement;
import gr.amigos.epl.domain.EltronFont;
import gr.amigos.epl.domain.EltronHorizontalMultiplier;
import gr.amigos.epl.domain.EltronLabel;
import gr.amigos.epl.domain.EltronReverseImage;
import gr.amigos.epl.domain.EltronRotation;
import gr.amigos.epl.domain.EltronVerticalMultiplier;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        EltronBaseElement startElement = new EltronBaseElement(EltronCommand.CLEAR_IMAGE_BUFFER);
        EltronBaseElement formWidth = new EltronBaseElement(EltronCommand.SET_FORM_WIDTH).addParameter("400");
        EltronBaseElement formLength = new EltronBaseElement(EltronCommand.SET_FORM_LENGTH).addParameter("199").addParameter("24+0");
        EltronBaseElement density = new EltronBaseElement(EltronCommand.DENSITY).addParameter("10");
        EltronBaseElement conan = new EltronBaseElement(EltronCommand.ASCII_TEXT).addParameter("20").addParameter("6")
                .addParameter(EltronRotation.NO_ROTATION.getValue()).addParameter(EltronFont.ONE.getValue())
                .addParameter(EltronHorizontalMultiplier.ONE.getValue()).addParameter(EltronVerticalMultiplier.ONE.getValue())
                .addParameter(EltronReverseImage.NORMAL.getValue())
                .addParameter("  COONABARABRAN RURAL  ");
        EltronBaseElement part = new EltronBaseElement(EltronCommand.ASCII_TEXT).addParameter("18").addParameter("37")
                .addParameter(EltronRotation.NO_ROTATION.getValue()).addParameter(EltronFont.ONE.getValue())
                .addParameter(EltronHorizontalMultiplier.ONE.getValue()).addParameter(EltronVerticalMultiplier.ONE.getValue())
                .addParameter(EltronReverseImage.NORMAL.getValue())
                .addParameter("<PART>");
        EltronBaseElement endLabel = new EltronBaseElement(EltronCommand.P1_END_LABEL);


        EltronLabel eltronLabel = new EltronLabel().addElement(startElement).addElement(formWidth).addElement(formLength).addElement(density).addElement(conan).addElement(part).addElement(endLabel);

        System.out.println(eltronLabel.getPrintCode());

    }
}
