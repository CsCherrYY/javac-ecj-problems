public enum IllegalModifierForEnumConstructor {
    A("a"),
    B("b");
    private String str;
    public IllegalModifierForEnumConstructor(String str) {
        this.str = str;
    }
}