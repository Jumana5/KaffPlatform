package Dialogs;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Update {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Update window = new Update();
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
		shell.setBackgroundImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\Background.jpeg"));
		shell.setImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\\u0646\u0646\u0635\u0647.png"));
		shell.setBackground(SWTResourceManager.getColor(255, 255, 255));
		shell.setSize(456, 509);
		shell.setText("\u062A\u0639\u062F\u064A\u0644 \u0645\u0639\u0644\u0648\u0645\u0627\u062A \u0627\u0644\u0643\u062A\u0627\u0628 ");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setForeground(SWTResourceManager.getColor(255, 69, 0));
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setBackground(SWTResourceManager.getColor(255, 255, 255));
		lblNewLabel.setFont(SWTResourceManager.getFont("Dubai", 20, SWT.BOLD));
		lblNewLabel.setBounds(47, 24, 339, 32);
		lblNewLabel.setText("\"  \u0642\u0627\u0626\u0645\u0629 \u0645\u0646\u0635\u0629 \u0643\u0627\u0641  \"");
		
		Combo combo = new Combo(shell, SWT.NONE);
		combo.setFont(SWTResourceManager.getFont("Dubai", 10, SWT.NORMAL));
		combo.setBackground(SWTResourceManager.getColor(220, 220, 220));
		combo.setItems(new String[] {"\u0625\u0636\u0627\u0641\u0647 \u0643\u062A\u0627\u0628", "\u062A\u0639\u062F\u064A\u0644 \u0645\u0639\u0644\u0648\u0645\u0627\u062A \u0643\u062A\u0627\u0628", "\u0639\u0631\u0636 \u0645\u0639\u0644\u0648\u0645\u0627\u062A \u0627\u0644\u0643\u062A\u0628 \u0627\u0648 \u0627\u0644\u0645\u0633\u062A\u062E\u062F\u0645\u064A\u0646"});
		combo.setBounds(154, 62, 134, 30);
		combo.setText("\u062A\u0639\u062F\u064A\u0644 \u0645\u0639\u0644\u0648\u0645\u0627\u062A \u0643\u062A\u0627\u0628");
		
		Label label = new Label(shell, SWT.NONE);
		label.setText(":\u0623\u0633\u0645 \u0627\u0644\u0643\u062A\u0627\u0628");
		label.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.NORMAL));
		label.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		label.setBounds(315, 173, 84, 31);
		
		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setText(":\u0627\u0644\u0645\u0633\u062A\u0648\u0649");
		label_1.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.NORMAL));
		label_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		label_1.setBounds(333, 215, 66, 31);
		
		Label label_2 = new Label(shell, SWT.NONE);
		label_2.setText(":\u0627\u0644\u062D\u0627\u0644\u0647");
		label_2.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.NORMAL));
		label_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		label_2.setBounds(355, 265, 43, 31);
		
		Label label_3 = new Label(shell, SWT.NONE);
		label_3.setText(":\u0627\u0644\u0633\u0639\u0631");
		label_3.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.NORMAL));
		label_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		label_3.setBounds(355, 316, 44, 31);
		
		Button button = new Button(shell, SWT.RADIO);
		button.setText("\u0644\u0644\u0628\u064A\u0639");
		button.setSelection(true);
		button.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.NORMAL));
		button.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		button.setBounds(286, 376, 99, 31);
		
		Button button_1 = new Button(shell, SWT.RADIO);
		button_1.setText("\u0644\u0644\u0625\u0639\u0627\u0631\u0647");
		button_1.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.NORMAL));
		button_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		button_1.setBounds(185, 376, 90, 31);
		
		Button button_2 = new Button(shell, SWT.RADIO);
		button_2.setText("\u0645\u062C\u0627\u0646\u0627\u064B");
		button_2.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.NORMAL));
		button_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		button_2.setBounds(78, 376, 90, 31);
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(123, 326, 168, 21);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(123, 225, 168, 21);
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(123, 179, 167, 21);
		
		Label label_4 = new Label(shell, SWT.NONE);
		label_4.setAlignment(SWT.RIGHT);
		label_4.setText("\u062A\u0639\u062F\u064A\u0644 \u0645\u0639\u0644\u0640\u0640\u0640\u0640\u0640\u0640\u0648\u0645\u0627\u062A \u0627\u0644\u0643\u062A\u0627\u0628");
		label_4.setForeground(SWTResourceManager.getColor(0, 0, 0));
		label_4.setFont(SWTResourceManager.getFont("Dubai", 16, SWT.BOLD));
		label_4.setBackground(SWTResourceManager.getColor(255, 255, 255));
		label_4.setBounds(0, 88, 331, 41);
		
		Button button_3 = new Button(shell, SWT.CHECK);
		button_3.setBackground(SWTResourceManager.getColor(255, 255, 255));
		button_3.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.BOLD));
		button_3.setForeground(SWTResourceManager.getColor(0, 255, 0));
		button_3.setBounds(216, 273, 91, 32);
		button_3.setText("\u0645\u062A\u0648\u0641\u0631");
		
		Button button_4 = new Button(shell, SWT.CHECK);
		button_4.setBackground(SWTResourceManager.getColor(255, 255, 255));
		button_4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_4.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.BOLD));
		button_4.setForeground(SWTResourceManager.getColor(255, 0, 0));
		button_4.setBounds(86, 273, 99, 32);
		button_4.setText("\u063A\u064A\u0631 \u0645\u062A\u0648\u0641\u0631");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setForeground(SWTResourceManager.getColor(255, 255, 255));
		btnNewButton.setBackground(SWTResourceManager.getColor(128, 128, 128));
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setFont(SWTResourceManager.getFont("Dubai", 13, SWT.BOLD));
		btnNewButton.setBounds(123, 426, 76, 35);
		btnNewButton.setText("\u0625\u0644\u063A\u0627\u0621");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.setForeground(SWTResourceManager.getColor(255, 255, 255));
		btnNewButton_1.setBackground(SWTResourceManager.getColor(128, 128, 128));
		btnNewButton_1.setFont(SWTResourceManager.getFont("Dubai", 13, SWT.BOLD));
		btnNewButton_1.setBounds(230, 426, 76, 35);
		btnNewButton_1.setText("\u062A\u0639\u062F\u064A\u0644");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBackgroundImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\KaffPlatformheade.jpeg"));
		lblNewLabel_1.setBackground(SWTResourceManager.getColor(255, 255, 255));
		lblNewLabel_1.setBounds(0, 0, 446, 32);
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setText("\u0623\u062F\u062E\u0644 \u0639\u0646\u0648\u0627\u0646 \u0627\u0644\u0643\u062A\u0627\u0628, \u0631\u0645\u0632 \u0627\u0644\u0643\u062A\u0627\u0628 \u0623\u0648 \u0627\u0644\u0645\u0633\u062A\u0648\u0649");
		text_3.setForeground(SWTResourceManager.getColor(169, 169, 169));
		text_3.setBounds(76, 131, 222, 21);
		
		Button button_5 = new Button(shell, SWT.NONE);
		button_5.setImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\search-icon-.png"));
		button_5.setBackgroundImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\seach.jpg"));
		button_5.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		button_5.setBounds(289, 129, 25, 25);
		
		Label label_5 = new Label(shell, SWT.NONE);
		label_5.setText("\u0627\u0644\u0628\u062D\u062B");
		label_5.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.BOLD));
		label_5.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		label_5.setBounds(323, 125, 76, 31);

	}
}
