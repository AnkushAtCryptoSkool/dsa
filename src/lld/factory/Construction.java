package src.lld.factory;

public class Construction {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shappe shappe = shapeFactory.getShape("CIRCLE");
        shappe.draw();
    }
}
