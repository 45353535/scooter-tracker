package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.jl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3815jl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Config f38837b;

    public C3815jl(int i10, Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f38836a = i10;
        this.f38837b = config;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3815jl)) {
            return false;
        }
        C3815jl c3815jl = (C3815jl) obj;
        return this.f38836a == c3815jl.f38836a && Intrinsics.areEqual(this.f38837b, c3815jl.f38837b);
    }

    public final int hashCode() {
        return this.f38837b.hashCode() + (this.f38836a * 31);
    }

    public final String toString() {
        return "ValidatedConfigResponseModel(configResponseCode=" + this.f38836a + ", config=" + this.f38837b + ")";
    }
}
