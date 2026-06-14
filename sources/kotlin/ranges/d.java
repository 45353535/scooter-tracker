package kotlin.ranges;

import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class d implements Iterable, yf.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f93361e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f93362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f93363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f93364d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(int i10, int i11, int i12) {
            return new d(i10, i11, i12);
        }

        private a() {
        }
    }

    public d(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f93362b = i10;
        this.f93363c = rf.c.c(i10, i11, i12);
        this.f93364d = i12;
    }

    public final int e() {
        return this.f93362b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f93362b == dVar.f93362b && this.f93363c == dVar.f93363c && this.f93364d == dVar.f93364d;
    }

    public final int f() {
        return this.f93363c;
    }

    public final int g() {
        return this.f93364d;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f93362b * 31) + this.f93363c) * 31) + this.f93364d;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public IntIterator iterator() {
        return new bg.d(this.f93362b, this.f93363c, this.f93364d);
    }

    public boolean isEmpty() {
        return this.f93364d > 0 ? this.f93362b > this.f93363c : this.f93362b < this.f93363c;
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f93364d > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f93362b);
            sb2.append("..");
            sb2.append(this.f93363c);
            sb2.append(" step ");
            i10 = this.f93364d;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f93362b);
            sb2.append(" downTo ");
            sb2.append(this.f93363c);
            sb2.append(" step ");
            i10 = -this.f93364d;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
