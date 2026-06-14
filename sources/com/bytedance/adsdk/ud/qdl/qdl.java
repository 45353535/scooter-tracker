package com.bytedance.adsdk.ud.qdl;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ud.mo.mzz;

/* JADX INFO: loaded from: classes6.dex */
public class qdl extends Paint {
    public qdl() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            super.setAlpha(mzz.qdl(i10, 0, 255));
        } else {
            setColor((mzz.qdl(i10, 0, 255) << 24) | (getColor() & ViewCompat.MEASURED_SIZE_MASK));
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public qdl(int i10) {
        super(i10);
    }

    public qdl(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public qdl(int i10, PorterDuff.Mode mode) {
        super(i10);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
