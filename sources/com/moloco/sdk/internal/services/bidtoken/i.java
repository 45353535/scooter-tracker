package com.moloco.sdk.internal.services.bidtoken;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f55346a;

    public i(boolean z10) {
        this.f55346a = z10;
    }

    public final boolean a() {
        return this.f55346a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f55346a == ((i) obj).f55346a;
    }

    public int hashCode() {
        return androidx.compose.foundation.c.a(this.f55346a);
    }

    public String toString() {
        return "BidTokenConfig(dbtEnabled=" + this.f55346a + ')';
    }
}
