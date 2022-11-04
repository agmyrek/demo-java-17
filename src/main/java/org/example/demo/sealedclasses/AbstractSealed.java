package org.example.demo.sealedclasses;


public abstract sealed class AbstractSealed permits AbstractSealed.Sub1, AbstractSealed.Sub2 {

    final class Sub1 extends AbstractSealed{}
    final class Sub2 extends AbstractSealed{}
}
