package qd;

import java.io.File;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f99089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f99090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f99091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f99092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f99093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f99094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Date f99095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Date f99096h;

    public /* synthetic */ c(File file, String str, long j10, long j11, long j12, long j13, Date date, Date date2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, str, j10, j11, j12, j13, date, date2);
    }

    public static /* synthetic */ c b(c cVar, File file, String str, long j10, long j11, long j12, long j13, Date date, Date date2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            file = cVar.f99089a;
        }
        if ((i10 & 2) != 0) {
            str = cVar.f99090b;
        }
        if ((i10 & 4) != 0) {
            j10 = cVar.f99091c;
        }
        if ((i10 & 8) != 0) {
            j11 = cVar.f99092d;
        }
        if ((i10 & 16) != 0) {
            j12 = cVar.f99093e;
        }
        if ((i10 & 32) != 0) {
            j13 = cVar.f99094f;
        }
        if ((i10 & 64) != 0) {
            date = cVar.f99095g;
        }
        if ((i10 & 128) != 0) {
            date2 = cVar.f99096h;
        }
        long j14 = j13;
        long j15 = j12;
        long j16 = j11;
        long j17 = j10;
        return cVar.a(file, str, j17, j16, j15, j14, date, date2);
    }

    public final c a(File file, String mimeType, long j10, long j11, long j12, long j13, Date lastUsedTime, Date createdAt) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(lastUsedTime, "lastUsedTime");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new c(file, mimeType, j10, j11, j12, j13, lastUsedTime, createdAt, null);
    }

    public final Date c() {
        return this.f99096h;
    }

    public final long d() {
        return this.f99094f;
    }

    public final File e() {
        return this.f99089a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f99089a, cVar.f99089a) && Intrinsics.areEqual(this.f99090b, cVar.f99090b) && this.f99091c == cVar.f99091c && this.f99092d == cVar.f99092d && kotlin.time.b.l(this.f99093e, cVar.f99093e) && kotlin.time.b.l(this.f99094f, cVar.f99094f) && Intrinsics.areEqual(this.f99095g, cVar.f99095g) && Intrinsics.areEqual(this.f99096h, cVar.f99096h);
    }

    public final Date f() {
        return this.f99095g;
    }

    public final String g() {
        return this.f99090b;
    }

    public final long h() {
        return this.f99093e;
    }

    public int hashCode() {
        return (((((((((((((this.f99089a.hashCode() * 31) + this.f99090b.hashCode()) * 31) + androidx.collection.b.a(this.f99091c)) * 31) + androidx.collection.b.a(this.f99092d)) * 31) + kotlin.time.b.y(this.f99093e)) * 31) + kotlin.time.b.y(this.f99094f)) * 31) + this.f99095g.hashCode()) * 31) + this.f99096h.hashCode();
    }

    public final long i() {
        return this.f99091c;
    }

    public final long j() {
        return this.f99092d;
    }

    public String toString() {
        return "MediaFileMetadata(file=" + this.f99089a + ", mimeType=" + this.f99090b + ", sizeBytes=" + this.f99091c + ", usageFrequency=" + this.f99092d + ", pingTime=" + ((Object) kotlin.time.b.L(this.f99093e)) + ", downloadTime=" + ((Object) kotlin.time.b.L(this.f99094f)) + ", lastUsedTime=" + this.f99095g + ", createdAt=" + this.f99096h + ')';
    }

    private c(File file, String str, long j10, long j11, long j12, long j13, Date date, Date date2) {
        this.f99089a = file;
        this.f99090b = str;
        this.f99091c = j10;
        this.f99092d = j11;
        this.f99093e = j12;
        this.f99094f = j13;
        this.f99095g = date;
        this.f99096h = date2;
    }
}
