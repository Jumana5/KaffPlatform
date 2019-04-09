package App;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.graphics.Point;

public class AddBookKaff {

	protected Shell shell;
	private Text BookTitleTxt;
	private Text editionTxt;
	private Text priceTxtValue;
	private Text ownerIDValue;
	private Text nameVlaueTxt;
	private Text phoneTxt;
	private Text emailTxt;
// duaa is here :)
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			AddBookKaff window = new AddBookKaff();
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
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		shell.setSize(599, 779);
		shell.setText("إضافة كتاب جديد");
		
		Label headerLabel = new Label(shell, SWT.NONE);
		headerLabel.setImage(SWTResourceManager.getImage("C:\\Users\\al5an\\Desktop\\iau\\KaffPlatformheader.jpg"));
		headerLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		headerLabel.setBounds(0, 0, 607, 50);
		
		Label bookInfoLabel = new Label(shell, SWT.NONE);
		bookInfoLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		bookInfoLabel.setForeground(SWTResourceManager.getColor(210, 105, 30));
		bookInfoLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.BOLD));
		bookInfoLabel.setAlignment(SWT.CENTER);
		bookInfoLabel.setBounds(177, 130, 192, 28);
		bookInfoLabel.setText("معلومات الكتاب");
		
		Label bookTitleLabel = new Label(shell, SWT.NONE);
		bookTitleLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		bookTitleLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		bookTitleLabel.setBounds(415, 203, 119, 28);
		bookTitleLabel.setText("عنوان الكتاب");
		
		BookTitleTxt = new Text(shell, SWT.BORDER);
		BookTitleTxt.setBounds(56, 206, 334, 24);
		
		Label bookIDLabel = new Label(shell, SWT.NONE);
		bookIDLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		bookIDLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		bookIDLabel.setBounds(415, 170, 119, 32);
		bookIDLabel.setText("رمز الكتاب");
		
		Label bookIDLabelValue = new Label(shell, SWT.NONE);
		bookIDLabelValue.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		bookIDLabelValue.setBounds(321, 175, 69, 21);
		bookIDLabelValue.setText("23103");
		
		Label editionLabel = new Label(shell, SWT.NONE);
		editionLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		editionLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		editionLabel.setBounds(415, 235, 119, 28);
		editionLabel.setText("إصدار الكتاب");
		
		editionTxt = new Text(shell, SWT.BORDER);
		editionTxt.setBounds(271, 240, 119, 24);
		
		Label lvlLabel = new Label(shell, SWT.NONE);
		lvlLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lvlLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		lvlLabel.setText("المستوى");
		lvlLabel.setBounds(415, 269, 119, 27);
		
		Combo lvlBookCombo = new Combo(shell, SWT.NONE);
		lvlBookCombo.setItems(new String[] {"3", "4", "5", "6", "7", "8", "9", "10"});
		lvlBookCombo.setBounds(326, 272, 64, 25);
		lvlBookCombo.select(0);
		
		Label priceLabel = new Label(shell, SWT.NONE);
		priceLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		priceLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		priceLabel.setText("السعر");
		priceLabel.setBounds(415, 351, 119, 28);
		
		Group groupType = new Group(shell, SWT.NONE);
		groupType.setBounds(56, 320, 334, 24);
		
		Button button = new Button(groupType, SWT.RADIO);
		button.setSelection(true);
		button.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		button.setBounds(21, 0, 73, 21);
		button.setText("مجاناً");
		
		Button button_1 = new Button(groupType, SWT.RADIO);
		button_1.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		button_1.setBounds(130, 0, 73, 21);
		button_1.setText("إعارة");
		
		Button button_2 = new Button(groupType, SWT.RADIO);
		button_2.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		button_2.setBounds(233, 0, 80, 21);
		button_2.setText("للبيع");
		
		priceTxtValue = new Text(shell, SWT.BORDER);
		priceTxtValue.setBounds(326, 355, 64, 24);
		
		Label ownerInfoLabel = new Label(shell, SWT.NONE);
		ownerInfoLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		ownerInfoLabel.setForeground(SWTResourceManager.getColor(210, 105, 30));
		ownerInfoLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.BOLD));
		ownerInfoLabel.setText("معلومات صاحبة الكتاب");
		ownerInfoLabel.setAlignment(SWT.CENTER);
		ownerInfoLabel.setBounds(147, 400, 242, 28);
		
		Label ownerIDLabel = new Label(shell, SWT.NONE);
		ownerIDLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		ownerIDLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		ownerIDLabel.setBounds(415, 441, 119, 34);
		ownerIDLabel.setText("الرقم الأكاديمي");
		
		ownerIDValue = new Text(shell, SWT.BORDER);
		ownerIDValue.setBounds(204, 444, 186, 24);
		
		Label newOwnerLabel = new Label(shell, SWT.NONE);
		newOwnerLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		newOwnerLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		newOwnerLabel.setBounds(415, 479, 119, 38);
		newOwnerLabel.setText("مستخدم جديد؟ ");
		
		Group newOwnerAns = new Group(shell, SWT.NONE);
		newOwnerAns.setBounds(204, 486, 186, 21);
		
		Button button_4 = new Button(newOwnerAns, SWT.RADIO);
		button_4.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		button_4.setBounds(96, 0, 62, 21);
		button_4.setText("لا");
		
		Button button_3 = new Button(newOwnerAns, SWT.RADIO);
		button_3.setSelection(true);
		button_3.setLocation(10, 0);
		button_3.setSize(62, 21);
		button_3.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		button_3.setText("نعم");
		newOwnerAns.setTabList(new Control[]{button_3, button_4});
		
		Label nameLabel = new Label(shell, SWT.NONE);
		nameLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		nameLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		nameLabel.setBounds(415, 516, 119, 28);
		nameLabel.setText("الاسم الثلاثي");
		
		nameVlaueTxt = new Text(shell, SWT.BORDER);
		nameVlaueTxt.setBounds(56, 520, 334, 24);
		
		Label phoneLabel = new Label(shell, SWT.NONE);
		phoneLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		phoneLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		phoneLabel.setText("رقم الجوال");
		phoneLabel.setBounds(415, 550, 119, 27);
		
		phoneTxt = new Text(shell, SWT.BORDER);
		phoneTxt.setBounds(204, 556, 186, 24);
		
		Label ownerLvlLabel = new Label(shell, SWT.NONE);
		ownerLvlLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		ownerLvlLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		ownerLvlLabel.setBounds(415, 583, 119, 31);
		ownerLvlLabel.setText("المستوى");
		
		Combo owneLvlCombo = new Combo(shell, SWT.NONE);
		owneLvlCombo.setItems(new String[] {"3", "4", "5", "6", "7", "8", "9", "10"});
		owneLvlCombo.setBounds(326, 589, 64, 25);
		owneLvlCombo.select(0);
		
		Label emailLabel = new Label(shell, SWT.NONE);
		emailLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		emailLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		emailLabel.setBounds(415, 618, 119, 38);
		emailLabel.setText("البريد الإلكتروني");
		
		emailTxt = new Text(shell, SWT.BORDER);
		emailTxt.setBounds(56, 621, 334, 24);
		
		Button addButton = new Button(shell, SWT.NONE);
		addButton.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		addButton.setBounds(54, 666, 85, 26);
		addButton.setText("إضافة");
		
		Button backButton = new Button(shell, SWT.NONE);
		backButton.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		backButton.setBounds(150, 666, 85, 26);
		backButton.setText("رجوع");
		
		Combo menuCombo = new Combo(shell, SWT.NONE);
		menuCombo.setBackground(SWTResourceManager.getColor(255, 228, 196));
		menuCombo.setFont(SWTResourceManager.getFont("B Badr", 14, SWT.NORMAL));
		menuCombo.setItems(new String[] {"إضافة كتاب جديد", "عرض معلومات الكتب أو المستخدمين"});
		menuCombo.setBounds(126, 56, 326, 32);
		menuCombo.select(0);

	}
}
