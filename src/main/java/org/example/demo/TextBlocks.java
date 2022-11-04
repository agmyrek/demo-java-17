package org.example.demo;

public class TextBlocks {


    /**
     * Textblock muss mit einer neuen Zeile innerhalb gestartet werden.
     *
     * Inside the text blocks, we can freely use newlines and quotes without the need for escaping line breaks.
     * It allows us to include literal fragments of HTML, JSON, SQL, or whatever we need, in a more elegant and readable way.
     */


    private final String json = """
        {
            "name" : "Andreas",
            "alter" : 99,
            "hobbies" : [
                {"name" : "brieftauben züchten"},
                {"name" : "wow"},
                {"name" : "Pizza"}
            ],
            "sonstiges" : "blub"
        }
            """;


    private final String brief = """
            Dear ....
                        
                        
            Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore
            et dolore magna aliquyam erat,
            sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren,
            no sea takimata sanctus est Lorem ipsum dolor sit amet.
                        
                        
            Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut
                        
            labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores
            et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.
                        
            Traling spaces:                                                                
                        
            """;

    private final String spaces = """
                                             Leerzeichen vor und danach                asdsa   """;

    private final String html = """

            <html>
                <body>
                    <span>example text</span>
                </body>
            </html>
                        
            """;

    private final String htmlMitPlatzhalter = """

            <html>
                <body>
                    <span>%s</span>
                </body>
            </html>
                        
            """.formatted("dynamischer Wert");


}
