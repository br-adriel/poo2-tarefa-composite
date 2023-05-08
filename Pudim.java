
/**
 * Escreva uma descrição da classe Sorvete aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Pudim extends MenuComponent
{
    public Pudim()
    {
    }

    public String getName(){
        return "Pudim";
    }

    public String getDescription(){
        return "Pudim grande sabor tradicional";
    }

    public double getPrice(){
        return 22.98;
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
