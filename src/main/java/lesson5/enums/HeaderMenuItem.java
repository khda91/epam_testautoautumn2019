package lesson5.enums;

public enum HeaderMenuItem {

    CONTACT_FORM("Contact form");

    private String linkName;

    HeaderMenuItem(String linkName) {
        this.linkName = linkName;
    }

    public String getLinkName() {
        return linkName;
    }
}
