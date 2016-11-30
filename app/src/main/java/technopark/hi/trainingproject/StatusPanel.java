package technopark.hi.trainingproject;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by kakha on 11/28/16.
 */

public class StatusPanel extends TextView {
    /*
    public StatusPanel(Context context) {
        super(context);
    }
    */
    public StatusPanel(Context context, AttributeSet attrs) {
        super(context, attrs);
        //TypedArray typedArray=context.obtainStyledAttributes(attrs, R.styleable.StatusPanel);
        //typedArray.getString(0);
        setStatus(context);
    }

    public void setStatus(Context context){
        setTextColor(ContextCompat.getColor(context, R.color.colorWhite));
        setTextSize(14);
        setText("New "+MainActivity.getTest());
    }
}
