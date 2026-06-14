package yads;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class g62 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gb3 f111085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f111086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gb3 f111087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k62 f111088e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g62(gb3 gb3Var, k62 k62Var, Continuation continuation) {
        super(2, continuation);
        this.f111087d = gb3Var;
        this.f111088e = k62Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new g62(this.f111087d, this.f111088e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new g62(this.f111087d, this.f111088e, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws mz1 {
        gb3 gb3Var;
        Object objG = pf.b.g();
        int i10 = this.f111086c;
        if (i10 == 0) {
            kotlin.d.b(obj);
            gb3 gb3Var2 = this.f111087d;
            if (gb3Var2 == null) {
                return null;
            }
            k62 k62Var = this.f111088e;
            List list = gb3Var2.f111136a;
            this.f111085b = gb3Var2;
            this.f111086c = 1;
            k62Var.getClass();
            Object objG2 = eg.g.g(eg.o0.b(), new j62(k62Var, list, null), this);
            if (objG2 == objG) {
                return objG;
            }
            gb3Var = gb3Var2;
            obj = objG2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gb3Var = this.f111085b;
            kotlin.d.b(obj);
        }
        List list2 = (List) obj;
        if (list2.isEmpty()) {
            throw new mz1("Invalid VAST in response");
        }
        return new gb3(list2, gb3Var.f111137b, gb3Var.f111138c);
    }
}
