package com.appodeal.ads.networking.processors;

import com.appodeal.ads.context.o;
import com.appodeal.ads.network.IndexProvider;
import com.appodeal.ads.services.ua.j;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import lf.i;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f14156a = i.a(new Function0() { // from class: com.appodeal.ads.networking.processors.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return e.a();
        }
    });

    public static final b a() {
        return new b((IndexProvider) com.appodeal.ads.networking.endpoint.b.f14099e.getValue(), o.f13205b, j.f14776b, com.appodeal.ads.targeting.d.f14885b);
    }
}
