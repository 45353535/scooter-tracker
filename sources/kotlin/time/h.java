package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements cg.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f93567a = new h();

    public static final class a implements kotlin.time.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f93568b;

        private /* synthetic */ a(long j10) {
            this.f93568b = j10;
        }

        public static final /* synthetic */ a c(long j10) {
            return new a(j10);
        }

        public static long e(long j10) {
            return j10;
        }

        public static long f(long j10) {
            return g.f93565a.c(j10);
        }

        public static boolean g(long j10, Object obj) {
            return (obj instanceof a) && j10 == ((a) obj).l();
        }

        public static int h(long j10) {
            return androidx.collection.b.a(j10);
        }

        public static final long i(long j10, long j11) {
            return g.f93565a.b(j10, j11);
        }

        public static long j(long j10, kotlin.time.a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof a) {
                return i(j10, ((a) other).l());
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) k(j10)) + " and " + other);
        }

        public static String k(long j10) {
            return "ValueTimeMark(reading=" + j10 + ')';
        }

        @Override // kotlin.time.TimeMark
        public long a() {
            return f(this.f93568b);
        }

        @Override // kotlin.time.a
        public long b(kotlin.time.a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return j(this.f93568b, other);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(kotlin.time.a aVar) {
            return a.C1072a.a(this, aVar);
        }

        public boolean equals(Object obj) {
            return g(this.f93568b, obj);
        }

        public int hashCode() {
            return h(this.f93568b);
        }

        public final /* synthetic */ long l() {
            return this.f93568b;
        }

        public String toString() {
            return k(this.f93568b);
        }
    }

    private h() {
    }

    @Override // cg.c
    public /* bridge */ /* synthetic */ kotlin.time.a a() {
        return a.c(b());
    }

    public long b() {
        return g.f93565a.d();
    }

    public String toString() {
        return g.f93565a.toString();
    }
}
