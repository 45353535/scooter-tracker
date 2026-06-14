package yads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class qe1 implements se1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ke1 f114972d = new ke1(2, -9223372036854775807L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ke1 f114973e = new ke1(3, -9223372036854775807L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f114974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public le1 f114975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f114976c;

    public qe1(String str) {
        this.f114974a = w83.d("ExoPlayer:Loader:".concat(str));
    }

    @Override // yads.se1
    public final void a() throws IOException {
        a(Integer.MIN_VALUE);
    }

    public final boolean b() {
        return this.f114975b != null;
    }

    public final void a(int i10) throws IOException {
        IOException iOException = this.f114976c;
        if (iOException != null) {
            throw iOException;
        }
        le1 le1Var = this.f114975b;
        if (le1Var != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = le1Var.f113070b;
            }
            IOException iOException2 = le1Var.f113074f;
            if (iOException2 != null && le1Var.f113075g > i10) {
                throw iOException2;
            }
        }
    }

    public final void a(ne1 ne1Var) {
        le1 le1Var = this.f114975b;
        if (le1Var != null) {
            le1Var.a(true);
        }
        if (ne1Var != null) {
            this.f114974a.execute(new oe1(ne1Var));
        }
        this.f114974a.shutdown();
    }

    public final long a(me1 me1Var, je1 je1Var, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            this.f114976c = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            le1 le1Var = new le1(this, looperMyLooper, me1Var, je1Var, i10, jElapsedRealtime);
            if (this.f114975b == null) {
                this.f114975b = le1Var;
                le1Var.f113074f = null;
                this.f114974a.execute(le1Var);
                return jElapsedRealtime;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }
}
