package yads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ph extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f114672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ es2 f114673c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(Context context, es2 es2Var, Continuation continuation) {
        super(2, continuation);
        this.f114672b = context;
        this.f114673c = es2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new ph(this.f114672b, this.f114673c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ph(this.f114672b, this.f114673c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        boolean z10 = u73.f116560a;
        u73.a(this.f114672b, ((pr3) this.f114673c).a());
        qf.a(this.f114672b, ((pr3) this.f114673c).a());
        AtomicBoolean atomicBoolean = bi.f109009a;
        bi.a(this.f114672b, ((pr3) this.f114673c).a());
        gg1 gg1Var = new gg1();
        Boolean boolA = gg1.a(this.f114672b);
        if (boolA != null) {
            ft1.b(boolA.booleanValue());
        }
        Boolean boolB = gg1.b(this.f114672b);
        if (boolB != null) {
            ft1.a(boolB.booleanValue());
        }
        if (sb.a(this.f114672b)) {
            ls1 ls1VarA = ms1.a(this.f114672b);
            if (ls1VarA instanceof ks1) {
                wa1.a(new ya1().a((ks1) ls1VarA), new Object[0]);
            } else if (ls1VarA instanceof js1) {
                wa1.b("Yandex Mobile Ads 7.17.0 integrated successfully", new Object[0]);
            }
            op1 op1Var = new op1();
            String str = bp1.f109076d;
            cq1.a(new fq1(op1Var).a(new aq1().a(yo1.a())));
        }
        wt2 wt2Var = new wt2(gg1Var, this.f114673c);
        j1.a(this.f114672b);
        wt2Var.a(this.f114672b);
        return Unit.f93236a;
    }
}
