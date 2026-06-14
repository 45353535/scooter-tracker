package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.AppMetrica;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class pg implements vg {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f114660g = TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ng f114661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xg f114662b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f114665e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f114663c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kg f114664d = new kg();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f114666f = new Object();

    public pg(ng ngVar, xg xgVar) {
        this.f114661a = ngVar;
        this.f114662b = xgVar;
    }

    public final void a() {
        boolean z10 = lb1.f113032a;
        ng ngVar = this.f114661a;
        synchronized (ngVar.f113868a) {
            ngVar.f113869b.clear();
            Unit unit = Unit.f93236a;
        }
    }

    public final void b() {
        final og ogVar = new og(this);
        this.f114663c.postDelayed(new Runnable() { // from class: yads.f10
            @Override // java.lang.Runnable
            public final void run() {
                pg.a(ogVar);
            }
        }, f114660g);
    }

    public final void c() {
        synchronized (this.f114666f) {
            this.f114663c.removeCallbacksAndMessages(null);
            this.f114665e = false;
            Unit unit = Unit.f93236a;
        }
    }

    public static final void a(Function0 function0) {
        function0.invoke();
    }

    public final void a(Context context) {
        boolean z10;
        synchronized (this.f114666f) {
            try {
                if (this.f114665e) {
                    z10 = false;
                } else {
                    z10 = true;
                    this.f114665e = true;
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            boolean z11 = lb1.f113032a;
            b();
            this.f114662b.getClass();
            try {
                AppMetrica.requestStartupParams(context, new zg(this), ah.f108686a);
            } catch (Throwable unused) {
                boolean z12 = lb1.f113032a;
                ug ugVar = ug.f116631b;
                c();
                this.f114664d.f112701a.getClass();
                String str = (String) lg.f113090a.get(ugVar);
                if (str == null) {
                    str = "Unknown";
                }
                kg.a(str);
                a();
            }
        }
    }
}
