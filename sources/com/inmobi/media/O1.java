package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class O1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Yb f37470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37471e;

    public O1(VideoExperience videoExperience, AdConfig.VideoPlayerAudioConfig audioConfig) {
        Yb yb2;
        Yb yb3;
        Intrinsics.checkNotNullParameter(videoExperience, "videoExperience");
        Intrinsics.checkNotNullParameter(audioConfig, "audioConfig");
        Boolean startMuted = videoExperience.getAudio().getStartMuted();
        this.f37467a = startMuted != null ? startMuted.booleanValue() : audioConfig.getStartMuted();
        Integer muteIconWidth = videoExperience.getAudio().getMuteIconWidth();
        this.f37468b = muteIconWidth != null ? muteIconWidth.intValue() : audioConfig.getMuteIconWidth();
        Integer muteIconHeight = videoExperience.getAudio().getMuteIconHeight();
        this.f37469c = muteIconHeight != null ? muteIconHeight.intValue() : audioConfig.getMuteIconHeight();
        int[] muteIconMargin = videoExperience.getAudio().getMuteIconMargin();
        if (muteIconMargin != null) {
            Intrinsics.checkNotNullParameter(muteIconMargin, "<this>");
            if (muteIconMargin.length != 4) {
                yb3 = new Yb(0, 0, 0, 0);
            } else {
                yb2 = new Yb(muteIconMargin[0], muteIconMargin[1], muteIconMargin[2], muteIconMargin[3]);
                yb3 = yb2;
            }
        } else {
            List<Integer> muteIconMargin2 = audioConfig.getMuteIconMargin();
            Intrinsics.checkNotNullParameter(muteIconMargin2, "<this>");
            if (muteIconMargin2.size() != 4) {
                yb3 = new Yb(0, 0, 0, 0);
            } else {
                yb2 = new Yb(muteIconMargin2.get(0).intValue(), muteIconMargin2.get(1).intValue(), muteIconMargin2.get(2).intValue(), muteIconMargin2.get(3).intValue());
                yb3 = yb2;
            }
        }
        this.f37470d = yb3;
        Integer muteIconPosition = videoExperience.getAudio().getMuteIconPosition();
        this.f37471e = muteIconPosition != null ? muteIconPosition.intValue() : audioConfig.getMuteIconPosition();
    }
}
