package com.appsflyer.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class AFh1wSDK extends AFh1ySDK {

    @NotNull
    private final AFc1bSDK getCurrencyIso4217Code;
    private final boolean getRevenue;

    public AFh1wSDK(@NotNull AFc1bSDK aFc1bSDK) {
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        this.getCurrencyIso4217Code = aFc1bSDK;
        this.getRevenue = true;
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void d(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z10) {
            this.getCurrencyIso4217Code.equals().getRevenue("D", getRevenue(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th2, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        if (z13) {
            this.getCurrencyIso4217Code.equals().getRevenue(ExifInterface.LONGITUDE_EAST, getRevenue(str, aFg1cSDK));
        }
        if (z13) {
            this.getCurrencyIso4217Code.equals().getMonetizationNetwork(th2);
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void force(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.getCurrencyIso4217Code.equals().getRevenue("F", getRevenue(str, aFg1cSDK));
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final boolean getShouldExtendMsg() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void i(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z10) {
            this.getCurrencyIso4217Code.equals().getRevenue("I", getRevenue(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void v(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z10) {
            this.getCurrencyIso4217Code.equals().getRevenue(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, getRevenue(str, aFg1cSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1ySDK
    public final void w(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z10) {
            this.getCurrencyIso4217Code.equals().getRevenue(ExifInterface.LONGITUDE_WEST, getRevenue(str, aFg1cSDK));
        }
    }
}
