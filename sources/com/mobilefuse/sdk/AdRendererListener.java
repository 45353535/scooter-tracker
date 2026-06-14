package com.mobilefuse.sdk;

import com.mobilefuse.sdk.internal.RtbLossReason;

/* JADX INFO: loaded from: classes10.dex */
public interface AdRendererListener {
    void onAdClicked(String str) throws Throwable;

    void onAdClosed() throws Throwable;

    void onAdImpression() throws Throwable;

    void onAdRuntimeError(RtbLossReason rtbLossReason) throws Throwable;

    void onFullscreenChanged(boolean z10) throws Throwable;

    void onPreloadStatusChange(boolean z10) throws Throwable;
}
