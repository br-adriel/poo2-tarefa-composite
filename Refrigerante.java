
/**
 * Escreva uma descri��o da classe Refrigerante aqui.
 * 
 * @author (seu nome) 
 * @version (um n�mero da vers�o ou uma data)
 */
public class Refrigerante extends MenuComponent
{
    // vari�veis de inst�ncia - substitua o exemplo abaixo pelo seu pr�prio
    private int x;

    /**
     * Construtor para objetos da classe Refrigerante
     */
    public Refrigerante()
    {        
    }
    
    public String getName(){
        return "Refrigerante";
    }
    
    public String getDescription(){
        return "Coca cola 1L";
    }
    
    public double getPrice(){
        return 7.50;
    }
    
    public boolean isVegetarian(){
        return true;
    }
    
    public String toString(){
        return "#  "+getName()+(isVegetarian()?"(v)":"")+", "+getPrice()+"     --  "+getDescription();
    }
    
    public void print(){
        System.out.print("#  "+getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
        
        System.out.print(", "+getPrice());
        System.out.print("     --  "+getDescription());
    }
}
