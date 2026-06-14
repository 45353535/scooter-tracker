package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface AdapterAdInteractionListener extends AdapterAdListener {
    void onAdClosed();

    void onAdClosed(@NotNull Map<String, Object> map);

    void onAdEnded();

    void onAdEnded(@NotNull Map<String, Object> map);

    void onAdStarted();

    void onAdStarted(@NotNull Map<String, Object> map);

    void onAdVisible();

    void onAdVisible(@NotNull Map<String, Object> map);
}
