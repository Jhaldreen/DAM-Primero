/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multicine;

import java.util.Scanner;

/**
 *
 * @author adelapresa
 */
public class Multicine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int opcion=0;
        
        Sala s1= new Sala();
        s1.setNumeroSala(1);
        s1.setTitulo("SPECTRE");       
        s1.setCartelAscii("       ________   ________    _________  ____________;_\n" +
"      - ______ \\ - ______ \\ / _____   //.  .  ._______/\n" +
"     / /     / // /     / //_/     / // ___   /\n" +
"    / /     / // /     / /       .-'//_/|_/,-'\n" +
"   / /     / // /     / /     .-'.-'\n" +
"  / /     / // /     / /     / /\n" +
" / /     / // /     / /     / /\n" +
"/ /_____/ // /_____/ /     / /\n" +
"\\________- \\________-     /_/\n" +
"\n" +
"-------------------------------------------------------\n");
 
        Sala s2= new Sala();
        s2.setNumeroSala(2);
        s2.setTitulo("STAR WARS");
        s2.setCartelAscii("               _________________      ____         __________\n" +
" .       .    /                 |    /    \\    .  |          \\\n" +
"     .       /    ______   _____| . /      \\      |    ___    |     .     .\n" +
"             \\    \\    |   |       /   /\\   \\     |   |___>   |\n" +
"           .  \\    \\   |   |      /   /__\\   \\  . |         _/             .\n" +
" .     ________>    |  |   | .   /            \\   |   |\\    \\_______    .\n" +
"      |            /   |   |    /    ______    \\  |   | \\           |\n" +
"      |___________/    |___|   /____/      \\____\\ |___|  \\__________|    .\n" +
"  .     ____    __  . _____   ____      .  __________   .  _________\n" +
"       \\    \\  /  \\  /    /  /    \\       |          \\    /         |      .\n" +
"        \\    \\/    \\/    /  /      \\      |    ___    |  /    ______|  .\n" +
"         \\              /  /   /\\   \\ .   |   |___>   |  \\    \\\n" +
"   .      \\            /  /   /__\\   \\    |         _/.   \\    \\\n" +
"           \\    /\\    /  /            \\   |   |\\    \\______>    |   .\n" +
"            \\  /  \\  /  /    ______    \\  |   | \\              /          .\n" +
" .       .   \\/    \\/  /____/      \\____\\ |___|  \\____________/  LS\n" +
"                               .\n" +
"\n" +
"------------------------------------------------------------------------------------------------------\n");
        System.out.println("");
 
        Sala s3= new Sala();
        s3.setNumeroSala(3);
        s3.setTitulo("ALADDIN");
        s3.setCartelAscii("                     ..    d$P              $$      `$b\n" +
"                    z$\"   $$F               4$$      $$L\n" +
"                    $$   4$$                 $$.     4$$    ,z$P\n" +
"                    $$   $$'                 $$F      $$   $$$P\n" +
"                   $$$   $$                  $$f      $$   \"\"`\n" +
"                  $'$$; 4$F      .,_         $$'      $$\n" +
"                .$' ?$L 4$'   .d$\" `?    zee $$   ,ec $F  d$F z$$   ,ce,.\n" +
"              .d$ee. $$ 4$'  d$\"   z$  $$\"  .$f.d$\"  4$  4$$ 4$$P z$P?$$$\n" +
"             d$\" \"?$$d$,`$  $$F   z$f,$$    $$.$$    $P  $$% $$$4$\"   4$$\n" +
".$\"%.     ,p$\"        $$ $ J$$  z$$$ $$\"  .$$ $$\"  .$$C 4$P  $$$\"     $$f\n" +
"`$.     ,d$b****q,     $.$ $$$$$P $$.$$b.$P4$ $$L.$P4$F $P  4$P     .$$\"\n" +
" `?$$g$P\"        \"     `b' `??\"   \"?\"^?F\"   $$`?PF\"  $$ \"   P'     eF");
 
 
         
        System.out.println("Nuestra plataforma se complace en presentar las siguientes películas: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
    
}
