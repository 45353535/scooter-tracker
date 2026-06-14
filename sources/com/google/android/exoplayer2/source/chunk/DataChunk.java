package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceUtil;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DataChunk extends Chunk {
    private static final int READ_GRANULARITY = 16384;
    private byte[] data;
    private volatile boolean loadCanceled;

    public DataChunk(DataSource dataSource, DataSpec dataSpec, int i10, Format format, int i11, @Nullable Object obj, @Nullable byte[] bArr) {
        super(dataSource, dataSpec, i10, format, i11, obj, -9223372036854775807L, -9223372036854775807L);
        this.data = bArr == null ? Util.EMPTY_BYTE_ARRAY : bArr;
    }

    private void maybeExpandData(int i10) {
        byte[] bArr = this.data;
        if (bArr.length < i10 + 16384) {
            this.data = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void cancelLoad() {
        this.loadCanceled = true;
    }

    protected abstract void consume(byte[] bArr, int i10) throws IOException;

    public byte[] getDataHolder() {
        return this.data;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void load() throws IOException {
        try {
            this.dataSource.open(this.dataSpec);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.loadCanceled) {
                maybeExpandData(i11);
                i10 = this.dataSource.read(this.data, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.loadCanceled) {
                consume(this.data, i11);
            }
            DataSourceUtil.closeQuietly(this.dataSource);
        } catch (Throwable th2) {
            DataSourceUtil.closeQuietly(this.dataSource);
            throw th2;
        }
    }
}
