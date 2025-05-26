package src.lld.factory;

interface Chair {
    void sitOn();
}

interface Sofa {
    void lieOn();
}

// Concrete Products - Modern
class ModernChair implements Chair {
    public void sitOn() {
        System.out.println("Sitting on a Modern Chair");
    }
}

class ModernSofa implements Sofa {
    public void lieOn() {
        System.out.println("Lying on a Modern Sofa");
    }
}

// Concrete Products - Victorian
class VictorianChair implements Chair {
    public void sitOn() {
        System.out.println("Sitting on a Victorian Chair");
    }
}

class VictorianSofa implements Sofa {
    public void lieOn() {
        System.out.println("Lying on a Victorian Sofa");
    }
}

// Abstract Factory
interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}

// Concrete Factories
class ModernFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new ModernChair();
    }
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

class VictorianFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new VictorianChair();
    }
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

// Main Class
public class AbstractFactory {
    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFurnitureFactory(); // or VictorianFurnitureFactory
        FurnitureFactory factory2 = new VictorianFurnitureFactory();
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();

        chair.sitOn();
        sofa.lieOn();
        chair = factory2.createChair();
        sofa = factory2.createSofa();

        chair.sitOn();
        sofa.lieOn();
    }
}
