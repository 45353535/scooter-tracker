package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.RtspMessageUtil;

/* JADX INFO: loaded from: classes7.dex */
final class RtspSetupResponse {
    public final RtspMessageUtil.RtspSessionHeader sessionHeader;
    public final int status;
    public final String transport;

    public RtspSetupResponse(int i10, RtspMessageUtil.RtspSessionHeader rtspSessionHeader, String str) {
        this.status = i10;
        this.sessionHeader = rtspSessionHeader;
        this.transport = str;
    }
}
