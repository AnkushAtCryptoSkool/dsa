package src.practice_aspora.builder;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;

    public Computer(builder builder_1){
        this.cpu = builder_1.cpu;
        this.ram = builder_1.ram;
        this.storage = builder_1.storage;
    }

    public static class builder{
        private String cpu;
        private String ram;
        private String storage;

        public builder(){}

        public builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public builder ram(String ram){
            this.ram = ram;
            return this;
        }
        public builder storage(String storage){
            this.storage = storage;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }
}
