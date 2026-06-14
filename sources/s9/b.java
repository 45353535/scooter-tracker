package s9;

import java.util.ArrayList;
import java.util.Map;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f99798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f99799b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f99800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private k f99801d;

    protected b(boolean z10) {
        this.f99798a = z10;
    }

    @Override // s9.g
    public final void a(y yVar) {
        q9.a.e(yVar);
        if (this.f99799b.contains(yVar)) {
            return;
        }
        this.f99799b.add(yVar);
        this.f99800c++;
    }

    protected final void c(int i10) {
        k kVar = (k) o0.i(this.f99801d);
        for (int i11 = 0; i11 < this.f99800c; i11++) {
            ((y) this.f99799b.get(i11)).f(this, kVar, this.f99798a, i10);
        }
    }

    protected final void d() {
        k kVar = (k) o0.i(this.f99801d);
        for (int i10 = 0; i10 < this.f99800c; i10++) {
            ((y) this.f99799b.get(i10)).e(this, kVar, this.f99798a);
        }
        this.f99801d = null;
    }

    protected final void e(k kVar) {
        for (int i10 = 0; i10 < this.f99800c; i10++) {
            ((y) this.f99799b.get(i10)).d(this, kVar, this.f99798a);
        }
    }

    protected final void f(k kVar) {
        this.f99801d = kVar;
        for (int i10 = 0; i10 < this.f99800c; i10++) {
            ((y) this.f99799b.get(i10)).a(this, kVar, this.f99798a);
        }
    }

    @Override // s9.g
    public /* synthetic */ Map getResponseHeaders() {
        return f.a(this);
    }
}
