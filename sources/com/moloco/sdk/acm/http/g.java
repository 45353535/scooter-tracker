package com.moloco.sdk.acm.http;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oe.a1;
import oe.n1;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f54072a = lf.i.a(new Function0() { // from class: com.moloco.sdk.acm.http.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return g.a();
        }
    });

    public static final ie.c a() {
        return ie.k.a(new Function1() { // from class: com.moloco.sdk.acm.http.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.b((ie.i) obj);
            }
        });
    }

    public static final Unit b(ie.i HttpClient) {
        Intrinsics.checkNotNullParameter(HttpClient, "$this$HttpClient");
        ie.i.n(HttpClient, n1.d(), null, 2, null);
        ie.i.n(HttpClient, a1.m(), null, 2, null);
        return Unit.f93236a;
    }

    public static final ie.c c() {
        return (ie.c) f54072a.getValue();
    }

    public static final ie.c d() {
        return c();
    }
}
