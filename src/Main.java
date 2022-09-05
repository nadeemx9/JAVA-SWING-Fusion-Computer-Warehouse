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

        cmbbox_role.grabFocus();

        panel_dashboard.setVisible(false);
        lbl_role.grabFocus();

        con = dbconnection.getdbConnection();
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
        cmbbox_role = new combo_suggestion.ComboBoxSuggestion();
        lbl_role = new javax.swing.JLabel();
        lbl_usr_icon = new javax.swing.JLabel();
        lbl_pswd_icon = new javax.swing.JLabel();
        txt_pswd = new textfield.PasswordField();
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
        btnReport = new com.k33ptoo.components.KButton();
        btnUser = new com.k33ptoo.components.KButton();
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
        txt_custdet_custid = new textfield.TextField();
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
        txt_addemp_cpswd = new textfield.PasswordField();
        pnl_edit_emp = new com.k33ptoo.components.KGradientPanel();
        scrolltbl_editemp = new javax.swing.JScrollPane();
        table_editemp = new javax.swing.JTable();
        txt_editemp_id = new textfield.TextField();
        txt_editemp_nm = new textfield.TextField();
        txt_editemp_contact = new textfield.TextField();
        txt_editemp_email = new textfield.TextField();
        txt_editemp_salary = new textfield.TextField();
        txt_editemp_addr = new textfield.TextField();
        btn_editemp_edit = new com.k33ptoo.components.KButton();
        btn_editemp_rmv = new com.k33ptoo.components.KButton();
        txt_editemp_pswd = new textfield.PasswordField();
        pnl_emp_det = new com.k33ptoo.components.KGradientPanel();
        txt_empdet_id = new textfield.TextField();
        scrolltbl_empdet = new javax.swing.JScrollPane();
        table_empdet = new javax.swing.JTable();
        btn_empdet = new com.k33ptoo.components.KButton();
        panel_product = new com.k33ptoo.components.KGradientPanel();
        pnl_prod_menubar = new com.k33ptoo.components.KGradientPanel();
        pnl_add_prod_menu = new com.k33ptoo.components.KGradientPanel();
        btn_addprod_menu = new com.k33ptoo.components.KButton();
        lid3_1 = new com.k33ptoo.components.KGradientPanel();
        pnl_edit_prod_menu = new com.k33ptoo.components.KGradientPanel();
        btn_editprod_menu = new com.k33ptoo.components.KButton();
        lid3_2 = new com.k33ptoo.components.KGradientPanel();
        pnl1_menu18 = new com.k33ptoo.components.KGradientPanel();
        btn_proddet_menu = new com.k33ptoo.components.KButton();
        lid3_3 = new com.k33ptoo.components.KGradientPanel();
        pnl_prod_main = new com.k33ptoo.components.KGradientPanel();
        pnl_add_product = new com.k33ptoo.components.KGradientPanel();
        txt_addprod_id = new textfield.TextField();
        txt_addprod_costprice = new textfield.TextField();
        txt_addprod_sellingprice = new textfield.TextField();
        cmbbox_addprod_brand = new combo_suggestion.ComboBoxSuggestion();
        txt_addprod_nm = new textfield.TextField();
        btn_addprod = new com.k33ptoo.components.KButton();
        txt_addprod_quantity = new textfield.TextField();
        pnl_edit_product = new com.k33ptoo.components.KGradientPanel();
        pnl3_tab3 = new com.k33ptoo.components.KGradientPanel();
        jLabel17 = new javax.swing.JLabel();
        panel_report = new com.k33ptoo.components.KGradientPanel();
        pnl5_menubar = new com.k33ptoo.components.KGradientPanel();
        pnl1_menu10 = new com.k33ptoo.components.KGradientPanel();
        btn_pnl5_tab1 = new com.k33ptoo.components.KButton();
        lid5_1 = new com.k33ptoo.components.KGradientPanel();
        pnl1_menu11 = new com.k33ptoo.components.KGradientPanel();
        btn_pnl5_tab2 = new com.k33ptoo.components.KButton();
        lid5_2 = new com.k33ptoo.components.KGradientPanel();
        pnl1_menu12 = new com.k33ptoo.components.KGradientPanel();
        btn_pnl5_tab3 = new com.k33ptoo.components.KButton();
        lid5_3 = new com.k33ptoo.components.KGradientPanel();
        pnl5_main = new com.k33ptoo.components.KGradientPanel();
        pnl5_tab1 = new com.k33ptoo.components.KGradientPanel();
        jLabel21 = new javax.swing.JLabel();
        pnl5_tab2 = new com.k33ptoo.components.KGradientPanel();
        jLabel22 = new javax.swing.JLabel();
        pnl5_tab3 = new com.k33ptoo.components.KGradientPanel();
        jLabel23 = new javax.swing.JLabel();
        panel_usermanual = new com.k33ptoo.components.KGradientPanel();
        staff_menubar = new com.k33ptoo.components.KGradientPanel();
        pnl1_menu7 = new com.k33ptoo.components.KGradientPanel();
        btn_pnl4_tab1 = new com.k33ptoo.components.KButton();
        lid4_1 = new com.k33ptoo.components.KGradientPanel();
        pnl1_menu8 = new com.k33ptoo.components.KGradientPanel();
        btn_pnl4_tab2 = new com.k33ptoo.components.KButton();
        lid4_2 = new com.k33ptoo.components.KGradientPanel();
        pnl1_menu9 = new com.k33ptoo.components.KGradientPanel();
        btn_pnl4_tab3 = new com.k33ptoo.components.KButton();
        lid4_3 = new com.k33ptoo.components.KGradientPanel();
        pnl_staff_main = new com.k33ptoo.components.KGradientPanel();
        pnl4_tab1 = new com.k33ptoo.components.KGradientPanel();
        jLabel18 = new javax.swing.JLabel();
        pnl4_tab2 = new com.k33ptoo.components.KGradientPanel();
        jLabel19 = new javax.swing.JLabel();
        pnl4_tab3 = new com.k33ptoo.components.KGradientPanel();
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

        cmbbox_role.setBackground(new java.awt.Color(255, 167, 6));
        cmbbox_role.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbbox_role.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Nadeem", "Employee" }));
        cmbbox_role.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        cmbbox_role.setMaximumSize(new java.awt.Dimension(415, 64));
        cmbbox_role.setMinimumSize(new java.awt.Dimension(415, 64));
        cmbbox_role.setNextFocusableComponent(txt_pswd);
        cmbbox_role.setPreferredSize(new java.awt.Dimension(415, 64));
        cmbbox_role.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmbbox_roleActionPerformed(evt);
            }
        });

        lbl_role.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        lbl_role.setText("Select Role :");
        lbl_role.setMaximumSize(new java.awt.Dimension(500, 64));
        lbl_role.setMinimumSize(new java.awt.Dimension(500, 64));
        lbl_role.setNextFocusableComponent(cmbbox_role);
        lbl_role.setPreferredSize(new java.awt.Dimension(500, 64));

        lbl_usr_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/user.png"))); // NOI18N

        lbl_pswd_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/padlock.png"))); // NOI18N

        txt_pswd.setBackground(new java.awt.Color(150, 195, 248));
        txt_pswd.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_pswd.setLabelText("Password");
        txt_pswd.setLineColor(new java.awt.Color(255, 167, 6));
        txt_pswd.setMaximumSize(new java.awt.Dimension(415, 64));
        txt_pswd.setMinimumSize(new java.awt.Dimension(415, 64));
        txt_pswd.setNextFocusableComponent(btn_login);
        txt_pswd.setPreferredSize(new java.awt.Dimension(415, 64));
        txt_pswd.setShowAndHide(true);

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
        btn_login.setNextFocusableComponent(cmbbox_role);
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
                            .addComponent(txt_pswd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbbox_role, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(cmbbox_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_usr_icon))
                .addGap(50, 50, 50)
                .addGroup(panel_login_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_pswd_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_pswd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        btnProduct.setNextFocusableComponent(btnReport);
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

        btnReport.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnReport.setText("REPORT");
        btnReport.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btnReport.setkBorderRadius(30);
        btnReport.setkEndColor(new java.awt.Color(255, 167, 6));
        btnReport.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btnReport.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnReport.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btnReport.setkPressedColor(new java.awt.Color(255, 167, 6));
        btnReport.setkStartColor(new java.awt.Color(255, 167, 6));
        btnReport.setNextFocusableComponent(btnUser);
        btnReport.setPreferredSize(new java.awt.Dimension(450, 60));
        btnReport.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btnReportFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btnReportFocusLost(evt);
            }
        });
        btnReport.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btnReportMouseEntered(evt);
            }
        });
        btnReport.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnReportActionPerformed(evt);
            }
        });
        btnReport.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btnReportKeyPressed(evt);
            }
        });

        btnUser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnUser.setText("USER MANUAL");
        btnUser.setToolTipText("");
        btnUser.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btnUser.setkBorderRadius(30);
        btnUser.setkEndColor(new java.awt.Color(255, 167, 6));
        btnUser.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btnUser.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnUser.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btnUser.setkPressedColor(new java.awt.Color(255, 167, 6));
        btnUser.setkStartColor(new java.awt.Color(255, 167, 6));
        btnUser.setNextFocusableComponent(btnCustomer);
        btnUser.setPreferredSize(new java.awt.Dimension(450, 60));
        btnUser.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btnUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btnUserFocusLost(evt);
            }
        });
        btnUser.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btnUserMouseEntered(evt);
            }
        });
        btnUser.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnUserActionPerformed(evt);
            }
        });
        btnUser.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btnUserKeyPressed(evt);
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
                    .addComponent(btnReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        txt_addcust_id.setBackground(new java.awt.Color(150, 195, 248));
        txt_addcust_id.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addcust_id.setLabelText("CUSTOMER ID");
        txt_addcust_id.setLineColor(new java.awt.Color(255, 167, 6));
        txt_addcust_id.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addcust_id.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_addcust_nm.setBackground(new java.awt.Color(150, 195, 248));
        txt_addcust_nm.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addcust_nm.setLabelText("CUSTOMER NAME");
        txt_addcust_nm.setLineColor(new java.awt.Color(255, 167, 6));
        txt_addcust_nm.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addcust_nm.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_addcust_contact.setBackground(new java.awt.Color(150, 195, 248));
        txt_addcust_contact.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addcust_contact.setLabelText("CONTACT NO");
        txt_addcust_contact.setLineColor(new java.awt.Color(255, 167, 6));
        txt_addcust_contact.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addcust_contact.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_addcust_email.setBackground(new java.awt.Color(150, 195, 248));
        txt_addcust_email.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addcust_email.setLabelText("EMAIL");
        txt_addcust_email.setLineColor(new java.awt.Color(255, 167, 6));
        txt_addcust_email.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addcust_email.setNextFocusableComponent(txt_addcust_shopnm);
        txt_addcust_email.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_addcust_shopaddr.setBackground(new java.awt.Color(150, 195, 248));
        txt_addcust_shopaddr.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addcust_shopaddr.setLabelText("SHOP ADDRESS");
        txt_addcust_shopaddr.setLineColor(new java.awt.Color(255, 167, 6));
        txt_addcust_shopaddr.setNextFocusableComponent(btn_addcust_add);
        txt_addcust_shopaddr.setPreferredSize(new java.awt.Dimension(404, 128));

        txt_addcust_shopnm.setBackground(new java.awt.Color(150, 195, 248));
        txt_addcust_shopnm.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addcust_shopnm.setLabelText(" SHOP NAME (optional)");
        txt_addcust_shopnm.setLineColor(new java.awt.Color(255, 167, 6));
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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String []
            {
                "ID", "NAME", "CONTACT", "EMAIL", "SHOP NAME"
            }
        ));
        table_editcust.setPreferredSize(new java.awt.Dimension(908, 300));
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
        txt_editcust_contact.setLineColor(new java.awt.Color(255, 167, 6));
        txt_editcust_contact.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editcust_contact.setNextFocusableComponent(txt_editcust_email);
        txt_editcust_contact.setPreferredSize(new java.awt.Dimension(250, 64));

        txt_editcust_nm.setBackground(new java.awt.Color(150, 195, 248));
        txt_editcust_nm.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editcust_nm.setLabelText("CUSTOMER NAME");
        txt_editcust_nm.setLineColor(new java.awt.Color(255, 167, 6));
        txt_editcust_nm.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editcust_nm.setNextFocusableComponent(txt_editcust_contact);
        txt_editcust_nm.setPreferredSize(new java.awt.Dimension(250, 64));

        txt_editcust_email.setBackground(new java.awt.Color(150, 195, 248));
        txt_editcust_email.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editcust_email.setLabelText("EMAIL");
        txt_editcust_email.setLineColor(new java.awt.Color(255, 167, 6));
        txt_editcust_email.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editcust_email.setNextFocusableComponent(txt_editcust_shopnm);
        txt_editcust_email.setPreferredSize(new java.awt.Dimension(250, 64));

        txt_editcust_shopnm.setBackground(new java.awt.Color(150, 195, 248));
        txt_editcust_shopnm.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editcust_shopnm.setLabelText("SHOP NAME");
        txt_editcust_shopnm.setLineColor(new java.awt.Color(255, 167, 6));
        txt_editcust_shopnm.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editcust_shopnm.setNextFocusableComponent(txt_editcust_shopaddr);
        txt_editcust_shopnm.setPreferredSize(new java.awt.Dimension(250, 64));

        txt_editcust_shopaddr.setBackground(new java.awt.Color(150, 195, 248));
        txt_editcust_shopaddr.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editcust_shopaddr.setLabelText("SHOP ADDRESS");
        txt_editcust_shopaddr.setLineColor(new java.awt.Color(255, 167, 6));
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
        txt_editcust_id.setLineColor(new java.awt.Color(255, 167, 6));
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

        txt_custdet_custid.setBackground(new java.awt.Color(150, 195, 248));
        txt_custdet_custid.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_custdet_custid.setLabelText("CUSTOMER ID");
        txt_custdet_custid.setLineColor(new java.awt.Color(255, 167, 6));
        txt_custdet_custid.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_custdet_custid.setNextFocusableComponent(btn_custdet);
        txt_custdet_custid.setPreferredSize(new java.awt.Dimension(404, 64));

        scrolltbl_custdet.setPreferredSize(new java.awt.Dimension(908, 400));

        table_custdet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String []
            {
                "ID", "NAME", "CONTACT", "EMAIL", "SHOP NAME"
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
        btn_custdet.setNextFocusableComponent(txt_custdet_custid);
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
                    .addComponent(txt_custdet_custid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_custdet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrolltbl_custdet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        pnl_cust_detLayout.setVerticalGroup(
            pnl_cust_detLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_cust_detLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(txt_custdet_custid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        txt_addemp_id.setLineColor(new java.awt.Color(255, 167, 6));
        txt_addemp_id.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addemp_id.setNextFocusableComponent(txt_addemp_nm);
        txt_addemp_id.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_addemp_nm.setBackground(new java.awt.Color(150, 195, 248));
        txt_addemp_nm.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addemp_nm.setLabelText("EMPLOYEE NAME");
        txt_addemp_nm.setLineColor(new java.awt.Color(255, 167, 6));
        txt_addemp_nm.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addemp_nm.setNextFocusableComponent(txt_addemp_contact);
        txt_addemp_nm.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_addemp_contact.setBackground(new java.awt.Color(150, 195, 248));
        txt_addemp_contact.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addemp_contact.setLabelText("CONTACT NO");
        txt_addemp_contact.setLineColor(new java.awt.Color(255, 167, 6));
        txt_addemp_contact.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addemp_contact.setNextFocusableComponent(txt_addemp_email);
        txt_addemp_contact.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_addemp_email.setBackground(new java.awt.Color(150, 195, 248));
        txt_addemp_email.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addemp_email.setLabelText("EMAIL");
        txt_addemp_email.setLineColor(new java.awt.Color(255, 167, 6));
        txt_addemp_email.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addemp_email.setNextFocusableComponent(txt_addemp_salary);
        txt_addemp_email.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_addemp_salary.setBackground(new java.awt.Color(150, 195, 248));
        txt_addemp_salary.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addemp_salary.setLabelText("SALARY");
        txt_addemp_salary.setLineColor(new java.awt.Color(255, 167, 6));
        txt_addemp_salary.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addemp_salary.setNextFocusableComponent(txt_addemp_addr);
        txt_addemp_salary.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_addemp_addr.setBackground(new java.awt.Color(150, 195, 248));
        txt_addemp_addr.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addemp_addr.setLabelText("ADDRESS");
        txt_addemp_addr.setLineColor(new java.awt.Color(255, 167, 6));
        txt_addemp_addr.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addemp_addr.setNextFocusableComponent(txt_addemp_pswd);
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
        txt_addemp_pswd.setLineColor(new java.awt.Color(255, 167, 6));
        txt_addemp_pswd.setNextFocusableComponent(txt_addemp_cpswd);
        txt_addemp_pswd.setPreferredSize(new java.awt.Dimension(404, 64));
        txt_addemp_pswd.setShowAndHide(true);

        txt_addemp_cpswd.setBackground(new java.awt.Color(150, 195, 248));
        txt_addemp_cpswd.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt_addemp_cpswd.setLabelText("CONFIRM PASSWORD");
        txt_addemp_cpswd.setLineColor(new java.awt.Color(255, 167, 6));
        txt_addemp_cpswd.setNextFocusableComponent(btn_addemp_add);
        txt_addemp_cpswd.setPreferredSize(new java.awt.Dimension(404, 64));
        txt_addemp_cpswd.setShowAndHide(true);

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
                    .addComponent(txt_addemp_pswd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(pnl_add_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_addemp_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_addemp_addr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_addemp_nm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_addemp_cpswd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(txt_addemp_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_addemp_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(pnl_add_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_addemp_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_addemp_addr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(pnl_add_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_addemp_pswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_addemp_cpswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btn_addemp_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String []
            {
                "ID", "NAME", "CONTACT", "EMAIL", "SALARY", "ADDRESS"
            }
        ));
        table_editemp.setPreferredSize(new java.awt.Dimension(527, 336));
        scrolltbl_editemp.setViewportView(table_editemp);

        txt_editemp_id.setBackground(new java.awt.Color(150, 195, 248));
        txt_editemp_id.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editemp_id.setLabelText("EMPLOYEE ID");
        txt_editemp_id.setLineColor(new java.awt.Color(255, 167, 6));
        txt_editemp_id.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editemp_id.setNextFocusableComponent(txt_editemp_nm);
        txt_editemp_id.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_editemp_nm.setBackground(new java.awt.Color(150, 195, 248));
        txt_editemp_nm.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editemp_nm.setLabelText("EMPLOYEE NAME");
        txt_editemp_nm.setLineColor(new java.awt.Color(255, 167, 6));
        txt_editemp_nm.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editemp_nm.setNextFocusableComponent(txt_editemp_contact);
        txt_editemp_nm.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_editemp_contact.setBackground(new java.awt.Color(150, 195, 248));
        txt_editemp_contact.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editemp_contact.setLabelText("CONTACT");
        txt_editemp_contact.setLineColor(new java.awt.Color(255, 167, 6));
        txt_editemp_contact.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editemp_contact.setNextFocusableComponent(txt_editemp_email);
        txt_editemp_contact.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_editemp_email.setBackground(new java.awt.Color(150, 195, 248));
        txt_editemp_email.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editemp_email.setLabelText("EMAIL");
        txt_editemp_email.setLineColor(new java.awt.Color(255, 167, 6));
        txt_editemp_email.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editemp_email.setNextFocusableComponent(txt_editemp_salary);
        txt_editemp_email.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_editemp_salary.setBackground(new java.awt.Color(150, 195, 248));
        txt_editemp_salary.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editemp_salary.setLabelText("SALARY");
        txt_editemp_salary.setLineColor(new java.awt.Color(255, 167, 6));
        txt_editemp_salary.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_editemp_salary.setNextFocusableComponent(txt_editemp_addr);
        txt_editemp_salary.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_editemp_addr.setBackground(new java.awt.Color(150, 195, 248));
        txt_editemp_addr.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_editemp_addr.setLabelText("ADDRESS");
        txt_editemp_addr.setLineColor(new java.awt.Color(255, 167, 6));
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
        btn_editemp_rmv.setNextFocusableComponent(txt_editemp_id);
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
        txt_editemp_pswd.setNextFocusableComponent(txt_addemp_cpswd);
        txt_editemp_pswd.setPreferredSize(new java.awt.Dimension(404, 64));
        txt_editemp_pswd.setShowAndHide(true);

        javax.swing.GroupLayout pnl_edit_empLayout = new javax.swing.GroupLayout(pnl_edit_emp);
        pnl_edit_emp.setLayout(pnl_edit_empLayout);
        pnl_edit_empLayout.setHorizontalGroup(
            pnl_edit_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_edit_empLayout.createSequentialGroup()
                .addGroup(pnl_edit_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_edit_empLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_editemp_pswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(txt_editemp_addr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_editemp_salary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_editemp_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_editemp_contact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_editemp_nm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_editemp_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50))
        );
        pnl_edit_empLayout.setVerticalGroup(
            pnl_edit_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_edit_empLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(txt_editemp_pswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_edit_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_edit_empLayout.createSequentialGroup()
                        .addComponent(txt_editemp_id, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_editemp_nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_editemp_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_editemp_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_editemp_salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_editemp_addr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_edit_empLayout.createSequentialGroup()
                        .addComponent(scrolltbl_editemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnl_edit_empLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_editemp_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_editemp_rmv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pnl_emp_det.setkBorderRadius(40);
        pnl_emp_det.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_emp_det.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_emp_det.setOpaque(false);
        pnl_emp_det.setPreferredSize(new java.awt.Dimension(1108, 672));

        txt_empdet_id.setBackground(new java.awt.Color(150, 195, 248));
        txt_empdet_id.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_empdet_id.setLabelText("EMPLOYEE ID");
        txt_empdet_id.setLineColor(new java.awt.Color(255, 167, 6));
        txt_empdet_id.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_empdet_id.setNextFocusableComponent(btn_empdet);
        txt_empdet_id.setPreferredSize(new java.awt.Dimension(404, 64));

        scrolltbl_empdet.setPreferredSize(new java.awt.Dimension(908, 400));

        table_empdet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String []
            {
                "ID", "NAME", "CONTACT", "EMAIL", "SALARY", "Title 6"
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
        btn_empdet.setNextFocusableComponent(txt_empdet_id);
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
                    .addComponent(txt_empdet_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_empdet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrolltbl_empdet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        pnl_emp_detLayout.setVerticalGroup(
            pnl_emp_detLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_emp_detLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(txt_empdet_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        pnl_add_prod_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl_add_prod_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl_add_prod_menu.setOpaque(false);
        pnl_add_prod_menu.setPreferredSize(new java.awt.Dimension(200, 60));

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

        lid3_1.setBackground(new java.awt.Color(225, 223, 223));
        lid3_1.setkBorderRadius(15);
        lid3_1.setkEndColor(new java.awt.Color(211, 211, 211));
        lid3_1.setkStartColor(new java.awt.Color(211, 211, 211));
        lid3_1.setOpaque(false);
        lid3_1.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid3_1Layout = new javax.swing.GroupLayout(lid3_1);
        lid3_1.setLayout(lid3_1Layout);
        lid3_1Layout.setHorizontalGroup(
            lid3_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid3_1Layout.setVerticalGroup(
            lid3_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_add_prod_menuLayout = new javax.swing.GroupLayout(pnl_add_prod_menu);
        pnl_add_prod_menu.setLayout(pnl_add_prod_menuLayout);
        pnl_add_prod_menuLayout.setHorizontalGroup(
            pnl_add_prod_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_add_prod_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_add_prod_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid3_1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_addprod_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_add_prod_menuLayout.setVerticalGroup(
            pnl_add_prod_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_add_prod_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_addprod_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid3_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnl_edit_prod_menu.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl_edit_prod_menu.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl_edit_prod_menu.setOpaque(false);
        pnl_edit_prod_menu.setPreferredSize(new java.awt.Dimension(200, 60));

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

        lid3_2.setBackground(new java.awt.Color(225, 223, 223));
        lid3_2.setkBorderRadius(15);
        lid3_2.setkEndColor(new java.awt.Color(211, 211, 211));
        lid3_2.setkStartColor(new java.awt.Color(211, 211, 211));
        lid3_2.setOpaque(false);
        lid3_2.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid3_2Layout = new javax.swing.GroupLayout(lid3_2);
        lid3_2.setLayout(lid3_2Layout);
        lid3_2Layout.setHorizontalGroup(
            lid3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid3_2Layout.setVerticalGroup(
            lid3_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_edit_prod_menuLayout = new javax.swing.GroupLayout(pnl_edit_prod_menu);
        pnl_edit_prod_menu.setLayout(pnl_edit_prod_menuLayout);
        pnl_edit_prod_menuLayout.setHorizontalGroup(
            pnl_edit_prod_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_edit_prod_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_edit_prod_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid3_2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_editprod_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_edit_prod_menuLayout.setVerticalGroup(
            pnl_edit_prod_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_edit_prod_menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_editprod_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid3_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl1_menu18.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl1_menu18.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl1_menu18.setOpaque(false);
        pnl1_menu18.setPreferredSize(new java.awt.Dimension(200, 60));

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

        lid3_3.setBackground(new java.awt.Color(225, 223, 223));
        lid3_3.setkBorderRadius(15);
        lid3_3.setkEndColor(new java.awt.Color(211, 211, 211));
        lid3_3.setkStartColor(new java.awt.Color(211, 211, 211));
        lid3_3.setOpaque(false);
        lid3_3.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid3_3Layout = new javax.swing.GroupLayout(lid3_3);
        lid3_3.setLayout(lid3_3Layout);
        lid3_3Layout.setHorizontalGroup(
            lid3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid3_3Layout.setVerticalGroup(
            lid3_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl1_menu18Layout = new javax.swing.GroupLayout(pnl1_menu18);
        pnl1_menu18.setLayout(pnl1_menu18Layout);
        pnl1_menu18Layout.setHorizontalGroup(
            pnl1_menu18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1_menu18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid3_3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_proddet_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl1_menu18Layout.setVerticalGroup(
            pnl1_menu18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_proddet_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid3_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnl_prod_menubarLayout = new javax.swing.GroupLayout(pnl_prod_menubar);
        pnl_prod_menubar.setLayout(pnl_prod_menubarLayout);
        pnl_prod_menubarLayout.setHorizontalGroup(
            pnl_prod_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_prod_menubarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pnl_add_prod_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_edit_prod_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(pnl1_menu18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(418, Short.MAX_VALUE))
        );
        pnl_prod_menubarLayout.setVerticalGroup(
            pnl_prod_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_prod_menubarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl_prod_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_add_prod_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl1_menu18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_edit_prod_menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pnl_prod_main.setkBorderRadius(40);
        pnl_prod_main.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_prod_main.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_prod_main.setOpaque(false);
        pnl_prod_main.setPreferredSize(new java.awt.Dimension(1108, 672));

        pnl_add_product.setkBorderRadius(40);
        pnl_add_product.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_add_product.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_add_product.setOpaque(false);
        pnl_add_product.setPreferredSize(new java.awt.Dimension(1108, 672));

        txt_addprod_id.setBackground(new java.awt.Color(150, 195, 248));
        txt_addprod_id.setFocusCycleRoot(true);
        txt_addprod_id.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addprod_id.setLabelText("PRODUCT ID");
        txt_addprod_id.setLineColor(new java.awt.Color(255, 167, 6));
        txt_addprod_id.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addprod_id.setNextFocusableComponent(txt_addprod_nm);
        txt_addprod_id.setPreferredSize(new java.awt.Dimension(404, 64));

        txt_addprod_costprice.setBackground(new java.awt.Color(150, 195, 248));
        txt_addprod_costprice.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        txt_addprod_costprice.setLabelText("COST PRICE");
        txt_addprod_costprice.setLineColor(new java.awt.Color(255, 167, 6));
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
        txt_addprod_sellingprice.setLineColor(new java.awt.Color(255, 167, 6));
        txt_addprod_sellingprice.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addprod_sellingprice.setNextFocusableComponent(cmbbox_addprod_brand);
        txt_addprod_sellingprice.setPreferredSize(new java.awt.Dimension(404, 64));

        cmbbox_addprod_brand.setBackground(new java.awt.Color(255, 167, 6));
        cmbbox_addprod_brand.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cmbbox_addprod_brand.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--SELECT BRAND--", "DELL", "HP", "LENOVO", "ACER" }));
        cmbbox_addprod_brand.setSelectedItem("--SELECT--BRAND--");
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
        txt_addprod_nm.setLineColor(new java.awt.Color(255, 167, 6));
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
        txt_addprod_quantity.setLineColor(new java.awt.Color(255, 167, 6));
        txt_addprod_quantity.setMinimumSize(new java.awt.Dimension(128, 64));
        txt_addprod_quantity.setNextFocusableComponent(btn_addprod);
        txt_addprod_quantity.setPreferredSize(new java.awt.Dimension(404, 64));

        javax.swing.GroupLayout pnl_add_productLayout = new javax.swing.GroupLayout(pnl_add_product);
        pnl_add_product.setLayout(pnl_add_productLayout);
        pnl_add_productLayout.setHorizontalGroup(
            pnl_add_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_add_productLayout.createSequentialGroup()
                .addGroup(pnl_add_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_add_productLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(pnl_add_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_addprod_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_addprod_costprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbbox_addprod_brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addGroup(pnl_add_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_addprod_sellingprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_addprod_nm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_addprod_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_add_productLayout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(btn_addprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        pnl_add_productLayout.setVerticalGroup(
            pnl_add_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_add_productLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addGroup(pnl_add_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_addprod_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_addprod_nm, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_add_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_addprod_sellingprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_addprod_costprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_add_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_addprod_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbbox_addprod_brand, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(btn_addprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pnl_edit_product.setkBorderRadius(40);
        pnl_edit_product.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_edit_product.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_edit_product.setOpaque(false);
        pnl_edit_product.setPreferredSize(new java.awt.Dimension(1108, 672));

        javax.swing.GroupLayout pnl_edit_productLayout = new javax.swing.GroupLayout(pnl_edit_product);
        pnl_edit_product.setLayout(pnl_edit_productLayout);
        pnl_edit_productLayout.setHorizontalGroup(
            pnl_edit_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1108, Short.MAX_VALUE)
        );
        pnl_edit_productLayout.setVerticalGroup(
            pnl_edit_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
        );

        pnl3_tab3.setkBorderRadius(40);
        pnl3_tab3.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl3_tab3.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl3_tab3.setOpaque(false);
        pnl3_tab3.setPreferredSize(new java.awt.Dimension(1108, 672));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("PANEL 3 Tab 3");

        javax.swing.GroupLayout pnl3_tab3Layout = new javax.swing.GroupLayout(pnl3_tab3);
        pnl3_tab3.setLayout(pnl3_tab3Layout);
        pnl3_tab3Layout.setHorizontalGroup(
            pnl3_tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1108, Short.MAX_VALUE)
            .addGroup(pnl3_tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl3_tab3Layout.createSequentialGroup()
                    .addGap(404, 404, 404)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(404, Short.MAX_VALUE)))
        );
        pnl3_tab3Layout.setVerticalGroup(
            pnl3_tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
            .addGroup(pnl3_tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl3_tab3Layout.createSequentialGroup()
                    .addGap(311, 311, 311)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(311, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pnl_prod_mainLayout = new javax.swing.GroupLayout(pnl_prod_main);
        pnl_prod_main.setLayout(pnl_prod_mainLayout);
        pnl_prod_mainLayout.setHorizontalGroup(
            pnl_prod_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnl_prod_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_add_product, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_prod_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_edit_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_prod_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl3_tab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_prod_mainLayout.setVerticalGroup(
            pnl_prod_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
            .addGroup(pnl_prod_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_add_product, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_prod_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_edit_product, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_prod_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl3_tab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(pnl_prod_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnl_prod_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_report.setkBorderRadius(40);
        panel_report.setkEndColor(new java.awt.Color(150, 195, 248));
        panel_report.setkStartColor(new java.awt.Color(150, 195, 248));
        panel_report.setOpaque(false);

        pnl5_menubar.setkBorderRadius(20);
        pnl5_menubar.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl5_menubar.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl5_menubar.setOpaque(false);
        pnl5_menubar.setPreferredSize(new java.awt.Dimension(1108, 60));

        pnl1_menu10.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl1_menu10.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl1_menu10.setOpaque(false);
        pnl1_menu10.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_pnl5_tab1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_pnl5_tab1.setText("TAB 1");
        btn_pnl5_tab1.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_pnl5_tab1.setkBorderRadius(20);
        btn_pnl5_tab1.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_pnl5_tab1.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_pnl5_tab1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_pnl5_tab1.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_pnl5_tab1.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_pnl5_tab1.setNextFocusableComponent(btn_pnl5_tab2);
        btn_pnl5_tab1.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_pnl5_tab1.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_pnl5_tab1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_pnl5_tab1FocusLost(evt);
            }
        });
        btn_pnl5_tab1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_pnl5_tab1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_pnl5_tab1MouseExited(evt);
            }
        });
        btn_pnl5_tab1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_pnl5_tab1ActionPerformed(evt);
            }
        });
        btn_pnl5_tab1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_pnl5_tab1KeyPressed(evt);
            }
        });

        lid5_1.setBackground(new java.awt.Color(225, 223, 223));
        lid5_1.setkBorderRadius(15);
        lid5_1.setkEndColor(new java.awt.Color(211, 211, 211));
        lid5_1.setkStartColor(new java.awt.Color(211, 211, 211));
        lid5_1.setOpaque(false);
        lid5_1.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid5_1Layout = new javax.swing.GroupLayout(lid5_1);
        lid5_1.setLayout(lid5_1Layout);
        lid5_1Layout.setHorizontalGroup(
            lid5_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid5_1Layout.setVerticalGroup(
            lid5_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl1_menu10Layout = new javax.swing.GroupLayout(pnl1_menu10);
        pnl1_menu10.setLayout(pnl1_menu10Layout);
        pnl1_menu10Layout.setHorizontalGroup(
            pnl1_menu10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1_menu10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid5_1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_pnl5_tab1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl1_menu10Layout.setVerticalGroup(
            pnl1_menu10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_pnl5_tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid5_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnl1_menu11.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl1_menu11.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl1_menu11.setOpaque(false);
        pnl1_menu11.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_pnl5_tab2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_pnl5_tab2.setText("TAB 2");
        btn_pnl5_tab2.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_pnl5_tab2.setkBorderRadius(20);
        btn_pnl5_tab2.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_pnl5_tab2.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_pnl5_tab2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_pnl5_tab2.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_pnl5_tab2.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_pnl5_tab2.setNextFocusableComponent(btn_pnl5_tab3);
        btn_pnl5_tab2.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_pnl5_tab2.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_pnl5_tab2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_pnl5_tab2FocusLost(evt);
            }
        });
        btn_pnl5_tab2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_pnl5_tab2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_pnl5_tab2MouseExited(evt);
            }
        });
        btn_pnl5_tab2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_pnl5_tab2ActionPerformed(evt);
            }
        });
        btn_pnl5_tab2.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_pnl5_tab2KeyPressed(evt);
            }
        });

        lid5_2.setBackground(new java.awt.Color(225, 223, 223));
        lid5_2.setkBorderRadius(15);
        lid5_2.setkEndColor(new java.awt.Color(211, 211, 211));
        lid5_2.setkStartColor(new java.awt.Color(211, 211, 211));
        lid5_2.setOpaque(false);
        lid5_2.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid5_2Layout = new javax.swing.GroupLayout(lid5_2);
        lid5_2.setLayout(lid5_2Layout);
        lid5_2Layout.setHorizontalGroup(
            lid5_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid5_2Layout.setVerticalGroup(
            lid5_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl1_menu11Layout = new javax.swing.GroupLayout(pnl1_menu11);
        pnl1_menu11.setLayout(pnl1_menu11Layout);
        pnl1_menu11Layout.setHorizontalGroup(
            pnl1_menu11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1_menu11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid5_2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_pnl5_tab2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl1_menu11Layout.setVerticalGroup(
            pnl1_menu11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_pnl5_tab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid5_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl1_menu12.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl1_menu12.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl1_menu12.setOpaque(false);
        pnl1_menu12.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_pnl5_tab3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_pnl5_tab3.setText("TAB 3");
        btn_pnl5_tab3.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_pnl5_tab3.setkBorderRadius(20);
        btn_pnl5_tab3.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_pnl5_tab3.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_pnl5_tab3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_pnl5_tab3.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_pnl5_tab3.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_pnl5_tab3.setNextFocusableComponent(btn_pnl5_tab1);
        btn_pnl5_tab3.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_pnl5_tab3.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_pnl5_tab3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_pnl5_tab3FocusLost(evt);
            }
        });
        btn_pnl5_tab3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_pnl5_tab3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_pnl5_tab3MouseExited(evt);
            }
        });
        btn_pnl5_tab3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_pnl5_tab3ActionPerformed(evt);
            }
        });
        btn_pnl5_tab3.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_pnl5_tab3KeyPressed(evt);
            }
        });

        lid5_3.setBackground(new java.awt.Color(225, 223, 223));
        lid5_3.setkBorderRadius(15);
        lid5_3.setkEndColor(new java.awt.Color(211, 211, 211));
        lid5_3.setkStartColor(new java.awt.Color(211, 211, 211));
        lid5_3.setOpaque(false);
        lid5_3.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid5_3Layout = new javax.swing.GroupLayout(lid5_3);
        lid5_3.setLayout(lid5_3Layout);
        lid5_3Layout.setHorizontalGroup(
            lid5_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid5_3Layout.setVerticalGroup(
            lid5_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl1_menu12Layout = new javax.swing.GroupLayout(pnl1_menu12);
        pnl1_menu12.setLayout(pnl1_menu12Layout);
        pnl1_menu12Layout.setHorizontalGroup(
            pnl1_menu12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1_menu12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid5_3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_pnl5_tab3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl1_menu12Layout.setVerticalGroup(
            pnl1_menu12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_pnl5_tab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid5_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnl5_menubarLayout = new javax.swing.GroupLayout(pnl5_menubar);
        pnl5_menubar.setLayout(pnl5_menubarLayout);
        pnl5_menubarLayout.setHorizontalGroup(
            pnl5_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl5_menubarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pnl1_menu10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl1_menu11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(pnl1_menu12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(418, Short.MAX_VALUE))
        );
        pnl5_menubarLayout.setVerticalGroup(
            pnl5_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl5_menubarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl5_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl1_menu10, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(pnl1_menu12, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(pnl1_menu11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))
        );

        pnl5_main.setkBorderRadius(40);
        pnl5_main.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl5_main.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl5_main.setOpaque(false);
        pnl5_main.setPreferredSize(new java.awt.Dimension(1108, 672));

        pnl5_tab1.setkBorderRadius(40);
        pnl5_tab1.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl5_tab1.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl5_tab1.setOpaque(false);
        pnl5_tab1.setPreferredSize(new java.awt.Dimension(1108, 672));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("PANEL 5 Tab 1");

        javax.swing.GroupLayout pnl5_tab1Layout = new javax.swing.GroupLayout(pnl5_tab1);
        pnl5_tab1.setLayout(pnl5_tab1Layout);
        pnl5_tab1Layout.setHorizontalGroup(
            pnl5_tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1108, Short.MAX_VALUE)
            .addGroup(pnl5_tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl5_tab1Layout.createSequentialGroup()
                    .addGap(404, 404, 404)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(404, Short.MAX_VALUE)))
        );
        pnl5_tab1Layout.setVerticalGroup(
            pnl5_tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
            .addGroup(pnl5_tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl5_tab1Layout.createSequentialGroup()
                    .addGap(311, 311, 311)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(311, Short.MAX_VALUE)))
        );

        pnl5_tab2.setkBorderRadius(40);
        pnl5_tab2.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl5_tab2.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl5_tab2.setOpaque(false);
        pnl5_tab2.setPreferredSize(new java.awt.Dimension(1108, 672));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("PANEL 5 Tab 2");

        javax.swing.GroupLayout pnl5_tab2Layout = new javax.swing.GroupLayout(pnl5_tab2);
        pnl5_tab2.setLayout(pnl5_tab2Layout);
        pnl5_tab2Layout.setHorizontalGroup(
            pnl5_tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1108, Short.MAX_VALUE)
            .addGroup(pnl5_tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl5_tab2Layout.createSequentialGroup()
                    .addGap(404, 404, 404)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(404, Short.MAX_VALUE)))
        );
        pnl5_tab2Layout.setVerticalGroup(
            pnl5_tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
            .addGroup(pnl5_tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl5_tab2Layout.createSequentialGroup()
                    .addGap(311, 311, 311)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(311, Short.MAX_VALUE)))
        );

        pnl5_tab3.setkBorderRadius(40);
        pnl5_tab3.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl5_tab3.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl5_tab3.setOpaque(false);
        pnl5_tab3.setPreferredSize(new java.awt.Dimension(1108, 672));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("PANEL 5 Tab 3");

        javax.swing.GroupLayout pnl5_tab3Layout = new javax.swing.GroupLayout(pnl5_tab3);
        pnl5_tab3.setLayout(pnl5_tab3Layout);
        pnl5_tab3Layout.setHorizontalGroup(
            pnl5_tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1108, Short.MAX_VALUE)
            .addGroup(pnl5_tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl5_tab3Layout.createSequentialGroup()
                    .addGap(404, 404, 404)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(404, Short.MAX_VALUE)))
        );
        pnl5_tab3Layout.setVerticalGroup(
            pnl5_tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
            .addGroup(pnl5_tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl5_tab3Layout.createSequentialGroup()
                    .addGap(311, 311, 311)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(311, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pnl5_mainLayout = new javax.swing.GroupLayout(pnl5_main);
        pnl5_main.setLayout(pnl5_mainLayout);
        pnl5_mainLayout.setHorizontalGroup(
            pnl5_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnl5_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl5_tab1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl5_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl5_tab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl5_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl5_tab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl5_mainLayout.setVerticalGroup(
            pnl5_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
            .addGroup(pnl5_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl5_tab1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl5_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl5_tab2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl5_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl5_tab3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_reportLayout = new javax.swing.GroupLayout(panel_report);
        panel_report.setLayout(panel_reportLayout);
        panel_reportLayout.setHorizontalGroup(
            panel_reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_reportLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnl5_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl5_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_reportLayout.setVerticalGroup(
            panel_reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_reportLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pnl5_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnl5_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_usermanual.setkBorderRadius(40);
        panel_usermanual.setkEndColor(new java.awt.Color(150, 195, 248));
        panel_usermanual.setkStartColor(new java.awt.Color(150, 195, 248));
        panel_usermanual.setOpaque(false);

        staff_menubar.setkBorderRadius(20);
        staff_menubar.setkEndColor(new java.awt.Color(255, 203, 109));
        staff_menubar.setkStartColor(new java.awt.Color(255, 203, 109));
        staff_menubar.setOpaque(false);
        staff_menubar.setPreferredSize(new java.awt.Dimension(1108, 60));

        pnl1_menu7.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl1_menu7.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl1_menu7.setOpaque(false);
        pnl1_menu7.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_pnl4_tab1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_pnl4_tab1.setText("TAB 1");
        btn_pnl4_tab1.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_pnl4_tab1.setkBorderRadius(20);
        btn_pnl4_tab1.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_pnl4_tab1.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_pnl4_tab1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_pnl4_tab1.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_pnl4_tab1.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_pnl4_tab1.setNextFocusableComponent(btn_pnl4_tab2);
        btn_pnl4_tab1.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_pnl4_tab1.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_pnl4_tab1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_pnl4_tab1FocusLost(evt);
            }
        });
        btn_pnl4_tab1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_pnl4_tab1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_pnl4_tab1MouseExited(evt);
            }
        });
        btn_pnl4_tab1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_pnl4_tab1ActionPerformed(evt);
            }
        });
        btn_pnl4_tab1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_pnl4_tab1KeyPressed(evt);
            }
        });

        lid4_1.setBackground(new java.awt.Color(225, 223, 223));
        lid4_1.setkBorderRadius(15);
        lid4_1.setkEndColor(new java.awt.Color(211, 211, 211));
        lid4_1.setkStartColor(new java.awt.Color(211, 211, 211));
        lid4_1.setOpaque(false);
        lid4_1.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid4_1Layout = new javax.swing.GroupLayout(lid4_1);
        lid4_1.setLayout(lid4_1Layout);
        lid4_1Layout.setHorizontalGroup(
            lid4_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid4_1Layout.setVerticalGroup(
            lid4_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl1_menu7Layout = new javax.swing.GroupLayout(pnl1_menu7);
        pnl1_menu7.setLayout(pnl1_menu7Layout);
        pnl1_menu7Layout.setHorizontalGroup(
            pnl1_menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1_menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid4_1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_pnl4_tab1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl1_menu7Layout.setVerticalGroup(
            pnl1_menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_pnl4_tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid4_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnl1_menu8.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl1_menu8.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl1_menu8.setOpaque(false);
        pnl1_menu8.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_pnl4_tab2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_pnl4_tab2.setText("TAB 2");
        btn_pnl4_tab2.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_pnl4_tab2.setkBorderRadius(20);
        btn_pnl4_tab2.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_pnl4_tab2.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_pnl4_tab2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_pnl4_tab2.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_pnl4_tab2.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_pnl4_tab2.setNextFocusableComponent(btn_pnl4_tab3);
        btn_pnl4_tab2.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_pnl4_tab2.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_pnl4_tab2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_pnl4_tab2FocusLost(evt);
            }
        });
        btn_pnl4_tab2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_pnl4_tab2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_pnl4_tab2MouseExited(evt);
            }
        });
        btn_pnl4_tab2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_pnl4_tab2ActionPerformed(evt);
            }
        });
        btn_pnl4_tab2.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_pnl4_tab2KeyPressed(evt);
            }
        });

        lid4_2.setBackground(new java.awt.Color(225, 223, 223));
        lid4_2.setkBorderRadius(15);
        lid4_2.setkEndColor(new java.awt.Color(211, 211, 211));
        lid4_2.setkStartColor(new java.awt.Color(211, 211, 211));
        lid4_2.setOpaque(false);
        lid4_2.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid4_2Layout = new javax.swing.GroupLayout(lid4_2);
        lid4_2.setLayout(lid4_2Layout);
        lid4_2Layout.setHorizontalGroup(
            lid4_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid4_2Layout.setVerticalGroup(
            lid4_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl1_menu8Layout = new javax.swing.GroupLayout(pnl1_menu8);
        pnl1_menu8.setLayout(pnl1_menu8Layout);
        pnl1_menu8Layout.setHorizontalGroup(
            pnl1_menu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1_menu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid4_2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_pnl4_tab2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl1_menu8Layout.setVerticalGroup(
            pnl1_menu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_pnl4_tab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid4_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl1_menu9.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl1_menu9.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl1_menu9.setOpaque(false);
        pnl1_menu9.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_pnl4_tab3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_pnl4_tab3.setText("TAB 3");
        btn_pnl4_tab3.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_pnl4_tab3.setkBorderRadius(20);
        btn_pnl4_tab3.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_pnl4_tab3.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_pnl4_tab3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_pnl4_tab3.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_pnl4_tab3.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_pnl4_tab3.setNextFocusableComponent(btn_pnl4_tab1);
        btn_pnl4_tab3.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_pnl4_tab3.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_pnl4_tab3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_pnl4_tab3FocusLost(evt);
            }
        });
        btn_pnl4_tab3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_pnl4_tab3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_pnl4_tab3MouseExited(evt);
            }
        });
        btn_pnl4_tab3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn_pnl4_tab3ActionPerformed(evt);
            }
        });
        btn_pnl4_tab3.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_pnl4_tab3KeyPressed(evt);
            }
        });

        lid4_3.setBackground(new java.awt.Color(225, 223, 223));
        lid4_3.setkBorderRadius(15);
        lid4_3.setkEndColor(new java.awt.Color(211, 211, 211));
        lid4_3.setkStartColor(new java.awt.Color(211, 211, 211));
        lid4_3.setOpaque(false);
        lid4_3.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid4_3Layout = new javax.swing.GroupLayout(lid4_3);
        lid4_3.setLayout(lid4_3Layout);
        lid4_3Layout.setHorizontalGroup(
            lid4_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid4_3Layout.setVerticalGroup(
            lid4_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl1_menu9Layout = new javax.swing.GroupLayout(pnl1_menu9);
        pnl1_menu9.setLayout(pnl1_menu9Layout);
        pnl1_menu9Layout.setHorizontalGroup(
            pnl1_menu9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1_menu9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid4_3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_pnl4_tab3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl1_menu9Layout.setVerticalGroup(
            pnl1_menu9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_pnl4_tab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid4_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout staff_menubarLayout = new javax.swing.GroupLayout(staff_menubar);
        staff_menubar.setLayout(staff_menubarLayout);
        staff_menubarLayout.setHorizontalGroup(
            staff_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staff_menubarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pnl1_menu7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl1_menu8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(pnl1_menu9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(418, Short.MAX_VALUE))
        );
        staff_menubarLayout.setVerticalGroup(
            staff_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staff_menubarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(staff_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl1_menu7, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(pnl1_menu9, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(pnl1_menu8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))
        );

        pnl_staff_main.setkBorderRadius(40);
        pnl_staff_main.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl_staff_main.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl_staff_main.setOpaque(false);
        pnl_staff_main.setPreferredSize(new java.awt.Dimension(1108, 672));

        pnl4_tab1.setkBorderRadius(40);
        pnl4_tab1.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl4_tab1.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl4_tab1.setOpaque(false);
        pnl4_tab1.setPreferredSize(new java.awt.Dimension(1108, 672));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("PANEL 4 Tab 1");

        javax.swing.GroupLayout pnl4_tab1Layout = new javax.swing.GroupLayout(pnl4_tab1);
        pnl4_tab1.setLayout(pnl4_tab1Layout);
        pnl4_tab1Layout.setHorizontalGroup(
            pnl4_tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1108, Short.MAX_VALUE)
            .addGroup(pnl4_tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl4_tab1Layout.createSequentialGroup()
                    .addGap(404, 404, 404)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(404, Short.MAX_VALUE)))
        );
        pnl4_tab1Layout.setVerticalGroup(
            pnl4_tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
            .addGroup(pnl4_tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl4_tab1Layout.createSequentialGroup()
                    .addGap(311, 311, 311)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(311, Short.MAX_VALUE)))
        );

        pnl4_tab2.setkBorderRadius(40);
        pnl4_tab2.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl4_tab2.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl4_tab2.setOpaque(false);
        pnl4_tab2.setPreferredSize(new java.awt.Dimension(1108, 672));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("PANEL 4 Tab 2");

        javax.swing.GroupLayout pnl4_tab2Layout = new javax.swing.GroupLayout(pnl4_tab2);
        pnl4_tab2.setLayout(pnl4_tab2Layout);
        pnl4_tab2Layout.setHorizontalGroup(
            pnl4_tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1108, Short.MAX_VALUE)
            .addGroup(pnl4_tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl4_tab2Layout.createSequentialGroup()
                    .addGap(404, 404, 404)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(404, Short.MAX_VALUE)))
        );
        pnl4_tab2Layout.setVerticalGroup(
            pnl4_tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
            .addGroup(pnl4_tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl4_tab2Layout.createSequentialGroup()
                    .addGap(311, 311, 311)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(311, Short.MAX_VALUE)))
        );

        pnl4_tab3.setkBorderRadius(40);
        pnl4_tab3.setkEndColor(new java.awt.Color(150, 195, 248));
        pnl4_tab3.setkStartColor(new java.awt.Color(150, 195, 248));
        pnl4_tab3.setOpaque(false);
        pnl4_tab3.setPreferredSize(new java.awt.Dimension(1108, 672));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("PANEL 4 Tab 3");

        javax.swing.GroupLayout pnl4_tab3Layout = new javax.swing.GroupLayout(pnl4_tab3);
        pnl4_tab3.setLayout(pnl4_tab3Layout);
        pnl4_tab3Layout.setHorizontalGroup(
            pnl4_tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1108, Short.MAX_VALUE)
            .addGroup(pnl4_tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl4_tab3Layout.createSequentialGroup()
                    .addGap(404, 404, 404)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(404, Short.MAX_VALUE)))
        );
        pnl4_tab3Layout.setVerticalGroup(
            pnl4_tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
            .addGroup(pnl4_tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl4_tab3Layout.createSequentialGroup()
                    .addGap(311, 311, 311)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(311, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pnl_staff_mainLayout = new javax.swing.GroupLayout(pnl_staff_main);
        pnl_staff_main.setLayout(pnl_staff_mainLayout);
        pnl_staff_mainLayout.setHorizontalGroup(
            pnl_staff_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pnl_staff_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl4_tab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_staff_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl4_tab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_staff_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl4_tab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_staff_mainLayout.setVerticalGroup(
            pnl_staff_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
            .addGroup(pnl_staff_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl4_tab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_staff_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl4_tab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnl_staff_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl4_tab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_usermanualLayout = new javax.swing.GroupLayout(panel_usermanual);
        panel_usermanual.setLayout(panel_usermanualLayout);
        panel_usermanualLayout.setHorizontalGroup(
            panel_usermanualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_usermanualLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_usermanualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(staff_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_staff_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_usermanualLayout.setVerticalGroup(
            panel_usermanualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_usermanualLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(staff_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnl_staff_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(panel_usermanual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(panel_usermanual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void cmbbox_roleActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmbbox_roleActionPerformed
    {//GEN-HEADEREND:event_cmbbox_roleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbbox_roleActionPerformed

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
        lbl_dash_usr.setText(cmbbox_role.getSelectedItem().toString());
        lbl_dash_welcome.grabFocus();
        visibility(true, false, false, false, false, false, btnCustomer);

    }//GEN-LAST:event_btn_loginActionPerformed

    private void btnEmployeeMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnEmployeeMouseEntered
    {//GEN-HEADEREND:event_btnEmployeeMouseEntered
        btnEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnEmployeeMouseEntered

    private void btnProductMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnProductMouseEntered
    {//GEN-HEADEREND:event_btnProductMouseEntered
        btnProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnProductMouseEntered

    private void btnReportMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnReportMouseEntered
    {//GEN-HEADEREND:event_btnReportMouseEntered
        btnReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnReportMouseEntered

    private void btnUserMouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btnUserMouseEntered
    {//GEN-HEADEREND:event_btnUserMouseEntered
        btnUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnUserMouseEntered

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
//        hover(btnCustomer, btnEmployee, btnProduct, btnReport, btnUser);   // To select dashboard main buttons.
        onIndicator(lid_add_cust, lid_edit_cust, lid_cust_det);
        visibility(pnl_add_cust, pnl_edit_cust, pnl_cust_det);

        txt_addcust_id.setText(getMaxID("customer"));
        txt_addcust_id.setText(getMaxID("customer"));
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
            lbl_dash_usr.setText(cmbbox_role.getSelectedItem().toString());
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

    private void btnReportFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btnReportFocusGained
    {//GEN-HEADEREND:event_btnReportFocusGained
        hover(btnReport, new Color(1, 109, 218), Color.black);
    }//GEN-LAST:event_btnReportFocusGained

    private void btnReportFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btnReportFocusLost
    {//GEN-HEADEREND:event_btnReportFocusLost
        hover(btnReport, new Color(255, 167, 6), Color.white);
    }//GEN-LAST:event_btnReportFocusLost

    private void btnUserFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btnUserFocusGained
    {//GEN-HEADEREND:event_btnUserFocusGained
        hover(btnUser, new Color(1, 109, 218), Color.black);
    }//GEN-LAST:event_btnUserFocusGained

    private void btnUserFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btnUserFocusLost
    {//GEN-HEADEREND:event_btnUserFocusLost
        hover(btnUser, new Color(255, 167, 6), Color.white);
    }//GEN-LAST:event_btnUserFocusLost

    private void btnCustomerKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnCustomerKeyPressed
    {//GEN-HEADEREND:event_btnCustomerKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(false, true, false, false, false, false, btn_addcust_menu);
            visibility(pnl_add_cust, pnl_edit_cust, pnl_cust_det);
            onIndicator(lid_add_cust, lid_edit_cust, lid_cust_det);
//            hover(btnCustomer, btnEmployee, btnProduct, btnReport, btnUser);   // To select dashboard main buttons.
            txt_addcust_id.setText(getMaxID("customer"));
            txt_addcust_id.setText(getMaxID("customer"));
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
            txt_addemp_id.setText(getMaxID("customer"));
//            hover(btnEmployee, btnCustomer, btnProduct, btnReport, btnUser);   // To select dashboard main buttons.
        }
    }//GEN-LAST:event_btnEmployeeKeyPressed

    private void btnProductKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnProductKeyPressed
    {//GEN-HEADEREND:event_btnProductKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(false, false, false, true, false, false, btn_addprod_menu);
            onIndicator(lid3_1, lid3_2, lid3_3);
//            hover(btnProduct, btnCustomer, btnEmployee, btnReport, btnUser);   // To select dashboard main buttons.
            txt_addprod_id.setText(getMaxID("product"));
            txt_addprod_id.grabFocus();
        }
    }//GEN-LAST:event_btnProductKeyPressed

    private void btnReportKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnReportKeyPressed
    {//GEN-HEADEREND:event_btnReportKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(false, false, false, false, true, false, btn_pnl4_tab1);
            onIndicator(lid4_1, lid4_2, lid4_3);
//            hover(btnReport, btnCustomer, btnEmployee, btnProduct, btnUser);   // To select dashboard main buttons.
        }
    }//GEN-LAST:event_btnReportKeyPressed

    private void btnUserKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btnUserKeyPressed
    {//GEN-HEADEREND:event_btnUserKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(false, false, false, false, false, true, btn_pnl5_tab1);
            onIndicator(lid5_1, lid5_2, lid5_3);
//            hover(btnUser, btnCustomer, btnEmployee, btnProduct, btnReport);   // To select dashboard main buttons.
        }
    }//GEN-LAST:event_btnUserKeyPressed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEmployeeActionPerformed
    {//GEN-HEADEREND:event_btnEmployeeActionPerformed
        visibility(false, false, true, false, false, false, btn_addemp_menu);
        visibility(pnl_add_emp, pnl_edit_emp, pnl_emp_det);
        onIndicator(lid_add_emp, lid_edit_emp, lid_emp_det);
        txt_addemp_id.setText(getMaxID("employee"));
        txt_addemp_id.setText(getMaxID("customer"));
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnProductActionPerformed
    {//GEN-HEADEREND:event_btnProductActionPerformed
        visibility(false, false, false, true, false, false, btn_addprod_menu);
        onIndicator(lid3_1, lid3_2, lid3_3);
        txt_addprod_id.setText(getMaxID("product"));
        txt_addprod_id.grabFocus();
    }//GEN-LAST:event_btnProductActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnUserActionPerformed
    {//GEN-HEADEREND:event_btnUserActionPerformed
        visibility(false, false, false, false, false, true, btn_pnl5_tab1);
        onIndicator(lid5_1, lid5_2, lid5_3);
    }//GEN-LAST:event_btnUserActionPerformed

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
            txt_addcust_id.grabFocus();
            txt_addcust_id.setText(getMaxID("customer"));
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
            txt_editcust_id.grabFocus();
            bindTableData(table_editcust, "customer");
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
            txt_custdet_custid.grabFocus();
            bindTableData(table_custdet, "customer");
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
            txt_editemp_id.grabFocus();
            bindTableData(table_editemp, "employee");
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
            txt_empdet_id.grabFocus();
            bindTableData(table_empdet, "employee");
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
            visibility(pnl_add_product, pnl_edit_product, pnl3_tab3);
            onIndicator(lid3_1, lid3_2, lid3_3);
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
            visibility(pnl_edit_product, pnl_add_product, pnl3_tab3);
            onIndicator(lid3_2, lid3_1, lid3_3
            );
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
            visibility(pnl3_tab3, pnl_add_product, pnl_edit_product);
            onIndicator(lid3_3, lid3_1, lid3_2);
        }
    }//GEN-LAST:event_btn_proddet_menuKeyPressed

    private void btn_pnl4_tab1FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl4_tab1FocusGained
    {//GEN-HEADEREND:event_btn_pnl4_tab1FocusGained
        hover(btn_pnl4_tab1, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_pnl4_tab1FocusGained

    private void btn_pnl4_tab1FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl4_tab1FocusLost
    {//GEN-HEADEREND:event_btn_pnl4_tab1FocusLost
        hover(btn_pnl4_tab1, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_pnl4_tab1FocusLost

    private void btn_pnl4_tab1MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl4_tab1MouseEntered
    {//GEN-HEADEREND:event_btn_pnl4_tab1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl4_tab1MouseEntered

    private void btn_pnl4_tab1MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl4_tab1MouseExited
    {//GEN-HEADEREND:event_btn_pnl4_tab1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl4_tab1MouseExited

    private void btn_pnl4_tab1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_pnl4_tab1KeyPressed
    {//GEN-HEADEREND:event_btn_pnl4_tab1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btnReport.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(pnl4_tab1, pnl4_tab2, pnl4_tab3);
            onIndicator(lid4_1, lid4_2, lid4_3);
        }
    }//GEN-LAST:event_btn_pnl4_tab1KeyPressed

    private void btn_pnl4_tab2FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl4_tab2FocusGained
    {//GEN-HEADEREND:event_btn_pnl4_tab2FocusGained
        hover(btn_pnl4_tab2, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_pnl4_tab2FocusGained

    private void btn_pnl4_tab2FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl4_tab2FocusLost
    {//GEN-HEADEREND:event_btn_pnl4_tab2FocusLost
        hover(btn_pnl4_tab2, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_pnl4_tab2FocusLost

    private void btn_pnl4_tab2MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl4_tab2MouseEntered
    {//GEN-HEADEREND:event_btn_pnl4_tab2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl4_tab2MouseEntered

    private void btn_pnl4_tab2MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl4_tab2MouseExited
    {//GEN-HEADEREND:event_btn_pnl4_tab2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl4_tab2MouseExited

    private void btn_pnl4_tab2KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_pnl4_tab2KeyPressed
    {//GEN-HEADEREND:event_btn_pnl4_tab2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btnReport.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(pnl4_tab2, pnl4_tab1, pnl4_tab3);
            onIndicator(lid4_2, lid4_1, lid4_3);
        }
    }//GEN-LAST:event_btn_pnl4_tab2KeyPressed

    private void btn_pnl4_tab3FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl4_tab3FocusGained
    {//GEN-HEADEREND:event_btn_pnl4_tab3FocusGained
        hover(btn_pnl4_tab3, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_pnl4_tab3FocusGained

    private void btn_pnl4_tab3FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl4_tab3FocusLost
    {//GEN-HEADEREND:event_btn_pnl4_tab3FocusLost
        hover(btn_pnl4_tab3, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_pnl4_tab3FocusLost

    private void btn_pnl4_tab3MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl4_tab3MouseEntered
    {//GEN-HEADEREND:event_btn_pnl4_tab3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl4_tab3MouseEntered

    private void btn_pnl4_tab3MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl4_tab3MouseExited
    {//GEN-HEADEREND:event_btn_pnl4_tab3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl4_tab3MouseExited

    private void btn_pnl4_tab3KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_pnl4_tab3KeyPressed
    {//GEN-HEADEREND:event_btn_pnl4_tab3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btnReport.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(pnl4_tab3, pnl4_tab1, pnl4_tab2);
            onIndicator(lid4_3, lid4_1, lid4_2);
        }
    }//GEN-LAST:event_btn_pnl4_tab3KeyPressed

    private void btn_pnl5_tab1FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl5_tab1FocusGained
    {//GEN-HEADEREND:event_btn_pnl5_tab1FocusGained
        hover(btn_pnl5_tab1, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_pnl5_tab1FocusGained

    private void btn_pnl5_tab1FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl5_tab1FocusLost
    {//GEN-HEADEREND:event_btn_pnl5_tab1FocusLost
        hover(btn_pnl5_tab1, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_pnl5_tab1FocusLost

    private void btn_pnl5_tab1MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl5_tab1MouseEntered
    {//GEN-HEADEREND:event_btn_pnl5_tab1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl5_tab1MouseEntered

    private void btn_pnl5_tab1MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl5_tab1MouseExited
    {//GEN-HEADEREND:event_btn_pnl5_tab1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl5_tab1MouseExited

    private void btn_pnl5_tab1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_pnl5_tab1KeyPressed
    {//GEN-HEADEREND:event_btn_pnl5_tab1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btnUser.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(pnl5_tab1, pnl5_tab2, pnl5_tab3);
            onIndicator(lid5_1, lid5_2, lid5_3);
        }
    }//GEN-LAST:event_btn_pnl5_tab1KeyPressed

    private void btn_pnl5_tab2FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl5_tab2FocusGained
    {//GEN-HEADEREND:event_btn_pnl5_tab2FocusGained
        hover(btn_pnl5_tab2, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_pnl5_tab2FocusGained

    private void btn_pnl5_tab2FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl5_tab2FocusLost
    {//GEN-HEADEREND:event_btn_pnl5_tab2FocusLost
        hover(btn_pnl5_tab2, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_pnl5_tab2FocusLost

    private void btn_pnl5_tab2MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl5_tab2MouseEntered
    {//GEN-HEADEREND:event_btn_pnl5_tab2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl5_tab2MouseEntered

    private void btn_pnl5_tab2MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl5_tab2MouseExited
    {//GEN-HEADEREND:event_btn_pnl5_tab2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl5_tab2MouseExited

    private void btn_pnl5_tab2KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_pnl5_tab2KeyPressed
    {//GEN-HEADEREND:event_btn_pnl5_tab2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btnUser.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(pnl5_tab2, pnl5_tab1, pnl5_tab3);
            onIndicator(lid5_2, lid5_1, lid5_3);
        }
    }//GEN-LAST:event_btn_pnl5_tab2KeyPressed

    private void btn_pnl5_tab3FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl5_tab3FocusGained
    {//GEN-HEADEREND:event_btn_pnl5_tab3FocusGained
        hover(btn_pnl5_tab3, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_pnl5_tab3FocusGained

    private void btn_pnl5_tab3FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl5_tab3FocusLost
    {//GEN-HEADEREND:event_btn_pnl5_tab3FocusLost
        hover(btn_pnl5_tab3, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_pnl5_tab3FocusLost

    private void btn_pnl5_tab3MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl5_tab3MouseEntered
    {//GEN-HEADEREND:event_btn_pnl5_tab3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl5_tab3MouseEntered

    private void btn_pnl5_tab3MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl5_tab3MouseExited
    {//GEN-HEADEREND:event_btn_pnl5_tab3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl5_tab3MouseExited

    private void btn_pnl5_tab3KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_pnl5_tab3KeyPressed
    {//GEN-HEADEREND:event_btn_pnl5_tab3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btnUser.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(pnl5_tab3, pnl5_tab1, pnl5_tab2);
            onIndicator(lid5_3, lid5_1, lid5_2);
        }
    }//GEN-LAST:event_btn_pnl5_tab3KeyPressed

    private void btn_pnl5_tab2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_pnl5_tab2ActionPerformed
    {//GEN-HEADEREND:event_btn_pnl5_tab2ActionPerformed
        visibility(pnl5_tab2, pnl5_tab1, pnl5_tab3);
        onIndicator(lid5_2, lid5_1, lid5_3);
    }//GEN-LAST:event_btn_pnl5_tab2ActionPerformed

    private void btn_addcust_menuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_addcust_menuActionPerformed
    {//GEN-HEADEREND:event_btn_addcust_menuActionPerformed
        visibility(pnl_add_cust, pnl_edit_cust, pnl_cust_det);
        onIndicator(lid_add_cust, lid_edit_cust, lid_cust_det);
        txt_addcust_id.grabFocus();
        txt_editcust_id.setText(getMaxID("customer"));
    }//GEN-LAST:event_btn_addcust_menuActionPerformed

    private void btn_editcust_menuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_editcust_menuActionPerformed
    {//GEN-HEADEREND:event_btn_editcust_menuActionPerformed
        visibility(pnl_edit_cust, pnl_add_cust, pnl_cust_det);
        onIndicator(lid_edit_cust, lid_add_cust, lid_cust_det);
        txt_editcust_id.grabFocus();
        bindTableData(table_editcust, "customer");
    }//GEN-LAST:event_btn_editcust_menuActionPerformed

    private void btn_custdet_menuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_custdet_menuActionPerformed
    {//GEN-HEADEREND:event_btn_custdet_menuActionPerformed
        visibility(pnl_cust_det, pnl_add_cust, pnl_edit_cust);
        onIndicator(lid_cust_det, lid_add_cust, lid_edit_cust);
        txt_custdet_custid.grabFocus();
        bindTableData(table_custdet, "customer");
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
        txt_editemp_id.grabFocus();
        bindTableData(table_editemp, "employee");
    }//GEN-LAST:event_btn_editemp_menuActionPerformed

    private void btn_empdet_menuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_empdet_menuActionPerformed
    {//GEN-HEADEREND:event_btn_empdet_menuActionPerformed
        visibility(pnl_emp_det, pnl_add_emp, pnl_edit_emp);
        onIndicator(lid_emp_det, lid_add_emp, lid_edit_emp);
        txt_empdet_id.grabFocus();
        bindTableData(table_empdet, "employee");
    }//GEN-LAST:event_btn_empdet_menuActionPerformed

    private void btn_addprod_menuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_addprod_menuActionPerformed
    {//GEN-HEADEREND:event_btn_addprod_menuActionPerformed
        visibility(pnl_add_product, pnl_edit_product, pnl3_tab3);
        onIndicator(lid3_1, lid3_2, lid3_3);
        txt_addprod_id.grabFocus();
    }//GEN-LAST:event_btn_addprod_menuActionPerformed

    private void btn_editprod_menuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_editprod_menuActionPerformed
    {//GEN-HEADEREND:event_btn_editprod_menuActionPerformed
        visibility(pnl_edit_product, pnl_add_product, pnl3_tab3);
        onIndicator(lid3_2, lid3_1, lid3_3);
    }//GEN-LAST:event_btn_editprod_menuActionPerformed

    private void btn_proddet_menuActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_proddet_menuActionPerformed
    {//GEN-HEADEREND:event_btn_proddet_menuActionPerformed
        visibility(pnl3_tab3, pnl_add_product, pnl_edit_product);
        onIndicator(lid3_3, lid3_1, lid3_2);
    }//GEN-LAST:event_btn_proddet_menuActionPerformed

    private void btn_pnl4_tab1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_pnl4_tab1ActionPerformed
    {//GEN-HEADEREND:event_btn_pnl4_tab1ActionPerformed
        visibility(pnl4_tab1, pnl4_tab2, pnl4_tab3);
        onIndicator(lid4_1, lid4_2, lid4_3);
    }//GEN-LAST:event_btn_pnl4_tab1ActionPerformed

    private void btn_pnl4_tab2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_pnl4_tab2ActionPerformed
    {//GEN-HEADEREND:event_btn_pnl4_tab2ActionPerformed
        visibility(pnl4_tab2, pnl4_tab1, pnl4_tab3);
        onIndicator(lid4_2, lid4_1, lid4_3);
    }//GEN-LAST:event_btn_pnl4_tab2ActionPerformed

    private void btn_pnl4_tab3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_pnl4_tab3ActionPerformed
    {//GEN-HEADEREND:event_btn_pnl4_tab3ActionPerformed
        visibility(pnl4_tab3, pnl4_tab1, pnl4_tab2);
        onIndicator(lid4_3, lid4_1, lid4_2);
    }//GEN-LAST:event_btn_pnl4_tab3ActionPerformed

    private void btn_pnl5_tab1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_pnl5_tab1ActionPerformed
    {//GEN-HEADEREND:event_btn_pnl5_tab1ActionPerformed
        visibility(pnl5_tab1, pnl5_tab2, pnl5_tab3);
        onIndicator(lid5_1, lid5_2, lid5_3);

    }//GEN-LAST:event_btn_pnl5_tab1ActionPerformed

    private void btn_pnl5_tab3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_pnl5_tab3ActionPerformed
    {//GEN-HEADEREND:event_btn_pnl5_tab3ActionPerformed
        visibility(pnl5_tab3, pnl5_tab1, pnl5_tab2);
        onIndicator(lid5_3, lid5_1, lid5_2);
    }//GEN-LAST:event_btn_pnl5_tab3ActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnReportActionPerformed
    {//GEN-HEADEREND:event_btnReportActionPerformed
        visibility(false, false, false, false, true, false, btn_pnl4_tab1);
        onIndicator(lid4_1, lid4_2, lid4_3);
    }//GEN-LAST:event_btnReportActionPerformed

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
            bindTableData(table_editcust, "customer");
            JOptionPane.showMessageDialog(null, "Recored Updated Successfully");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
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
            query = "insert into employee (id, nm, contact, email, salary, address, pswd) values(?, ?, ?, ?, ?, ?, ?)";

            pst = con.prepareStatement(query);
            pst.setString(1, txt_addemp_id.getText());
            pst.setString(2, txt_addemp_nm.getText());
            pst.setString(3, txt_addemp_contact.getText());
            pst.setString(4, txt_addemp_email.getText());
            pst.setString(5, txt_addemp_salary.getText());
            pst.setString(6, txt_addemp_addr.getText());
            pst.setString(7, txt_addemp_pswd.getText());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Record Inserted Successfully!");
            clearTextFields(txt_addemp_id, txt_addemp_nm, txt_addemp_contact, txt_addemp_email, txt_addemp_salary, txt_addemp_addr, txt_addemp_pswd, txt_addemp_cpswd);
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
        bindTableData(table_custdet, "customer");
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
                bindTableData(table_editcust, "customer");
                JOptionPane.showMessageDialog(null, "Record Deleted Successfully !");
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
            query = "delete from employee where id = ?";

            pst = con.prepareStatement(query);
            pst.setString(1, txt_editemp_id.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Deleted Successfully !");
            bindTableData(table_editemp, "employee");
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
            query = "update employee set nm = ?, contact = ?, email = ?, salary = ?, address = ?, pswd = ? where id = ? ";

            pst = con.prepareStatement(query);
            pst.setString(1, txt_editemp_nm.getText());
            pst.setString(2, txt_editemp_contact.getText());
            pst.setString(3, txt_editemp_email.getText());
            pst.setString(4, txt_editemp_salary.getText());
            pst.setString(5, txt_editemp_addr.getText());
            pst.setString(6, txt_editemp_pswd.getText());
            pst.setString(7, txt_editemp_id.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record Updated Successfully!");
            bindTableData(table_editemp, "employee");
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

//    public void hover(KButton btnToSelect, KButton btn2, KButton btn3, KButton btn4, KButton btn5) // To select dashboard main buttons.
//    {
//        btnToSelect.setkStartColor(new Color(1, 109, 218));
//        btnToSelect.setkEndColor(new Color(1, 109, 218));
//        btnToSelect.setBackground(Color.black);
//
//        btn2.setkStartColor(new Color(255, 167, 6));
//        btn2.setkEndColor(new Color(255, 167, 6));
//        btn2.setBackground(Color.white);
//
//        btn3.setkStartColor(new Color(255, 167, 6));
//        btn3.setkEndColor(new Color(255, 167, 6));
//        btn3.setBackground(Color.white);
//
//        btn4.setkStartColor(new Color(255, 167, 6));
//        btn4.setkEndColor(new Color(255, 167, 6));
//        btn4.setBackground(Color.white);
//
//        btn5.setkStartColor(new Color(255, 167, 6));
//        btn5.setkEndColor(new Color(255, 167, 6));
//        btn5.setBackground(Color.white);
//    }
    public void visibility(boolean pnl_home, boolean pnl1, boolean pnl2, boolean pnl3, boolean pnl4, boolean pnl5, KButton btn, int keycode)
    {
        if (keycode == KeyEvent.VK_ENTER)
        {
            panel_home.setVisible(pnl_home);
            panel_customer.setVisible(pnl1);
            panel_employee.setVisible(pnl2);
            panel_product.setVisible(pnl3);
            panel_report.setVisible(pnl5);
            panel_usermanual.setVisible(pnl4);
            btn.grabFocus();
        }
    }

    public void visibility(boolean pnl_home, boolean pnl1, boolean pnl2, boolean pnl3, boolean pnl4, boolean pnl5, KButton btn)
    {
        panel_home.setVisible(pnl_home);
        panel_customer.setVisible(pnl1);
        panel_employee.setVisible(pnl2);
        panel_product.setVisible(pnl3);
        panel_report.setVisible(pnl5);
        panel_usermanual.setVisible(pnl4);
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

    public void offIndicator(KGradientPanel lid1, Color color1, KGradientPanel lid2, Color color2, KGradientPanel lid3, Color color3)
    {
        lid1.setkStartColor(color1);
        lid1.setkEndColor(color1);
        lid1.setBackground(Color.black);

        lid2.setkStartColor(color2);
        lid2.setkEndColor(color2);
        lid2.setBackground(Color.black);

        lid3.setkStartColor(color3);
        lid3.setkEndColor(color3);
        lid3.setBackground(Color.black);
    }

    public String getMaxID(String tablenm)
    {
        int id;
        try
        {
            con = dbconnection.getdbConnection();
            query = "select max(id) from " + tablenm;
            pst = con.prepareStatement(query);
            result = pst.executeQuery();

            if (result.next())
            {
                if (result.getInt(1) > 0)
                {
                    id = result.getInt(1) + 1;
                    return Integer.toString(id);
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

    public void bindTableData(JTable table, String tablenm)
    {
        try
        {
            tableModel = (DefaultTableModel) table.getModel();
            tableModel.setRowCount(0);

            con = dbconnection.getdbConnection();
            query = "select * from " + tablenm;
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

    public void clearTextFields(TextField txt1, TextField txt2, TextField txt3, TextField txt4, TextField txt5, TextField txt6, PasswordField txt7, PasswordField txt8)
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnCustomer;
    private com.k33ptoo.components.KButton btnEmployee;
    private com.k33ptoo.components.KButton btnProduct;
    private com.k33ptoo.components.KButton btnReport;
    private com.k33ptoo.components.KButton btnUser;
    private com.k33ptoo.components.KButton btn_addcust_add;
    private com.k33ptoo.components.KButton btn_addcust_menu;
    private com.k33ptoo.components.KButton btn_addemp_add;
    private com.k33ptoo.components.KButton btn_addemp_menu;
    private com.k33ptoo.components.KButton btn_addprod;
    private com.k33ptoo.components.KButton btn_addprod_menu;
    private com.k33ptoo.components.KButton btn_custdet;
    private com.k33ptoo.components.KButton btn_custdet_menu;
    private com.k33ptoo.components.KButton btn_editcust_edit;
    private com.k33ptoo.components.KButton btn_editcust_menu;
    private com.k33ptoo.components.KButton btn_editcust_rmv;
    private com.k33ptoo.components.KButton btn_editemp_edit;
    private com.k33ptoo.components.KButton btn_editemp_menu;
    private com.k33ptoo.components.KButton btn_editemp_rmv;
    private com.k33ptoo.components.KButton btn_editprod_menu;
    private com.k33ptoo.components.KButton btn_empdet;
    private com.k33ptoo.components.KButton btn_empdet_menu;
    private com.k33ptoo.components.KButton btn_login;
    private com.k33ptoo.components.KButton btn_pnl4_tab1;
    private com.k33ptoo.components.KButton btn_pnl4_tab2;
    private com.k33ptoo.components.KButton btn_pnl4_tab3;
    private com.k33ptoo.components.KButton btn_pnl5_tab1;
    private com.k33ptoo.components.KButton btn_pnl5_tab2;
    private com.k33ptoo.components.KButton btn_pnl5_tab3;
    private com.k33ptoo.components.KButton btn_proddet_menu;
    private combo_suggestion.ComboBoxSuggestion cmbbox_addprod_brand;
    private combo_suggestion.ComboBoxSuggestion cmbbox_role;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_dash_usr;
    private javax.swing.JLabel lbl_dash_welcome;
    private javax.swing.JLabel lbl_forgot_pswd;
    private javax.swing.JLabel lbl_login_img;
    private javax.swing.JLabel lbl_minimize;
    private javax.swing.JLabel lbl_pswd_icon;
    private javax.swing.JLabel lbl_role;
    private javax.swing.JLabel lbl_usr_icon;
    private com.k33ptoo.components.KGradientPanel lid3_1;
    private com.k33ptoo.components.KGradientPanel lid3_2;
    private com.k33ptoo.components.KGradientPanel lid3_3;
    private com.k33ptoo.components.KGradientPanel lid4_1;
    private com.k33ptoo.components.KGradientPanel lid4_2;
    private com.k33ptoo.components.KGradientPanel lid4_3;
    private com.k33ptoo.components.KGradientPanel lid5_1;
    private com.k33ptoo.components.KGradientPanel lid5_2;
    private com.k33ptoo.components.KGradientPanel lid5_3;
    private com.k33ptoo.components.KGradientPanel lid_add_cust;
    private com.k33ptoo.components.KGradientPanel lid_add_emp;
    private com.k33ptoo.components.KGradientPanel lid_cust_det;
    private com.k33ptoo.components.KGradientPanel lid_edit_cust;
    private com.k33ptoo.components.KGradientPanel lid_edit_emp;
    private com.k33ptoo.components.KGradientPanel lid_emp_det;
    private com.k33ptoo.components.KGradientPanel panel_bg;
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
    private com.k33ptoo.components.KGradientPanel panel_report;
    private com.k33ptoo.components.KGradientPanel panel_usermanual;
    private com.k33ptoo.components.KGradientPanel pnl1_menu10;
    private com.k33ptoo.components.KGradientPanel pnl1_menu11;
    private com.k33ptoo.components.KGradientPanel pnl1_menu12;
    private com.k33ptoo.components.KGradientPanel pnl1_menu18;
    private com.k33ptoo.components.KGradientPanel pnl1_menu7;
    private com.k33ptoo.components.KGradientPanel pnl1_menu8;
    private com.k33ptoo.components.KGradientPanel pnl1_menu9;
    private com.k33ptoo.components.KGradientPanel pnl3_tab3;
    private com.k33ptoo.components.KGradientPanel pnl4_tab1;
    private com.k33ptoo.components.KGradientPanel pnl4_tab2;
    private com.k33ptoo.components.KGradientPanel pnl4_tab3;
    private com.k33ptoo.components.KGradientPanel pnl5_main;
    private com.k33ptoo.components.KGradientPanel pnl5_menubar;
    private com.k33ptoo.components.KGradientPanel pnl5_tab1;
    private com.k33ptoo.components.KGradientPanel pnl5_tab2;
    private com.k33ptoo.components.KGradientPanel pnl5_tab3;
    private com.k33ptoo.components.KGradientPanel pnl_add_cust;
    private com.k33ptoo.components.KGradientPanel pnl_add_emp;
    private com.k33ptoo.components.KGradientPanel pnl_add_prod_menu;
    private com.k33ptoo.components.KGradientPanel pnl_add_product;
    private com.k33ptoo.components.KGradientPanel pnl_addcust_menu;
    private com.k33ptoo.components.KGradientPanel pnl_addemp_menu;
    private javax.swing.JPanel pnl_close;
    private com.k33ptoo.components.KGradientPanel pnl_cust_det;
    private com.k33ptoo.components.KGradientPanel pnl_cust_det_menu;
    private com.k33ptoo.components.KGradientPanel pnl_cust_menubar;
    private com.k33ptoo.components.KGradientPanel pnl_customer_main;
    private com.k33ptoo.components.KGradientPanel pnl_edit_cust;
    private com.k33ptoo.components.KGradientPanel pnl_edit_cust_menu;
    private com.k33ptoo.components.KGradientPanel pnl_edit_emp;
    private com.k33ptoo.components.KGradientPanel pnl_edit_prod_menu;
    private com.k33ptoo.components.KGradientPanel pnl_edit_product;
    private com.k33ptoo.components.KGradientPanel pnl_editemp_menu;
    private com.k33ptoo.components.KGradientPanel pnl_emp_det;
    private com.k33ptoo.components.KGradientPanel pnl_emp_menubar;
    private com.k33ptoo.components.KGradientPanel pnl_empdet_menu;
    private com.k33ptoo.components.KGradientPanel pnl_employee_main;
    private com.k33ptoo.components.KGradientPanel pnl_menu_head;
    private javax.swing.JPanel pnl_minimize;
    private com.k33ptoo.components.KGradientPanel pnl_prod_main;
    private com.k33ptoo.components.KGradientPanel pnl_prod_menubar;
    private com.k33ptoo.components.KGradientPanel pnl_staff_main;
    private javax.swing.JScrollPane scrolltbl_custdet;
    private javax.swing.JScrollPane scrolltbl_editcust;
    private javax.swing.JScrollPane scrolltbl_editemp;
    private javax.swing.JScrollPane scrolltbl_empdet;
    private com.k33ptoo.components.KGradientPanel staff_menubar;
    private javax.swing.JTable table_custdet;
    private javax.swing.JTable table_editcust;
    private javax.swing.JTable table_editemp;
    private javax.swing.JTable table_empdet;
    private textfield.TextField txt_addcust_contact;
    private textfield.TextField txt_addcust_email;
    private textfield.TextField txt_addcust_id;
    private textfield.TextField txt_addcust_nm;
    private textfield.TextField txt_addcust_shopaddr;
    private textfield.TextField txt_addcust_shopnm;
    private textfield.TextField txt_addemp_addr;
    private textfield.TextField txt_addemp_contact;
    private textfield.PasswordField txt_addemp_cpswd;
    private textfield.TextField txt_addemp_email;
    private textfield.TextField txt_addemp_id;
    private textfield.TextField txt_addemp_nm;
    private textfield.PasswordField txt_addemp_pswd;
    private textfield.TextField txt_addemp_salary;
    private textfield.TextField txt_addprod_costprice;
    private textfield.TextField txt_addprod_id;
    private textfield.TextField txt_addprod_nm;
    private textfield.TextField txt_addprod_quantity;
    private textfield.TextField txt_addprod_sellingprice;
    private textfield.TextField txt_custdet_custid;
    private textfield.TextField txt_editcust_contact;
    private textfield.TextField txt_editcust_email;
    private textfield.TextField txt_editcust_id;
    private textfield.TextField txt_editcust_nm;
    private textfield.TextField txt_editcust_shopaddr;
    private textfield.TextField txt_editcust_shopnm;
    private textfield.TextField txt_editemp_addr;
    private textfield.TextField txt_editemp_contact;
    private textfield.TextField txt_editemp_email;
    private textfield.TextField txt_editemp_id;
    private textfield.TextField txt_editemp_nm;
    private textfield.PasswordField txt_editemp_pswd;
    private textfield.TextField txt_editemp_salary;
    private textfield.TextField txt_empdet_id;
    private textfield.PasswordField txt_pswd;
    // End of variables declaration//GEN-END:variables
}
