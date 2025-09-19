package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {

    private Set<String> uniqueStrings;
    private int duplicateCount;

    public PersonalDuplicateRemover() {
        uniqueStrings = new HashSet<>();
        duplicateCount = 0;
    }

    @Override
    public void add(String characterString) {
        if (!uniqueStrings.add(characterString)) {
            duplicateCount++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicateCount;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return new HashSet<>(uniqueStrings);
    }

    @Override
    public void empty() {
        uniqueStrings.clear();
        duplicateCount = 0;
    }
}