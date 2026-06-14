package yads;

import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ga1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntegrationInspectorActivity f111130b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga1(IntegrationInspectorActivity integrationInspectorActivity) {
        super(0);
        this.f111130b = integrationInspectorActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new z60(this.f111130b.getApplicationContext());
    }
}
