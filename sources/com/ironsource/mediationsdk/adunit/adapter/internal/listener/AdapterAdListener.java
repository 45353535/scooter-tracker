package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface AdapterAdListener {
    void onAdClicked();

    void onAdClicked(@NotNull Map<String, Object> map);

    void onAdLoadFailed(@NotNull AdapterErrorType adapterErrorType, int i10, String str);

    void onAdLoadFailed(@NotNull AdapterErrorType adapterErrorType, int i10, String str, @NotNull Map<String, Object> map);

    void onAdLoadSuccess();

    void onAdLoadSuccess(@NotNull Map<String, Object> map);

    void onAdOpened();

    void onAdOpened(@NotNull Map<String, Object> map);

    void onAdShowFailed(int i10, String str);

    void onAdShowFailed(int i10, String str, @NotNull Map<String, Object> map);
}
