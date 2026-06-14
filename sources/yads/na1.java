package yads;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class na1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntegrationInspectorActivity f113764b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na1(IntegrationInspectorActivity integrationInspectorActivity) {
        super(0);
        this.f113764b = integrationInspectorActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        IntegrationInspectorActivity integrationInspectorActivity = this.f113764b;
        ma1 ma1Var = new ma1(this.f113764b.b());
        return new d90(integrationInspectorActivity, ma1Var, new LinearLayoutManager(integrationInspectorActivity, 1, false), new j40(ma1Var, (m70) IntegrationInspectorActivity.a(this.f113764b).f118573r.getValue()));
    }
}
