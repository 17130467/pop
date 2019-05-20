package main.java.kr; 
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*; 
import java.util.Arrays; 
public class Password extends JPanel 
implements ActionListener { 
private static String OK = "ok"; 
private static String HELP = "help"; 
private JFrame controllingFrame; 
private JPasswordField passwordField; 
public Password(JFrame f) { 
controllingFrame = f; 
passwordField = new JPasswordField(10);

passwordField.setActionCommand(OK); 
passwordField.addActionListener(this); 
JLabel label = new JLabel("Введите пароль: "); 
JComponent buttonPane = createButtonPanel(); 
JPanel textPane = new JPanel(new FlowLayout()); 
textPane.add(label); 
textPane.add(passwordField); 
add(textPane); 
add(buttonPane); 
} 
protected JComponent createButtonPanel() { 
JPanel p = new JPanel(new GridLayout(0,1)); 
JButton okButton = new JButton("OK"); 
JButton helpButton = new JButton("Help"); 
okButton.setActionCommand(OK); 
helpButton.setActionCommand(HELP); 
okButton.addActionListener(this); 
helpButton.addActionListener(this); 
p.add(okButton); 
p.add(helpButton); 
return p; 
} 
public void actionPerformed(ActionEvent e) {
String cmd = e.getActionCommand(); 
if (OK.equals(cmd)) { 
char[] input = passwordField.getPassword();
if (isPasswordCorrect(input)) { 
JOptionPane.showMessageDialog(controllingFrame, 
"Пароль правильный"); 
Nalog.main1(null); 
controllingFrame.dispose(); 
} else { 
JOptionPane.showMessageDialog(controllingFrame, 
"Пароль не верный", 
"Ошибка", 
JOptionPane.ERROR_MESSAGE); 
} 
Arrays.fill(input, '0'); 
passwordField.selectAll(); 
resetFocus(); 
} else { 
JOptionPane.showMessageDialog(controllingFrame, 
"Пароль 'admin'"); 
} 
} 
private static boolean isPasswordCorrect(char[] input) { 
boolean isCorrect = true; 
char[] correctPassword = { 'a', 'd', 'm', 'i', 'n'}; 
if (input.length != correctPassword.length) { 
isCorrect = false; 
} else { 
isCorrect = Arrays.equals (input, correctPassword); 
} 
Arrays.fill(correctPassword,'0'); 
return isCorrect; 
} 

protected void resetFocus() { 
passwordField.requestFocusInWindow(); 
} 
private static void createAndShowGUI() { 
JFrame frame = new JFrame("Password"); 
frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
final Password newContentPane = new Password(frame); 
frame.setContentPane(newContentPane); 
frame.addWindowListener(new WindowAdapter() { 
public void windowActivated(WindowEvent e) { 
} 
}); 
frame.pack(); 
frame.setVisible(true); 
} 
public static void main(String[] args) { 
SwingUtilities.invokeLater(new Runnable() { 
public void run() { 
UIManager.put("swing.boldMetal", Boolean.FALSE); 
createAndShowGUI(); 
} 
}); 
} 
}
