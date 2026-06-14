package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.ud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4081ud extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4156xd f39668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Dd f39669d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4081ud(C4156xd c4156xd, Continuation continuation, Dd dd2) {
        super(2, continuation);
        this.f39668c = c4156xd;
        this.f39669d = dd2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C4081ud c4081ud = new C4081ud(this.f39668c, continuation, this.f39669d);
        c4081ud.f39667b = obj;
        return c4081ud;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4081ud) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39666a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f39667b;
            C4156xd c4156xd = this.f39668c;
            C4056td c4056td = new C4056td(coroutineScope, this.f39669d);
            this.f39666a = 1;
            if (c4156xd.collect(c4056td, this) == objG) {
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
