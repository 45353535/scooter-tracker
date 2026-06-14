package hh;

import androidx.collection.SieveCacheKt;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f73576n = new b(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f73577o = new a().d().a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f73578p = new a().f().c(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f73579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f73580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f73581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f73582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f73583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f73584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f73585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f73586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f73587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f73588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f73589k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f73590l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f73591m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f73592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f73593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f73594c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f73595d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f73596e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f73597f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f73598g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f73599h;

        private final int b(long j10) {
            if (j10 > SieveCacheKt.NodeLinkMask) {
                return Integer.MAX_VALUE;
            }
            return (int) j10;
        }

        public final d a() {
            return new d(this.f73592a, this.f73593b, this.f73594c, -1, false, false, false, this.f73595d, this.f73596e, this.f73597f, this.f73598g, this.f73599h, null, null);
        }

        public final a c(int i10, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            if (i10 >= 0) {
                this.f73595d = b(timeUnit.toSeconds(i10));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i10).toString());
        }

        public final a d() {
            this.f73592a = true;
            return this;
        }

        public final a e() {
            this.f73593b = true;
            return this;
        }

        public final a f() {
            this.f73597f = true;
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int a(String str, String str2, int i10) {
            int length = str.length();
            while (i10 < length) {
                if (StringsKt.f0(str2, str.charAt(i10), false, 2, null)) {
                    return i10;
                }
                i10++;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final hh.d b(hh.t r33) {
            /*
                Method dump skipped, instruction units count: 426
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: hh.d.b.b(hh.t):hh.d");
        }

        private b() {
        }
    }

    public /* synthetic */ d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, str);
    }

    public final boolean a() {
        return this.f73583e;
    }

    public final boolean b() {
        return this.f73584f;
    }

    public final int c() {
        return this.f73581c;
    }

    public final int d() {
        return this.f73586h;
    }

    public final int e() {
        return this.f73587i;
    }

    public final boolean f() {
        return this.f73585g;
    }

    public final boolean g() {
        return this.f73579a;
    }

    public final boolean h() {
        return this.f73580b;
    }

    public final boolean i() {
        return this.f73588j;
    }

    public String toString() {
        String str = this.f73591m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f73579a) {
            sb2.append("no-cache, ");
        }
        if (this.f73580b) {
            sb2.append("no-store, ");
        }
        if (this.f73581c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f73581c);
            sb2.append(", ");
        }
        if (this.f73582d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f73582d);
            sb2.append(", ");
        }
        if (this.f73583e) {
            sb2.append("private, ");
        }
        if (this.f73584f) {
            sb2.append("public, ");
        }
        if (this.f73585g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f73586h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f73586h);
            sb2.append(", ");
        }
        if (this.f73587i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f73587i);
            sb2.append(", ");
        }
        if (this.f73588j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f73589k) {
            sb2.append("no-transform, ");
        }
        if (this.f73590l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        this.f73591m = string;
        return string;
    }

    private d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f73579a = z10;
        this.f73580b = z11;
        this.f73581c = i10;
        this.f73582d = i11;
        this.f73583e = z12;
        this.f73584f = z13;
        this.f73585g = z14;
        this.f73586h = i12;
        this.f73587i = i13;
        this.f73588j = z15;
        this.f73589k = z16;
        this.f73590l = z17;
        this.f73591m = str;
    }
}
