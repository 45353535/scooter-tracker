package com.appodeal.ads.storage;

import com.appodeal.ads.modules.common.internal.Constants;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0 f14807r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a0 a0Var, Continuation continuation) {
        super(2, continuation);
        this.f14807r = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f14807r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new i(this.f14807r, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        a0 a0Var = this.f14807r;
        d dVar = d.f14788c;
        boolean z10 = a0Var.c(dVar).getBoolean(Constants.APPODEAL_FIRST_INSTALL, false);
        if (!z10) {
            this.f14807r.c(dVar).edit().putBoolean(Constants.APPODEAL_FIRST_INSTALL, true).apply();
        }
        return kotlin.coroutines.jvm.internal.b.a(z10);
    }
}
