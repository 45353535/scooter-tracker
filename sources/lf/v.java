package lf;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f94232c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f94233b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ v(long j10) {
        this.f94233b = j10;
    }

    public static final /* synthetic */ v a(long j10) {
        return new v(j10);
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof v) && j10 == ((v) obj).g();
    }

    public static int e(long j10) {
        return androidx.collection.b.a(j10);
    }

    public static String f(long j10) {
        return c0.f(j10, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return c0.d(g(), ((v) obj).g());
    }

    public boolean equals(Object obj) {
        return d(this.f94233b, obj);
    }

    public final /* synthetic */ long g() {
        return this.f94233b;
    }

    public int hashCode() {
        return e(this.f94233b);
    }

    public String toString() {
        return f(this.f94233b);
    }

    public static long c(long j10) {
        return j10;
    }
}
