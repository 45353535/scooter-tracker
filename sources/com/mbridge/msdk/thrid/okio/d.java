package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes10.dex */
public interface d extends r, WritableByteChannel {
    c a();

    d a(long j10) throws IOException;

    d a(String str) throws IOException;

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    void flush() throws IOException;

    d write(byte[] bArr) throws IOException;

    d write(byte[] bArr, int i10, int i11) throws IOException;

    d writeByte(int i10) throws IOException;

    d writeInt(int i10) throws IOException;

    d writeShort(int i10) throws IOException;
}
