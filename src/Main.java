import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.widgets.Combo;
import blog.Author;
import blog.Category;
import blog.Blogg;
import blog.Post;
import org.eclipse.swt.widgets.Control;

public class Main {

	protected Shell shell;
	private List list;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Spinner text_4;
	private Text text_5;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Main window = new Main();
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
		shell.setSize(517, 440);
		shell.setText("SWT Application");

		list = new List(shell, SWT.BORDER);
		list.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int i = list.getSelectionIndex();

			}
		});
		list.setBounds(240, 37, 251, 323);

		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				text.getText();
				list.add(text.getText());
			}
		});
		btnNewButton_1.setBounds(10, 377, 102, 25);
		btnNewButton_1.setText("Posta");

		text = new Text(shell, SWT.BORDER);
		text.setBounds(70, 7, 152, 21);

		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(70, 34, 152, 21);

		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(10, 37, 55, 15);
		lblNewLabel.setText("F\u00F6rfattare");

		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(10, 10, 43, 15);
		lblNewLabel_1.setText("Titel");

		Label lblInlgg = new Label(shell, SWT.NONE);
		lblInlgg.setBounds(10, 212, 55, 15);
		lblInlgg.setText("Inl\u00E4gg");

		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(10, 233, 212, 138);

		DateTime dateTime = new DateTime(shell, SWT.BORDER);
		dateTime.setBounds(70, 88, 152, 25);

		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(10, 91, 55, 25);
		lblNewLabel_2.setText("Datum");

		Button btnRadioButton = new Button(shell, SWT.RADIO);
		btnRadioButton.setBounds(179, 182, 43, 16);
		btnRadioButton.setText("Man");

		Button btnTjej = new Button(shell, SWT.RADIO);
		btnTjej.setBounds(119, 182, 57, 16);
		btnTjej.setText("Kvinna");

		Label label_1 = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_1.setBounds(1, 183, 233, -6);

		Combo combo = new Combo(shell, SWT.NONE);
		combo.setBounds(70, 119, 151, 23);

		Label lblKategori = new Label(shell, SWT.NONE);
		lblKategori.setBounds(10, 122, 55, 15);
		lblKategori.setText("Kategori");

		text_3 = new Text(shell, SWT.BORDER);
		text_3.setBounds(70, 61, 152, 21);

		Label lblNewLabel_3 = new Label(shell, SWT.NONE);
		lblNewLabel_3.setBounds(10, 64, 55, 15);
		lblNewLabel_3.setText("Land");

		Label label = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);
		label.setBounds(232, 0, 2, 402);

		Label lblNewLabel_4 = new Label(shell, SWT.NONE);
		lblNewLabel_4.setBounds(10, 183, 55, 15);
		lblNewLabel_4.setText("\u00C5lder");

		text_4 = new Spinner(shell, SWT.BORDER);
		text_4.setBounds(70, 180, 42, 21);

		Label lblBlogPosts = new Label(shell, SWT.NONE);
		lblBlogPosts.setBounds(240, 16, 55, 15);
		lblBlogPosts.setText("Blog Posts");

		Combo combo_1 = new Combo(shell, SWT.NONE);
		combo_1.setBounds(353, 368, 138, 23);

		Label lblSorteraEfter = new Label(shell, SWT.NONE);
		lblSorteraEfter.setBounds(240, 371, 77, 15);
		lblSorteraEfter.setText("Sortera efter");

		Label lblEmail = new Label(shell, SWT.NONE);
		lblEmail.setBounds(10, 151, 55, 15);
		lblEmail.setText("Email");

		text_5 = new Text(shell, SWT.BORDER);
		text_5.setBounds(70, 148, 152, 21);
		shell.setTabList(new Control[] { text, text_1, text_3, dateTime, combo,
				text_5, text_4, btnTjej, btnRadioButton, text_2,
				btnNewButton_1, list, combo_1 });

	}

	public List getList() {
		return list;
	}
}
