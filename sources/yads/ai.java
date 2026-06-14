package yads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class ai extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f108690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dm2 f108691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f108692d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(Context context, dm2 dm2Var, CoroutineScope coroutineScope, Continuation continuation) {
        super(2, continuation);
        this.f108690b = context;
        this.f108691c = dm2Var;
        this.f108692d = coroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new ai(this.f108690b, this.f108691c, this.f108692d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ai) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        try {
            if (bi.f109010b != null) {
                return Unit.f93236a;
            }
            Object obj2 = vt2.f117186j;
            hr2 hr2VarA = ut2.a().a(this.f108690b);
            if (hr2VarA != null && hr2VarA.f111732i0) {
                Set setEmptySet = hr2VarA.f111742n0;
                if (setEmptySet == null) {
                    setEmptySet = SetsKt.emptySet();
                }
                Integer num = hr2VarA.f111734j0;
                int iIntValue = num != null ? num.intValue() : 10;
                Integer num2 = hr2VarA.f111736k0;
                int iIntValue2 = num2 != null ? num2.intValue() : 91;
                Boolean bool = hr2VarA.f111738l0;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                pf pfVar = new pf(setEmptySet, iIntValue, iIntValue2, zBooleanValue);
                wh whVar = new wh(this.f108690b);
                xh xhVar = new xh(this.f108691c, zBooleanValue);
                df dfVar = new df(gf1.a(this.f108690b, "YadPreferenceFile"));
                AtomicBoolean atomicBoolean = bi.f109009a;
                bi.f109010b = new zh(pfVar, this.f108692d, whVar, xhVar, dfVar, this.f108691c);
                zh zhVar = bi.f109010b;
                if (zhVar != null && !zhVar.f118682h.getAndSet(true)) {
                    eg.i.d(zhVar.f118676b, zhVar.f118680f, null, new yh(zhVar, null), 2, null);
                }
            }
            bi.f109009a.set(false);
            return Unit.f93236a;
        } finally {
            bi.f109009a.set(false);
        }
    }
}
