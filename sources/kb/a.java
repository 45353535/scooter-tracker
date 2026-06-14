package kb;

import androidx.media3.common.MimeTypes;
import java.util.List;
import oa.l0;
import oa.o0;
import oa.q;
import oa.r;
import oa.s;
import oa.t;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f93151a = new o0(35152, 2, MimeTypes.IMAGE_PNG);

    @Override // oa.r
    public int a(s sVar, l0 l0Var) {
        return this.f93151a.a(sVar, l0Var);
    }

    @Override // oa.r
    public void b(t tVar) {
        this.f93151a.b(tVar);
    }

    @Override // oa.r
    public boolean c(s sVar) {
        return this.f93151a.c(sVar);
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
        this.f93151a.seek(j10, j11);
    }

    @Override // oa.r
    public void release() {
    }
}
