package com.mbridge.msdk.config.component.load.downloader.resource.stream;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public interface a {
    void close() throws IOException;

    void flushAndSync() throws IOException;

    void seek(long j10) throws IllegalAccessException, IOException;

    void write(byte[] bArr, int i10, int i11) throws IOException;
}
