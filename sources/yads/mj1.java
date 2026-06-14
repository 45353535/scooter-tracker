package yads;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
public final class mj1 implements oi1, Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f113533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nj1 f113534c;

    public mj1(nj1 nj1Var, pi1 pi1Var) {
        this.f113534c = nj1Var;
        Handler handlerA = w83.a((Handler.Callback) this);
        this.f113533b = handlerA;
        pi1Var.a(this, handlerA);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i10 = message.arg1;
        int i11 = message.arg2;
        int i12 = w83.f117341a;
        long j10 = ((((long) i10) & 4294967295L) << 32) | (4294967295L & ((long) i11));
        nj1 nj1Var = this.f113534c;
        if (this == nj1Var.f113939n1) {
            if (j10 == Long.MAX_VALUE) {
                nj1Var.f118230z0 = true;
            } else {
                try {
                    nj1Var.b(j10);
                    nj1Var.D();
                    nj1Var.B0.f109299e++;
                    nj1Var.V0 = true;
                    if (!nj1Var.T0) {
                        nj1Var.T0 = true;
                        nj1Var.I0.a(nj1Var.P0);
                        nj1Var.R0 = true;
                    }
                    nj1Var.a(j10);
                } catch (lm0 e10) {
                    this.f113534c.A0 = e10;
                }
            }
        }
        return true;
    }
}
