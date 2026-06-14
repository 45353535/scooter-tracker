package com.ironsource;

import com.ironsource.F;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class H4 extends F {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H4(@NotNull AbstractC4576v0 adUnitData, @NotNull pg waterfallInstances) {
        super(adUnitData, waterfallInstances);
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
    }

    @Override // com.ironsource.F
    public void a(@NotNull AbstractC4643z instance, @NotNull F.b loadSelection) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(loadSelection, "loadSelection");
        IronLog.INTERNAL.verbose(instance.d().name() + " - Instance " + instance.q() + " is ready to load");
        loadSelection.a().add(instance);
    }
}
