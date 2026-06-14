package com.appodeal.ads.segments;

import android.content.Context;
import java.util.Calendar;

/* JADX INFO: loaded from: classes6.dex */
public final class u implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f14516a = Calendar.getInstance();

    @Override // com.appodeal.ads.segments.t
    public final Object a(Context context, g0 g0Var) {
        return Integer.valueOf(((this.f14516a.get(7) - 1) * 24) + this.f14516a.get(11));
    }
}
