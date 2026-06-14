package com.mbridge.msdk.playercommon.exoplayer2.upstream;

/* JADX INFO: loaded from: classes10.dex */
public interface TransferListener<S> {
    void onBytesTransferred(S s10, int i10);

    void onTransferEnd(S s10);

    void onTransferStart(S s10, DataSpec dataSpec);
}
