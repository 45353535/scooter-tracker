package x4;

import android.content.Context;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes10.dex */
public abstract class m {
    public static String a(int i10) {
        return String.format("#%06X", Integer.valueOf(i10 & ViewCompat.MEASURED_SIZE_MASK));
    }

    public static int b(Context context, int i10) {
        return k.a(context, (i10 * 0.2f) + 2.0f);
    }

    public static int c(Context context, int i10) {
        return k.a(context, i10 + 16);
    }

    public static int d(Context context, int i10) {
        return e(context, i10) / 5;
    }

    public static int e(Context context, int i10) {
        return k.a(context, (i10 * 5) + 60);
    }

    public static int f(int i10) {
        return (int) ((((double) i10) * 2.5d) + 24.0d);
    }

    public static int g(int i10) {
        return Math.min(i10 + 8, 16);
    }
}
