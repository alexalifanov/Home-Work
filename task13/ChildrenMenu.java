package task13;

public enum ChildrenMenu {
    PORRIDGE("Каша"),
    CHEESE("Сыр"),
    BANAN("Банан"),
    APPLE("Яблоко");
    public String name;
    ChildrenMenu(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static boolean Name (String name){
        for (ChildrenMenu childrenMenu : ChildrenMenu.values()){
            if (childrenMenu.getName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
}
