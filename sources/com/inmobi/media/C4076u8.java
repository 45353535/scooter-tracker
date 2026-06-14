package com.inmobi.media;

import eg.c0;
import kotlin.Lazy;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: com.inmobi.media.u8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4076u8 extends kotlin.coroutines.a implements eg.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4101v8 f39654a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4076u8(c0.b bVar, C4101v8 c4101v8) {
        super(bVar);
        this.f39654a = c4101v8;
    }

    @Override // eg.c0
    public final void handleException(CoroutineContext coroutineContext, Throwable th2) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39654a.f39747c;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).b("HybridVideoPlayerHandler", "Unhandled exception: " + th2.getMessage());
        }
        Lazy lazy = P9.f37527a;
        P9.a(new L2(th2));
    }
}
