package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3623c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f38321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f38322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f38323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f38324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f38325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f38326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f38327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f38328i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f38329j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f38330k;

    public C3623c6(int i10, long j10, long j11, long j12, int i11, int i12, int i13, int i14, long j13, long j14) {
        this.f38320a = i10;
        this.f38321b = j10;
        this.f38322c = j11;
        this.f38323d = j12;
        this.f38324e = i11;
        this.f38325f = i12;
        this.f38326g = i13;
        this.f38327h = i14;
        this.f38328i = j13;
        this.f38329j = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3623c6)) {
            return false;
        }
        C3623c6 c3623c6 = (C3623c6) obj;
        return this.f38320a == c3623c6.f38320a && this.f38321b == c3623c6.f38321b && this.f38322c == c3623c6.f38322c && this.f38323d == c3623c6.f38323d && this.f38324e == c3623c6.f38324e && this.f38325f == c3623c6.f38325f && this.f38326g == c3623c6.f38326g && this.f38327h == c3623c6.f38327h && this.f38328i == c3623c6.f38328i && this.f38329j == c3623c6.f38329j;
    }

    public final int hashCode() {
        return androidx.collection.b.a(this.f38329j) + ((androidx.collection.b.a(this.f38328i) + AbstractC3712fi.a(this.f38327h, AbstractC3712fi.a(this.f38326g, AbstractC3712fi.a(this.f38325f, AbstractC3712fi.a(this.f38324e, (androidx.collection.b.a(this.f38323d) + ((androidx.collection.b.a(this.f38322c) + ((androidx.collection.b.a(this.f38321b) + (this.f38320a * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "EventConfig(maxRetryCount=" + this.f38320a + ", timeToLiveInSec=" + this.f38321b + ", processingInterval=" + this.f38322c + ", ingestionLatencyInSec=" + this.f38323d + ", minBatchSizeWifi=" + this.f38324e + ", maxBatchSizeWifi=" + this.f38325f + ", minBatchSizeMobile=" + this.f38326g + ", maxBatchSizeMobile=" + this.f38327h + ", retryIntervalWifi=" + this.f38328i + ", retryIntervalMobile=" + this.f38329j + ")";
    }
}
