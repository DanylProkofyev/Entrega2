public class Coche {

    private String matricula;
    private String modelo;
    private String slogan;
    private int precio;

    public Coche(String matricula, String modelo, String slogan, int precio) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.slogan = slogan;
        this.precio = precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSlogan() {

        return slogan;
    }

    public void setSlogan(String slogan) {
        //sayasdhdgdja
        this.slogan = slogan;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", slogan='" + slogan + '\'' +
                ", precio=" + precio +
                '}';
    }

}
