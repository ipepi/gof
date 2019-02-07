package gof.flyweight;

import java.util.HashMap;
import java.util.Map;

public class HumanLetterFactory {

Map<String, HumanLetter> map = new HashMap<String, HumanLetter>();

private static HumanLetterFactory singleton = new HumanLetterFactory();

private HumanLetterFactory(){};

public HumanLetterFactory getInstance(){
    return singleton;
}

public synchronized HumanLetter getHumanLetter(String letter){
    HumanLetter humanLetter = map.get(letter);
    if(humanLetter == null){
        humanLetter = new HumanLetter(letter);
        map.put(letter, humanLetter);
    }
    return humanLetter;
}

}