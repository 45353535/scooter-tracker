package q;

import java.io.Closeable;
import q.p;
import vh.c0;
import vh.x;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c0 f98587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vh.l f98588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f98589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Closeable f98590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p.a f98591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f98592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private vh.g f98593h;

    public o(c0 c0Var, vh.l lVar, String str, Closeable closeable, p.a aVar) {
        super(null);
        this.f98587b = c0Var;
        this.f98588c = lVar;
        this.f98589d = str;
        this.f98590e = closeable;
        this.f98591f = aVar;
    }

    private final void o() {
        if (this.f98592g) {
            throw new IllegalStateException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.f98592g = true;
            vh.g gVar = this.f98593h;
            if (gVar != null) {
                c0.i.d(gVar);
            }
            Closeable closeable = this.f98590e;
            if (closeable != null) {
                c0.i.d(closeable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // q.p
    public p.a m() {
        return this.f98591f;
    }

    @Override // q.p
    public synchronized vh.g n() {
        o();
        vh.g gVar = this.f98593h;
        if (gVar != null) {
            return gVar;
        }
        vh.g gVarD = x.d(q().s(this.f98587b));
        this.f98593h = gVarD;
        return gVarD;
    }

    public final String p() {
        return this.f98589d;
    }

    public vh.l q() {
        return this.f98588c;
    }
}
