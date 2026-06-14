package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class DataSourceException extends IOException {
    public static final int POSITION_OUT_OF_RANGE = 0;
    public final int reason;

    public DataSourceException(int i10) {
        this.reason = i10;
    }
}
