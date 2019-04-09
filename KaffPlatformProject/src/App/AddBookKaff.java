package App;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class AddBookKaff {
// just test from eclips
	protected Shell shell;
	private Text BookTitleTxt;
	private Text editionTxt;
	private Text priceTxtValue;
	private Text ownerIDValue;
	private Text nameTxt;
	private Text phoneTxt;
	private Text emailTxt;
	private Text bookIDTxt;

	public Image logo = SWTResourceManager.getImage("/images/logo very small.png");
	public Image logoBtnBack = SWTResourceManager.getImage("/images/logo for header button.png");
	public Image header = SWTResourceManager.getImage("\\images\\KaffPlatformheader.jpg");
	public Image signOutIcon = SWTResourceManager.getImage("/images/signout small.png");

	/**
	 * Launch the application.
	 * 
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
		headerLabel.setImage(header);
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
		lvlBookCombo.setItems(new String[] { "3", "4", "5", "6", "7", "8", "9", "10" });
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


		Label nameLabel = new Label(shell, SWT.NONE);
		nameLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		nameLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		nameLabel.setBounds(415, 481, 119, 28);
		nameLabel.setText("الاسم الثلاثي");

		Label phoneLabel = new Label(shell, SWT.NONE);
		phoneLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		phoneLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		phoneLabel.setText("رقم الجوال");

		Label ownerLvlLabel = new Label(shell, SWT.NONE);
		ownerLvlLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		ownerLvlLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		ownerLvlLabel.setBounds(415, 548, 119, 31);
		ownerLvlLabel.setText("المستوى");

		Combo owneLvlCombo = new Combo(shell, SWT.NONE);
		owneLvlCombo.setItems(new String[] { "3", "4", "5", "6", "7", "8", "9", "10" });
		owneLvlCombo.setBounds(326, 554, 64, 25);
		owneLvlCombo.select(0);

		Label emailLabel = new Label(shell, SWT.NONE);
		emailLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		emailLabel.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		emailLabel.setBounds(415, 583, 119, 38);
		emailLabel.setText("البريد الإلكتروني");

		emailTxt = new Text(shell, SWT.BORDER);

		Button addButton = new Button(shell, SWT.NONE);
		addButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				try {
					String bookQuery = "INSERT INTO kaff.BOOK(bookTitle, bookLevel, bookType, bookPrice, available, edition) VALUES ( ?, ?, ?, ?, ?, ?)";
					String ownerQuery = "INSERT INTO kaff.user(userID, fname, mname, lname, phone, userLevel, email) VALUES (?, ?, ?, ?, ?, ?, ?)";

					String bookTitle = null, type = null;
					int bookLevel = -1;
					double price = 0.0;
					boolean available = true;
					String bookID = bookIDTxt.getText();
					if (bookIDExists(bookID)) {
						JOptionPane.showMessageDialog(null, "existing book ID");
						// set all text fields empty
					} else {
						bookTitle = BookTitleTxt.getText();
						bookLevel = lvlBookCombo.getSelectionIndex();
						type = groupType.getText();
						price = Double.parseDouble(priceTxtValue.getText());
						available = true;
					}
					// must error handle

					String edition =  editionTxt.getText();
					
					// handle if ownerID exists..
					String ownerID = ownerIDValue.getText();
					
					String name[];
					String fname = "", mname = "", lname = "", phone = "", email = "";
					int userLevel = -1;
					if (!ownerExists(ownerID)) {
						
						// error handle if the user enters two names or just
						// first name
						name = nameTxt.getText().split(" ");
						for(String n : name)
							System.out.println("name array" + n);
						try {
							if (name.length > 2) {
								fname = name[0];
								mname = name[1];
								lname = name[2];
							}
						} catch (IndexOutOfBoundsException ioe) {
							// some error occured while assigning name
							// attributes write in log
							System.out.println("Error assigning name");
						}
						phone = phoneTxt.getText();
						userLevel = owneLvlCombo.getSelectionIndex();
						email = emailTxt.getText();

					} else {
						// set text field info based on the existing owner
						// information
						ArrayList<String> data = getOwnerInfo(ownerID);
						JOptionPane.showConfirmDialog(null, "A user with this ID name exists");
						if (data.size() > 5) {
							fname = data.get(0) + " " + data.get(1) + " " + data.get(2);
							phone = data.get(3);
							userLevel = Integer.parseInt(data.get(4));
							email = data.get(5);
						}
						nameTxt.setText(fname);
						phoneTxt.setText(phone);
						owneLvlCombo.select(userLevel);
						emailTxt.setText(email);
					}

					Database.openConnection();
					PreparedStatement bookStatement = Database.getConnection().prepareStatement(bookQuery);

					//bookStatement.setString(1, bookID);
					bookStatement.setString(1, bookTitle);
					bookStatement.setInt(2, bookLevel);
					bookStatement.setString(3, type);
					bookStatement.setDouble(4, price);
					bookStatement.setBoolean(5, available);
					bookStatement.setString(6, edition);

					int bookre = bookStatement.executeUpdate();

					PreparedStatement ownerStatement = Database.getConnection().prepareStatement(ownerQuery);
					ownerStatement.setString(1, ownerID);
					ownerStatement.setString(2, fname);
					ownerStatement.setString(3, mname);
					ownerStatement.setString(4, lname);
					ownerStatement.setString(5, phone);
					ownerStatement.setInt(6, userLevel);
					ownerStatement.setString(7, email);
					int ownRes = ownerStatement.executeUpdate();

					System.out.println("results: " + ownRes + " bookre");
					// test result of excute Update
					if (ownRes != 0 && bookre != 0) {
						JOptionPane.showMessageDialog(null, "Data is updated");
					} else {
						JOptionPane.showMessageDialog(null, "Data is not updated");

					}

					Database.closeConnection();
				} catch (SQLException sql) {
					System.out.println(sql);
				}
			}
		});
		addButton.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		addButton.setBounds(54, 666, 85, 26);
		addButton.setText("إضافة");

		Button backButton = new Button(shell, SWT.NONE);
		backButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				AdminMenu am = new AdminMenu();
				shell.close();
				am.open();
			}
		});
		backButton.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.NORMAL));
		backButton.setBounds(150, 666, 85, 26);
		backButton.setText("رجوع");


		Label label = new Label(shell, SWT.NONE);
		label.setFont(SWTResourceManager.getFont("B Badr", 14, SWT.BOLD));
		label.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label.setAlignment(SWT.CENTER);
		label.setBounds(76, 43, 415, 50);
		label.setText("إضافة كتاب جديد");

		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		label_1.setFont(SWTResourceManager.getFont("B Badr", 12, SWT.ITALIC));
		label_1.setBounds(23, 79, 186, 32);
		// get user name here to display
		String name = getUserName();
		label_1.setText("مرحباً ..." + name);

		bookIDTxt = new Text(shell, SWT.BORDER);
		bookIDTxt.setBounds(271, 170, 119, 24);

		Button signOutButton = new Button(shell, SWT.NONE);
		signOutButton.setBounds(539, 44, 34, 35);

	}

	protected boolean ownerExists(String ownerID) {
		// TODO Auto-generated method stub
		return false;
	}

	protected boolean bookIDExists(String bookID) {
		// TODO Auto-generated method stub
		String bookIDQuery = "Select bookID from kaff.book where bookID = " + bookID;
		// i want the new bookID since it is auto increment..
		try {
			Database.openConnection();
			PreparedStatement bookStatement = Database.getConnection().prepareStatement(bookIDQuery);
			bookStatement.executeQuery();
			ResultSet resultSet = bookStatement.getResultSet();
			while (resultSet.next())
				if(resultSet.wasNull())
					return false;
				else
					return true;
			Database.closeConnection();

		} catch (SQLException sqle) {
			// write in log file
			System.out.println("check book ID exisiting error...");
		}

		return false;
	}

	private String getUserName() {
		String usernameQuery = "Select adminName from kaff.admin where adminID = ?";
		String name = "";

		try {
			Database.openConnection();
			PreparedStatement bookStatement = Database.getConnection().prepareStatement(usernameQuery);

			bookStatement.setString(1, "2180006622");
			bookStatement.executeQuery();
			ResultSet resultSet = bookStatement.getResultSet();
			while (resultSet.next())
				name = resultSet.getString("adminName");
			Database.closeConnection();

		} catch (SQLException sqle) {
			// write in log file
			System.out.println("get username error...");
		}
		return name;
	}

	private String getNewBookID() {
		String bookIDQuery = "Select bookID from kaff.book where bookName = null";
		// i want the new bookID since it is auto increment..
		String bookID = null;
		try {
			Database.openConnection();
			PreparedStatement bookStatement = Database.getConnection().prepareStatement(bookIDQuery);
			bookStatement.executeQuery();
			ResultSet resultSet = bookStatement.getResultSet();
			while (resultSet.next())
				bookID = resultSet.getString("bookID");
			Database.closeConnection();

		} catch (SQLException sqle) {
			// write in log file
			System.out.println("get new book id error...");
		}
		return bookID;
	}

	private ArrayList<String> getOwnerInfo(String ownerID) {
		// TODO Auto-generated method stub
		// if owner ID is in user table, then return all attribute as string
		// array
		ArrayList<String> info = new ArrayList<String>();
		String ownerQuery = "Select * from kaff.user where userID = " + ownerID;

		try {
			Database.openConnection();
			PreparedStatement ownerStatement = Database.getConnection().prepareStatement(ownerQuery);
			ownerStatement.executeQuery();
			ResultSet resultSet = ownerStatement.getResultSet();
			int i = 0;
			while (resultSet.next()) {
				info.set(i, resultSet.getString(i + 1));
				i++;
			}
			System.out.println("Check user info..");
			for (String s : info)
				System.out.println(s);
			Database.closeConnection();

		} catch (SQLException sqle) {
			// write in log file
			System.out.println("get user info error...");
		}
		return info;
	}
}
