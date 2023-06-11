import java.util.ArrayList;
import java.util.List;

public class MenuBurger {

    //Atributos de la clase
    private int tipoHamburguesa;
    private int tipoPan;
    private int tipoPatatas;
    private int tipoBebida;
    private boolean extraBurger;
    private boolean extraQueso;
    private boolean extraPatatas;
    private int salsas;
    private boolean repartoDomicilio;
    private boolean recogidaLocal;

    //Constructor
    public MenuBurger() {
        this.tipoHamburguesa = 0;
        this.tipoPan = 0;
        this.tipoPatatas = 0;
        this.tipoBebida = 0;
        this.extraBurger = false;
        this.extraQueso = false;
        this.extraPatatas = false;
        this.salsas = 0;
        this.repartoDomicilio = false;
        this.recogidaLocal = false;
    }

    //Setters y Getters
    public void setRecogidaLocal(boolean recogidaLocal) {
        this.recogidaLocal = recogidaLocal;
    }

    public int getTipoHamburguesa() {
        return tipoHamburguesa;
    }

    public void setTipoHamburguesa(int tipoHamburguesa) {
        this.tipoHamburguesa = tipoHamburguesa;
    }

    public int getTipoPan() {
        return tipoPan;
    }

    public void setTipoPan(int tipoPan) {
        this.tipoPan = tipoPan;
    }

    public void setTipoPatatas(int tipoPatatas) {
        this.tipoPatatas = tipoPatatas;
    }

    public int getTipoPatatas() {
        return tipoPatatas;
    }

    public void setTipoBebida(int tipoBebida) {
        this.tipoBebida = tipoBebida;
    }

    public int getTipoBebida() {
        return tipoBebida;
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
        if (tipoHamburguesa == 3 || tipoHamburguesa == 4) {
            precioBase += 1.0;
        }

        //Coste adicional tipo de patatas
        if (tipoPatatas == 3) {
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
        if (recogidaLocal) {
            precioBase *= 0.8;
        }

        return precioBase;
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