package com.startapp.sdk.ads.video.tracking;

import com.startapp.sdk.adsbase.commontracking.TrackingParams;

/* JADX INFO: loaded from: classes11.dex */
public class VideoTrackingParams extends TrackingParams {
    private static final long serialVersionUID = 3395538490475548059L;
    private int completed;
    protected boolean internalParamsIndicator;
    private String replayParameter;
    private boolean shouldAppendOffset;
    private String videoPlayingMode;

    public VideoTrackingParams(int i10, int i11, String str, String str2) {
        super(str);
        a(i11);
        this.completed = i10;
        this.videoPlayingMode = str2;
    }

    public final VideoTrackingParams b(boolean z10) {
        this.internalParamsIndicator = z10;
        return this;
    }

    public final VideoTrackingParams c(boolean z10) {
        this.shouldAppendOffset = z10;
        return this;
    }

    @Override // com.startapp.sdk.adsbase.commontracking.TrackingParams
    public String e() {
        return b(f() + h());
    }

    public String f() {
        return "&cp=" + this.completed;
    }

    public final boolean g() {
        return this.internalParamsIndicator;
    }

    public final String h() {
        return "&vpm=" + this.videoPlayingMode;
    }

    public final String b(String str) {
        if (!this.internalParamsIndicator) {
            return c();
        }
        return super.e() + str;
    }

    public final VideoTrackingParams c(String str) {
        this.replayParameter = str;
        return this;
    }

    @Override // com.startapp.sdk.adsbase.commontracking.TrackingParams
    public final String c() {
        if (this.shouldAppendOffset) {
            String str = this.replayParameter;
            if (str != null) {
                return str.replace("%startapp_replay_count%", String.valueOf(b()));
            }
            return super.c();
        }
        return "";
    }
}
