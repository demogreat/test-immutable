public class WarehouseClass {

    private static final WarehouseClass CLASS_A = new WarehouseClass("Class A", 1);
    private static final WarehouseClass CLASS_B = new WarehouseClass("Class B", 2);
    private static final WarehouseClass CLASS_C = new WarehouseClass("Class C", 3);

    private final String className;
    private final int classValue;

    private WarehouseClass(String className, int classValue) {
        this.className = className;
        this.classValue = classValue;
    }

    public static WarehouseClass classA() { return CLASS_A; }

    public static WarehouseClass classB() { return CLASS_B; }

    public static WarehouseClass classC() { return CLASS_C; }

    public String getClassName() { return className; }

    public int getClassValue() { return classValue; }

}
