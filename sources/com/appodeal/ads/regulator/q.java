package com.appodeal.ads.regulator;

import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.utils.Log;
import com.appodeal.consent.ConsentManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends kotlin.coroutines.jvm.internal.k implements Function3 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ g f14365r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f14366s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(y yVar, Continuation continuation) {
        super(3, continuation);
        this.f14366s = yVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        q qVar = new q(this.f14366s, (Continuation) obj3);
        qVar.f14365r = (g) obj2;
        return qVar.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        g gVar = this.f14365r;
        if (gVar instanceof e) {
            LogExtKt.logInternal$default("ConsentSdk", String.valueOf(gVar), null, 4, null);
            y yVar = this.f14366s;
            eg.i.d(yVar.f14414d, null, null, new u(yVar, (e) gVar, null), 3, null);
            return k.f14361a;
        }
        if (gVar instanceof f) {
            LogExtKt.logInternal$default("ConsentSdk", String.valueOf(gVar), null, 4, null);
            if (ConsentManager.canShowAds()) {
                this.f14366s.b(b.f14345a);
                return h.f14358a;
            }
            y yVar2 = this.f14366s;
            eg.i.d(yVar2.f14414d, null, null, new t(yVar2, null), 3, null);
            return l.f14362a;
        }
        if (gVar instanceof d) {
            LogExtKt.logInternal$default("ConsentSdk", String.valueOf(gVar), null, 4, null);
            y yVar3 = this.f14366s;
            eg.i.d(yVar3.f14414d, null, null, new x(yVar3, ((d) gVar).f14352a, null), 3, null);
            return i.f14359a;
        }
        if (gVar instanceof b) {
            LogExtKt.logInternal$default("ConsentSdk", String.valueOf(gVar), null, 4, null);
            return n.f14364a;
        }
        if (gVar instanceof a) {
            LogExtKt.logInternal$default("ConsentSdk", String.valueOf(gVar), null, 4, null);
            return n.f14364a;
        }
        if (!(gVar instanceof c)) {
            throw new lf.m();
        }
        LogExtKt.logInternal$default("ConsentSdk", String.valueOf(gVar), null, 4, null);
        c cVar = (c) gVar;
        Log.log(cVar.f14351a);
        return new m(cVar.f14351a);
    }
}
