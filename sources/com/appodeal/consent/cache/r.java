package com.appodeal.consent.cache;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f15402a = lf.i.a(new Function0() { // from class: com.appodeal.consent.cache.q
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return r.b();
        }
    });

    public static final p[] a() {
        return (p[]) f15402a.getValue();
    }

    public static final p[] b() {
        return new p[]{m.f15397c, n.f15398c, o.f15399c, l.f15396c, j.f15394c, k.f15395c};
    }
}
