package com.inmobi.media;

import eg.c0;
import kotlin.Lazy;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes9.dex */
public final class K7 extends kotlin.coroutines.a implements eg.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f37211a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K7(c0.b bVar, N7 n72) {
        super(bVar);
        this.f37211a = n72;
    }

    @Override // eg.c0
    public final void handleException(CoroutineContext coroutineContext, Throwable th2) {
        InterfaceC3878m9 interfaceC3878m9 = this.f37211a.f37403b;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).b("HtmlMediaPlayer", "Unhandled exception: " + th2.getMessage());
        }
        Lazy lazy = P9.f37527a;
        P9.a(new L2(th2));
    }
}
