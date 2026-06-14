package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes9.dex */
@Beta
@ElementTypesAreNonnullByDefault
public final class HashingOutputStream extends FilterOutputStream implements AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Hasher f30770b;

    public HashingOutputStream(HashFunction hashFunction, OutputStream outputStream) {
        super((OutputStream) Preconditions.checkNotNull(outputStream));
        this.f30770b = (Hasher) Preconditions.checkNotNull(hashFunction.newHasher());
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    public HashCode hash() {
        return this.f30770b.hash();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f30770b.putByte((byte) i10);
        ((FilterOutputStream) this).out.write(i10);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f30770b.putBytes(bArr, i10, i11);
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
    }
}
