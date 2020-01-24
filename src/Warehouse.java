public class Warehouse {

    private final int area;
    private final boolean automated;
    private final String name;
    private final Location location;
    private final WarehouseClass warehouseClass;

    private Warehouse(int area, boolean automated, String name, Location location, WarehouseClass warehouseClass) {
        this.area = area;
        this.automated = automated;
        this.name = name;
        this.location = location;
        this.warehouseClass = warehouseClass;
    }

    public static Warehouse newAutomatedWarehouse(int area, String name, Location location, WarehouseClass warehouseClass) {
        return new Warehouse(area, true, name, location, warehouseClass);
    }

    public static Warehouse newUnautomatedWarehouse(int area, String name, Location location, WarehouseClass warehouseClass) {
        return new Warehouse(area, false, name, location, warehouseClass);
    }

    public int getArea() { return area; }

    public boolean isAutomated() { return automated; }

    public String getName() { return name; }

    public Location getLocation() { return location; }

    public WarehouseClass getWarehouseClass() { return warehouseClass; }

}
