package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes4.dex */
public final class du0 implements kp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nu0 f110071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gu0 f110073c = new gu0();

    public du0(int i10, nu0 nu0Var) {
        this.f110071a = nu0Var;
        this.f110072b = i10;
    }

    @Override // yads.kp
    public /* synthetic */ void a() {
        nh.a(this);
    }

    public final long a(yc0 yc0Var) throws EOFException, InterruptedIOException {
        long j10;
        while (true) {
            long j11 = yc0Var.f118152d + ((long) yc0Var.f118154f);
            long j12 = 6;
            if (j11 >= yc0Var.f118151c - 6) {
                j10 = 6;
                break;
            }
            nu0 nu0Var = this.f110071a;
            int i10 = this.f110072b;
            gu0 gu0Var = this.f110073c;
            byte[] bArr = new byte[2];
            yc0Var.b(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) == i10) {
                w92 w92Var = new w92(16);
                System.arraycopy(bArr, 0, w92Var.f117356a, 0, 2);
                byte[] bArr2 = w92Var.f117356a;
                int i11 = 0;
                while (true) {
                    if (i11 >= 14) {
                        j10 = j12;
                        break;
                    }
                    j10 = j12;
                    int iD = yc0Var.d(bArr2, 2 + i11, 14 - i11);
                    if (iD == -1) {
                        break;
                    }
                    i11 += iD;
                    j12 = j10;
                }
                w92Var.d(i11);
                yc0Var.f118154f = 0;
                yc0Var.a(false, (int) (j11 - yc0Var.f118152d));
                if (hu0.a(w92Var, nu0Var, i10, gu0Var)) {
                    break;
                }
            } else {
                yc0Var.f118154f = 0;
                yc0Var.a(false, (int) (j11 - yc0Var.f118152d));
            }
            yc0Var.a(false, 1);
        }
        long j13 = yc0Var.f118152d + ((long) yc0Var.f118154f);
        long j14 = yc0Var.f118151c;
        if (j13 < j14 - j10) {
            return this.f110073c.f111339a;
        }
        yc0Var.a(false, (int) (j14 - j13));
        return this.f110071a.f114043j;
    }

    @Override // yads.kp
    public final jp a(yc0 yc0Var, long j10) throws EOFException, InterruptedIOException {
        long j11 = yc0Var.f118152d;
        long jA = a(yc0Var);
        long j12 = yc0Var.f118152d + ((long) yc0Var.f118154f);
        yc0Var.a(false, Math.max(6, this.f110071a.f114036c));
        long jA2 = a(yc0Var);
        long j13 = yc0Var.f118152d + ((long) yc0Var.f118154f);
        if (jA <= j10 && jA2 > j10) {
            return new jp(0, -9223372036854775807L, j12);
        }
        if (jA2 <= j10) {
            return new jp(-2, jA2, j13);
        }
        return new jp(-1, jA, j11);
    }
}
