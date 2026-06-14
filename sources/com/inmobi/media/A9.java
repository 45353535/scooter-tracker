package com.inmobi.media;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public abstract class A9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hh.p f36555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hh.p f36556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CoroutineScope f36557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final CoroutineScope f36558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final CoroutineScope f36559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final CoroutineScope f36560f;

    static {
        Object value = AbstractC3925o6.f39163b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        f36555a = new hh.p((ExecutorService) value);
        Object value2 = AbstractC3925o6.f39162a.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        f36556b = new hh.p((ExecutorService) value2);
        Object value3 = AbstractC3925o6.f39164c.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        f36557c = kotlinx.coroutines.i.a(eg.w0.c((ExecutorService) value3).plus(eg.m1.b(null, 1, null)));
        Object value4 = AbstractC3925o6.f39165d.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        f36558d = kotlinx.coroutines.i.a(eg.w0.c((ExecutorService) value4).plus(eg.m1.b(null, 1, null)));
        Object value5 = AbstractC3925o6.f39167f.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        f36559e = kotlinx.coroutines.i.a(eg.w0.c((ExecutorService) value5).plus(eg.m1.b(null, 1, null)));
        f36560f = kotlinx.coroutines.i.a(eg.w0.b((Wb) AbstractC3925o6.f39166e.getValue()).plus(eg.m1.b(null, 1, null)));
    }
}
