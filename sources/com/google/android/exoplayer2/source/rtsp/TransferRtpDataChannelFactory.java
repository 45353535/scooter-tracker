package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.RtpDataChannel;

/* JADX INFO: loaded from: classes7.dex */
final class TransferRtpDataChannelFactory implements RtpDataChannel.Factory {
    private static final int INTERLEAVED_CHANNELS_PER_TRACK = 2;
    private final long timeoutMs;

    public TransferRtpDataChannelFactory(long j10) {
        this.timeoutMs = j10;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel.Factory
    public RtpDataChannel createAndOpenDataChannel(int i10) {
        TransferRtpDataChannel transferRtpDataChannel = new TransferRtpDataChannel(this.timeoutMs);
        transferRtpDataChannel.open(RtpUtils.getIncomingRtpDataSpec(i10 * 2));
        return transferRtpDataChannel;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel.Factory
    public /* synthetic */ RtpDataChannel.Factory createFallbackDataChannelFactory() {
        return a.a(this);
    }
}
