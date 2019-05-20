package main.java.kr;    
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;  
import javax.swing.border.*;

	public class Nalog extends JFrame{
	private static final long serialVersionUID = 1L;
	public static Nalog frame = new Nalog(); 
	public static void main(String[] args) { 
	EventQueue.invokeLater(new Runnable() {
	public void run() {
	try {
	frame.setVisible(true); 
	} catch (Exception e) {
	e.printStackTrace();
	}
	}
	});
	}
	private JPanel panel1;
	private JButton calc,calc2;
	private JLabel label_1;
	public static double int_rad;
	static int a=13,a1=13,a2=15,a3=30,a4=35;
	public Nalog() { 
	setTitle("Меню");
	setResizable(false);
	setSize(225, 175); 
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout (new BorderLayout()); 
	panel1 = new JPanel();
	add(panel1, BorderLayout.CENTER);
	panel1.setBorder(new EmptyBorder(10,10,10,10));
	panel1.setLayout(new GridLayout(3,1,5,5));
	calc = new JButton("Пользователь");
	calc2 = new JButton("Админ");
	label_1 = new JLabel("Зайти как:", JLabel.CENTER);
	panel1.add(label_1);
	panel1.add(calc);
	panel1.add(calc2);
	calc.addActionListener(new ActionListener() { 
           public void actionPerformed(ActionEvent e) {
        	   Nalog.main2(null);
        	   }
       });
	calc2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	Password.main(null);
     		}
 });
	}
