package tres_en_ralla;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oscar de la Cuesta. 3 En Raya, propositos didacticos.
 */
public class juego {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char tablero[][] = new char[3][3];
        char jugador1 = 'X';
        char jugador2 = 'O';
        int i = 0;
        int j = 0;
        
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
       
    }
}
