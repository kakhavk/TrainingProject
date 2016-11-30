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
        setStatus();
    }

    public void setStatus(){
        setTextColor(ContextCompat.getColor(this.context, R.color.colorWhite));
        setTextSize(14);
        setText("New "+MainActivity.getTest());
    }
}
