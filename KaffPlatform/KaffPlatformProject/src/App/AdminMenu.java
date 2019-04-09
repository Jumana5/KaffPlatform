package App;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;

public class AdminMenu {

	protected Shell shell;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			AdminMenu window = new AdminMenu();
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
		shell.setBackgroundImage(SWTResourceManager
				.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\img\\Background.jpeg"));
		shell.setBackground(SWTResourceManager.getColor(255, 255, 255));
		shell.setSize(457, 321);
		shell.setText("\u0645\u0646\u0635\u0629 \u0643\u0627\u0641");

		Combo combo = new Combo(shell, SWT.NONE);
		combo.setFont(SWTResourceManager.getFont("Dubai", 14, SWT.NORMAL));
		combo.setItems(new String[] {
				"\u0625\u0636\u0627\u0641\u0647 \u0643\u062A\u0627\u0628 \u062C\u062F\u064A\u062F",
				"\u062A\u0639\u062F\u064A\u0644 \u0645\u0639\u0644\u0648\u0645\u0627\u062A \u0643\u062A\u0627\u0628",
				"\u0639\u0631\u0635 \u0645\u0639\u0644\u0648\u0645\u0627\u062A \u0627\u0644\u0643\u062A\u0628 \u0623\u0648 \u0627\u0644\u0645\u0633\u062A\u062E\u062F\u0645\u064A\u0646" });
		combo.setBounds(91, 129, 227, 44);
		combo.select(0);

		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setForeground(SWTResourceManager.getColor(255, 69, 0));
		lblNewLabel.setFont(SWTResourceManager.getFont("Dubai", 20, SWT.BOLD));
		lblNewLabel.setBackground(SWTResourceManager.getColor(255, 255, 255));
		lblNewLabel.setBounds(91, 52, 273, 64);
		lblNewLabel.setText("\u0642\u0627\u0626\u0645\u0629 \u0645\u0646\u0635\u0629 \u0643\u0627\u0641");

		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBackgroundImage(SWTResourceManager
				.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\img\\KaffPlatformheader.jpg"));
		lblNewLabel_1.setBounds(0, 0, 441, 46);

		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setBackgroundImage(SWTResourceManager
				.getImage("C:\\Users\\al5an\\git\\KaffPlatform\\KaffPlatformProject\\img\\signout small.png"));
		label_1.setBounds(10, 31, 42, 40);

	}
}
