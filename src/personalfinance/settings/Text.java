package personalfinance.settings;

import java.util.HashMap;

final public class Text {

    private static final HashMap<String, String> data = new HashMap();

    public static String get(String key) {
        return data.get(key);
    }

    public static String[] getMonths() {
        String[] months = new String[12];
        months[0] = get("JANUARY");
        months[1] = get("FEBRUAR");
        months[2] = get("MARCH");
        months[3] = get("APRIL");
        months[4] = get("MAY");
        months[5] = get("JUNE");
        months[6] = get("JULY");
        months[7] = get("AUGUST");
        months[8] = get("SEPTEMBER");
        months[9] = get("OCTOBER");
        months[10] = get("NOVEMBER");
        months[11] = get("DECEMBER");
        return months;
    }

    public static void init() {

        data.put("PROGRAMM_NAME", "Personal Finance");
        data.put("MENU_FILE", "File");
        data.put("MENU_EDIT", "Edit");
        data.put("MENU_VIEW", "View");
        data.put("MENU_SETTINGS", "Settings");
        data.put("MENU_HELP", "Help");


        data.put("JANUARY", "January");
        data.put("FEBRUAR", "Februar");
        data.put("MARCH", "March");
        data.put("APRIL", "April");
        data.put("MAY", "May");
        data.put("JUNE", "June");
        data.put("JULY", "July");
        data.put("AUGUST", "August");
        data.put("SEPTEMBER", "September");
        data.put("OCTOBER", "October");
        data.put("NOVEMBER", "November");
        data.put("DECEMBER", "December");

    }


}
