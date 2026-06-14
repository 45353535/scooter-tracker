package q;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import q.p;
import vh.c0;
import vh.x;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f98597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p.a f98598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f98599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private vh.g f98600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c0 f98601f;

    public s(vh.g gVar, File file, p.a aVar) {
        super(null);
        this.f98597b = file;
        this.f98598c = aVar;
        this.f98600e = gVar;
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("cacheDirectory must be a directory.");
        }
    }

    private final void o() {
        if (this.f98599d) {
            throw new IllegalStateException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.f98599d = true;
            vh.g gVar = this.f98600e;
            if (gVar != null) {
                c0.i.d(gVar);
            }
            c0 c0Var = this.f98601f;
            if (c0Var != null) {
                p().h(c0Var);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // q.p
    public p.a m() {
        return this.f98598c;
    }

    @Override // q.p
    public synchronized vh.g n() {
        o();
        vh.g gVar = this.f98600e;
        if (gVar != null) {
            return gVar;
        }
        vh.l lVarP = p();
        c0 c0Var = this.f98601f;
        Intrinsics.checkNotNull(c0Var);
        vh.g gVarD = x.d(lVarP.s(c0Var));
        this.f98600e = gVarD;
        return gVarD;
    }

    public vh.l p() {
        return vh.l.f106875b;
    }
}
