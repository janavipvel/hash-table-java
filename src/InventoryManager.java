import java.util.*;

class InventoryManager {
    HashMap<String, Integer> stock = new HashMap<>();
    LinkedHashMap<String, Queue<Integer>> waiting = new LinkedHashMap<>();

    synchronized String purchaseItem(String product, int userId) {
        int s = stock.getOrDefault(product, 0);
        if (s > 0) {
            stock.put(product, s - 1);
            return "Success";
        } else {
            waiting.putIfAbsent(product, new LinkedList<>());
            waiting.get(product).add(userId);
            return "Added to waiting list";
        }
    }

    int checkStock(String product) {
        return stock.getOrDefault(product, 0);
    }

    public static void main(String[] args) {
        InventoryManager m = new InventoryManager();
        m.stock.put("IPHONE15_256GB", 2);
        System.out.println(m.purchaseItem("IPHONE15_256GB", 1));
        System.out.println(m.purchaseItem("IPHONE15_256GB", 2));
        System.out.println(m.purchaseItem("IPHONE15_256GB", 3));
    }
}