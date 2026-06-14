package com.appodeal.ads.services.appsflyer;

import com.appodeal.ads.modules.common.internal.service.ConnectorCallback;
import com.appodeal.ads.modules.common.internal.service.ServiceData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f14599r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ConnectorCallback f14600s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ConnectorCallback connectorCallback, Continuation continuation) {
        super(2, continuation);
        this.f14600s = connectorCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        j jVar = new j(this.f14600s, continuation);
        jVar.f14599r = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        j jVar = new j(this.f14600s, (Continuation) obj2);
        jVar.f14599r = (ServiceData.AppsFlyer) obj;
        return jVar.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        this.f14600s.onServiceDataUpdated((ServiceData.AppsFlyer) this.f14599r);
        return Unit.f93236a;
    }
}
