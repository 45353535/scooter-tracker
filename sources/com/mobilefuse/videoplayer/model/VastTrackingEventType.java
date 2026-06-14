package com.mobilefuse.videoplayer.model;

import com.taurusx.tax.f.z;
import kotlin.Metadata;
import net.pubnative.lite.sdk.vpaid.enums.EventConstants;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0018\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastTrackingEventType;", "", "(Ljava/lang/String;I)V", "start", "skip", "midpoint", "firstQuartile", "thirdQuartile", "complete", "pause", "resume", "fullscreen", "exitFullscreen", EventConstants.PLAYER_EXPAND, EventConstants.PLAYER_COLLAPSE, "mute", "unmute", "creativeView", "closeLinear", EventConstants.AD_EXPAND, EventConstants.AD_COLLAPSE, "close", EventConstants.OTHER_AD_INTERACTION, "progress", z.f66064m, "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public enum VastTrackingEventType {
    start,
    skip,
    midpoint,
    firstQuartile,
    thirdQuartile,
    complete,
    pause,
    resume,
    fullscreen,
    exitFullscreen,
    playerExpand,
    playerCollapse,
    mute,
    unmute,
    creativeView,
    closeLinear,
    adExpand,
    adCollapse,
    close,
    otherAdInteraction,
    progress,
    verificationNotExecuted
}
