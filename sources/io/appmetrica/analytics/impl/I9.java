package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class I9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f75928a;

    public I9(long j10) {
        this.f75928a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I9) && this.f75928a == ((I9) obj).f75928a;
    }

    public final int hashCode() {
        return androidx.collection.b.a(this.f75928a);
    }

    public final String toString() {
        return "ExternalAttributionConfig(collectingInterval=" + this.f75928a + ')';
    }
}
