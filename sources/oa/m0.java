package oa;

import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes12.dex */
public interface m0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n0 f96607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n0 f96608b;

        public a(n0 n0Var) {
            this(n0Var, n0Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f96607a.equals(aVar.f96607a) && this.f96608b.equals(aVar.f96608b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f96607a.hashCode() * 31) + this.f96608b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C4240b4.j.f42672d);
            sb2.append(this.f96607a);
            if (this.f96607a.equals(this.f96608b)) {
                str = "";
            } else {
                str = ", " + this.f96608b;
            }
            sb2.append(str);
            sb2.append(C4240b4.j.f42674e);
            return sb2.toString();
        }

        public a(n0 n0Var, n0 n0Var2) {
            this.f96607a = (n0) q9.a.e(n0Var);
            this.f96608b = (n0) q9.a.e(n0Var2);
        }
    }

    public static class b implements m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f96609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f96610b;

        public b(long j10) {
            this(j10, 0L);
        }

        @Override // oa.m0
        public long getDurationUs() {
            return this.f96609a;
        }

        @Override // oa.m0
        public a getSeekPoints(long j10) {
            return this.f96610b;
        }

        @Override // oa.m0
        public boolean isSeekable() {
            return false;
        }

        public b(long j10, long j11) {
            this.f96609a = j10;
            this.f96610b = new a(j11 == 0 ? n0.f96612c : new n0(0L, j11));
        }
    }

    long getDurationUs();

    a getSeekPoints(long j10);

    boolean isSeekable();
}
