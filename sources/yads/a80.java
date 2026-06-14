package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class a80 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o70 f108593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p70 f108594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f108595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b80 f108596e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a80(b80 b80Var, Continuation continuation) {
        super(2, continuation);
        this.f108596e = b80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a80(this.f108596e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a80(this.f108596e, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        o70 o70VarA;
        p70 p70Var;
        Object objL;
        List listEmptyList;
        Object objG = pf.b.g();
        int i10 = this.f108595d;
        if (i10 == 0) {
            kotlin.d.b(obj);
            o70VarA = this.f108596e.f108927a.a();
            p70 p70Var2 = o70VarA.f114216f;
            if (p70Var2 == null) {
                return h51.f111486a;
            }
            xk2 xk2Var = this.f108596e.f108928b;
            this.f108593b = o70VarA;
            this.f108594c = p70Var2;
            this.f108595d = 1;
            Object objA = xk2Var.a(this);
            if (objA == objG) {
                return objG;
            }
            p70Var = p70Var2;
            objL = objA;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p70Var = this.f108594c;
            o70VarA = this.f108593b;
            kotlin.d.b(obj);
            objL = ((Result) obj).l();
        }
        if (Result.i(objL)) {
            objL = null;
        }
        w70 w70Var = (w70) objL;
        if (w70Var == null || (listEmptyList = w70Var.f117335g) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = o70VarA.f114213c;
        ArrayList arrayListA = this.f108596e.f108929c.a(listEmptyList);
        return this.f108596e.f108931e.a(this.f108596e.f108930d.a(new z70(o70VarA.f114211a, o70VarA.f114212b, arrayListA.isEmpty() ? list : arrayListA, o70VarA.f114214d, p70Var.f114575a, p70Var.f114576b)));
    }
}
