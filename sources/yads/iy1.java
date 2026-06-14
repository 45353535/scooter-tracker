package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class iy1 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f112183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l00 f112184b;

    public /* synthetic */ iy1() {
        this(new Handler(Looper.getMainLooper()));
    }

    public static final void c(iy1 iy1Var) {
        l00 l00Var = iy1Var.f112184b;
        if (l00Var != null) {
            l00Var.onReturnedToApplication();
        }
    }

    public final void a() {
        this.f112183a.post(new Runnable() { // from class: yads.aa
            @Override // java.lang.Runnable
            public final void run() {
                iy1.a(this.f108612b);
            }
        });
    }

    public final void b() {
        this.f112183a.post(new Runnable() { // from class: yads.y9
            @Override // java.lang.Runnable
            public final void run() {
                iy1.b(this.f118117b);
            }
        });
    }

    @Override // yads.g1
    public final void onReturnedToApplication() {
        this.f112183a.post(new Runnable() { // from class: yads.z9
            @Override // java.lang.Runnable
            public final void run() {
                iy1.c(this.f118598b);
            }
        });
    }

    public static final void a(iy1 iy1Var) {
        l00 l00Var = iy1Var.f112184b;
        if (l00Var != null) {
            l00Var.closeNativeAd();
        }
    }

    public static final void b(iy1 iy1Var) {
        l00 l00Var = iy1Var.f112184b;
        if (l00Var != null) {
            l00Var.onAdClicked();
        }
        l00 l00Var2 = iy1Var.f112184b;
        if (l00Var2 != null) {
            l00Var2.onLeftApplication();
        }
    }

    public iy1(Handler handler) {
        this.f112183a = handler;
    }

    public final void a(final i5 i5Var) {
        this.f112183a.post(new Runnable() { // from class: yads.j9
            @Override // java.lang.Runnable
            public final void run() {
                iy1.a(this.f112269b, i5Var);
            }
        });
    }

    public static final void a(iy1 iy1Var, i5 i5Var) {
        l00 l00Var = iy1Var.f112184b;
        if (l00Var != null) {
            l00Var.a(i5Var);
        }
    }
}
