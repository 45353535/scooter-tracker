package yads;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ln extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f113161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rn f113162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zo f113163d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln(rn rnVar, zo zoVar, Continuation continuation) {
        super(2, continuation);
        this.f113162c = rnVar;
        this.f113163d = zoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new ln(this.f113162c, this.f113163d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ln(this.f113162c, this.f113163d, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f113161b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        rn rnVar = this.f113162c;
        af2 af2Var = rnVar.f115517m;
        Context context = rnVar.f115505a;
        zo zoVar = this.f113163d;
        this.f113161b = 1;
        Object objA = af2Var.a(context, zoVar, this);
        return objA == objG ? objG : objA;
    }
}
