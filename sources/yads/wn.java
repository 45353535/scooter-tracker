package yads;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wn implements c30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f117518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f117519b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f117520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h30 f117521d;

    public wn(boolean z10) {
        this.f117518a = z10;
    }

    @Override // yads.c30
    public final void a(e63 e63Var) {
        e63Var.getClass();
        if (this.f117519b.contains(e63Var)) {
            return;
        }
        this.f117519b.add(e63Var);
        this.f117520c++;
    }

    public final void b(h30 h30Var) {
        this.f117521d = h30Var;
        for (int i10 = 0; i10 < this.f117520c; i10++) {
            e63 e63Var = (e63) this.f117519b.get(i10);
            boolean z10 = this.f117518a;
            qb0 qb0Var = (qb0) e63Var;
            synchronized (qb0Var) {
                try {
                    nk2 nk2Var = qb0.f114909n;
                    if (z10 && (h30Var.f111460i & 8) != 8) {
                        if (qb0Var.f114921f == 0) {
                            ((r23) qb0Var.f114919d).getClass();
                            qb0Var.f114922g = SystemClock.elapsedRealtime();
                        }
                        qb0Var.f114921f++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // yads.c30
    public /* synthetic */ Map c() {
        return s4.a(this);
    }

    public final void g() {
        int i10;
        my2 my2Var;
        float f10;
        h30 h30Var = this.f117521d;
        int i11 = w83.f117341a;
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.f117520c) {
            e63 e63Var = (e63) this.f117519b.get(i13);
            boolean z10 = this.f117518a;
            qb0 qb0Var = (qb0) e63Var;
            synchronized (qb0Var) {
                try {
                    nk2 nk2Var = qb0.f114909n;
                    if (!z10 || (h30Var.f111460i & 8) == 8) {
                        i10 = i13;
                    } else {
                        if (qb0Var.f114921f <= 0) {
                            throw new IllegalStateException();
                        }
                        ((r23) qb0Var.f114919d).getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i14 = (int) (jElapsedRealtime - qb0Var.f114922g);
                        qb0Var.f114925j += (long) i14;
                        long j10 = qb0Var.f114926k;
                        long j11 = qb0Var.f114923h;
                        qb0Var.f114926k = j10 + j11;
                        if (i14 > 0) {
                            float f11 = (j11 * 8000.0f) / i14;
                            ny2 ny2Var = qb0Var.f114918c;
                            int iSqrt = (int) Math.sqrt(j11);
                            if (ny2Var.f114130d != 1) {
                                Collections.sort(ny2Var.f114128b, ny2.f114125h);
                                ny2Var.f114130d = 1;
                            }
                            int i15 = ny2Var.f114133g;
                            if (i15 > 0) {
                                my2[] my2VarArr = ny2Var.f114129c;
                                int i16 = i15 - 1;
                                ny2Var.f114133g = i16;
                                my2Var = my2VarArr[i16];
                            } else {
                                my2Var = new my2();
                            }
                            int i17 = ny2Var.f114131e;
                            ny2Var.f114131e = i17 + 1;
                            my2Var.f113655a = i17;
                            my2Var.f113656b = iSqrt;
                            my2Var.f113657c = f11;
                            ny2Var.f114128b.add(my2Var);
                            ny2Var.f114132f += iSqrt;
                            while (true) {
                                int i18 = ny2Var.f114132f;
                                int i19 = ny2Var.f114127a;
                                if (i18 <= i19) {
                                    break;
                                }
                                int i20 = i18 - i19;
                                my2 my2Var2 = (my2) ny2Var.f114128b.get(i12);
                                int i21 = my2Var2.f113656b;
                                if (i21 <= i20) {
                                    ny2Var.f114132f -= i21;
                                    ny2Var.f114128b.remove(i12);
                                    int i22 = ny2Var.f114133g;
                                    if (i22 < 5) {
                                        my2[] my2VarArr2 = ny2Var.f114129c;
                                        ny2Var.f114133g = i22 + 1;
                                        my2VarArr2[i22] = my2Var2;
                                    }
                                } else {
                                    my2Var2.f113656b = i21 - i20;
                                    ny2Var.f114132f -= i20;
                                }
                            }
                            if (qb0Var.f114925j >= 2000 || qb0Var.f114926k >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                                ny2 ny2Var2 = qb0Var.f114918c;
                                if (ny2Var2.f114130d != 0) {
                                    Collections.sort(ny2Var2.f114128b, ny2.f114126i);
                                    ny2Var2.f114130d = i12;
                                }
                                float f12 = 0.5f * ny2Var2.f114132f;
                                int i23 = i12;
                                int i24 = i23;
                                while (true) {
                                    if (i23 < ny2Var2.f114128b.size()) {
                                        my2 my2Var3 = (my2) ny2Var2.f114128b.get(i23);
                                        i24 += my2Var3.f113656b;
                                        if (i24 >= f12) {
                                            f10 = my2Var3.f113657c;
                                            break;
                                        }
                                        i23++;
                                    } else if (ny2Var2.f114128b.isEmpty()) {
                                        f10 = Float.NaN;
                                    } else {
                                        ArrayList arrayList = ny2Var2.f114128b;
                                        f10 = ((my2) arrayList.get(arrayList.size() - 1)).f113657c;
                                    }
                                }
                                qb0Var.f114927l = (long) f10;
                            }
                            long j12 = qb0Var.f114923h;
                            long j13 = qb0Var.f114927l;
                            if (i14 == 0 && j12 == 0) {
                                i10 = i13;
                                if (j13 == qb0Var.f114928m) {
                                }
                                qb0Var.f114922g = jElapsedRealtime;
                                qb0Var.f114923h = 0L;
                            } else {
                                i10 = i13;
                            }
                            qb0Var.f114928m = j13;
                            qb0Var.f114917b.a(i14, j12, j13);
                            qb0Var.f114922g = jElapsedRealtime;
                            qb0Var.f114923h = 0L;
                        } else {
                            i10 = i13;
                        }
                        qb0Var.f114921f--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i13 = i10 + 1;
            i12 = 0;
        }
        this.f117521d = null;
    }

    public final void h() {
        for (int i10 = 0; i10 < this.f117520c; i10++) {
            ((e63) this.f117519b.get(i10)).getClass();
        }
    }

    public final void c(int i10) {
        h30 h30Var = this.f117521d;
        int i11 = w83.f117341a;
        for (int i12 = 0; i12 < this.f117520c; i12++) {
            e63 e63Var = (e63) this.f117519b.get(i12);
            boolean z10 = this.f117518a;
            qb0 qb0Var = (qb0) e63Var;
            synchronized (qb0Var) {
                nk2 nk2Var = qb0.f114909n;
                if (z10 && (h30Var.f111460i & 8) != 8) {
                    qb0Var.f114923h += (long) i10;
                }
            }
        }
    }
}
