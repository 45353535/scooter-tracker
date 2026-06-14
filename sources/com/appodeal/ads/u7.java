package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.adtype.AdType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class u7 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d9 f14923r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AdType f14924s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ uc f14925t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(d9 d9Var, AdType adType, uc ucVar, Continuation continuation) {
        super(2, continuation);
        this.f14923r = d9Var;
        this.f14924s = adType;
        this.f14925t = ucVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new u7(this.f14923r, this.f14924s, this.f14925t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u7) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        AppodealRequestCallbacks appodealRequestCallbacks = this.f14923r.f13237b;
        if (appodealRequestCallbacks != null) {
            String displayName = this.f14924s.getDisplayName();
            uc ucVar = this.f14925t;
            String str = ucVar.f14938d;
            x2 x2Var = ucVar.f14937c;
            appodealRequestCallbacks.onClick(displayName, str, x2Var.f15234k, x2Var.f15229f);
        }
        return Unit.f93236a;
    }
}
