package com.appodeal.ads.adapters.admobmediation.customevent;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends n {
    public m(final double d10) {
        super(new Function1() { // from class: com.appodeal.ads.adapters.admobmediation.customevent.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(m.a(d10, ((Double) obj).doubleValue()));
            }
        });
    }

    public static final boolean a(double d10, double d11) {
        return d10 <= d11;
    }
}
