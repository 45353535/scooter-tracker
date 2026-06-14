package ve;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f106545d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b0 f106546e = new b0("HTTP", 2, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b0 f106547f = new b0("HTTP", 1, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b0 f106548g = new b0("HTTP", 1, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b0 f106549h = new b0("SPDY", 3, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final b0 f106550i = new b0("QUIC", 1, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f106552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f106553c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b0 a() {
            return b0.f106547f;
        }

        private a() {
        }
    }

    public b0(String name, int i10, int i11) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f106551a = name;
        this.f106552b = i10;
        this.f106553c = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.areEqual(this.f106551a, b0Var.f106551a) && this.f106552b == b0Var.f106552b && this.f106553c == b0Var.f106553c;
    }

    public int hashCode() {
        return (((this.f106551a.hashCode() * 31) + this.f106552b) * 31) + this.f106553c;
    }

    public String toString() {
        return this.f106551a + IOUtils.DIR_SEPARATOR_UNIX + this.f106552b + '.' + this.f106553c;
    }
}
