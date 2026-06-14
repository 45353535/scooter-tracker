package r;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import vh.e;
import vh.j0;
import vh.n;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f99176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f99177d;

    public c(j0 j0Var, Function1 function1) {
        super(j0Var);
        this.f99176c = function1;
    }

    @Override // vh.n, vh.j0
    public void H(e eVar, long j10) throws EOFException {
        if (this.f99177d) {
            eVar.skip(j10);
            return;
        }
        try {
            super.H(eVar, j10);
        } catch (IOException e10) {
            this.f99177d = true;
            this.f99176c.invoke(e10);
        }
    }

    @Override // vh.n, vh.j0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e10) {
            this.f99177d = true;
            this.f99176c.invoke(e10);
        }
    }

    @Override // vh.n, vh.j0, java.io.Flushable
    public void flush() {
        try {
            super.flush();
        } catch (IOException e10) {
            this.f99177d = true;
            this.f99176c.invoke(e10);
        }
    }
}
