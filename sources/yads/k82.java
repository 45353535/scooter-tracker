package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class k82 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i82 f112642g = new i82();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f112643h = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile k82 f112644i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h82 f112647c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f112649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f112650f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f112645a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f112646b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f82 f112648d = new f82();

    public k82(Context context) {
        this.f112647c = new h82(context);
    }

    public final void a(za3 za3Var) {
        synchronized (this.f112645a) {
            try {
                this.f112648d.b(za3Var);
                if (!this.f112648d.a()) {
                    h82 h82Var = this.f112647c;
                    sm2 sm2Var = h82Var.f111515c;
                    Context context = h82Var.f111513a;
                    sm2Var.getClass();
                    sm2.a(context, "om_sdk_js_request_tag");
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(za3 za3Var) {
        boolean z10;
        synchronized (this.f112645a) {
            try {
                z10 = this.f112650f;
                if (!z10) {
                    this.f112648d.a(za3Var);
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            za3Var.a();
        } else {
            a();
        }
    }

    public final void c() {
        synchronized (this.f112645a) {
            this.f112646b.removeCallbacksAndMessages(null);
            this.f112649e = false;
            Unit unit = Unit.f93236a;
        }
    }

    public final void b() {
        this.f112646b.postDelayed(new Runnable() { // from class: yads.va
            @Override // java.lang.Runnable
            public final void run() {
                k82.a(this.f116910b);
            }
        }, f112643h);
    }

    public final void a() {
        boolean z10;
        synchronized (this.f112645a) {
            try {
                if (this.f112649e) {
                    z10 = false;
                } else {
                    z10 = true;
                    this.f112649e = true;
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            b();
            this.f112647c.a(new j82(this));
        }
    }

    public static final void a(k82 k82Var) {
        h82 h82Var = k82Var.f112647c;
        sm2 sm2Var = h82Var.f111515c;
        Context context = h82Var.f111513a;
        sm2Var.getClass();
        sm2.a(context, "om_sdk_js_request_tag");
        synchronized (k82Var.f112645a) {
            k82Var.f112650f = true;
            Unit unit = Unit.f93236a;
        }
        k82Var.c();
        k82Var.f112648d.b();
    }
}
