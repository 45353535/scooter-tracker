package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class AFc1qSDK implements AFc1oSDK {

    @NotNull
    private final Lazy getCurrencyIso4217Code;

    @NotNull
    private final AFc1hSDK<SharedPreferences> getRevenue;

    public AFc1qSDK(@NotNull AFc1hSDK<SharedPreferences> aFc1hSDK) {
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        this.getRevenue = aFc1hSDK;
        this.getCurrencyIso4217Code = lf.i.a(new Function0<SharedPreferences>() { // from class: com.appsflyer.internal.AFc1qSDK.4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: m_, reason: merged with bridge method [inline-methods] */
            public final SharedPreferences invoke() {
                return (SharedPreferences) AFc1qSDK.this.getRevenue.getRevenue.invoke();
            }
        });
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final void AFAdRevenueData(@Nullable String str, @Nullable String str2) {
        ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final void getCurrencyIso4217Code(@Nullable String str, boolean z10) {
        ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).edit().putBoolean(str, z10).apply();
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    @Nullable
    public final String getMonetizationNetwork(@Nullable String str, @Nullable String str2) {
        try {
            return ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).getString(str, str2);
        } catch (ClassCastException e10) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key " + str, e10, false, false, false, false, 120, null);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final void getRevenue(@Nullable String str, long j10) {
        ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).edit().putLong(str, j10).apply();
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final boolean getMediationNetwork(@Nullable String str, boolean z10) {
        try {
            return ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).getBoolean(str, z10);
        } catch (ClassCastException e10) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key " + str, e10, false, false, false, false, 120, null);
            return z10;
        }
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final long getCurrencyIso4217Code(@Nullable String str, long j10) {
        try {
            return ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).getLong(str, j10);
        } catch (ClassCastException e10) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key " + str, e10, false, false, false, false, 120, null);
            return j10;
        }
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final void getRevenue(@Nullable String str, int i10) {
        ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).edit().putInt(str, i10).apply();
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final int getMediationNetwork(@Nullable String str, int i10) {
        try {
            return ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).getInt(str, i10);
        } catch (ClassCastException e10) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key " + str, e10, false, false, false, false, 120, null);
            return i10;
        }
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final boolean getRevenue(@Nullable String str) {
        return ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).contains(str);
    }

    @Override // com.appsflyer.internal.AFc1oSDK
    public final void getCurrencyIso4217Code(@Nullable String str) {
        ((SharedPreferences) this.getCurrencyIso4217Code.getValue()).edit().remove(str).apply();
    }
}
