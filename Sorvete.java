
/**
 * Escreva uma descrição da classe Sorvete aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Sorvete extends MenuComponent
{
    public Sorvete()
    {
    }

    public String getName(){
        return "Sorvete";
    }

    public String getDescription(){
        return "Sorvete sabor napolitano";
    }

    public double getPrice(){
        return 5.00;
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
