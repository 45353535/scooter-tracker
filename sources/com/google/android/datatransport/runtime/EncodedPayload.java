package com.google.android.datatransport.runtime;

import androidx.annotation.NonNull;
import com.google.android.datatransport.Encoding;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class EncodedPayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Encoding f24356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f24357b;

    public EncodedPayload(@NonNull Encoding encoding, @NonNull byte[] bArr) {
        if (encoding == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f24356a = encoding;
        this.f24357b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncodedPayload)) {
            return false;
        }
        EncodedPayload encodedPayload = (EncodedPayload) obj;
        if (this.f24356a.equals(encodedPayload.f24356a)) {
            return Arrays.equals(this.f24357b, encodedPayload.f24357b);
        }
        return false;
    }

    public byte[] getBytes() {
        return this.f24357b;
    }

    public Encoding getEncoding() {
        return this.f24356a;
    }

    public int hashCode() {
        return ((this.f24356a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f24357b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f24356a + ", bytes=[...]}";
    }
}
