package com.mobilefuse.sdk.omid;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public interface VastOmidBridge extends OmidBridge {
    void adUserInteractionClick() throws Throwable;

    void complete() throws Throwable;

    void firstQuartile() throws Throwable;

    Set<String> getRegisteredVerificationVendors() throws Throwable;

    @Nullable
    View getVideoView() throws Throwable;

    void initAdSession(Context context, View view) throws Throwable;

    void midpoint() throws Throwable;

    void mute() throws Throwable;

    void onPlayerStateNormal() throws Throwable;

    void pause() throws Throwable;

    void registerVerificationScript(@Nullable String str, @NonNull String str2, @Nullable String str3) throws Throwable;

    void resume() throws Throwable;

    void setAdSessionInitCompleteListener(@NonNull Runnable runnable) throws Throwable;

    void setCompleteListener(@NonNull Runnable runnable) throws Throwable;

    void signalAdLoadedEvent(boolean z10, float f10, boolean z11) throws Throwable;

    void skipped() throws Throwable;

    void start(float f10, float f11) throws Throwable;

    void thirdQuartile() throws Throwable;

    void unmute() throws Throwable;
}
