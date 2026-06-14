package com.appodeal.ads.services;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f14778a = lf.i.a(new Function0() { // from class: com.appodeal.ads.services.s
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return v.a();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f14779b = lf.i.a(new Function0() { // from class: com.appodeal.ads.services.t
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return v.b();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy f14780c = lf.i.a(new Function0() { // from class: com.appodeal.ads.services.u
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return v.c();
        }
    });

    public static final r a() {
        return (r) f14780c.getValue();
    }

    public static final r b() {
        return (r) f14780c.getValue();
    }

    public static final r c() {
        return new r();
    }
}
