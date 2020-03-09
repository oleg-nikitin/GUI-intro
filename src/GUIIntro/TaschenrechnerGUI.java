package GUIIntro;
 
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
 
public class TaschenrechnerGUI {
 
    protected Shell shell;
    private Text text;
    private Text text_1;
 
    /**
     * Launch the application.
     * @param args
     */
    public static void main(String[] args) {
        try {
            TaschenrechnerGUI window = new TaschenrechnerGUI();
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
        shell.setSize(450, 300);
        shell.setText("SWT Application");
        
        text = new Text(shell, SWT.BORDER);
        text.setBounds(10, 230, 76, 21);
        
        text_1 = new Text(shell, SWT.BORDER);
        text_1.setText("0");
        text_1.setEditable(false);
        text_1.setBounds(348, 230, 76, 21);
        
        Button Addbtn = new Button(shell, SWT.NONE);
        Addbtn.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                int ergebnis = Integer.parseInt(getErgebnis().getText());
                int wert = Integer.parseInt(getZahl().getText());
                //
                ergebnis = ergebnis + wert;
                //
                getErgebnis().setText(Integer.toString(ergebnis));
                getZahl().setText("");
            }
        });
        Addbtn.setBounds(10, 10, 75, 25);
        Addbtn.setText("+");
        
        Button Minusbtn = new Button(shell, SWT.NONE);
        Minusbtn.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                int ergebnis = Integer.parseInt(getErgebnis().getText());
                int wert = Integer.parseInt(getZahl().getText());
                //
                ergebnis = ergebnis - wert;
                //
                getErgebnis().setText(Integer.toString(ergebnis));
                getZahl().setText("");
            }
        });
        Minusbtn.setBounds(348, 10, 75, 25);
        Minusbtn.setText("-");
        
        Button Multibtn = new Button(shell, SWT.NONE);
        Multibtn.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                int ergebnis = Integer.parseInt(getErgebnis().getText());
                int wert = Integer.parseInt(getZahl().getText());
                //
                ergebnis = ergebnis * wert;
                //
                getErgebnis().setText(Integer.toString(ergebnis));
                getZahl().setText("");
            }
        });
        Multibtn.setBounds(10, 100, 75, 25);
        Multibtn.setText("*");
        
        Button Dividebtn = new Button(shell, SWT.NONE);
        Dividebtn.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                int ergebnis = Integer.parseInt(getErgebnis().getText());
                int wert = Integer.parseInt(getZahl().getText());
                //
                ergebnis = ergebnis / wert;
                //
                getErgebnis().setText(Integer.toString(ergebnis));
                getZahl().setText("");
            }
        });
        Dividebtn.setBounds(349, 100, 75, 25);
        Dividebtn.setText("/");
 
    }
    public Text getZahl() {
        return text;
    }
    public Text getErgebnis() {
        return text_1;
    }
}
 