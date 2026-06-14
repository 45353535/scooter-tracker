package com.inmobi.media;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3720g0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3869m0 f38606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ short f38607b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3720g0(C3869m0 c3869m0, short s10, Continuation continuation) {
        super(2, continuation);
        this.f38606a = c3869m0;
        this.f38607b = s10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3720g0(this.f38606a, this.f38607b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3720g0(this.f38606a, this.f38607b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        Map mapA = AbstractC3789ik.a(this.f38606a.f39000b);
        mapA.put("errorCode", kotlin.coroutines.jvm.internal.b.f(this.f38607b));
        Wj wj = Wj.f37959a;
        Wj.b("AdLoadDroppedAtSDK", mapA, EnumC3585ak.f38215a);
        return Unit.f93236a;
    }
}
