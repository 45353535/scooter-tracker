package ka;

import java.io.FileNotFoundException;
import java.io.IOException;
import ka.m;
import ka.o;
import n9.x;

/* JADX INFO: loaded from: classes12.dex */
public class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f93102a;

    public k() {
        this(-1);
    }

    @Override // ka.m
    public m.b a(m.a aVar, m.c cVar) {
        if (!c(cVar.f93111c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new m.b(1, 300000L);
        }
        if (aVar.a(2)) {
            return new m.b(2, 60000L);
        }
        return null;
    }

    @Override // ka.m
    public long b(m.c cVar) {
        IOException iOException = cVar.f93111c;
        if ((iOException instanceof x) || (iOException instanceof FileNotFoundException) || (iOException instanceof s9.q) || (iOException instanceof o.h) || s9.h.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.f93112d - 1) * 1000, 5000);
    }

    protected boolean c(IOException iOException) {
        if (!(iOException instanceof s9.t)) {
            return false;
        }
        int i10 = ((s9.t) iOException).f99887e;
        return i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503;
    }

    @Override // ka.m
    public int getMinimumLoadableRetryCount(int i10) {
        int i11 = this.f93102a;
        return i11 == -1 ? i10 == 7 ? 6 : 3 : i11;
    }

    @Override // ka.m
    public /* synthetic */ void onLoadTaskConcluded(long j10) {
        l.a(this, j10);
    }

    public k(int i10) {
        this.f93102a = i10;
    }
}
