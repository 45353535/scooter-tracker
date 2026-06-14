package com.pubmatic.sdk.openwrap.interstitial;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.ui.POBInterstitialRendering;
import com.pubmatic.sdk.openwrap.core.POBBaseEvent;
import com.pubmatic.sdk.openwrap.core.POBFullScreenAdInteractionListener;

/* JADX INFO: loaded from: classes11.dex */
public abstract class POBInterstitialEvent extends POBBaseEvent {
    @Nullable
    public POBFullScreenAdInteractionListener getAdInteractionListener() {
        return null;
    }

    @Nullable
    public POBInterstitialRendering getRenderer(@Nullable String str) {
        return null;
    }

    public abstract void setEventListener(@NonNull POBInterstitialEventListener pOBInterstitialEventListener);

    @MainThread
    public void show() {
    }
}
