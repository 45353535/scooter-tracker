package yads;

import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes4.dex */
public final class ia1 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f111932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntegrationInspectorActivity f111933c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia1(IntegrationInspectorActivity integrationInspectorActivity, Continuation continuation) {
        super(2, continuation);
        this.f111933c = integrationInspectorActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new ia1(this.f111933c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new ia1(this.f111933c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f111932b;
        if (i10 == 0) {
            kotlin.d.b(obj);
            Flow flow = this.f111933c.b().f116933p;
            ha1 ha1Var = new ha1(this.f111933c);
            this.f111932b = 1;
            if (flow.collect(ha1Var, this) == objG) {
                return objG;
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
