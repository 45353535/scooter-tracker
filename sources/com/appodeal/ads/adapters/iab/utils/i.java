package com.appodeal.ads.adapters.iab.utils;

import android.content.Context;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f12320r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f12321s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, String str, Continuation continuation) {
        super(2, continuation);
        this.f12320r = context;
        this.f12321s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.f12320r, this.f12321s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new i(this.f12320r, this.f12321s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        Lazy lazy = n.f12324a;
        n.f(this.f12320r, n.d(this.f12321s));
        return Unit.f93236a;
    }
}
