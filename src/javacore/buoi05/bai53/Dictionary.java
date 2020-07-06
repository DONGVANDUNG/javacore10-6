package javacore.buoi05.bai53;

import javacore.buoi05.bai53.Word;

public class Dictionary {
    private Word[] words;

    public Dictionary(Word[] words) {
        this.words = words;
    }

    public Dictionary() {
    }

    public Word Search(String key, String type) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].getKey().equalsIgnoreCase(key) && words[i].getType().equalsIgnoreCase(type)) {
                return words[i];
            }
        }
        return null;
    }

    public int countAV() {
        int dem = 0;
        for (Word word : words) {
            if (word.getType().equalsIgnoreCase("ANH-VIET")) {
                dem += 1;
            }
        }
        return dem;
    }

    public int countVA() {
        int dem = 0;
        for (Word word : words) {
            if (word.getType().equalsIgnoreCase("VIET-ANH")) {
                dem += 1;
            }
        }
        return dem;
    }
}