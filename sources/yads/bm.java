package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f109046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x5 f109047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public tz f109048c;

    public /* synthetic */ bm(Context context, c4 c4Var, pr3 pr3Var, v5 v5Var) {
        this(new Handler(Looper.getMainLooper()), new x5(context, c4Var, pr3Var, v5Var));
    }

    public final void a() {
        this.f109046a.post(new Runnable() { // from class: yads.p4
            @Override // java.lang.Runnable
            public final void run() {
                bm.a(this.f114546b);
            }
        });
    }

    public final void b() {
        this.f109047b.a();
        this.f109046a.post(new Runnable() { // from class: yads.q3
            @Override // java.lang.Runnable
            public final void run() {
                bm.b(this.f114864b);
            }
        });
    }

    public final void c() {
        this.f109046a.post(new Runnable() { // from class: yads.p3
            @Override // java.lang.Runnable
            public final void run() {
                bm.c(this.f114541b);
            }
        });
    }

    public final void d() {
        this.f109046a.post(new Runnable() { // from class: yads.b4
            @Override // java.lang.Runnable
            public final void run() {
                bm.d(this.f108901b);
            }
        });
    }

    public static final void a(bm bmVar) {
        tz tzVar = bmVar.f109048c;
        if (tzVar != null) {
            tzVar.closeBannerAd();
        }
    }

    public static final void c(bm bmVar) {
        tz tzVar = bmVar.f109048c;
        if (tzVar != null) {
            tzVar.onAdClicked();
            tzVar.onLeftApplication();
        }
    }

    public static final void d(bm bmVar) {
        tz tzVar = bmVar.f109048c;
        if (tzVar != null) {
            tzVar.onReturnedToApplication();
        }
    }

    public static final void b(bm bmVar) {
        tz tzVar = bmVar.f109048c;
        if (tzVar != null) {
            tzVar.onAdLoaded();
        }
    }

    public final void a(final k4 k4Var) {
        this.f109047b.a(k4Var.f112579b);
        this.f109046a.post(new Runnable() { // from class: yads.o3
            @Override // java.lang.Runnable
            public final void run() {
                bm.a(this.f114175b, k4Var);
            }
        });
    }

    public bm(Handler handler, x5 x5Var) {
        this.f109046a = handler;
        this.f109047b = x5Var;
    }

    public static final void a(bm bmVar, k4 k4Var) {
        tz tzVar = bmVar.f109048c;
        if (tzVar != null) {
            tzVar.a(k4Var);
        }
    }

    public final void a(final i5 i5Var) {
        this.f109046a.post(new Runnable() { // from class: yads.a4
            @Override // java.lang.Runnable
            public final void run() {
                bm.a(this.f108545b, i5Var);
            }
        });
    }

    public static final void a(bm bmVar, i5 i5Var) {
        tz tzVar = bmVar.f109048c;
        if (tzVar != null) {
            tzVar.a(i5Var);
        }
    }

    public final void a(c4 c4Var) {
        this.f109047b.f117706e = new h9(c4Var);
    }

    public final void a(vz1 vz1Var) {
        this.f109047b.f117707f = vz1Var;
    }
}
