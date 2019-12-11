
package personalfinance.gui.panel;

import javax.swing.JPanel;
import personalfinance.gui.MainFrame;
import personalfinance.gui.dialog.TransactionAddEditDialog;
//import personalfinance.gui.handler.FunctionsHandler;
import personalfinance.gui.table.TransactionTableData;
import personalfinance.gui.toolbar.FunctionsToolBar;
import personalfinance.settings.Style;

public class OverviewPanel extends RightPanel {

    public OverviewPanel(MainFrame frame) {
        super(frame, new TransactionTableData(),"LAST_TRANSACTIONS", Style.ICON_PANEL_OVERVIEW);
    }

}
