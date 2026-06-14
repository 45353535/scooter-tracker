package com.appodeal.ads.ext;

import android.content.res.Resources;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"toPx", "", "getToPx", "(I)I", "ext_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class DensityExtKt {
    public static final int getToPx(int i10) {
        return zf.a.d(i10 * Resources.getSystem().getDisplayMetrics().density);
    }
}
