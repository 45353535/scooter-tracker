package com.mobilefuse.sdk.telemetry;

import com.mobilefuse.sdk.telemetry.TelemetryManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "p1", "p2", "", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 4, 3})
final /* synthetic */ class Telemetry$Companion$initialize$2 extends y implements Function2<String, String, Unit> {
    Telemetry$Companion$initialize$2(TelemetryManager.Companion companion) {
        super(2, companion, TelemetryManager.Companion.class, "registerVariable", "registerVariable(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.f93236a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String p12, @NotNull String p22) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        Intrinsics.checkNotNullParameter(p22, "p2");
        ((TelemetryManager.Companion) this.receiver).registerVariable(p12, p22);
    }
}
