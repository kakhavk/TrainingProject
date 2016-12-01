package technopark.hi.trainingproject;

/**
 * Created by kakha on 12/1/16.
 */

public class DateUtils {
    private static String[] daysOfWeeks={"", "კვირა", "ორშაბათი", "სამშაბათი", "ოთხშაბათი", "ხუთშაბათი", "პარასკევი", "შაბათი"};
    private static String[] months={"იანვარი", "თებერვალი", "მარტი", "აპრილი", "მაისი", "ივნისი", "ივლისი", "აგვისტო", "სექტემბერი", "ოქტომბერი", "ნოებერი", "დეკემბერი"};

    public static String[] getDayOFWeeks(){
        return daysOfWeeks;
    }

    public static String[] getMonths(){
        return months;
    }
}
