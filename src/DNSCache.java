import java.util.*;

class DNSEntry {
    String ip;
    long expiry;

    DNSEntry(String ip, long ttl) {
        this.ip = ip;
        this.expiry = System.currentTimeMillis() + ttl;
    }
}

class DNSCache {
    HashMap<String, DNSEntry> cache = new HashMap<>();

    String resolve(String domain) {
        DNSEntry e = cache.get(domain);
        long now = System.currentTimeMillis();
        if (e != null && e.expiry > now) return e.ip;
        String ip = "172.217.14." + new Random().nextInt(255);
        cache.put(domain, new DNSEntry(ip, 300000));
        return ip;
    }

    public static void main(String[] args) {
        DNSCache d = new DNSCache();
        System.out.println(d.resolve("google.com"));
      
        System.out.println(d.resolve("google.com"));
    }
}