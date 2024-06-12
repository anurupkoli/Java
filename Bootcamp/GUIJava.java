import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class GUIJava extends Frame implements WindowListener, ActionListener  {
    Button b;
    TextField text = new TextField("Click to add");
    public static void main(String[] args) {
        GUIJava window = new GUIJava("Adding window");
        window.setSize(350,100);
        window.setVisible(true);
    }

    public GUIJava(String title){
        super(title);
        setLayout(new FlowLayout());
        addWindowListener(this);
        b = new Button("Click me");
        add(b);
        add(text);
        b.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        text.setText("Performing Addition");
    }

    @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
}
