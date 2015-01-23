
public enum Setting {
    OFF("---"),LOW("--+"),MEDIUM("-++"),HIGH("+++");
    private String aTemp;
    
    Setting (String temp) {aTemp = temp;}
    
    public String toSting() {return aTemp;}
}
