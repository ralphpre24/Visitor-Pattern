import java.util.HashMap;

public class TelcoAllowance implements UsagePromo{

    private static HashMap<String, Integer> allowanceMap = new HashMap<>();

    static{
        allowanceMap.put("Smart", 15);
        allowanceMap.put("Globe", 10);
        allowanceMap.put("Ditto", 8);
    }

    @Override
    public String showAllowance(String telcoName, double money) {
        return "Data allowance of " + allowanceMap.get(telcoName) + " for the price of " + money;
    }

}
