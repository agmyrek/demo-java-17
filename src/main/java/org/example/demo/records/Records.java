package org.example.demo.records;

import java.util.List;

/**
 * Eingeschränkte Klassendeklaration. Ähnlich zu Enums.
 * Kompakte Syntax.
 * Könnte Lombok teilweise obsolet machen.
 *
 * Erzeugt wird eine unveränderliche Klasse (immutable class)
 */
public record Records(String name, Integer alter, List<String> list) {


}
