package App;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Error {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Error window = new Error();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		shell.setImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\\u0646\u0646\u0635\u0647.png"));
		shell.setSize(378, 291);
		shell.setText("\u062E\u0637\u0623");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setAlignment(SWT.RIGHT);
		lblNewLabel.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));
		lblNewLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblNewLabel.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.BOLD));
		lblNewLabel.setBounds(-11, 164, 337, 32);
		lblNewLabel.setText(".\u0627\u0644\u0631\u062C\u0627\u0621 \u0625\u062F\u062E\u0627\u0644 \u0627\u0644\u0645\u0639\u0644\u0648\u0645\u0627\u062A \u0628\u0634\u0643\u0644 \u0635\u062D\u064A\u062D");
		
		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		label_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_LIST_FOREGROUND));
		label_1.setFont(SWTResourceManager.getFont("Dubai", 25, SWT.NORMAL));
		label_1.setAlignment(SWT.RIGHT);
		label_1.setBounds(114, 113, 99, 54);
		label_1.setText("!!\u062E\u0637\u0640\u0623");
		
		Label label = new Label(shell, SWT.NONE);
		label.setBackgroundImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\902ffca1-ac39-4377-9a5a-e5ed17e54892;,;.jpeg"));
		label.setBounds(129, 10, 99, 97);
		
		Button button = new Button(shell, SWT.NONE);
		button.setForeground(SWTResourceManager.getColor(255, 255, 255));
		button.setBackground(SWTResourceManager.getColor(178, 34, 34));
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				shell.close();
			}
		});
		button.setFont(SWTResourceManager.getFont("Dubai", 16, SWT.BOLD));
		button.setBounds(0, 217, 362, 35);
		button.setText("\u0625\u0646\u0647\u0627\u0621");

	}
}
