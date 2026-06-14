package com.inmobi.media;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class Oa extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f37486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Na f37487b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oa(LinkedHashMap linkedHashMap, Na na2, Continuation continuation) {
        super(2, continuation);
        this.f37486a = linkedHashMap;
        this.f37487b = na2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Oa(this.f37486a, this.f37487b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Oa(this.f37486a, this.f37487b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        this.f37486a.put("networkType", C4148x5.m());
        String str = this.f37487b.f37438a;
        LinkedHashMap linkedHashMap = this.f37486a;
        Wj wj = Wj.f37959a;
        Wj.b(str, linkedHashMap, EnumC3585ak.f38215a);
        return Unit.f93236a;
    }
}
