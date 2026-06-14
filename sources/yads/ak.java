package yads;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ak {
    public static final int a(Context context, int i10) {
        int color;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            color = typedArrayObtainStyledAttributes.getColor(0, 0);
        } catch (Exception unused) {
            color = ViewCompat.MEASURED_STATE_MASK;
        }
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }
}
