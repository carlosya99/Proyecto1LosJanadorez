package codigo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class WithoutString {

    public String withoutString(String base, String remove) {
        //reemplaza en el string base el string remove sin importar tenga mayusculas o no
        // no le da importancia a las mayusculas o minusculas --->"(?i)"
        return base.replaceAll("(?i)" + remove, "");
    }

}
