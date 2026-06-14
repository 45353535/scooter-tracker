package i3;

import android.graphics.Color;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d {
    public static int a(float f10, int i10) {
        return (b(f10) << 24) | (i10 & ViewCompat.MEASURED_SIZE_MASK);
    }

    public static int b(float f10) {
        return Math.round(f10 * 255.0f);
    }

    public static int c(int i10, float f10) {
        float[] fArr = {0.0f, 0.0f, f10};
        Color.colorToHSV(i10, fArr);
        return Color.HSVToColor(fArr);
    }

    public static float d(int i10) {
        return Color.alpha(i10) / 255.0f;
    }

    public static String e(int i10, boolean z10) {
        return String.format(z10 ? "#%08X" : "#%06X", Integer.valueOf(i10 & (z10 ? -1 : ViewCompat.MEASURED_SIZE_MASK))).toUpperCase();
    }

    public static float f(int i10) {
        float[] fArr = new float[3];
        Color.colorToHSV(i10, fArr);
        return fArr[2];
    }
}
