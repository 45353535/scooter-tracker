package com.explorestack.iab.vast.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import androidx.core.view.ViewCompat;
import e2.c;
import e2.g;
import f2.d;
import f2.e;
import f2.i;
import f2.m;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class VastActivity extends Activity {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final Map f18181i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final Map f18182j = new ConcurrentHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static WeakReference f18183k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static WeakReference f18184l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static WeakReference f18185m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f18186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private VastView f18187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f2.b f18188d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f18190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f18191g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f18189e = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final i f18192h = new b();

    class b implements i {
        b() {
        }

        @Override // f2.i
        public void a(VastView vastView, e eVar) {
            if (VastActivity.this.f18188d != null) {
                VastActivity.this.f18188d.c(VastActivity.this, eVar);
            }
        }

        @Override // f2.i
        public void b(VastView vastView, e eVar, int i10) {
            int iF = eVar.F();
            if (iF > -1) {
                i10 = iF;
            }
            VastActivity.this.c(i10);
        }

        @Override // f2.i
        public void c(VastView vastView, e eVar, boolean z10) {
            VastActivity.this.l(eVar, z10);
        }

        @Override // f2.i
        public void d(VastView vastView, e eVar, c cVar, String str) {
            if (VastActivity.this.f18188d != null) {
                VastActivity.this.f18188d.d(VastActivity.this, eVar, cVar, str);
            }
        }

        @Override // f2.i
        public void e(VastView vastView, e eVar) {
            if (VastActivity.this.f18188d != null) {
                VastActivity.this.f18188d.e(VastActivity.this, eVar);
            }
        }

        @Override // f2.i
        public void f(VastView vastView, e eVar, b2.b bVar) {
            VastActivity.this.i(eVar, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i10) {
        setRequestedOrientation(i10 == 1 ? 7 : i10 == 2 ? 6 : 4);
    }

    private void g(VastView vastView) {
        g.f(this);
        g.F(vastView);
        setContentView(vastView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(e eVar, b2.b bVar) {
        f2.b bVar2 = this.f18188d;
        if (bVar2 != null) {
            bVar2.a(eVar, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(e eVar, boolean z10) {
        f2.b bVar = this.f18188d;
        if (bVar != null && !this.f18191g) {
            bVar.f(this, eVar, z10);
        }
        this.f18191g = true;
        try {
            getWindow().clearFlags(128);
        } catch (Exception e10) {
            f2.c.c("VastActivity", e10.getMessage(), new Object[0]);
        }
        if (eVar != null) {
            c(eVar.L());
        }
        finish();
        overridePendingTransition(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(e eVar, VastView vastView) {
        f18182j.put(eVar.H(), new WeakReference(vastView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p(e eVar, f2.b bVar) {
        f18181i.put(eVar.H(), new WeakReference(bVar));
    }

    private Integer q(e eVar) {
        int iF = eVar.F();
        if (iF > -1) {
            return Integer.valueOf(iF);
        }
        int iK = eVar.K();
        if (iK == 0 || iK == getResources().getConfiguration().orientation) {
            return null;
        }
        return Integer.valueOf(iK);
    }

    private static f2.b s(e eVar) {
        WeakReference weakReference = (WeakReference) f18181i.get(eVar.H());
        if (weakReference != null && weakReference.get() != null) {
            return (f2.b) weakReference.get();
        }
        u(eVar);
        return null;
    }

    private static VastView t(e eVar) {
        WeakReference weakReference = (WeakReference) f18182j.get(eVar.H());
        if (weakReference != null && weakReference.get() != null) {
            return (VastView) weakReference.get();
        }
        v(eVar);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(e eVar) {
        f18181i.remove(eVar.H());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void v(e eVar) {
        f18182j.remove(eVar.H());
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        VastView vastView = this.f18187c;
        if (vastView != null) {
            vastView.u0();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        Integer numQ;
        getWindow().setBackgroundDrawable(new ColorDrawable(ViewCompat.MEASURED_STATE_MASK));
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        this.f18186b = m.a(getIntent().getStringExtra("vast_request_id"));
        if (bundle != null && bundle.getBoolean("isFinishedPerformed")) {
            finish();
            return;
        }
        e eVar = this.f18186b;
        if (eVar == null) {
            i(null, b2.b.f("VastRequest is null"));
            l(null, false);
            return;
        }
        if (bundle == null && (numQ = q(eVar)) != null) {
            c(numQ.intValue());
            try {
                if ((getPackageManager().getActivityInfo(getComponentName(), 65536).configChanges & 128) == 0) {
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.f18188d = s(this.f18186b);
        VastView vastViewT = t(this.f18186b);
        this.f18187c = vastViewT;
        if (vastViewT == null) {
            this.f18189e = true;
            this.f18187c = new VastView(this);
        }
        this.f18187c.setId(1);
        this.f18187c.setListener(this.f18192h);
        WeakReference weakReference = f18183k;
        if (weakReference != null) {
            VastView vastView = this.f18187c;
            androidx.privacysandbox.ads.adservices.topics.a.a(weakReference.get());
            vastView.setPlaybackListener(null);
        }
        WeakReference weakReference2 = f18184l;
        if (weakReference2 != null) {
            VastView vastView2 = this.f18187c;
            androidx.privacysandbox.ads.adservices.topics.a.a(weakReference2.get());
            vastView2.setAdMeasurer(null);
        }
        WeakReference weakReference3 = f18185m;
        if (weakReference3 != null) {
            this.f18187c.setPostBannerAdMeasurer((d2.b) weakReference3.get());
        }
        if (bundle == null || !bundle.getBoolean("isLoadPerformed")) {
            this.f18190f = true;
            if (!this.f18187c.f0(this.f18186b, Boolean.TRUE)) {
                return;
            }
        }
        g(this.f18187c);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        e eVar;
        VastView vastView;
        super.onDestroy();
        if (isChangingConfigurations() || (eVar = this.f18186b) == null) {
            return;
        }
        VastView vastView2 = this.f18187c;
        l(eVar, vastView2 != null && vastView2.z0());
        if (this.f18189e && (vastView = this.f18187c) != null) {
            vastView.e0();
        }
        u(this.f18186b);
        v(this.f18186b);
        f18183k = null;
        f18184l = null;
        f18185m = null;
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("isLoadPerformed", this.f18190f);
        bundle.putBoolean("isFinishedPerformed", this.f18191g);
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f18193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private f2.b f18194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private VastView f18195c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d2.b f18196d;

        Intent a(Context context) {
            Intent intent = new Intent(context, (Class<?>) VastActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        }

        public b2.b b(Context context) {
            e eVar = this.f18193a;
            if (eVar == null) {
                f2.c.c("VastActivity", "VastRequest is null", new Object[0]);
                return b2.b.f("VastRequest is null");
            }
            try {
                m.b(eVar);
                Intent intentA = a(context);
                intentA.putExtra("vast_request_id", this.f18193a.H());
                f2.b bVar = this.f18194b;
                if (bVar != null) {
                    VastActivity.p(this.f18193a, bVar);
                }
                VastView vastView = this.f18195c;
                if (vastView != null) {
                    VastActivity.o(this.f18193a, vastView);
                }
                WeakReference unused = VastActivity.f18183k = null;
                WeakReference unused2 = VastActivity.f18184l = null;
                if (this.f18196d != null) {
                    WeakReference unused3 = VastActivity.f18185m = new WeakReference(this.f18196d);
                } else {
                    WeakReference unused4 = VastActivity.f18185m = null;
                }
                context.startActivity(intentA);
                return null;
            } catch (Throwable th2) {
                f2.c.b("VastActivity", th2);
                VastActivity.u(this.f18193a);
                VastActivity.v(this.f18193a);
                WeakReference unused5 = VastActivity.f18183k = null;
                WeakReference unused6 = VastActivity.f18184l = null;
                WeakReference unused7 = VastActivity.f18185m = null;
                return b2.b.j("Exception during displaying VastActivity", th2);
            }
        }

        public a d(f2.b bVar) {
            this.f18194b = bVar;
            return this;
        }

        public a f(d2.b bVar) {
            this.f18196d = bVar;
            return this;
        }

        public a g(e eVar) {
            this.f18193a = eVar;
            return this;
        }

        public a h(VastView vastView) {
            this.f18195c = vastView;
            return this;
        }

        public a c(d2.c cVar) {
            return this;
        }

        public a e(d dVar) {
            return this;
        }
    }
}
