package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.tg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4059tg extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4134wg f39599b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4059tg(C4134wg c4134wg, Continuation continuation) {
        super(2, continuation);
        this.f39599b = c4134wg;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4059tg(this.f39599b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4059tg(this.f39599b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39598a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            C4134wg c4134wg = this.f39599b;
            this.f39598a = 1;
            if (C4134wg.a(c4134wg, this) == objG) {
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
