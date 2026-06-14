package kotlin.ranges;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends e implements bg.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f93369f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final f f93370g = new f(1, 0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a() {
            return f.f93370g;
        }

        private a() {
        }
    }

    public f(long j10, long j11) {
        super(j10, j11, 1L);
    }

    @Override // kotlin.ranges.e
    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (isEmpty() && ((f) obj).isEmpty()) {
            return true;
        }
        f fVar = (f) obj;
        return e() == fVar.e() && f() == fVar.f();
    }

    @Override // kotlin.ranges.e
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (e() ^ (e() >>> 32))) + (f() ^ (f() >>> 32)));
    }

    @Override // kotlin.ranges.e, bg.c
    public boolean isEmpty() {
        return e() > f();
    }

    public boolean k(long j10) {
        return e() <= j10 && j10 <= f();
    }

    @Override // bg.c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Long getEndInclusive() {
        return Long.valueOf(f());
    }

    @Override // bg.c
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Long getStart() {
        return Long.valueOf(e());
    }

    @Override // kotlin.ranges.e
    public String toString() {
        return e() + ".." + f();
    }
}
