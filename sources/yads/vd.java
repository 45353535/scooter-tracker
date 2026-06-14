package yads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: classes4.dex */
public final class vd extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f116963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wd f116964c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(wd wdVar, Continuation continuation) {
        super(2, continuation);
        this.f116964c = wdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new vd(this.f116964c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new vd(this.f116964c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f116963b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            Deferred deferred = this.f116964c.f117426c;
            this.f116963b = 1;
            obj = deferred.await(this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        ee eeVar = obj instanceof ee ? (ee) obj : null;
        if (eeVar != null) {
            return eeVar.f110346a;
        }
        return null;
    }
}
