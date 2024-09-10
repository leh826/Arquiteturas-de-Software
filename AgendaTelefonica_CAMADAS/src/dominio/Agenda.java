
package dominio;

public class Agenda {
    private String name;
    private String surName;
    private String telephone;

    public Agenda(String name, String surName, String telephone) {
        this.name = name;
        this.surName = surName;
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
        return "Contact: { " + "name = " +name+ " "+surName +", Telephone = "+telephone+"}";
    }
}
