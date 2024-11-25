import javax.swing.JOptionPane;
public class CaculateTwoNumbers {
    public static void main(String[] args){
        String num;
        num = JOptionPane.showInputDialog("Nhap so dau tien: ");
        double num1 = Double.parseDouble(num);
        num = JOptionPane.showInputDialog("Nhap so thu hai: ");
        double num2 = Double.parseDouble(num);
        JOptionPane.showMessageDialog(null, num1 + " + " + num2 +  " = " + (num1 + num2), "Sum", 1);
        JOptionPane.showMessageDialog(null, num1 + " - " + num2 +  " = " + (num1 - num2), "Subtract", 1);
        JOptionPane.showMessageDialog(null, num1 + " * " + num2 +  " = " + (num1 * num2), "Multiply", 1);
        if(num2!=0){
            JOptionPane.showMessageDialog(null, num1 + " / " + num2 +  " = " + (num1 / num2), "Divide", 1);
        }else{
            JOptionPane.showMessageDialog(null, "Chia cho 0 khong duoc!", "Error", 0);
        }
        System.exit(0);
    }
}
