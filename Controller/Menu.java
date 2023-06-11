import java.util.ArrayList;
import java.util.List;

public class Menu {

    //Atributos de la clase
    private String tipoHamburguesa;
    private String tipoPan;
    private String tipoPatatas;
    private String tipoBebida;
    private boolean extraBurger;
    private boolean extraQueso;
    private boolean extraPatatas;
    private int salsas;
    private boolean repartoDomicilio;

    //Constructor
    public Menu() {
        this.tipoHamburguesa = "";
        this.tipoPan = "";
        this.tipoPatatas = "";
        this.tipoBebida = "";
        this.extraBurger = false;
        this.extraQueso = false;
        this.extraPatatas = false;
        this.salsas = 0;
        this.repartoDomicilio = false;
        this.recogidaLocal = false;
    }

    //Setters y Getters
    public String getTipoHamburguesa() {
        return tipoHamburguesa;
    }

    public void setTipoHamburguesa(String tipoHamburguesa) {
        this.tipoHamburguesa = tipoHamburguesa;
    }

    public String getTipoPan() {
        return tipoPan;
    }

    public void setTipoPan(String tipoPan) {
        this.tipoPan = tipoPan;
    }

    public String getTipoPatatas() {
        return tipoPatatas;
    }

    public void setTipoPatatas(String tipoPatatas) {
        this.tipoPatatas = tipoPatatas;
    }

    public String getTipoBebida() {
        return tipoBebida;
    }

    public void setTipoBebida(String tipoBebida) {
        this.tipoBebida = tipoBebida;
    }

    public void setExtraBurger(boolean extraBurger) {
        this.extraBurger = extraBurger;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public void setExtraPatatas(boolean extraPatatas) {
        this.extraPatatas = extraPatatas;
    }

    public void setRepartoDomicilio(boolean repartoDomicilio) {
        this.repartoDomicilio = repartoDomicilio;
    }

    public void setSalsas(int salsas) {
        this.salsas = salsas;
    }

    public int getSalsas() {
        return salsas;
    }

    //Método para calcular Precio Total sin IVA
    public double calcularPrecioSinIVA() {
        double precioBase = 8.0;

        //Coste adicional tipo de hamburguesa
        if (tipoHamburguesa.toLowerCase().contains("ternera") || tipoHamburguesa.toLowerCase().contains("vegana")) {
            precioBase += 1.0;
        }

        //Coste adicional tipo de patatas
        if (tipoPatatas.toLowerCase().contains("caseras")) {
            precioBase += 1.0;
        }

        //Coste adicional opciones extra
        if (extraBurger) {
            precioBase += 2.0;
        }
        if (extraQueso) {
            precioBase += 0.5;
        }
        if (extraPatatas) {
            precioBase += 1.0;
        }

        //Coste adicional salsas
        double costeSalsas = (double)this.salsas * 0.5;
        precioBase += costeSalsas;

        //Aplica el descuento si es recogida en el local
        if (!repartoDomicilio) {
            precioBase *= 0.8;
        }

        return precioTotalSinIVA;
    }

    //Método para calcular IVA
    public double calcularIVA () {
        return calcularPrecioSinIVA() * 0.21;
    }

    //Método para calcular Precio Total con IVA
    public double calcularPrecioConIVA() {
        return calcularPrecioSinIVA() + calcularIVA();
    }
}
