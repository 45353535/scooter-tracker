package k9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.a f93048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f93049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f93050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f93051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f93052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f93053f;

    public f(zd.a version, int i10, long j10, long j11, long j12, long j13) {
        Intrinsics.checkNotNullParameter(version, "version");
        this.f93048a = version;
        this.f93049b = i10;
        this.f93050c = j10;
        this.f93051d = j11;
        this.f93052e = j12;
        this.f93053f = j13;
    }

    public static /* synthetic */ f b(f fVar, zd.a aVar, int i10, long j10, long j11, long j12, long j13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = fVar.f93048a;
        }
        if ((i11 & 2) != 0) {
            i10 = fVar.f93049b;
        }
        if ((i11 & 4) != 0) {
            j10 = fVar.f93050c;
        }
        if ((i11 & 8) != 0) {
            j11 = fVar.f93051d;
        }
        if ((i11 & 16) != 0) {
            j12 = fVar.f93052e;
        }
        if ((i11 & 32) != 0) {
            j13 = fVar.f93053f;
        }
        long j14 = j13;
        long j15 = j12;
        long j16 = j11;
        return fVar.a(aVar, i10, j10, j16, j15, j14);
    }

    public final f a(zd.a version, int i10, long j10, long j11, long j12, long j13) {
        Intrinsics.checkNotNullParameter(version, "version");
        return new f(version, i10, j10, j11, j12, j13);
    }

    public final long c() {
        return this.f93052e;
    }

    public final long d() {
        return this.f93050c;
    }

    public final long e() {
        return this.f93053f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f93048a, fVar.f93048a) && this.f93049b == fVar.f93049b && this.f93050c == fVar.f93050c && this.f93051d == fVar.f93051d && this.f93052e == fVar.f93052e && this.f93053f == fVar.f93053f;
    }

    public final long f() {
        return this.f93051d;
    }

    public final int g() {
        return this.f93049b;
    }

    public final zd.a h() {
        return this.f93048a;
    }

    public int hashCode() {
        return (((((((((this.f93048a.hashCode() * 31) + this.f93049b) * 31) + androidx.collection.b.a(this.f93050c)) * 31) + androidx.collection.b.a(this.f93051d)) * 31) + androidx.collection.b.a(this.f93052e)) * 31) + androidx.collection.b.a(this.f93053f);
    }

    public String toString() {
        return "VersionMilestone(version=" + this.f93048a + ", sessionCount=" + this.f93049b + ", firstSessionTime=" + this.f93050c + ", lastSessionTime=" + this.f93051d + ", currentSessionDuration=" + this.f93052e + ", lastSessionDuration=" + this.f93053f + ')';
    }
}
