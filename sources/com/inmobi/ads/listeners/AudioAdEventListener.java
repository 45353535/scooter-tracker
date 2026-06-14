package com.inmobi.ads.listeners;

import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J$\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, d2 = {"Lcom/inmobi/ads/listeners/AudioAdEventListener;", "Lcom/inmobi/ads/listeners/AdEventListener;", "Lcom/inmobi/ads/InMobiAudio;", "<init>", "()V", "onAdFetchFailed", "", "ad", "status", "Lcom/inmobi/ads/InMobiAdRequestStatus;", "onAdDisplayed", "onAdDisplayFailed", "onAdDismissed", "onUserLeftApplication", "onRewardsUnlocked", "rewards", "", "", "onAudioStatusChanged", "audioStatus", "Lcom/inmobi/ads/AudioStatus;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AudioAdEventListener extends AdEventListener<InMobiAudio> {
    public void onAdDismissed(@NotNull InMobiAudio ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
    }

    public void onAdDisplayFailed(@NotNull InMobiAudio ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
    }

    public void onAdDisplayed(@NotNull InMobiAudio ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
    }

    public void onAdFetchFailed(@NotNull InMobiAudio ad2, @NotNull InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(status, "status");
    }

    public void onAudioStatusChanged(@NotNull InMobiAudio ad2, @NotNull AudioStatus audioStatus) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(audioStatus, "audioStatus");
    }

    public void onRewardsUnlocked(@NotNull InMobiAudio ad2, @NotNull Map<Object, ? extends Object> rewards) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(rewards, "rewards");
    }

    public void onUserLeftApplication(@NotNull InMobiAudio ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
    }
}
