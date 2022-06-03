package com.company;

public class Validar {

    public boolean comprobarDNI(String dni){
        boolean numero=true;
        if(dni.length()== 9){
            int letraASCII = (int) dni.charAt(8); // [A-Z] = [65-90]
            //[a - z] = [97 - 122]
            if ((65<=letraASCII && letraASCII <=90)||(97<=letraASCII && letraASCII <=122)){
                try{
                    Integer.parseInt(dni.substring(0, 7));
                }catch (NumberFormatException e) {
                    System.out.println(e+ " el valor no se corresponde con un DNI");
                    numero = false;
                }
            }else{
                System.out.println("El ultimo valor ha de ser una letra");
                numero = false;
            }
        }else {
            System.out.println("el tama�o del dni no es el correcto");
            numero = false;
        }

        return numero;
    }

    /**
     * M�todo para comprobar que un email tiene la forma correcta
     * @param email cadena de caracteres que representa el email del usuario
     * @return verdadero si el email tiene la forma xxxx@xxx.es/.com
     */
    public boolean comprobarEmail(String email){
        boolean correcto=true, aparece=false;
        if(email.length()>0){
            int i=0;
            if (email.substring(email.length()-4,email.length()).equals(".com")|| email.substring(email.length()-3,email.length()).equals(".es")){
                if (email.substring(email.length()-4,email.length()).equals(".com")){
                    while(i<email.length()-4 && (correcto)){
                        if ( email.charAt(i) == '@') aparece=true;
                        if((email.charAt(i) == '@' && i == 0)||(email.charAt(i) == '@' && (i == email.length()-5))){//si (empieza por @ mal) o (xxx@.com)
                            System.out.println("El formato correcto es xxx@xx.com o xxx@xx.es");
                            correcto = false;
                        }
                        i++;
                    }
                }
                i=0;
                if (email.substring(email.length()-3,email.length()).equals(".es")){
                    while(i<email.length()-3 && (correcto)){
                        if((email.charAt(i) == '@' && i == 0)||(email.charAt(i) == '@' && (i == email.length()-4))){//si (empieza por @ mal) o (xxx@.com)
                            System.out.println("El formato correcto es xxx@xx.com o xxx@xx.es");
                            correcto = false;
                        }
                        i++;
                    }
                }
            }else{
                correcto = false;
                System.out.println("el correo no termina en .com o en .es");
            }
        }else{
            correcto = false;
            System.out.println("Debe introducir un correo v�lido");
        }
        if (correcto == true && aparece == true) return true;
        else return false;
    }

}
