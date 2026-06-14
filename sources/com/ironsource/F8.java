package com.ironsource;

import android.app.Activity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public interface F8 {

    public interface a {
        void onNativeAdClicked();

        void onNativeAdLoadFailed(@NotNull String str);

        void onNativeAdLoadSuccess(@NotNull D8 d82);

        void onNativeAdShown();
    }

    void a();

    void a(@NotNull Activity activity, @NotNull JSONObject jSONObject);

    void a(@Nullable a aVar);

    void a(@NotNull G8 g82);

    @Nullable
    a b();

    @Nullable
    D8 c();
}
