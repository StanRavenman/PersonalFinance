package personalfinance.settings;

import java.util.HashMap;

final public class Text {

    private static final HashMap<String, String> data = new HashMap();

    public static String get(String key) {
        if (data.containsKey(key)) return data.get(key);
        System.out.println("Such key in Text doesn't exist !"); // Для отладки
        return "";
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

        data.put("PROGRAM_NAME", "Personal Finance");
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


        data.put("ERROR", "Error");
        data.put("ERROR_TITLE_EMPTY", "You have not entered a name!");
        data.put("ERROR_IS_EXISTS", "This entry already exists!");
        data.put("ERROR_DATE_FORMAT", "Invalid date format!");
        data.put("ERROR_CODE_EMPTY", "Вы не указали код!");
        data.put("ERROR_CURRENCY_EMPTY", "You did not specify the currency!");
        data.put("ERROR_ARTICLE_EMPTY", "You did not specify an article!");
        data.put("ERROR_ACCOUNT_EMPTY", "You did not specify an account!");
        data.put("ERROR_RATE_INCORRECT", "Invalid rate value!");
        data.put("ERROR_AMOUNT_FORMAT", "Invalid amount format!");
        data.put("ERROR_NO_BASE_CURRENCY", "Base currency required! First set this parameter in another currency, then it will be removed in this automatically.");
        data.put("ERROR_UPDATE_CURRENCIES", "Error updating currencies!");


        data.put("YES", "Yes");
        data.put("NO", "No");




    }


}
