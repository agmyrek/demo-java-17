package org.example.demo.sealedclasses;

import org.example.demo.SwitchExpressions;

public class UsingSealing {



    public void testNewSwitch(Barcode barcode){
        var result = switch(barcode) {
            case UIC uic -> 1;
            case VDV vdv -> 2;
            case BarcodeTaube taube -> 0;
            default -> throw new IllegalStateException("Unexpected value: " + barcode);
        };
    }
}
