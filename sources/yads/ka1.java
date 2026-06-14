package yads;

import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes4.dex */
public final class ka1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f112662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntegrationInspectorActivity f112663c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka1(IntegrationInspectorActivity integrationInspectorActivity, Continuation continuation) {
        super(2, continuation);
        this.f112663c = integrationInspectorActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new ka1(this.f112663c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ka1(this.f112663c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f112662b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            StateFlow stateFlow = this.f112663c.b().f116931n;
            ja1 ja1Var = new ja1(this.f112663c);
            this.f112662b = 1;
            if (stateFlow.collect(ja1Var, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        throw new lf.g();
    }
}
