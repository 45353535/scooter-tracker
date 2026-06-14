package e7;

import android.graphics.Typeface;
import com.yandex.div.core.font.DivTypefaceProvider;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {
    public static Typeface a(DivTypefaceProvider divTypefaceProvider, int i10) {
        return (i10 < 0 || i10 >= 350) ? (i10 < 350 || i10 >= 450) ? (i10 < 450 || i10 >= 600) ? divTypefaceProvider.getBold() : divTypefaceProvider.getMedium() : divTypefaceProvider.getRegular() : divTypefaceProvider.getLight();
    }

    public static boolean b(DivTypefaceProvider divTypefaceProvider) {
        return false;
    }
}
