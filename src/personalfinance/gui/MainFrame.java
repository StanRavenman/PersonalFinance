package personalfinance.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import personalfinance.gui.dialog.*;
import personalfinance.gui.menu.MainMenu;
import personalfinance.gui.panel.*;
import personalfinance.gui.toolbar.MainToolBar;
import personalfinance.settings.Style;
import personalfinance.settings.Text;

public final class MainFrame extends JFrame implements Refresh  {

    private final GridBagConstraints constraints;
    private final MainMenu mb;
    private final MainToolBar tb;
    private final LeftPanel leftPanel;
    private RightPanel rightPanel;



    public MainFrame() {
        super(Text.get("PROGRAM_NAME"));

        setResizable(false);
        setIconImage(Style.ICON_MAIN.getImage());
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        mb = new MainMenu(this);
        setJMenuBar(mb);

        setLayout(new GridBagLayout());

        constraints = new GridBagConstraints();

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;


        tb = new MainToolBar();
        add(tb, constraints);

        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.NORTH;

        leftPanel = new LeftPanel(this);
        add(leftPanel, constraints);

        setRightPanel(new StatisticsPanel(this));
        pack();
        setLocationRelativeTo(null);

 /*       addWindowListener(new MainWindowHandler());
    }

    @Override
    public void refresh() {
        SwingUtilities.updateComponentTreeUI(this);
        tb.refresh();
        leftPanel.refresh();
        rightPanel.refresh();
        pack();
    }

    public MainMenu getMenu() {
        return mb;
    }



    public RightPanel getRightPanel() {
        return rightPanel;*/
    }

    @Override
    public void refresh() {
        SwingUtilities.updateComponentTreeUI(this);
        mb.refresh();
        leftPanel.refresh();
        pack();
    }

    public MainMenu getMenu() {
        return mb;
    }

    public void setRightPanel(RightPanel panel) {
        if (rightPanel != null) remove(rightPanel);
        constraints.gridy = 1;
        constraints.gridx = 1;
        rightPanel = panel;
        panel.setBorder(Style.BORDER_PANEL);
        add(rightPanel, constraints);
        pack();
    }
}
