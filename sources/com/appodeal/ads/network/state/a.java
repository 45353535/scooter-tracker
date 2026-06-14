package com.appodeal.ads.network.state;

import com.appodeal.ads.network.NetworkStateObserver;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f13991r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, Continuation continuation) {
        super(2, continuation);
        this.f13991r = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f13991r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a(this.f13991r, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        Iterator it = this.f13991r.f13996b.iterator();
        while (it.hasNext()) {
            ((NetworkStateObserver.ConnectionListener) it.next()).onAvailable();
        }
        return Unit.f93236a;
    }
}
