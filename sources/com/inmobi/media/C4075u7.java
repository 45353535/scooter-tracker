package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.u7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4075u7 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4150x7 f39652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N7 f39653d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4075u7(C4150x7 c4150x7, Continuation continuation, N7 n72) {
        super(2, continuation);
        this.f39652c = c4150x7;
        this.f39653d = n72;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C4075u7 c4075u7 = new C4075u7(this.f39652c, continuation, this.f39653d);
        c4075u7.f39651b = obj;
        return c4075u7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4075u7) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39650a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f39651b;
            C4150x7 c4150x7 = this.f39652c;
            C4050t7 c4050t7 = new C4050t7(coroutineScope, this.f39653d);
            this.f39650a = 1;
            if (c4150x7.collect(c4050t7, this) == objG) {
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
