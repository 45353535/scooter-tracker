package com.pubmatic.sdk.common.base;

import android.view.View;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;

/* JADX INFO: loaded from: classes11.dex */
@MainThread
public interface POBAdRendererListener {
    void onAdExpired();

    void onAdImpression();

    void onAdInteractionStarted();

    void onAdInteractionStopped();

    void onAdReadyToRefresh(int i10);

    void onAdRender(@NonNull View view, @Nullable POBAdDescriptor pOBAdDescriptor);

    void onAdRenderingFailed(@NonNull POBError pOBError);

    void onAdUnload();

    void onLeavingApplication();

    void onRenderAdClick();

    void onRenderProcessGone();
}
