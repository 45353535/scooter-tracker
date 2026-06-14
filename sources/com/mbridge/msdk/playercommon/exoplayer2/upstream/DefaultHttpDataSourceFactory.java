package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource;

/* JADX INFO: loaded from: classes10.dex */
public final class DefaultHttpDataSourceFactory extends HttpDataSource.BaseFactory {
    private final boolean allowCrossProtocolRedirects;
    private final int connectTimeoutMillis;
    private final TransferListener<? super DataSource> listener;
    private final int readTimeoutMillis;
    private final String userAgent;

    public DefaultHttpDataSourceFactory(String str) {
        this(str, null);
    }

    public DefaultHttpDataSourceFactory(String str, TransferListener<? super DataSource> transferListener) {
        this(str, transferListener, 8000, 8000, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource.BaseFactory
    public DefaultHttpDataSource createDataSourceInternal(HttpDataSource.RequestProperties requestProperties) {
        return new DefaultHttpDataSource(this.userAgent, null, this.listener, this.connectTimeoutMillis, this.readTimeoutMillis, this.allowCrossProtocolRedirects, requestProperties);
    }

    public DefaultHttpDataSourceFactory(String str, TransferListener<? super DataSource> transferListener, int i10, int i11, boolean z10) {
        this.userAgent = str;
        this.listener = transferListener;
        this.connectTimeoutMillis = i10;
        this.readTimeoutMillis = i11;
        this.allowCrossProtocolRedirects = z10;
    }
}
