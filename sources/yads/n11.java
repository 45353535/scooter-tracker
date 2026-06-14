package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class n11 implements o11 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f113688g = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rg f113689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pg f113690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f113691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mg f113692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p11 f113693e = p11.f114522b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f113694f;

    public n11(Context context, xg xgVar, rg rgVar, pg pgVar, ph1 ph1Var) {
        this.f113689a = rgVar;
        this.f113690b = pgVar;
        this.f113694f = ph1Var.a();
        this.f113691c = context.getApplicationContext();
    }

    public final void a(mg mgVar) {
        synchronized (f113688g) {
            try {
                this.f113689a.getClass();
                String str = mgVar.f113461a;
                String str2 = mgVar.f113462b;
                String str3 = mgVar.f113463c;
                boolean z10 = true;
                if (!(str3 == null || str3.length() == 0)) {
                    if (!(str == null || str.length() == 0)) {
                        if (str2 != null && str2.length() != 0) {
                            z10 = false;
                        }
                        if (!z10) {
                            this.f113692d = mgVar;
                        }
                    }
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        pg pgVar = this.f113690b;
        Context context = this.f113691c;
        ng ngVar = pgVar.f114661a;
        synchronized (ngVar.f113868a) {
            ngVar.f113869b.add(this);
        }
        try {
            pgVar.a(context);
        } catch (Throwable unused) {
            pgVar.c();
            boolean z10 = lb1.f113032a;
        }
    }
}
