import java.util.*;

public class DocumentHashTable {
    private Map<String, List<Integer>> keywordMap;
    private Map<Integer, List<String>> documentMap;

    public DocumentHashTable() {
        keywordMap = new HashMap<>();
        documentMap = new HashMap<>();
    }
    public void addDocument(int documentId, List<String> keywords) {
        documentMap.put(documentId, keywords);

        for (String keyword : keywords) {
            keywordMap.computeIfAbsent(keyword, k -> new ArrayList<>()).add(documentId);
        }

        System.out.println("Added doc with id " + documentId);
    }
    public void search(String keyword) {
        if (keywordMap.containsKey(keyword)) {
            List<Integer> documentIds = keywordMap.get(keyword);
            System.out.println("Found docs for the keyword '" + keyword + "': " + documentIds);
            for (Integer documentId : documentIds) {
                System.out.println("Doc " + documentId + ": " + documentMap.get(documentId));
            }
        } else {
            System.out.println("Not found docs for the keyword '" + keyword + "'.");
        }
    }

}