public static void main2(String[] args) { 
SwingUtilities.invokeLater(new Runnable() { 
public void run() { 
final JFrame form2 = new JFrame();
JPanel panel, panel1; 
JButton calc,calc2; 
JLabel label_1,label_2,label_3, label_4,label_n;
final JLabel sum_n;
final JLabel sum;
JLabel label_n1,label_n2,label_n3,label_n4; 
final JTextField sum_ok;
JRadioButton rad_13, rad_13_1,rad_15, rad_30, rad_35;
form2.setTitle("Калькулятор НДФЛ");
form2.setSize(475, 290); 
form2.setResizable(false);
form2.setLocationRelativeTo(null); 
form2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
form2.setLayout (new BorderLayout()); 
form2.setVisible(true); 
panel = new JPanel(); 
panel1 = new JPanel();
form2.add(panel, BorderLayout.CENTER); 
form2.add(panel1, BorderLayout.SOUTH); 
panel.setBorder(new EmptyBorder(10,0,10,10)); 
panel1.setBorder(new EmptyBorder(10,10,10,10)); 
panel.setLayout(new GridLayout(9,2,5,0)); 
panel1.setLayout(new GridLayout(1,2)); 
label_1 = new JLabel("Вычислить налог для:", JLabel.LEFT);
label_2 = new JLabel("Резидент", JLabel.LEFT); 
label_3 = new JLabel("Сумма налога, руб.", JLabel.LEFT); 
label_4 = new JLabel("Сумма на руки, руб.", JLabel.LEFT); 
label_n = new JLabel(""); 
label_n1 = new JLabel("Нерезидент"); 
label_n2 = new JLabel("Доход", JLabel.RIGHT); 
label_n3 = new JLabel("это:", JLabel.LEFT); 
label_n4 = new JLabel("");
sum_n = new JLabel("", JLabel.CENTER); 
sum = new JLabel("", JLabel.CENTER); 
calc = new JButton("Рассчитать"); 
calc2 = new JButton("В меню"); 
calc2.setBackground(Color.GREEN);
sum_ok = new JTextField(); 
sum_ok.addKeyListener(new KeyAdapter() {
    public void keyTyped(KeyEvent e) { 
    	JDialog Q = new JDialog();
        if (sum_ok.getText().length() >= 10 ) { 
            e.consume(); 
        }
    }  
});
sum_ok.setHorizontalAlignment(JTextField.CENTER);
sum_ok.setMargin(new Insets(2, 5, 2, 5)); 
ButtonGroup group = new ButtonGroup(); 
rad_13 = new JRadioButton("Иное",false);
group.add(rad_13); 
rad_13.setHorizontalAlignment(JRadioButton.LEFT); 
rad_13_1 = new JRadioButton("Любой доход гражданина ЕАЭС",false); 
group.add(rad_13_1); 
rad_13_1.setHorizontalAlignment(JRadioButton.LEFT); 
rad_15 = new JRadioButton("Дивиденты", false); 
group.add(rad_15); 
rad_15.setHorizontalAlignment(JRadioButton.LEFT); 
rad_30 = new JRadioButton("Иное", false); 
group.add(rad_30); 
rad_30.setHorizontalAlignment(JRadioButton.LEFT); 
rad_35 = new JRadioButton("Выйгрыш,займ или приз", false); 
group.add(rad_35); 
rad_35.setHorizontalAlignment(JRadioButton.LEFT); 
panel.add(label_1);
panel.add(label_n); 
panel.add(label_2); 
panel.add(label_n1); 
panel.add(label_n2); 
panel.add(label_n3); 
panel.add(rad_35); 
panel.add(rad_13_1); 
panel.add(rad_13); 
panel.add(rad_15); 
panel.add(label_n4); 
panel.add(rad_30); 
panel.add(label_3); 
panel.add(sum_n); 
panel.add(label_4); 
panel.add(sum); 
panel.add(sum_ok); 
panel1.add(calc2); 
panel1.add(calc); 
rad_13.addActionListener(new ActionListener() 
{ 
public void actionPerformed(ActionEvent e) 
{ 
int_rad=a; 
sum_n.setText("");
sum.setText(""); 
} 
}); 
rad_13_1.addActionListener(new ActionListener() 
{  
public void actionPerformed(ActionEvent e) 
{ 
int_rad=a1; 
sum_n.setText("");
sum.setText(""); 
} 
}); 
rad_15.addActionListener(new ActionListener() 
{ public void actionPerformed(ActionEvent e) 
{ 
int_rad=a2; 
sum_n.setText("");
sum.setText("");  
} 
}); 
rad_30.addActionListener(new ActionListener() 
{ public void actionPerformed(ActionEvent e) 
{ 
int_rad=a3; 
sum_n.setText("");
sum.setText(""); 
} 
}); 
rad_35.addActionListener(new ActionListener() 
{ public void actionPerformed(ActionEvent e) 
{ 
int_rad=a4; 
sum_n.setText("");
sum.setText(""); 
} 
});
calc2.addActionListener(new ActionListener() 
{ 
public void actionPerformed(ActionEvent e) 
{form2.dispose();}});
calc.addActionListener(new 
ActionListener() 
{ 
	public void actionPerformed(ActionEvent e) 
	{ 
	if (isValidInput(sum_ok, "сумму оклада")) { 
		double d = Double.valueOf(sum_ok.getText().toString()); 
		double pr = int_rad; 
		tax tax = new tax();
		double t = tax.calcTax(d, pr);
		double t2 = tax.calcTax2(d, pr);
		String s_sum_n = String.format("%.2f", t); 
		sum_n.setText(s_sum_n); 
		String s_sum = String.format("%.2f", t2); 
		sum.setText(s_sum); 
	} 
	} 
	}
			); 
	} 
public boolean isValidInput(JTextField jtxt, String description) {
    JDialog D = new JDialog();
    if (jtxt.getText().trim().length() > 0) {
        try { 
             double num = Double.parseDouble(jtxt.getText().replace(',','.'));    
            return true;
        } catch (NumberFormatException e) {
            jtxt.requestFocus();
            jtxt.setText("");
            JOptionPane.showMessageDialog(D, "Вы должны ввести число!", "Ошибка", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    } else {
        JOptionPane.showMessageDialog(D, "Введите " + description, "Ошибка", JOptionPane.WARNING_MESSAGE);
        jtxt.requestFocus();
        jtxt.selectAll();
        return false;
    }
}	}); 
}
public double Nalog(int  d_sum_ok, String string, int i) {
	double d_sum_n = d_sum_ok/100*i; 
	System.out.print(d_sum_n);
	return d_sum_n;
}

public static void main1(String[] args) { 
SwingUtilities.invokeLater(new Runnable() { 
public void run() { 
final JFrame form3 = new JFrame(""); 
form3.setTitle("Изменение налоговой ставки"); 
form3.setSize(475, 290); 
form3.setLocationRelativeTo(null); 
form3.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
form3.setLayout (new BorderLayout()); 
form3.setVisible(true); 
form3.setResizable(false);
JButton calc3,calc4; 
JPanel panel2,panel3; 
JLabel label_1,label_n1,label_n2,label_n3,label_n4, 
label_n5,label_n6,label_n7,label_n8,label_n9,label_n10, 
label_n11,label_n12,label_n13,label_n14,label_n15,label_n16, 
label_n17,label_n18,label_n121,label_n131,label_2,label_3; 
final JTextField sum_ok,sum_ok1,sum_ok2,sum_ok3,sum_ok4; 
panel2 = new JPanel(); 
panel3 = new JPanel(); 
form3.add(panel2, BorderLayout.CENTER);
form3.add(panel3, BorderLayout.SOUTH); 
panel2.setBorder(new EmptyBorder(10,10,10,10)); 
panel3.setBorder(new EmptyBorder(10,10,10,10)); 
panel2.setLayout(new GridLayout(7,4,5,0)); 
panel3.setLayout(new GridLayout(1,2)); 
label_1 = new JLabel("Изменить процент", JLabel.LEFT); 
label_n1 = new JLabel("налоговой ставки", JLabel.LEFT); 
label_n2 = new JLabel("для:", JLabel.LEFT); 
label_n3 = new JLabel("", JLabel.LEFT); 
label_n4 = new JLabel("Резидент", JLabel.LEFT); 
label_n5 = new JLabel("", JLabel.LEFT); 
label_n6 = new JLabel("Нерезидент", JLabel.LEFT); 
label_n7 = new JLabel("", JLabel.LEFT); 
label_n8 = new JLabel("", JLabel.LEFT); 
label_n9 = new JLabel("Доход", JLabel.RIGHT); 
label_n10 = new JLabel("это:", JLabel.LEFT); 
label_n11 = new JLabel("", JLabel.LEFT); 
label_n12 = new JLabel("Выйгрыш или", JLabel.LEFT); 
label_n121 = new JLabel("займ", JLabel.LEFT); 
label_n13 = new JLabel("Любой доход", JLabel.LEFT); 
label_n131 = new JLabel("гражданина ЕАЭС", JLabel.LEFT); 
label_2 = new JLabel("", JLabel.LEFT); 
label_3 = new JLabel("", JLabel.LEFT); 
label_n14 = new JLabel("Иное", JLabel.LEFT); 
label_n15 = new JLabel("Дивиденты", JLabel.LEFT); 
label_n16 = new JLabel("", JLabel.LEFT); 
label_n17 = new JLabel("", JLabel.LEFT); 
label_n18 = new JLabel("Иное", JLabel.LEFT); 
calc3 = new JButton("В меню"); 
calc4 = new JButton("Изменить"); 
calc3.setBackground(Color.GREEN);
sum_ok = new JTextField(""+a4);
sum_ok.addKeyListener(new KeyAdapter() {
    public void keyTyped(KeyEvent e) { 
        if (sum_ok.getText().length() >= 2 ) {
            e.consume(); 
        }
    }  
}); 
sum_ok.setHorizontalAlignment(JTextField.CENTER);
sum_ok.setMargin(new Insets(2, 5, 2, 5)); 
sum_ok1 = new JTextField(""+a1);
sum_ok1.addKeyListener(new KeyAdapter() {
    public void keyTyped(KeyEvent e) { 
        if (sum_ok1.getText().length() >= 2 ) {
            e.consume(); 
        }
    }  
});
sum_ok1.setHorizontalAlignment(JTextField.CENTER); 
sum_ok1.setMargin(new Insets(2, 5, 2, 5)); 
sum_ok2 = new JTextField(""+a);
sum_ok2.addKeyListener(new KeyAdapter() {
    public void keyTyped(KeyEvent e) { 
        if (sum_ok2.getText().length() >= 2 ) {
            e.consume(); 
        }
    }  
});
sum_ok2.setHorizontalAlignment(JTextField.CENTER); 
sum_ok2.setMargin(new Insets(2, 5, 2, 5)); 
sum_ok3 = new JTextField(""+a2);
sum_ok3.addKeyListener(new KeyAdapter() {
    public void keyTyped(KeyEvent e) { 
        if (sum_ok3.getText().length() >= 2 ) {
            e.consume(); 
        }
    }  
});
sum_ok3.setHorizontalAlignment(JTextField.CENTER); 
sum_ok3.setMargin(new Insets(2, 5, 2, 5)); 
sum_ok4 = new JTextField(""+a3);
sum_ok4.addKeyListener(new KeyAdapter() {
    public void keyTyped(KeyEvent e) { 
        if (sum_ok4.getText().length() >= 2 ) {
            e.consume(); 
        }
    }  
});
sum_ok4.setHorizontalAlignment(JTextField.CENTER); 
sum_ok4.setMargin(new Insets(2, 5, 2, 5)); 
panel2.add(label_1); 
panel2.add(label_n1); 
panel2.add(label_n2); 
panel2.add(label_n3); 
panel2.add(label_n4); 
panel2.add(label_n5); 
panel2.add(label_n6); 
panel2.add(label_n7); 
panel2.add(label_n8); 
panel2.add(label_n9); 
panel2.add(label_n10); 
panel2.add(label_n11); 
panel2.add(label_n12); 
panel2.add(sum_ok); 
panel2.add(label_n13); 
panel2.add(sum_ok1); 
panel2.add(label_n121); 
panel2.add(label_2); 
panel2.add(label_n131); 
panel2.add(label_3); 
panel2.add(label_n14); 
panel2.add(sum_ok2); 
panel2.add(label_n15); 
panel2.add(sum_ok3); 
panel2.add(label_n16); 
panel2.add(label_n17); 
panel2.add(label_n18); 
panel2.add(sum_ok4);
panel3.add(calc3); 
panel3.add(calc4); 
calc3.addActionListener(new ActionListener() 
{ 
public void actionPerformed(ActionEvent e) 
{form3.dispose();}}); 
calc4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) { 
if (isValidInput(sum_ok,"")) {
a4= (int)Double.parseDouble(sum_ok.getText().replace(',','.')); 
int_rad=(int) a4; 
} 
if (isValidInput(sum_ok1,"")) { 
a1= (int)Double.parseDouble(sum_ok1.getText().replace(',','.')); 
int_rad=(int) a1; 
} 
if (isValidInput(sum_ok2,"")) {
a= (int)Double.parseDouble(sum_ok2.getText().replace(',','.'));
int_rad=(int) a; 
} 
if (isValidInput(sum_ok3,"")) { 
a2= (int)Double.parseDouble(sum_ok3.getText().replace(',','.')); 
int_rad=(int) a2; 
} 
if (isValidInput(sum_ok4,"")) { 
a3= (int)Double.parseDouble(sum_ok4.getText().replace(',','.'));; 
int_rad=(int) a3; 
} 
} 
public boolean isValidInput(JTextField jtxt, String description) {
    JDialog D = new JDialog();
    if (jtxt.getText().trim().length() > 0) { 
        try { 
             double num = Double.parseDouble(jtxt.getText().replace(',','.'));    
            return true; 
        } catch (NumberFormatException e) {
            jtxt.requestFocus();
            jtxt.setText("");
            JOptionPane.showMessageDialog(D, "Вы должны ввести число!", "Ошибка", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    } else {
        jtxt.requestFocus();
        jtxt.selectAll();
        return false;
    }
}	}); 
} 
}); 
}
}
