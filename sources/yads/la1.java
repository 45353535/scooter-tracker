package yads;

import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class la1 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntegrationInspectorActivity f113022b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la1(IntegrationInspectorActivity integrationInspectorActivity) {
        super(0);
        this.f113022b = integrationInspectorActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new b90(this.f113022b);
    }
}
