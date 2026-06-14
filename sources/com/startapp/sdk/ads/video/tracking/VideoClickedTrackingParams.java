package com.startapp.sdk.ads.video.tracking;

/* JADX INFO: loaded from: classes11.dex */
public class VideoClickedTrackingParams extends VideoTrackingParams {
    private static final long serialVersionUID = 940417627850369979L;
    private boolean isVideoFinished;

    public VideoClickedTrackingParams(String str, int i10, int i11, boolean z10, String str2) {
        super(i10, i11, str, str2);
        this.isVideoFinished = z10;
    }

    @Override // com.startapp.sdk.ads.video.tracking.VideoTrackingParams, com.startapp.sdk.adsbase.commontracking.TrackingParams
    public final String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f());
        sb2.append("&co=".concat(this.isVideoFinished ? "POSTROLL" : "VIDEO"));
        sb2.append(h());
        return b(sb2.toString());
    }
}
