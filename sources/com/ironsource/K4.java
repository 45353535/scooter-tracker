package com.ironsource;

import com.ironsource.AbstractC4478p3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class K4<Smash extends AbstractC4478p3<?>> extends xg<Smash> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K4(int i10, boolean z10, @NotNull List<? extends Smash> waterfall) {
        super(i10, z10, waterfall);
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
    }

    @Override // com.ironsource.xg
    public void c(@NotNull Smash smash) {
        Intrinsics.checkNotNullParameter(smash, "smash");
        IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.k() + " is ready to load");
        smash.a(true);
        c().add(smash);
    }
}
