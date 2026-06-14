package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.adtype.AdType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class l8 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d9 f13614r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AdType f13615s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ uc f13616t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(d9 d9Var, AdType adType, uc ucVar, Continuation continuation) {
        super(2, continuation);
        this.f13614r = d9Var;
        this.f13615s = adType;
        this.f13616t = ucVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new l8(this.f13614r, this.f13615s, this.f13616t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l8) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        AppodealRequestCallbacks appodealRequestCallbacks = this.f13614r.f13237b;
        if (appodealRequestCallbacks != null) {
            String displayName = this.f13615s.getDisplayName();
            uc ucVar = this.f13616t;
            String str = ucVar.f14938d;
            x2 x2Var = ucVar.f14937c;
            appodealRequestCallbacks.onRequestStart(displayName, str, x2Var.f15234k, x2Var.f15229f);
        }
        return Unit.f93236a;
    }
}
