package br.com.saraiva.exercises;

import java.text.Normalizer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise2 {

    public Map<String, Integer> counterNames(final List<String> names) {
        final HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String s : names) {
            final String normalized = normalize(s);
            if (map.containsKey(normalized))
                map.put(normalized, map.get(normalized) + 1);
            else
                map.put(normalized, 1);
        }
        return map;
    }

    private String normalize(final String input) {
        final String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);

        StringBuilder result = new StringBuilder();

        int offset = 0, strLen = normalized.length();
        while (offset < strLen) {
            int character = normalized.codePointAt(offset);
            offset += Character.charCount(character);

            if (Character.getType(character) != Character.NON_SPACING_MARK)
                result.appendCodePoint(Character.toUpperCase(character));

        }
        return result.toString();
    }
}
