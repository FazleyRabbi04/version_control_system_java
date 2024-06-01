package vcs;

import com.github.difflib.DiffUtils;
import com.github.difflib.patch.AbstractDelta;
import com.github.difflib.patch.Patch;
import java.util.List;
import index.IndexElement;
import index.RepositoryIndex;
import java.util.stream.Collectors;

public class DiffGenerator {

    public static List<AbstractDelta<String>> getIndexDiff(RepositoryIndex currentIndex, RepositoryIndex newIndex) {
        List<String> original = currentIndex.getIndexEntries().stream().map(IndexElement::toString).collect(Collectors.toList());
        List<String> revised = newIndex.getIndexEntries().stream().map(IndexElement::toString).collect(Collectors.toList());
        System.out.println(original);
        System.out.println(revised);
        Patch<String> patch = DiffUtils.diff(original, revised);
        System.out.println(patch);
        return patch.getDeltas();
    }
}
