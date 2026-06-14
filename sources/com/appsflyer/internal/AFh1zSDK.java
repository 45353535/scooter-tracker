package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class AFh1zSDK extends AFh1ySDK {

    @NotNull
    private final AFc1bSDK getRevenue;

    public AFh1zSDK(@NotNull AFc1bSDK aFc1bSDK) {
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        this.getRevenue = aFc1bSDK;
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th2, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        if (z12) {
            if (StringsKt.y0(str)) {
                str = "missing label";
            }
            this.getRevenue.afWarnLog().getRevenue(th2, withTag$SDK_prodRelease(str, aFg1cSDK));
        }
    }
}
