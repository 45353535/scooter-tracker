package com.explorestack.protobuf;

import com.appsflyer.AppsFlyerProperties;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes7.dex */
abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f19121a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f19122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f19123c;

    static {
        Class clsE = e("java.io.FileOutputStream");
        f19122b = clsE;
        f19123c = b(clsE);
    }

    private static byte[] a() {
        SoftReference softReference = (SoftReference) f19121a.get();
        if (softReference == null) {
            return null;
        }
        return (byte[]) softReference.get();
    }

    private static long b(Class cls) {
        if (cls == null) {
            return -1L;
        }
        try {
            if (w2.J()) {
                return w2.M(cls.getDeclaredField(AppsFlyerProperties.CHANNEL));
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    private static byte[] c(int i10) {
        int iMax = Math.max(i10, 1024);
        byte[] bArrA = a();
        if (bArrA != null && !d(iMax, bArrA.length)) {
            return bArrA;
        }
        byte[] bArr = new byte[iMax];
        if (iMax <= 16384) {
            f(bArr);
        }
        return bArr;
    }

    private static boolean d(int i10, int i11) {
        return i11 < i10 && ((float) i11) < ((float) i10) * 0.5f;
    }

    private static Class e(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static void f(byte[] bArr) {
        f19121a.set(new SoftReference(bArr));
    }

    static void g(ByteBuffer byteBuffer, OutputStream outputStream) {
        int iPosition = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!h(byteBuffer, outputStream)) {
                byte[] bArrC = c(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int iMin = Math.min(byteBuffer.remaining(), bArrC.length);
                    byteBuffer.get(bArrC, 0, iMin);
                    outputStream.write(bArrC, 0, iMin);
                }
            }
            byteBuffer.position(iPosition);
        } catch (Throwable th2) {
            byteBuffer.position(iPosition);
            throw th2;
        }
    }

    private static boolean h(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        WritableByteChannel writableByteChannel;
        long j10 = f19123c;
        if (j10 < 0 || !f19122b.isInstance(outputStream)) {
            return false;
        }
        try {
            writableByteChannel = (WritableByteChannel) w2.G(outputStream, j10);
        } catch (ClassCastException unused) {
            writableByteChannel = null;
        }
        if (writableByteChannel == null) {
            return false;
        }
        writableByteChannel.write(byteBuffer);
        return true;
    }
}
