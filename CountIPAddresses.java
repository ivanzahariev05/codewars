package algorithms;

public class CountIPAddresses {

    public static long IpToLong(String ip) {
        String[] parts = ip.split("\\.");
        return (Long.parseLong(parts[0]) << 24) |
                (Long.parseLong(parts[1]) << 16) |
                (Long.parseLong(parts[2]) << 8) |
                (Long.parseLong(parts[3]));
    }

    public static long ipsBetween(String start, String end) {
       return IpToLong(end) - IpToLong(start);
    }
}
