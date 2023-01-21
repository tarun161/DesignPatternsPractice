package CreationalDesignPatterns;

public class BuilderClassTest {
    public static void main(String[] args) {
        BuilderClass builderClassTest = BuilderClass.builder().field1(1).field2(23).field3("Tarun").build();
        System.out.println(builderClassTest.toString());
    }
}
