package com.appodeal.ads.adapters.unityads;

import android.content.Context;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import eg.o0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12575r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ContextProvider f12576s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AdUnit f12577t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ UnityadsNetwork f12578u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AdNetworkMediationParams f12579v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ContextProvider contextProvider, AdUnit adUnit, UnityadsNetwork unityadsNetwork, AdNetworkMediationParams adNetworkMediationParams, Continuation continuation) {
        super(2, continuation);
        this.f12576s = contextProvider;
        this.f12577t = adUnit;
        this.f12578u = unityadsNetwork;
        this.f12579v = adNetworkMediationParams;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f12576s, this.f12577t, this.f12578u, this.f12579v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f12575r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            Context applicationContext = this.f12576s.getApplicationContext();
            String mediatorName = this.f12577t.getMediatorName();
            j unityMetaData = this.f12578u.getUnityMetaData();
            RestrictedData restrictedData = this.f12579v.getRestrictedData();
            this.f12575r = 1;
            unityMetaData.getClass();
            Object objG2 = eg.g.g(o0.b(), new i(restrictedData, applicationContext, mediatorName, null), this);
            if (objG2 != pf.b.g()) {
                objG2 = Unit.f93236a;
            }
            if (objG2 == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        return Unit.f93236a;
    }
}
