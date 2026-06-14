package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.StateSerializer;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class G8 implements StateSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StateSerializer f75812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AESEncrypter f75813b;

    public G8(@NonNull StateSerializer<Object> stateSerializer, @NonNull AESEncrypter aESEncrypter) {
        this.f75812a = stateSerializer;
        this.f75813b = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final Object defaultValue() {
        return this.f75812a.defaultValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final byte[] toByteArray(@NonNull Object obj) {
        try {
            return this.f75813b.encrypt(this.f75812a.toByteArray(obj));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final Object toState(@NonNull byte[] bArr) throws IOException {
        try {
            return this.f75812a.toState(this.f75813b.decrypt(bArr));
        } catch (Throwable th2) {
            throw new IOException(th2);
        }
    }
}
