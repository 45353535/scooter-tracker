package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ic0 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f111955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mc0 f111956b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic0(mc0 mc0Var, Looper looper) {
        super(looper);
        this.f111956b = mc0Var;
    }

    public final boolean a(Message message, tj1 tj1Var) {
        long jMin;
        jc0 jc0Var = (jc0) message.obj;
        if (!jc0Var.f112294b) {
            return false;
        }
        int i10 = jc0Var.f112296d + 1;
        jc0Var.f112296d = i10;
        if (i10 > ((ld0) this.f111956b.f113410j).a(3)) {
            return false;
        }
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        Throwable lc0Var = tj1Var.getCause() instanceof IOException ? (IOException) tj1Var.getCause() : new lc0(tj1Var.getCause());
        fe1 fe1Var = this.f111956b.f113410j;
        int i11 = jc0Var.f112296d;
        ((ld0) fe1Var).getClass();
        if ((lc0Var instanceof ba2) || (lc0Var instanceof FileNotFoundException) || (lc0Var instanceof a01) || (lc0Var instanceof pe1)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i12 = d30.f109729c;
        while (lc0Var != null) {
            if ((lc0Var instanceof d30) && ((d30) lc0Var).f109730b == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            lc0Var = lc0Var.getCause();
        }
        jMin = Math.min((i11 - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f111955a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), jMin);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object objA;
        jc0 jc0Var = (jc0) message.obj;
        try {
            int i10 = message.what;
            if (i10 == 0) {
                objA = this.f111956b.f113412l.a((jm0) jc0Var.f112295c);
            } else {
                if (i10 != 1) {
                    throw new RuntimeException();
                }
                mc0 mc0Var = this.f111956b;
                objA = mc0Var.f113412l.a(mc0Var.f113413m, (gm0) jc0Var.f112295c);
            }
        } catch (tj1 e10) {
            boolean zA = a(message, e10);
            objA = e10;
            if (zA) {
                return;
            }
        } catch (Exception e11) {
            uf1.d("DefaultDrmSession", uf1.a("Key/provisioning request produced an unexpected exception. Not retrying.", e11));
            objA = e11;
        }
        fe1 fe1Var = this.f111956b.f113410j;
        long j10 = jc0Var.f112293a;
        fe1Var.getClass();
        synchronized (this) {
            try {
                if (!this.f111955a) {
                    this.f111956b.f113414n.obtainMessage(message.what, Pair.create(jc0Var.f112295c, objA)).sendToTarget();
                }
            } finally {
            }
        }
    }
}
