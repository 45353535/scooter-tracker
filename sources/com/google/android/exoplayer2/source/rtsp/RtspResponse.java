package com.google.android.exoplayer2.source.rtsp;

/* JADX INFO: loaded from: classes7.dex */
final class RtspResponse {
    public final RtspHeaders headers;
    public final String messageBody;
    public final int status;

    public RtspResponse(int i10, RtspHeaders rtspHeaders, String str) {
        this.status = i10;
        this.headers = rtspHeaders;
        this.messageBody = str;
    }

    public RtspResponse(int i10, RtspHeaders rtspHeaders) {
        this(i10, rtspHeaders, "");
    }
}
