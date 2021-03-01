import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class JTabbedPaneFrame extends JFrame
{
  public JTabbedPaneFrame()
  {
    super("JTabbedPane Demo");

    // create the tabbed pane hold tab formatting
    JTabbedPane tabPane = new JTabbedPane();

    // add first tab
    JLabel label1 = new JLabel("This is the big area called panel one", SwingConstants.CENTER);
    JPanel panel1 = new JPanel();
    panel1.add(label1);
    tabPane.addTab("Tab One", null, panel1, "FirstPanel");

    // add second tab
    JLabel label2 = new JLabel("You can add other stuff to this tabbed panel", SwingConstants.CENTER);
    JPanel panel2 = new JPanel();
    panel2.add(label2);
    tabPane.addTab("Tab Too", null, panel2, "SecondPanel");

    // add third tab
    JLabel label3 = new JLabel("Woo, buttons", SwingConstants.CENTER);
    JPanel panel3 = new JPanel();
    panel3.setLayout(new BorderLayout());
    panel3.add(label3);
    panel3.add(new JButton("North"), BorderLayout.NORTH);
    panel3.add(new JButton("South"), BorderLayout.SOUTH);
    tabPane.addTab("Tab Three", null, panel3, "ThirdPanel");

    // keep this at the bottom
    add(tabPane);

  } // end default and only constructor

} // end class