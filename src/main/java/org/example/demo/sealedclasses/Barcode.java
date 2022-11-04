package org.example.demo.sealedclasses;


/**
 *
 * 3.4. Constraints
 * A sealed class imposes three important constraints on its permitted subclasses:
 *
 * All permitted subclasses must belong to the same module as the sealed class.
 * Every permitted subclass must explicitly extend the sealed class.
 * Every permitted subclass must define a modifier: final, sealed, or non-sealed.
 *
 */
public interface Barcode {
}
