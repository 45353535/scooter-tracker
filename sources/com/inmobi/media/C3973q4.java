package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.q4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3973q4 extends AbstractC3948p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Config f39345b;

    public C3973q4(int i10, Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f39344a = i10;
        this.f39345b = config;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3973q4)) {
            return false;
        }
        C3973q4 c3973q4 = (C3973q4) obj;
        return this.f39344a == c3973q4.f39344a && Intrinsics.areEqual(this.f39345b, c3973q4.f39345b);
    }

    public final int hashCode() {
        return this.f39345b.hashCode() + (this.f39344a * 31);
    }

    public final String toString() {
        return "ConfigSuccess(statusCode=" + this.f39344a + ", config=" + this.f39345b + ")";
    }
}
