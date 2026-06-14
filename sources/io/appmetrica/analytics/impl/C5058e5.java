package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C5058e5 implements Wa, La, InterfaceC5326oh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f77062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X4 f77063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4991bf f77064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5068ef f77065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S6 f77066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5576yi f77067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C5062e9 f77068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C5182j0 f77069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C5208k0 f77070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Wk f77071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Vg f77072k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final R8 f77073l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final PublicLogger f77074m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C5392r9 f77075n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Z4 f77076o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final InterfaceC5542x9 f77077p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C5461u3 f77078q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TimePassedChecker f77079r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C5573yf f77080s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zo f77081t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Ok f77082u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C5535x2 f77083v;

    public C5058e5(@NonNull Context context, @NonNull C5204jm c5204jm, @NonNull X4 x42, @NonNull C5487v4 c5487v4, @NonNull InterfaceC5276mh interfaceC5276mh, @NonNull AbstractC5007c5 abstractC5007c5) {
        this(context, x42, new C5208k0(), new TimePassedChecker(), new C5187j5(context, x42, c5487v4, abstractC5007c5, c5204jm, interfaceC5276mh, C5468ua.k().x().d(), PackageManagerUtils.getAppVersionCodeInt(context), C5468ua.k().l(), new W4()), c5487v4);
    }

    public final boolean A() {
        C5351ph c5351ph = (C5351ph) this.f77072k.a();
        return c5351ph.f77993n && this.f77079r.didTimePassSeconds(this.f77075n.f78138l, c5351ph.f77999t, "should force send permissions");
    }

    public final boolean B() {
        C5204jm c5204jm;
        C5573yf c5573yf = this.f77080s;
        c5573yf.f76590h.a(c5573yf.f76583a);
        boolean z10 = ((C5498vf) c5573yf.c()).f78455d;
        Vg vg2 = this.f77072k;
        synchronized (vg2) {
            c5204jm = vg2.f78426c.f76392a;
        }
        return !(z10 && c5204jm.f77556q);
    }

    public void C() {
    }

    @Override // io.appmetrica.analytics.impl.Wa, io.appmetrica.analytics.impl.Ul
    public final void a(@NonNull Nl nl, @Nullable C5204jm c5204jm) {
    }

    @Override // io.appmetrica.analytics.impl.La
    @NonNull
    public final X4 b() {
        return this.f77063b;
    }

    @NonNull
    public CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MANUAL;
    }

    public final void d() {
        C5182j0 c5182j0 = this.f77069h;
        synchronized (c5182j0) {
            c5182j0.f77452a = new Mc();
        }
        this.f77070i.a(this.f77069h.a(), this.f77064c);
    }

    public final synchronized void e() {
        ((C5388r5) this.f77077p).d();
    }

    @NonNull
    public final C5535x2 f() {
        return this.f77083v;
    }

    @NonNull
    public final C5461u3 g() {
        return this.f77078q;
    }

    @Override // io.appmetrica.analytics.impl.La
    @NonNull
    public final Context getContext() {
        return this.f77062a;
    }

    @NonNull
    public final C4991bf h() {
        return this.f77064c;
    }

    @NonNull
    public final S6 i() {
        return this.f77066e;
    }

    @NonNull
    public final R8 j() {
        return this.f77073l;
    }

    @NonNull
    public final C5062e9 k() {
        return this.f77068g;
    }

    @NonNull
    public final C5392r9 l() {
        return this.f77075n;
    }

    @NonNull
    public final InterfaceC5542x9 m() {
        return this.f77077p;
    }

    @NonNull
    public final C5351ph n() {
        return (C5351ph) this.f77072k.a();
    }

    @Nullable
    public final String o() {
        return this.f77064c.j();
    }

    @NonNull
    public final PublicLogger p() {
        return this.f77074m;
    }

    @NonNull
    public final C5068ef q() {
        return this.f77065d;
    }

    @NonNull
    public final Ok r() {
        return this.f77082u;
    }

    @NonNull
    public final Wk s() {
        return this.f77071j;
    }

    @NonNull
    public final C5204jm t() {
        C5204jm c5204jm;
        Vg vg2 = this.f77072k;
        synchronized (vg2) {
            c5204jm = vg2.f78426c.f76392a;
        }
        return c5204jm;
    }

    @NonNull
    public final zo u() {
        return this.f77081t;
    }

    public final void v() {
        C5392r9 c5392r9 = this.f77075n;
        int i10 = c5392r9.f78137k;
        c5392r9.f78139m = i10;
        c5392r9.f78127a.a(i10).b();
    }

    public final void w() {
        int iOptInt;
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        zo zoVar = this.f77081t;
        synchronized (zoVar) {
            iOptInt = zoVar.f78664a.a().optInt("last_migration_api_level", 0);
        }
        if (iOptInt < libraryApiLevel) {
            this.f77076o.getClass();
            Iterator it = CollectionsKt.listOf(new C4981b5(this)).iterator();
            while (it.hasNext()) {
                ((AbstractC4955a5) it.next()).a(iOptInt);
            }
            this.f77081t.b(libraryApiLevel);
        }
    }

    public final boolean x() {
        C5351ph c5351ph = (C5351ph) this.f77072k.a();
        return c5351ph.f77993n && c5351ph.isIdentifiersValid() && this.f77079r.didTimePassSeconds(this.f77075n.f78138l, c5351ph.f77998s, "need to check permissions");
    }

    public final boolean y() {
        C5392r9 c5392r9 = this.f77075n;
        return c5392r9.f78139m < c5392r9.f78137k && ((C5351ph) this.f77072k.a()).f77994o && ((C5351ph) this.f77072k.a()).isIdentifiersValid();
    }

    public final void z() {
        Vg vg2 = this.f77072k;
        synchronized (vg2) {
            vg2.f78424a = null;
        }
    }

    @Override // io.appmetrica.analytics.impl.Wa
    public final void a(@NonNull W5 w52) {
        String strA = Vf.a("Event received on service", EnumC5168ib.a(w52.f76617d), w52.getName(), w52.getValue());
        if (strA != null) {
            this.f77074m.info(strA, new Object[0]);
        }
        String str = this.f77063b.f76663b;
        if (TextUtils.isEmpty(str) || com.ironsource.X1.f42014f.equals(str)) {
            return;
        }
        this.f77067f.a(w52, new C5551xi());
    }

    public final void b(W5 w52) {
        this.f77069h.a(w52.f76619f);
        C5157i0 c5157i0A = this.f77069h.a();
        C5208k0 c5208k0 = this.f77070i;
        C4991bf c4991bf = this.f77064c;
        synchronized (c5208k0) {
            if (c5157i0A.f77363b > c4991bf.d().f77363b) {
                c4991bf.a(c5157i0A).b();
                this.f77074m.info("Save new app environment for %s. Value: %s", this.f77063b, c5157i0A.f77362a);
            }
        }
    }

    public C5058e5(Context context, X4 x42, C5208k0 c5208k0, TimePassedChecker timePassedChecker, C5187j5 c5187j5, C5487v4 c5487v4) {
        this.f77062a = context.getApplicationContext();
        this.f77063b = x42;
        this.f77070i = c5208k0;
        this.f77079r = timePassedChecker;
        zo zoVarF = c5187j5.f();
        this.f77081t = zoVarF;
        this.f77080s = C5468ua.k().t();
        C4991bf c4991bfA = c5187j5.e().a();
        this.f77064c = c4991bfA;
        this.f77083v = c5187j5.a(c4991bfA);
        Vg vgA = c5187j5.a(this);
        this.f77072k = vgA;
        PublicLogger publicLoggerA = c5187j5.d().a();
        this.f77074m = publicLoggerA;
        this.f77065d = C5468ua.k().z();
        C5182j0 c5182j0A = c5208k0.a(x42, publicLoggerA, c4991bfA);
        this.f77069h = c5182j0A;
        this.f77073l = c5187j5.a();
        S6 s6B = c5187j5.b(this);
        this.f77066e = s6B;
        Ai aiD = c5187j5.d(this);
        this.f77076o = C5187j5.b();
        w();
        Wk wkA = C5187j5.a(this, zoVarF, new C5033d5(this));
        this.f77071j = wkA;
        publicLoggerA.info("Read app environment for component %s. Value: %s", x42.toString(), c5182j0A.a().f77362a);
        Ok okC = c5187j5.c();
        this.f77082u = okC;
        this.f77075n = c5187j5.a(c4991bfA, zoVarF, wkA, s6B, c5182j0A, okC, aiD);
        C5062e9 c5062e9C = C5187j5.c(this);
        this.f77068g = c5062e9C;
        this.f77067f = C5187j5.a(this, c5062e9C);
        this.f77078q = c5187j5.b(c4991bfA);
        this.f77077p = c5187j5.a(aiD, s6B, vgA, c5487v4, x42, c4991bfA);
        s6B.e();
    }

    @Override // io.appmetrica.analytics.impl.Wa, io.appmetrica.analytics.impl.La
    public synchronized void a(@NonNull C5487v4 c5487v4) {
        long jLongValue;
        try {
            this.f77072k.a(c5487v4);
            boolean z10 = false;
            if (Boolean.TRUE.equals(c5487v4.f78416h)) {
                this.f77074m.setEnabled(true);
            } else {
                if (Boolean.FALSE.equals(c5487v4.f78416h)) {
                    this.f77074m.setEnabled(false);
                }
            }
            C5535x2 c5535x2 = this.f77083v;
            Set<String> set = c5487v4.f78423o;
            long jCurrentTimeMillis = c5535x2.f78548d.currentTimeMillis();
            boolean z11 = false;
            for (String str : set) {
                Long l10 = (Long) c5535x2.f78549e.get(str);
                if (l10 != null) {
                    jLongValue = l10.longValue();
                } else {
                    jLongValue = -1;
                    z11 = true;
                }
                if (jCurrentTimeMillis - jLongValue > c5535x2.f78546b) {
                    c5535x2.f78549e.put(str, Long.valueOf(jCurrentTimeMillis));
                    z10 = true;
                }
            }
            if (z10) {
                c5535x2.a(c5535x2.f78549e);
                c5535x2.f78545a.a(c5535x2.f78549e);
            }
            if (z11) {
                this.f77072k.e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.appmetrica.analytics.impl.Wa, io.appmetrica.analytics.impl.Ul
    public final synchronized void a(@NonNull C5204jm c5204jm) {
        this.f77072k.a(c5204jm);
        ((C5388r5) this.f77077p).e();
    }

    public final void a(@Nullable String str) {
        this.f77064c.j(str).b();
    }
}
