package com.inmobi.media;

import com.ironsource.C4240b4;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4008rf extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4033sf f39471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f39472b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4008rf(C4033sf c4033sf, String str, Continuation continuation) {
        super(2, continuation);
        this.f39471a = c4033sf;
        this.f39472b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4008rf(this.f39471a, this.f39472b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4008rf(this.f39471a, this.f39472b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        C4209zg c4209zg = this.f39471a.f39531a;
        String value = this.f39472b;
        c4209zg.getClass();
        Intrinsics.checkNotNullParameter("omid_js_string", C4240b4.i.W);
        Intrinsics.checkNotNullParameter(value, "value");
        Ea ea2 = c4209zg.f40054a;
        ConcurrentHashMap concurrentHashMap = Ea.f36782b;
        ea2.a("omid_js_string", value, false);
        c4209zg.f40054a.a("last_ts", System.currentTimeMillis() / ((long) 1000), false);
        return Unit.f93236a;
    }
}
