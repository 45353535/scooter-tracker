package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.q5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3974q5 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3998r5 f39347b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3974q5(C3998r5 c3998r5, Continuation continuation) {
        super(2, continuation);
        this.f39347b = c3998r5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3974q5(this.f39347b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3974q5(this.f39347b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39346a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            AbstractC4019s1 abstractC4019s1 = this.f39347b.f39440b;
            if (abstractC4019s1 != null) {
                abstractC4019s1.a();
            }
            Fc fc2 = this.f39347b.f39439a;
            if (fc2 != null) {
                this.f39346a = 1;
                if (fc2.a(this) == objG) {
                    return objG;
                }
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
