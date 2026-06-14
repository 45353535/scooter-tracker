package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5412s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f78208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f78209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f78210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f78211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f78212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f78213f;

    public C5412s4(C5363q4 c5363q4) {
        this.f78208a = c5363q4.f78026a;
        this.f78209b = c5363q4.f78027b;
        this.f78210c = c5363q4.f78028c;
        this.f78211d = c5363q4.f78029d;
        this.f78212e = c5363q4.f78030e;
        this.f78213f = c5363q4.f78031f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5412s4.class == obj.getClass()) {
            C5412s4 c5412s4 = (C5412s4) obj;
            if (this.f78208a != c5412s4.f78208a || this.f78209b != c5412s4.f78209b || this.f78210c != c5412s4.f78210c || this.f78211d != c5412s4.f78211d || this.f78212e != c5412s4.f78212e) {
                return false;
            }
            Boolean bool = this.f78213f;
            Boolean bool2 = c5412s4.f78213f;
            if (bool != null) {
                return bool.equals(bool2);
            }
            if (bool2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((((((((this.f78208a ? 1 : 0) * 31) + (this.f78209b ? 1 : 0)) * 31) + (this.f78210c ? 1 : 0)) * 31) + (this.f78211d ? 1 : 0)) * 31) + (this.f78212e ? 1 : 0)) * 31;
        Boolean bool = this.f78213f;
        return i10 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CollectingFlags{permissionsCollectingEnabled=" + this.f78208a + ", featuresCollectingEnabled=" + this.f78209b + ", googleAid=" + this.f78210c + ", simInfo=" + this.f78211d + ", huaweiOaid=" + this.f78212e + ", sslPinning=" + this.f78213f + '}';
    }
}
