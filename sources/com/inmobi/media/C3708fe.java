package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: renamed from: com.inmobi.media.fe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3708fe extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MutableSharedFlow f38577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4057te f38578d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3708fe(MutableSharedFlow mutableSharedFlow, Continuation continuation, C4057te c4057te) {
        super(2, continuation);
        this.f38577c = mutableSharedFlow;
        this.f38578d = c4057te;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C3708fe c3708fe = new C3708fe(this.f38577c, continuation, this.f38578d);
        c3708fe.f38576b = obj;
        return c3708fe;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3708fe) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38575a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f38576b;
            MutableSharedFlow mutableSharedFlow = this.f38577c;
            C3682ee c3682ee = new C3682ee(coroutineScope, this.f38578d);
            this.f38575a = 1;
            if (mutableSharedFlow.collect(c3682ee, this) == objG) {
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
