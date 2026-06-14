package yads;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class i62 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f111879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k62 f111880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xb3 f111881d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i62(k62 k62Var, xb3 xb3Var, Continuation continuation) {
        super(2, continuation);
        this.f111880c = k62Var;
        this.f111881d = xb3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new i62(this.f111880c, this.f111881d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new i62(this.f111880c, this.f111881d, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f111879b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        k62 k62Var = this.f111880c;
        List listListOf = CollectionsKt.listOf(this.f111881d);
        this.f111879b = 1;
        Object objA = k62.a(k62Var, listListOf, this);
        return objA == objG ? objG : objA;
    }
}
