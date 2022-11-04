package org.example.demo;

public class SwitchExpressions {


    public enum Monat{
        Januar, Februar, März, APRIL, Dezember;
    }

    public int alterSwitch(Monat monat){
        int result = 0;
        switch (monat){
            case Januar:
                result = 1;
                break;
            case Februar:
            case März:
                result = 2;
                break;
            case Dezember:
                result = 3;
                break;
        }
        return result;
    }


    public int testNewSwitch(Monat monat){

        return switch(monat) {
            case Januar -> 1;
            case Februar, März -> 2;
            case Dezember -> {
                var a = 1 + 2;
                yield a;
            }
            default -> 0;
        };
    }

    public void testNewSwitch2(Monat monat){

        switch(monat) {
            case Januar -> {

            }
            case Februar, März -> {

            }
            case Dezember -> {
            }
        };
    }
}
