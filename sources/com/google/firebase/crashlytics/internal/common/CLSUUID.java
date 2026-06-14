package com.google.firebase.crashlytics.internal.common;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes9.dex */
class CLSUUID {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f31986b = CommonUtils.sha1(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicLong f31987c = new AtomicLong(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31988a;

    CLSUUID() {
        byte[] bArr = new byte[10];
        e(bArr);
        d(bArr);
        c(bArr);
        String strHexify = CommonUtils.hexify(bArr);
        Locale locale = Locale.US;
        this.f31988a = String.format(locale, "%s%s%s%s", strHexify.substring(0, 12), strHexify.substring(12, 16), strHexify.subSequence(16, 20), f31986b.substring(0, 12)).toUpperCase(locale);
    }

    private static byte[] a(long j10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) j10);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    private static byte[] b(long j10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j10);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    private void c(byte[] bArr) {
        byte[] bArrB = b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = bArrB[0];
        bArr[9] = bArrB[1];
    }

    private void d(byte[] bArr) {
        byte[] bArrB = b(f31987c.incrementAndGet());
        bArr[6] = bArrB[0];
        bArr[7] = bArrB[1];
    }

    private void e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] bArrA = a(time / 1000);
        bArr[0] = bArrA[0];
        bArr[1] = bArrA[1];
        bArr[2] = bArrA[2];
        bArr[3] = bArrA[3];
        byte[] bArrB = b(time % 1000);
        bArr[4] = bArrB[0];
        bArr[5] = bArrB[1];
    }

    public String getSessionId() {
        return this.f31988a;
    }

    public String toString() {
        return this.f31988a;
    }
}
