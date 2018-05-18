import java.io.*;
public class GameLogic {

public static void main(String[] args) {
	File game = new File("words.tx");
	try {
		FileReader gameR = new FileReader(game);
		int ch = gameR.read();
	}catch (Exception E) {
		
	}
}
}