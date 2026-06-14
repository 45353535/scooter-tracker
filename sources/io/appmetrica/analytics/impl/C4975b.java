package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4975b implements L8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AESEncrypter f76870a;

    public C4975b() {
        this(new C4949a(C5468ua.k().g()));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // io.appmetrica.analytics.impl.L8
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.E8 a(@androidx.annotation.NonNull io.appmetrica.analytics.impl.W5 r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.getValue()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L1e
            java.lang.String r1 = "UTF-8"
            byte[] r0 = r0.getBytes(r1)     // Catch: java.lang.Throwable -> L1e
            io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter r1 = r2.f76870a     // Catch: java.lang.Throwable -> L1e
            byte[] r0 = r1.encrypt(r0)     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1e
            r1 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r1)     // Catch: java.lang.Throwable -> L1e
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r3.setValue(r0)
            io.appmetrica.analytics.impl.E8 r0 = new io.appmetrica.analytics.impl.E8
            io.appmetrica.analytics.impl.N8 r1 = io.appmetrica.analytics.impl.N8.AES_VALUE_ENCRYPTION
            r0.<init>(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C4975b.a(io.appmetrica.analytics.impl.W5):io.appmetrica.analytics.impl.E8");
    }

    public C4975b(C4949a c4949a) {
        this(new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c4949a.b(), c4949a.a()));
    }

    public C4975b(AESEncrypter aESEncrypter) {
        this.f76870a = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.impl.L8
    @NonNull
    public final byte[] a(@Nullable byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr != null && bArr.length > 0) {
            try {
                return this.f76870a.decrypt(Base64.decode(bArr, 0));
            } catch (Throwable unused) {
            }
        }
        return bArr2;
    }

    @NonNull
    public final N8 a() {
        return N8.AES_VALUE_ENCRYPTION;
    }
}
