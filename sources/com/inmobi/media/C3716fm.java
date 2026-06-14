package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: renamed from: com.inmobi.media.fm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3716fm extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Flow f38594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3941om f38595d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3716fm(Flow flow, Continuation continuation, C3941om c3941om) {
        super(2, continuation);
        this.f38594c = flow;
        this.f38595d = c3941om;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C3716fm c3716fm = new C3716fm(this.f38594c, continuation, this.f38595d);
        c3716fm.f38593b = obj;
        return c3716fm;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3716fm) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38592a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f38593b;
            Flow flow = this.f38594c;
            C3690em c3690em = new C3690em(coroutineScope, this.f38595d);
            this.f38592a = 1;
            if (flow.collect(c3690em, this) == objG) {
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
