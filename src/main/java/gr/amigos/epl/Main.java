package gr.amigos.epl;

import gr.amigos.epl.domain.EltronCommand;
import gr.amigos.epl.domain.EltronElement;
import gr.amigos.epl.domain.EltronFont;
import gr.amigos.epl.domain.EltronHorizontalMultiplier;
import gr.amigos.epl.domain.EltronLabel;
import gr.amigos.epl.domain.EltronReverseImage;
import gr.amigos.epl.domain.EltronRotation;
import gr.amigos.epl.domain.EltronVerticalMultiplier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EltronElement eltronElementA = new EltronElement(EltronCommand.ASCII_TEXT,10,20,EltronRotation.NO_ROTATION,EltronFont.FIVE,EltronHorizontalMultiplier.ONE,EltronVerticalMultiplier.ONE,EltronReverseImage.NORMAL,"Orestes");
        EltronElement eltronElementB = new EltronElement(EltronCommand.BAR_CODE,65,43,EltronRotation.NO_ROTATION,EltronFont.FIVE,EltronHorizontalMultiplier.ONE,EltronVerticalMultiplier.ONE,EltronReverseImage.NORMAL,"SomeOtherStuff");
        EltronElement eltronElementC = new EltronElement(EltronCommand.BLACK_LINE_SENSOR,10,20,EltronRotation.NO_ROTATION,EltronFont.ONE,EltronHorizontalMultiplier.THREE,EltronVerticalMultiplier.ONE,EltronReverseImage.NORMAL,"Stelios");
        EltronElement eltronElementD = new EltronElement(EltronCommand.CANCEL_CUSTOMIZE_BAR_CODE,32,20,EltronRotation.NO_ROTATION,EltronFont.THREE,EltronHorizontalMultiplier.ONE,EltronVerticalMultiplier.ONE,EltronReverseImage.NORMAL,"Bill");
        EltronElement eltronElementE = new EltronElement(EltronCommand.BOX_DRAW,12,76,EltronRotation.ONE_HUNDRED_EIGHTY_DEGREES,EltronFont.FIVE,EltronHorizontalMultiplier.ONE,EltronVerticalMultiplier.ONE,EltronReverseImage.NORMAL,"asda");

        List<EltronElement> eltronElements = Arrays.asList(eltronElementA,eltronElementB,eltronElementC,eltronElementD,eltronElementE);

        EltronLabel eltronLabel = new EltronLabel(eltronElements);

        System.out.println(eltronLabel.getPrintCode());

    }
}
