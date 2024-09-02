package kadai_021;

public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
	
	Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
	
	String[] wordsToSearch = {"apple", "banana", "grape", "orange"};

	
	for (String word : wordsToSearch) {
		
		if (dictionary.containsWord(word)) {
            System.out.println(word + "の意味は" + dictionary.getMeaning(word));
        } else {
            System.out.println(word + "は辞書に存在しません");
        }
		
	}
	}
	
}
