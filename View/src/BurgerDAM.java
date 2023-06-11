import javax.swing.*;
import java.awt.*;

public class BurgerDAM extends JFrame {

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
    private Dimension dimension = new Dimension(405, 720);

    public BurgerDAM() {
        setContentPane(mainPanel);
        setSize(dimension);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("Images/iconBurgerDAM.png");
        setIconImage(icon.getImage());
        setVisible(true);
        cabecera.setIcon(icon);
        setTitle("Burger DAM by Albert");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BurgerDAM();
        });
    }
}
