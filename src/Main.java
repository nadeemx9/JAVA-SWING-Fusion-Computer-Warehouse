
import com.k33ptoo.components.KButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Main extends javax.swing.JFrame
{

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
        btn1 = new com.k33ptoo.components.KButton();
        btn2 = new com.k33ptoo.components.KButton();
        btn3 = new com.k33ptoo.components.KButton();
        btn4 = new com.k33ptoo.components.KButton();
        btn5 = new com.k33ptoo.components.KButton();
        pnl_menu_head = new com.k33ptoo.components.KGradientPanel();
        lbl_dash_welcome = new javax.swing.JLabel();
        lbl_dash_usr = new javax.swing.JLabel();
        panel_dash_main = new com.k33ptoo.components.KGradientPanel();
        panel_home = new com.k33ptoo.components.KGradientPanel();
        panel1 = new com.k33ptoo.components.KGradientPanel();
        pnl1_menubar = new com.k33ptoo.components.KGradientPanel();
        pnl1_menu1 = new com.k33ptoo.components.KGradientPanel();
        btn_pnl1_tab1 = new com.k33ptoo.components.KButton();
        lid1 = new com.k33ptoo.components.KGradientPanel();
        pnl1_menu2 = new com.k33ptoo.components.KGradientPanel();
        btn_pnl1_tab2 = new com.k33ptoo.components.KButton();
        lid2 = new com.k33ptoo.components.KGradientPanel();
        pnl1_menu3 = new com.k33ptoo.components.KGradientPanel();
        btn_pnl1_tab3 = new com.k33ptoo.components.KButton();
        lid3 = new com.k33ptoo.components.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        panel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel8 = new javax.swing.JLabel();
        pnl2_menubar = new com.k33ptoo.components.KGradientPanel();
        pnl1_menu4 = new com.k33ptoo.components.KGradientPanel();
        btn_pnl2_tab1 = new com.k33ptoo.components.KButton();
        lid4 = new com.k33ptoo.components.KGradientPanel();
        pnl1_menu5 = new com.k33ptoo.components.KGradientPanel();
        btn_pnl2_tab2 = new com.k33ptoo.components.KButton();
        lid5 = new com.k33ptoo.components.KGradientPanel();
        pnl1_menu6 = new com.k33ptoo.components.KGradientPanel();
        btn_pnl2_tab3 = new com.k33ptoo.components.KButton();
        lid6 = new com.k33ptoo.components.KGradientPanel();
        panel3 = new com.k33ptoo.components.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        pnl3_menubar = new com.k33ptoo.components.KGradientPanel();
        pnl1_menu16 = new com.k33ptoo.components.KGradientPanel();
        btn_pnl3_tab1 = new com.k33ptoo.components.KButton();
        lid16 = new com.k33ptoo.components.KGradientPanel();
        pnl1_menu17 = new com.k33ptoo.components.KGradientPanel();
        btn_pnl3_tab2 = new com.k33ptoo.components.KButton();
        lid17 = new com.k33ptoo.components.KGradientPanel();
        pnl1_menu18 = new com.k33ptoo.components.KGradientPanel();
        btn_pnl3_tab3 = new com.k33ptoo.components.KButton();
        lid18 = new com.k33ptoo.components.KGradientPanel();
        panel4 = new com.k33ptoo.components.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        pnl4_menubar = new com.k33ptoo.components.KGradientPanel();
        pnl1_menu7 = new com.k33ptoo.components.KGradientPanel();
        btn_pnl4_tab1 = new com.k33ptoo.components.KButton();
        lid7 = new com.k33ptoo.components.KGradientPanel();
        pnl1_menu8 = new com.k33ptoo.components.KGradientPanel();
        btn_pnl4_tab2 = new com.k33ptoo.components.KButton();
        lid8 = new com.k33ptoo.components.KGradientPanel();
        pnl1_menu9 = new com.k33ptoo.components.KGradientPanel();
        btn_pnl4_tab3 = new com.k33ptoo.components.KButton();
        lid9 = new com.k33ptoo.components.KGradientPanel();
        panel5 = new com.k33ptoo.components.KGradientPanel();
        jLabel6 = new javax.swing.JLabel();
        pnl5_menubar = new com.k33ptoo.components.KGradientPanel();
        pnl1_menu10 = new com.k33ptoo.components.KGradientPanel();
        btn_pnl5_tab1 = new com.k33ptoo.components.KButton();
        lid10 = new com.k33ptoo.components.KGradientPanel();
        pnl1_menu11 = new com.k33ptoo.components.KGradientPanel();
        btn_pnl5_tab2 = new com.k33ptoo.components.KButton();
        lid11 = new com.k33ptoo.components.KGradientPanel();
        pnl1_menu12 = new com.k33ptoo.components.KGradientPanel();
        btn_pnl5_tab3 = new com.k33ptoo.components.KButton();
        lid12 = new com.k33ptoo.components.KGradientPanel();

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

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_role, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        btn1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn1.setText("Button1");
        btn1.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btn1.setkBorderRadius(30);
        btn1.setkEndColor(new java.awt.Color(255, 167, 6));
        btn1.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn1.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn1.setkPressedColor(new java.awt.Color(255, 167, 6));
        btn1.setkStartColor(new java.awt.Color(255, 167, 6));
        btn1.setNextFocusableComponent(btn2);
        btn1.setOpaque(true);
        btn1.setPreferredSize(new java.awt.Dimension(450, 60));
        btn1.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn1FocusLost(evt);
            }
        });
        btn1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn1MouseExited(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn1ActionPerformed(evt);
            }
        });
        btn1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn1KeyPressed(evt);
            }
        });

        btn2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn2.setText("Button2");
        btn2.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btn2.setkBorderRadius(30);
        btn2.setkEndColor(new java.awt.Color(255, 167, 6));
        btn2.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn2.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn2.setkPressedColor(new java.awt.Color(255, 167, 6));
        btn2.setkStartColor(new java.awt.Color(255, 167, 6));
        btn2.setNextFocusableComponent(btn3);
        btn2.setPreferredSize(new java.awt.Dimension(450, 60));
        btn2.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn2FocusLost(evt);
            }
        });
        btn2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn2MouseEntered(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn2ActionPerformed(evt);
            }
        });
        btn2.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn2KeyPressed(evt);
            }
        });

        btn3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn3.setText("Button3");
        btn3.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btn3.setkBorderRadius(30);
        btn3.setkEndColor(new java.awt.Color(255, 167, 6));
        btn3.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn3.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn3.setkPressedColor(new java.awt.Color(255, 167, 6));
        btn3.setkStartColor(new java.awt.Color(255, 167, 6));
        btn3.setNextFocusableComponent(btn4);
        btn3.setPreferredSize(new java.awt.Dimension(450, 60));
        btn3.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn3FocusLost(evt);
            }
        });
        btn3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn3MouseEntered(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn3ActionPerformed(evt);
            }
        });
        btn3.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn3KeyPressed(evt);
            }
        });

        btn4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn4.setText("Button4");
        btn4.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btn4.setkBorderRadius(30);
        btn4.setkEndColor(new java.awt.Color(255, 167, 6));
        btn4.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn4.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn4.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn4.setkPressedColor(new java.awt.Color(255, 167, 6));
        btn4.setkStartColor(new java.awt.Color(255, 167, 6));
        btn4.setNextFocusableComponent(btn5);
        btn4.setPreferredSize(new java.awt.Dimension(450, 60));
        btn4.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn4FocusLost(evt);
            }
        });
        btn4.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn4MouseEntered(evt);
            }
        });
        btn4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn4ActionPerformed(evt);
            }
        });
        btn4.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn4KeyPressed(evt);
            }
        });

        btn5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn5.setText("Button5");
        btn5.setToolTipText("");
        btn5.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        btn5.setkBorderRadius(30);
        btn5.setkEndColor(new java.awt.Color(255, 167, 6));
        btn5.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn5.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn5.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn5.setkPressedColor(new java.awt.Color(255, 167, 6));
        btn5.setkStartColor(new java.awt.Color(255, 167, 6));
        btn5.setNextFocusableComponent(btn1);
        btn5.setPreferredSize(new java.awt.Dimension(450, 60));
        btn5.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn5FocusLost(evt);
            }
        });
        btn5.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn5MouseEntered(evt);
            }
        });
        btn5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btn5ActionPerformed(evt);
            }
        });
        btn5.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn5KeyPressed(evt);
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
                    .addComponent(btn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        panel1.setkBorderRadius(40);
        panel1.setkEndColor(new java.awt.Color(150, 195, 248));
        panel1.setkGradientFocus(1000);
        panel1.setkStartColor(new java.awt.Color(150, 195, 248));
        panel1.setOpaque(false);
        panel1.setPreferredSize(new java.awt.Dimension(1120, 780));

        pnl1_menubar.setkBorderRadius(20);
        pnl1_menubar.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl1_menubar.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl1_menubar.setOpaque(false);
        pnl1_menubar.setPreferredSize(new java.awt.Dimension(1108, 60));

        pnl1_menu1.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl1_menu1.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl1_menu1.setOpaque(false);
        pnl1_menu1.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_pnl1_tab1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_pnl1_tab1.setText("TAB 1");
        btn_pnl1_tab1.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_pnl1_tab1.setkBorderRadius(20);
        btn_pnl1_tab1.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_pnl1_tab1.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_pnl1_tab1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_pnl1_tab1.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_pnl1_tab1.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_pnl1_tab1.setNextFocusableComponent(btn_pnl1_tab2);
        btn_pnl1_tab1.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_pnl1_tab1.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_pnl1_tab1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_pnl1_tab1FocusLost(evt);
            }
        });
        btn_pnl1_tab1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_pnl1_tab1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_pnl1_tab1MouseExited(evt);
            }
        });
        btn_pnl1_tab1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_pnl1_tab1KeyPressed(evt);
            }
        });

        lid1.setBackground(new java.awt.Color(225, 223, 223));
        lid1.setkBorderRadius(15);
        lid1.setkEndColor(new java.awt.Color(211, 211, 211));
        lid1.setkStartColor(new java.awt.Color(211, 211, 211));
        lid1.setOpaque(false);
        lid1.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid1Layout = new javax.swing.GroupLayout(lid1);
        lid1.setLayout(lid1Layout);
        lid1Layout.setHorizontalGroup(
            lid1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid1Layout.setVerticalGroup(
            lid1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl1_menu1Layout = new javax.swing.GroupLayout(pnl1_menu1);
        pnl1_menu1.setLayout(pnl1_menu1Layout);
        pnl1_menu1Layout.setHorizontalGroup(
            pnl1_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_pnl1_tab1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl1_menu1Layout.setVerticalGroup(
            pnl1_menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_pnl1_tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnl1_menu2.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl1_menu2.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl1_menu2.setOpaque(false);
        pnl1_menu2.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_pnl1_tab2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_pnl1_tab2.setText("TAB 2");
        btn_pnl1_tab2.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_pnl1_tab2.setkBorderRadius(20);
        btn_pnl1_tab2.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_pnl1_tab2.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_pnl1_tab2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_pnl1_tab2.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_pnl1_tab2.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_pnl1_tab2.setNextFocusableComponent(btn_pnl1_tab3);
        btn_pnl1_tab2.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_pnl1_tab2.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_pnl1_tab2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_pnl1_tab2FocusLost(evt);
            }
        });
        btn_pnl1_tab2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_pnl1_tab2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_pnl1_tab2MouseExited(evt);
            }
        });
        btn_pnl1_tab2.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_pnl1_tab2KeyPressed(evt);
            }
        });

        lid2.setBackground(new java.awt.Color(225, 223, 223));
        lid2.setkBorderRadius(15);
        lid2.setkEndColor(new java.awt.Color(211, 211, 211));
        lid2.setkStartColor(new java.awt.Color(211, 211, 211));
        lid2.setOpaque(false);
        lid2.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid2Layout = new javax.swing.GroupLayout(lid2);
        lid2.setLayout(lid2Layout);
        lid2Layout.setHorizontalGroup(
            lid2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid2Layout.setVerticalGroup(
            lid2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl1_menu2Layout = new javax.swing.GroupLayout(pnl1_menu2);
        pnl1_menu2.setLayout(pnl1_menu2Layout);
        pnl1_menu2Layout.setHorizontalGroup(
            pnl1_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_pnl1_tab2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl1_menu2Layout.setVerticalGroup(
            pnl1_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_pnl1_tab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl1_menu3.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl1_menu3.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl1_menu3.setOpaque(false);
        pnl1_menu3.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_pnl1_tab3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_pnl1_tab3.setText("TAB 3");
        btn_pnl1_tab3.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_pnl1_tab3.setkBorderRadius(20);
        btn_pnl1_tab3.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_pnl1_tab3.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_pnl1_tab3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_pnl1_tab3.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_pnl1_tab3.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_pnl1_tab3.setNextFocusableComponent(btn_pnl1_tab1);
        btn_pnl1_tab3.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_pnl1_tab3.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_pnl1_tab3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_pnl1_tab3FocusLost(evt);
            }
        });
        btn_pnl1_tab3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_pnl1_tab3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_pnl1_tab3MouseExited(evt);
            }
        });
        btn_pnl1_tab3.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_pnl1_tab3KeyPressed(evt);
            }
        });

        lid3.setBackground(new java.awt.Color(225, 223, 223));
        lid3.setkBorderRadius(15);
        lid3.setkEndColor(new java.awt.Color(211, 211, 211));
        lid3.setkStartColor(new java.awt.Color(211, 211, 211));
        lid3.setOpaque(false);
        lid3.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid3Layout = new javax.swing.GroupLayout(lid3);
        lid3.setLayout(lid3Layout);
        lid3Layout.setHorizontalGroup(
            lid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid3Layout.setVerticalGroup(
            lid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl1_menu3Layout = new javax.swing.GroupLayout(pnl1_menu3);
        pnl1_menu3.setLayout(pnl1_menu3Layout);
        pnl1_menu3Layout.setHorizontalGroup(
            pnl1_menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1_menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_pnl1_tab3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl1_menu3Layout.setVerticalGroup(
            pnl1_menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_pnl1_tab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnl1_menubarLayout = new javax.swing.GroupLayout(pnl1_menubar);
        pnl1_menubar.setLayout(pnl1_menubarLayout);
        pnl1_menubarLayout.setHorizontalGroup(
            pnl1_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menubarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pnl1_menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl1_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(pnl1_menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(418, Short.MAX_VALUE))
        );
        pnl1_menubarLayout.setVerticalGroup(
            pnl1_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1_menubarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl1_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl1_menu1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(pnl1_menu3, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(pnl1_menu2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PANEL 1");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl1_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel1Layout.createSequentialGroup()
                    .addGap(410, 410, 410)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(410, Short.MAX_VALUE)))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pnl1_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap(696, Short.MAX_VALUE))
            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel1Layout.createSequentialGroup()
                    .addGap(365, 365, 365)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(365, Short.MAX_VALUE)))
        );

        panel2.setkBorderRadius(40);
        panel2.setkEndColor(new java.awt.Color(150, 195, 248));
        panel2.setkStartColor(new java.awt.Color(150, 195, 248));
        panel2.setOpaque(false);
        panel2.setPreferredSize(new java.awt.Dimension(1120, 780));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PANEL 2");

        pnl2_menubar.setkBorderRadius(20);
        pnl2_menubar.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl2_menubar.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl2_menubar.setOpaque(false);
        pnl2_menubar.setPreferredSize(new java.awt.Dimension(1108, 60));

        pnl1_menu4.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl1_menu4.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl1_menu4.setOpaque(false);
        pnl1_menu4.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_pnl2_tab1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_pnl2_tab1.setText("TAB 1");
        btn_pnl2_tab1.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_pnl2_tab1.setkBorderRadius(20);
        btn_pnl2_tab1.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_pnl2_tab1.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_pnl2_tab1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_pnl2_tab1.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_pnl2_tab1.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_pnl2_tab1.setNextFocusableComponent(btn_pnl2_tab2);
        btn_pnl2_tab1.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_pnl2_tab1.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_pnl2_tab1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_pnl2_tab1FocusLost(evt);
            }
        });
        btn_pnl2_tab1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_pnl2_tab1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_pnl2_tab1MouseExited(evt);
            }
        });
        btn_pnl2_tab1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_pnl2_tab1KeyPressed(evt);
            }
        });

        lid4.setBackground(new java.awt.Color(225, 223, 223));
        lid4.setkBorderRadius(15);
        lid4.setkEndColor(new java.awt.Color(211, 211, 211));
        lid4.setkStartColor(new java.awt.Color(211, 211, 211));
        lid4.setOpaque(false);
        lid4.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid4Layout = new javax.swing.GroupLayout(lid4);
        lid4.setLayout(lid4Layout);
        lid4Layout.setHorizontalGroup(
            lid4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid4Layout.setVerticalGroup(
            lid4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl1_menu4Layout = new javax.swing.GroupLayout(pnl1_menu4);
        pnl1_menu4.setLayout(pnl1_menu4Layout);
        pnl1_menu4Layout.setHorizontalGroup(
            pnl1_menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1_menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid4, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_pnl2_tab1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl1_menu4Layout.setVerticalGroup(
            pnl1_menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_pnl2_tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnl1_menu5.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl1_menu5.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl1_menu5.setOpaque(false);
        pnl1_menu5.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_pnl2_tab2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_pnl2_tab2.setText("TAB 2");
        btn_pnl2_tab2.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_pnl2_tab2.setkBorderRadius(20);
        btn_pnl2_tab2.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_pnl2_tab2.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_pnl2_tab2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_pnl2_tab2.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_pnl2_tab2.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_pnl2_tab2.setNextFocusableComponent(btn_pnl2_tab3);
        btn_pnl2_tab2.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_pnl2_tab2.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_pnl2_tab2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_pnl2_tab2FocusLost(evt);
            }
        });
        btn_pnl2_tab2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_pnl2_tab2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_pnl2_tab2MouseExited(evt);
            }
        });
        btn_pnl2_tab2.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_pnl2_tab2KeyPressed(evt);
            }
        });

        lid5.setBackground(new java.awt.Color(225, 223, 223));
        lid5.setkBorderRadius(15);
        lid5.setkEndColor(new java.awt.Color(211, 211, 211));
        lid5.setkStartColor(new java.awt.Color(211, 211, 211));
        lid5.setOpaque(false);
        lid5.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid5Layout = new javax.swing.GroupLayout(lid5);
        lid5.setLayout(lid5Layout);
        lid5Layout.setHorizontalGroup(
            lid5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid5Layout.setVerticalGroup(
            lid5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl1_menu5Layout = new javax.swing.GroupLayout(pnl1_menu5);
        pnl1_menu5.setLayout(pnl1_menu5Layout);
        pnl1_menu5Layout.setHorizontalGroup(
            pnl1_menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1_menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid5, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_pnl2_tab2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl1_menu5Layout.setVerticalGroup(
            pnl1_menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_pnl2_tab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl1_menu6.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl1_menu6.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl1_menu6.setOpaque(false);
        pnl1_menu6.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_pnl2_tab3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_pnl2_tab3.setText("TAB 3");
        btn_pnl2_tab3.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_pnl2_tab3.setkBorderRadius(20);
        btn_pnl2_tab3.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_pnl2_tab3.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_pnl2_tab3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_pnl2_tab3.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_pnl2_tab3.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_pnl2_tab3.setNextFocusableComponent(btn_pnl2_tab1);
        btn_pnl2_tab3.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_pnl2_tab3.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_pnl2_tab3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_pnl2_tab3FocusLost(evt);
            }
        });
        btn_pnl2_tab3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_pnl2_tab3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_pnl2_tab3MouseExited(evt);
            }
        });
        btn_pnl2_tab3.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_pnl2_tab3KeyPressed(evt);
            }
        });

        lid6.setBackground(new java.awt.Color(225, 223, 223));
        lid6.setkBorderRadius(15);
        lid6.setkEndColor(new java.awt.Color(211, 211, 211));
        lid6.setkStartColor(new java.awt.Color(211, 211, 211));
        lid6.setOpaque(false);
        lid6.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid6Layout = new javax.swing.GroupLayout(lid6);
        lid6.setLayout(lid6Layout);
        lid6Layout.setHorizontalGroup(
            lid6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid6Layout.setVerticalGroup(
            lid6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl1_menu6Layout = new javax.swing.GroupLayout(pnl1_menu6);
        pnl1_menu6.setLayout(pnl1_menu6Layout);
        pnl1_menu6Layout.setHorizontalGroup(
            pnl1_menu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1_menu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid6, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_pnl2_tab3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl1_menu6Layout.setVerticalGroup(
            pnl1_menu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_pnl2_tab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnl2_menubarLayout = new javax.swing.GroupLayout(pnl2_menubar);
        pnl2_menubar.setLayout(pnl2_menubarLayout);
        pnl2_menubarLayout.setHorizontalGroup(
            pnl2_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2_menubarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pnl1_menu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl1_menu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(pnl1_menu6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(418, Short.MAX_VALUE))
        );
        pnl2_menubarLayout.setVerticalGroup(
            pnl2_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2_menubarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl2_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl1_menu4, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(pnl1_menu6, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(pnl1_menu5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl2_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pnl2_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(299, 299, 299)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(347, Short.MAX_VALUE))
        );

        panel3.setkBorderRadius(40);
        panel3.setkEndColor(new java.awt.Color(150, 195, 248));
        panel3.setkStartColor(new java.awt.Color(150, 195, 248));
        panel3.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PANEL 3");

        pnl3_menubar.setkBorderRadius(20);
        pnl3_menubar.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl3_menubar.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl3_menubar.setOpaque(false);
        pnl3_menubar.setPreferredSize(new java.awt.Dimension(1108, 60));

        pnl1_menu16.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl1_menu16.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl1_menu16.setOpaque(false);
        pnl1_menu16.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_pnl3_tab1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_pnl3_tab1.setText("TAB 1");
        btn_pnl3_tab1.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_pnl3_tab1.setkBorderRadius(20);
        btn_pnl3_tab1.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_pnl3_tab1.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_pnl3_tab1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_pnl3_tab1.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_pnl3_tab1.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_pnl3_tab1.setNextFocusableComponent(btn_pnl3_tab2);
        btn_pnl3_tab1.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_pnl3_tab1.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_pnl3_tab1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_pnl3_tab1FocusLost(evt);
            }
        });
        btn_pnl3_tab1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_pnl3_tab1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_pnl3_tab1MouseExited(evt);
            }
        });
        btn_pnl3_tab1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_pnl3_tab1KeyPressed(evt);
            }
        });

        lid16.setBackground(new java.awt.Color(225, 223, 223));
        lid16.setkBorderRadius(15);
        lid16.setkEndColor(new java.awt.Color(211, 211, 211));
        lid16.setkStartColor(new java.awt.Color(211, 211, 211));
        lid16.setOpaque(false);
        lid16.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid16Layout = new javax.swing.GroupLayout(lid16);
        lid16.setLayout(lid16Layout);
        lid16Layout.setHorizontalGroup(
            lid16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid16Layout.setVerticalGroup(
            lid16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl1_menu16Layout = new javax.swing.GroupLayout(pnl1_menu16);
        pnl1_menu16.setLayout(pnl1_menu16Layout);
        pnl1_menu16Layout.setHorizontalGroup(
            pnl1_menu16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1_menu16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid16, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_pnl3_tab1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl1_menu16Layout.setVerticalGroup(
            pnl1_menu16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_pnl3_tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnl1_menu17.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl1_menu17.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl1_menu17.setOpaque(false);
        pnl1_menu17.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_pnl3_tab2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_pnl3_tab2.setText("TAB 2");
        btn_pnl3_tab2.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_pnl3_tab2.setkBorderRadius(20);
        btn_pnl3_tab2.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_pnl3_tab2.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_pnl3_tab2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_pnl3_tab2.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_pnl3_tab2.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_pnl3_tab2.setNextFocusableComponent(btn_pnl3_tab3);
        btn_pnl3_tab2.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_pnl3_tab2.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_pnl3_tab2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_pnl3_tab2FocusLost(evt);
            }
        });
        btn_pnl3_tab2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_pnl3_tab2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_pnl3_tab2MouseExited(evt);
            }
        });
        btn_pnl3_tab2.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_pnl3_tab2KeyPressed(evt);
            }
        });

        lid17.setBackground(new java.awt.Color(225, 223, 223));
        lid17.setkBorderRadius(15);
        lid17.setkEndColor(new java.awt.Color(211, 211, 211));
        lid17.setkStartColor(new java.awt.Color(211, 211, 211));
        lid17.setOpaque(false);
        lid17.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid17Layout = new javax.swing.GroupLayout(lid17);
        lid17.setLayout(lid17Layout);
        lid17Layout.setHorizontalGroup(
            lid17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid17Layout.setVerticalGroup(
            lid17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl1_menu17Layout = new javax.swing.GroupLayout(pnl1_menu17);
        pnl1_menu17.setLayout(pnl1_menu17Layout);
        pnl1_menu17Layout.setHorizontalGroup(
            pnl1_menu17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1_menu17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid17, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_pnl3_tab2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl1_menu17Layout.setVerticalGroup(
            pnl1_menu17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_pnl3_tab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnl1_menu18.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl1_menu18.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl1_menu18.setOpaque(false);
        pnl1_menu18.setPreferredSize(new java.awt.Dimension(200, 60));

        btn_pnl3_tab3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_pnl3_tab3.setText("TAB 3");
        btn_pnl3_tab3.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        btn_pnl3_tab3.setkBorderRadius(20);
        btn_pnl3_tab3.setkEndColor(new java.awt.Color(255, 203, 109));
        btn_pnl3_tab3.setkHoverEndColor(new java.awt.Color(1, 109, 218));
        btn_pnl3_tab3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_pnl3_tab3.setkHoverStartColor(new java.awt.Color(1, 109, 218));
        btn_pnl3_tab3.setkStartColor(new java.awt.Color(255, 203, 109));
        btn_pnl3_tab3.setNextFocusableComponent(btn_pnl3_tab1);
        btn_pnl3_tab3.setPreferredSize(new java.awt.Dimension(185, 43));
        btn_pnl3_tab3.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                btn_pnl3_tab3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btn_pnl3_tab3FocusLost(evt);
            }
        });
        btn_pnl3_tab3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn_pnl3_tab3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn_pnl3_tab3MouseExited(evt);
            }
        });
        btn_pnl3_tab3.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_pnl3_tab3KeyPressed(evt);
            }
        });

        lid18.setBackground(new java.awt.Color(225, 223, 223));
        lid18.setkBorderRadius(15);
        lid18.setkEndColor(new java.awt.Color(211, 211, 211));
        lid18.setkStartColor(new java.awt.Color(211, 211, 211));
        lid18.setOpaque(false);
        lid18.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid18Layout = new javax.swing.GroupLayout(lid18);
        lid18.setLayout(lid18Layout);
        lid18Layout.setHorizontalGroup(
            lid18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid18Layout.setVerticalGroup(
            lid18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl1_menu18Layout = new javax.swing.GroupLayout(pnl1_menu18);
        pnl1_menu18.setLayout(pnl1_menu18Layout);
        pnl1_menu18Layout.setHorizontalGroup(
            pnl1_menu18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1_menu18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid18, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_pnl3_tab3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl1_menu18Layout.setVerticalGroup(
            pnl1_menu18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_pnl3_tab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnl3_menubarLayout = new javax.swing.GroupLayout(pnl3_menubar);
        pnl3_menubar.setLayout(pnl3_menubarLayout);
        pnl3_menubarLayout.setHorizontalGroup(
            pnl3_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl3_menubarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pnl1_menu16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl1_menu17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(pnl1_menu18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(418, Short.MAX_VALUE))
        );
        pnl3_menubarLayout.setVerticalGroup(
            pnl3_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3_menubarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl3_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl1_menu16, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(pnl1_menu18, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(pnl1_menu17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl3_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pnl3_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(299, 299, 299)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(347, Short.MAX_VALUE))
        );

        panel4.setkBorderRadius(40);
        panel4.setkEndColor(new java.awt.Color(150, 195, 248));
        panel4.setkStartColor(new java.awt.Color(150, 195, 248));
        panel4.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PANEL 4");

        pnl4_menubar.setkBorderRadius(20);
        pnl4_menubar.setkEndColor(new java.awt.Color(255, 203, 109));
        pnl4_menubar.setkStartColor(new java.awt.Color(255, 203, 109));
        pnl4_menubar.setOpaque(false);
        pnl4_menubar.setPreferredSize(new java.awt.Dimension(1108, 60));

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
        btn_pnl4_tab1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_pnl4_tab1KeyPressed(evt);
            }
        });

        lid7.setBackground(new java.awt.Color(225, 223, 223));
        lid7.setkBorderRadius(15);
        lid7.setkEndColor(new java.awt.Color(211, 211, 211));
        lid7.setkStartColor(new java.awt.Color(211, 211, 211));
        lid7.setOpaque(false);
        lid7.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid7Layout = new javax.swing.GroupLayout(lid7);
        lid7.setLayout(lid7Layout);
        lid7Layout.setHorizontalGroup(
            lid7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid7Layout.setVerticalGroup(
            lid7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl1_menu7Layout = new javax.swing.GroupLayout(pnl1_menu7);
        pnl1_menu7.setLayout(pnl1_menu7Layout);
        pnl1_menu7Layout.setHorizontalGroup(
            pnl1_menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1_menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid7, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_pnl4_tab1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl1_menu7Layout.setVerticalGroup(
            pnl1_menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_pnl4_tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        btn_pnl4_tab2.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_pnl4_tab2KeyPressed(evt);
            }
        });

        lid8.setBackground(new java.awt.Color(225, 223, 223));
        lid8.setkBorderRadius(15);
        lid8.setkEndColor(new java.awt.Color(211, 211, 211));
        lid8.setkStartColor(new java.awt.Color(211, 211, 211));
        lid8.setOpaque(false);
        lid8.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid8Layout = new javax.swing.GroupLayout(lid8);
        lid8.setLayout(lid8Layout);
        lid8Layout.setHorizontalGroup(
            lid8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid8Layout.setVerticalGroup(
            lid8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl1_menu8Layout = new javax.swing.GroupLayout(pnl1_menu8);
        pnl1_menu8.setLayout(pnl1_menu8Layout);
        pnl1_menu8Layout.setHorizontalGroup(
            pnl1_menu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1_menu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid8, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_pnl4_tab2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl1_menu8Layout.setVerticalGroup(
            pnl1_menu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_pnl4_tab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        btn_pnl4_tab3.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_pnl4_tab3KeyPressed(evt);
            }
        });

        lid9.setBackground(new java.awt.Color(225, 223, 223));
        lid9.setkBorderRadius(15);
        lid9.setkEndColor(new java.awt.Color(211, 211, 211));
        lid9.setkStartColor(new java.awt.Color(211, 211, 211));
        lid9.setOpaque(false);
        lid9.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid9Layout = new javax.swing.GroupLayout(lid9);
        lid9.setLayout(lid9Layout);
        lid9Layout.setHorizontalGroup(
            lid9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid9Layout.setVerticalGroup(
            lid9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl1_menu9Layout = new javax.swing.GroupLayout(pnl1_menu9);
        pnl1_menu9.setLayout(pnl1_menu9Layout);
        pnl1_menu9Layout.setHorizontalGroup(
            pnl1_menu9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1_menu9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid9, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_pnl4_tab3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl1_menu9Layout.setVerticalGroup(
            pnl1_menu9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_pnl4_tab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnl4_menubarLayout = new javax.swing.GroupLayout(pnl4_menubar);
        pnl4_menubar.setLayout(pnl4_menubarLayout);
        pnl4_menubarLayout.setHorizontalGroup(
            pnl4_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl4_menubarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pnl1_menu7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl1_menu8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(pnl1_menu9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(418, Short.MAX_VALUE))
        );
        pnl4_menubarLayout.setVerticalGroup(
            pnl4_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl4_menubarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnl4_menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl1_menu7, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(pnl1_menu9, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(pnl1_menu8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl4_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pnl4_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(299, 299, 299)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(347, Short.MAX_VALUE))
        );

        panel5.setkBorderRadius(40);
        panel5.setkEndColor(new java.awt.Color(150, 195, 248));
        panel5.setkStartColor(new java.awt.Color(150, 195, 248));
        panel5.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PANEL 5");

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
        btn_pnl5_tab1.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_pnl5_tab1KeyPressed(evt);
            }
        });

        lid10.setBackground(new java.awt.Color(225, 223, 223));
        lid10.setkBorderRadius(15);
        lid10.setkEndColor(new java.awt.Color(211, 211, 211));
        lid10.setkStartColor(new java.awt.Color(211, 211, 211));
        lid10.setOpaque(false);
        lid10.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid10Layout = new javax.swing.GroupLayout(lid10);
        lid10.setLayout(lid10Layout);
        lid10Layout.setHorizontalGroup(
            lid10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid10Layout.setVerticalGroup(
            lid10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl1_menu10Layout = new javax.swing.GroupLayout(pnl1_menu10);
        pnl1_menu10.setLayout(pnl1_menu10Layout);
        pnl1_menu10Layout.setHorizontalGroup(
            pnl1_menu10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1_menu10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid10, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_pnl5_tab1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl1_menu10Layout.setVerticalGroup(
            pnl1_menu10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_pnl5_tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        lid11.setBackground(new java.awt.Color(225, 223, 223));
        lid11.setkBorderRadius(15);
        lid11.setkEndColor(new java.awt.Color(211, 211, 211));
        lid11.setkStartColor(new java.awt.Color(211, 211, 211));
        lid11.setOpaque(false);
        lid11.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid11Layout = new javax.swing.GroupLayout(lid11);
        lid11.setLayout(lid11Layout);
        lid11Layout.setHorizontalGroup(
            lid11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid11Layout.setVerticalGroup(
            lid11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl1_menu11Layout = new javax.swing.GroupLayout(pnl1_menu11);
        pnl1_menu11.setLayout(pnl1_menu11Layout);
        pnl1_menu11Layout.setHorizontalGroup(
            pnl1_menu11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1_menu11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid11, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_pnl5_tab2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl1_menu11Layout.setVerticalGroup(
            pnl1_menu11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_pnl5_tab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        btn_pnl5_tab3.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                btn_pnl5_tab3KeyPressed(evt);
            }
        });

        lid12.setBackground(new java.awt.Color(225, 223, 223));
        lid12.setkBorderRadius(15);
        lid12.setkEndColor(new java.awt.Color(211, 211, 211));
        lid12.setkStartColor(new java.awt.Color(211, 211, 211));
        lid12.setOpaque(false);
        lid12.setPreferredSize(new java.awt.Dimension(200, 6));

        javax.swing.GroupLayout lid12Layout = new javax.swing.GroupLayout(lid12);
        lid12.setLayout(lid12Layout);
        lid12Layout.setHorizontalGroup(
            lid12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lid12Layout.setVerticalGroup(
            lid12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl1_menu12Layout = new javax.swing.GroupLayout(pnl1_menu12);
        pnl1_menu12.setLayout(pnl1_menu12Layout);
        pnl1_menu12Layout.setHorizontalGroup(
            pnl1_menu12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl1_menu12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lid12, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(btn_pnl5_tab3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl1_menu12Layout.setVerticalGroup(
            pnl1_menu12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1_menu12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_pnl5_tab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lid12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(410, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl5_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pnl5_menubar, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(299, 299, 299)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(347, Short.MAX_VALUE))
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
                .addComponent(panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_dash_mainLayout.setVerticalGroup(
            panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dash_mainLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
            .addGroup(panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_dash_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btn1MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn1MouseEntered
    {//GEN-HEADEREND:event_btn1MouseEntered
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn1MouseEntered

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_loginActionPerformed
    {//GEN-HEADEREND:event_btn_loginActionPerformed
        panel_login.setVisible(false);
        panel_dashboard.setVisible(true);
        lbl_dash_usr.setText(cmbbox_role.getSelectedItem().toString());
        lbl_dash_welcome.grabFocus();
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn2MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn2MouseEntered
    {//GEN-HEADEREND:event_btn2MouseEntered
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn2MouseEntered

    private void btn3MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn3MouseEntered
    {//GEN-HEADEREND:event_btn3MouseEntered
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn3MouseEntered

    private void btn4MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn4MouseEntered
    {//GEN-HEADEREND:event_btn4MouseEntered
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn4MouseEntered

    private void btn5MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn5MouseEntered
    {//GEN-HEADEREND:event_btn5MouseEntered
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn5MouseEntered

    private void btn_loginFocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_loginFocusGained
    {//GEN-HEADEREND:event_btn_loginFocusGained
        hover(btn_login, new Color(1, 109, 218), Color.black);
    }//GEN-LAST:event_btn_loginFocusGained

    private void btn_loginFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_loginFocusLost
    {//GEN-HEADEREND:event_btn_loginFocusLost
        hover(btn_login, new Color(255, 167, 6), Color.white);
    }//GEN-LAST:event_btn_loginFocusLost

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn1ActionPerformed
    {//GEN-HEADEREND:event_btn1ActionPerformed
        visibility(false, true, false, false, false, false, btn_pnl1_tab1);
    }//GEN-LAST:event_btn1ActionPerformed

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
        }

    }//GEN-LAST:event_btn_loginKeyPressed

    private void btn1FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn1FocusGained
    {//GEN-HEADEREND:event_btn1FocusGained
        hover(btn1, new Color(1, 109, 218), Color.black);
    }//GEN-LAST:event_btn1FocusGained

    private void btn1FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn1FocusLost
    {//GEN-HEADEREND:event_btn1FocusLost
        hover(btn1, new Color(255, 167, 6), Color.white);
    }//GEN-LAST:event_btn1FocusLost

    private void btn2FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn2FocusGained
    {//GEN-HEADEREND:event_btn2FocusGained
        hover(btn2, new Color(1, 109, 218), Color.black);
    }//GEN-LAST:event_btn2FocusGained

    private void btn2FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn2FocusLost
    {//GEN-HEADEREND:event_btn2FocusLost
        hover(btn2, new Color(255, 167, 6), Color.white);
    }//GEN-LAST:event_btn2FocusLost

    private void btn3FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn3FocusGained
    {//GEN-HEADEREND:event_btn3FocusGained
        hover(btn3, new Color(1, 109, 218), Color.black);
    }//GEN-LAST:event_btn3FocusGained

    private void btn3FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn3FocusLost
    {//GEN-HEADEREND:event_btn3FocusLost
        hover(btn3, new Color(255, 167, 6), Color.white);
    }//GEN-LAST:event_btn3FocusLost

    private void btn4FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn4FocusGained
    {//GEN-HEADEREND:event_btn4FocusGained
        hover(btn4, new Color(1, 109, 218), Color.black);
    }//GEN-LAST:event_btn4FocusGained

    private void btn4FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn4FocusLost
    {//GEN-HEADEREND:event_btn4FocusLost
        hover(btn4, new Color(255, 167, 6), Color.white);
    }//GEN-LAST:event_btn4FocusLost

    private void btn5FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn5FocusGained
    {//GEN-HEADEREND:event_btn5FocusGained
        hover(btn5, new Color(1, 109, 218), Color.black);
    }//GEN-LAST:event_btn5FocusGained

    private void btn5FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn5FocusLost
    {//GEN-HEADEREND:event_btn5FocusLost
        hover(btn5, new Color(255, 167, 6), Color.white);
    }//GEN-LAST:event_btn5FocusLost

    private void btn1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn1KeyPressed
    {//GEN-HEADEREND:event_btn1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(false, true, false, false, false, false, btn_pnl1_tab1);

        }
    }//GEN-LAST:event_btn1KeyPressed

    private void btn2KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn2KeyPressed
    {//GEN-HEADEREND:event_btn2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(false, false, true, false, false, false, btn_pnl2_tab1);
        }
    }//GEN-LAST:event_btn2KeyPressed

    private void btn3KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn3KeyPressed
    {//GEN-HEADEREND:event_btn3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(false, false, false, true, false, false, btn_pnl3_tab1);
        }
    }//GEN-LAST:event_btn3KeyPressed

    private void btn4KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn4KeyPressed
    {//GEN-HEADEREND:event_btn4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(false, false, false, false, true, false, btn_pnl4_tab1);
        }
    }//GEN-LAST:event_btn4KeyPressed

    private void btn5KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn5KeyPressed
    {//GEN-HEADEREND:event_btn5KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            visibility(false, false, false, false, false, true, btn_pnl5_tab1);
        }
    }//GEN-LAST:event_btn5KeyPressed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn2ActionPerformed
    {//GEN-HEADEREND:event_btn2ActionPerformed
        visibility(false, false, true, false, false, false, btn_pnl2_tab1);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn3ActionPerformed
    {//GEN-HEADEREND:event_btn3ActionPerformed
        visibility(false, false, false, true, false, false, btn_pnl3_tab1);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn4ActionPerformed
    {//GEN-HEADEREND:event_btn4ActionPerformed
        visibility(false, false, false, false, true, false, btn_pnl4_tab1);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn5ActionPerformed
    {//GEN-HEADEREND:event_btn5ActionPerformed
        visibility(false, false, false, false, false, true, btn_pnl5_tab1);
    }//GEN-LAST:event_btn5ActionPerformed

    private void lbl_dash_usrMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_dash_usrMouseClicked
    {//GEN-HEADEREND:event_lbl_dash_usrMouseClicked
        panel_dashboard.setVisible(false);
        panel_login.setVisible(true);
    }//GEN-LAST:event_lbl_dash_usrMouseClicked

    private void lbl_dash_welcomeMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbl_dash_welcomeMouseClicked
    {//GEN-HEADEREND:event_lbl_dash_welcomeMouseClicked
        visibility(true, false, false, false, false, false, btn_login);
    }//GEN-LAST:event_lbl_dash_welcomeMouseClicked

    private void btn_pnl1_tab1MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl1_tab1MouseEntered
    {//GEN-HEADEREND:event_btn_pnl1_tab1MouseEntered
//        lid1.setkStartColor(new Color(1, 109, 218));
//        lid1.setkEndColor(new Color(1, 109, 218));
//        lid1.setBackground(Color.black);

        btn_pnl1_tab1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    }//GEN-LAST:event_btn_pnl1_tab1MouseEntered

    private void btn_pnl1_tab1MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl1_tab1MouseExited
    {//GEN-HEADEREND:event_btn_pnl1_tab1MouseExited
//        lid1.setkStartColor(new Color(211, 211, 211));
//        lid1.setkEndColor(new Color(211, 211, 211));
//        lid1.setBackground(Color.white);

//        kButton1.setkStartColor(new Color(255, 203, 109));
//        kButton1.setkEndColor(new Color(255, 203, 109));
//        kButton1.setBackground(Color.white);
    }//GEN-LAST:event_btn_pnl1_tab1MouseExited

    private void btn_pnl1_tab2MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl1_tab2MouseEntered
    {//GEN-HEADEREND:event_btn_pnl1_tab2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl1_tab2MouseEntered

    private void btn_pnl1_tab2MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl1_tab2MouseExited
    {//GEN-HEADEREND:event_btn_pnl1_tab2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl1_tab2MouseExited

    private void btn_pnl1_tab3MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl1_tab3MouseEntered
    {//GEN-HEADEREND:event_btn_pnl1_tab3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl1_tab3MouseEntered

    private void btn_pnl1_tab3MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl1_tab3MouseExited
    {//GEN-HEADEREND:event_btn_pnl1_tab3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl1_tab3MouseExited

    private void btn1MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn1MouseExited
    {//GEN-HEADEREND:event_btn1MouseExited

    }//GEN-LAST:event_btn1MouseExited

    private void btn_pnl1_tab1FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl1_tab1FocusGained
    {//GEN-HEADEREND:event_btn_pnl1_tab1FocusGained
        hover(btn_pnl1_tab1, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_pnl1_tab1FocusGained

    private void btn_pnl1_tab1FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl1_tab1FocusLost
    {//GEN-HEADEREND:event_btn_pnl1_tab1FocusLost
        hover(btn_pnl1_tab1, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_pnl1_tab1FocusLost

    private void btn_pnl1_tab2FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl1_tab2FocusGained
    {//GEN-HEADEREND:event_btn_pnl1_tab2FocusGained
        hover(btn_pnl1_tab2, new Color(1, 109, 218), Color.white);

    }//GEN-LAST:event_btn_pnl1_tab2FocusGained

    private void btn_pnl1_tab2FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl1_tab2FocusLost
    {//GEN-HEADEREND:event_btn_pnl1_tab2FocusLost
        hover(btn_pnl1_tab2, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_pnl1_tab2FocusLost

    private void btn_pnl1_tab3FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl1_tab3FocusGained
    {//GEN-HEADEREND:event_btn_pnl1_tab3FocusGained
        hover(btn_pnl1_tab3, new Color(1, 109, 218), Color.white);

    }//GEN-LAST:event_btn_pnl1_tab3FocusGained

    private void btn_pnl1_tab3FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl1_tab3FocusLost
    {//GEN-HEADEREND:event_btn_pnl1_tab3FocusLost
        hover(btn_pnl1_tab3, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_pnl1_tab3FocusLost

    private void btn_pnl1_tab1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_pnl1_tab1KeyPressed
    {//GEN-HEADEREND:event_btn_pnl1_tab1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btn1.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
        }
    }//GEN-LAST:event_btn_pnl1_tab1KeyPressed

    private void btn_pnl1_tab2KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_pnl1_tab2KeyPressed
    {//GEN-HEADEREND:event_btn_pnl1_tab2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btn1.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
        }
    }//GEN-LAST:event_btn_pnl1_tab2KeyPressed

    private void btn_pnl1_tab3KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_pnl1_tab3KeyPressed
    {//GEN-HEADEREND:event_btn_pnl1_tab3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btn1.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
        }

    }//GEN-LAST:event_btn_pnl1_tab3KeyPressed

    private void btn_pnl2_tab1FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl2_tab1FocusGained
    {//GEN-HEADEREND:event_btn_pnl2_tab1FocusGained
        hover(btn_pnl2_tab1, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_pnl2_tab1FocusGained

    private void btn_pnl2_tab1FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl2_tab1FocusLost
    {//GEN-HEADEREND:event_btn_pnl2_tab1FocusLost
        hover(btn_pnl2_tab1, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_pnl2_tab1FocusLost

    private void btn_pnl2_tab1MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl2_tab1MouseEntered
    {//GEN-HEADEREND:event_btn_pnl2_tab1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl2_tab1MouseEntered

    private void btn_pnl2_tab1MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl2_tab1MouseExited
    {//GEN-HEADEREND:event_btn_pnl2_tab1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl2_tab1MouseExited

    private void btn_pnl2_tab1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_pnl2_tab1KeyPressed
    {//GEN-HEADEREND:event_btn_pnl2_tab1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btn2.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
        }
    }//GEN-LAST:event_btn_pnl2_tab1KeyPressed

    private void btn_pnl2_tab2FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl2_tab2FocusGained
    {//GEN-HEADEREND:event_btn_pnl2_tab2FocusGained
        hover(btn_pnl2_tab2, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_pnl2_tab2FocusGained

    private void btn_pnl2_tab2FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl2_tab2FocusLost
    {//GEN-HEADEREND:event_btn_pnl2_tab2FocusLost
        hover(btn_pnl2_tab2, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_pnl2_tab2FocusLost

    private void btn_pnl2_tab2MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl2_tab2MouseEntered
    {//GEN-HEADEREND:event_btn_pnl2_tab2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl2_tab2MouseEntered

    private void btn_pnl2_tab2MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl2_tab2MouseExited
    {//GEN-HEADEREND:event_btn_pnl2_tab2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl2_tab2MouseExited

    private void btn_pnl2_tab2KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_pnl2_tab2KeyPressed
    {//GEN-HEADEREND:event_btn_pnl2_tab2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btn2.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
        }
    }//GEN-LAST:event_btn_pnl2_tab2KeyPressed

    private void btn_pnl2_tab3FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl2_tab3FocusGained
    {//GEN-HEADEREND:event_btn_pnl2_tab3FocusGained
        hover(btn_pnl2_tab3, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_pnl2_tab3FocusGained

    private void btn_pnl2_tab3FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl2_tab3FocusLost
    {//GEN-HEADEREND:event_btn_pnl2_tab3FocusLost
        hover(btn_pnl2_tab3, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_pnl2_tab3FocusLost

    private void btn_pnl2_tab3MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl2_tab3MouseEntered
    {//GEN-HEADEREND:event_btn_pnl2_tab3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl2_tab3MouseEntered

    private void btn_pnl2_tab3MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl2_tab3MouseExited
    {//GEN-HEADEREND:event_btn_pnl2_tab3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl2_tab3MouseExited

    private void btn_pnl2_tab3KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_pnl2_tab3KeyPressed
    {//GEN-HEADEREND:event_btn_pnl2_tab3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btn2.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
        }
    }//GEN-LAST:event_btn_pnl2_tab3KeyPressed

    private void btn_pnl3_tab1FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl3_tab1FocusGained
    {//GEN-HEADEREND:event_btn_pnl3_tab1FocusGained
        hover(btn_pnl3_tab1, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_pnl3_tab1FocusGained

    private void btn_pnl3_tab1FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl3_tab1FocusLost
    {//GEN-HEADEREND:event_btn_pnl3_tab1FocusLost
        hover(btn_pnl3_tab1, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_pnl3_tab1FocusLost

    private void btn_pnl3_tab1MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl3_tab1MouseEntered
    {//GEN-HEADEREND:event_btn_pnl3_tab1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl3_tab1MouseEntered

    private void btn_pnl3_tab1MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl3_tab1MouseExited
    {//GEN-HEADEREND:event_btn_pnl3_tab1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl3_tab1MouseExited

    private void btn_pnl3_tab1KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_pnl3_tab1KeyPressed
    {//GEN-HEADEREND:event_btn_pnl3_tab1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btn3.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
        }
    }//GEN-LAST:event_btn_pnl3_tab1KeyPressed

    private void btn_pnl3_tab2FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl3_tab2FocusGained
    {//GEN-HEADEREND:event_btn_pnl3_tab2FocusGained
        hover(btn_pnl3_tab2, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_pnl3_tab2FocusGained

    private void btn_pnl3_tab2FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl3_tab2FocusLost
    {//GEN-HEADEREND:event_btn_pnl3_tab2FocusLost
        hover(btn_pnl3_tab2, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_pnl3_tab2FocusLost

    private void btn_pnl3_tab2MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl3_tab2MouseEntered
    {//GEN-HEADEREND:event_btn_pnl3_tab2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl3_tab2MouseEntered

    private void btn_pnl3_tab2MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl3_tab2MouseExited
    {//GEN-HEADEREND:event_btn_pnl3_tab2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl3_tab2MouseExited

    private void btn_pnl3_tab2KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_pnl3_tab2KeyPressed
    {//GEN-HEADEREND:event_btn_pnl3_tab2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btn3.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
        }
    }//GEN-LAST:event_btn_pnl3_tab2KeyPressed

    private void btn_pnl3_tab3FocusGained(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl3_tab3FocusGained
    {//GEN-HEADEREND:event_btn_pnl3_tab3FocusGained
        hover(btn_pnl3_tab3, new Color(1, 109, 218), Color.white);
    }//GEN-LAST:event_btn_pnl3_tab3FocusGained

    private void btn_pnl3_tab3FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btn_pnl3_tab3FocusLost
    {//GEN-HEADEREND:event_btn_pnl3_tab3FocusLost
        hover(btn_pnl3_tab3, new Color(255, 203, 109), Color.black);
    }//GEN-LAST:event_btn_pnl3_tab3FocusLost

    private void btn_pnl3_tab3MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl3_tab3MouseEntered
    {//GEN-HEADEREND:event_btn_pnl3_tab3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl3_tab3MouseEntered

    private void btn_pnl3_tab3MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_btn_pnl3_tab3MouseExited
    {//GEN-HEADEREND:event_btn_pnl3_tab3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl3_tab3MouseExited

    private void btn_pnl3_tab3KeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_btn_pnl3_tab3KeyPressed
    {//GEN-HEADEREND:event_btn_pnl3_tab3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            btn3.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
        }
    }//GEN-LAST:event_btn_pnl3_tab3KeyPressed

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
            btn4.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
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
            btn4.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
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
            btn4.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
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
            btn5.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
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
            btn5.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
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
            btn5.grabFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
        }
    }//GEN-LAST:event_btn_pnl5_tab3KeyPressed

    private void btn_pnl5_tab2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btn_pnl5_tab2ActionPerformed
    {//GEN-HEADEREND:event_btn_pnl5_tab2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pnl5_tab2ActionPerformed

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

    public void visibility(boolean pnl_home, boolean pnl1, boolean pnl2, boolean pnl3, boolean pnl4, boolean pnl5, KButton btn)
    {
        panel_home.setVisible(pnl_home);
        panel1.setVisible(pnl1);
        panel2.setVisible(pnl2);
        panel3.setVisible(pnl3);
        panel4.setVisible(pnl4);
        panel5.setVisible(pnl5);
        btn.grabFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btn1;
    private com.k33ptoo.components.KButton btn2;
    private com.k33ptoo.components.KButton btn3;
    private com.k33ptoo.components.KButton btn4;
    private com.k33ptoo.components.KButton btn5;
    private com.k33ptoo.components.KButton btn_login;
    private com.k33ptoo.components.KButton btn_pnl1_tab1;
    private com.k33ptoo.components.KButton btn_pnl1_tab2;
    private com.k33ptoo.components.KButton btn_pnl1_tab3;
    private com.k33ptoo.components.KButton btn_pnl2_tab1;
    private com.k33ptoo.components.KButton btn_pnl2_tab2;
    private com.k33ptoo.components.KButton btn_pnl2_tab3;
    private com.k33ptoo.components.KButton btn_pnl3_tab1;
    private com.k33ptoo.components.KButton btn_pnl3_tab2;
    private com.k33ptoo.components.KButton btn_pnl3_tab3;
    private com.k33ptoo.components.KButton btn_pnl4_tab1;
    private com.k33ptoo.components.KButton btn_pnl4_tab2;
    private com.k33ptoo.components.KButton btn_pnl4_tab3;
    private com.k33ptoo.components.KButton btn_pnl5_tab1;
    private com.k33ptoo.components.KButton btn_pnl5_tab2;
    private com.k33ptoo.components.KButton btn_pnl5_tab3;
    private combo_suggestion.ComboBoxSuggestion cmbbox_role;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_dash_usr;
    private javax.swing.JLabel lbl_dash_welcome;
    private javax.swing.JLabel lbl_forgot_pswd;
    private javax.swing.JLabel lbl_login_img;
    private javax.swing.JLabel lbl_minimize;
    private javax.swing.JLabel lbl_pswd_icon;
    private javax.swing.JLabel lbl_role;
    private javax.swing.JLabel lbl_usr_icon;
    private com.k33ptoo.components.KGradientPanel lid1;
    private com.k33ptoo.components.KGradientPanel lid10;
    private com.k33ptoo.components.KGradientPanel lid11;
    private com.k33ptoo.components.KGradientPanel lid12;
    private com.k33ptoo.components.KGradientPanel lid16;
    private com.k33ptoo.components.KGradientPanel lid17;
    private com.k33ptoo.components.KGradientPanel lid18;
    private com.k33ptoo.components.KGradientPanel lid2;
    private com.k33ptoo.components.KGradientPanel lid3;
    private com.k33ptoo.components.KGradientPanel lid4;
    private com.k33ptoo.components.KGradientPanel lid5;
    private com.k33ptoo.components.KGradientPanel lid6;
    private com.k33ptoo.components.KGradientPanel lid7;
    private com.k33ptoo.components.KGradientPanel lid8;
    private com.k33ptoo.components.KGradientPanel lid9;
    private com.k33ptoo.components.KGradientPanel panel1;
    private com.k33ptoo.components.KGradientPanel panel2;
    private com.k33ptoo.components.KGradientPanel panel3;
    private com.k33ptoo.components.KGradientPanel panel4;
    private com.k33ptoo.components.KGradientPanel panel5;
    private com.k33ptoo.components.KGradientPanel panel_bg;
    private com.k33ptoo.components.KGradientPanel panel_dash_main;
    private com.k33ptoo.components.KGradientPanel panel_dash_menu;
    private javax.swing.JPanel panel_dashboard;
    private javax.swing.JPanel panel_header;
    private com.k33ptoo.components.KGradientPanel panel_home;
    private javax.swing.JPanel panel_login;
    private com.k33ptoo.components.KGradientPanel panel_login_img;
    private com.k33ptoo.components.KGradientPanel panel_login_main;
    private com.k33ptoo.components.KGradientPanel pnl1_menu1;
    private com.k33ptoo.components.KGradientPanel pnl1_menu10;
    private com.k33ptoo.components.KGradientPanel pnl1_menu11;
    private com.k33ptoo.components.KGradientPanel pnl1_menu12;
    private com.k33ptoo.components.KGradientPanel pnl1_menu16;
    private com.k33ptoo.components.KGradientPanel pnl1_menu17;
    private com.k33ptoo.components.KGradientPanel pnl1_menu18;
    private com.k33ptoo.components.KGradientPanel pnl1_menu2;
    private com.k33ptoo.components.KGradientPanel pnl1_menu3;
    private com.k33ptoo.components.KGradientPanel pnl1_menu4;
    private com.k33ptoo.components.KGradientPanel pnl1_menu5;
    private com.k33ptoo.components.KGradientPanel pnl1_menu6;
    private com.k33ptoo.components.KGradientPanel pnl1_menu7;
    private com.k33ptoo.components.KGradientPanel pnl1_menu8;
    private com.k33ptoo.components.KGradientPanel pnl1_menu9;
    private com.k33ptoo.components.KGradientPanel pnl1_menubar;
    private com.k33ptoo.components.KGradientPanel pnl2_menubar;
    private com.k33ptoo.components.KGradientPanel pnl3_menubar;
    private com.k33ptoo.components.KGradientPanel pnl4_menubar;
    private com.k33ptoo.components.KGradientPanel pnl5_menubar;
    private javax.swing.JPanel pnl_close;
    private com.k33ptoo.components.KGradientPanel pnl_menu_head;
    private javax.swing.JPanel pnl_minimize;
    private textfield.PasswordField txt_pswd;
    // End of variables declaration//GEN-END:variables
}
