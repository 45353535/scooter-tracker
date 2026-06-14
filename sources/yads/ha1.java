package yads;

import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class ha1 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IntegrationInspectorActivity f111528a;

    public ha1(IntegrationInspectorActivity integrationInspectorActivity) {
        this.f111528a = integrationInspectorActivity;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        IntegrationInspectorActivity.b(this.f111528a).a((z80) obj);
        return Unit.f93236a;
    }
}
