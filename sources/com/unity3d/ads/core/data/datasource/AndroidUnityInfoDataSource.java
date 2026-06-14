package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.ironsource.C4240b4;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.preferences.AndroidPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\b\u0010\n\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidUnityInfoDataSource;", "", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "prefName", "", "getPlayerPrefId", C4240b4.i.W, "getUnityInstallationId", "getUnityMegaSessionId", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidUnityInfoDataSource {

    @NotNull
    private final String prefName;

    public AndroidUnityInfoDataSource(@NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.prefName = applicationContext.getPackageName() + ".v2.playerprefs";
    }

    private final String getPlayerPrefId(String key) {
        String string = AndroidPreferences.getString(this.prefName, key);
        if (string == null || StringsKt.y0(string)) {
            return null;
        }
        return string;
    }

    @Nullable
    public final String getUnityInstallationId() {
        return getPlayerPrefId(UnityAdsConstants.Preferences.PREF_KEY_UNITY_INSTALLATION_ID);
    }

    @Nullable
    public final String getUnityMegaSessionId() {
        return getPlayerPrefId(UnityAdsConstants.Preferences.PREF_KEY_UNITY_MEGA_SESSION_ID);
    }
}
