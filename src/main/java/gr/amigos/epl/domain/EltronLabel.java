package gr.amigos.epl.domain;

import java.util.List;
import java.util.stream.Collectors;

public class EltronLabel {
    private List<EltronElement> eltronElements;

    public EltronLabel(List<EltronElement> eltronElements) {
        this.eltronElements = eltronElements;
    }

    public String getPrintCode() {
        return eltronElements
                .stream()
                .map(EltronElement::getPrintCode)
                .collect(Collectors.joining("\n"));
    }

    public List<EltronElement> getEltronElements() {
        return eltronElements;
    }

    public void setEltronElements(List<EltronElement> eltronElements) {
        this.eltronElements = eltronElements;
    }
}
