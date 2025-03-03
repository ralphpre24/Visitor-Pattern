import java.util.HashMap;

public class UnliCallTextPackage implements UnliCallsTextOffer{

    private static HashMap<String, Boolean> unliMap = new HashMap<>();

    static {
        unliMap.put("Smart", false);
        unliMap.put("Globe", true);
        unliMap.put("Ditto", true);
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return unliMap.get(telcoName).toString();
    }
}
