package com.startapp.sdk.ads.video.tracking;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes11.dex */
public class VideoPausedTrackingParams extends VideoTrackingParams {
    private static final long serialVersionUID = 4019115021800482057L;
    private int pauseNum;
    private PauseOrigin pauseOrigin;

    @Keep
    public enum PauseOrigin {
        INAPP,
        EXTERNAL
    }

    public VideoPausedTrackingParams(String str, int i10, int i11, int i12, PauseOrigin pauseOrigin, String str2) {
        super(i10, i11, str, str2);
        this.pauseNum = i12;
        this.pauseOrigin = pauseOrigin;
    }

    @Override // com.startapp.sdk.ads.video.tracking.VideoTrackingParams, com.startapp.sdk.adsbase.commontracking.TrackingParams
    public final String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f());
        sb2.append("&po=" + this.pauseOrigin.toString());
        sb2.append("&pn=" + this.pauseNum);
        sb2.append(h());
        return b(sb2.toString());
    }
}
