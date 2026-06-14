package com.moloco.sdk.internal.services.bidtoken;

/* JADX INFO: loaded from: classes10.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f55365c;

    public m(long j10, int i10, long j11) {
        this.f55363a = j10;
        this.f55364b = i10;
        this.f55365c = j11;
    }

    public final long a() {
        return this.f55365c;
    }

    public final int b() {
        return this.f55364b;
    }

    public final long c() {
        return this.f55363a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f55363a == mVar.f55363a && this.f55364b == mVar.f55364b && this.f55365c == mVar.f55365c;
    }

    public int hashCode() {
        return (((androidx.collection.b.a(this.f55363a) * 31) + this.f55364b) * 31) + androidx.collection.b.a(this.f55365c);
    }

    public String toString() {
        return "BidTokenHttpRequestInfo(requestTimeoutMillis=" + this.f55363a + ", fetchRetryMax=" + this.f55364b + ", fetchRetryDelayMillis=" + this.f55365c + ')';
    }
}
