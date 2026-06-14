package ra;

import androidx.media3.common.MimeTypes;
import java.util.List;
import oa.l0;
import oa.o0;
import oa.q;
import oa.r;
import oa.s;
import oa.t;
import q9.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f99343a = new d0(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0 f99344b = new o0(-1, -1, MimeTypes.IMAGE_AVIF);

    private boolean d(s sVar, int i10) {
        this.f99343a.S(4);
        sVar.peekFully(this.f99343a.e(), 0, 4);
        return this.f99343a.J() == ((long) i10);
    }

    @Override // oa.r
    public int a(s sVar, l0 l0Var) {
        return this.f99344b.a(sVar, l0Var);
    }

    @Override // oa.r
    public void b(t tVar) {
        this.f99344b.b(tVar);
    }

    @Override // oa.r
    public boolean c(s sVar) {
        sVar.advancePeekPosition(4);
        return d(sVar, 1718909296) && d(sVar, 1635150182);
    }

    @Override // oa.r
    public /* synthetic */ List getSniffFailureDetails() {
        return q.a(this);
    }

    @Override // oa.r
    public /* synthetic */ r getUnderlyingImplementation() {
        return q.b(this);
    }

    @Override // oa.r
    public void seek(long j10, long j11) {
        this.f99344b.seek(j10, j11);
    }

    @Override // oa.r
    public void release() {
    }
}
