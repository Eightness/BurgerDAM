import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BurgerDAM extends JFrame {

    private MenuBurger miMenu = new MenuBurger();
    private JPanel mainPanel;
    private JLabel cabecera;
    private JPanel panelCabecera;
    private JPanel panelCompra;
    private JPanel panelPrecio;
    private JPanel panelPagar;
    private JPanel panelCentral;
    private JButton btnPrecio;
    private JLabel lblPrecioSinIVA;
    private JButton btnPagar;
    private JLabel lblGracias;
    private JCheckBox checkExtraBurger;
    private JComboBox comboBurger;
    private JSpinner spnKetchup;
    private JLabel lblBurger;
    private JComboBox comboPan;
    private JComboBox comboPatatas;
    private JComboBox comboBebida;
    private JRadioButton radiusDomicilio;
    private JRadioButton radiusLocal;
    private JSpinner spnThai;
    private JSpinner spnMostaza;
    private JSpinner spnBbq;
    private JCheckBox checkExtraPatatas;
    private JCheckBox checkExtraQueso;
    private JLabel lblIVA;
    private JLabel lblPrecioConIVA;
    private Dimension dimension = new Dimension(405, 750);

    public BurgerDAM() {
        setContentPane(mainPanel);
        setSize(dimension);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("Images/iconBurgerDAM.png");
        setIconImage(icon.getImage());
        setVisible(true);
        cabecera.setIcon(icon);
        setTitle("Burger DAM by Albert");
        btnPrecio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateMenu();
                updatePrice();
            }
        });
        btnPagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblGracias.setText("Pago realizado con éxito, ¡Muchas gracias por la compra!");
            }
        });
        radiusDomicilio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                radiusLocal.setSelected(false);
            }
        });
        radiusLocal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                radiusDomicilio.setSelected(false);
            }
        });
    }

    private void updatePrice() {
        lblPrecioSinIVA.setText("Precio sin IVA: " + miMenu.calcularPrecioSinIVA() + "€");
        lblIVA.setText("IVA: " + miMenu.calcularIVA() + "€");
        lblPrecioConIVA.setText("Precio con IVA: " + miMenu.calcularPrecioConIVA() + "€");
    }

    private void updateMenu() {
        miMenu.setTipoHamburguesa(comboBurger.getSelectedIndex());
        miMenu.setTipoPan(comboPan.getSelectedIndex());
        miMenu.setTipoPatatas(comboPatatas.getSelectedIndex());
        miMenu.setTipoBebida(comboBebida.getSelectedIndex());
        miMenu.setExtraBurger(checkExtraBurger.isSelected());
        miMenu.setExtraQueso(checkExtraQueso.isSelected());
        miMenu.setExtraPatatas(checkExtraPatatas.isSelected());
        miMenu.setSalsas((Integer)spnKetchup.getValue() + (Integer)spnBbq.getValue() + (Integer)spnMostaza.getValue() + (Integer)spnThai.getValue());
        miMenu.setRepartoDomicilio(radiusDomicilio.isSelected());
        miMenu.setRecogidaLocal(radiusLocal.isSelected());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BurgerDAM appAlbert = new BurgerDAM();
        });
    }
}
