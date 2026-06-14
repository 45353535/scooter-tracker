package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import android.view.View;
import android.widget.FrameLayout;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface AdapterAdViewListener extends AdapterAdListener {
    void onAdLeftApplication();

    void onAdLeftApplication(Map<String, Object> map);

    void onAdLoadSuccess(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams);

    void onAdLoadSuccess(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams, Map<String, Object> map);

    void onAdScreenDismissed();

    void onAdScreenDismissed(Map<String, Object> map);

    void onAdScreenPresented();

    void onAdScreenPresented(Map<String, Object> map);
}
