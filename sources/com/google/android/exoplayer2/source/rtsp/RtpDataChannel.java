package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.rtsp.RtspMessageChannel;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
interface RtpDataChannel extends DataSource {

    public interface Factory {
        RtpDataChannel createAndOpenDataChannel(int i10) throws IOException;

        @Nullable
        Factory createFallbackDataChannelFactory();
    }

    @Nullable
    RtspMessageChannel.InterleavedBinaryDataListener getInterleavedBinaryDataListener();

    int getLocalPort();

    String getTransport();
}
