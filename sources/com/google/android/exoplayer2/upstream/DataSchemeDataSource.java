package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes7.dex */
public final class DataSchemeDataSource extends BaseDataSource {
    public static final String SCHEME_DATA = "data";
    private int bytesRemaining;

    @Nullable
    private byte[] data;

    @Nullable
    private DataSpec dataSpec;
    private int readPosition;

    public DataSchemeDataSource() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        if (this.data != null) {
            this.data = null;
            transferEnded();
        }
        this.dataSpec = null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        transferInitializing(dataSpec);
        this.dataSpec = dataSpec;
        Uri uri = dataSpec.uri;
        String scheme = uri.getScheme();
        Assertions.checkArgument("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrSplit = Util.split(uri.getSchemeSpecificPart(), StringUtils.COMMA);
        if (strArrSplit.length != 2) {
            throw ParserException.createForMalformedDataOfUnknownType("Unexpected URI format: " + uri, null);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.data = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw ParserException.createForMalformedDataOfUnknownType("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.data = Util.getUtf8Bytes(URLDecoder.decode(str, Charsets.US_ASCII.name()));
        }
        long j10 = dataSpec.position;
        byte[] bArr = this.data;
        if (j10 > bArr.length) {
            this.data = null;
            throw new DataSourceException(2008);
        }
        int i10 = (int) j10;
        this.readPosition = i10;
        int length = bArr.length - i10;
        this.bytesRemaining = length;
        long j11 = dataSpec.length;
        if (j11 != -1) {
            this.bytesRemaining = (int) Math.min(length, j11);
        }
        transferStarted(dataSpec);
        long j12 = dataSpec.length;
        return j12 != -1 ? j12 : this.bytesRemaining;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.bytesRemaining;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(Util.castNonNull(this.data), this.readPosition, bArr, i10, iMin);
        this.readPosition += iMin;
        this.bytesRemaining -= iMin;
        bytesTransferred(iMin);
        return iMin;
    }
}
