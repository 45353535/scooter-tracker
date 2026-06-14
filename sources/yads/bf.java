package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class bf extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f108981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cf f108982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f108983d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(cf cfVar, long j10, Continuation continuation) {
        super(2, continuation);
        this.f108982c = cfVar;
        this.f108983d = j10;
    }

    public static final void a(eg.p pVar) {
        pVar.s(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new bf(this.f108982c, this.f108983d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new bf(this.f108982c, this.f108983d, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f108981b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            final eg.p pVarC = eg.r.c(null, 1, null);
            this.f108982c.f109383b.post(new Runnable() { // from class: yads.m3
                @Override // java.lang.Runnable
                public final void run() {
                    bf.a(pVarC);
                }
            });
            long j10 = this.f108983d;
            af afVar = new af(pVarC, null);
            this.f108981b = 1;
            obj = eg.x1.e(j10, afVar, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        return kotlin.coroutines.jvm.internal.b.a(obj != null);
    }
}
