package kotlin.ranges;

import kotlin.collections.LongIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class e implements Iterable, yf.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f93365e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f93366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f93367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f93368d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(long j10, long j11, long j12) {
            return new e(j10, j11, j12);
        }

        private a() {
        }
    }

    public e(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f93366b = j10;
        this.f93367c = rf.c.d(j10, j11, j12);
        this.f93368d = j12;
    }

    public final long e() {
        return this.f93366b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return this.f93366b == eVar.f93366b && this.f93367c == eVar.f93367c && this.f93368d == eVar.f93368d;
    }

    public final long f() {
        return this.f93367c;
    }

    public final long g() {
        return this.f93368d;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = 31;
        long j11 = this.f93366b;
        long j12 = this.f93367c;
        long j13 = j10 * (((j11 ^ (j11 >>> 32)) * j10) + (j12 ^ (j12 >>> 32)));
        long j14 = this.f93368d;
        return (int) (j13 + (j14 ^ (j14 >>> 32)));
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public LongIterator iterator() {
        return new bg.e(this.f93366b, this.f93367c, this.f93368d);
    }

    public boolean isEmpty() {
        long j10 = this.f93368d;
        long j11 = this.f93366b;
        long j12 = this.f93367c;
        return j10 > 0 ? j11 > j12 : j11 < j12;
    }

    public String toString() {
        StringBuilder sb2;
        long j10;
        if (this.f93368d > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f93366b);
            sb2.append("..");
            sb2.append(this.f93367c);
            sb2.append(" step ");
            j10 = this.f93368d;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f93366b);
            sb2.append(" downTo ");
            sb2.append(this.f93367c);
            sb2.append(" step ");
            j10 = -this.f93368d;
        }
        sb2.append(j10);
        return sb2.toString();
    }
}
