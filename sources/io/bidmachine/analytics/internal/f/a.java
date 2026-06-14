package io.bidmachine.analytics.internal.f;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECGenParameterSpec;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KeyPairGenerator f79536a;

    public a() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
        this.f79536a = keyPairGenerator;
    }

    @Override // io.bidmachine.analytics.internal.f.b
    public /* synthetic */ KeyPair a() {
        return t8.a.a(this);
    }

    @Override // io.bidmachine.analytics.internal.f.b
    public KeyPairGenerator b() {
        return this.f79536a;
    }
}
