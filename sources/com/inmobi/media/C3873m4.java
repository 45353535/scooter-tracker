package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3873m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Config f39008b;

    public C3873m4(String url, Config availableConfig) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(availableConfig, "availableConfig");
        this.f39007a = url;
        this.f39008b = availableConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3873m4) && Intrinsics.areEqual(this.f39008b.getType(), ((C3873m4) obj).f39008b.getType());
    }

    public final int hashCode() {
        return this.f39008b.getType().hashCode();
    }
}
