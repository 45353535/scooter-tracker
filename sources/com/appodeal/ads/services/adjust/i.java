package com.appodeal.ads.services.adjust;

import com.appodeal.ads.modules.common.internal.service.ConnectorCallback;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f14549r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ConnectorCallback f14550s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ConnectorCallback connectorCallback, Continuation continuation) {
        super(2, continuation);
        this.f14550s = connectorCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        i iVar = new i(this.f14550s, continuation);
        iVar.f14549r = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        i iVar = new i(this.f14550s, (Continuation) obj2);
        iVar.f14549r = (com.appodeal.ads.services.adjust.collector.a) obj;
        return iVar.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        this.f14550s.onServiceDataUpdated(((com.appodeal.ads.services.adjust.collector.a) this.f14549r).a());
        return Unit.f93236a;
    }
}
