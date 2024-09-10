
package model;

public class InfoContact {
    private String name;
    private String surName;
    private String telephone;

    public InfoContact(String name, String subName, String telephone) {
        this.name = name;
        this.surName = subName;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    @Override
    public String toString() {
        return "Contact: { " + "name : " + name + " Surname : " + surName + " Telephone : "+telephone+"}";
    }
    
}
