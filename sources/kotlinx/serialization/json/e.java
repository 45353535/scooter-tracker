package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f93674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f93675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f93676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f93677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f93678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f93679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f93680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f93681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f93682i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f93683j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f93684k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f93685l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f93686m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f93687n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f93688o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f93689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ah.b f93690q;

    public e(b json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f93674a = json.e().i();
        this.f93675b = json.e().j();
        this.f93676c = json.e().k();
        this.f93677d = json.e().q();
        this.f93678e = json.e().m();
        this.f93679f = json.e().n();
        this.f93680g = json.e().g();
        this.f93681h = json.e().e();
        this.f93682i = json.e().f();
        this.f93683j = json.e().o();
        json.e().l();
        this.f93684k = json.e().h();
        this.f93685l = json.e().d();
        this.f93686m = json.e().a();
        this.f93687n = json.e().b();
        this.f93688o = json.e().c();
        this.f93689p = json.e().p();
        this.f93690q = json.a();
    }

    public final g a() {
        if (this.f93689p) {
            if (!Intrinsics.areEqual(this.f93681h, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
            if (this.f93682i != a.f93653d) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (this.f93678e) {
            if (!Intrinsics.areEqual(this.f93679f, "    ")) {
                String str = this.f93679f;
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f93679f).toString());
                    }
                }
            }
        } else if (!Intrinsics.areEqual(this.f93679f, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        return new g(this.f93674a, this.f93676c, this.f93677d, this.f93688o, this.f93678e, this.f93675b, this.f93679f, this.f93680g, this.f93689p, this.f93681h, this.f93687n, this.f93683j, null, this.f93684k, this.f93685l, this.f93686m, this.f93682i);
    }

    public final ah.b b() {
        return this.f93690q;
    }

    public final void c(boolean z10) {
        this.f93688o = z10;
    }

    public final void d(boolean z10) {
        this.f93674a = z10;
    }

    public final void e(boolean z10) {
        this.f93675b = z10;
    }

    public final void f(boolean z10) {
        this.f93676c = z10;
    }

    public final void g(boolean z10) {
        this.f93677d = z10;
    }

    public final void h(boolean z10) {
        this.f93678e = z10;
    }
}
