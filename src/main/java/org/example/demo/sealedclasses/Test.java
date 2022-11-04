package org.example.demo.sealedclasses;

public class Test {

    public static void main(String[] args) {

        Barcode barcode = new UIC();

        if (barcode instanceof UIC uic) {
            uic.toString();
        } else if(barcode instanceof VDV vdv) {
            vdv.toString();
        }

    }
}
