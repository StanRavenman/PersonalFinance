
package personalfinance.gui.panel;

import javax.swing.JPanel;
import personalfinance.gui.MainFrame;
import personalfinance.gui.dialog.TransferAddEditDialog;
//import personalfinance.gui.handler.FunctionsHandler;
import personalfinance.gui.table.TransferTableData;
import personalfinance.gui.toolbar.FunctionsToolBar;
import personalfinance.settings.Style;

public class TransferPanel extends RightPanel {

    public TransferPanel(MainFrame frame) {
        super(frame, new TransferTableData(),"TRANSFERS", Style.ICON_PANEL_TRANSFERS, new FunctionsToolBar());
    }

}
