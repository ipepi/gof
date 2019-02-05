package gof.mediator;

import java.util.HashMap;
import java.util.Map;

public class Saito implements LoveMediator {

    private Map<String, Colleagure> colleagureMap = new HashMap<String, Colleagure>();

    @Override
    public void addColleagure(Colleagure colleagure) {
        colleagureMap.put(colleagure.getName(), colleagure);
    }

    @Override
    public int Consultation(Colleagure colleagureInLove, Colleagure SecretLover) {
        int possibility = 1;
        return possibility;
    }

}