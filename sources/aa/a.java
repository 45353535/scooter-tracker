package aa;

import lb.t;
import oa.l0;
import oa.r;
import oa.s;
import q9.j0;
import vb.k0;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final l0 f4141f = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final r f4142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.bidmachine.media3.common.a f4143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j0 f4144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t.a f4145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f4146e;

    a(r rVar, io.bidmachine.media3.common.a aVar, j0 j0Var, t.a aVar2, boolean z10) {
        this.f4142a = rVar;
        this.f4143b = aVar;
        this.f4144c = j0Var;
        this.f4145d = aVar2;
        this.f4146e = z10;
    }

    @Override // aa.f
    public boolean a(s sVar) {
        return this.f4142a.a(sVar, f4141f) == 0;
    }

    @Override // aa.f
    public void b(oa.t tVar) {
        this.f4142a.b(tVar);
    }

    @Override // aa.f
    public boolean isPackedAudioExtractor() {
        r underlyingImplementation = this.f4142a.getUnderlyingImplementation();
        return (underlyingImplementation instanceof vb.h) || (underlyingImplementation instanceof vb.b) || (underlyingImplementation instanceof vb.e) || (underlyingImplementation instanceof hb.f);
    }

    @Override // aa.f
    public boolean isReusable() {
        r underlyingImplementation = this.f4142a.getUnderlyingImplementation();
        return (underlyingImplementation instanceof k0) || (underlyingImplementation instanceof ib.h);
    }

    @Override // aa.f
    public void onTruncatedSegmentParsed() {
        this.f4142a.seek(0L, 0L);
    }

    @Override // aa.f
    public f recreate() {
        r fVar;
        q9.a.g(!isReusable());
        q9.a.h(this.f4142a.getUnderlyingImplementation() == this.f4142a, "Can't recreate wrapped extractors. Outer type: " + this.f4142a.getClass());
        r rVar = this.f4142a;
        if (rVar instanceof k) {
            fVar = new k(this.f4143b.f80550d, this.f4144c, this.f4145d, this.f4146e);
        } else if (rVar instanceof vb.h) {
            fVar = new vb.h();
        } else if (rVar instanceof vb.b) {
            fVar = new vb.b();
        } else if (rVar instanceof vb.e) {
            fVar = new vb.e();
        } else {
            if (!(rVar instanceof hb.f)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f4142a.getClass().getSimpleName());
            }
            fVar = new hb.f();
        }
        return new a(fVar, this.f4143b, this.f4144c, this.f4145d, this.f4146e);
    }
}
