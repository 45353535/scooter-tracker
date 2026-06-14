package com.google.android.datatransport;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class Encoding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24121a;

    private Encoding(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f24121a = str;
    }

    public static Encoding of(@NonNull String str) {
        return new Encoding(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Encoding) {
            return this.f24121a.equals(((Encoding) obj).f24121a);
        }
        return false;
    }

    public String getName() {
        return this.f24121a;
    }

    public int hashCode() {
        return this.f24121a.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return "Encoding{name=\"" + this.f24121a + "\"}";
    }
}
