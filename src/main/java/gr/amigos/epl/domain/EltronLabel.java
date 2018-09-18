package gr.amigos.epl.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EltronLabel {

    private List<EltronBaseElement> eltronBaseElements;

    public EltronLabel(List<EltronBaseElement> eltronBaseElements) {
        this.eltronBaseElements = eltronBaseElements;
    }

    public EltronLabel(){
        this.eltronBaseElements = new ArrayList<>();
    }

    public String getPrintCode() {
        return eltronBaseElements
                .stream()
                .map(EltronBaseElement::getPrintCode)
                .collect(Collectors.joining("\n")).concat("\n");
    }

    public EltronLabel addElement(EltronBaseElement eltronBaseElement){
        this.eltronBaseElements.add(eltronBaseElement);
        return this;
    }
}
