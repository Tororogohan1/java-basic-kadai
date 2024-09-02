package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	private HashMap<String, String> dictionary;
	
	public Dictionary_Chapter21() {
        dictionary = new HashMap<>();
        
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }
	public boolean containsWord(String word) {
        return dictionary.containsKey(word);
	}
        
        public String getMeaning(String word) {
            String meaning = dictionary.get(word);
            if (meaning == null) {
                return "この単語の意味は登録されていません";
            }
            return meaning;
        }
	}