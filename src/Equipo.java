import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private List<Jugador> listado;

    public Equipo(){
        listado = new ArrayList<Jugador>();
    }


    public void agregar(Jugador dato){
        listado.add(dato);

    }


    public boolean editar(int id , Jugador dato){
        int i = 0;
        int s = listado.size()-1;
        int c;

        while (i <= s){
            c = (i + s) / 2;

            if(id  == listado.get(c).getId()){
                listado.set(c , dato);
                return true;
            }else if(id < listado.get(c).getId()){
                s = c - 1;
            } else if (id  > listado.get(c).getId()) {
                i = c + 1;
            }
        }
        return false;
    }


    public List<Jugador> todos(){
        return listado;
    }
}
