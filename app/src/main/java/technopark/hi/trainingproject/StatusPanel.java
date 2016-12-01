package technopark.hi.trainingproject;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.content.ContextCompat;
import android.support.v4.util.TimeUtils;
import android.util.AttributeSet;
import android.widget.TextView;

import java.util.Calendar;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

/**
 * Created by kakha on 11/28/16.
 */

public class StatusPanel extends TextView {

    private Context context;
    /*
    public StatusPanel(Context context) {
        super(context);
    }
    */
    public StatusPanel(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context=context;
        //TypedArray typedArray=context.obtainStyledAttributes(attrs, R.styleable.StatusPanel);
        //typedArray.getString(0);
        //setStatus();
    }

    public void setStatus(String date){
        StringTokenizer dateToken=new StringTokenizer(date, "-");
        Calendar dateNow= Calendar.getInstance();
        int dateYear=Integer.parseInt(dateToken.nextToken());
        int dateMonth=Integer.parseInt(dateToken.nextToken());
        int dateDay=Integer.parseInt(dateToken.nextToken());
        Calendar dateWeb=Calendar.getInstance();

        String[] daysOfWeek=DateUtils.getDayOFWeeks();
        String[] months=DateUtils.getMonths();

        dateWeb.set(Calendar.YEAR, dateYear);
        dateWeb.set(Calendar.MONTH, dateMonth-1);
        dateWeb.set(Calendar.DAY_OF_MONTH, dateDay);

        long difference=dateNow.getTimeInMillis()-dateWeb.getTimeInMillis();
        long days= TimeUnit.MILLISECONDS.toDays(difference);

        setTextColor(ContextCompat.getColor(this.context, R.color.colorBlueFB));
        setBackgroundColor(ContextCompat.getColor(this.context, R.color.colorGray));
        setPadding(15, 5, 5, 5);
        setTextSize(14);

        String ago="";
        int maxDaysInMonth=dateWeb.getActualMaximum(Calendar.DAY_OF_MONTH);
        if(dateWeb.get(Calendar.MONTH)==dateNow.get(Calendar.MONTH)){
            if(days<=maxDaysInMonth){
                switch(maxDaysInMonth/7){
                    case 1:
                        ago=" ახალი ";
                        break;
                    case 2:
                        ago="ორი კვირის წინ";
                        break;
                    case 3:
                        ago="სამი კვირის წინ";
                        break;
                    default:
                        ago="1 თვის წინ";
                }
            }
        }else{
            ago=((days+maxDaysInMonth)/30)+" თვის წინ";
        }
        setText(""+dateDay+" "+months[dateWeb.get(Calendar.MONTH)]+" "+ago+"");
    }
}
