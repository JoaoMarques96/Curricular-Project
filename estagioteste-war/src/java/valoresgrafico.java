
import java.util.Random;
import java.util.TimerTask;
import javax.faces.bean.ManagedBean;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Paulo Marques
 */
@ManagedBean
        

public class valoresgrafico {

    public static int randomtensao() {
       
        Random tensao = new Random();
        int tensaorandom = tensao.nextInt((235 - 225) + 1) + 225;
        return tensaorandom;
    }

    public static int randomcorrente() {

        Random corrente = new Random();
        return corrente.nextInt((70 - 0) + 1) + 70;
        
    }


}
