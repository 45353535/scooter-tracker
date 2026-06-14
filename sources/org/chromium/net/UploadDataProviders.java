package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes4.dex */
public final class UploadDataProviders {

    static class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f97902a;

        a(File file) {
            this.f97902a = file;
        }

        @Override // org.chromium.net.UploadDataProviders.d
        public FileChannel m() {
            return new FileInputStream(this.f97902a).getChannel();
        }
    }

    static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptor f97903a;

        b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f97903a = parcelFileDescriptor;
        }

        @Override // org.chromium.net.UploadDataProviders.d
        public FileChannel m() throws IOException {
            if (this.f97903a.getStatSize() != -1) {
                return new ParcelFileDescriptor.AutoCloseInputStream(this.f97903a).getChannel();
            }
            this.f97903a.close();
            throw new IllegalArgumentException("Not a file: " + this.f97903a);
        }
    }

    private static final class c extends UploadDataProvider {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ByteBuffer f97904b;

        /* synthetic */ c(ByteBuffer byteBuffer, a aVar) {
            this(byteBuffer);
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return this.f97904b.limit();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            if (byteBuffer.remaining() >= this.f97904b.remaining()) {
                byteBuffer.put(this.f97904b);
            } else {
                int iLimit = this.f97904b.limit();
                ByteBuffer byteBuffer2 = this.f97904b;
                byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
                byteBuffer.put(this.f97904b);
                this.f97904b.limit(iLimit);
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            this.f97904b.position(0);
            uploadDataSink.onRewindSucceeded();
        }

        private c(ByteBuffer byteBuffer) {
            this.f97904b = byteBuffer;
        }
    }

    private interface d {
        FileChannel m();
    }

    private static final class e extends UploadDataProvider {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile FileChannel f97905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f97906c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f97907d;

        /* synthetic */ e(d dVar, a aVar) {
            this(dVar);
        }

        private FileChannel m() {
            if (this.f97905b == null) {
                synchronized (this.f97907d) {
                    try {
                        if (this.f97905b == null) {
                            this.f97905b = this.f97906c.m();
                        }
                    } finally {
                    }
                }
            }
            return this.f97905b;
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            FileChannel fileChannel = this.f97905b;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return m().size();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            FileChannel fileChannelM = m();
            int i10 = 0;
            while (i10 == 0) {
                int i11 = fileChannelM.read(byteBuffer);
                if (i11 == -1) {
                    break;
                } else {
                    i10 += i11;
                }
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) throws IOException {
            m().position(0L);
            uploadDataSink.onRewindSucceeded();
        }

        private e(d dVar) {
            this.f97907d = new Object();
            this.f97906c = dVar;
        }
    }

    private UploadDataProviders() {
    }

    public static UploadDataProvider create(File file) {
        return new e(new a(file), null);
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new e(new b(parcelFileDescriptor), null);
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new c(byteBuffer.slice(), null);
    }

    public static UploadDataProvider create(byte[] bArr, int i10, int i11) {
        return new c(ByteBuffer.wrap(bArr, i10, i11).slice(), null);
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }
}
