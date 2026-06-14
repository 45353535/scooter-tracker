package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public interface AFg1sSDK {

    public static final class AFa1uSDK {

        @Nullable
        final String AFAdRevenueData;
        final float getRevenue;

        public AFa1uSDK(float f10, @Nullable String str) {
            this.getRevenue = f10;
            this.AFAdRevenueData = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1uSDK)) {
                return false;
            }
            AFa1uSDK aFa1uSDK = (AFa1uSDK) obj;
            return Float.compare(this.getRevenue, aFa1uSDK.getRevenue) == 0 && Intrinsics.areEqual(this.AFAdRevenueData, aFa1uSDK.AFAdRevenueData);
        }

        public final int hashCode() {
            int iFloatToIntBits = Float.floatToIntBits(this.getRevenue) * 31;
            String str = this.AFAdRevenueData;
            return iFloatToIntBits + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            return "BatteryData(level=" + this.getRevenue + ", charging=" + this.AFAdRevenueData + ")";
        }
    }

    @NotNull
    AFa1uSDK AFAdRevenueData(@NotNull Context context);
}
