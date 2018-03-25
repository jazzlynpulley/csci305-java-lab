package csci305.javalab;

/**
 * Jazzlyn Pulley
 * CSCI 305 Java Lab
 */

public abstract class Element {
    private String name ;
    
    Element(String name){
        this.name = name ;
    }    
    
    public String getName(){
        return name ;
    }
    
    public abstract String compareTo(Element element1);
}

