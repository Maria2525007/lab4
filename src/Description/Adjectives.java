package Description;

public enum Adjectives {
    GOLDEN ("golden"),
    GREEN("green"),
    BLOOMING("blooming"),
    HIGH("high"),
    BLUE("blue"),
    BIG("big"),
    LOW("low");
    private final String adjDescribe;
    Adjectives (String actionDescribe) {
        this.adjDescribe = actionDescribe;
    }

    public String getActionDescribe() {
        return adjDescribe;
    }
}


