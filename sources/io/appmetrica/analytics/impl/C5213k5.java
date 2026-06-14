package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5213k5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f77587a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f77588b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f77589c;

    public C5213k5(Context context) {
        this.f77589c = context.getApplicationContext();
    }

    public final Na a(X4 x42, C5512w4 c5512w4, U7 u72, HashMap map) {
        Na na2 = (Na) map.get(x42.toString());
        if (na2 != null) {
            na2.a(c5512w4);
            return na2;
        }
        Na naA = u72.a(this.f77589c, x42, c5512w4);
        map.put(x42.toString(), naA);
        return naA;
    }
}
