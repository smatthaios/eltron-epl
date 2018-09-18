package gr.amigos.epl.domain;

import java.util.ArrayList;
import java.util.List;

public class EltronBaseElement {

    private EltronCommand eltronCommand;
    private List<String> parameters;

    public EltronBaseElement(EltronCommand eltronCommand) {
        this.eltronCommand = eltronCommand;
        this.parameters = new ArrayList<>();
    }

    public EltronBaseElement addParameter(String parameter) {
        this.parameters.add(parameter);
        return this;
    }

    public String getPrintCode() {
        return eltronCommand.getValue().concat(String.join(",", parameters));
    }


}
