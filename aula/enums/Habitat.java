package enums;

public enum Habitat {
    DOMESTIC(code: 1, displayName:"Domestic"),
    WILD_FOREST(code: 2, displayName:"Wild-Forest"),
    WILD_SAVANNA(code:3, displayName:"Wild-Savanna"),
    WILD_OCEAN(code:4, displayName:"Wild-Ocean"),
    URBAN(code:5, displayName:"Urban"),
    FARM(code:6, displayName"Farm");

    private final int code;
    private final String displayName;

    Habitat(int code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }

    public int getCode() {
        return code;
    }

    public String getDisplayName() {
        return displayName;
    }

    public static Habitat fromCode(int code) {
        for (Habitat h: value ()) {
            if ( h.code == code)
                return h;
        }
        throw new IllegalArgumentException("Habitat invalido:" + code);
    }
}
