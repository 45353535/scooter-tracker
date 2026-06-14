package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3634ch extends AbstractC3685eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38344b;

    public C3634ch(String message, int i10) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f38343a = i10;
        this.f38344b = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3634ch)) {
            return false;
        }
        C3634ch c3634ch = (C3634ch) obj;
        return this.f38343a == c3634ch.f38343a && Intrinsics.areEqual(this.f38344b, c3634ch.f38344b);
    }

    public final int hashCode() {
        return this.f38344b.hashCode() + (this.f38343a * 31);
    }

    public final String toString() {
        return "Failure(statusCode=" + this.f38343a + ", message=" + this.f38344b + ")";
    }
}
