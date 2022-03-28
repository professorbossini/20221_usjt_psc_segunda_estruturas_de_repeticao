//import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showMessageDialog;
//JOptionPane
//showMessageDialog
//javax.swing
public class ExemploWhile{
     public static void main(String[] args) {
        //declaração de variáveis
        int nota1, nota2;
        double media;
        int qtdeAlunos = parseInt(showInputDialog("Professor, você tem quantos alunos?"));
        //while
        //repetição controlada por contador
        int contador = 1;
        //isso é um loop infinito
        while(contador <= qtdeAlunos){//condição de continuidade
            //entrada
            nota1 = parseInt(showInputDialog("Digite a primeira nota"));
            nota2 = parseInt(showInputDialog("Digite a segunda nota"));
            //processamento
            media = (nota1 + nota2) / 2.;
            //saída
            showMessageDialog(null, String.format("A média é %.2f", media));
            //contador = contador + 1;
            //contador += 1;//operador composto
            //contador++; //operador de pós incremento
            ++contador; //operador de pré incremento
        }


     }   
}