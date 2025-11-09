package jake1702.civilisedillumination.misc;

public enum EnumFirebox {
    SOLID(0, ModStrings.stringFirebox),
    LIQUID(1, ModStrings.stringFireboxLiquid);

    private final int meta;
    private final String name;

    EnumFirebox(int meta, String name) {
        this.meta = meta;
        this.name = name;
    }

    public int getMeta() {
        return this.meta;
    }

    public String getName() {
        return this.name;
    }

    public static int count() {
        return values().length;
    }
}
