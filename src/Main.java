/*
1.  Textfield validations method   X
2.  clear textfields method     X
3.  implement isIdExist() method on operations.     X
3.  buttons hover on focus gain/lost    X
4.  Search data by name     X
 */
import com.k33ptoo.components.KButton;
import com.k33ptoo.components.KGradientPanel;
import combo_suggestion.ComboBoxSuggestion;
import connection.dbconnection;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import textfield.PasswordField;
import textfield.TextField;

public class Main extends javax.swing.JFrame
{

    int total = 0;
    Connection con;
    Statement st;
    PreparedStatement pst;
    ResultSet result;
    DefaultTableModel tableModel;
    String query;

    public Main()
    {
        initComponents();

        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        Insets scnmax = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
        int taskbar = scnmax.bottom;

        int width = (int) size.getWidth();
        int height = (int) size.getHeight() - taskbar;

        this.setSize(width, height);
        panel_bg.setSize(width, height);

        System.out.println("Frame Size = " + this.getSize());
        System.out.println("Panel BG = " + panel_bg.getSize());

        cmbbox_login_usrnm.grabFocus();

        panel_dashboard.setVisible(false);

        con = dbconnection.getdbConnection();

        fillCombobox("employee", "usrnm", cmbbox_login_usrnm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        panel_bg = new com.k33ptoo.components.KGradientPanel()
        {
            public void paintComponent(Graphics g)
            {
                ImageIcon image = new ImageIcon("src\\resources\\bg2.jpg");
                Image i = image.getImage();
                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        panel_header = new javax.swing.JPanel();
        pnl_close = new javax.swing.JPanel();
        lbl_close = new javax.swing.JLabel();
        pnl_minimize = new javax.swing.JPanel();
        lbl_minimize = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_login = new javax.swing.JPanel()
        {
            public void paintComponent(Graphics g)
            {
                ImageIcon image = new ImageIcon("src\\resources\\bg2.jpg");
                Image i = image.getImage();
                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        panel_login_main = new com.k33ptoo.components.KGradientPanel();
        cmbbox_login_usrnm = new combo_suggestion.ComboBoxSuggestion();
        lbl_role = new javax.swing.JLabel();
        lbl_usr_icon = new javax.swing.JLabel();
        lbl_pswd_icon = new javax.swing.JLabel();
        txt_login_pswd = new textfield.PasswordField();
        lbl_forgot_pswd = new javax.swing.JLabel();
        btn_login = new com.k33ptoo.components.KButton();
        panel_login_img = new com.k33ptoo.components.KGradientPanel();
        lbl_login_img = new javax.swing.JLabel();
        panel_dashboard = new javax.swing.JPanel()
        {
            public void paintComponent(Graphics g)
            {
                ImageIcon image = new ImageIcon("src\\resources\\bg2.jpg");
                Image i = image.getImage();
                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height, this);
            }
        };
        panel_dash_menu = new com.k33ptoo.components.KGradientPanel();
        btnCustomer = new com.k33ptoo.components.KButton();
        btnEmployee = new com.k33ptoo.components.KButton();
        btnProduct = new com.k33ptoo.components.KButton();
        btnBill = new com.k33ptoo.components.KButton();
        btnaccount = new com.k33ptoo.components.KButton();
        pnl_menu_head = new com.k33ptoo.components.KGradientPanel();
        lbl_dash_welcome = new javax.swing.JLabel();
        lbl_dash_usr = new javax.swing.JLabel();
        panel_dash_main = new com.k33ptoo.components.KGradientPanel();
        panel_home = new com.k33ptoo.components.KGradientPanel();
        panel_customer = new com.k33ptoo.components.KGradientPanel();
        pnl_cust_menubar = new com.k33ptoo.components.KGradientPanel();
        pnl_addcust_menu = new com.k33ptoo.components.KGradientPanel();
        btn_addcust_menu = new com.k33ptoo.components.KButton();
        lid_add_cust = new com.k33ptoo.components.KGradientPanel();
        pnl_edit_cust_menu = new com.k33ptoo.components.KGradientPanel();
        btn_editcust_menu = new com.k33ptoo.components.KButton();
        lid_edit_cust = new com.k33ptoo.components.KGradientPanel();
        pnl_cust_det_menu = new com.k33ptoo.components.KGradientPanel();
        btn_custdet_menu = new com.k33ptoo.components.KButton();
        lid_cust_det = new com.k33ptoo.components.KGradientPanel();
        pnl_customer_main = new com.k33ptoo.components.KGradientPanel();
        pnl_add_cust = new com.k33ptoo.components.KGradientPanel();
        txt_addcust_id = new textfield.TextField();
        txt_addcust_nm = new textfield.TextField();
        txt_addcust_contact = new textfield.TextField();
        txt_addcust_email = new textfield.TextField();
        txt_addcust_shopaddr = new textfield.TextField();
        txt_addcust_shopnm = new textfield.TextField();
        btn_addcust_add = new com.k33ptoo.components.KButton();
        pnl_edit_cust = new com.k33ptoo.components.KGradientPanel();
        scrolltbl_editcust = new javax.swing.JScrollPane();
        table_editcust = new javax.swing.JTable();
        btn_editcust_edit = new com.k33ptoo.components.KButton();
        btn_editcust_rmv = new com.k33ptoo.components.KButton();
        txt_editcust_contact = new textfield.TextField();
        txt_editcust_nm = new textfield.TextField();
        txt_editcust_email = new textfield.TextField();
        txt_editcust_shopnm = new textfield.TextField();
        txt_editcust_shopaddr = new textfield.TextField();
        txt_editcust_id = new textfield.TextField();
        pnl_cust_det = new com.k33ptoo.components.KGradientPanel();
        txt_custdet_custnm = new textfield.TextField();
        scrolltbl_custdet = new javax.swing.JScrollPane();
        table_custdet = new javax.swing.JTable();
        btn_custdet = new com.k33ptoo.components.KButton();
        panel_employee = new com.k33ptoo.components.KGradientPanel();
        pnl_emp_menubar = new com.k33ptoo.components.KGradientPanel();
        pnl_addemp_menu = new com.k33ptoo.components.KGradientPanel();
        btn_addemp_menu = new com.k33ptoo.components.KButton();
        lid_add_emp = new com.k33ptoo.components.KGradientPanel();
        pnl_editemp_menu = new com.k33ptoo.components.KGradientPanel();
        btn_editemp_menu = new com.k33ptoo.components.KButton();
        lid_edit_emp = new com.k33ptoo.components.KGradientPanel();
        pnl_empdet_menu = new com.k33ptoo.components.KGradientPanel();
        btn_empdet_menu = new com.k33ptoo.components.KButton();
        lid_emp_det = new com.k33ptoo.components.KGradientPanel();
        pnl_employee_main = new com.k33ptoo.components.KGradientPanel();
        pnl_add_emp = new com.k33ptoo.components.KGradientPanel();
        txt_addemp_id = new textfield.TextField();
        txt_addemp_nm = new textfield.TextField();
        txt_addemp_contact = new textfield.TextField();
        txt_addemp_email = new textfield.TextField();
        txt_addemp_salary = new textfield.TextField();
        txt_addemp_addr = new textfield.TextField();
        btn_addemp_add = new com.k33ptoo.components.KButton();
        txt_addemp_pswd = new textfield.PasswordField();
        txt_addemp_usrnm = new textfield.TextField();
        pnl_edit_emp = new com.k33ptoo.components.KGradientPanel();
        scrolltbl_editemp = new javax.swing.JScrollPane();
        table_editemp = new javax.swing.JTable();
        txt_editemp_nm = new textfield.TextField();
        txt_editemp_contact = new textfield.TextField();
        txt_editemp_email = new textfield.TextField();
        txt_editemp_salary = new textfield.TextField();
        txt_editemp_addr = new textfield.TextField();
        btn_editemp_edit = new com.k33ptoo.components.KButton();
        btn_editemp_rmv = new com.k33ptoo.components.KButton();
        txt_editemp_pswd = new textfield.PasswordField();
        txt_editemp_usrnm = new textfield.TextField();
        pnl_emp_det = new com.k33ptoo.components.KGradientPanel();
        txt_empdet_nm = new textfield.TextField();
        scrolltbl_empdet = new javax.swing.JScrollPane();
        table_empdet = new javax.swing.JTable();
        btn_empdet = new com.k33ptoo.components.KButton();
        panel_product = new com.k33ptoo.components.KGradientPanel();
        pnl_prod_menubar = new com.k33ptoo.components.KGradientPanel();
        pnl_addprod_menu = new com.k33ptoo.components.KGradientPanel();
        btn_addprod_menu = new com.k33ptoo.components.KButton();
        lid_addprod = new com.k33ptoo.components.KGradientPanel();
        pnl_editprod_menu = new com.k33ptoo.components.KGradientPanel();
        btn_editprod_menu = new com.k33ptoo.components.KButton();
        lid_editprod = new com.k33ptoo.components.KGradientPanel();
        pnl_proddet_menu = new com.k33ptoo.components.KGradientPanel();
        btn_proddet_menu = new com.k33ptoo.components.KButton();
        lid_proddet = new com.k33ptoo.components.KGradientPanel();
        pnl_prod_main = new com.k33ptoo.components.KGradientPanel();
        pnl_add_prod = new com.k33ptoo.components.KGradientPanel();
        txt_addprod_id = new textfield.TextField();
        txt_addprod_costprice = new textfield.TextField();
        txt_addprod_sellingprice = new textfield.TextField();
        cmbbox_addprod_brand = new combo_suggestion.ComboBoxSuggestion();
        txt_addprod_nm = new textfield.TextField();
        btn_addprod = new com.k33ptoo.components.KButton();
        txt_addprod_quantity = new textfield.TextField();
        pnl_edit_prod = new com.k33ptoo.components.KGradientPanel();
        scrolltbl_editprod = new javax.swing.JScrollPane();
        table_editprod = new javax.swing.JTable();
        txt_editprod_id = new textfield.TextField();
        txt_editprod_nm = new textfield.TextField();
        txt_editprod_costprice = new textfield.TextField();
        txt_editprod_quantity = new textfield.TextField();
        txt_editprod_sellingprice = new textfield.TextField();
        cmbbox_editprod_brand = new combo_suggestion.ComboBoxSuggestion();
        btn_editprod_edit = new com.k33ptoo.components.KButton();
        btn_editprod_rmv = new com.k33ptoo.components.KButton();
        pnl_prod_det = new com.k33ptoo.components.KGradientPanel();
        txt_proddet_nm = new textfield.TextField();
        scrolltbl_proddet = new javax.swing.JScrollPane();
        table_proddet = new javax.swing.JTable();
        btn_proddet = new com.k33ptoo.components.KButton();
        panel_bill = new com.k33ptoo.components.KGradientPanel();
        pnl_bill_menubar = new com.k33ptoo.components.KGradientPanel();
        pnl_createbill_menu = new com.k33ptoo.components.KGradientPanel();
        btn_createbill_menu = new com.k33ptoo.components.KButton();
        lid_createbill = new com.k33ptoo.components.KGradientPanel();
        pnl_modifybill_menu = new com.k33ptoo.components.KGradientPanel();
        btn_modifybill_menu = new com.k33ptoo.components.KButton();
        lid_modifybill = new com.k33ptoo.components.KGradientPanel();
        pnl_bill_main = new com.k33ptoo.components.KGradientPanel();
        pnl_createbill = new com.k33ptoo.components.KGradientPanel();
        lbl_createbill_custdet = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_billno = new javax.swing.JLabel();
        lbl_billno_no = new javax.swing.JLabel();
        cmbbox_createbill_custnm = new combo_suggestion.ComboBoxSuggestion();
        txt_createbill_custid = new textfield.TextField();
        txt_createbill_addr = new textfield.TextField();
        txt_createbill_contact = new textfield.TextField();
        lbl_createbill_proddet = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        cmbbox_createbill_prodnm = new combo_suggestion.ComboBoxSuggestion();
        txt_createbill_prodid = new textfield.TextField();
        pnl_calc = new javax.swing.JPanel();
        lbl_createbill_grosstotal = new javax.swing.JLabel();
        lbl_createbill_unpaid = new javax.swing.JLabel();
        lbl_createbill_nettotal = new javax.swing.JLabel();
        lbl_grosstotal = new javax.swing.JLabel();
        lbl_unpaid = new javax.swing.JLabel();
        lbl_nettotal = new javax.swing.JLabel();
        lbl_tax = new javax.swing.JLabel();
        lbl_createbill_tax = new javax.swing.JLabel();
        lbl_createbill_discount = new javax.swing.JLabel();
        lbl_discount = new javax.swing.JLabel();
        scroll_createbill = new javax.swing.JScrollPane();
        table_createbill = new javax.swing.JTable();
        btn_createbill_add = new com.k33ptoo.components.KButton();
        txt_createbill_prodprice = new textfield.TextField();
        btn_createbill_save = new com.k33ptoo.components.KButton();
        txt_createbill_discount = new textfield.TextField();
        spin_createbill_quantity = new spinner.Spinner();
        txt_createbill_tax = new textfield.TextField();
        txt_createbill_unpaid = new textfield.TextField();
        pnl_modifybill = new com.k33ptoo.components.KGradientPanel();
        lbl_modifybill_prodlisting = new javax.swing.JLabel();
        cmbbox_modifybill_prodid = new combo_suggestion.ComboBoxSuggestion();
        txt_modifybill_prodnm = new textfield.TextField();
        txt_modifybill_prodprice = new textfield.TextField();
        spin_modifybill_quantity = new spinner.Spinner();
        txt_modifybill_discount = new textfield.TextField();
        txt_modifybill_tax = new textfield.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnl_bill_tab3 = new com.k33ptoo.components.KGradientPanel();
        panel_account = new com.k33ptoo.components.KGradientPanel();
        pnl_account_menubar = new com.k33ptoo.components.KGradientPanel();
        pnl_accsetting_menu = new com.k33ptoo.components.KGradientPanel();
        btn_accsetting_menu = new com.k33ptoo.components.KButton();
        lid_accsetting = new com.k33ptoo.components.KGradientPanel();
        pnl_acc_menu2 = new com.k33ptoo.components.KGradientPanel();
        btn_acc_menu2 = new com.k33ptoo.components.KButton();
        lid_acc_menu2 = new com.k33ptoo.components.KGradientPanel();
        pnl_acc_menu3 = new com.k33ptoo.components.KGradientPanel();
        btn_acc_menu3 = new com.k33ptoo.components.KButton();
        lid_acc_menu3 = new com.k33ptoo.components.KGradientPanel();
        pnl_account_main = new com.k33ptoo.components.KGradientPanel();
        pnl_accsetting = new com.k33ptoo.components.KGradientPanel();
        jLabel18 = new javax.swing.JLabel();
        pnl_acc_tab2 = new com.k33ptoo.components.KGradientPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtarea_format = new javax.swing.JTextArea();
        pnl_acc_tab3 = new com.k33ptoo.components.KGradientPanel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(1920, 1020));
        setUndecorated(true);

        panel_bg.setkBorderRadius(0);
        panel_bg.setkEndColor(new java.awt.Color(204, 255, 255));
        panel_bg.setkStartColor(new java.awt.Color(204, 255, 255));
        panel_bg.setMaximumSize(new java.awt.Dimension(1920, 1020));
        panel_bg.setMinimumSize(new java.awt.Dimension(1920, 1020));
        panel_bg.setPreferredSize(new java.awt.Dimension(1920, 1020));

        panel_header.setBackground(new java.awt.Color(150, 195, 248));

        pnl_close.setBackground(new java.awt.Color(150, 195, 248));

        lbl_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon_close.png"))); // NOI18N
        lbl_close.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbl_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_closeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_closeLayout = new javax.swing.GroupLayout(pnl_close);
        pnl_close.setLayout(pnl_closeLayout);
        pnl_closeLayout.setHorizontalGroup(
            pnl_closeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_closeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_closeLayout.setVerticalGroup(
            pnl_closeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_closeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_minimize.setBackground(new java.awt.Color(150, 195, 248));

        lbl_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon_minimize.png"))); // NOI18N
        lbl_minimize.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbl_minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lbl_minimizeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_minimizeLayout = new javax.swing.GroupLayout(pnl_minimize);
        pnl_minimize.setLayout(pnl_minimizeLayout);
        pnl_minimizeLayout.setHorizontalGroup(
            pnl_minimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_minimizeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_minimizeLayout.setVerticalGroup(
            pnl_minimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_minimizeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setText("LOGO");

        javax.swing.GroupLayout panel_headerLayout = new javax.swing.GroupLayout(panel_header);
        panel_header.setLayout(panel_headerLayout);
        panel_headerLayout.setHorizontalGroup(
            panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_headerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1783, Short.MAX_VALUE)
                .addComponent(pnl_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnl_close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_headerLayout.setVerticalGroup(
            panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(pnl_close, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnl_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap())
        );

        panel_login.setBackground(new java.awt.Color(204, 255, 255));
        panel_login.setMaximumSize(new java.awt.Dimension(1920, 980));
        panel_login.setMinimumSize(new java.awt.Dimension(1920, 980));
        panel_login.setPreferredSize(new java.awt.Dimension(1920, 980));

        panel_login_main.setBackground(new java.awt.Color(150, 195, 248));
        panel_login_main.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        panel_login_main.setkBorderRadius(40);
        panel_login_main.setkEndColor(new java.awt.Color(150, 195, 248));
        panel_login_main.setkStartColor(new java.awt.Color(150, 195, 248));
        panel_login_main.setMaximumSize(new java.awt.Dimension(700, 780));
        panel_login_main.setMinimumSize(new java.awt.Dimension(700, 780));
        panel_login_main.setOpaque(false);
        panel_login_main.setPreferredSize(new java.awt.Dimension(700, 780));

        cmbbox_login_usrnm.setBackground(new java.awt.Color(255, 167, 6));
        cmbbox_login_usrnm.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbbox_login_usrnm.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        cmbbox_login_usrnm.setMaximumSize(new java.awt.Dimension(415, 64));
        cmbbox_login_usrnm.setMinimumSize(new java.awt.Dimension(415, 64));
        cmbbox_login_usrnm.setNextFocusableComponent(txt_login_pswd);
        cmbbox_login_usrnm.setPreferredSize(new java.awt.Dimension(415, 64));
        cmbbox_login_usrnm.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmbbox_login_usrnmActionPerformed(evt);
            }
        });

        lbl_role.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        lbl_role.setText("Select Role :");
        lbl_role.setMaximumSize(new java.awt.Dimension(500, 64));
        lbl_role.setMinimumSize(new java.awt.Dimension(500, 64));
        lbl_role.setNextFocusableComponent(cmbbox_login_usrnm);
        lbl_role.setPreferredSize(new java.awt.Dimension(500, 64));

        lbl_usr_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/user.png"))); // NOI18N

        lbl_pswd_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/padlock.png"))); // NOI18N

        txt_login_pswd.setBackground(new java.awt.Color(150, 195, 248));
        txt_login_pswd.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_login_pswd.setLabelText("Password");
        txt_login_pswd.setMaximumSize(new java.awt.Dimension(415, 64));
        txt_login_pswd.setMinimumSize(new java.awt.Dimension(415, 64));
        txt_login_pswd.setNextFocusableComponent(btn_login);
        txt_login_pswd.setPreferredSize(new java.awt.Dimension(415, 64));
        txt_login_pswd.setShowAndHide(true);

        lbl_forgot_pswd.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 18)); // NOI18N
        lbl_forgot_pswd.setText("Forgot Password ?");
        lbl_forgot_pswd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_forgot_pswd.setMaximumSize(new java.awt.Dimension(500, 40));
        lbl_forgot_pswd.setMinimumSize(new java.awt.Dimension(500, 40));
        lbl_forgot_pswd.setPreferredSize(new java.awt.Dimension(500, 40));
        lbl_forgot_pswd.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lbl_forgot_pswdMouseEntered(evt);
            }
        });

        btn_login.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_login.setText("LOGIN");
        btn_login.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btn_login.setkBorderRadius(30);
        btn_login.setkEndColor(new java.awt.Color(255, 167, 6));
        btn_login.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_login.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_login.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_login.setkPressedColor(new java.awt.Color(255, 167, 6));
        btn_login.setkStartColor(new java.awt.Color(255, 167, 6));
        btn_login.setNextFocusableComponent(cmbbox_login_usrnm);
        btn_login.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_loginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_loginFocusLost(evt);
            }
        });
        btn_login.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_loginMouseEntered(evt);
            }
        });
        btn_login.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_loginActionPerformed(evt);
            }
        });
        btn_login.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_loginKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel_login_mainLayout = new javax.swing.GroupLayout(panel_login_main);
        panel_login_main.setLayout(panel_login_mainLayout);
        panel_login_mainLayout.setHorizontalGroup(
            panel_login_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_login_mainLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(panel_login_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_forgot_pswd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_login_mainLayout.createSequentialGroup()
                        .addGroup(panel_login_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_usr_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_pswd_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_login_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_login_pswd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbbox_login_usrnm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lbl_role, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );
        panel_login_mainLayout.setVerticalGroup(
            panel_login_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_login_mainLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(lbl_role, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addGroup(panel_login_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbbox_login_usrnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_usr_icon))
                .addGap(50, 50, 50)
                .addGroup(panel_login_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_pswd_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_login_pswd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lbl_forgot_pswd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );

        panel_login_img.setBackground(new Color(255, 255, 255, 150));
        panel_login_img.setkEndColor(new Color(255, 255, 255, 0));
        panel_login_img.setkStartColor(new Color(255, 255, 255, 0));
        panel_login_img.setMaximumSize(new java.awt.Dimension(1005, 780));
        panel_login_img.setMinimumSize(new java.awt.Dimension(1005, 780));
        panel_login_img.setOpaque(false);
        panel_login_img.setPreferredSize(new java.awt.Dimension(1005, 780));
        panel_login_img.setLayout(new java.awt.BorderLayout());

        lbl_login_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/login.png"))); // NOI18N
        panel_login_img.add(lbl_login_img, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout panel_loginLayout = new javax.swing.GroupLayout(panel_login);
        panel_login.setLayout(panel_loginLayout);
        panel_loginLayout.setHorizontalGroup(
            panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_loginLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(panel_login_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(panel_login_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(100, 100, 100))
        );
        panel_loginLayout.setVerticalGroup(
            panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_loginLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(panel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_login_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_login_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );

        panel_dashboard.setBackground(new java.awt.Color(204, 255, 255));
        panel_dashboard.setMaximumSize(new java.awt.Dimension(1920, 980));
        panel_dashboard.setMinimumSize(new java.awt.Dimension(1920, 980));

        panel_dash_menu.setkBorderRadius(40);
        panel_dash_menu.setkEndColor(new java.awt.Color(150, 195, 248));
        panel_dash_menu.setkStartColor(new java.awt.Color(150, 195, 248));
        panel_dash_menu.setOpaque(false);

        btnCustomer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCustomer.setText("CUSTOMER AREA");
        btnCustomer.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btnCustomer.setkBorderRadius(30);
        btnCustomer.setkEndColor(new java.awt.Color(255, 167, 6));
        btnCustomer.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btnCustomer.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnCustomer.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btnCustomer.setkPressedColor(new java.awt.Color(255, 167, 6));
        btnCustomer.setkStartColor(new java.awt.Color(255, 167, 6));
        btnCustomer.setNextFocusableComponent(btnEmployee);
        btnCustomer.setOpaque(true);
        btnCustomer.setPreferredSize(new java.awt.Dimension(450, 60));
        btnCustomer.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btnCustomerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btnCustomerFocusLost(evt);
            }
        });
        btnCustomer.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btnCustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btnCustomerMouseExited(evt);
            }
        });
        btnCustomer.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCustomerActionPerformed(evt);
            }
        });
        btnCustomer.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btnCustomerKeyPressed(evt);
            }
        });

        btnEmployee.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEmployee.setText("EMPLOYEE AREA");
        btnEmployee.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btnEmployee.setkBorderRadius(30);
        btnEmployee.setkEndColor(new java.awt.Color(255, 167, 6));
        btnEmployee.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btnEmployee.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnEmployee.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btnEmployee.setkPressedColor(new java.awt.Color(255, 167, 6));
        btnEmployee.setkStartColor(new java.awt.Color(255, 167, 6));
        btnEmployee.setNextFocusableComponent(btnProduct);
        btnEmployee.setPreferredSize(new java.awt.Dimension(450, 60));
        btnEmployee.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btnEmployeeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btnEmployeeFocusLost(evt);
            }
        });
        btnEmployee.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btnEmployeeMouseEntered(evt);
            }
        });
        btnEmployee.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEmployeeActionPerformed(evt);
            }
        });
        btnEmployee.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btnEmployeeKeyPressed(evt);
            }
        });

        btnProduct.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnProduct.setText("PRODUCT AREA");
        btnProduct.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btnProduct.setkBorderRadius(30);
        btnProduct.setkEndColor(new java.awt.Color(255, 167, 6));
        btnProduct.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btnProduct.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnProduct.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btnProduct.setkPressedColor(new java.awt.Color(255, 167, 6));
        btnProduct.setkStartColor(new java.awt.Color(255, 167, 6));
        btnProduct.setNextFocusableComponent(btnBill);
        btnProduct.setPreferredSize(new java.awt.Dimension(450, 60));
        btnProduct.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btnProductFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btnProductFocusLost(evt);
            }
        });
        btnProduct.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btnProductMouseEntered(evt);
            }
        });
        btnProduct.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnProductActionPerformed(evt);
            }
        });
        btnProduct.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btnProductKeyPressed(evt);
            }
        });

        btnBill.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBill.setText("BILL MANAGEMENT");
        btnBill.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btnBill.setkBorderRadius(30);
        btnBill.setkEndColor(new java.awt.Color(255, 167, 6));
        btnBill.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btnBill.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnBill.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btnBill.setkPressedColor(new java.awt.Color(255, 167, 6));
        btnBill.setkStartColor(new java.awt.Color(255, 167, 6));
        btnBill.setNextFocusableComponent(btnaccount);
        btnBill.setPreferredSize(new java.awt.Dimension(450, 60));
        btnBill.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btnBillFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btnBillFocusLost(evt);
            }
        });
        btnBill.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btnBillMouseEntered(evt);
            }
        });
        btnBill.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnBillActionPerformed(evt);
            }
        });
        btnBill.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btnBillKeyPressed(evt);
            }
        });

        btnaccount.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnaccount.setText("ACCOUNT SETTING");
        btnaccount.setToolTipText("");
        btnaccount.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btnaccount.setkBorderRadius(30);
        btnaccount.setkEndColor(new java.awt.Color(255, 167, 6));
        btnaccount.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btnaccount.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnaccount.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btnaccount.setkPressedColor(new java.awt.Color(255, 167, 6));
        btnaccount.setkStartColor(new java.awt.Color(255, 167, 6));
        btnaccount.setNextFocusableComponent(btnCustomer);
        btnaccount.setPreferredSize(new java.awt.Dimension(450, 60));
        btnaccount.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btnaccountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btnaccountFocusLost(evt);
            }
        });
        btnaccount.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btnaccountMouseEntered(evt);
            }
        });
        btnaccount.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnaccountActionPerformed(evt);
            }
        });
        btnaccount.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btnaccountKeyPressed(evt);
            }
        });

        pnl_menu_head.setkBorderRadius(40);
        pnl_menu_head.setkEndColor(new java.awt.Color(0, 160, 251));
        pnl_menu_head.setkGradientFocus(40);
        pnl_menu_head.setkStartColor(new java.awt.Color(1, 109, 218));
        pnl_menu_head.setOpaque(false);
        pnl_menu_head.setPreferredSize(new java.awt.Dimension(550, 170));

        lbl_dash_welcome.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 36)); // NOI18N
        lbl_dash_welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_dash_welcome.setText("Welcome Back !");
        lbl_dash_welcome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_dash_welcome.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbl_dash_welcomeMouseClicked(evt);
            }
        });

        lbl_dash_usr.setFont(new java.awt.Font("Nirmala UI", 0, 48)); // NOI18N
        lbl_dash_usr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_dash_usr.setText("USER");
        lbl_dash_usr.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 167, 6)));
        lbl_dash_usr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_dash_usr.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbl_dash_usrMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_menu_headLayout = new javax.swing.GroupLayout(pnl_menu_head);
        pnl_menu_head.setLayout(pnl_menu_headLayout);
        pnl_menu_headLayout.setHorizontalGroup(
            pnl_menu_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menu_headLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnl_menu_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_dash_usr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_dash_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        pnl_menu_headLayout.setVerticalGroup(
            pnl_menu_headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menu_headLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_dash_welcome, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_dash_usr, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_dash_menuLayout = new javax.swing.GroupLayout(panel_dash_menu);
        panel_dash_menu.setLayout(panel_dash_menuLayout);
        panel_dash_menuLayout.setHorizontalGroup(
            panel_dash_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dash_menuLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_dash_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEmployee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnaccount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dash_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_menu_head, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_dash_menuLayout.setVerticalGroup(
            panel_dash_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dash_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_menu_head, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnBill, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        panel_dash_main.setkBorderRadius(40);
        panel_dash_main.setkEndColor(new java.awt.Color(150, 195, 248));
        panel_dash_main.setkStartColor(new java.awt.Color(150, 195, 248));
        panel_dash_main.setOpaque(false);
        panel_dash_main.setPreferredSize(new java.awt.Dimension(1120, 780));

        panel_home.setkBorderRadius(40);
        panel_home.setkEndColor(new java.awt.Color(219, 219, 219));
        panel_home.setkStartColor(new java.awt.Color(219, 219, 219));
        panel_home.setOpaque(false);

        javax.swing.GroupLayout panel_homeLayout = new javax.swing.GroupLayout(panel_home);
        panel_home.setLayout(panel_homeLayout);
        panel_homeLayout.setHorizontalGroup(
            panel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        panel_homeLayout.setVerticalGroup(
            panel_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );

        panel_customer.setkBorderRadius(40);
        panel_customer.setkEndColor(new java.awt.Color(150, 195, 248));
        panel_customer.setkGradientFocus(1000);
        panel_customer.setkStartColor(new java.awt.Color(150, 195, 248));
        panel_customer.setOpaque(false);
        panel_customer.setPreferredSize(new java.awt.Dimension(1120, 780));

        pnl_cust_menubar.setkBorderRadius(20);
        pnl_cust_menubar.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl_cust_menubar.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl_cust_menubar.setOpaque(false);
        pnl_cust_menubar.setPreferredSize(new java.awt.Dimension(1108, 60));

        pnl_addcust_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl_addcust_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl_addcust_menu.setOpaque(false);
        pnl_addcust_menu.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_addcust_menu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_addcust_menu.setText("ADD CUSTOMER");
        btn_addcust_menu.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_addcust_menu.setkBorderRadius(20);
        btn_addcust_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_addcust_menu.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_addcust_menu.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_addcust_menu.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_addcust_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_addcust_menu.setNextFocusableComponent(btn_editcust_menu);
        btn_addcust_menu.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_addcust_menu.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_addcust_menuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_addcust_menuFocusLost(evt);
            }
        });
        btn_addcust_menu.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_addcust_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_addcust_menuMouseExited(evt);
            }
        });
        btn_addcust_menu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_addcust_menuActionPerformed(evt);
            }
        });
        btn_addcust_menu.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_addcust_menuKeyPressed(evt);
            }
        });

        lid_add_cust.setBackground(new java.awt.Color(225, 223, 223));
        lid_add_cust.setkBorderRadius(15);
        lid_add_cust.setkEndColor(new java.awt.Color(211, 211, 211));
        lid_add_cust.setkStartColor(new java.awt.Color(211, 211, 211));
        lid_add_cust.setOpaque(false);
        lid_add_cust.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid_add_custLayout = new javax.swing.GroupLayout(lid_add_cust);
        lid_add_cust.setLayout(lid_add_custLayout);
        lid_add_custLayout.setHorizontalGroup(
            lid_add_custLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid_add_custLayout.setVerticalGroup(
            lid_add_custLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_addcust_menuLayout = new javax.swing.GroupLayout(pnl_addcust_menu);
        pnl_addcust_menu.setLayout(pnl_addcust_menuLayout);
        pnl_addcust_menuLayout.setHorizontalGroup(
            pnl_addcust_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_addcust_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_addcust_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid_add_cust, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_addcust_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_addcust_menuLayout.setVerticalGroup(
            pnl_addcust_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_addcust_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_addcust_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid_add_cust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnl_edit_cust_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl_edit_cust_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl_edit_cust_menu.setOpaque(false);
        pnl_edit_cust_menu.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_editcust_menu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_editcust_menu.setText("EDIT CUSTOMER");
        btn_editcust_menu.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_editcust_menu.setkBorderRadius(20);
        btn_editcust_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_editcust_menu.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_editcust_menu.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_editcust_menu.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_editcust_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_editcust_menu.setNextFocusableComponent(btn_custdet_menu);
        btn_editcust_menu.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_editcust_menu.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_editcust_menuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_editcust_menuFocusLost(evt);
            }
        });
        btn_editcust_menu.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_editcust_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_editcust_menuMouseExited(evt);
            }
        });
        btn_editcust_menu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_editcust_menuActionPerformed(evt);
            }
        });
        btn_editcust_menu.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_editcust_menuKeyPressed(evt);
            }
        });

        lid_edit_cust.setBackground(new java.awt.Color(225, 223, 223));
        lid_edit_cust.setkBorderRadius(15);
        lid_edit_cust.setkEndColor(new java.awt.Color(211, 211, 211));
        lid_edit_cust.setkStartColor(new java.awt.Color(211, 211, 211));
        lid_edit_cust.setOpaque(false);
        lid_edit_cust.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid_edit_custLayout = new javax.swing.GroupLayout(lid_edit_cust);
        lid_edit_cust.setLayout(lid_edit_custLayout);
        lid_edit_custLayout.setHorizontalGroup(
            lid_edit_custLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid_edit_custLayout.setVerticalGroup(
            lid_edit_custLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_edit_cust_menuLayout = new javax.swing.GroupLayout(pnl_edit_cust_menu);
        pnl_edit_cust_menu.setLayout(pnl_edit_cust_menuLayout);
        pnl_edit_cust_menuLayout.setHorizontalGroup(
            pnl_edit_cust_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_edit_cust_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_edit_cust_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid_edit_cust, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_editcust_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_edit_cust_menuLayout.setVerticalGroup(
            pnl_edit_cust_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_edit_cust_menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_editcust_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid_edit_cust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_cust_det_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl_cust_det_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl_cust_det_menu.setOpaque(false);
        pnl_cust_det_menu.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_custdet_menu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_custdet_menu.setText("CUSTOMER DETAIL");
        btn_custdet_menu.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_custdet_menu.setkBorderRadius(20);
        btn_custdet_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_custdet_menu.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_custdet_menu.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_custdet_menu.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_custdet_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_custdet_menu.setNextFocusableComponent(btn_addcust_menu);
        btn_custdet_menu.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_custdet_menu.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_custdet_menuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_custdet_menuFocusLost(evt);
            }
        });
        btn_custdet_menu.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_custdet_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_custdet_menuMouseExited(evt);
            }
        });
        btn_custdet_menu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_custdet_menuActionPerformed(evt);
            }
        });
        btn_custdet_menu.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_custdet_menuKeyPressed(evt);
            }
        });

        lid_cust_det.setBackground(new java.awt.Color(225, 223, 223));
        lid_cust_det.setkBorderRadius(15);
        lid_cust_det.setkEndColor(new java.awt.Color(211, 211, 211));
        lid_cust_det.setkStartColor(new java.awt.Color(211, 211, 211));
        lid_cust_det.setOpaque(false);
        lid_cust_det.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid_cust_detLayout = new javax.swing.GroupLayout(lid_cust_det);
        lid_cust_det.setLayout(lid_cust_detLayout);
        lid_cust_detLayout.setHorizontalGroup(
            lid_cust_detLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid_cust_detLayout.setVerticalGroup(
            lid_cust_detLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_cust_det_menuLayout = new javax.swing.GroupLayout(pnl_cust_det_menu);
        pnl_cust_det_menu.setLayout(pnl_cust_det_menuLayout);
        pnl_cust_det_menuLayout.setHorizontalGroup(
            pnl_cust_det_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cust_det_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_cust_det_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid_cust_det, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_custdet_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_cust_det_menuLayout.setVerticalGroup(
            pnl_cust_det_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cust_det_menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_custdet_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid_cust_det, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnl_cust_menubarLayout = new javax.swing.GroupLayout(pnl_cust_menubar);
        pnl_cust_menubar.setLayout(pnl_cust_menubarLayout);
        pnl_cust_menubarLayout.setHorizontalGroup(
            pnl_cust_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cust_menubarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pnl_addcust_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_edit_cust_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(pnl_cust_det_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(418, Short.MAX_VALUE))
        );
        pnl_cust_menubarLayout.setVerticalGroup(
            pnl_cust_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_cust_menubarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_cust_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_addcust_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(pnl_cust_det_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(pnl_edit_cust_menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))
        );

        pnl_customer_main.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_customer_main.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_customer_main.setOpaque(false);
        pnl_customer_main.setPreferredSize(new java.awt.Dimension(1108, 672));

        pnl_add_cust.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_add_cust.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_add_cust.setOpaque(false);

        txt_addcust_id.setEditable(false);
        txt_addcust_id.setBackground(new java.awt.Color(150, 195, 248));
        txt_addcust_id.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addcust_id.setLabelText("CUSTOMER ID");
        txt_addcust_id.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addcust_id.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_addcust_nm.setBackground(new java.awt.Color(150, 195, 248));
        txt_addcust_nm.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addcust_nm.setLabelText("CUSTOMER NAME");
        txt_addcust_nm.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addcust_nm.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_addcust_contact.setBackground(new java.awt.Color(150, 195, 248));
        txt_addcust_contact.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addcust_contact.setLabelText("CONTACT NO");
        txt_addcust_contact.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addcust_contact.setPreferredSize(new java.awt.Dimension(404, 64));
        txt_addcust_contact.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txt_addcust_contactKeyTyped(evt);
            }
        });

        txt_addcust_email.setBackground(new java.awt.Color(150, 195, 248));
        txt_addcust_email.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addcust_email.setLabelText("EMAIL");
        txt_addcust_email.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addcust_email.setNextFocusableComponent(txt_addcust_shopnm);
        txt_addcust_email.setPreferredSize(new java.awt.Dimension(404, 64));
        txt_addcust_email.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txt_addcust_emailKeyTyped(evt);
            }
        });

        txt_addcust_shopaddr.setBackground(new java.awt.Color(150, 195, 248));
        txt_addcust_shopaddr.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addcust_shopaddr.setLabelText("SHOP ADDRESS");
        txt_addcust_shopaddr.setNextFocusableComponent(btn_addcust_add);
        txt_addcust_shopaddr.setPreferredSize(new java.awt.Dimension(404, 128));

        txt_addcust_shopnm.setBackground(new java.awt.Color(150, 195, 248));
        txt_addcust_shopnm.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addcust_shopnm.setLabelText(" SHOP NAME (optional)");
        txt_addcust_shopnm.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addcust_shopnm.setPreferredSize(new java.awt.Dimension(404, 64));

        btn_addcust_add.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_addcust_add.setText("ADD CUSTOMER");
        btn_addcust_add.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btn_addcust_add.setkBorderRadius(30);
        btn_addcust_add.setkEndColor(new java.awt.Color(255, 167, 6));
        btn_addcust_add.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_addcust_add.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_addcust_add.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_addcust_add.setkPressedColor(new java.awt.Color(255, 167, 6));
        btn_addcust_add.setkStartColor(new java.awt.Color(255, 167, 6));
        btn_addcust_add.setNextFocusableComponent(txt_addcust_id);
        btn_addcust_add.setOpaque(true);
        btn_addcust_add.setPreferredSize(new java.awt.Dimension(250, 60));
        btn_addcust_add.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_addcust_addFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_addcust_addFocusLost(evt);
            }
        });
        btn_addcust_add.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_addcust_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_addcust_addMouseExited(evt);
            }
        });
        btn_addcust_add.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_addcust_addActionPerformed(evt);
            }
        });
        btn_addcust_add.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_addcust_addKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnl_add_custLayout = new javax.swing.GroupLayout(pnl_add_cust);
        pnl_add_cust.setLayout(pnl_add_custLayout);
        pnl_add_custLayout.setHorizontalGroup(
            pnl_add_custLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_add_custLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(pnl_add_custLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_addcust_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_addcust_contact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_addcust_shopnm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(pnl_add_custLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_addcust_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_addcust_nm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_addcust_shopaddr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_add_custLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_addcust_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(429, 429, 429))
        );
        pnl_add_custLayout.setVerticalGroup(
            pnl_add_custLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_add_custLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnl_add_custLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_addcust_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_addcust_nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(pnl_add_custLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_addcust_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_addcust_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(pnl_add_custLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_addcust_shopnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_addcust_shopaddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(146, 146, 146)
                .addComponent(btn_addcust_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pnl_edit_cust.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_edit_cust.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_edit_cust.setOpaque(false);
        pnl_edit_cust.setPreferredSize(new java.awt.Dimension(1108, 672));

        scrolltbl_editcust.setPreferredSize(new java.awt.Dimension(908, 300));

        table_editcust.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String []
            {
                "ID", "NAME", "CONTACT", "EMAIL", "SHOP NAME", "ADDRESS"
            }
        ));
        table_editcust.setPreferredSize(new java.awt.Dimension(908, 300));
        table_editcust.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                table_editcustMouseClicked(evt);
            }
        });
        scrolltbl_editcust.setViewportView(table_editcust);

        btn_editcust_edit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_editcust_edit.setText("EDIT");
        btn_editcust_edit.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btn_editcust_edit.setkBorderRadius(30);
        btn_editcust_edit.setkEndColor(new java.awt.Color(255, 167, 6));
        btn_editcust_edit.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_editcust_edit.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_editcust_edit.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_editcust_edit.setkPressedColor(new java.awt.Color(255, 167, 6));
        btn_editcust_edit.setkStartColor(new java.awt.Color(255, 167, 6));
        btn_editcust_edit.setNextFocusableComponent(btn_editcust_rmv);
        btn_editcust_edit.setOpaque(true);
        btn_editcust_edit.setPreferredSize(new java.awt.Dimension(250, 60));
        btn_editcust_edit.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_editcust_editFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_editcust_editFocusLost(evt);
            }
        });
        btn_editcust_edit.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_editcust_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_editcust_editMouseExited(evt);
            }
        });
        btn_editcust_edit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_editcust_editActionPerformed(evt);
            }
        });
        btn_editcust_edit.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_editcust_editKeyPressed(evt);
            }
        });

        btn_editcust_rmv.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_editcust_rmv.setText("REMOVE");
        btn_editcust_rmv.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btn_editcust_rmv.setkBorderRadius(30);
        btn_editcust_rmv.setkEndColor(new java.awt.Color(255, 167, 6));
        btn_editcust_rmv.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_editcust_rmv.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_editcust_rmv.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_editcust_rmv.setkPressedColor(new java.awt.Color(255, 167, 6));
        btn_editcust_rmv.setkStartColor(new java.awt.Color(255, 167, 6));
        btn_editcust_rmv.setNextFocusableComponent(txt_editcust_id);
        btn_editcust_rmv.setOpaque(true);
        btn_editcust_rmv.setPreferredSize(new java.awt.Dimension(250, 60));
        btn_editcust_rmv.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_editcust_rmvFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_editcust_rmvFocusLost(evt);
            }
        });
        btn_editcust_rmv.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_editcust_rmvMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_editcust_rmvMouseExited(evt);
            }
        });
        btn_editcust_rmv.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_editcust_rmvActionPerformed(evt);
            }
        });
        btn_editcust_rmv.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_editcust_rmvKeyPressed(evt);
            }
        });

        txt_editcust_contact.setBackground(new java.awt.Color(150, 195, 248));
        txt_editcust_contact.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editcust_contact.setLabelText("CONTACT NO");
        txt_editcust_contact.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editcust_contact.setNextFocusableComponent(txt_editcust_email);
        txt_editcust_contact.setPreferredSize(new java.awt.Dimension(250, 64));
        txt_editcust_contact.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                txt_editcust_contactKeyTyped(evt);
            }
        });

        txt_editcust_nm.setBackground(new java.awt.Color(150, 195, 248));
        txt_editcust_nm.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editcust_nm.setLabelText("CUSTOMER NAME");
        txt_editcust_nm.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editcust_nm.setNextFocusableComponent(txt_editcust_contact);
        txt_editcust_nm.setPreferredSize(new java.awt.Dimension(250, 64));

        txt_editcust_email.setBackground(new java.awt.Color(150, 195, 248));
        txt_editcust_email.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editcust_email.setLabelText("EMAIL");
        txt_editcust_email.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editcust_email.setNextFocusableComponent(txt_editcust_shopnm);
        txt_editcust_email.setPreferredSize(new java.awt.Dimension(250, 64));

        txt_editcust_shopnm.setBackground(new java.awt.Color(150, 195, 248));
        txt_editcust_shopnm.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editcust_shopnm.setLabelText("SHOP NAME");
        txt_editcust_shopnm.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editcust_shopnm.setNextFocusableComponent(txt_editcust_shopaddr);
        txt_editcust_shopnm.setPreferredSize(new java.awt.Dimension(250, 64));

        txt_editcust_shopaddr.setBackground(new java.awt.Color(150, 195, 248));
        txt_editcust_shopaddr.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editcust_shopaddr.setLabelText("SHOP ADDRESS");
        txt_editcust_shopaddr.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editcust_shopaddr.setNextFocusableComponent(btn_editcust_edit);
        txt_editcust_shopaddr.setPreferredSize(new java.awt.Dimension(250, 64));
        txt_editcust_shopaddr.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txt_editcust_shopaddrActionPerformed(evt);
            }
        });

        txt_editcust_id.setBackground(new java.awt.Color(150, 195, 248));
        txt_editcust_id.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editcust_id.setLabelText("CUSTOMER ID");
        txt_editcust_id.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editcust_id.setNextFocusableComponent(txt_editcust_nm);
        txt_editcust_id.setPreferredSize(new java.awt.Dimension(404, 64));

        javax.swing.GroupLayout pnl_edit_custLayout = new javax.swing.GroupLayout(pnl_edit_cust);
        pnl_edit_cust.setLayout(pnl_edit_custLayout);
        pnl_edit_custLayout.setHorizontalGroup(
            pnl_edit_custLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_edit_custLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(pnl_edit_custLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrolltbl_editcust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_edit_custLayout.createSequentialGroup()
                        .addGroup(pnl_edit_custLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_edit_custLayout.createSequentialGroup()
                                .addComponent(btn_editcust_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_editcust_rmv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_edit_custLayout.createSequentialGroup()
                                .addComponent(txt_editcust_id, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_editcust_nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_edit_custLayout.createSequentialGroup()
                                .addComponent(txt_editcust_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_editcust_shopnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_edit_custLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_editcust_contact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_editcust_shopaddr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(100, 100, 100))
        );
        pnl_edit_custLayout.setVerticalGroup(
            pnl_edit_custLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_edit_custLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(scrolltbl_editcust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(pnl_edit_custLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_editcust_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_editcust_nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_editcust_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_edit_custLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_editcust_shopaddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_editcust_shopnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_editcust_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(pnl_edit_custLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editcust_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editcust_rmv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pnl_cust_det.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_cust_det.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_cust_det.setOpaque(false);

        txt_custdet_custnm.setBackground(new java.awt.Color(150, 195, 248));
        txt_custdet_custnm.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_custdet_custnm.setLabelText("SEARCH BY CUSTOMER NAME");
        txt_custdet_custnm.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_custdet_custnm.setNextFocusableComponent(btn_custdet);
        txt_custdet_custnm.setPreferredSize(new java.awt.Dimension(404, 64));
        txt_custdet_custnm.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txt_custdet_custnmKeyReleased(evt);
            }
        });

        scrolltbl_custdet.setPreferredSize(new java.awt.Dimension(908, 400));

        table_custdet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String []
            {
                "ID", "NAME", "CONTACT", "EMAIL", "SHOP NAME", "SHOP ADDRESS"
            }
        ));
        table_custdet.setPreferredSize(new java.awt.Dimension(908, 400));
        scrolltbl_custdet.setViewportView(table_custdet);

        btn_custdet.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_custdet.setText("FETCH CUSTOMER DETAIL");
        btn_custdet.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btn_custdet.setkBorderRadius(30);
        btn_custdet.setkEndColor(new java.awt.Color(255, 167, 6));
        btn_custdet.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_custdet.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_custdet.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_custdet.setkPressedColor(new java.awt.Color(255, 167, 6));
        btn_custdet.setkStartColor(new java.awt.Color(255, 167, 6));
        btn_custdet.setNextFocusableComponent(txt_custdet_custnm);
        btn_custdet.setOpaque(true);
        btn_custdet.setPreferredSize(new java.awt.Dimension(450, 60));
        btn_custdet.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_custdetFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_custdetFocusLost(evt);
            }
        });
        btn_custdet.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_custdetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_custdetMouseExited(evt);
            }
        });
        btn_custdet.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_custdetActionPerformed(evt);
            }
        });
        btn_custdet.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_custdetKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnl_cust_detLayout = new javax.swing.GroupLayout(pnl_cust_det);
        pnl_cust_det.setLayout(pnl_cust_detLayout);
        pnl_cust_detLayout.setHorizontalGroup(
            pnl_cust_detLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cust_detLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(pnl_cust_detLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_custdet_custnm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_custdet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrolltbl_custdet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        pnl_cust_detLayout.setVerticalGroup(
            pnl_cust_detLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cust_detLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(txt_custdet_custnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(scrolltbl_custdet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_custdet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_customer_mainLayout = new javax.swing.GroupLayout(pnl_customer_main);
        pnl_customer_main.setLayout(pnl_customer_mainLayout);
        pnl_customer_mainLayout.setHorizontalGroup(
            pnl_customer_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_customer_mainLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnl_add_cust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addGroup(pnl_customer_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_edit_cust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_customer_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_cust_det, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_customer_mainLayout.setVerticalGroup(
            pnl_customer_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_customer_mainLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnl_add_cust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addGroup(pnl_customer_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_edit_cust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_customer_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_cust_det, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_customerLayout = new javax.swing.GroupLayout(panel_customer);
        panel_customer.setLayout(panel_customerLayout);
        panel_customerLayout.setHorizontalGroup(
            panel_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_customerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_cust_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_customer_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_customerLayout.setVerticalGroup(
            panel_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_customerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pnl_cust_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnl_customer_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_employee.setkBorderRadius(40);
        panel_employee.setkEndColor(new java.awt.Color(150, 195, 248));
        panel_employee.setkStartColor(new java.awt.Color(150, 195, 248));
        panel_employee.setOpaque(false);
        panel_employee.setPreferredSize(new java.awt.Dimension(1120, 780));

        pnl_emp_menubar.setkBorderRadius(20);
        pnl_emp_menubar.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl_emp_menubar.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl_emp_menubar.setOpaque(false);
        pnl_emp_menubar.setPreferredSize(new java.awt.Dimension(1108, 60));

        pnl_addemp_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl_addemp_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl_addemp_menu.setOpaque(false);
        pnl_addemp_menu.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_addemp_menu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_addemp_menu.setText("ADD EMPLOYEE");
        btn_addemp_menu.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_addemp_menu.setkBorderRadius(20);
        btn_addemp_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_addemp_menu.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_addemp_menu.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_addemp_menu.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_addemp_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_addemp_menu.setNextFocusableComponent(btn_editemp_menu);
        btn_addemp_menu.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_addemp_menu.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_addemp_menuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_addemp_menuFocusLost(evt);
            }
        });
        btn_addemp_menu.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_addemp_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_addemp_menuMouseExited(evt);
            }
        });
        btn_addemp_menu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_addemp_menuActionPerformed(evt);
            }
        });
        btn_addemp_menu.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_addemp_menuKeyPressed(evt);
            }
        });

        lid_add_emp.setBackground(new java.awt.Color(225, 223, 223));
        lid_add_emp.setkBorderRadius(15);
        lid_add_emp.setkEndColor(new java.awt.Color(211, 211, 211));
        lid_add_emp.setkStartColor(new java.awt.Color(211, 211, 211));
        lid_add_emp.setOpaque(false);
        lid_add_emp.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid_add_empLayout = new javax.swing.GroupLayout(lid_add_emp);
        lid_add_emp.setLayout(lid_add_empLayout);
        lid_add_empLayout.setHorizontalGroup(
            lid_add_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid_add_empLayout.setVerticalGroup(
            lid_add_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_addemp_menuLayout = new javax.swing.GroupLayout(pnl_addemp_menu);
        pnl_addemp_menu.setLayout(pnl_addemp_menuLayout);
        pnl_addemp_menuLayout.setHorizontalGroup(
            pnl_addemp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_addemp_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_addemp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid_add_emp, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_addemp_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_addemp_menuLayout.setVerticalGroup(
            pnl_addemp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_addemp_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_addemp_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid_add_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnl_editemp_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl_editemp_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl_editemp_menu.setOpaque(false);
        pnl_editemp_menu.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_editemp_menu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_editemp_menu.setText("EDIT EMPLOYEE");
        btn_editemp_menu.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_editemp_menu.setkBorderRadius(20);
        btn_editemp_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_editemp_menu.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_editemp_menu.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_editemp_menu.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_editemp_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_editemp_menu.setNextFocusableComponent(btn_empdet_menu);
        btn_editemp_menu.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_editemp_menu.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_editemp_menuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_editemp_menuFocusLost(evt);
            }
        });
        btn_editemp_menu.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_editemp_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_editemp_menuMouseExited(evt);
            }
        });
        btn_editemp_menu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_editemp_menuActionPerformed(evt);
            }
        });
        btn_editemp_menu.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_editemp_menuKeyPressed(evt);
            }
        });

        lid_edit_emp.setBackground(new java.awt.Color(225, 223, 223));
        lid_edit_emp.setkBorderRadius(15);
        lid_edit_emp.setkEndColor(new java.awt.Color(211, 211, 211));
        lid_edit_emp.setkStartColor(new java.awt.Color(211, 211, 211));
        lid_edit_emp.setOpaque(false);
        lid_edit_emp.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid_edit_empLayout = new javax.swing.GroupLayout(lid_edit_emp);
        lid_edit_emp.setLayout(lid_edit_empLayout);
        lid_edit_empLayout.setHorizontalGroup(
            lid_edit_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid_edit_empLayout.setVerticalGroup(
            lid_edit_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_editemp_menuLayout = new javax.swing.GroupLayout(pnl_editemp_menu);
        pnl_editemp_menu.setLayout(pnl_editemp_menuLayout);
        pnl_editemp_menuLayout.setHorizontalGroup(
            pnl_editemp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_editemp_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_editemp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid_edit_emp, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_editemp_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_editemp_menuLayout.setVerticalGroup(
            pnl_editemp_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_editemp_menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_editemp_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid_edit_emp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_empdet_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl_empdet_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl_empdet_menu.setOpaque(false);
        pnl_empdet_menu.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_empdet_menu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_empdet_menu.setText("EMPLOYEE DETAIL");
        btn_empdet_menu.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_empdet_menu.setkBorderRadius(20);
        btn_empdet_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_empdet_menu.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_empdet_menu.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_empdet_menu.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_empdet_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_empdet_menu.setNextFocusableComponent(btn_addemp_menu);
        btn_empdet_menu.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_empdet_menu.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_empdet_menuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_empdet_menuFocusLost(evt);
            }
        });
        btn_empdet_menu.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_empdet_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_empdet_menuMouseExited(evt);
            }
        });
        btn_empdet_menu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_empdet_menuActionPerformed(evt);
            }
        });
        btn_empdet_menu.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_empdet_menuKeyPressed(evt);
            }
        });

        lid_emp_det.setBackground(new java.awt.Color(225, 223, 223));
        lid_emp_det.setkBorderRadius(15);
        lid_emp_det.setkEndColor(new java.awt.Color(211, 211, 211));
        lid_emp_det.setkStartColor(new java.awt.Color(211, 211, 211));
        lid_emp_det.setOpaque(false);
        lid_emp_det.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid_emp_detLayout = new javax.swing.GroupLayout(lid_emp_det);
        lid_emp_det.setLayout(lid_emp_detLayout);
        lid_emp_detLayout.setHorizontalGroup(
            lid_emp_detLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid_emp_detLayout.setVerticalGroup(
            lid_emp_detLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_empdet_menuLayout = new javax.swing.GroupLayout(pnl_empdet_menu);
        pnl_empdet_menu.setLayout(pnl_empdet_menuLayout);
        pnl_empdet_menuLayout.setHorizontalGroup(
            pnl_empdet_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_empdet_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_empdet_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid_emp_det, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_empdet_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_empdet_menuLayout.setVerticalGroup(
            pnl_empdet_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_empdet_menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_empdet_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid_emp_det, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnl_emp_menubarLayout = new javax.swing.GroupLayout(pnl_emp_menubar);
        pnl_emp_menubar.setLayout(pnl_emp_menubarLayout);
        pnl_emp_menubarLayout.setHorizontalGroup(
            pnl_emp_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_emp_menubarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pnl_addemp_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_editemp_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(pnl_empdet_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(418, Short.MAX_VALUE))
        );
        pnl_emp_menubarLayout.setVerticalGroup(
            pnl_emp_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_emp_menubarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_emp_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_addemp_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(pnl_empdet_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(pnl_editemp_menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))
        );

        pnl_employee_main.setkBorderRadius(40);
        pnl_employee_main.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_employee_main.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_employee_main.setOpaque(false);
        pnl_employee_main.setPreferredSize(new java.awt.Dimension(1108, 672));

        pnl_add_emp.setkBorderRadius(40);
        pnl_add_emp.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_add_emp.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_add_emp.setOpaque(false);
        pnl_add_emp.setPreferredSize(new java.awt.Dimension(1108, 672));

        txt_addemp_id.setBackground(new java.awt.Color(150, 195, 248));
        txt_addemp_id.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addemp_id.setLabelText("EMPLOYEE ID");
        txt_addemp_id.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addemp_id.setNextFocusableComponent(txt_addemp_nm);
        txt_addemp_id.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_addemp_nm.setBackground(new java.awt.Color(150, 195, 248));
        txt_addemp_nm.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addemp_nm.setLabelText("EMPLOYEE NAME");
        txt_addemp_nm.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addemp_nm.setNextFocusableComponent(txt_addemp_usrnm);
        txt_addemp_nm.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_addemp_contact.setBackground(new java.awt.Color(150, 195, 248));
        txt_addemp_contact.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addemp_contact.setLabelText("CONTACT NO");
        txt_addemp_contact.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addemp_contact.setNextFocusableComponent(txt_addemp_email);
        txt_addemp_contact.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_addemp_email.setBackground(new java.awt.Color(150, 195, 248));
        txt_addemp_email.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addemp_email.setLabelText("EMAIL");
        txt_addemp_email.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addemp_email.setNextFocusableComponent(txt_addemp_salary);
        txt_addemp_email.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_addemp_salary.setBackground(new java.awt.Color(150, 195, 248));
        txt_addemp_salary.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addemp_salary.setLabelText("SALARY");
        txt_addemp_salary.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addemp_salary.setNextFocusableComponent(txt_addemp_addr);
        txt_addemp_salary.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_addemp_addr.setBackground(new java.awt.Color(150, 195, 248));
        txt_addemp_addr.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addemp_addr.setLabelText("ADDRESS");
        txt_addemp_addr.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addemp_addr.setNextFocusableComponent(btn_addemp_add);
        txt_addemp_addr.setPreferredSize(new java.awt.Dimension(404, 64));

        btn_addemp_add.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_addemp_add.setText("ADD EMPLOYEE");
        btn_addemp_add.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btn_addemp_add.setkBorderRadius(30);
        btn_addemp_add.setkEndColor(new java.awt.Color(255, 167, 6));
        btn_addemp_add.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_addemp_add.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_addemp_add.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_addemp_add.setkPressedColor(new java.awt.Color(255, 167, 6));
        btn_addemp_add.setkStartColor(new java.awt.Color(255, 167, 6));
        btn_addemp_add.setNextFocusableComponent(txt_addemp_id);
        btn_addemp_add.setOpaque(true);
        btn_addemp_add.setPreferredSize(new java.awt.Dimension(250, 60));
        btn_addemp_add.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_addemp_addFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_addemp_addFocusLost(evt);
            }
        });
        btn_addemp_add.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_addemp_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_addemp_addMouseExited(evt);
            }
        });
        btn_addemp_add.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_addemp_addActionPerformed(evt);
            }
        });
        btn_addemp_add.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_addemp_addKeyPressed(evt);
            }
        });

        txt_addemp_pswd.setBackground(new java.awt.Color(150, 195, 248));
        txt_addemp_pswd.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt_addemp_pswd.setLabelText("PASSWORD");
        txt_addemp_pswd.setNextFocusableComponent(txt_addemp_contact);
        txt_addemp_pswd.setPreferredSize(new java.awt.Dimension(404, 64));
        txt_addemp_pswd.setShowAndHide(true);

        txt_addemp_usrnm.setBackground(new java.awt.Color(150, 195, 248));
        txt_addemp_usrnm.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addemp_usrnm.setLabelText("USERNAME");
        txt_addemp_usrnm.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addemp_usrnm.setNextFocusableComponent(txt_addemp_pswd);
        txt_addemp_usrnm.setPreferredSize(new java.awt.Dimension(404, 64));

        javax.swing.GroupLayout pnl_add_empLayout = new javax.swing.GroupLayout(pnl_add_emp);
        pnl_add_emp.setLayout(pnl_add_empLayout);
        pnl_add_empLayout.setHorizontalGroup(
            pnl_add_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_add_empLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(pnl_add_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_addemp_salary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_addemp_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_addemp_contact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_addemp_usrnm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(pnl_add_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_addemp_nm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_addemp_pswd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_addemp_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_addemp_addr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_add_empLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_addemp_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(429, 429, 429))
        );
        pnl_add_empLayout.setVerticalGroup(
            pnl_add_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_add_empLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(pnl_add_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_addemp_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_addemp_nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(pnl_add_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_addemp_pswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_addemp_usrnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(pnl_add_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_addemp_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_addemp_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(pnl_add_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_addemp_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_addemp_addr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btn_addemp_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pnl_edit_emp.setkBorderRadius(40);
        pnl_edit_emp.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_edit_emp.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_edit_emp.setOpaque(false);
        pnl_edit_emp.setPreferredSize(new java.awt.Dimension(1108, 672));

        scrolltbl_editemp.setPreferredSize(new java.awt.Dimension(527, 336));

        table_editemp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String []
            {
                "ID", "NAME", "USERNAME", "PASSWORD", "CONTACT", "EMAIL", "SALARY", "ADDRESS"
            }
        ));
        table_editemp.setPreferredSize(new java.awt.Dimension(527, 336));
        table_editemp.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                table_editempMouseClicked(evt);
            }
        });
        scrolltbl_editemp.setViewportView(table_editemp);

        txt_editemp_nm.setBackground(new java.awt.Color(150, 195, 248));
        txt_editemp_nm.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editemp_nm.setLabelText("EMPLOYEE NAME");
        txt_editemp_nm.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editemp_nm.setNextFocusableComponent(txt_editemp_contact);
        txt_editemp_nm.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_editemp_contact.setBackground(new java.awt.Color(150, 195, 248));
        txt_editemp_contact.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editemp_contact.setLabelText("CONTACT");
        txt_editemp_contact.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editemp_contact.setNextFocusableComponent(txt_editemp_email);
        txt_editemp_contact.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_editemp_email.setBackground(new java.awt.Color(150, 195, 248));
        txt_editemp_email.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editemp_email.setLabelText("EMAIL");
        txt_editemp_email.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editemp_email.setNextFocusableComponent(txt_editemp_salary);
        txt_editemp_email.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_editemp_salary.setBackground(new java.awt.Color(150, 195, 248));
        txt_editemp_salary.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editemp_salary.setLabelText("SALARY");
        txt_editemp_salary.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editemp_salary.setNextFocusableComponent(txt_editemp_addr);
        txt_editemp_salary.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_editemp_addr.setBackground(new java.awt.Color(150, 195, 248));
        txt_editemp_addr.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editemp_addr.setLabelText("ADDRESS");
        txt_editemp_addr.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editemp_addr.setNextFocusableComponent(btn_editemp_edit);
        txt_editemp_addr.setPreferredSize(new java.awt.Dimension(404, 64));

        btn_editemp_edit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_editemp_edit.setText("EDIT EMPLOYEE");
        btn_editemp_edit.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btn_editemp_edit.setkBorderRadius(30);
        btn_editemp_edit.setkEndColor(new java.awt.Color(255, 167, 6));
        btn_editemp_edit.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_editemp_edit.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_editemp_edit.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_editemp_edit.setkPressedColor(new java.awt.Color(255, 167, 6));
        btn_editemp_edit.setkStartColor(new java.awt.Color(255, 167, 6));
        btn_editemp_edit.setNextFocusableComponent(btn_editemp_rmv);
        btn_editemp_edit.setOpaque(true);
        btn_editemp_edit.setPreferredSize(new java.awt.Dimension(250, 60));
        btn_editemp_edit.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_editemp_editFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_editemp_editFocusLost(evt);
            }
        });
        btn_editemp_edit.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_editemp_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_editemp_editMouseExited(evt);
            }
        });
        btn_editemp_edit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_editemp_editActionPerformed(evt);
            }
        });
        btn_editemp_edit.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_editemp_editKeyPressed(evt);
            }
        });

        btn_editemp_rmv.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_editemp_rmv.setText("REMOVE EMPLOYEE");
        btn_editemp_rmv.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btn_editemp_rmv.setkBorderRadius(30);
        btn_editemp_rmv.setkEndColor(new java.awt.Color(255, 167, 6));
        btn_editemp_rmv.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_editemp_rmv.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_editemp_rmv.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_editemp_rmv.setkPressedColor(new java.awt.Color(255, 167, 6));
        btn_editemp_rmv.setkStartColor(new java.awt.Color(255, 167, 6));
        btn_editemp_rmv.setOpaque(true);
        btn_editemp_rmv.setPreferredSize(new java.awt.Dimension(250, 60));
        btn_editemp_rmv.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_editemp_rmvFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_editemp_rmvFocusLost(evt);
            }
        });
        btn_editemp_rmv.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_editemp_rmvMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_editemp_rmvMouseExited(evt);
            }
        });
        btn_editemp_rmv.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_editemp_rmvActionPerformed(evt);
            }
        });
        btn_editemp_rmv.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_editemp_rmvKeyPressed(evt);
            }
        });

        txt_editemp_pswd.setBackground(new java.awt.Color(150, 195, 248));
        txt_editemp_pswd.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt_editemp_pswd.setLabelText("PASSWORD");
        txt_editemp_pswd.setPreferredSize(new java.awt.Dimension(404, 64));
        txt_editemp_pswd.setShowAndHide(true);

        txt_editemp_usrnm.setBackground(new java.awt.Color(150, 195, 248));
        txt_editemp_usrnm.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editemp_usrnm.setLabelText("USERNAME");
        txt_editemp_usrnm.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editemp_usrnm.setNextFocusableComponent(txt_editemp_contact);
        txt_editemp_usrnm.setPreferredSize(new java.awt.Dimension(404, 64));

        javax.swing.GroupLayout pnl_edit_empLayout = new javax.swing.GroupLayout(pnl_edit_emp);
        pnl_edit_emp.setLayout(pnl_edit_empLayout);
        pnl_edit_empLayout.setHorizontalGroup(
            pnl_edit_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_edit_empLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnl_edit_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_edit_empLayout.createSequentialGroup()
                        .addComponent(btn_editemp_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btn_editemp_rmv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrolltbl_editemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(pnl_edit_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_editemp_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_editemp_nm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_editemp_usrnm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_editemp_pswd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_editemp_contact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_editemp_salary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_editemp_addr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        pnl_edit_empLayout.setVerticalGroup(
            pnl_edit_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_edit_empLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(pnl_edit_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrolltbl_editemp, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_edit_empLayout.createSequentialGroup()
                        .addComponent(txt_editemp_nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_editemp_usrnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_editemp_pswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_editemp_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_editemp_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_editemp_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnl_edit_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_edit_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_editemp_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_editemp_rmv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_editemp_addr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pnl_emp_det.setkBorderRadius(40);
        pnl_emp_det.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_emp_det.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_emp_det.setOpaque(false);
        pnl_emp_det.setPreferredSize(new java.awt.Dimension(1108, 672));

        txt_empdet_nm.setBackground(new java.awt.Color(150, 195, 248));
        txt_empdet_nm.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_empdet_nm.setLabelText("SEARCH BY EMPLOYEE NAME");
        txt_empdet_nm.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_empdet_nm.setNextFocusableComponent(btn_empdet);
        txt_empdet_nm.setPreferredSize(new java.awt.Dimension(404, 64));
        txt_empdet_nm.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                txt_empdet_nmKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txt_empdet_nmKeyReleased(evt);
            }
        });

        scrolltbl_empdet.setPreferredSize(new java.awt.Dimension(908, 400));

        table_empdet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String []
            {
                "ID", "NAME", "CONTACT", "EMAIL", "SALARY", "ADDRESS", "PASSWORD"
            }
        ));
        table_empdet.setPreferredSize(new java.awt.Dimension(908, 400));
        scrolltbl_empdet.setViewportView(table_empdet);

        btn_empdet.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_empdet.setText("FETCH EMPLOYEE DETAIL");
        btn_empdet.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btn_empdet.setkBorderRadius(30);
        btn_empdet.setkEndColor(new java.awt.Color(255, 167, 6));
        btn_empdet.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_empdet.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_empdet.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_empdet.setkPressedColor(new java.awt.Color(255, 167, 6));
        btn_empdet.setkStartColor(new java.awt.Color(255, 167, 6));
        btn_empdet.setNextFocusableComponent(txt_empdet_nm);
        btn_empdet.setOpaque(true);
        btn_empdet.setPreferredSize(new java.awt.Dimension(450, 60));
        btn_empdet.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_empdetFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_empdetFocusLost(evt);
            }
        });
        btn_empdet.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_empdetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_empdetMouseExited(evt);
            }
        });
        btn_empdet.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_empdetActionPerformed(evt);
            }
        });
        btn_empdet.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_empdetKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnl_emp_detLayout = new javax.swing.GroupLayout(pnl_emp_det);
        pnl_emp_det.setLayout(pnl_emp_detLayout);
        pnl_emp_detLayout.setHorizontalGroup(
            pnl_emp_detLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_emp_detLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(pnl_emp_detLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_empdet_nm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_empdet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrolltbl_empdet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        pnl_emp_detLayout.setVerticalGroup(
            pnl_emp_detLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_emp_detLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(txt_empdet_nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(scrolltbl_empdet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_empdet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_employee_mainLayout = new javax.swing.GroupLayout(pnl_employee_main);
        pnl_employee_main.setLayout(pnl_employee_mainLayout);
        pnl_employee_mainLayout.setHorizontalGroup(
            pnl_employee_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnl_employee_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_add_emp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_employee_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_edit_emp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_employee_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_emp_det, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_employee_mainLayout.setVerticalGroup(
            pnl_employee_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
            .addGroup(pnl_employee_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_add_emp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_employee_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_edit_emp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_employee_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_emp_det, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_employeeLayout = new javax.swing.GroupLayout(panel_employee);
        panel_employee.setLayout(panel_employeeLayout);
        panel_employeeLayout.setHorizontalGroup(
            panel_employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_employeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnl_employee_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_emp_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_employeeLayout.setVerticalGroup(
            panel_employeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_employeeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pnl_emp_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnl_employee_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_product.setkBorderRadius(40);
        panel_product.setkEndColor(new java.awt.Color(150, 195, 248));
        panel_product.setkStartColor(new java.awt.Color(150, 195, 248));
        panel_product.setOpaque(false);

        pnl_prod_menubar.setkBorderRadius(20);
        pnl_prod_menubar.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl_prod_menubar.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl_prod_menubar.setOpaque(false);
        pnl_prod_menubar.setPreferredSize(new java.awt.Dimension(1108, 60));

        pnl_addprod_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl_addprod_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl_addprod_menu.setOpaque(false);
        pnl_addprod_menu.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_addprod_menu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_addprod_menu.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_addprod_menu.setkBorderRadius(20);
        btn_addprod_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_addprod_menu.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_addprod_menu.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_addprod_menu.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_addprod_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_addprod_menu.setLabel("ADD PRODUCT");
        btn_addprod_menu.setNextFocusableComponent(btn_editprod_menu);
        btn_addprod_menu.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_addprod_menu.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_addprod_menuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_addprod_menuFocusLost(evt);
            }
        });
        btn_addprod_menu.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_addprod_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_addprod_menuMouseExited(evt);
            }
        });
        btn_addprod_menu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_addprod_menuActionPerformed(evt);
            }
        });
        btn_addprod_menu.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_addprod_menuKeyPressed(evt);
            }
        });

        lid_addprod.setBackground(new java.awt.Color(225, 223, 223));
        lid_addprod.setkBorderRadius(15);
        lid_addprod.setkEndColor(new java.awt.Color(211, 211, 211));
        lid_addprod.setkStartColor(new java.awt.Color(211, 211, 211));
        lid_addprod.setOpaque(false);
        lid_addprod.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid_addprodLayout = new javax.swing.GroupLayout(lid_addprod);
        lid_addprod.setLayout(lid_addprodLayout);
        lid_addprodLayout.setHorizontalGroup(
            lid_addprodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid_addprodLayout.setVerticalGroup(
            lid_addprodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_addprod_menuLayout = new javax.swing.GroupLayout(pnl_addprod_menu);
        pnl_addprod_menu.setLayout(pnl_addprod_menuLayout);
        pnl_addprod_menuLayout.setHorizontalGroup(
            pnl_addprod_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_addprod_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_addprod_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid_addprod, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_addprod_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_addprod_menuLayout.setVerticalGroup(
            pnl_addprod_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_addprod_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_addprod_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid_addprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnl_editprod_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl_editprod_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl_editprod_menu.setOpaque(false);
        pnl_editprod_menu.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_editprod_menu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_editprod_menu.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_editprod_menu.setkBorderRadius(20);
        btn_editprod_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_editprod_menu.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_editprod_menu.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_editprod_menu.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_editprod_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_editprod_menu.setLabel("EDIT PRODUCT");
        btn_editprod_menu.setNextFocusableComponent(btn_proddet_menu);
        btn_editprod_menu.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_editprod_menu.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_editprod_menuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_editprod_menuFocusLost(evt);
            }
        });
        btn_editprod_menu.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_editprod_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_editprod_menuMouseExited(evt);
            }
        });
        btn_editprod_menu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_editprod_menuActionPerformed(evt);
            }
        });
        btn_editprod_menu.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_editprod_menuKeyPressed(evt);
            }
        });

        lid_editprod.setBackground(new java.awt.Color(225, 223, 223));
        lid_editprod.setkBorderRadius(15);
        lid_editprod.setkEndColor(new java.awt.Color(211, 211, 211));
        lid_editprod.setkStartColor(new java.awt.Color(211, 211, 211));
        lid_editprod.setOpaque(false);
        lid_editprod.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid_editprodLayout = new javax.swing.GroupLayout(lid_editprod);
        lid_editprod.setLayout(lid_editprodLayout);
        lid_editprodLayout.setHorizontalGroup(
            lid_editprodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid_editprodLayout.setVerticalGroup(
            lid_editprodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_editprod_menuLayout = new javax.swing.GroupLayout(pnl_editprod_menu);
        pnl_editprod_menu.setLayout(pnl_editprod_menuLayout);
        pnl_editprod_menuLayout.setHorizontalGroup(
            pnl_editprod_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_editprod_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_editprod_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid_editprod, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_editprod_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_editprod_menuLayout.setVerticalGroup(
            pnl_editprod_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_editprod_menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_editprod_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid_editprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_proddet_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl_proddet_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl_proddet_menu.setOpaque(false);
        pnl_proddet_menu.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_proddet_menu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_proddet_menu.setText("PRODUCT DETAIL");
        btn_proddet_menu.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_proddet_menu.setkBorderRadius(20);
        btn_proddet_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_proddet_menu.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_proddet_menu.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_proddet_menu.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_proddet_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_proddet_menu.setNextFocusableComponent(btn_addprod_menu);
        btn_proddet_menu.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_proddet_menu.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_proddet_menuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_proddet_menuFocusLost(evt);
            }
        });
        btn_proddet_menu.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_proddet_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_proddet_menuMouseExited(evt);
            }
        });
        btn_proddet_menu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_proddet_menuActionPerformed(evt);
            }
        });
        btn_proddet_menu.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_proddet_menuKeyPressed(evt);
            }
        });

        lid_proddet.setBackground(new java.awt.Color(225, 223, 223));
        lid_proddet.setkBorderRadius(15);
        lid_proddet.setkEndColor(new java.awt.Color(211, 211, 211));
        lid_proddet.setkStartColor(new java.awt.Color(211, 211, 211));
        lid_proddet.setOpaque(false);
        lid_proddet.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid_proddetLayout = new javax.swing.GroupLayout(lid_proddet);
        lid_proddet.setLayout(lid_proddetLayout);
        lid_proddetLayout.setHorizontalGroup(
            lid_proddetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid_proddetLayout.setVerticalGroup(
            lid_proddetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_proddet_menuLayout = new javax.swing.GroupLayout(pnl_proddet_menu);
        pnl_proddet_menu.setLayout(pnl_proddet_menuLayout);
        pnl_proddet_menuLayout.setHorizontalGroup(
            pnl_proddet_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_proddet_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_proddet_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid_proddet, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_proddet_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_proddet_menuLayout.setVerticalGroup(
            pnl_proddet_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_proddet_menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_proddet_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid_proddet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnl_prod_menubarLayout = new javax.swing.GroupLayout(pnl_prod_menubar);
        pnl_prod_menubar.setLayout(pnl_prod_menubarLayout);
        pnl_prod_menubarLayout.setHorizontalGroup(
            pnl_prod_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_prod_menubarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pnl_addprod_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_editprod_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(pnl_proddet_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(418, Short.MAX_VALUE))
        );
        pnl_prod_menubarLayout.setVerticalGroup(
            pnl_prod_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_prod_menubarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_prod_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_addprod_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_proddet_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_editprod_menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pnl_prod_main.setkBorderRadius(40);
        pnl_prod_main.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_prod_main.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_prod_main.setOpaque(false);
        pnl_prod_main.setPreferredSize(new java.awt.Dimension(1108, 672));

        pnl_add_prod.setkBorderRadius(40);
        pnl_add_prod.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_add_prod.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_add_prod.setOpaque(false);
        pnl_add_prod.setPreferredSize(new java.awt.Dimension(1108, 672));

        txt_addprod_id.setEditable(false);
        txt_addprod_id.setBackground(new java.awt.Color(150, 195, 248));
        txt_addprod_id.setFocusCycleRoot(true);
        txt_addprod_id.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addprod_id.setLabelText("PRODUCT ID");
        txt_addprod_id.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addprod_id.setNextFocusableComponent(txt_addprod_nm);
        txt_addprod_id.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_addprod_costprice.setBackground(new java.awt.Color(150, 195, 248));
        txt_addprod_costprice.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addprod_costprice.setLabelText("COST PRICE");
        txt_addprod_costprice.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addprod_costprice.setNextFocusableComponent(txt_addprod_sellingprice);
        txt_addprod_costprice.setPreferredSize(new java.awt.Dimension(404, 64));
        txt_addprod_costprice.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txt_addprod_costpriceActionPerformed(evt);
            }
        });

        txt_addprod_sellingprice.setBackground(new java.awt.Color(150, 195, 248));
        txt_addprod_sellingprice.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addprod_sellingprice.setLabelText("SELLING PRICE");
        txt_addprod_sellingprice.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addprod_sellingprice.setNextFocusableComponent(cmbbox_addprod_brand);
        txt_addprod_sellingprice.setPreferredSize(new java.awt.Dimension(404, 64));

        cmbbox_addprod_brand.setBackground(new java.awt.Color(255, 167, 6));
        cmbbox_addprod_brand.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbbox_addprod_brand.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--SELECT BRAND--", "HP", "ACER", "LENOVO", "DELL", "ACER" }));
        cmbbox_addprod_brand.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        cmbbox_addprod_brand.setMaximumSize(new java.awt.Dimension(415, 64));
        cmbbox_addprod_brand.setMinimumSize(new java.awt.Dimension(415, 64));
        cmbbox_addprod_brand.setNextFocusableComponent(txt_addprod_quantity);
        cmbbox_addprod_brand.setPreferredSize(new java.awt.Dimension(404, 64));
        cmbbox_addprod_brand.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmbbox_addprod_brandActionPerformed(evt);
            }
        });

        txt_addprod_nm.setBackground(new java.awt.Color(150, 195, 248));
        txt_addprod_nm.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt_addprod_nm.setLabelText("PRODUCT NAME");
        txt_addprod_nm.setNextFocusableComponent(txt_addprod_costprice);
        txt_addprod_nm.setPreferredSize(new java.awt.Dimension(404, 64));

        btn_addprod.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_addprod.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btn_addprod.setkBorderRadius(30);
        btn_addprod.setkEndColor(new java.awt.Color(255, 167, 6));
        btn_addprod.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_addprod.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_addprod.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_addprod.setkPressedColor(new java.awt.Color(255, 167, 6));
        btn_addprod.setkStartColor(new java.awt.Color(255, 167, 6));
        btn_addprod.setLabel("ADD PRODUCT");
        btn_addprod.setNextFocusableComponent(txt_addprod_id);
        btn_addprod.setOpaque(true);
        btn_addprod.setPreferredSize(new java.awt.Dimension(250, 60));
        btn_addprod.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_addprodFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_addprodFocusLost(evt);
            }
        });
        btn_addprod.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_addprodMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_addprodMouseExited(evt);
            }
        });
        btn_addprod.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_addprodActionPerformed(evt);
            }
        });
        btn_addprod.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_addprodKeyPressed(evt);
            }
        });

        txt_addprod_quantity.setBackground(new java.awt.Color(150, 195, 248));
        txt_addprod_quantity.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addprod_quantity.setLabelText("QUANTITY");
        txt_addprod_quantity.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addprod_quantity.setNextFocusableComponent(btn_addprod);
        txt_addprod_quantity.setPreferredSize(new java.awt.Dimension(404, 64));

        javax.swing.GroupLayout pnl_add_prodLayout = new javax.swing.GroupLayout(pnl_add_prod);
        pnl_add_prod.setLayout(pnl_add_prodLayout);
        pnl_add_prodLayout.setHorizontalGroup(
            pnl_add_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_add_prodLayout.createSequentialGroup()
                .addGroup(pnl_add_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_add_prodLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(pnl_add_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_addprod_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_addprod_costprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbbox_addprod_brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addGroup(pnl_add_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_addprod_sellingprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_addprod_nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_addprod_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_add_prodLayout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(btn_addprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        pnl_add_prodLayout.setVerticalGroup(
            pnl_add_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_add_prodLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addGroup(pnl_add_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_addprod_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_addprod_nm, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_add_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_addprod_sellingprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_addprod_costprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_add_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_addprod_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbbox_addprod_brand, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(btn_addprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pnl_edit_prod.setkBorderRadius(40);
        pnl_edit_prod.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_edit_prod.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_edit_prod.setOpaque(false);
        pnl_edit_prod.setPreferredSize(new java.awt.Dimension(1108, 672));

        scrolltbl_editprod.setPreferredSize(new java.awt.Dimension(527, 336));

        table_editprod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String []
            {
                "ID", "NAME", "COST PRICE", "SELLING PRICE", "BRAND", "QUANTITY"
            }
        ));
        table_editprod.setPreferredSize(new java.awt.Dimension(527, 336));
        table_editprod.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                table_editprodMouseClicked(evt);
            }
        });
        scrolltbl_editprod.setViewportView(table_editprod);

        txt_editprod_id.setBackground(new java.awt.Color(150, 195, 248));
        txt_editprod_id.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editprod_id.setLabelText("PRODUCT ID");
        txt_editprod_id.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editprod_id.setNextFocusableComponent(txt_editprod_nm);
        txt_editprod_id.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_editprod_nm.setBackground(new java.awt.Color(150, 195, 248));
        txt_editprod_nm.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editprod_nm.setLabelText("PRODUCT NAME");
        txt_editprod_nm.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editprod_nm.setNextFocusableComponent(cmbbox_editprod_brand);
        txt_editprod_nm.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_editprod_costprice.setBackground(new java.awt.Color(150, 195, 248));
        txt_editprod_costprice.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editprod_costprice.setLabelText("COST PRICE");
        txt_editprod_costprice.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editprod_costprice.setNextFocusableComponent(txt_editprod_quantity);
        txt_editprod_costprice.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_editprod_quantity.setBackground(new java.awt.Color(150, 195, 248));
        txt_editprod_quantity.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editprod_quantity.setLabelText("QUANTITY");
        txt_editprod_quantity.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editprod_quantity.setNextFocusableComponent(btn_editprod_edit);
        txt_editprod_quantity.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_editprod_sellingprice.setBackground(new java.awt.Color(150, 195, 248));
        txt_editprod_sellingprice.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editprod_sellingprice.setLabelText("SELLING PRICE");
        txt_editprod_sellingprice.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editprod_sellingprice.setNextFocusableComponent(txt_editprod_costprice);
        txt_editprod_sellingprice.setPreferredSize(new java.awt.Dimension(404, 64));

        cmbbox_editprod_brand.setBackground(new java.awt.Color(255, 167, 6));
        cmbbox_editprod_brand.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbbox_editprod_brand.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--SELECT BRAND--", "DELL", "HP", "LENOVO", "ACER" }));
        cmbbox_editprod_brand.setSelectedItem("--SELECT--BRAND--");
        cmbbox_editprod_brand.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        cmbbox_editprod_brand.setMaximumSize(new java.awt.Dimension(415, 64));
        cmbbox_editprod_brand.setMinimumSize(new java.awt.Dimension(415, 64));
        cmbbox_editprod_brand.setNextFocusableComponent(txt_editprod_sellingprice);
        cmbbox_editprod_brand.setPreferredSize(new java.awt.Dimension(404, 64));
        cmbbox_editprod_brand.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmbbox_editprod_brandActionPerformed(evt);
            }
        });

        btn_editprod_edit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_editprod_edit.setText("EDIT PRODUCT");
        btn_editprod_edit.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btn_editprod_edit.setkBorderRadius(30);
        btn_editprod_edit.setkEndColor(new java.awt.Color(255, 167, 6));
        btn_editprod_edit.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_editprod_edit.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_editprod_edit.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_editprod_edit.setkPressedColor(new java.awt.Color(255, 167, 6));
        btn_editprod_edit.setkStartColor(new java.awt.Color(255, 167, 6));
        btn_editprod_edit.setNextFocusableComponent(btn_editprod_rmv);
        btn_editprod_edit.setOpaque(true);
        btn_editprod_edit.setPreferredSize(new java.awt.Dimension(250, 60));
        btn_editprod_edit.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_editprod_editFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_editprod_editFocusLost(evt);
            }
        });
        btn_editprod_edit.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_editprod_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_editprod_editMouseExited(evt);
            }
        });
        btn_editprod_edit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_editprod_editActionPerformed(evt);
            }
        });
        btn_editprod_edit.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_editprod_editKeyPressed(evt);
            }
        });

        btn_editprod_rmv.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_editprod_rmv.setText("REMOVE PRODUCT");
        btn_editprod_rmv.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btn_editprod_rmv.setkBorderRadius(30);
        btn_editprod_rmv.setkEndColor(new java.awt.Color(255, 167, 6));
        btn_editprod_rmv.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_editprod_rmv.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_editprod_rmv.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_editprod_rmv.setkPressedColor(new java.awt.Color(255, 167, 6));
        btn_editprod_rmv.setkStartColor(new java.awt.Color(255, 167, 6));
        btn_editprod_rmv.setNextFocusableComponent(txt_editprod_id);
        btn_editprod_rmv.setOpaque(true);
        btn_editprod_rmv.setPreferredSize(new java.awt.Dimension(250, 60));
        btn_editprod_rmv.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_editprod_rmvFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_editprod_rmvFocusLost(evt);
            }
        });
        btn_editprod_rmv.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_editprod_rmvMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_editprod_rmvMouseExited(evt);
            }
        });
        btn_editprod_rmv.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_editprod_rmvActionPerformed(evt);
            }
        });
        btn_editprod_rmv.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_editprod_rmvKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnl_edit_prodLayout = new javax.swing.GroupLayout(pnl_edit_prod);
        pnl_edit_prod.setLayout(pnl_edit_prodLayout);
        pnl_edit_prodLayout.setHorizontalGroup(
            pnl_edit_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_edit_prodLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(pnl_edit_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_edit_prodLayout.createSequentialGroup()
                        .addGroup(pnl_edit_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_edit_prodLayout.createSequentialGroup()
                                .addComponent(txt_editprod_id, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addComponent(txt_editprod_nm, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scrolltbl_editprod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnl_edit_prodLayout.createSequentialGroup()
                                .addGroup(pnl_edit_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_editprod_costprice, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbbox_editprod_brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnl_edit_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_editprod_quantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_editprod_sellingprice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(100, 100, 100))
                    .addGroup(pnl_edit_prodLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(btn_editprod_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(262, 262, 262)
                        .addComponent(btn_editprod_rmv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnl_edit_prodLayout.setVerticalGroup(
            pnl_edit_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_edit_prodLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(scrolltbl_editprod, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(pnl_edit_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_editprod_id, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_editprod_nm, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnl_edit_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_editprod_sellingprice, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbbox_editprod_brand, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnl_edit_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_editprod_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_editprod_costprice, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_edit_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editprod_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editprod_rmv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pnl_prod_det.setkBorderRadius(40);
        pnl_prod_det.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_prod_det.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_prod_det.setOpaque(false);
        pnl_prod_det.setPreferredSize(new java.awt.Dimension(1108, 672));

        txt_proddet_nm.setBackground(new java.awt.Color(150, 195, 248));
        txt_proddet_nm.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_proddet_nm.setLabelText("SEARCH BY PRODUCT NAME");
        txt_proddet_nm.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_proddet_nm.setNextFocusableComponent(btn_proddet);
        txt_proddet_nm.setPreferredSize(new java.awt.Dimension(404, 64));
        txt_proddet_nm.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txt_proddet_nmKeyReleased(evt);
            }
        });

        scrolltbl_proddet.setPreferredSize(new java.awt.Dimension(908, 400));

        table_proddet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String []
            {
                "ID", "NAME", "COST PRICE", "SELLING PRICE", "BRAND", "QUANTITY"
            }
        ));
        table_proddet.setPreferredSize(new java.awt.Dimension(908, 400));
        scrolltbl_proddet.setViewportView(table_proddet);

        btn_proddet.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_proddet.setText("FETCH PRODUCT DETAIL");
        btn_proddet.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btn_proddet.setkBorderRadius(30);
        btn_proddet.setkEndColor(new java.awt.Color(255, 167, 6));
        btn_proddet.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_proddet.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_proddet.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_proddet.setkPressedColor(new java.awt.Color(255, 167, 6));
        btn_proddet.setkStartColor(new java.awt.Color(255, 167, 6));
        btn_proddet.setNextFocusableComponent(txt_proddet_nm);
        btn_proddet.setOpaque(true);
        btn_proddet.setPreferredSize(new java.awt.Dimension(450, 60));
        btn_proddet.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_proddetFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_proddetFocusLost(evt);
            }
        });
        btn_proddet.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_proddetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_proddetMouseExited(evt);
            }
        });
        btn_proddet.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_proddetActionPerformed(evt);
            }
        });
        btn_proddet.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_proddetKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnl_prod_detLayout = new javax.swing.GroupLayout(pnl_prod_det);
        pnl_prod_det.setLayout(pnl_prod_detLayout);
        pnl_prod_detLayout.setHorizontalGroup(
            pnl_prod_detLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_prod_detLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(pnl_prod_detLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_proddet_nm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_proddet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrolltbl_proddet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        pnl_prod_detLayout.setVerticalGroup(
            pnl_prod_detLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_prod_detLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(txt_proddet_nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(scrolltbl_proddet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_proddet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_prod_mainLayout = new javax.swing.GroupLayout(pnl_prod_main);
        pnl_prod_main.setLayout(pnl_prod_mainLayout);
        pnl_prod_mainLayout.setHorizontalGroup(
            pnl_prod_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnl_prod_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_add_prod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_prod_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_edit_prod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_prod_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_prod_det, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_prod_mainLayout.setVerticalGroup(
            pnl_prod_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
            .addGroup(pnl_prod_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_add_prod, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE))
            .addGroup(pnl_prod_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_edit_prod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE))
            .addGroup(pnl_prod_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_prod_det, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_productLayout = new javax.swing.GroupLayout(panel_product);
        panel_product.setLayout(panel_productLayout);
        panel_productLayout.setHorizontalGroup(
            panel_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_productLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_prod_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_prod_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_productLayout.setVerticalGroup(
            panel_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_productLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pnl_prod_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnl_prod_main, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_bill.setkBorderRadius(40);
        panel_bill.setkEndColor(new java.awt.Color(150, 195, 248));
        panel_bill.setkStartColor(new java.awt.Color(150, 195, 248));
        panel_bill.setOpaque(false);

        pnl_bill_menubar.setkBorderRadius(20);
        pnl_bill_menubar.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl_bill_menubar.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl_bill_menubar.setOpaque(false);
        pnl_bill_menubar.setPreferredSize(new java.awt.Dimension(1108, 60));

        pnl_createbill_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl_createbill_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl_createbill_menu.setOpaque(false);
        pnl_createbill_menu.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_createbill_menu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_createbill_menu.setText("CREATE BILL");
        btn_createbill_menu.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_createbill_menu.setkBorderRadius(20);
        btn_createbill_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_createbill_menu.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_createbill_menu.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_createbill_menu.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_createbill_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_createbill_menu.setNextFocusableComponent(btn_modifybill_menu);
        btn_createbill_menu.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_createbill_menu.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_createbill_menuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_createbill_menuFocusLost(evt);
            }
        });
        btn_createbill_menu.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_createbill_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_createbill_menuMouseExited(evt);
            }
        });
        btn_createbill_menu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_createbill_menuActionPerformed(evt);
            }
        });
        btn_createbill_menu.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_createbill_menuKeyPressed(evt);
            }
        });

        lid_createbill.setBackground(new java.awt.Color(225, 223, 223));
        lid_createbill.setkBorderRadius(15);
        lid_createbill.setkEndColor(new java.awt.Color(211, 211, 211));
        lid_createbill.setkStartColor(new java.awt.Color(211, 211, 211));
        lid_createbill.setOpaque(false);
        lid_createbill.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid_createbillLayout = new javax.swing.GroupLayout(lid_createbill);
        lid_createbill.setLayout(lid_createbillLayout);
        lid_createbillLayout.setHorizontalGroup(
            lid_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid_createbillLayout.setVerticalGroup(
            lid_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_createbill_menuLayout = new javax.swing.GroupLayout(pnl_createbill_menu);
        pnl_createbill_menu.setLayout(pnl_createbill_menuLayout);
        pnl_createbill_menuLayout.setHorizontalGroup(
            pnl_createbill_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_createbill_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_createbill_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid_createbill, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_createbill_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_createbill_menuLayout.setVerticalGroup(
            pnl_createbill_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_createbill_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_createbill_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid_createbill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnl_modifybill_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl_modifybill_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl_modifybill_menu.setOpaque(false);
        pnl_modifybill_menu.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_modifybill_menu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_modifybill_menu.setText("MODIFY BILL");
        btn_modifybill_menu.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_modifybill_menu.setkBorderRadius(20);
        btn_modifybill_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_modifybill_menu.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_modifybill_menu.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_modifybill_menu.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_modifybill_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_modifybill_menu.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_modifybill_menu.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_modifybill_menuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_modifybill_menuFocusLost(evt);
            }
        });
        btn_modifybill_menu.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_modifybill_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_modifybill_menuMouseExited(evt);
            }
        });
        btn_modifybill_menu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_modifybill_menuActionPerformed(evt);
            }
        });
        btn_modifybill_menu.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_modifybill_menuKeyPressed(evt);
            }
        });

        lid_modifybill.setBackground(new java.awt.Color(225, 223, 223));
        lid_modifybill.setkBorderRadius(15);
        lid_modifybill.setkEndColor(new java.awt.Color(211, 211, 211));
        lid_modifybill.setkStartColor(new java.awt.Color(211, 211, 211));
        lid_modifybill.setOpaque(false);
        lid_modifybill.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid_modifybillLayout = new javax.swing.GroupLayout(lid_modifybill);
        lid_modifybill.setLayout(lid_modifybillLayout);
        lid_modifybillLayout.setHorizontalGroup(
            lid_modifybillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid_modifybillLayout.setVerticalGroup(
            lid_modifybillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_modifybill_menuLayout = new javax.swing.GroupLayout(pnl_modifybill_menu);
        pnl_modifybill_menu.setLayout(pnl_modifybill_menuLayout);
        pnl_modifybill_menuLayout.setHorizontalGroup(
            pnl_modifybill_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_modifybill_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_modifybill_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid_modifybill, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_modifybill_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_modifybill_menuLayout.setVerticalGroup(
            pnl_modifybill_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_modifybill_menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_modifybill_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid_modifybill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnl_bill_menubarLayout = new javax.swing.GroupLayout(pnl_bill_menubar);
        pnl_bill_menubar.setLayout(pnl_bill_menubarLayout);
        pnl_bill_menubarLayout.setHorizontalGroup(
            pnl_bill_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_bill_menubarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pnl_createbill_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_modifybill_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_bill_menubarLayout.setVerticalGroup(
            pnl_bill_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_bill_menubarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_bill_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_createbill_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(pnl_modifybill_menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))
        );

        pnl_bill_main.setkBorderRadius(40);
        pnl_bill_main.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_bill_main.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_bill_main.setOpaque(false);
        pnl_bill_main.setPreferredSize(new java.awt.Dimension(1108, 672));

        pnl_createbill.setkBorderRadius(40);
        pnl_createbill.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_createbill.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_createbill.setOpaque(false);
        pnl_createbill.setPreferredSize(new java.awt.Dimension(1108, 672));

        lbl_createbill_custdet.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_createbill_custdet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_createbill_custdet.setText("CONSUMER DETAIL :");
        lbl_createbill_custdet.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_createbill_custdet.setPreferredSize(new java.awt.Dimension(240, 50));

        lbl_billno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_billno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_billno.setText("BILL NO.");
        lbl_billno.setPreferredSize(new java.awt.Dimension(209, 50));

        lbl_billno_no.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_billno_no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_billno_no.setText("1");
        lbl_billno_no.setPreferredSize(new java.awt.Dimension(50, 50));

        cmbbox_createbill_custnm.setBackground(new java.awt.Color(255, 167, 6));
        cmbbox_createbill_custnm.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbbox_createbill_custnm.setMaximumRowCount(5);
        cmbbox_createbill_custnm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CUSTOMER NAME" }));
        cmbbox_createbill_custnm.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        cmbbox_createbill_custnm.setMaximumSize(new java.awt.Dimension(150, 50));
        cmbbox_createbill_custnm.setMinimumSize(new java.awt.Dimension(150, 50));
        cmbbox_createbill_custnm.setNextFocusableComponent(cmbbox_createbill_prodnm);
        cmbbox_createbill_custnm.setPreferredSize(new java.awt.Dimension(300, 64));
        cmbbox_createbill_custnm.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                cmbbox_createbill_custnmItemStateChanged(evt);
            }
        });
        cmbbox_createbill_custnm.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmbbox_createbill_custnmActionPerformed(evt);
            }
        });

        txt_createbill_custid.setEditable(false);
        txt_createbill_custid.setBackground(new java.awt.Color(150, 195, 248));
        txt_createbill_custid.setFocusCycleRoot(true);
        txt_createbill_custid.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_createbill_custid.setLabelText("CUST ID");
        txt_createbill_custid.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_createbill_custid.setNextFocusableComponent(txt_addprod_nm);
        txt_createbill_custid.setPreferredSize(new java.awt.Dimension(150, 64));

        txt_createbill_addr.setEditable(false);
        txt_createbill_addr.setBackground(new java.awt.Color(150, 195, 248));
        txt_createbill_addr.setFocusCycleRoot(true);
        txt_createbill_addr.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_createbill_addr.setLabelText("ADDRESS");
        txt_createbill_addr.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_createbill_addr.setNextFocusableComponent(txt_addprod_nm);
        txt_createbill_addr.setPreferredSize(new java.awt.Dimension(300, 64));

        txt_createbill_contact.setEditable(false);
        txt_createbill_contact.setBackground(new java.awt.Color(150, 195, 248));
        txt_createbill_contact.setFocusCycleRoot(true);
        txt_createbill_contact.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_createbill_contact.setLabelText("CONTACT");
        txt_createbill_contact.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_createbill_contact.setNextFocusableComponent(txt_addprod_nm);
        txt_createbill_contact.setPreferredSize(new java.awt.Dimension(300, 64));

        lbl_createbill_proddet.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_createbill_proddet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_createbill_proddet.setText("PRODUCTS LISTING :");
        lbl_createbill_proddet.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_createbill_proddet.setPreferredSize(new java.awt.Dimension(240, 50));

        cmbbox_createbill_prodnm.setBackground(new java.awt.Color(255, 167, 6));
        cmbbox_createbill_prodnm.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbbox_createbill_prodnm.setMaximumRowCount(5);
        cmbbox_createbill_prodnm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PRODUCT NAME" }));
        cmbbox_createbill_prodnm.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        cmbbox_createbill_prodnm.setMaximumSize(new java.awt.Dimension(150, 50));
        cmbbox_createbill_prodnm.setMinimumSize(new java.awt.Dimension(150, 50));
        cmbbox_createbill_prodnm.setNextFocusableComponent(spin_createbill_quantity);
        cmbbox_createbill_prodnm.setPreferredSize(new java.awt.Dimension(300, 64));
        cmbbox_createbill_prodnm.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                cmbbox_createbill_prodnmItemStateChanged(evt);
            }
        });
        cmbbox_createbill_prodnm.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmbbox_createbill_prodnmActionPerformed(evt);
            }
        });

        txt_createbill_prodid.setEditable(false);
        txt_createbill_prodid.setBackground(new java.awt.Color(150, 195, 248));
        txt_createbill_prodid.setFocusCycleRoot(true);
        txt_createbill_prodid.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_createbill_prodid.setLabelText("PRODUCT ID");
        txt_createbill_prodid.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_createbill_prodid.setNextFocusableComponent(txt_addprod_nm);
        txt_createbill_prodid.setPreferredSize(new java.awt.Dimension(150, 64));

        pnl_calc.setBackground(new java.awt.Color(255, 239, 210));

        lbl_createbill_grosstotal.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_createbill_grosstotal.setText("GROSS TOTAL :");

        lbl_createbill_unpaid.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_createbill_unpaid.setText("UNPAID :");
        lbl_createbill_unpaid.setPreferredSize(new java.awt.Dimension(144, 27));

        lbl_createbill_nettotal.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_createbill_nettotal.setText("NET TOTAL :");
        lbl_createbill_nettotal.setPreferredSize(new java.awt.Dimension(144, 27));

        lbl_grosstotal.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbl_grosstotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_grosstotal.setText("0");
        lbl_grosstotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbl_grosstotal.setPreferredSize(new java.awt.Dimension(130, 27));

        lbl_unpaid.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbl_unpaid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_unpaid.setText("0");
        lbl_unpaid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbl_unpaid.setPreferredSize(new java.awt.Dimension(130, 27));

        lbl_nettotal.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbl_nettotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nettotal.setText("0");
        lbl_nettotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbl_nettotal.setPreferredSize(new java.awt.Dimension(130, 27));

        lbl_tax.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbl_tax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_tax.setText("0");
        lbl_tax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbl_tax.setPreferredSize(new java.awt.Dimension(130, 27));

        lbl_createbill_tax.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_createbill_tax.setText("TAX :");
        lbl_createbill_tax.setMaximumSize(new java.awt.Dimension(144, 27));

        lbl_createbill_discount.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_createbill_discount.setText("DISCOUNT :");
        lbl_createbill_discount.setPreferredSize(new java.awt.Dimension(144, 27));

        lbl_discount.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbl_discount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_discount.setText("0");
        lbl_discount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        lbl_discount.setPreferredSize(new java.awt.Dimension(130, 27));

        javax.swing.GroupLayout pnl_calcLayout = new javax.swing.GroupLayout(pnl_calc);
        pnl_calc.setLayout(pnl_calcLayout);
        pnl_calcLayout.setHorizontalGroup(
            pnl_calcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_calcLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_calcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_calcLayout.createSequentialGroup()
                        .addGroup(pnl_calcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_createbill_nettotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_createbill_unpaid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_createbill_grosstotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_createbill_tax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_calcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_tax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_grosstotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_unpaid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_nettotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnl_calcLayout.createSequentialGroup()
                        .addComponent(lbl_createbill_discount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_discount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_calcLayout.setVerticalGroup(
            pnl_calcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_calcLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnl_calcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_createbill_discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_discount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_calcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_grosstotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_createbill_grosstotal))
                .addGap(18, 18, 18)
                .addGroup(pnl_calcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_createbill_tax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnl_calcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_createbill_unpaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_unpaid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnl_calcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_createbill_nettotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nettotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        table_createbill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String []
            {
                "Custname", "Contact", "Product Name", "Price", "Quantity", "Total"
            }
        ));
        scroll_createbill.setViewportView(table_createbill);

        btn_createbill_add.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_createbill_add.setText("ADD");
        btn_createbill_add.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btn_createbill_add.setkBorderRadius(30);
        btn_createbill_add.setkEndColor(new java.awt.Color(255, 167, 6));
        btn_createbill_add.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_createbill_add.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_createbill_add.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_createbill_add.setkPressedColor(new java.awt.Color(255, 167, 6));
        btn_createbill_add.setkStartColor(new java.awt.Color(255, 167, 6));
        btn_createbill_add.setNextFocusableComponent(btn_createbill_save);
        btn_createbill_add.setOpaque(true);
        btn_createbill_add.setPreferredSize(new java.awt.Dimension(250, 60));
        btn_createbill_add.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_createbill_addFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_createbill_addFocusLost(evt);
            }
        });
        btn_createbill_add.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_createbill_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_createbill_addMouseExited(evt);
            }
        });
        btn_createbill_add.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_createbill_addActionPerformed(evt);
            }
        });
        btn_createbill_add.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_createbill_addKeyPressed(evt);
            }
        });

        txt_createbill_prodprice.setEditable(false);
        txt_createbill_prodprice.setBackground(new java.awt.Color(150, 195, 248));
        txt_createbill_prodprice.setFocusCycleRoot(true);
        txt_createbill_prodprice.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_createbill_prodprice.setLabelText("PRICE");
        txt_createbill_prodprice.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_createbill_prodprice.setPreferredSize(new java.awt.Dimension(140, 64));

        btn_createbill_save.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_createbill_save.setText("SAVE AS PDF");
        btn_createbill_save.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btn_createbill_save.setkBorderRadius(30);
        btn_createbill_save.setkEndColor(new java.awt.Color(255, 167, 6));
        btn_createbill_save.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_createbill_save.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_createbill_save.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_createbill_save.setkPressedColor(new java.awt.Color(255, 167, 6));
        btn_createbill_save.setkStartColor(new java.awt.Color(255, 167, 6));
        btn_createbill_save.setNextFocusableComponent(cmbbox_createbill_custnm);
        btn_createbill_save.setOpaque(true);
        btn_createbill_save.setPreferredSize(new java.awt.Dimension(250, 60));
        btn_createbill_save.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_createbill_saveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_createbill_saveFocusLost(evt);
            }
        });
        btn_createbill_save.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_createbill_saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_createbill_saveMouseExited(evt);
            }
        });
        btn_createbill_save.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_createbill_saveActionPerformed(evt);
            }
        });
        btn_createbill_save.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_createbill_saveKeyPressed(evt);
            }
        });

        txt_createbill_discount.setBackground(new java.awt.Color(150, 195, 248));
        txt_createbill_discount.setFocusCycleRoot(true);
        txt_createbill_discount.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_createbill_discount.setLabelText("DISCOUNT(%)");
        txt_createbill_discount.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_createbill_discount.setNextFocusableComponent(txt_createbill_tax);
        txt_createbill_discount.setPreferredSize(new java.awt.Dimension(151, 64));

        spin_createbill_quantity.setForeground(new java.awt.Color(150, 195, 248));
        spin_createbill_quantity.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        spin_createbill_quantity.setLabelText("QUANTITY");
        spin_createbill_quantity.setNextFocusableComponent(txt_createbill_discount);
        spin_createbill_quantity.setPreferredSize(new java.awt.Dimension(150, 64));
        spin_createbill_quantity.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                spin_createbill_quantityStateChanged(evt);
            }
        });

        txt_createbill_tax.setBackground(new java.awt.Color(150, 195, 248));
        txt_createbill_tax.setFocusCycleRoot(true);
        txt_createbill_tax.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_createbill_tax.setLabelText("TAX(%)");
        txt_createbill_tax.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_createbill_tax.setNextFocusableComponent(txt_createbill_unpaid);
        txt_createbill_tax.setPreferredSize(new java.awt.Dimension(141, 64));

        txt_createbill_unpaid.setBackground(new java.awt.Color(150, 195, 248));
        txt_createbill_unpaid.setFocusCycleRoot(true);
        txt_createbill_unpaid.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_createbill_unpaid.setLabelText("UNPAID AMOUNT");
        txt_createbill_unpaid.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_createbill_unpaid.setNextFocusableComponent(btn_createbill_add);
        txt_createbill_unpaid.setPreferredSize(new java.awt.Dimension(294, 64));
        txt_createbill_unpaid.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txt_createbill_unpaidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_createbillLayout = new javax.swing.GroupLayout(pnl_createbill);
        pnl_createbill.setLayout(pnl_createbillLayout);
        pnl_createbillLayout.setHorizontalGroup(
            pnl_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_createbillLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_createbillLayout.createSequentialGroup()
                        .addGroup(pnl_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_createbill_custdet, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_createbill_proddet, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_createbillLayout.createSequentialGroup()
                        .addGroup(pnl_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_createbillLayout.createSequentialGroup()
                                .addGroup(pnl_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_createbillLayout.createSequentialGroup()
                                        .addComponent(cmbbox_createbill_prodnm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_createbill_prodid, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(scroll_createbill))
                                .addGap(18, 18, 18)
                                .addGroup(pnl_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btn_createbill_add, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_createbill_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_createbill_unpaid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnl_createbillLayout.createSequentialGroup()
                                        .addComponent(txt_createbill_prodprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(spin_createbill_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(pnl_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pnl_calc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnl_createbillLayout.createSequentialGroup()
                                        .addComponent(txt_createbill_discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_createbill_tax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(pnl_createbillLayout.createSequentialGroup()
                                .addComponent(cmbbox_createbill_custnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_createbill_custid, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_createbill_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_createbill_addr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1)
                            .addGroup(pnl_createbillLayout.createSequentialGroup()
                                .addComponent(lbl_billno, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_billno_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(10, 10, 10))))
        );
        pnl_createbillLayout.setVerticalGroup(
            pnl_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_createbillLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(pnl_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_billno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_billno_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_createbill_custdet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnl_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbbox_createbill_custnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_createbill_custid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_createbill_addr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_createbill_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lbl_createbill_proddet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnl_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmbbox_createbill_prodnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnl_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_createbill_discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_createbill_tax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_createbill_prodid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_createbill_prodprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(spin_createbill_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnl_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_createbillLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(scroll_createbill, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(pnl_createbillLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnl_createbillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnl_calc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnl_createbillLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(txt_createbill_unpaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn_createbill_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_createbill_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 21, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        pnl_modifybill.setkBorderRadius(40);
        pnl_modifybill.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_modifybill.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_modifybill.setOpaque(false);
        pnl_modifybill.setPreferredSize(new java.awt.Dimension(1108, 672));

        lbl_modifybill_prodlisting.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_modifybill_prodlisting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_modifybill_prodlisting.setText("MODIFY BILL :");
        lbl_modifybill_prodlisting.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbl_modifybill_prodlisting.setPreferredSize(new java.awt.Dimension(240, 50));

        cmbbox_modifybill_prodid.setBackground(new java.awt.Color(255, 167, 6));
        cmbbox_modifybill_prodid.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbbox_modifybill_prodid.setMaximumRowCount(5);
        cmbbox_modifybill_prodid.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));
        cmbbox_modifybill_prodid.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        cmbbox_modifybill_prodid.setMaximumSize(new java.awt.Dimension(150, 50));
        cmbbox_modifybill_prodid.setMinimumSize(new java.awt.Dimension(150, 50));
        cmbbox_modifybill_prodid.setNextFocusableComponent(txt_createbill_custid);
        cmbbox_modifybill_prodid.setPreferredSize(new java.awt.Dimension(150, 64));
        cmbbox_modifybill_prodid.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmbbox_modifybill_prodidActionPerformed(evt);
            }
        });

        txt_modifybill_prodnm.setEditable(false);
        txt_modifybill_prodnm.setBackground(new java.awt.Color(150, 195, 248));
        txt_modifybill_prodnm.setEnabled(false);
        txt_modifybill_prodnm.setFocusCycleRoot(true);
        txt_modifybill_prodnm.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_modifybill_prodnm.setLabelText("PRODUCT NAME");
        txt_modifybill_prodnm.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_modifybill_prodnm.setNextFocusableComponent(txt_addprod_nm);
        txt_modifybill_prodnm.setPreferredSize(new java.awt.Dimension(300, 64));

        txt_modifybill_prodprice.setEditable(false);
        txt_modifybill_prodprice.setBackground(new java.awt.Color(150, 195, 248));
        txt_modifybill_prodprice.setEnabled(false);
        txt_modifybill_prodprice.setFocusCycleRoot(true);
        txt_modifybill_prodprice.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_modifybill_prodprice.setLabelText("PRICE");
        txt_modifybill_prodprice.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_modifybill_prodprice.setPreferredSize(new java.awt.Dimension(140, 64));

        spin_modifybill_quantity.setForeground(new java.awt.Color(150, 195, 248));
        spin_modifybill_quantity.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        spin_modifybill_quantity.setLabelText("QUANTITY");
        spin_modifybill_quantity.setPreferredSize(new java.awt.Dimension(150, 64));

        txt_modifybill_discount.setBackground(new java.awt.Color(150, 195, 248));
        txt_modifybill_discount.setFocusCycleRoot(true);
        txt_modifybill_discount.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_modifybill_discount.setLabelText("DISCOUNT(%)");
        txt_modifybill_discount.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_modifybill_discount.setPreferredSize(new java.awt.Dimension(151, 64));

        txt_modifybill_tax.setBackground(new java.awt.Color(150, 195, 248));
        txt_modifybill_tax.setFocusCycleRoot(true);
        txt_modifybill_tax.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_modifybill_tax.setLabelText("TAX(%)");
        txt_modifybill_tax.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_modifybill_tax.setPreferredSize(new java.awt.Dimension(105, 64));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String []
            {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout pnl_modifybillLayout = new javax.swing.GroupLayout(pnl_modifybill);
        pnl_modifybill.setLayout(pnl_modifybillLayout);
        pnl_modifybillLayout.setHorizontalGroup(
            pnl_modifybillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_modifybillLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnl_modifybillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_modifybill_prodlisting, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_modifybillLayout.createSequentialGroup()
                        .addComponent(cmbbox_modifybill_prodid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_modifybill_prodnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_modifybill_prodprice, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(spin_modifybill_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_modifybill_discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_modifybill_tax, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnl_modifybillLayout.setVerticalGroup(
            pnl_modifybillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_modifybillLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lbl_modifybill_prodlisting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnl_modifybillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_modifybillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmbbox_modifybill_prodid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnl_modifybillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_modifybillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_modifybill_discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_modifybill_tax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_modifybillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_modifybill_prodnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_modifybill_prodprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(spin_modifybill_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pnl_bill_tab3.setkBorderRadius(40);
        pnl_bill_tab3.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_bill_tab3.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_bill_tab3.setOpaque(false);
        pnl_bill_tab3.setPreferredSize(new java.awt.Dimension(1108, 672));

        javax.swing.GroupLayout pnl_bill_tab3Layout = new javax.swing.GroupLayout(pnl_bill_tab3);
        pnl_bill_tab3.setLayout(pnl_bill_tab3Layout);
        pnl_bill_tab3Layout.setHorizontalGroup(
            pnl_bill_tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1108, Short.MAX_VALUE)
        );
        pnl_bill_tab3Layout.setVerticalGroup(
            pnl_bill_tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_bill_mainLayout = new javax.swing.GroupLayout(pnl_bill_main);
        pnl_bill_main.setLayout(pnl_bill_mainLayout);
        pnl_bill_mainLayout.setHorizontalGroup(
            pnl_bill_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1108, Short.MAX_VALUE)
            .addGroup(pnl_bill_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_createbill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_bill_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_modifybill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_bill_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_bill_tab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_bill_mainLayout.setVerticalGroup(
            pnl_bill_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
            .addGroup(pnl_bill_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_createbill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_bill_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_modifybill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_bill_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_bill_tab3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_billLayout = new javax.swing.GroupLayout(panel_bill);
        panel_bill.setLayout(panel_billLayout);
        panel_billLayout.setHorizontalGroup(
            panel_billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_billLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_bill_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_bill_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_billLayout.setVerticalGroup(
            panel_billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_billLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pnl_bill_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnl_bill_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_account.setkBorderRadius(40);
        panel_account.setkEndColor(new java.awt.Color(150, 195, 248));
        panel_account.setkStartColor(new java.awt.Color(150, 195, 248));
        panel_account.setOpaque(false);

        pnl_account_menubar.setkBorderRadius(20);
        pnl_account_menubar.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl_account_menubar.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl_account_menubar.setOpaque(false);
        pnl_account_menubar.setPreferredSize(new java.awt.Dimension(1108, 60));

        pnl_accsetting_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl_accsetting_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl_accsetting_menu.setOpaque(false);
        pnl_accsetting_menu.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_accsetting_menu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_accsetting_menu.setText("SETTING");
        btn_accsetting_menu.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_accsetting_menu.setkBorderRadius(20);
        btn_accsetting_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_accsetting_menu.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_accsetting_menu.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_accsetting_menu.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_accsetting_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_accsetting_menu.setNextFocusableComponent(btn_acc_menu2);
        btn_accsetting_menu.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_accsetting_menu.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_accsetting_menuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_accsetting_menuFocusLost(evt);
            }
        });
        btn_accsetting_menu.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_accsetting_menuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_accsetting_menuMouseExited(evt);
            }
        });
        btn_accsetting_menu.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_accsetting_menuActionPerformed(evt);
            }
        });
        btn_accsetting_menu.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_accsetting_menuKeyPressed(evt);
            }
        });

        lid_accsetting.setBackground(new java.awt.Color(225, 223, 223));
        lid_accsetting.setkBorderRadius(15);
        lid_accsetting.setkEndColor(new java.awt.Color(211, 211, 211));
        lid_accsetting.setkStartColor(new java.awt.Color(211, 211, 211));
        lid_accsetting.setOpaque(false);
        lid_accsetting.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid_accsettingLayout = new javax.swing.GroupLayout(lid_accsetting);
        lid_accsetting.setLayout(lid_accsettingLayout);
        lid_accsettingLayout.setHorizontalGroup(
            lid_accsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid_accsettingLayout.setVerticalGroup(
            lid_accsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_accsetting_menuLayout = new javax.swing.GroupLayout(pnl_accsetting_menu);
        pnl_accsetting_menu.setLayout(pnl_accsetting_menuLayout);
        pnl_accsetting_menuLayout.setHorizontalGroup(
            pnl_accsetting_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_accsetting_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_accsetting_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid_accsetting, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_accsetting_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_accsetting_menuLayout.setVerticalGroup(
            pnl_accsetting_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_accsetting_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_accsetting_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid_accsetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnl_acc_menu2.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl_acc_menu2.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl_acc_menu2.setOpaque(false);
        pnl_acc_menu2.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_acc_menu2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_acc_menu2.setText("TAB 2");
        btn_acc_menu2.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_acc_menu2.setkBorderRadius(20);
        btn_acc_menu2.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_acc_menu2.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_acc_menu2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_acc_menu2.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_acc_menu2.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_acc_menu2.setNextFocusableComponent(btn_acc_menu3);
        btn_acc_menu2.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_acc_menu2.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_acc_menu2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_acc_menu2FocusLost(evt);
            }
        });
        btn_acc_menu2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_acc_menu2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_acc_menu2MouseExited(evt);
            }
        });
        btn_acc_menu2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_acc_menu2ActionPerformed(evt);
            }
        });
        btn_acc_menu2.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_acc_menu2KeyPressed(evt);
            }
        });

        lid_acc_menu2.setBackground(new java.awt.Color(225, 223, 223));
        lid_acc_menu2.setkBorderRadius(15);
        lid_acc_menu2.setkEndColor(new java.awt.Color(211, 211, 211));
        lid_acc_menu2.setkStartColor(new java.awt.Color(211, 211, 211));
        lid_acc_menu2.setOpaque(false);
        lid_acc_menu2.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid_acc_menu2Layout = new javax.swing.GroupLayout(lid_acc_menu2);
        lid_acc_menu2.setLayout(lid_acc_menu2Layout);
        lid_acc_menu2Layout.setHorizontalGroup(
            lid_acc_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid_acc_menu2Layout.setVerticalGroup(
            lid_acc_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_acc_menu2Layout = new javax.swing.GroupLayout(pnl_acc_menu2);
        pnl_acc_menu2.setLayout(pnl_acc_menu2Layout);
        pnl_acc_menu2Layout.setHorizontalGroup(
            pnl_acc_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_acc_menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_acc_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid_acc_menu2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_acc_menu2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_acc_menu2Layout.setVerticalGroup(
            pnl_acc_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_acc_menu2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_acc_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid_acc_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl_acc_menu3.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl_acc_menu3.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl_acc_menu3.setOpaque(false);
        pnl_acc_menu3.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_acc_menu3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_acc_menu3.setText("TAB 3");
        btn_acc_menu3.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_acc_menu3.setkBorderRadius(20);
        btn_acc_menu3.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_acc_menu3.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_acc_menu3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_acc_menu3.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_acc_menu3.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_acc_menu3.setNextFocusableComponent(btn_accsetting_menu);
        btn_acc_menu3.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_acc_menu3.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_acc_menu3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_acc_menu3FocusLost(evt);
            }
        });
        btn_acc_menu3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_acc_menu3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_acc_menu3MouseExited(evt);
            }
        });
        btn_acc_menu3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_acc_menu3ActionPerformed(evt);
            }
        });
        btn_acc_menu3.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_acc_menu3KeyPressed(evt);
            }
        });

        lid_acc_menu3.setBackground(new java.awt.Color(225, 223, 223));
        lid_acc_menu3.setkBorderRadius(15);
        lid_acc_menu3.setkEndColor(new java.awt.Color(211, 211, 211));
        lid_acc_menu3.setkStartColor(new java.awt.Color(211, 211, 211));
        lid_acc_menu3.setOpaque(false);
        lid_acc_menu3.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid_acc_menu3Layout = new javax.swing.GroupLayout(lid_acc_menu3);
        lid_acc_menu3.setLayout(lid_acc_menu3Layout);
        lid_acc_menu3Layout.setHorizontalGroup(
            lid_acc_menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid_acc_menu3Layout.setVerticalGroup(
            lid_acc_menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_acc_menu3Layout = new javax.swing.GroupLayout(pnl_acc_menu3);
        pnl_acc_menu3.setLayout(pnl_acc_menu3Layout);
        pnl_acc_menu3Layout.setHorizontalGroup(
            pnl_acc_menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_acc_menu3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_acc_menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid_acc_menu3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_acc_menu3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_acc_menu3Layout.setVerticalGroup(
            pnl_acc_menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_acc_menu3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_acc_menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid_acc_menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnl_account_menubarLayout = new javax.swing.GroupLayout(pnl_account_menubar);
        pnl_account_menubar.setLayout(pnl_account_menubarLayout);
        pnl_account_menubarLayout.setHorizontalGroup(
            pnl_account_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_account_menubarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pnl_accsetting_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_acc_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(pnl_acc_menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(418, Short.MAX_VALUE))
        );
        pnl_account_menubarLayout.setVerticalGroup(
            pnl_account_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_account_menubarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_account_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_accsetting_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(pnl_acc_menu3, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(pnl_acc_menu2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))
        );

        pnl_account_main.setkBorderRadius(40);
        pnl_account_main.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_account_main.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_account_main.setOpaque(false);
        pnl_account_main.setPreferredSize(new java.awt.Dimension(1108, 672));

        pnl_accsetting.setkBorderRadius(40);
        pnl_accsetting.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_accsetting.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_accsetting.setOpaque(false);
        pnl_accsetting.setPreferredSize(new java.awt.Dimension(1108, 672));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("PANEL 4 Tab 1");

        javax.swing.GroupLayout pnl_accsettingLayout = new javax.swing.GroupLayout(pnl_accsetting);
        pnl_accsetting.setLayout(pnl_accsettingLayout);
        pnl_accsettingLayout.setHorizontalGroup(
            pnl_accsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1108, Short.MAX_VALUE)
            .addGroup(pnl_accsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_accsettingLayout.createSequentialGroup()
                    .addGap(404, 404, 404)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(404, Short.MAX_VALUE)))
        );
        pnl_accsettingLayout.setVerticalGroup(
            pnl_accsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
            .addGroup(pnl_accsettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_accsettingLayout.createSequentialGroup()
                    .addGap(311, 311, 311)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(311, Short.MAX_VALUE)))
        );

        pnl_acc_tab2.setkBorderRadius(40);
        pnl_acc_tab2.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_acc_tab2.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_acc_tab2.setOpaque(false);
        pnl_acc_tab2.setPreferredSize(new java.awt.Dimension(1108, 672));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("PANEL 4 Tab 2");

        txtarea_format.setEditable(false);
        txtarea_format.setColumns(20);
        txtarea_format.setRows(5);
        jScrollPane2.setViewportView(txtarea_format);

        javax.swing.GroupLayout pnl_acc_tab2Layout = new javax.swing.GroupLayout(pnl_acc_tab2);
        pnl_acc_tab2.setLayout(pnl_acc_tab2Layout);
        pnl_acc_tab2Layout.setHorizontalGroup(
            pnl_acc_tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_acc_tab2Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(537, Short.MAX_VALUE))
            .addGroup(pnl_acc_tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_acc_tab2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnl_acc_tab2Layout.setVerticalGroup(
            pnl_acc_tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_acc_tab2Layout.createSequentialGroup()
                .addContainerGap(435, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
            .addGroup(pnl_acc_tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_acc_tab2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pnl_acc_tab3.setkBorderRadius(40);
        pnl_acc_tab3.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_acc_tab3.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_acc_tab3.setOpaque(false);
        pnl_acc_tab3.setPreferredSize(new java.awt.Dimension(1108, 672));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("PANEL 4 Tab 3");

        javax.swing.GroupLayout pnl_acc_tab3Layout = new javax.swing.GroupLayout(pnl_acc_tab3);
        pnl_acc_tab3.setLayout(pnl_acc_tab3Layout);
        pnl_acc_tab3Layout.setHorizontalGroup(
            pnl_acc_tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1108, Short.MAX_VALUE)
            .addGroup(pnl_acc_tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_acc_tab3Layout.createSequentialGroup()
                    .addGap(404, 404, 404)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(404, Short.MAX_VALUE)))
        );
        pnl_acc_tab3Layout.setVerticalGroup(
            pnl_acc_tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
            .addGroup(pnl_acc_tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_acc_tab3Layout.createSequentialGroup()
                    .addGap(311, 311, 311)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(311, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pnl_account_mainLayout = new javax.swing.GroupLayout(pnl_account_main);
        pnl_account_main.setLayout(pnl_account_mainLayout);
        pnl_account_mainLayout.setHorizontalGroup(
            pnl_account_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnl_account_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_accsetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_account_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_acc_tab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_account_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_acc_tab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_account_mainLayout.setVerticalGroup(
            pnl_account_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
            .addGroup(pnl_account_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_accsetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_account_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_acc_tab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_account_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_acc_tab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_accountLayout = new javax.swing.GroupLayout(panel_account);
        panel_account.setLayout(panel_accountLayout);
        panel_accountLayout.setHorizontalGroup(
            panel_accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_accountLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_account_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_account_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_accountLayout.setVerticalGroup(
            panel_accountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_accountLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pnl_account_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnl_account_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_dash_mainLayout = new javax.swing.GroupLayout(panel_dash_main);
        panel_dash_main.setLayout(panel_dash_mainLayout);
        panel_dash_mainLayout.setHorizontalGroup(
            panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dash_mainLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addGroup(panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_employee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_account, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_bill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_customer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_dash_mainLayout.setVerticalGroup(
            panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dash_mainLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addGroup(panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_account, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_bill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_product, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_customer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_dashboardLayout = new javax.swing.GroupLayout(panel_dashboard);
        panel_dashboard.setLayout(panel_dashboardLayout);
        panel_dashboardLayout.setHorizontalGroup(
            panel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dashboardLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(panel_dash_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(panel_dash_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        panel_dashboardLayout.setVerticalGroup(
            panel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dashboardLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(panel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_dash_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_dash_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout panel_bgLayout = new javax.swing.GroupLayout(panel_bg);
        panel_bg.setLayout(panel_bgLayout);
        panel_bgLayout.setHorizontalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bgLayout.createSequentialGroup()
                .addComponent(panel_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_bgLayout.createSequentialGroup()
                    .addComponent(panel_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_bgLayout.createSequentialGroup()
                    .addComponent(panel_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panel_bgLayout.setVerticalGroup(
            panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bgLayout.createSequentialGroup()
                .addComponent(panel_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(980, Short.MAX_VALUE))
            .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bgLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(panel_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(panel_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bgLayout.createSequentialGroup()
                    .addGap(0, 40, Short.MAX_VALUE)
                    .addComponent(panel_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(panel_bg, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_closeMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_closeMouseEntered
    {//GEN-HEADEREND:event_lbl_closeMouseEntered
        hover(pnl_close, Color.red);
    }//GEN-LAST:event_lbl_closeMouseEntered

    private void lbl_closeMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_closeMouseExited
    {//GEN-HEADEREND:event_lbl_closeMouseExited
        hover(pnl_close, new Color(150, 195, 248));
    }//GEN-LAST:event_lbl_closeMouseExited

    private void lbl_minimizeMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_minimizeMouseEntered
    {//GEN-HEADEREND:event_lbl_minimizeMouseEntered
        hover(pnl_minimize, new Color(153, 153, 153));
    }//GEN-LAST:event_lbl_minimizeMouseEntered

    private void lbl_minimizeMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_minimizeMouseExited
    {//GEN-HEADEREND:event_lbl_minimizeMouseExited
        hover(pnl_minimize, new Color(150, 195, 248));
    }//GEN-LAST:event_lbl_minimizeMouseExited

    private void lbl_closeMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_closeMouseClicked
    {//GEN-HEADEREND:event_lbl_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_closeMouseClicked

    private void lbl_minimizeMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_minimizeMouseClicked
    {//GEN-HEADEREND:event_lbl_minimizeMouseClicked
        this.setExtendedState(NewJFrame.ICONIFIED);
    }//GEN-LAST:event_lbl_minimizeMouseClicked

    private void cmbbox_login_usrnmActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmbbox_login_usrnmActionPerformed
    {//GEN-HEADEREND:event_cmbbox_login_usrnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbbox_login_usrnmActionPerformed

    private void lbl_forgot_pswdMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_forgot_pswdMouseEntered
    {//GEN-HEADEREND:event_lbl_forgot_pswdMouseEntered
        lbl_forgot_pswd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbl_forgot_pswdMouseEntered

    private void btnCustomerMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnCustomerMouseEntered
    {//GEN-HEADEREND:event_btnCustomerMouseEntered
        btnCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnCustomerMouseEntered

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_loginActionPerformed
    {//GEN-HEADEREND:event_btn_loginActionPerformed
        panel_login.setVisible(false);
        panel_dashboard.setVisible(true);
        visibility(true, false, false, false, false, false, btnCustomer);

        try
        {
            con = dbconnection.getdbConnection();
            query = "select nm from employee where usrnm like '" + cmbbox_login_usrnm.getSelectedItem().toString() + "'";
            st = con.createStatement();
            result = st.executeQuery(query);
            result.next();
            lbl_dash_usr.setText(result.getString("nm"));

            if (lbl_dash_usr.getText().equals("ADMIN"))
            {
                btnEmployee.setEnabled(true);
            }
            else
            {
                btnEmployee.setEnabled(false);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btnEmployeeMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnEmployeeMouseEntered
    {//GEN-HEADEREND:event_btnEmployeeMouseEntered
        btnEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnEmployeeMouseEntered

    private void btnProductMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnProductMouseEntered
    {//GEN-HEADEREND:event_btnProductMouseEntered
        btnProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnProductMouseEntered

    private void btnBillMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnBillMouseEntered
    {//GEN-HEADEREND:event_btnBillMouseEntered
        btnBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnBillMouseEntered

    private void btnaccountMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnaccountMouseEntered
    {//GEN-HEADEREND:event_btnaccountMouseEntered
        btnaccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnaccountMouseEntered

    private void btn_loginFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_loginFocusGained
    {//GEN-HEADEREND:event_btn_loginFocusGained
        hover(btn_login, new Color(1, 109, 218), Color.black);
    }//GEN-LAST:event_btn_loginFocusGained

    private void btn_loginFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_loginFocusLost
    {//GEN-HEADEREND:event_btn_loginFocusLost
        hover(btn_login, new Color(255, 167, 6), Color.white);
    }//GEN-LAST:event_btn_loginFocusLost

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCustomerActionPerformed
    {//GEN-HEADEREND:event_btnCustomerActionPerformed
        visibility(false, true, false, false, false, false, btn_addcust_menu);
        visibility(pnl_add_cust, pnl_edit_cust, pnl_cust_det);
        onIndicator(lid_add_cust, lid_edit_cust, lid_cust_det);
        txt_addcust_id.setText(getMaxID("customer"));

        txt_addcust_id.grabFocus();
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btn_loginMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_loginMouseEntered
    {//GEN-HEADEREND:event_btn_loginMouseEntered
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_loginMouseEntered

    private void btn_loginKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_loginKeyPressed
    {//GEN-HEADEREND:event_btn_loginKeyPressed
        int code = evt.getKeyCode();
        if (code == KeyEvent.VK_ENTER)
        {
            panel_login.setVisible(false);
            panel_dashboard.setVisible(true);
            lbl_dash_usr.setText(cmbbox_login_usrnm.getSelectedItem().toString());
            lbl_dash_welcome.grabFocus();
            visibility(true, false, false, false, false, false, btnCustomer);
        }
    }//GEN-LAST:event_btn_loginKeyPressed

    private void btnCustomerFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btnCustomerFocusGained
    {//GEN-HEADEREND:event_btnCustomerFocusGained
        hover(btnCustomer, new Color(1, 109, 218), Color.black);
    }//GEN-LAST:event_btnCustomerFocusGained

    private void btnCustomerFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btnCustomerFocusLost
    {//GEN-HEADEREND:event_btnCustomerFocusLost
        hover(btnCustomer, new Color(255, 167, 6), Color.white);
    }//GEN-LAST:event_btnCustomerFocusLost

    private void btnEmployeeFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btnEmployeeFocusGained
    {//GEN-HEADEREND:event_btnEmployeeFocusGained
        hover(btnEmployee, new Color(1, 109, 218), Color.black);
    }//GEN-LAST:event_btnEmployeeFocusGained

    private void btnEmployeeFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btnEmployeeFocusLost
    {//GEN-HEADEREND:event_btnEmployeeFocusLost
        hover(btnEmployee, new Color(255, 167, 6), Color.white);
    }//GEN-LAST:event_btnEmployeeFocusLost

    private void btnProductFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btnProductFocusGained
    {//GEN-HEADEREND:event_btnProductFocusGained
        hover(btnProduct, new Color(1, 109, 218), Color.black);
    }//GEN-LAST:event_btnProductFocusGained

    private void btnProductFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btnProductFocusLost
    {//GEN-HEADEREND:event_btnProductFocusLost
        hover(btnProduct, new Color(255, 167, 6), Color.white);
    }//GEN-LAST:event_btnProductFocusLost

    private void btnBillFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btnBillFocusGained
    {//GEN-HEADEREND:event_btnBillFocusGained
        hover(btnBill, new Color(1, 109, 218), Color.black);
    }//GEN-LAST:event_btnBillFocusGained

    private void btnBillFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btnBillFocusLost
    {//GEN-HEADEREND:event_btnBillFocusLost
        hover(btnBill, new Color(255, 167, 6), Color.white);
    }//GEN-LAST:event_btnBillFocusLost

    private void btnaccountFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btnaccountFocusGained
    {//GEN-HEADEREND:event_btnaccountFocusGained
        hover(btnaccount, new Color(1, 109, 218), Color.black);
    }//GEN-LAST:event_btnaccountFocusGained

    private void btnaccountFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btnaccountFocusLost
    {//GEN-HEADEREND:event_btnaccountFocusLost
        hover(btnaccount, new Color(255, 167, 6), Color.white);
    }//GEN-LAST:event_btnaccountFocusLost

    private void btnCustomerKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnCustomerKeyPressed
    {//GEN-HEADEREND:event_btnCustomerKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(false, true, false, false, false, false, btn_addcust_menu);
            visibility(pnl_add_cust, pnl_edit_cust, pnl_cust_det);
            onIndicator(lid_add_cust, lid_edit_cust, lid_cust_det);
            txt_addcust_id.setText(getMaxID("customer"));
            txt_addcust_id.grabFocus();
        }
    }//GEN-LAST:event_btnCustomerKeyPressed

    private void btnEmployeeKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnEmployeeKeyPressed
    {//GEN-HEADEREND:event_btnEmployeeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(false, false, true, false, false, false, btn_addemp_menu);
            visibility(pnl_add_emp, pnl_edit_emp, pnl_emp_det);
            onIndicator(lid_add_emp, lid_edit_emp, lid_emp_det);
            txt_addemp_id.setText(getMaxID("employee"));
        }
    }//GEN-LAST:event_btnEmployeeKeyPressed

    private void btnProductKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnProductKeyPressed
    {//GEN-HEADEREND:event_btnProductKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(false, false, false, true, false, false, btn_addprod_menu);
            visibility(pnl_add_prod, pnl_edit_prod, pnl_prod_det);
            onIndicator(lid_addprod, lid_editprod, lid_proddet);
            txt_addprod_id.setText(getMaxID("product"));
            btn_addprod_menu.grabFocus();
        }
    }//GEN-LAST:event_btnProductKeyPressed

    private void btnBillKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnBillKeyPressed
    {//GEN-HEADEREND:event_btnBillKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(false, false, false, false, true, false, btn_createbill_menu);
            visibility(pnl_createbill, pnl_modifybill, pnl_bill_tab3);
            onIndicator(lid_createbill, lid_modifybill);
            fillCombobox("customer", "custnm", cmbbox_createbill_custnm);
            fillCombobox("product", "nm", cmbbox_createbill_prodnm);
        }
    }//GEN-LAST:event_btnBillKeyPressed

    private void btnaccountKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnaccountKeyPressed
    {//GEN-HEADEREND:event_btnaccountKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(false, false, false, false, false, true, btn_accsetting_menu);
            visibility(pnl_accsetting, pnl_acc_tab2, pnl_acc_tab3);
            onIndicator(lid_accsetting, lid_acc_menu2, lid_acc_menu3);
        }
    }//GEN-LAST:event_btnaccountKeyPressed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEmployeeActionPerformed
    {//GEN-HEADEREND:event_btnEmployeeActionPerformed
        visibility(false, false, true, false, false, false, btn_addemp_menu);
        visibility(pnl_add_emp, pnl_edit_emp, pnl_emp_det);
        onIndicator(lid_add_emp, lid_edit_emp, lid_emp_det);
        txt_addemp_id.setText(getMaxID("employee"));
        txt_addemp_id.grabFocus();
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnProductActionPerformed
    {//GEN-HEADEREND:event_btnProductActionPerformed
        visibility(false, false, false, true, false, false, btn_addprod_menu);
        visibility(pnl_add_prod, pnl_edit_prod, pnl_prod_det);
        onIndicator(lid_addprod, lid_editprod, lid_proddet);
        txt_addprod_id.setText(getMaxID("product"));
        btn_addprod_menu.grabFocus();
    }//GEN-LAST:event_btnProductActionPerformed

    private void btnaccountActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnaccountActionPerformed
    {//GEN-HEADEREND:event_btnaccountActionPerformed
        visibility(false, false, false, false, false, true, btn_accsetting_menu);
        visibility(pnl_accsetting, pnl_acc_tab2, pnl_acc_tab3);
        onIndicator(lid_accsetting, lid_acc_menu2, lid_acc_menu3);
    }//GEN-LAST:event_btnaccountActionPerformed

    private void lbl_dash_usrMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_dash_usrMouseClicked
    {//GEN-HEADEREND:event_lbl_dash_usrMouseClicked
        panel_dashboard.setVisible(false);
        panel_login.setVisible(true);
    }//GEN-LAST:event_lbl_dash_usrMouseClicked

    private void lbl_dash_welcomeMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_dash_welcomeMouseClicked
    {//GEN-HEADEREND:event_lbl_dash_welcomeMouseClicked
        visibility(true, false, false, false, false, false, btn_login);
    }//GEN-LAST:event_lbl_dash_welcomeMouseClicked

    private void btn_addcust_menuMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_addcust_menuMouseEntered
    {//GEN-HEADEREND:event_btn_addcust_menuMouseEntered
//        lid1.setkStartColor(new Color(1, 109, 218));
//        lid1.setkEndColor(new Color(1, 109, 218));
//        lid1.setBackground(Color.black);

        btn_addcust_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    }//GEN-LAST:event_btn_addcust_menuMouseEntered

    private void btn_addcust_menuMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_addcust_menuMouseExited
    {//GEN-HEADEREND:event_btn_addcust_menuMouseExited
//        lid1.setkStartColor(new Color(211, 211, 211));
//        lid1.setkEndColor(new Color(211, 211, 211));
//        lid1.setBackground(Color.white);

//        kButton1.setkStartColor(new Color(255, 203, 109));
//        kButton1.setkEndColor(new Color(255, 203, 109));
//        kButton1.setBackground(Color.white);
    }//GEN-LAST:event_btn_addcust_menuMouseExited

    private void btn_editcust_menuMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_editcust_menuMouseEntered
    {//GEN-HEADEREND:event_btn_editcust_menuMouseEntered
        btn_editcust_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_editcust_menuMouseEntered

    private void btn_editcust_menuMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_editcust_menuMouseExited
    {//GEN-HEADEREND:event_btn_editcust_menuMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editcust_menuMouseExited

    private void btn_custdet_menuMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_custdet_menuMouseEntered
    {//GEN-HEADEREND:event_btn_custdet_menuMouseEntered
        btn_custdet_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_custdet_menuMouseEntered

    private void btn_custdet_menuMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_custdet_menuMouseExited
    {//GEN-HEADEREND:event_btn_custdet_menuMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_custdet_menuMouseExited

    private void btnCustomerMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnCustomerMouseExited
    {//GEN-HEADEREND:event_btnCustomerMouseExited

    }//GEN-LAST:event_btnCustomerMouseExited

    private void btn_addcust_menuFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_addcust_menuFocusGained
    {//GEN-HEADEREND:event_btn_addcust_menuFocusGained
        hover(btn_addcust_menu, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_addcust_menuFocusGained

    private void btn_addcust_menuFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_addcust_menuFocusLost
    {//GEN-HEADEREND:event_btn_addcust_menuFocusLost
        hover(btn_addcust_menu, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_addcust_menuFocusLost

    private void btn_editcust_menuFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_editcust_menuFocusGained
    {//GEN-HEADEREND:event_btn_editcust_menuFocusGained
        hover(btn_editcust_menu, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_editcust_menuFocusGained

    private void btn_editcust_menuFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_editcust_menuFocusLost
    {//GEN-HEADEREND:event_btn_editcust_menuFocusLost
        hover(btn_editcust_menu, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_editcust_menuFocusLost

    private void btn_custdet_menuFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_custdet_menuFocusGained
    {//GEN-HEADEREND:event_btn_custdet_menuFocusGained
        hover(btn_custdet_menu, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_custdet_menuFocusGained

    private void btn_custdet_menuFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_custdet_menuFocusLost
    {//GEN-HEADEREND:event_btn_custdet_menuFocusLost
        hover(btn_custdet_menu, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_custdet_menuFocusLost

    private void btn_addcust_menuKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_addcust_menuKeyPressed
    {//GEN-HEADEREND:event_btn_addcust_menuKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btnCustomer.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(pnl_add_cust, pnl_edit_cust, pnl_cust_det);
            onIndicator(lid_add_cust, lid_edit_cust, lid_cust_det);
            txt_addcust_id.setText(getMaxID("customer"));
            txt_addcust_id.grabFocus();
        }
    }//GEN-LAST:event_btn_addcust_menuKeyPressed

    private void btn_editcust_menuKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_editcust_menuKeyPressed
    {//GEN-HEADEREND:event_btn_editcust_menuKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btnCustomer.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(pnl_edit_cust, pnl_add_cust, pnl_cust_det);
            onIndicator(lid_edit_cust, lid_add_cust, lid_cust_det);
            bindCustomerTableData(table_editcust);
            txt_editcust_id.grabFocus();
        }
    }//GEN-LAST:event_btn_editcust_menuKeyPressed

    private void btn_custdet_menuKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_custdet_menuKeyPressed
    {//GEN-HEADEREND:event_btn_custdet_menuKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btnCustomer.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(pnl_cust_det, pnl_add_cust, pnl_edit_cust);
            onIndicator(lid_cust_det, lid_add_cust, lid_edit_cust);
            bindCustomerTableData(table_custdet);
            txt_custdet_custnm.grabFocus();
        }
    }//GEN-LAST:event_btn_custdet_menuKeyPressed

    private void btn_addemp_menuFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_addemp_menuFocusGained
    {//GEN-HEADEREND:event_btn_addemp_menuFocusGained
        hover(btn_addemp_menu, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_addemp_menuFocusGained

    private void btn_addemp_menuFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_addemp_menuFocusLost
    {//GEN-HEADEREND:event_btn_addemp_menuFocusLost
        hover(btn_addemp_menu, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_addemp_menuFocusLost

    private void btn_addemp_menuMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_addemp_menuMouseEntered
    {//GEN-HEADEREND:event_btn_addemp_menuMouseEntered
        btn_addemp_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_addemp_menuMouseEntered

    private void btn_addemp_menuMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_addemp_menuMouseExited
    {//GEN-HEADEREND:event_btn_addemp_menuMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addemp_menuMouseExited

    private void btn_addemp_menuKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_addemp_menuKeyPressed
    {//GEN-HEADEREND:event_btn_addemp_menuKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btnEmployee.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(pnl_add_emp, pnl_edit_emp, pnl_emp_det);
            onIndicator(lid_add_emp, lid_edit_emp, lid_emp_det);
            txt_addemp_id.setText(getMaxID("employee"));
            txt_addemp_id.grabFocus();
        }
    }//GEN-LAST:event_btn_addemp_menuKeyPressed

    private void btn_editemp_menuFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_editemp_menuFocusGained
    {//GEN-HEADEREND:event_btn_editemp_menuFocusGained
        hover(btn_editemp_menu, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_editemp_menuFocusGained

    private void btn_editemp_menuFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_editemp_menuFocusLost
    {//GEN-HEADEREND:event_btn_editemp_menuFocusLost
        hover(btn_editemp_menu, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_editemp_menuFocusLost

    private void btn_editemp_menuMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_editemp_menuMouseEntered
    {//GEN-HEADEREND:event_btn_editemp_menuMouseEntered
        btn_editemp_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_editemp_menuMouseEntered

    private void btn_editemp_menuMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_editemp_menuMouseExited
    {//GEN-HEADEREND:event_btn_editemp_menuMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editemp_menuMouseExited

    private void btn_editemp_menuKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_editemp_menuKeyPressed
    {//GEN-HEADEREND:event_btn_editemp_menuKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btnEmployee.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(pnl_edit_emp, pnl_add_emp, pnl_emp_det);
            onIndicator(lid_edit_emp, lid_add_emp, lid_emp_det);
            bindEmployeeTableData(table_editemp);
//            fillCombobox("employee", "usrnm", cmbbox_editemp_usrnm);
            txt_editemp_nm.grabFocus();

        }
    }//GEN-LAST:event_btn_editemp_menuKeyPressed

    private void btn_empdet_menuFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_empdet_menuFocusGained
    {//GEN-HEADEREND:event_btn_empdet_menuFocusGained
        hover(btn_empdet_menu, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_empdet_menuFocusGained

    private void btn_empdet_menuFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_empdet_menuFocusLost
    {//GEN-HEADEREND:event_btn_empdet_menuFocusLost
        hover(btn_empdet_menu, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_empdet_menuFocusLost

    private void btn_empdet_menuMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_empdet_menuMouseEntered
    {//GEN-HEADEREND:event_btn_empdet_menuMouseEntered
        btn_empdet_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_empdet_menuMouseEntered

    private void btn_empdet_menuMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_empdet_menuMouseExited
    {//GEN-HEADEREND:event_btn_empdet_menuMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_empdet_menuMouseExited

    private void btn_empdet_menuKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_empdet_menuKeyPressed
    {//GEN-HEADEREND:event_btn_empdet_menuKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btnEmployee.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(pnl_emp_det, pnl_add_emp, pnl_edit_emp);
            onIndicator(lid_emp_det, lid_add_emp, lid_edit_emp);
            txt_empdet_nm.grabFocus();
            bindEmployeeTableData(table_empdet);
        }
    }//GEN-LAST:event_btn_empdet_menuKeyPressed

    private void btn_addprod_menuFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_addprod_menuFocusGained
    {//GEN-HEADEREND:event_btn_addprod_menuFocusGained
        hover(btn_addprod_menu, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_addprod_menuFocusGained

    private void btn_addprod_menuFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_addprod_menuFocusLost
    {//GEN-HEADEREND:event_btn_addprod_menuFocusLost
        hover(btn_addprod_menu, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_addprod_menuFocusLost

    private void btn_addprod_menuMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_addprod_menuMouseEntered
    {//GEN-HEADEREND:event_btn_addprod_menuMouseEntered
        btn_addprod_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_addprod_menuMouseEntered

    private void btn_addprod_menuMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_addprod_menuMouseExited
    {//GEN-HEADEREND:event_btn_addprod_menuMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addprod_menuMouseExited

    private void btn_addprod_menuKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_addprod_menuKeyPressed
    {//GEN-HEADEREND:event_btn_addprod_menuKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btnProduct.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(pnl_add_prod, pnl_edit_prod, pnl_prod_det);
            onIndicator(lid_addprod, lid_editprod, lid_proddet);
            txt_addprod_id.grabFocus();
        }
    }//GEN-LAST:event_btn_addprod_menuKeyPressed

    private void btn_editprod_menuFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_editprod_menuFocusGained
    {//GEN-HEADEREND:event_btn_editprod_menuFocusGained
        hover(btn_editprod_menu, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_editprod_menuFocusGained

    private void btn_editprod_menuFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_editprod_menuFocusLost
    {//GEN-HEADEREND:event_btn_editprod_menuFocusLost
        hover(btn_editprod_menu, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_editprod_menuFocusLost

    private void btn_editprod_menuMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_editprod_menuMouseEntered
    {//GEN-HEADEREND:event_btn_editprod_menuMouseEntered
        btn_editprod_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_editprod_menuMouseEntered

    private void btn_editprod_menuMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_editprod_menuMouseExited
    {//GEN-HEADEREND:event_btn_editprod_menuMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editprod_menuMouseExited

    private void btn_editprod_menuKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_editprod_menuKeyPressed
    {//GEN-HEADEREND:event_btn_editprod_menuKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btnProduct.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(pnl_edit_prod, pnl_add_prod, pnl_prod_det);
            onIndicator(lid_editprod, lid_addprod, lid_proddet);
            bindProductTableData(table_editprod);

            txt_editprod_id.grabFocus();
        }
    }//GEN-LAST:event_btn_editprod_menuKeyPressed

    private void btn_proddet_menuFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_proddet_menuFocusGained
    {//GEN-HEADEREND:event_btn_proddet_menuFocusGained
        hover(btn_proddet_menu, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_proddet_menuFocusGained

    private void btn_proddet_menuFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_proddet_menuFocusLost
    {//GEN-HEADEREND:event_btn_proddet_menuFocusLost
        hover(btn_proddet_menu, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_proddet_menuFocusLost

    private void btn_proddet_menuMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_proddet_menuMouseEntered
    {//GEN-HEADEREND:event_btn_proddet_menuMouseEntered
        btn_proddet_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_proddet_menuMouseEntered

    private void btn_proddet_menuMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_proddet_menuMouseExited
    {//GEN-HEADEREND:event_btn_proddet_menuMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_proddet_menuMouseExited

    private void btn_proddet_menuKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_proddet_menuKeyPressed
    {//GEN-HEADEREND:event_btn_proddet_menuKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btnProduct.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(pnl_prod_det, pnl_add_prod, pnl_edit_prod);
            onIndicator(lid_proddet, lid_addprod, lid_editprod);
            bindProductTableData(table_proddet);

            txt_proddet_nm.grabFocus();
        }
    }//GEN-LAST:event_btn_proddet_menuKeyPressed

    private void btn_accsetting_menuFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_accsetting_menuFocusGained
    {//GEN-HEADEREND:event_btn_accsetting_menuFocusGained
        hover(btn_accsetting_menu, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_accsetting_menuFocusGained

    private void btn_accsetting_menuFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_accsetting_menuFocusLost
    {//GEN-HEADEREND:event_btn_accsetting_menuFocusLost
        hover(btn_accsetting_menu, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_accsetting_menuFocusLost

    private void btn_accsetting_menuMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_accsetting_menuMouseEntered
    {//GEN-HEADEREND:event_btn_accsetting_menuMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_accsetting_menuMouseEntered

    private void btn_accsetting_menuMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_accsetting_menuMouseExited
    {//GEN-HEADEREND:event_btn_accsetting_menuMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_accsetting_menuMouseExited

    private void btn_accsetting_menuKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_accsetting_menuKeyPressed
    {//GEN-HEADEREND:event_btn_accsetting_menuKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btnBill.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(pnl_accsetting, pnl_acc_tab2, pnl_acc_tab3);
            onIndicator(lid_accsetting, lid_acc_menu2, lid_acc_menu3);
        }
    }//GEN-LAST:event_btn_accsetting_menuKeyPressed

    private void btn_acc_menu2FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_acc_menu2FocusGained
    {//GEN-HEADEREND:event_btn_acc_menu2FocusGained
        hover(btn_acc_menu2, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_acc_menu2FocusGained

    private void btn_acc_menu2FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_acc_menu2FocusLost
    {//GEN-HEADEREND:event_btn_acc_menu2FocusLost
        hover(btn_acc_menu2, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_acc_menu2FocusLost

    private void btn_acc_menu2MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_acc_menu2MouseEntered
    {//GEN-HEADEREND:event_btn_acc_menu2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_acc_menu2MouseEntered

    private void btn_acc_menu2MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_acc_menu2MouseExited
    {//GEN-HEADEREND:event_btn_acc_menu2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_acc_menu2MouseExited

    private void btn_acc_menu2KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_acc_menu2KeyPressed
    {//GEN-HEADEREND:event_btn_acc_menu2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btnBill.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(pnl_acc_tab2, pnl_accsetting, pnl_acc_tab3);
            onIndicator(lid_acc_menu2, lid_accsetting, lid_acc_menu3);
        }
    }//GEN-LAST:event_btn_acc_menu2KeyPressed

    private void btn_acc_menu3FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_acc_menu3FocusGained
    {//GEN-HEADEREND:event_btn_acc_menu3FocusGained
        hover(btn_acc_menu3, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_acc_menu3FocusGained

    private void btn_acc_menu3FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_acc_menu3FocusLost
    {//GEN-HEADEREND:event_btn_acc_menu3FocusLost
        hover(btn_acc_menu3, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_acc_menu3FocusLost

    private void btn_acc_menu3MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_acc_menu3MouseEntered
    {//GEN-HEADEREND:event_btn_acc_menu3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_acc_menu3MouseEntered

    private void btn_acc_menu3MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_acc_menu3MouseExited
    {//GEN-HEADEREND:event_btn_acc_menu3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_acc_menu3MouseExited

    private void btn_acc_menu3KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_acc_menu3KeyPressed
    {//GEN-HEADEREND:event_btn_acc_menu3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btnBill.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(pnl_acc_tab3, pnl_accsetting, pnl_acc_tab2);
            onIndicator(lid_acc_menu3, lid_accsetting, lid_acc_menu2);
        }
    }//GEN-LAST:event_btn_acc_menu3KeyPressed

    private void btn_createbill_menuFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_createbill_menuFocusGained
    {//GEN-HEADEREND:event_btn_createbill_menuFocusGained
        hover(btn_createbill_menu, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_createbill_menuFocusGained

    private void btn_createbill_menuFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_createbill_menuFocusLost
    {//GEN-HEADEREND:event_btn_createbill_menuFocusLost
        hover(btn_createbill_menu, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_createbill_menuFocusLost

    private void btn_createbill_menuMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_createbill_menuMouseEntered
    {//GEN-HEADEREND:event_btn_createbill_menuMouseEntered
        btn_createbill_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_createbill_menuMouseEntered

    private void btn_createbill_menuMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_createbill_menuMouseExited
    {//GEN-HEADEREND:event_btn_createbill_menuMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_createbill_menuMouseExited

    private void btn_createbill_menuKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_createbill_menuKeyPressed
    {//GEN-HEADEREND:event_btn_createbill_menuKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btnaccount.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(pnl_createbill, pnl_modifybill, pnl_bill_tab3);
            onIndicator(lid_createbill, lid_modifybill);
            lbl_billno_no.setText(getMaxID("bill"));
            fillCombobox("customer", "custnm", cmbbox_createbill_custnm);
            cmbbox_createbill_custnm.grabFocus();
        }
    }//GEN-LAST:event_btn_createbill_menuKeyPressed

    private void btn_modifybill_menuFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_modifybill_menuFocusGained
    {//GEN-HEADEREND:event_btn_modifybill_menuFocusGained
        hover(btn_modifybill_menu, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_modifybill_menuFocusGained

    private void btn_modifybill_menuFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_modifybill_menuFocusLost
    {//GEN-HEADEREND:event_btn_modifybill_menuFocusLost
        hover(btn_modifybill_menu, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_modifybill_menuFocusLost

    private void btn_modifybill_menuMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_modifybill_menuMouseEntered
    {//GEN-HEADEREND:event_btn_modifybill_menuMouseEntered
        btn_modifybill_menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_modifybill_menuMouseEntered

    private void btn_modifybill_menuMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_modifybill_menuMouseExited
    {//GEN-HEADEREND:event_btn_modifybill_menuMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modifybill_menuMouseExited

    private void btn_modifybill_menuKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_modifybill_menuKeyPressed
    {//GEN-HEADEREND:event_btn_modifybill_menuKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btnaccount.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(pnl_modifybill, pnl_createbill, pnl_bill_tab3);
            onIndicator(lid_modifybill, lid_createbill);
        }
    }//GEN-LAST:event_btn_modifybill_menuKeyPressed

    private void btn_modifybill_menuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_modifybill_menuActionPerformed
    {//GEN-HEADEREND:event_btn_modifybill_menuActionPerformed
        visibility(pnl_modifybill, pnl_createbill, pnl_bill_tab3);
        onIndicator(lid_modifybill, lid_createbill);
    }//GEN-LAST:event_btn_modifybill_menuActionPerformed

    private void btn_addcust_menuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_addcust_menuActionPerformed
    {//GEN-HEADEREND:event_btn_addcust_menuActionPerformed
        visibility(pnl_add_cust, pnl_edit_cust, pnl_cust_det);
        onIndicator(lid_add_cust, lid_edit_cust, lid_cust_det);
        txt_editcust_id.setText(getMaxID("customer"));
        txt_addcust_id.grabFocus();
    }//GEN-LAST:event_btn_addcust_menuActionPerformed

    private void btn_editcust_menuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_editcust_menuActionPerformed
    {//GEN-HEADEREND:event_btn_editcust_menuActionPerformed
        visibility(pnl_edit_cust, pnl_add_cust, pnl_cust_det);
        onIndicator(lid_edit_cust, lid_add_cust, lid_cust_det);
        bindCustomerTableData(table_editcust);
        txt_editcust_id.grabFocus();
    }//GEN-LAST:event_btn_editcust_menuActionPerformed

    private void btn_custdet_menuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_custdet_menuActionPerformed
    {//GEN-HEADEREND:event_btn_custdet_menuActionPerformed
        visibility(pnl_cust_det, pnl_add_cust, pnl_edit_cust);
        onIndicator(lid_cust_det, lid_add_cust, lid_edit_cust);
        bindCustomerTableData(table_custdet);
        txt_custdet_custnm.grabFocus();
    }//GEN-LAST:event_btn_custdet_menuActionPerformed

    private void btn_addemp_menuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_addemp_menuActionPerformed
    {//GEN-HEADEREND:event_btn_addemp_menuActionPerformed
        visibility(pnl_add_emp, pnl_edit_emp, pnl_emp_det);
        onIndicator(lid_add_emp, lid_edit_emp, lid_emp_det);
        txt_addemp_id.setText(getMaxID("employee"));
        txt_addemp_id.grabFocus();
    }//GEN-LAST:event_btn_addemp_menuActionPerformed

    private void btn_editemp_menuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_editemp_menuActionPerformed
    {//GEN-HEADEREND:event_btn_editemp_menuActionPerformed
        visibility(pnl_edit_emp, pnl_add_emp, pnl_emp_det);
        onIndicator(lid_edit_emp, lid_add_emp, lid_emp_det);
        bindEmployeeTableData(table_editemp);
//        fillCombobox("employee", "usrnm", cmbbox_editemp_usrnm);
        txt_editemp_nm.grabFocus();
    }//GEN-LAST:event_btn_editemp_menuActionPerformed

    private void btn_empdet_menuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_empdet_menuActionPerformed
    {//GEN-HEADEREND:event_btn_empdet_menuActionPerformed
        visibility(pnl_emp_det, pnl_add_emp, pnl_edit_emp);
        onIndicator(lid_emp_det, lid_add_emp, lid_edit_emp);
        txt_empdet_nm.grabFocus();
        bindEmployeeTableData(table_empdet);
    }//GEN-LAST:event_btn_empdet_menuActionPerformed

    private void btn_addprod_menuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_addprod_menuActionPerformed
    {//GEN-HEADEREND:event_btn_addprod_menuActionPerformed
        visibility(pnl_add_prod, pnl_edit_prod, pnl_prod_det);
        onIndicator(lid_addprod, lid_editprod, lid_proddet);
        txt_addprod_id.grabFocus();
    }//GEN-LAST:event_btn_addprod_menuActionPerformed

    private void btn_editprod_menuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_editprod_menuActionPerformed
    {//GEN-HEADEREND:event_btn_editprod_menuActionPerformed
        visibility(pnl_edit_prod, pnl_add_prod, pnl_prod_det);
        onIndicator(lid_editprod, lid_addprod, lid_proddet);
        bindProductTableData(table_editprod);
        txt_editprod_id.grabFocus();
    }//GEN-LAST:event_btn_editprod_menuActionPerformed

    private void btn_proddet_menuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_proddet_menuActionPerformed
    {//GEN-HEADEREND:event_btn_proddet_menuActionPerformed
        visibility(pnl_prod_det, pnl_add_prod, pnl_edit_prod);
        onIndicator(lid_proddet, lid_addprod, lid_editprod);
        bindProductTableData(table_proddet);

        txt_proddet_nm.grabFocus();
    }//GEN-LAST:event_btn_proddet_menuActionPerformed

    private void btn_accsetting_menuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_accsetting_menuActionPerformed
    {//GEN-HEADEREND:event_btn_accsetting_menuActionPerformed
        visibility(pnl_accsetting, pnl_acc_tab2, pnl_acc_tab3);
        onIndicator(lid_accsetting, lid_acc_menu2, lid_acc_menu3);
    }//GEN-LAST:event_btn_accsetting_menuActionPerformed

    private void btn_acc_menu2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_acc_menu2ActionPerformed
    {//GEN-HEADEREND:event_btn_acc_menu2ActionPerformed
        visibility(pnl_acc_tab2, pnl_accsetting, pnl_acc_tab3);
        onIndicator(lid_acc_menu2, lid_accsetting, lid_acc_menu3);
    }//GEN-LAST:event_btn_acc_menu2ActionPerformed

    private void btn_acc_menu3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_acc_menu3ActionPerformed
    {//GEN-HEADEREND:event_btn_acc_menu3ActionPerformed
        visibility(pnl_acc_tab3, pnl_accsetting, pnl_acc_tab2);
        onIndicator(lid_acc_menu3, lid_accsetting, lid_acc_menu2);
    }//GEN-LAST:event_btn_acc_menu3ActionPerformed

    private void btn_createbill_menuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_createbill_menuActionPerformed
    {//GEN-HEADEREND:event_btn_createbill_menuActionPerformed
        visibility(pnl_createbill, pnl_modifybill, pnl_bill_tab3);
        onIndicator(lid_createbill, lid_modifybill);
        lbl_billno_no.setText(getMaxID("bill"));
        fillCombobox("customer", "custnm", cmbbox_createbill_custnm);
        cmbbox_createbill_custnm.grabFocus();
    }//GEN-LAST:event_btn_createbill_menuActionPerformed

    private void btnBillActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnBillActionPerformed
    {//GEN-HEADEREND:event_btnBillActionPerformed
        visibility(false, false, false, false, true, false, btn_createbill_menu);
        visibility(pnl_createbill, pnl_modifybill, pnl_bill_tab3);
        onIndicator(lid_createbill, lid_modifybill);
        fillCombobox("customer", "custnm", cmbbox_createbill_custnm);
        fillCombobox("product", "nm", cmbbox_createbill_prodnm);
    }//GEN-LAST:event_btnBillActionPerformed

    private void btn_editcust_editFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_editcust_editFocusGained
    {//GEN-HEADEREND:event_btn_editcust_editFocusGained
        hover(btn_editcust_edit, new Color(1, 109, 218), Color.BLACK);
    }//GEN-LAST:event_btn_editcust_editFocusGained

    private void btn_editcust_editFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_editcust_editFocusLost
    {//GEN-HEADEREND:event_btn_editcust_editFocusLost
        hover(btn_editcust_edit, new Color(255, 167, 6), Color.WHITE);
    }//GEN-LAST:event_btn_editcust_editFocusLost

    private void btn_editcust_editMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_editcust_editMouseEntered
    {//GEN-HEADEREND:event_btn_editcust_editMouseEntered
        btn_editcust_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_editcust_editMouseEntered

    private void btn_editcust_editMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_editcust_editMouseExited
    {//GEN-HEADEREND:event_btn_editcust_editMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editcust_editMouseExited

    private void btn_editcust_editActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_editcust_editActionPerformed
    {//GEN-HEADEREND:event_btn_editcust_editActionPerformed
        if (isFieldEmpty(txt_editcust_id, txt_editcust_nm, txt_editcust_contact, txt_editcust_email, txt_editcust_shopnm, txt_editcust_shopaddr))
        {
            try
            {
                con = dbconnection.getdbConnection();
                query = "update customer set custnm = ?, contact = ?, email = ?, shopnm = ?, address = ? where id = ?";

                pst = con.prepareStatement(query);
                pst.setString(1, txt_editcust_nm.getText());
                pst.setString(2, txt_editcust_contact.getText());
                pst.setString(3, txt_editcust_email.getText());
                pst.setString(4, txt_editcust_shopnm.getText());
                pst.setString(5, txt_editcust_shopaddr.getText());
                pst.setString(6, txt_editcust_id.getText());

                pst.executeUpdate();
                bindCustomerTableData(table_editcust);

                JOptionPane.showMessageDialog(null, "Customer Details Updated Successfully");

                clearTextFields(txt_editcust_id, txt_editcust_nm, txt_addcust_contact, txt_editcust_email, txt_editcust_shopnm, txt_editcust_shopaddr);
                txt_editcust_id.grabFocus();
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_editcust_editActionPerformed

    private void btn_editcust_editKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_editcust_editKeyPressed
    {//GEN-HEADEREND:event_btn_editcust_editKeyPressed

    }//GEN-LAST:event_btn_editcust_editKeyPressed

    private void btn_editcust_rmvFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_editcust_rmvFocusLost
    {//GEN-HEADEREND:event_btn_editcust_rmvFocusLost
        hover(btn_editcust_rmv, new Color(255, 167, 6), Color.WHITE);
    }//GEN-LAST:event_btn_editcust_rmvFocusLost

    private void btn_editcust_rmvMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_editcust_rmvMouseEntered
    {//GEN-HEADEREND:event_btn_editcust_rmvMouseEntered
        btn_editcust_rmv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_editcust_rmvMouseEntered

    private void btn_editcust_rmvMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_editcust_rmvMouseExited
    {//GEN-HEADEREND:event_btn_editcust_rmvMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editcust_rmvMouseExited

    private void btn_editcust_rmvKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_editcust_rmvKeyPressed
    {//GEN-HEADEREND:event_btn_editcust_rmvKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editcust_rmvKeyPressed

    private void txt_editcust_shopaddrActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txt_editcust_shopaddrActionPerformed
    {//GEN-HEADEREND:event_txt_editcust_shopaddrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_editcust_shopaddrActionPerformed

    private void btn_addcust_addFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_addcust_addFocusGained
    {//GEN-HEADEREND:event_btn_addcust_addFocusGained
        hover(btn_addcust_add, new Color(1, 109, 218), Color.BLACK);
    }//GEN-LAST:event_btn_addcust_addFocusGained

    private void btn_addcust_addFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_addcust_addFocusLost
    {//GEN-HEADEREND:event_btn_addcust_addFocusLost
        hover(btn_addcust_add, new Color(255, 167, 6), Color.WHITE);
    }//GEN-LAST:event_btn_addcust_addFocusLost

    private void btn_addcust_addActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_addcust_addActionPerformed
    {//GEN-HEADEREND:event_btn_addcust_addActionPerformed
        if (isFieldEmpty(txt_addcust_id, txt_addcust_nm, txt_addcust_contact, txt_addcust_email, txt_addcust_shopnm, txt_addcust_shopaddr))
        {
            try
            {
                con = dbconnection.getdbConnection();
                query = "insert into customer values(?, ?, ?, ?, ?, ?)";
                pst = con.prepareStatement(query);

                pst.setString(1, txt_addcust_id.getText());
                pst.setString(2, txt_addcust_nm.getText());
                pst.setString(3, txt_addcust_contact.getText());
                pst.setString(4, txt_addcust_email.getText());
                pst.setString(5, txt_addcust_shopnm.getText());
                pst.setString(6, txt_addcust_shopaddr.getText());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Record Inserted Successfully !");
                clearTextFields(txt_addcust_id, txt_addcust_nm, txt_addcust_contact, txt_addcust_email, txt_addcust_shopnm, txt_addcust_shopaddr);
                txt_addcust_id.setText(getMaxID("customer"));
                txt_addcust_id.grabFocus();
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_addcust_addActionPerformed

    private void btn_addcust_addKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_addcust_addKeyPressed
    {//GEN-HEADEREND:event_btn_addcust_addKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addcust_addKeyPressed

    private void btn_addemp_addFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_addemp_addFocusGained
    {//GEN-HEADEREND:event_btn_addemp_addFocusGained
        hover(btn_addemp_add, new Color(1, 109, 218), Color.BLACK);
    }//GEN-LAST:event_btn_addemp_addFocusGained

    private void btn_addemp_addFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_addemp_addFocusLost
    {//GEN-HEADEREND:event_btn_addemp_addFocusLost
        hover(btn_addemp_add, new Color(255, 167, 6), Color.WHITE);
    }//GEN-LAST:event_btn_addemp_addFocusLost

    private void btn_addemp_addMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_addemp_addMouseEntered
    {//GEN-HEADEREND:event_btn_addemp_addMouseEntered
        btn_addemp_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_addemp_addMouseEntered

    private void btn_addemp_addMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_addemp_addMouseExited
    {//GEN-HEADEREND:event_btn_addemp_addMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addemp_addMouseExited

    private void btn_addemp_addActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_addemp_addActionPerformed
    {//GEN-HEADEREND:event_btn_addemp_addActionPerformed
        try
        {
            con = dbconnection.getdbConnection();
            query = "insert into employee (id, nm, usrnm, pswd, contact, email, salary, address) values(?, ?, ?, ?, ?, ?, ?, ?)";

            pst = con.prepareStatement(query);
            pst.setString(1, txt_addemp_id.getText());
            pst.setString(2, txt_addemp_nm.getText());
            pst.setString(3, txt_addemp_usrnm.getText());
            pst.setString(4, txt_addemp_pswd.getText());
            pst.setString(5, txt_addemp_contact.getText());
            pst.setString(6, txt_addemp_email.getText());
            pst.setString(7, txt_addemp_salary.getText());
            pst.setString(8, txt_addemp_addr.getText());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Employee Added Successfully!");
            clearTextFields(txt_addemp_id, txt_addemp_nm, txt_addemp_usrnm, txt_addemp_pswd, txt_addemp_contact, txt_addemp_email, txt_addemp_salary, txt_addemp_addr);
            txt_addemp_id.setText(getMaxID("employee"));
            txt_addemp_id.grabFocus();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_addemp_addActionPerformed

    private void btn_addemp_addKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_addemp_addKeyPressed
    {//GEN-HEADEREND:event_btn_addemp_addKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addemp_addKeyPressed

    private void btn_custdetKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_custdetKeyPressed
    {//GEN-HEADEREND:event_btn_custdetKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_custdetKeyPressed

    private void btn_custdetActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_custdetActionPerformed
    {//GEN-HEADEREND:event_btn_custdetActionPerformed
        bindCustomerTableData(table_custdet);
    }//GEN-LAST:event_btn_custdetActionPerformed

    private void btn_custdetMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_custdetMouseExited
    {//GEN-HEADEREND:event_btn_custdetMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_custdetMouseExited

    private void btn_custdetMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_custdetMouseEntered
    {//GEN-HEADEREND:event_btn_custdetMouseEntered
        btn_custdet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_custdetMouseEntered

    private void btn_custdetFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_custdetFocusLost
    {//GEN-HEADEREND:event_btn_custdetFocusLost
        hover(btn_custdet, new Color(255, 167, 6), Color.WHITE);
    }//GEN-LAST:event_btn_custdetFocusLost

    private void btn_custdetFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_custdetFocusGained
    {//GEN-HEADEREND:event_btn_custdetFocusGained
        hover(btn_custdet, new Color(1, 109, 218), Color.BLACK);
    }//GEN-LAST:event_btn_custdetFocusGained

    private void btn_empdetFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_empdetFocusGained
    {//GEN-HEADEREND:event_btn_empdetFocusGained
        hover(btn_empdet, new Color(1, 109, 218), Color.BLACK);
    }//GEN-LAST:event_btn_empdetFocusGained

    private void btn_empdetFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_empdetFocusLost
    {//GEN-HEADEREND:event_btn_empdetFocusLost
        hover(btn_empdet, new Color(255, 167, 6), Color.WHITE);
    }//GEN-LAST:event_btn_empdetFocusLost

    private void btn_empdetMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_empdetMouseEntered
    {//GEN-HEADEREND:event_btn_empdetMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_empdetMouseEntered

    private void btn_empdetMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_empdetMouseExited
    {//GEN-HEADEREND:event_btn_empdetMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_empdetMouseExited

    private void btn_empdetActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_empdetActionPerformed
    {//GEN-HEADEREND:event_btn_empdetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_empdetActionPerformed

    private void btn_empdetKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_empdetKeyPressed
    {//GEN-HEADEREND:event_btn_empdetKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_empdetKeyPressed

    private void cmbbox_addprod_brandActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmbbox_addprod_brandActionPerformed
    {//GEN-HEADEREND:event_cmbbox_addprod_brandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbbox_addprod_brandActionPerformed

    private void btn_addprodFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_addprodFocusGained
    {//GEN-HEADEREND:event_btn_addprodFocusGained
        hover(btn_addprod, new Color(1, 109, 218), Color.BLACK);
    }//GEN-LAST:event_btn_addprodFocusGained

    private void btn_addprodFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_addprodFocusLost
    {//GEN-HEADEREND:event_btn_addprodFocusLost
        hover(btn_addprod, new Color(255, 167, 6), Color.WHITE);
    }//GEN-LAST:event_btn_addprodFocusLost

    private void btn_addprodMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_addprodMouseEntered
    {//GEN-HEADEREND:event_btn_addprodMouseEntered
        btn_addprod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_addprodMouseEntered

    private void btn_addprodMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_addprodMouseExited
    {//GEN-HEADEREND:event_btn_addprodMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addprodMouseExited

    private void btn_addprodActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_addprodActionPerformed
    {//GEN-HEADEREND:event_btn_addprodActionPerformed
        if (isFieldEmpty(txt_addprod_id, txt_addprod_nm, txt_addprod_costprice, txt_addprod_sellingprice, txt_addprod_quantity) && isCmbboxDefaultSelected("--SELECT BRAND--", cmbbox_addprod_brand))
        {
            try
            {
                con = dbconnection.getdbConnection();
                query = "insert into product (id, nm, costprice, sellingprice, brand, quantity) values(?, ?, ?, ?, ?, ?)";

                pst = con.prepareStatement(query);
                pst.setString(1, txt_addprod_id.getText());
                pst.setString(2, txt_addprod_nm.getText());
                pst.setString(3, txt_addprod_costprice.getText());
                pst.setString(4, txt_addprod_sellingprice.getText());
                pst.setString(5, cmbbox_addprod_brand.getSelectedItem().toString());
                pst.setString(6, txt_addprod_quantity.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Record inserted Successfull");
                clearTextFields(txt_addprod_id, txt_addprod_nm, txt_addprod_costprice, txt_addprod_sellingprice, cmbbox_addprod_brand, txt_addprod_quantity);
                txt_addprod_id.setText(getMaxID("product"));
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_addprodActionPerformed

    private void btn_addprodKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_addprodKeyPressed
    {//GEN-HEADEREND:event_btn_addprodKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addprodKeyPressed

    private void txt_addprod_costpriceActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txt_addprod_costpriceActionPerformed
    {//GEN-HEADEREND:event_txt_addprod_costpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addprod_costpriceActionPerformed

    private void btn_addcust_addMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_addcust_addMouseExited
    {//GEN-HEADEREND:event_btn_addcust_addMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addcust_addMouseExited

    private void btn_addcust_addMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_addcust_addMouseEntered
    {//GEN-HEADEREND:event_btn_addcust_addMouseEntered
        btn_addcust_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_addcust_addMouseEntered

    private void btn_editcust_rmvActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_editcust_rmvActionPerformed
    {//GEN-HEADEREND:event_btn_editcust_rmvActionPerformed
        int confirmMsg = JOptionPane.showConfirmDialog(null, "Confirm Deletion ?");
        if (confirmMsg == 0)
        {
            try
            {
                con = dbconnection.getdbConnection();
                query = "delete from customer where id = ?";

                pst = con.prepareStatement(query);
                pst.setString(1, txt_editcust_id.getText());

                pst.executeUpdate();
                bindCustomerTableData(table_editcust);
                JOptionPane.showMessageDialog(null, "Record Deleted Successfully !");

                clearTextFields(txt_editcust_id, txt_editcust_nm, txt_addcust_contact, txt_editcust_email, txt_editcust_shopnm, txt_editcust_shopaddr);
                txt_editcust_id.grabFocus();
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_editcust_rmvActionPerformed

    private void btn_editcust_rmvFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_editcust_rmvFocusGained
    {//GEN-HEADEREND:event_btn_editcust_rmvFocusGained
        hover(btn_editcust_rmv, new Color(1, 109, 218), Color.BLACK);
    }//GEN-LAST:event_btn_editcust_rmvFocusGained

    private void btn_editemp_rmvKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_editemp_rmvKeyPressed
    {//GEN-HEADEREND:event_btn_editemp_rmvKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editemp_rmvKeyPressed

    private void btn_editemp_rmvActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_editemp_rmvActionPerformed
    {//GEN-HEADEREND:event_btn_editemp_rmvActionPerformed
        try
        {
            con = dbconnection.getdbConnection();
            String empnm = txt_editemp_nm.getText();
            query = "delete from employee where nm = '" + empnm + "'";

            pst = con.prepareStatement(query);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Employee Removed Successfully !");
            bindEmployeeTableData(table_editemp);
            clearTextFields(txt_editemp_nm, txt_editemp_usrnm, txt_editemp_contact, txt_editemp_email, txt_editemp_salary, txt_editemp_addr);
            txt_editemp_pswd.setText("");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_editemp_rmvActionPerformed

    private void btn_editemp_rmvMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_editemp_rmvMouseExited
    {//GEN-HEADEREND:event_btn_editemp_rmvMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editemp_rmvMouseExited

    private void btn_editemp_rmvMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_editemp_rmvMouseEntered
    {//GEN-HEADEREND:event_btn_editemp_rmvMouseEntered
        btn_editemp_rmv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_editemp_rmvMouseEntered

    private void btn_editemp_rmvFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_editemp_rmvFocusLost
    {//GEN-HEADEREND:event_btn_editemp_rmvFocusLost
        hover(btn_editemp_rmv, new Color(255, 167, 6), Color.WHITE);
    }//GEN-LAST:event_btn_editemp_rmvFocusLost

    private void btn_editemp_rmvFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_editemp_rmvFocusGained
    {//GEN-HEADEREND:event_btn_editemp_rmvFocusGained
        hover(btn_editemp_rmv, new Color(1, 109, 218), Color.BLACK);
    }//GEN-LAST:event_btn_editemp_rmvFocusGained

    private void btn_editemp_editKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_editemp_editKeyPressed
    {//GEN-HEADEREND:event_btn_editemp_editKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editemp_editKeyPressed

    private void btn_editemp_editActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_editemp_editActionPerformed
    {//GEN-HEADEREND:event_btn_editemp_editActionPerformed
        try
        {
            con = dbconnection.getdbConnection();
            query = "update employee set nm = ?, usrnm = ?, pswd = ?, contact = ?, email = ?, salary = ?, address = ? where usrnm = ? ";

            pst = con.prepareStatement(query);
            pst.setString(1, txt_editemp_nm.getText());
            pst.setString(2, txt_editemp_usrnm.getText());
            pst.setString(3, txt_editemp_pswd.getText());
            pst.setString(4, txt_editemp_contact.getText());
            pst.setString(5, txt_editemp_email.getText());
            pst.setString(6, txt_editemp_salary.getText());
            pst.setString(7, txt_editemp_addr.getText());
            pst.setString(8, txt_editemp_usrnm.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Employee Details Updated Successfully!");
            bindEmployeeTableData(table_editemp);

            clearTextFields(txt_editemp_nm, txt_editemp_usrnm, txt_editemp_contact, txt_editemp_email, txt_editemp_salary, txt_editemp_addr);
            txt_editemp_pswd.setText("");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_editemp_editActionPerformed

    private void btn_editemp_editMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_editemp_editMouseExited
    {//GEN-HEADEREND:event_btn_editemp_editMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editemp_editMouseExited

    private void btn_editemp_editMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_editemp_editMouseEntered
    {//GEN-HEADEREND:event_btn_editemp_editMouseEntered
        btn_editemp_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_editemp_editMouseEntered

    private void btn_editemp_editFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_editemp_editFocusLost
    {//GEN-HEADEREND:event_btn_editemp_editFocusLost
        hover(btn_editemp_edit, new Color(255, 167, 6), Color.WHITE);
    }//GEN-LAST:event_btn_editemp_editFocusLost

    private void btn_editemp_editFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_editemp_editFocusGained
    {//GEN-HEADEREND:event_btn_editemp_editFocusGained
        hover(btn_editemp_edit, new Color(1, 109, 218), Color.BLACK);
    }//GEN-LAST:event_btn_editemp_editFocusGained

    private void txt_custdet_custnmKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_custdet_custnmKeyReleased
    {//GEN-HEADEREND:event_txt_custdet_custnmKeyReleased
        if (txt_custdet_custnm.getText().equals(""))
        {
            bindCustomerTableData(table_custdet);
        }
        else
        {
            String custnm = txt_custdet_custnm.getText();
            try
            {
                con = dbconnection.getdbConnection();
                query = "select * from customer where custnm like '" + custnm + "%'";

                tableModel = (DefaultTableModel) table_custdet.getModel();
                tableModel.setRowCount(0);

                pst = con.prepareStatement(query);
                result = pst.executeQuery();

                String id, nm, contact, email, shpnm, shpaddr;

                while (result.next())
                {
                    id = result.getString(1);
                    nm = result.getString(2);
                    contact = result.getString(3);
                    email = result.getString(4);
                    shpnm = result.getString(5);
                    shpaddr = result.getString(6);

                    String[] rows =
                    {
                        id, nm, contact, email, shpnm, shpaddr
                    };

                    tableModel.addRow(rows);
                }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_txt_custdet_custnmKeyReleased

    private void txt_empdet_nmKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_empdet_nmKeyReleased
    {//GEN-HEADEREND:event_txt_empdet_nmKeyReleased
        if (txt_empdet_nm.getText().equals(""))
        {
            bindEmployeeTableData(table_empdet);
        }
        else
        {
            String empnm = txt_empdet_nm.getText();
            try
            {
                con = dbconnection.getdbConnection();
                query = "select * from employee where nm like '" + empnm + "%'";

                tableModel = (DefaultTableModel) table_empdet.getModel();
                tableModel.setRowCount(0);

                pst = con.prepareStatement(query);
                result = pst.executeQuery();

                String id, nm, contact, email, salary, addr, pswd;

                while (result.next())
                {
                    id = result.getString(1);
                    nm = result.getString(2);
                    contact = result.getString(3);
                    email = result.getString(4);
                    salary = result.getString(5);
                    addr = result.getString(6);
                    pswd = result.getString(7);

                    String[] rows =
                    {
                        id, nm, contact, email, salary, addr, pswd
                    };

                    tableModel.addRow(rows);
                }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_txt_empdet_nmKeyReleased

    private void table_editcustMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_table_editcustMouseClicked
    {//GEN-HEADEREND:event_table_editcustMouseClicked
        table_editcust = (JTable) evt.getSource();

        // Database table column index starts from "1", while Jtable column index starts from "0".
        if (evt.getClickCount() == 1 && table_editcust.getSelectedRow() != -1)
        {
            int i = table_editcust.getSelectedRow();
            tableModel = (DefaultTableModel) table_editcust.getModel();
            txt_editcust_id.setText(tableModel.getValueAt(i, 0).toString());
            txt_editcust_nm.setText(tableModel.getValueAt(i, 1).toString());
            txt_editcust_contact.setText(tableModel.getValueAt(i, 2).toString());
            txt_editcust_email.setText(tableModel.getValueAt(i, 3).toString());
            txt_editcust_shopnm.setText(tableModel.getValueAt(i, 4).toString());
            txt_editcust_shopaddr.setText(tableModel.getValueAt(i, 5).toString());
        }
    }//GEN-LAST:event_table_editcustMouseClicked

    private void table_editempMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_table_editempMouseClicked
    {//GEN-HEADEREND:event_table_editempMouseClicked
        table_editemp = (JTable) evt.getSource();

        // Database table column index starts from "1", while Jtable column index starts from "0".
        if (evt.getClickCount() == 1 && table_editemp.getSelectedRow() != -1)
        {
            int i = table_editemp.getSelectedRow();
            tableModel = (DefaultTableModel) table_editemp.getModel();
            txt_editemp_nm.setText(tableModel.getValueAt(i, 1).toString());
            txt_editemp_usrnm.setText(tableModel.getValueAt(i, 2).toString());
            txt_editemp_pswd.setText(tableModel.getValueAt(i, 3).toString());
            txt_editemp_contact.setText(tableModel.getValueAt(i, 4).toString());
            txt_editemp_email.setText(tableModel.getValueAt(i, 5).toString());
            txt_editemp_salary.setText(tableModel.getValueAt(i, 6).toString());
            txt_editemp_addr.setText(tableModel.getValueAt(i, 7).toString());
        }
    }//GEN-LAST:event_table_editempMouseClicked

    private void table_editprodMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_table_editprodMouseClicked
    {//GEN-HEADEREND:event_table_editprodMouseClicked
        table_editprod = (JTable) evt.getSource();

        // Database table column index starts from "1", while Jtable column index starts from "0".
        if (evt.getClickCount() == 1 && table_editprod.getSelectedRow() != -1)
        {
            int i = table_editprod.getSelectedRow();
            tableModel = (DefaultTableModel) table_editprod.getModel();

            txt_editprod_id.setText(tableModel.getValueAt(i, 0).toString());
            txt_editprod_nm.setText(tableModel.getValueAt(i, 1).toString());
            txt_editprod_costprice.setText(tableModel.getValueAt(i, 2).toString());
            txt_editprod_sellingprice.setText(tableModel.getValueAt(i, 3).toString());
            cmbbox_editprod_brand.setSelectedItem(tableModel.getValueAt(i, 4).toString());
            txt_editprod_quantity.setText(tableModel.getValueAt(i, 5).toString());
        }
    }//GEN-LAST:event_table_editprodMouseClicked

    private void cmbbox_editprod_brandActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmbbox_editprod_brandActionPerformed
    {//GEN-HEADEREND:event_cmbbox_editprod_brandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbbox_editprod_brandActionPerformed

    private void btn_editprod_editFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_editprod_editFocusGained
    {//GEN-HEADEREND:event_btn_editprod_editFocusGained
        hover(btn_editprod_edit, new Color(1, 109, 218), Color.BLACK);
    }//GEN-LAST:event_btn_editprod_editFocusGained

    private void btn_editprod_editFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_editprod_editFocusLost
    {//GEN-HEADEREND:event_btn_editprod_editFocusLost
        hover(btn_editprod_edit, new Color(255, 167, 6), Color.WHITE);
    }//GEN-LAST:event_btn_editprod_editFocusLost

    private void btn_editprod_editMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_editprod_editMouseEntered
    {//GEN-HEADEREND:event_btn_editprod_editMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editprod_editMouseEntered

    private void btn_editprod_editMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_editprod_editMouseExited
    {//GEN-HEADEREND:event_btn_editprod_editMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editprod_editMouseExited

    private void btn_editprod_editActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_editprod_editActionPerformed
    {//GEN-HEADEREND:event_btn_editprod_editActionPerformed
        if (isFieldEmpty(txt_editprod_id, txt_editprod_nm, txt_editprod_costprice, txt_editprod_sellingprice, txt_editprod_quantity) && isCmbboxDefaultSelected("--SELECT BRAND--", cmbbox_editprod_brand))
        {
            try
            {
                con = dbconnection.getdbConnection();
                query = "update product set nm = ?, costprice = ?, sellingprice = ?, brand = ?, quantity = ? where id = ? ";

                pst = con.prepareStatement(query);
                pst.setString(1, txt_editprod_nm.getText());
                pst.setString(2, txt_editprod_costprice.getText());
                pst.setString(3, txt_editprod_sellingprice.getText());
                pst.setString(4, cmbbox_editprod_brand.getSelectedItem().toString());
                pst.setString(5, txt_editprod_quantity.getText());
                pst.setString(6, txt_editprod_id.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Product Updated Successfully!");
                bindProductTableData(table_editprod);
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_editprod_editActionPerformed

    private void btn_editprod_editKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_editprod_editKeyPressed
    {//GEN-HEADEREND:event_btn_editprod_editKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editprod_editKeyPressed

    private void btn_editprod_rmvFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_editprod_rmvFocusGained
    {//GEN-HEADEREND:event_btn_editprod_rmvFocusGained
        hover(btn_editprod_rmv, new Color(1, 109, 218), Color.BLACK);
    }//GEN-LAST:event_btn_editprod_rmvFocusGained

    private void btn_editprod_rmvFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_editprod_rmvFocusLost
    {//GEN-HEADEREND:event_btn_editprod_rmvFocusLost
        hover(btn_editprod_rmv, new Color(255, 167, 6), Color.WHITE);
    }//GEN-LAST:event_btn_editprod_rmvFocusLost

    private void btn_editprod_rmvMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_editprod_rmvMouseEntered
    {//GEN-HEADEREND:event_btn_editprod_rmvMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editprod_rmvMouseEntered

    private void btn_editprod_rmvMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_editprod_rmvMouseExited
    {//GEN-HEADEREND:event_btn_editprod_rmvMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editprod_rmvMouseExited

    private void btn_editprod_rmvActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_editprod_rmvActionPerformed
    {//GEN-HEADEREND:event_btn_editprod_rmvActionPerformed
        try
        {
            con = dbconnection.getdbConnection();
            query = "delete from product where id = ?";

            pst = con.prepareStatement(query);
            pst.setString(1, txt_editprod_id.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producgt Deleted Successfully !");
            bindProductTableData(table_editprod);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_editprod_rmvActionPerformed

    private void btn_editprod_rmvKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_editprod_rmvKeyPressed
    {//GEN-HEADEREND:event_btn_editprod_rmvKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editprod_rmvKeyPressed

    private void txt_proddet_nmKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_proddet_nmKeyReleased
    {//GEN-HEADEREND:event_txt_proddet_nmKeyReleased
        if (txt_proddet_nm.getText().equals(""))
        {
            bindProductTableData(table_proddet);
        }
        else
        {
            String prodnm = txt_proddet_nm.getText();
            try
            {
                con = dbconnection.getdbConnection();
                query = "select * from product where nm like '" + prodnm + "%'";

                tableModel = (DefaultTableModel) table_proddet.getModel();
                tableModel.setRowCount(0);

                pst = con.prepareStatement(query);
                result = pst.executeQuery();

                String id, nm, costrprice, sellingprice, brand, quantity;

                while (result.next())
                {
                    id = result.getString(1);
                    nm = result.getString(2);
                    costrprice = result.getString(3);
                    sellingprice = result.getString(4);
                    brand = result.getString(5);
                    quantity = result.getString(6);

                    String[] rows =
                    {
                        id, nm, costrprice, sellingprice, brand, quantity
                    };

                    tableModel.addRow(rows);
                }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_txt_proddet_nmKeyReleased

    private void btn_proddetFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_proddetFocusGained
    {//GEN-HEADEREND:event_btn_proddetFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_proddetFocusGained

    private void btn_proddetFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_proddetFocusLost
    {//GEN-HEADEREND:event_btn_proddetFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_proddetFocusLost

    private void btn_proddetMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_proddetMouseEntered
    {//GEN-HEADEREND:event_btn_proddetMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_proddetMouseEntered

    private void btn_proddetMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_proddetMouseExited
    {//GEN-HEADEREND:event_btn_proddetMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_proddetMouseExited

    private void btn_proddetActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_proddetActionPerformed
    {//GEN-HEADEREND:event_btn_proddetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_proddetActionPerformed

    private void btn_proddetKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_proddetKeyPressed
    {//GEN-HEADEREND:event_btn_proddetKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_proddetKeyPressed

    private void btn_createbill_addFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_createbill_addFocusGained
    {//GEN-HEADEREND:event_btn_createbill_addFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_createbill_addFocusGained

    private void btn_createbill_addFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_createbill_addFocusLost
    {//GEN-HEADEREND:event_btn_createbill_addFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_createbill_addFocusLost

    private void btn_createbill_addMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_createbill_addMouseEntered
    {//GEN-HEADEREND:event_btn_createbill_addMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_createbill_addMouseEntered

    private void btn_createbill_addMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_createbill_addMouseExited
    {//GEN-HEADEREND:event_btn_createbill_addMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_createbill_addMouseExited

    private void btn_createbill_addActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_createbill_addActionPerformed
    {//GEN-HEADEREND:event_btn_createbill_addActionPerformed
        tableModel = (DefaultTableModel) table_createbill.getModel();

        String custnm, contact, prodnm;
        int price = 0, quantity = 0, discount = 0, gtotal = 0, tax = 0, nettotal = 0, unpaid = 0;

        custnm = txt_createbill_custid.getText();
        contact = txt_createbill_contact.getText();
        prodnm = cmbbox_createbill_prodnm.getSelectedItem().toString();

        price = Integer.parseInt(txt_createbill_prodprice.getText());
        quantity = Integer.parseInt(spin_createbill_quantity.getValue().toString());

        discount = ((price * quantity) * Integer.parseInt(txt_createbill_discount.getText())) / 100;
        gtotal = price * quantity - discount;
        tax = ((price * quantity) * Integer.parseInt(txt_createbill_tax.getText())) / 100;
        unpaid = Integer.parseInt(txt_createbill_unpaid.getText());
        nettotal = gtotal - unpaid;

        String[] rows =
        {
            custnm, contact, prodnm, Integer.toString(price), Integer.toString(quantity), Integer.toString(nettotal)
        };

        tableModel.addRow(rows);

        lbl_discount.setText(Integer.toString(Integer.parseInt(lbl_discount.getText()) + discount));
        lbl_grosstotal.setText(Integer.toString(Integer.parseInt(lbl_grosstotal.getText()) + gtotal));
        lbl_tax.setText(Integer.toString(Integer.parseInt(lbl_tax.getText()) + tax));
        lbl_unpaid.setText(Integer.toString(Integer.parseInt(lbl_unpaid.getText()) + unpaid));
        lbl_nettotal.setText(Integer.toString(Integer.parseInt(lbl_nettotal.getText()) + nettotal));

    }//GEN-LAST:event_btn_createbill_addActionPerformed

    private void btn_createbill_addKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_createbill_addKeyPressed
    {//GEN-HEADEREND:event_btn_createbill_addKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_createbill_addKeyPressed

    private void btn_createbill_saveFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_createbill_saveFocusGained
    {//GEN-HEADEREND:event_btn_createbill_saveFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_createbill_saveFocusGained

    private void btn_createbill_saveFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_createbill_saveFocusLost
    {//GEN-HEADEREND:event_btn_createbill_saveFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_createbill_saveFocusLost

    private void btn_createbill_saveMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_createbill_saveMouseEntered
    {//GEN-HEADEREND:event_btn_createbill_saveMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_createbill_saveMouseEntered

    private void btn_createbill_saveMouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_createbill_saveMouseExited
    {//GEN-HEADEREND:event_btn_createbill_saveMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_createbill_saveMouseExited

    private void btn_createbill_saveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_createbill_saveActionPerformed
    {//GEN-HEADEREND:event_btn_createbill_saveActionPerformed
        try
        {
            con = dbconnection.getdbConnection();
            query = "insert into bill values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pst = con.prepareStatement(query);
            pst.setString(1, lbl_billno_no.getText());
            pst.setString(2, txt_createbill_custid.getText());
            pst.setString(3, cmbbox_createbill_custnm.getSelectedItem().toString());
            pst.setString(4, txt_createbill_contact.getText());
            pst.setString(5, txt_createbill_addr.getText());
            pst.setString(6, lbl_tax.getText());
            pst.setString(7, lbl_discount.getText());
            pst.setString(8, lbl_grosstotal.getText());
            pst.setString(9, lbl_unpaid.getText());
            pst.setString(10, java.time.LocalDate.now().toString());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Bill Added Successfully");

            txtarea_format.append("\t\t Billing Application \n"
                    + "\n***************************************************************\n"
                    + "***************************************************************\n"
                    + "  Bill No. :                             " + lbl_billno_no.getText() + "\n"
                    + "  CUSTOMER NAME :                        " + cmbbox_createbill_custnm.getSelectedItem().toString() + "\n"
                    + "  CONTACT :                              " + txt_createbill_contact.getText() + "\n"
                    + "  ADDRESS :                              " + txt_createbill_addr.getText() + "\n"
                    + "===============================================================\n"
                    + "  Tax :                                  " + lbl_tax.getText() + "\n"
                    + "  Discount :                             " + lbl_discount.getText() + "\n"
                    + "  Total Amount :                         " + lbl_nettotal.getText() + "\n"
                    + "===============================================================\n"
                    + "  UNPAID :                               " + lbl_unpaid.getText() + "\n"
                    + "*************** Thank You for Shopping ********************\n");

            txtarea_format.print();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btn_createbill_saveActionPerformed

    private void btn_createbill_saveKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_createbill_saveKeyPressed
    {//GEN-HEADEREND:event_btn_createbill_saveKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_createbill_saveKeyPressed

    private void txt_createbill_unpaidActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txt_createbill_unpaidActionPerformed
    {//GEN-HEADEREND:event_txt_createbill_unpaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_createbill_unpaidActionPerformed

    private void cmbbox_modifybill_prodidActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmbbox_modifybill_prodidActionPerformed
    {//GEN-HEADEREND:event_cmbbox_modifybill_prodidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbbox_modifybill_prodidActionPerformed

    private void cmbbox_createbill_prodnmActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmbbox_createbill_prodnmActionPerformed
    {//GEN-HEADEREND:event_cmbbox_createbill_prodnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbbox_createbill_prodnmActionPerformed

    private void cmbbox_createbill_custnmActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmbbox_createbill_custnmActionPerformed
    {//GEN-HEADEREND:event_cmbbox_createbill_custnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbbox_createbill_custnmActionPerformed

    private void cmbbox_createbill_custnmItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_cmbbox_createbill_custnmItemStateChanged
    {//GEN-HEADEREND:event_cmbbox_createbill_custnmItemStateChanged
        String custnm = cmbbox_createbill_custnm.getSelectedItem().toString();

        if (custnm.equals("CUSTOMER NAME"))
        {
            txt_createbill_custid.setText("");
            txt_createbill_contact.setText("");
            txt_createbill_addr.setText("");
        }
        else
        {
            try
            {
                query = "select * from customer where custnm = '" + custnm + "'";
                con = dbconnection.getdbConnection();
                st = con.createStatement();
                result = st.executeQuery(query);

                if (result.next())
                {
                    txt_createbill_custid.setText(result.getString("id"));
                    txt_createbill_contact.setText(result.getString("contact"));
                    txt_createbill_addr.setText(result.getString("address"));
                }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_cmbbox_createbill_custnmItemStateChanged

    private void cmbbox_createbill_prodnmItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_cmbbox_createbill_prodnmItemStateChanged
    {//GEN-HEADEREND:event_cmbbox_createbill_prodnmItemStateChanged

        if (cmbbox_createbill_prodnm.getSelectedItem().equals("PRODUCT NAME"))
        {
            txt_createbill_prodid.setText("");
            txt_createbill_prodprice.setText("");
            spin_createbill_quantity.setValue(1);
        }
        else
        {
            String prodnm = cmbbox_createbill_prodnm.getSelectedItem().toString();

            try
            {
                query = "select * from product where nm like '" + prodnm + "'";
                con = dbconnection.getdbConnection();
                st = con.createStatement();
                result = st.executeQuery(query);

                if (result.next())
                {
                    txt_createbill_prodid.setText(result.getString("id"));
                    txt_createbill_prodprice.setText(result.getString("sellingprice"));
                    txt_createbill_discount.setText("0");
                    txt_createbill_tax.setText("0");
                    txt_createbill_unpaid.setText("0");
                    spin_createbill_quantity.setValue(1);
                }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

    }//GEN-LAST:event_cmbbox_createbill_prodnmItemStateChanged

    private void spin_createbill_quantityStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_spin_createbill_quantityStateChanged
    {//GEN-HEADEREND:event_spin_createbill_quantityStateChanged

    }//GEN-LAST:event_spin_createbill_quantityStateChanged

    private void txt_empdet_nmKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_empdet_nmKeyPressed
    {//GEN-HEADEREND:event_txt_empdet_nmKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_empdet_nmKeyPressed

    private void txt_addcust_contactKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_addcust_contactKeyTyped
    {//GEN-HEADEREND:event_txt_addcust_contactKeyTyped
        isDigit(evt, txt_addcust_contact);
    }//GEN-LAST:event_txt_addcust_contactKeyTyped

    private void txt_addcust_emailKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_addcust_emailKeyTyped
    {//GEN-HEADEREND:event_txt_addcust_emailKeyTyped

    }//GEN-LAST:event_txt_addcust_emailKeyTyped

    private void txt_editcust_contactKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txt_editcust_contactKeyTyped
    {//GEN-HEADEREND:event_txt_editcust_contactKeyTyped
        isDigit(evt, txt_editcust_contact);
    }//GEN-LAST:event_txt_editcust_contactKeyTyped

    public static void main(String args[])
    {

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Main().setVisible(true);
            }
        });
    }

    public void hover(JPanel panel, Color color)
    {
        panel.setBackground(color);
    }

    public void hover(KButton button, Color color, Color bg)
    {
        button.setkStartColor(color);
        button.setkEndColor(color);
        button.setBackground(bg);
    }

    public void visibility(boolean pnl_home, boolean pnl1, boolean pnl2, boolean pnl3, boolean pnl4, boolean pnl5, KButton btn, int keycode)
    {
        if (keycode == KeyEvent.VK_ENTER)
        {
            panel_home.setVisible(pnl_home);
            panel_customer.setVisible(pnl1);
            panel_employee.setVisible(pnl2);
            panel_product.setVisible(pnl3);
            panel_bill.setVisible(pnl5);
            panel_account.setVisible(pnl4);
            btn.grabFocus();
        }
    }

    public void visibility(boolean pnl_home, boolean pnl1, boolean pnl2, boolean pnl3, boolean pnl4, boolean pnl5, KButton btn)
    {
        panel_home.setVisible(pnl_home);
        panel_customer.setVisible(pnl1);
        panel_employee.setVisible(pnl2);
        panel_product.setVisible(pnl3);
        panel_bill.setVisible(pnl4);
        panel_account.setVisible(pnl5);
        btn.grabFocus();
    }

    public void visibility(KGradientPanel tabtoshow, KGradientPanel tab2, KGradientPanel tab3)
    {
        tabtoshow.setVisible(true);
        tab2.setVisible(false);
        tab3.setVisible(false);
    }

    public void visiblity(KGradientPanel tab1, boolean tab1bool, KGradientPanel tab2, boolean tab2bool, KGradientPanel tab3, boolean tab3bool)
    {
        tab1.setVisible(tab1bool);
        tab2.setVisible(tab2bool);
        tab3.setVisible(tab3bool);
    }

    public void onIndicator(KGradientPanel lid1, KGradientPanel lid2, KGradientPanel lid3)
    {
        lid1.setkStartColor(new Color(1, 109, 218));
        lid1.setkEndColor(new Color(1, 109, 218));
        lid1.setBackground(Color.white);

        lid2.setkStartColor(new Color(211, 211, 211));
        lid2.setkEndColor(new Color(211, 211, 211));
        lid2.setBackground(Color.black);

        lid3.setkStartColor(new Color(211, 211, 211));
        lid3.setkEndColor(new Color(211, 211, 211));
        lid3.setBackground(Color.black);
    }

    public void onIndicator(KGradientPanel lid1, KGradientPanel lid2)
    {
        lid1.setkStartColor(new Color(1, 109, 218));
        lid1.setkEndColor(new Color(1, 109, 218));
        lid1.setBackground(Color.white);

        lid2.setkStartColor(new Color(211, 211, 211));
        lid2.setkEndColor(new Color(211, 211, 211));
        lid2.setBackground(Color.black);
    }

    public void offIndicator(KGradientPanel lid1, Color color1, KGradientPanel lid2, Color color2)
    {
        lid1.setkStartColor(color1);
        lid1.setkEndColor(color1);
        lid1.setBackground(Color.black);

        lid2.setkStartColor(color2);
        lid2.setkEndColor(color2);
        lid2.setBackground(Color.black);
    }

    public String getMaxID(String tablenm)
    {
        String id;
        try
        {
            con = dbconnection.getdbConnection();
            query = "select max(cast(id as unsigned)) from " + tablenm;
            pst = con.prepareStatement(query);
            result = pst.executeQuery();

            if (result.next())
            {
                if (Integer.parseInt(result.getString(1)) > 0)
                {
                    return Integer.toString(Integer.parseInt(result.getString(1)) + 1);
                }
                else
                {
                    return "1";
                }
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "returned null");
        }
        return "1";
    }

    public void bindCustomerTableData(JTable table)
    {
        try
        {
            tableModel = (DefaultTableModel) table.getModel();
            tableModel.setRowCount(0);

            con = dbconnection.getdbConnection();
            query = "select * from customer";
            pst = con.prepareStatement(query);

            result = pst.executeQuery();

            String id, nm, contact, email, shpnm, addr;
            while (result.next())
            {
                id = result.getString(1);
                nm = result.getString(2);
                contact = result.getString(3);
                email = result.getString(4);
                shpnm = result.getString(5);
                addr = result.getString(6);

                String[] rows =
                {
                    id, nm, contact, email, shpnm, addr
                };

                tableModel.addRow(rows);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void bindEmployeeTableData(JTable table)
    {
        try
        {
            tableModel = (DefaultTableModel) table.getModel();
            tableModel.setRowCount(0);

            con = dbconnection.getdbConnection();
            query = "select * from employee";
            pst = con.prepareStatement(query);

            result = pst.executeQuery();

            String id, nm, usrnm, pswd, contact, email, salary, addr;
            while (result.next())
            {
                id = result.getString(1);
                nm = result.getString(2);
                usrnm = result.getString(3);
                pswd = result.getString(4);
                contact = result.getString(5);
                email = result.getString(6);
                salary = result.getString(7);
                addr = result.getString(8);

                String[] rows =
                {
                    id, nm, usrnm, pswd, contact, email, salary, addr
                };

                tableModel.addRow(rows);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void bindProductTableData(JTable table)
    {
        try
        {
            tableModel = (DefaultTableModel) table.getModel();
            tableModel.setRowCount(0);

            con = dbconnection.getdbConnection();
            query = "select * from product";
            pst = con.prepareStatement(query);

            result = pst.executeQuery();

            String id, nm, costprice, sellingprice, brand, quantity;
            while (result.next())
            {
                id = result.getString(1);
                nm = result.getString(2);
                costprice = result.getString(3);
                sellingprice = result.getString(4);
                brand = result.getString(5);
                quantity = result.getString(6);

                String[] rows =
                {
                    id, nm, costprice, sellingprice, brand, quantity
                };

                tableModel.addRow(rows);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public boolean isIdExist(String txtid, String tblnm)
    {
        try
        {
            con = dbconnection.getdbConnection();
            query = "select id from " + tblnm + " where id = ?";

            pst = con.prepareStatement(query);
            pst.setString(1, txtid);

            result = pst.executeQuery();

            if (result.next())
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }

    public void clearTextFields(TextField txt1, TextField txt2, TextField txt3, TextField txt4, TextField txt5, TextField txt6)
    {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        txt6.setText("");
    }

    public void clearTextFields(TextField txt1, TextField txt2, TextField txt3, TextField txt4, TextField txt5, TextField txt6, TextField txt7)
    {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        txt6.setText("");
        txt7.setText("");
    }

    public void clearTextFields(TextField txt1, TextField txt2, TextField txt3, PasswordField txt4, TextField txt5, TextField txt6, TextField txt7, TextField txt8)
    {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        txt6.setText("");
        txt7.setText("");
        txt8.setText("");
    }

    public void clearTextFields(TextField txt1, TextField txt2, TextField txt3, TextField txt4, ComboBoxSuggestion cmbbox, TextField txt6)
    {
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        cmbbox.setSelectedIndex(0);
        txt6.setText("");
    }

    public void fillCombobox(String tablename, String columnname, ComboBoxSuggestion cmbbox)
    {
        try
        {
            con = dbconnection.getdbConnection();
            query = "select * from " + tablename;
            st = con.createStatement();
            result = st.executeQuery(query);
            while (result.next())
            {
                cmbbox.addItem(result.getString(columnname));
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public boolean isFieldEmpty(TextField txt1, TextField txt2, TextField txt3, TextField txt4, TextField txt5, TextField txt6)
    {
        if (txt1.getText().equals(""))
        {
            txt1.grabFocus();
            return false;
        }
        else if (txt2.getText().equals(""))
        {
            txt2.grabFocus();
            return false;
        }
        else if (txt3.getText().equals(""))
        {
            txt3.grabFocus();
            return false;

        }
        else if (txt4.getText().equals(""))
        {
            txt4.grabFocus();
            return false;

        }
        else if (txt5.getText().equals(""))
        {
            txt5.grabFocus();
            return false;

        }
        else if (txt6.getText().equals(""))
        {
            txt6.grabFocus();
            return false;
        }
        else
        {
            return true;
        }
    }

    public boolean isFieldEmpty(TextField txt1, TextField txt2, TextField txt3, TextField txt4, TextField txt5)
    {
        if (txt1.getText().equals(""))
        {
            txt1.grabFocus();
            return false;
        }
        else if (txt2.getText().equals(""))
        {
            txt2.grabFocus();
            return false;
        }
        else if (txt3.getText().equals(""))
        {
            txt3.grabFocus();
            return false;

        }
        else if (txt4.getText().equals(""))
        {
            txt4.grabFocus();
            return false;

        }
        else if (txt5.getText().equals(""))
        {
            txt5.grabFocus();
            return false;

        }
        else
        {
            return true;
        }
    }

    public void isDigit(KeyEvent evt, TextField txt)
    {
        if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9' || txt.getText().length() == 10)
        {
            evt.consume();
        }
    }

    public boolean isCmbboxDefaultSelected(String str, combo_suggestion.ComboBoxSuggestion cmbbox)
    {
        if (cmbbox.getSelectedItem().equals(str))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnBill;
    private com.k33ptoo.components.KButton btnCustomer;
    private com.k33ptoo.components.KButton btnEmployee;
    private com.k33ptoo.components.KButton btnProduct;
    private com.k33ptoo.components.KButton btn_acc_menu2;
    private com.k33ptoo.components.KButton btn_acc_menu3;
    private com.k33ptoo.components.KButton btn_accsetting_menu;
    private com.k33ptoo.components.KButton btn_addcust_add;
    private com.k33ptoo.components.KButton btn_addcust_menu;
    private com.k33ptoo.components.KButton btn_addemp_add;
    private com.k33ptoo.components.KButton btn_addemp_menu;
    private com.k33ptoo.components.KButton btn_addprod;
    private com.k33ptoo.components.KButton btn_addprod_menu;
    private com.k33ptoo.components.KButton btn_createbill_add;
    private com.k33ptoo.components.KButton btn_createbill_menu;
    private com.k33ptoo.components.KButton btn_createbill_save;
    private com.k33ptoo.components.KButton btn_custdet;
    private com.k33ptoo.components.KButton btn_custdet_menu;
    private com.k33ptoo.components.KButton btn_editcust_edit;
    private com.k33ptoo.components.KButton btn_editcust_menu;
    private com.k33ptoo.components.KButton btn_editcust_rmv;
    private com.k33ptoo.components.KButton btn_editemp_edit;
    private com.k33ptoo.components.KButton btn_editemp_menu;
    private com.k33ptoo.components.KButton btn_editemp_rmv;
    private com.k33ptoo.components.KButton btn_editprod_edit;
    private com.k33ptoo.components.KButton btn_editprod_menu;
    private com.k33ptoo.components.KButton btn_editprod_rmv;
    private com.k33ptoo.components.KButton btn_empdet;
    private com.k33ptoo.components.KButton btn_empdet_menu;
    private com.k33ptoo.components.KButton btn_login;
    private com.k33ptoo.components.KButton btn_modifybill_menu;
    private com.k33ptoo.components.KButton btn_proddet;
    private com.k33ptoo.components.KButton btn_proddet_menu;
    private com.k33ptoo.components.KButton btnaccount;
    private combo_suggestion.ComboBoxSuggestion cmbbox_addprod_brand;
    private combo_suggestion.ComboBoxSuggestion cmbbox_createbill_custnm;
    private combo_suggestion.ComboBoxSuggestion cmbbox_createbill_prodnm;
    private combo_suggestion.ComboBoxSuggestion cmbbox_editprod_brand;
    private combo_suggestion.ComboBoxSuggestion cmbbox_login_usrnm;
    private combo_suggestion.ComboBoxSuggestion cmbbox_modifybill_prodid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_billno;
    private javax.swing.JLabel lbl_billno_no;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_createbill_custdet;
    private javax.swing.JLabel lbl_createbill_discount;
    private javax.swing.JLabel lbl_createbill_grosstotal;
    private javax.swing.JLabel lbl_createbill_nettotal;
    private javax.swing.JLabel lbl_createbill_proddet;
    private javax.swing.JLabel lbl_createbill_tax;
    private javax.swing.JLabel lbl_createbill_unpaid;
    private javax.swing.JLabel lbl_dash_usr;
    private javax.swing.JLabel lbl_dash_welcome;
    private javax.swing.JLabel lbl_discount;
    private javax.swing.JLabel lbl_forgot_pswd;
    private javax.swing.JLabel lbl_grosstotal;
    private javax.swing.JLabel lbl_login_img;
    private javax.swing.JLabel lbl_minimize;
    private javax.swing.JLabel lbl_modifybill_prodlisting;
    private javax.swing.JLabel lbl_nettotal;
    private javax.swing.JLabel lbl_pswd_icon;
    private javax.swing.JLabel lbl_role;
    private javax.swing.JLabel lbl_tax;
    private javax.swing.JLabel lbl_unpaid;
    private javax.swing.JLabel lbl_usr_icon;
    private com.k33ptoo.components.KGradientPanel lid_acc_menu2;
    private com.k33ptoo.components.KGradientPanel lid_acc_menu3;
    private com.k33ptoo.components.KGradientPanel lid_accsetting;
    private com.k33ptoo.components.KGradientPanel lid_add_cust;
    private com.k33ptoo.components.KGradientPanel lid_add_emp;
    private com.k33ptoo.components.KGradientPanel lid_addprod;
    private com.k33ptoo.components.KGradientPanel lid_createbill;
    private com.k33ptoo.components.KGradientPanel lid_cust_det;
    private com.k33ptoo.components.KGradientPanel lid_edit_cust;
    private com.k33ptoo.components.KGradientPanel lid_edit_emp;
    private com.k33ptoo.components.KGradientPanel lid_editprod;
    private com.k33ptoo.components.KGradientPanel lid_emp_det;
    private com.k33ptoo.components.KGradientPanel lid_modifybill;
    private com.k33ptoo.components.KGradientPanel lid_proddet;
    private com.k33ptoo.components.KGradientPanel panel_account;
    private com.k33ptoo.components.KGradientPanel panel_bg;
    private com.k33ptoo.components.KGradientPanel panel_bill;
    private com.k33ptoo.components.KGradientPanel panel_customer;
    private com.k33ptoo.components.KGradientPanel panel_dash_main;
    private com.k33ptoo.components.KGradientPanel panel_dash_menu;
    private javax.swing.JPanel panel_dashboard;
    private com.k33ptoo.components.KGradientPanel panel_employee;
    private javax.swing.JPanel panel_header;
    private com.k33ptoo.components.KGradientPanel panel_home;
    private javax.swing.JPanel panel_login;
    private com.k33ptoo.components.KGradientPanel panel_login_img;
    private com.k33ptoo.components.KGradientPanel panel_login_main;
    private com.k33ptoo.components.KGradientPanel panel_product;
    private com.k33ptoo.components.KGradientPanel pnl_acc_menu2;
    private com.k33ptoo.components.KGradientPanel pnl_acc_menu3;
    private com.k33ptoo.components.KGradientPanel pnl_acc_tab2;
    private com.k33ptoo.components.KGradientPanel pnl_acc_tab3;
    private com.k33ptoo.components.KGradientPanel pnl_account_main;
    private com.k33ptoo.components.KGradientPanel pnl_account_menubar;
    private com.k33ptoo.components.KGradientPanel pnl_accsetting;
    private com.k33ptoo.components.KGradientPanel pnl_accsetting_menu;
    private com.k33ptoo.components.KGradientPanel pnl_add_cust;
    private com.k33ptoo.components.KGradientPanel pnl_add_emp;
    private com.k33ptoo.components.KGradientPanel pnl_add_prod;
    private com.k33ptoo.components.KGradientPanel pnl_addcust_menu;
    private com.k33ptoo.components.KGradientPanel pnl_addemp_menu;
    private com.k33ptoo.components.KGradientPanel pnl_addprod_menu;
    private com.k33ptoo.components.KGradientPanel pnl_bill_main;
    private com.k33ptoo.components.KGradientPanel pnl_bill_menubar;
    private com.k33ptoo.components.KGradientPanel pnl_bill_tab3;
    private javax.swing.JPanel pnl_calc;
    private javax.swing.JPanel pnl_close;
    private com.k33ptoo.components.KGradientPanel pnl_createbill;
    private com.k33ptoo.components.KGradientPanel pnl_createbill_menu;
    private com.k33ptoo.components.KGradientPanel pnl_cust_det;
    private com.k33ptoo.components.KGradientPanel pnl_cust_det_menu;
    private com.k33ptoo.components.KGradientPanel pnl_cust_menubar;
    private com.k33ptoo.components.KGradientPanel pnl_customer_main;
    private com.k33ptoo.components.KGradientPanel pnl_edit_cust;
    private com.k33ptoo.components.KGradientPanel pnl_edit_cust_menu;
    private com.k33ptoo.components.KGradientPanel pnl_edit_emp;
    private com.k33ptoo.components.KGradientPanel pnl_edit_prod;
    private com.k33ptoo.components.KGradientPanel pnl_editemp_menu;
    private com.k33ptoo.components.KGradientPanel pnl_editprod_menu;
    private com.k33ptoo.components.KGradientPanel pnl_emp_det;
    private com.k33ptoo.components.KGradientPanel pnl_emp_menubar;
    private com.k33ptoo.components.KGradientPanel pnl_empdet_menu;
    private com.k33ptoo.components.KGradientPanel pnl_employee_main;
    private com.k33ptoo.components.KGradientPanel pnl_menu_head;
    private javax.swing.JPanel pnl_minimize;
    private com.k33ptoo.components.KGradientPanel pnl_modifybill;
    private com.k33ptoo.components.KGradientPanel pnl_modifybill_menu;
    private com.k33ptoo.components.KGradientPanel pnl_prod_det;
    private com.k33ptoo.components.KGradientPanel pnl_prod_main;
    private com.k33ptoo.components.KGradientPanel pnl_prod_menubar;
    private com.k33ptoo.components.KGradientPanel pnl_proddet_menu;
    private javax.swing.JScrollPane scroll_createbill;
    private javax.swing.JScrollPane scrolltbl_custdet;
    private javax.swing.JScrollPane scrolltbl_editcust;
    private javax.swing.JScrollPane scrolltbl_editemp;
    private javax.swing.JScrollPane scrolltbl_editprod;
    private javax.swing.JScrollPane scrolltbl_empdet;
    private javax.swing.JScrollPane scrolltbl_proddet;
    private spinner.Spinner spin_createbill_quantity;
    private spinner.Spinner spin_modifybill_quantity;
    private javax.swing.JTable table_createbill;
    private javax.swing.JTable table_custdet;
    private javax.swing.JTable table_editcust;
    private javax.swing.JTable table_editemp;
    private javax.swing.JTable table_editprod;
    private javax.swing.JTable table_empdet;
    private javax.swing.JTable table_proddet;
    private textfield.TextField txt_addcust_contact;
    private textfield.TextField txt_addcust_email;
    private textfield.TextField txt_addcust_id;
    private textfield.TextField txt_addcust_nm;
    private textfield.TextField txt_addcust_shopaddr;
    private textfield.TextField txt_addcust_shopnm;
    private textfield.TextField txt_addemp_addr;
    private textfield.TextField txt_addemp_contact;
    private textfield.TextField txt_addemp_email;
    private textfield.TextField txt_addemp_id;
    private textfield.TextField txt_addemp_nm;
    private textfield.PasswordField txt_addemp_pswd;
    private textfield.TextField txt_addemp_salary;
    private textfield.TextField txt_addemp_usrnm;
    private textfield.TextField txt_addprod_costprice;
    private textfield.TextField txt_addprod_id;
    private textfield.TextField txt_addprod_nm;
    private textfield.TextField txt_addprod_quantity;
    private textfield.TextField txt_addprod_sellingprice;
    private textfield.TextField txt_createbill_addr;
    private textfield.TextField txt_createbill_contact;
    private textfield.TextField txt_createbill_custid;
    private textfield.TextField txt_createbill_discount;
    private textfield.TextField txt_createbill_prodid;
    private textfield.TextField txt_createbill_prodprice;
    private textfield.TextField txt_createbill_tax;
    private textfield.TextField txt_createbill_unpaid;
    private textfield.TextField txt_custdet_custnm;
    private textfield.TextField txt_editcust_contact;
    private textfield.TextField txt_editcust_email;
    private textfield.TextField txt_editcust_id;
    private textfield.TextField txt_editcust_nm;
    private textfield.TextField txt_editcust_shopaddr;
    private textfield.TextField txt_editcust_shopnm;
    private textfield.TextField txt_editemp_addr;
    private textfield.TextField txt_editemp_contact;
    private textfield.TextField txt_editemp_email;
    private textfield.TextField txt_editemp_nm;
    private textfield.PasswordField txt_editemp_pswd;
    private textfield.TextField txt_editemp_salary;
    private textfield.TextField txt_editemp_usrnm;
    private textfield.TextField txt_editprod_costprice;
    private textfield.TextField txt_editprod_id;
    private textfield.TextField txt_editprod_nm;
    private textfield.TextField txt_editprod_quantity;
    private textfield.TextField txt_editprod_sellingprice;
    private textfield.TextField txt_empdet_nm;
    private textfield.PasswordField txt_login_pswd;
    private textfield.TextField txt_modifybill_discount;
    private textfield.TextField txt_modifybill_prodnm;
    private textfield.TextField txt_modifybill_prodprice;
    private textfield.TextField txt_modifybill_tax;
    private textfield.TextField txt_proddet_nm;
    private javax.swing.JTextArea txtarea_format;
    // End of variables declaration//GEN-END:variables
}
