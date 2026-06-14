package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3575aa extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3627ca f38177b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3575aa(C3627ca c3627ca, Continuation continuation) {
        super(2, continuation);
        this.f38177b = c3627ca;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3575aa(this.f38177b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3575aa(this.f38177b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38176a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            C4154xb c4154xb = (C4154xb) AbstractC4179yb.f39987a.getValue();
            String str = this.f38177b.f38334a.f37940c.f39367a;
            this.f38176a = 1;
            if (c4154xb.a(str, this) == objG) {
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
