package io.bidmachine.analytics.internal.c;

import io.bidmachine.analytics.internal.b.c;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.c.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5635a implements InterfaceC5636b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0948a f79527b = new C0948a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f79528a = "AES";

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.c.a$a, reason: collision with other inner class name */
    public static final class C0948a {
        public /* synthetic */ C0948a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0948a() {
        }
    }

    @Override // io.bidmachine.analytics.internal.c.InterfaceC5636b
    public byte[] a(Key key, byte[] bArr) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrA = c.f79525a.a(12);
        byte[] bArrDoFinal = a(1, key, bArrA).doFinal(bArr);
        byte[] bArr2 = new byte[bArrDoFinal.length + 12];
        ArraysKt.copyInto(bArrA, bArr2, 0, 0, 12);
        ArraysKt.copyInto(bArrDoFinal, bArr2, 12, 0, bArrDoFinal.length);
        return bArr2;
    }

    @Override // io.bidmachine.analytics.internal.c.InterfaceC5636b
    public String getName() {
        return this.f79528a;
    }

    private final Cipher a(int i10, Key key, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(i10, key, gCMParameterSpec);
        return cipher;
    }
}
