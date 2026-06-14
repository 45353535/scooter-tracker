package com.inmobi.media;

import eg.c0;
import kotlin.Lazy;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: com.inmobi.media.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3895n1 extends kotlin.coroutines.a implements eg.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3920o1 f39073a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3895n1(c0.b bVar, C3920o1 c3920o1) {
        super(bVar);
        this.f39073a = c3920o1;
    }

    @Override // eg.c0
    public final void handleException(CoroutineContext coroutineContext, Throwable th2) {
        C3903n9 c3903n9 = this.f39073a.f39145c;
        if (c3903n9 != null) {
            c3903n9.b("AdUnitManager", "Exception: " + lf.c.b(th2));
        }
        Lazy lazy = P9.f37527a;
        P9.a(new L2(th2));
    }
}
