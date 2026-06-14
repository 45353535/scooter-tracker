package yads;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s73 {
    public static final int a(int i10) {
        return i10 >= 0 ? zf.a.d(i10 / Resources.getSystem().getDisplayMetrics().density) : i10;
    }
}
