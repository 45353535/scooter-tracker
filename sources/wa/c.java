package wa;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f107822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f107823b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f107824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f107825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f107826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f107827d;

        public a(String str, String str2, long j10, long j11) {
            this.f107824a = str;
            this.f107825b = str2;
            this.f107826c = j10;
            this.f107827d = j11;
        }
    }

    public c(long j10, List list) {
        this.f107822a = j10;
        this.f107823b = list;
    }

    public db.a a(long j10) {
        long j11;
        if (this.f107823b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f107823b.size() - 1; size >= 0; size--) {
            a aVar = (a) this.f107823b.get(size);
            boolean zEquals = "video/mp4".equals(aVar.f107824a) | z10;
            if (size == 0) {
                j12 -= aVar.f107827d;
                j11 = 0;
            } else {
                j11 = j12 - aVar.f107826c;
            }
            long j17 = j11;
            long j18 = j12;
            j12 = j17;
            if (!zEquals || j12 == j18) {
                z10 = zEquals;
            } else {
                j16 = j18 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j18;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new db.a(j13, j14, this.f107822a, j15, j16);
    }
}
