package com.appodeal.ads.bidon;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.k;
import lf.i;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f13153a = i.a(new Function0() { // from class: com.appodeal.ads.bidon.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return g.a();
        }
    });

    public static final Regex a() {
        return new Regex("^https?://[a-z0-9.-]+\\.[a-z]{2,}(?:/\\S*)?$", k.f93534d);
    }

    public final boolean b(String endpoint) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        return ((Regex) this.f13153a.getValue()).g(endpoint);
    }
}
