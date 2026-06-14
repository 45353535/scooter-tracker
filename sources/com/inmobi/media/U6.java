package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class U6 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V6 f37829c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U6(V6 v62, Continuation continuation) {
        super(2, continuation);
        this.f37829c = v62;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        U6 u62 = new U6(this.f37829c, continuation);
        u62.f37828b = obj;
        return u62;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        U6 u62 = new U6(this.f37829c, (Continuation) obj2);
        u62.f37828b = (CoroutineScope) obj;
        return u62.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object objG = pf.b.g();
        int i10 = this.f37827a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            coroutineScope = (CoroutineScope) this.f37828b;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.f37828b;
            kotlin.d.b(obj);
        }
        while (kotlinx.coroutines.i.i(coroutineScope)) {
            V6 v62 = this.f37829c;
            v62.f37895d.setValue(kotlin.coroutines.jvm.internal.b.a(v62.f37893b.getWindowVisibility() == 0));
            long j10 = this.f37829c.f37894c;
            this.f37828b = coroutineScope;
            this.f37827a = 1;
            if (eg.k0.a(j10, this) == objG) {
                return objG;
            }
        }
        return Unit.f93236a;
    }
}
