package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class xx1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yx1 f118011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t9 f118012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qz1 f118013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jy1 f118014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tx1 f118015f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx1(yx1 yx1Var, t9 t9Var, qz1 qz1Var, jy1 jy1Var, tx1 tx1Var, Continuation continuation) {
        super(2, continuation);
        this.f118011b = yx1Var;
        this.f118012c = t9Var;
        this.f118013d = qz1Var;
        this.f118014e = jy1Var;
        this.f118015f = tx1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new xx1(this.f118011b, this.f118012c, this.f118013d, this.f118014e, this.f118015f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xx1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        new wx1(this.f118011b, this.f118012c, this.f118013d, this.f118014e, this.f118015f, new vn2()).run();
        return Unit.f93236a;
    }
}
