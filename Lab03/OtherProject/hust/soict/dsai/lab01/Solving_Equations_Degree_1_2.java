import javax.swing.JOptionPane;

public class Solving_Equations_Degree_1_2 {
    
    public static void linear_equation(){
        double a, b;
        String input;
        input = JOptionPane.showInputDialog(null, "Nhap a: ","ax + b = 0", JOptionPane.QUESTION_MESSAGE);
        a = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog(null, "Nhap b: ","ax + b = 0", JOptionPane.QUESTION_MESSAGE);
        b = Double.parseDouble(input);

        if(a == 0.0){
            if(b == 0.0){
                JOptionPane.showMessageDialog(null, "Vo so nghiem", "Ket qua", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Ko the giai phuong trinh", "Ket qua", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "x = "+ (-b/a), "Ket qua", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void linear_system(){
        double a11, a12, a21, a22, b1, b2;
        String input;
        
        input = JOptionPane.showInputDialog(null, "Nhap a11: ","a11x + a12y = b1", JOptionPane.QUESTION_MESSAGE);
        a11 = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog(null, "Nhap a12: ","a11x + a12y = b1", JOptionPane.QUESTION_MESSAGE);
        a12 = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog(null, "Nhap b1: ","a11x + a12y = b1", JOptionPane.QUESTION_MESSAGE);
        b1 = Double.parseDouble(input);

        input = JOptionPane.showInputDialog(null, "Nhap a21: ","a21x + a22y = b2", JOptionPane.QUESTION_MESSAGE);
        a21 = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog(null, "Nhap a22: ","a21x + a22y = b2", JOptionPane.QUESTION_MESSAGE);
        a22 = Double.parseDouble(input);

        input = JOptionPane.showInputDialog(null, "Nhap b2: ","a11x + a12y = b1", JOptionPane.QUESTION_MESSAGE);
        b2 = Double.parseDouble(input);

        double determinant = a11*a22 - a12*a21;
        
        if(determinant == 0.0){
            if(a11*b2 - a21*b1 == 0.0){
                JOptionPane.showMessageDialog(null, "Vo so nghiem", "Ket qua", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Vo nghiem", "Ket qua", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } else {
            double x = (a22*b1 - a12*b2) / determinant;
            double y = (a11*b2 - a21*b1) / determinant;
            JOptionPane.showMessageDialog(null, "x = "+ x + ", y = " + y, "Ket qua", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static void quadratic_equation(){
        double a, b, c;
        String input;
        
        input = JOptionPane.showInputDialog(null, "Nhap a: ","ax^2 + bx + c = 0", JOptionPane.QUESTION_MESSAGE);
        a = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog(null, "Nhap b: ","ax^2 + bx + c = 0", JOptionPane.QUESTION_MESSAGE);
        b = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog(null, "Nhap c: ","ax^2 + bx + c = 0", JOptionPane.QUESTION_MESSAGE);
        c = Double.parseDouble(input);

        double denta = b*b - 4*a*c;
        
        if(denta < 0) {
            JOptionPane.showMessageDialog(null, "Vo nghiem ", "Ket qua", JOptionPane.INFORMATION_MESSAGE);
        } else if(denta == 0) {
            double x = -b / (2*a);
            JOptionPane.showMessageDialog(null, "Phuong trinh co nghiem kep: x = " + x, "Ket qua", JOptionPane.INFORMATION_MESSAGE);
        }else {
            double x1 = (- b + Math.sqrt(denta)) / (2 * a);
            double x2 = (- b - Math.sqrt(denta)) / (2 * a);
            JOptionPane.showMessageDialog(null, "Phuong trinh co 2 nghiem phan biet: x1 = " + x1 + ", x2 = " + x2, "Ket qua", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        String option;
        option = JOptionPane.showInputDialog(null, "1. Giai phuong trinh bac nhat\n2. Giai he phuong trinh bac nhat\n3. Giai phuong trinh bac 2" , "Solving_Equations_Degree_1_2", JOptionPane.NO_OPTION);
        int tmp = Integer.parseInt(option);
        switch(tmp){
            case 1:
                linear_equation();
                break;
            case 2:
                linear_system();
                break;
            case 3:
                quadratic_equation();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Vui long chon dung so", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
