package com.google.firebase.installations;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public class RandomFidGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte f32864a = Byte.parseByte("01110000", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte f32865b = Byte.parseByte("00001111", 2);

    private static String a(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    private static byte[] b(UUID uuid, byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        return byteBufferWrap.array();
    }

    @NonNull
    public String createRandomFid() {
        byte[] bArrB = b(UUID.randomUUID(), new byte[17]);
        byte b10 = bArrB[0];
        bArrB[16] = b10;
        bArrB[0] = (byte) ((b10 & f32865b) | f32864a);
        return a(bArrB);
    }
}
