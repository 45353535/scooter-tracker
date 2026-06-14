package kh;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vh.j0;
import vh.n;

/* JADX INFO: loaded from: classes10.dex */
public class e extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f93228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f93229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j0 delegate, Function1 onException) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onException, "onException");
        this.f93228c = onException;
    }

    @Override // vh.n, vh.j0
    public void H(vh.e source, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f93229d) {
            source.skip(j10);
            return;
        }
        try {
            super.H(source, j10);
        } catch (IOException e10) {
            this.f93229d = true;
            this.f93228c.invoke(e10);
        }
    }

    @Override // vh.n, vh.j0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f93229d) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.f93229d = true;
            this.f93228c.invoke(e10);
        }
    }

    @Override // vh.n, vh.j0, java.io.Flushable
    public void flush() {
        if (this.f93229d) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f93229d = true;
            this.f93228c.invoke(e10);
        }
    }
}
