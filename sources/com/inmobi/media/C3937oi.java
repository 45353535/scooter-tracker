package com.inmobi.media;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3937oi extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC4011ri f39208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f39209b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3937oi(AbstractC4011ri abstractC4011ri, Map map, Continuation continuation) {
        super(2, continuation);
        this.f39208a = abstractC4011ri;
        this.f39209b = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3937oi(this.f39208a, this.f39209b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3937oi(this.f39208a, this.f39209b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        this.f39208a.f39476d.onAdClicked(this.f39209b);
        return Unit.f93236a;
    }
}
