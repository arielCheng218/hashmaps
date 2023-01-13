import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HashMapDictionary {

	BufferedReader br = null;
	BufferedReader ioReader = new BufferedReader(new InputStreamReader(System.in));
	HashMap<String, String> map = new HashMap<String, String>();

	private void putDefinitions() {
		// try to read dictionary file, if it exists
		try {
			br = new BufferedReader(new FileReader("./wordDictionary.txt"));
			// read first line of the text file
			String line = br.readLine();
			// stop reading lines if there are no more lines
			while (line != null) {
				// split up word & definition by first "|" found
				int delimiterIndex = line.indexOf("|"); 
				String word = line.substring(0, delimiterIndex);
				String definition = line.substring(delimiterIndex + 1);
				map.put(word, definition);
				// read each line of the text file
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		HashMapDictionary dict = new HashMapDictionary();
		// Put words & their definitions as key-value pairs into hashmap
		dict.putDefinitions();
		String next = "";
		while (!next.equals("EXIT")) {
			System.out.println("Enter a word you want to know the definition to:");
			next = dict.ioReader.readLine();
			if (dict.map.get(next) != null) { 
				System.out.println(dict.map.get(next));
			} else {
				System.out.println("That word isn't in the dictionary. Try again.");
			}
		}
	}

}