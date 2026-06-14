package yads;

import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class ja1 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IntegrationInspectorActivity f112278a;

    public ja1(IntegrationInspectorActivity integrationInspectorActivity) {
        this.f112278a = integrationInspectorActivity;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        c90 c90Var = (c90) obj;
        d90 d90VarC = IntegrationInspectorActivity.c(this.f112278a);
        d90VarC.getClass();
        if (c90Var.f109287c) {
            d90VarC.f109839a.submitList(CollectionsKt.emptyList());
            d90VarC.f109841c.setVisibility(0);
        } else {
            d90VarC.f109839a.submitList(c90Var.f109288d);
            d90VarC.f109841c.setVisibility(8);
        }
        d90VarC.f109840b.setText(c90Var.f109286b.f110621a);
        return Unit.f93236a;
    }
}
