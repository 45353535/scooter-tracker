package com.inmobi.ads.controllers;

import androidx.annotation.Keep;
import androidx.annotation.UiThread;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C3740gk;
import com.inmobi.media.Qg;
import com.inmobi.media.V1;
import com.ironsource.Df;
import com.taurusx.tax.f.y;
import com.taurusx.tax.y.z.w.s;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0006\b'\u0018\u0000 92\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H&¢\u0006\u0004\b\u0012\u0010\u0003J#\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u0019\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H&¢\u0006\u0004\b\u001c\u0010\u0003J#\u0010\u001e\u001a\u00020\u00062\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u0016J\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010\u0003J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010\fJ\u0017\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104R\u0014\u00108\u001a\u0002058&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006;"}, d2 = {"Lcom/inmobi/ads/controllers/PublisherCallbacks;", "", "<init>", "()V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "", "onAdFetchSuccessful", "(Lcom/inmobi/ads/AdMetaInfo;)V", "Lcom/inmobi/ads/InMobiAdRequestStatus;", "status", "onAdFetchFailed", "(Lcom/inmobi/ads/InMobiAdRequestStatus;)V", "onAdLoadSucceeded", Df.f40641b, "onAdWillDisplay", "onAdDisplayed", "onAdDisplayFailed", "onAdDismissed", "", "params", Df.f40645f, "(Ljava/util/Map;)V", "onAdImpressed", "Lcom/inmobi/media/gk;", "telemetryOnAdImpression", "onAdImpression", "(Lcom/inmobi/media/gk;)V", "onUserLeftApplication", "rewards", "onRewardsUnlocked", "onVideoStarted", "onVideoResumed", "onVideoPaused", "onVideoCompleted", "", "isMuted", "onAudioStateChanged", "(Z)V", "", "request", "onRequestPayloadCreated", "([B)V", "reason", "onRequestPayloadCreationFailed", "Lcom/inmobi/media/V1;", "audioStatusInternal", "onAudioStatusChanged", "(Lcom/inmobi/media/V1;)V", "", s.z.f67719y, "onImraidLog", "(Ljava/lang/String;)V", "", "getType", "()B", "type", y.f66058y, "com/inmobi/media/Qg", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@UiThread
public abstract class PublisherCallbacks {

    @NotNull
    public static final Qg Companion = new Qg();
    public static final byte NORMAL_FLOW = 0;
    public static final byte PRELOAD_FLOW = 1;

    public abstract byte getType();

    public abstract void onAdClicked(@NotNull Map<Object, ? extends Object> params);

    public abstract void onAdDismissed();

    public void onAdDisplayFailed() {
    }

    public abstract void onAdDisplayed(@NotNull AdMetaInfo info);

    public abstract void onAdFetchFailed(@NotNull InMobiAdRequestStatus status);

    public void onAdFetchSuccessful(@NotNull AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
    }

    public void onAdImpressed() {
    }

    public void onAdImpression(@Nullable C3740gk telemetryOnAdImpression) {
    }

    public abstract void onAdLoadFailed(@NotNull InMobiAdRequestStatus status);

    public void onAdLoadSucceeded(@NotNull AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
    }

    public void onAdWillDisplay() {
    }

    public void onAudioStateChanged(boolean isMuted) {
    }

    public void onAudioStatusChanged(@NotNull V1 audioStatusInternal) {
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
    }

    public void onImraidLog(@NotNull String log) {
        Intrinsics.checkNotNullParameter(log, "log");
    }

    public void onRequestPayloadCreated(@NotNull byte[] request) {
        Intrinsics.checkNotNullParameter(request, "request");
    }

    public void onRequestPayloadCreationFailed(@NotNull InMobiAdRequestStatus reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
    }

    public void onRewardsUnlocked(@NotNull Map<Object, ? extends Object> rewards) {
        Intrinsics.checkNotNullParameter(rewards, "rewards");
    }

    public abstract void onUserLeftApplication();

    public void onVideoCompleted() {
    }

    public void onVideoPaused() {
    }

    public void onVideoResumed() {
    }

    public void onVideoStarted() {
    }
}
