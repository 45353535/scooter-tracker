package x4;

import android.content.Context;
import android.util.TypedValue;
import androidx.core.content.ContextCompat;
import com.ktwapps.speedometer.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class k {
    public static int a(Context context, float f10) {
        return Math.round(TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics()));
    }

    public static Map b(Context context) {
        HashMap map = new HashMap();
        map.put("RED", Integer.valueOf(ContextCompat.getColor(context, R.color.red)));
        map.put("BLUE", Integer.valueOf(ContextCompat.getColor(context, R.color.blue)));
        map.put("GREEN", Integer.valueOf(ContextCompat.getColor(context, R.color.green)));
        map.put("ORANGE", Integer.valueOf(ContextCompat.getColor(context, R.color.orange)));
        map.put("PURPLE", Integer.valueOf(ContextCompat.getColor(context, R.color.purple)));
        map.put("TEAL", Integer.valueOf(ContextCompat.getColor(context, R.color.teal)));
        return map;
    }
}
