package net.pubnative.lite.sdk.utils;

import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.vpaid.enums.AudioState;

/* JADX INFO: loaded from: classes3.dex */
public class AdAudioStateManager {
    public static AudioState getAudioState(Ad ad2, boolean z10) {
        return z10 ? (ad2 == null || ad2.getAudioState() == null || AudioState.fromString(ad2.getAudioState()) == null) ? HyBid.getVideoAudioStatus() : AudioState.fromString(ad2.getAudioState()) : AudioState.MUTED;
    }
}
