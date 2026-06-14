package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class os2 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f114413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f114414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rs2 f114415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os2(boolean z10, rs2 rs2Var, Continuation continuation) {
        super(2, continuation);
        this.f114414c = z10;
        this.f114415d = rs2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new os2(this.f114414c, this.f114415d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new os2(this.f114414c, this.f114415d, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f114413b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            if (this.f114414c) {
                ki0 ki0Var = this.f114415d.f115582q;
                this.f114413b = 1;
                if (ki0Var.a(this) == objG) {
                    return objG;
                }
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
