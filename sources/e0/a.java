package e0;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.view.ViewCompat;
import q0.l;

/* JADX INFO: loaded from: classes5.dex */
public class a extends Paint {
    public a() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(l.c(i10, 0, 255));
        } else {
            setColor((l.c(i10, 0, 255) << 24) | (getColor() & ViewCompat.MEASURED_SIZE_MASK));
        }
    }

    public a(int i10) {
        super(i10);
    }

    public a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public a(int i10, PorterDuff.Mode mode) {
        super(i10);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }
}
