package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class ByteArrayDataSource extends BaseDataSource {
    private int bytesRemaining;
    private final byte[] data;
    private boolean opened;
    private int readPosition;

    @Nullable
    private Uri uri;

    public ByteArrayDataSource(byte[] bArr) {
        super(false);
        Assertions.checkNotNull(bArr);
        Assertions.checkArgument(bArr.length > 0);
        this.data = bArr;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        if (this.opened) {
            this.opened = false;
            transferEnded();
        }
        this.uri = null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return this.uri;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        this.uri = dataSpec.uri;
        transferInitializing(dataSpec);
        long j10 = dataSpec.position;
        byte[] bArr = this.data;
        if (j10 > bArr.length) {
            throw new DataSourceException(2008);
        }
        this.readPosition = (int) j10;
        int length = bArr.length - ((int) j10);
        this.bytesRemaining = length;
        long j11 = dataSpec.length;
        if (j11 != -1) {
            this.bytesRemaining = (int) Math.min(length, j11);
        }
        this.opened = true;
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
        System.arraycopy(this.data, this.readPosition, bArr, i10, iMin);
        this.readPosition += iMin;
        this.bytesRemaining -= iMin;
        bytesTransferred(iMin);
        return iMin;
    }
}
