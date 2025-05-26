package src.lld.factory;

public class ShapeFactory {

    public Shappe getShape(String input){
        switch (input){
            case "CIRCLE": return new Circle();
            case "RECTANGLE": return new Rectangle();
            default: return null;
        }

    }
}
