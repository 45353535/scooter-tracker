package ve;

import com.ironsource.C4240b4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f106691k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final f1 f106692l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f106693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f106694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f106695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private t0 f106696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f106697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f106698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f106699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f106700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private h0 f106701i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private h0 f106702j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f106691k = aVar;
        f106692l = w0.d(n0.a(aVar));
    }

    public m0(t0 t0Var, String host, int i10, String str, String str2, List pathSegments, g0 parameters, String fragment, boolean z10) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f106693a = host;
        this.f106694b = z10;
        this.f106695c = i10;
        this.f106696d = t0Var;
        this.f106697e = str != null ? f.m(str, false, 1, null) : null;
        this.f106698f = str2 != null ? f.m(str2, false, 1, null) : null;
        this.f106699g = f.u(fragment, false, false, null, 7, null);
        List list = pathSegments;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f.s((String) it.next()));
        }
        this.f106700h = arrayList;
        h0 h0VarE = h1.e(parameters);
        this.f106701i = h0VarE;
        this.f106702j = new g1(h0VarE);
    }

    private final void a() {
        if (this.f106693a.length() <= 0 && !Intrinsics.areEqual(o().i(), C4240b4.i.f42616b)) {
            f1 f1Var = f106692l;
            this.f106693a = f1Var.getHost();
            if (this.f106696d == null) {
                this.f106696d = f1Var.getProtocolOrNull();
            }
            if (this.f106695c == 0) {
                y(f1Var.getSpecifiedPort());
            }
        }
    }

    public final void A(t0 t0Var) {
        this.f106696d = t0Var;
    }

    public final void B(boolean z10) {
        this.f106694b = z10;
    }

    public final void C(String str) {
        this.f106697e = str != null ? f.m(str, false, 1, null) : null;
    }

    public final f1 b() {
        a();
        return new f1(this.f106696d, this.f106693a, this.f106695c, m(), this.f106702j.build(), i(), r(), l(), this.f106694b, c());
    }

    public final String c() {
        a();
        String string = ((StringBuilder) o0.e(this, new StringBuilder(256))).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final String d() {
        return this.f106699g;
    }

    public final h0 e() {
        return this.f106701i;
    }

    public final String f() {
        return this.f106698f;
    }

    public final List g() {
        return this.f106700h;
    }

    public final String h() {
        return this.f106697e;
    }

    public final String i() {
        return f.k(this.f106699g, 0, 0, false, null, 15, null);
    }

    public final String j() {
        return this.f106693a;
    }

    public final h0 k() {
        return this.f106702j;
    }

    public final String l() {
        String str = this.f106698f;
        if (str != null) {
            return f.i(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final List m() {
        List list = this.f106700h;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f.i((String) it.next(), 0, 0, null, 7, null));
        }
        return arrayList;
    }

    public final int n() {
        return this.f106695c;
    }

    public final t0 o() {
        t0 t0Var = this.f106696d;
        return t0Var == null ? t0.f106709d.c() : t0Var;
    }

    public final t0 p() {
        return this.f106696d;
    }

    public final boolean q() {
        return this.f106694b;
    }

    public final String r() {
        String str = this.f106697e;
        if (str != null) {
            return f.i(str, 0, 0, null, 7, null);
        }
        return null;
    }

    public final void s(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f106699g = str;
    }

    public final void t(h0 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f106701i = value;
        this.f106702j = new g1(value);
    }

    public String toString() {
        String string = ((StringBuilder) o0.e(this, new StringBuilder(256))).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void u(String str) {
        this.f106698f = str;
    }

    public final void v(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f106700h = list;
    }

    public final void w(String str) {
        this.f106697e = str;
    }

    public final void x(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f106693a = str;
    }

    public final void y(int i10) {
        if (i10 >= 0 && i10 < 65536) {
            this.f106695c = i10;
            return;
        }
        throw new IllegalArgumentException(("Port must be between 0 and 65535, or 0 if not set. Provided: " + i10).toString());
    }

    public final void z(t0 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f106696d = value;
    }

    public /* synthetic */ m0(t0 t0Var, String str, int i10, String str2, String str3, List list, g0 g0Var, String str4, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : t0Var, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? CollectionsKt.emptyList() : list, (i11 & 64) != 0 ? g0.f106672b.a() : g0Var, (i11 & 128) != 0 ? "" : str4, (i11 & 256) != 0 ? false : z10);
    }
}
