package com.applovin.shadow.okhttp3.internal.cache2;

import com.applovin.shadow.okio.Buffer;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u001e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/cache2/FileOperator;", "", "fileChannel", "Ljava/nio/channels/FileChannel;", "(Ljava/nio/channels/FileChannel;)V", "read", "", POBCTAOverlayData.KEY_CTA_POS, "", "sink", "Lcom/applovin/shadow/okio/Buffer;", "byteCount", "write", "source", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FileOperator {

    @NotNull
    private final FileChannel fileChannel;

    public FileOperator(@NotNull FileChannel fileChannel) {
        Intrinsics.checkNotNullParameter(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long pos, @NotNull Buffer sink, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount < 0) {
            throw new IndexOutOfBoundsException();
        }
        long j10 = pos;
        long j11 = byteCount;
        while (j11 > 0) {
            long jTransferTo = this.fileChannel.transferTo(j10, j11, sink);
            j10 += jTransferTo;
            j11 -= jTransferTo;
        }
    }

    public final void write(long pos, @NotNull Buffer source, long byteCount) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (byteCount < 0 || byteCount > source.size()) {
            throw new IndexOutOfBoundsException();
        }
        long j10 = pos;
        long j11 = byteCount;
        while (j11 > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(source, j10, j11);
            j10 += jTransferFrom;
            j11 -= jTransferFrom;
        }
    }
}
