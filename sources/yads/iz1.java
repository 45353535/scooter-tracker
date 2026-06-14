package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class iz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cz1 f112191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f112192b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x5 f112193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o00 f112194d;

    public iz1(Context context, c4 c4Var, es2 es2Var, v5 v5Var, cz1 cz1Var) {
        this.f112191a = cz1Var;
        this.f112193c = new x5(context, c4Var, es2Var, v5Var);
    }

    public final void a(final k4 k4Var) {
        this.f112193c.a(k4Var.f112579b);
        this.f112192b.post(new Runnable() { // from class: yads.da
            @Override // java.lang.Runnable
            public final void run() {
                iz1.a(this.f109854b, k4Var);
            }
        });
    }

    public static final void a(iz1 iz1Var, k4 k4Var) {
        o00 o00Var = iz1Var.f112194d;
        if (o00Var != null) {
            ((wq3) o00Var).a(k4Var);
        }
        cz1 cz1Var = iz1Var.f112191a;
        bz1 bz1Var = (bz1) cz1Var.f109668a;
        bz1Var.f109160e.a();
        bz1Var.f109159d.remove(cz1Var);
    }

    public final void a(final jz1 jz1Var) {
        pz pzVar = qz.f115220c;
        o4.a("native");
        this.f112193c.a();
        this.f112192b.post(new Runnable() { // from class: yads.ba
            @Override // java.lang.Runnable
            public final void run() {
                iz1.a(this.f108948b, jz1Var);
            }
        });
    }

    public static final void a(iz1 iz1Var, jz1 jz1Var) {
        o00 o00Var = iz1Var.f112194d;
        if (o00Var != null) {
            if (jz1Var instanceof a32) {
                ((wq3) o00Var).b(jz1Var);
            } else {
                ((wq3) o00Var).a(jz1Var);
            }
        }
        cz1 cz1Var = iz1Var.f112191a;
        bz1 bz1Var = (bz1) cz1Var.f109668a;
        bz1Var.f109160e.a();
        bz1Var.f109159d.remove(cz1Var);
    }

    public final void a(final ArrayList arrayList) {
        pz pzVar = qz.f115220c;
        o4.a("native");
        this.f112193c.a();
        this.f112192b.post(new Runnable() { // from class: yads.ea
            @Override // java.lang.Runnable
            public final void run() {
                iz1.a(this.f110270b, arrayList);
            }
        });
    }

    public static final void a(iz1 iz1Var, List list) {
        iz1Var.getClass();
        cz1 cz1Var = iz1Var.f112191a;
        bz1 bz1Var = (bz1) cz1Var.f109668a;
        bz1Var.f109160e.a();
        bz1Var.f109159d.remove(cz1Var);
    }

    public final void a(final i12 i12Var) {
        pz pzVar = qz.f115220c;
        o4.a("native");
        this.f112193c.a();
        this.f112192b.post(new Runnable() { // from class: yads.ca
            @Override // java.lang.Runnable
            public final void run() {
                iz1.a(this.f109293b, i12Var);
            }
        });
    }

    public static final void a(iz1 iz1Var, i12 i12Var) {
        iz1Var.getClass();
        cz1 cz1Var = iz1Var.f112191a;
        bz1 bz1Var = (bz1) cz1Var.f109668a;
        bz1Var.f109160e.a();
        bz1Var.f109159d.remove(cz1Var);
    }

    public final void a(c4 c4Var) {
        this.f112193c.f117706e = new h9(c4Var);
    }

    public final void a(vz1 vz1Var) {
        this.f112193c.f117707f = vz1Var;
    }
}
