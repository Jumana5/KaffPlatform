package App;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.awt.Color;

import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;

public class SearchFrame {

	protected Shell shell;
	private Text nkn;
	private Text text_1;
	private Text text_2;
	private Text text_3;

	public static void main(String[] args) {
		try {
			SearchFrame window = new SearchFrame();
			window.open();
			files.addRecords("search window has opened");
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
		shell.setText("\u0645\u0639\u0644\u0648\u0645\u0627\u062A \u0627\u0644\u0643\u062A\u0627\u0628");
		shell.setImage(SWTResourceManager
				.getImage("C:\\Users\\Admin\\git\\KaffPlatform\\KaffPlatformProject\\img\\منصة كاف.jpg"));
		shell.setBackgroundImage(SWTResourceManager
				.getImage("C:\\Users\\Admin\\git\\KaffPlatform\\KaffPlatformProject\\img\\Background.jpeg"));
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		shell.setSize(467, 454);

		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		lblNewLabel.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.BOLD));
		lblNewLabel.setBounds(308, 54, 76, 31);
		lblNewLabel.setText("\u0627\u0644\u0628\u062D\u062B");

		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setAlignment(SWT.RIGHT);
		lblNewLabel_1.setForeground(SWTResourceManager.getColor(210, 105, 30));
		lblNewLabel_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Dubai", 20, SWT.BOLD));
		lblNewLabel_1.setBounds(-8, 94, 319, 42);
		lblNewLabel_1.setText(
				"\u0645\u0639\u0644\u0648\u0645\u0640\u0640\u0640\u0640\u0640\u0627\u062A \u0627\u0644\u0643\u062A\u0627\u0628");

		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		lblNewLabel_2.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.NORMAL));
		lblNewLabel_2.setBounds(323, 147, 84, 31);
		lblNewLabel_2.setText(":\u0623\u0633\u0645 \u0627\u0644\u0643\u062A\u0627\u0628");

		Label label = new Label(shell, SWT.NONE);
		label.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		label.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.NORMAL));
		label.setBounds(341, 199, 66, 31);
		label.setText(":\u0627\u0644\u0645\u0633\u062A\u0648\u0649");

		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		label_1.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.NORMAL));
		label_1.setBounds(363, 252, 43, 31);
		label_1.setText(":\u0627\u0644\u062D\u0627\u0644\u0647");

		Label label_2 = new Label(shell, SWT.NONE);
		label_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		label_2.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.NORMAL));
		label_2.setBounds(363, 303, 44, 31);
		label_2.setText(":\u0627\u0644\u0633\u0639\u0631");

		Button btnRadioButton = new Button(shell, SWT.RADIO);
		btnRadioButton.setSelection(true);
		btnRadioButton.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.NORMAL));
		btnRadioButton.setBounds(308, 351, 99, 31);
		btnRadioButton.setText("\u0644\u0644\u0628\u064A\u0639");
		btnRadioButton.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		Button btnRadioButton_1 = new Button(shell, SWT.RADIO);
		btnRadioButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnRadioButton_1.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.NORMAL));
		btnRadioButton_1.setBounds(212, 351, 90, 31);
		btnRadioButton_1.setText("\u0644\u0644\u0625\u0639\u0627\u0631\u0647");
		btnRadioButton_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		Button btnRadioButton_2 = new Button(shell, SWT.RADIO);
		btnRadioButton_2.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.NORMAL));
		btnRadioButton_2.setBounds(116, 351, 90, 31);
		btnRadioButton_2.setText("\u0645\u062C\u0627\u0646\u0627\u064B");
		btnRadioButton_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

		nkn = new Text(shell, SWT.BORDER);
		nkn.setForeground(SWTResourceManager.getColor(169, 169, 169));
		nkn.setText(
				"\u0623\u062F\u062E\u0644 \u0639\u0646\u0648\u0627\u0646 \u0627\u0644\u0643\u062A\u0627\u0628, \u0631\u0645\u0632 \u0627\u0644\u0643\u062A\u0627\u0628 \u0623\u0648 \u0627\u0644\u0645\u0633\u062A\u0648\u0649");
		nkn.setBounds(61, 60, 222, 21);

		Button btnNewButton_2 = new Button(shell, SWT.NONE);
		btnNewButton_2.setBackgroundImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\seach.jpg"));
		btnNewButton_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		btnNewButton_2.setImage(SWTResourceManager.getImage("C:\\Users\\Doaa\\Pictures\\search-icon-.png"));

		btnNewButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_2.setBounds(274, 58, 25, 25);

		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(135, 153, 166, 21);

		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(135, 205, 167, 21);

		text_3 = new Text(shell, SWT.BORDER);
		text_3.setBounds(135, 309, 167, 21);

		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBackground(SWTResourceManager.getColor(154, 205, 50));
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.BOLD));
		btnNewButton.setForeground(SWTResourceManager.getColor(255, 255, 255));
		btnNewButton.setBounds(212, 251, 99, 35);
		btnNewButton.setText("\u0645\u062A\u0648\u0641\u0631");

		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.setBackground(SWTResourceManager.getColor(255, 215, 0));
		btnNewButton_1.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.BOLD));
		btnNewButton_1.setForeground(SWTResourceManager.getColor(255, 255, 255));
		btnNewButton_1.setBounds(84, 251, 99, 35);
		btnNewButton_1.setText("\u063A\u064A\u0631 \u0645\u062A\u0648\u0641\u0631");

		Label label_3 = new Label(shell, SWT.NONE);
		label_3.setBackgroundImage(SWTResourceManager.getImage(
				"C:\\\\Users\\\\Admin\\\\git\\\\KaffPlatform\\\\KaffPlatformProject\\\\img\\\\KaffPlatformheader.jpg"));
		label_3.setBounds(0, 0, 451, 42);

	}
}
