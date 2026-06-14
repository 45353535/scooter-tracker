package com.appodeal.ads.targeting;

import com.appodeal.ads.initializing.j;
import eg.e0;
import eg.m1;
import eg.o0;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import lf.i;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f14887a = i.a(new Function0() { // from class: com.appodeal.ads.targeting.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return f.a();
        }
    });

    public static final c a() {
        return new c(j.f13479b, kotlinx.coroutines.i.a(m1.b(null, 1, null).plus(o0.c()).plus(new e0("ApdTargetingParams"))));
    }
}
