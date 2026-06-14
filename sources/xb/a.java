package xb;

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
    private final d0 f108165a = new d0(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0 f108166b = new o0(-1, -1, MimeTypes.IMAGE_WEBP);

    @Override // oa.r
    public int a(s sVar, l0 l0Var) {
        return this.f108166b.a(sVar, l0Var);
    }

    @Override // oa.r
    public void b(t tVar) {
        this.f108166b.b(tVar);
    }

    @Override // oa.r
    public boolean c(s sVar) {
        this.f108165a.S(4);
        sVar.peekFully(this.f108165a.e(), 0, 4);
        if (this.f108165a.J() != 1380533830) {
            return false;
        }
        sVar.advancePeekPosition(4);
        this.f108165a.S(4);
        sVar.peekFully(this.f108165a.e(), 0, 4);
        return this.f108165a.J() == 1464156752;
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
        this.f108166b.seek(j10, j11);
    }

    @Override // oa.r
    public void release() {
    }
}
