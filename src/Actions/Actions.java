package Actions;

public enum Actions {
    FISHING("fishing"),
    BOWED(" bowing to each other"),
    EXPECTED("expected"),
    CREATED(" created"),
    ADDED(" added to ");

    private final String actionDescribe;
    Actions(String actionDescribe) {
        this.actionDescribe = actionDescribe;
    }

    public String getActionDescribe() {
        return actionDescribe;
    }
}
