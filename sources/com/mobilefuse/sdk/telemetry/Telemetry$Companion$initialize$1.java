package com.mobilefuse.sdk.telemetry;

import com.mobilefuse.sdk.telemetry.Telemetry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "p1", "", "p2", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 4, 3})
final /* synthetic */ class Telemetry$Companion$initialize$1 extends y implements Function2<Object, Throwable, Unit> {
    Telemetry$Companion$initialize$1(Telemetry.Companion companion) {
        super(2, companion, Telemetry.Companion.class, "logException", "logException(Ljava/lang/Object;Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th2) {
        invoke2(obj, th2);
        return Unit.f93236a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Object p12, @NotNull Throwable p22) {
        Intrinsics.checkNotNullParameter(p12, "p1");
        Intrinsics.checkNotNullParameter(p22, "p2");
        ((Telemetry.Companion) this.receiver).logException(p12, p22);
    }
}
