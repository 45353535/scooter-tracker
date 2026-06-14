package io.bidmachine.analytics.internal.d;

import io.bidmachine.analytics.internal.e.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.List;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.d.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5637a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f79529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f79530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f79531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f79532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f79533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Key f79534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f79535g;

    public C5637a(byte[] bArr, String str, byte[] bArr2, boolean z10) {
        this.f79529a = bArr;
        this.f79530b = str;
        this.f79531c = bArr2;
        this.f79532d = z10;
        KeyPair keyPairA = new io.bidmachine.analytics.internal.f.a().a();
        this.f79533e = keyPairA.getPublic().getEncoded();
        this.f79534f = keyPairA.getPrivate();
        this.f79535g = new io.bidmachine.analytics.internal.e.a();
    }

    public final Key a() {
        return a(this.f79534f, this.f79533e, this.f79529a);
    }

    public final byte[] b() {
        return this.f79533e;
    }

    public final Key a(Key key, byte[] bArr, byte[] bArr2) {
        return new SecretKeySpec(this.f79535g.a(a(key, bArr2), this.f79532d ? a(bArr, bArr2) : null, this.f79531c), this.f79530b);
    }

    private final byte[] a(Key key, byte[] bArr) throws InvalidKeySpecException, NoSuchAlgorithmException, InvalidKeyException {
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(bArr));
        KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
        keyAgreement.init(key);
        keyAgreement.doPhase(publicKeyGeneratePublic, true);
        return keyAgreement.generateSecret();
    }

    public /* synthetic */ C5637a(byte[] bArr, String str, byte[] bArr2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, str, (i10 & 4) != 0 ? null : bArr2, (i10 & 8) != 0 ? false : z10);
    }

    private final byte[] a(byte[] bArr, byte[] bArr2) throws IOException {
        List listMutableListOf = CollectionsKt.mutableListOf(ByteBuffer.wrap(bArr), ByteBuffer.wrap(bArr2));
        CollectionsKt.sort(listMutableListOf);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(((ByteBuffer) listMutableListOf.get(0)).array());
        byteArrayOutputStream.write(((ByteBuffer) listMutableListOf.get(1)).array());
        return byteArrayOutputStream.toByteArray();
    }
}
