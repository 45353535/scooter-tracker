package com.appodeal.ads;

import com.appodeal.ads.modules.common.internal.adtype.AdType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class g8 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d9 f13352r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AdType f13353s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ uc f13354t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f13355u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(d9 d9Var, AdType adType, uc ucVar, boolean z10, Continuation continuation) {
        super(2, continuation);
        this.f13352r = d9Var;
        this.f13353s = adType;
        this.f13354t = ucVar;
        this.f13355u = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new g8(this.f13352r, this.f13353s, this.f13354t, this.f13355u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g8) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        AppodealRequestCallbacks appodealRequestCallbacks = this.f13352r.f13237b;
        if (appodealRequestCallbacks != null) {
            String displayName = this.f13353s.getDisplayName();
            uc ucVar = this.f13354t;
            String str = ucVar.f14938d;
            x2 x2Var = ucVar.f14937c;
            appodealRequestCallbacks.onRequestFinish(displayName, str, x2Var.f15234k, x2Var.f15229f, this.f13355u);
        }
        return Unit.f93236a;
    }
}
