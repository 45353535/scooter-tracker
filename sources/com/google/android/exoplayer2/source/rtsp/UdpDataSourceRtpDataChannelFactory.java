package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.RtpDataChannel;
import com.google.android.exoplayer2.upstream.DataSourceUtil;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
final class UdpDataSourceRtpDataChannelFactory implements RtpDataChannel.Factory {
    private final long socketTimeoutMs;

    public UdpDataSourceRtpDataChannelFactory(long j10) {
        this.socketTimeoutMs = j10;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel.Factory
    public RtpDataChannel createAndOpenDataChannel(int i10) throws IOException {
        UdpDataSourceRtpDataChannel udpDataSourceRtpDataChannel = new UdpDataSourceRtpDataChannel(this.socketTimeoutMs);
        UdpDataSourceRtpDataChannel udpDataSourceRtpDataChannel2 = new UdpDataSourceRtpDataChannel(this.socketTimeoutMs);
        try {
            udpDataSourceRtpDataChannel.open(RtpUtils.getIncomingRtpDataSpec(0));
            int localPort = udpDataSourceRtpDataChannel.getLocalPort();
            boolean z10 = localPort % 2 == 0;
            udpDataSourceRtpDataChannel2.open(RtpUtils.getIncomingRtpDataSpec(z10 ? localPort + 1 : localPort - 1));
            if (z10) {
                udpDataSourceRtpDataChannel.setRtcpChannel(udpDataSourceRtpDataChannel2);
                return udpDataSourceRtpDataChannel;
            }
            udpDataSourceRtpDataChannel2.setRtcpChannel(udpDataSourceRtpDataChannel);
            return udpDataSourceRtpDataChannel2;
        } catch (IOException e10) {
            DataSourceUtil.closeQuietly(udpDataSourceRtpDataChannel);
            DataSourceUtil.closeQuietly(udpDataSourceRtpDataChannel2);
            throw e10;
        }
    }

    @Override // com.google.android.exoplayer2.source.rtsp.RtpDataChannel.Factory
    public RtpDataChannel.Factory createFallbackDataChannelFactory() {
        return new TransferRtpDataChannelFactory(this.socketTimeoutMs);
    }
}
