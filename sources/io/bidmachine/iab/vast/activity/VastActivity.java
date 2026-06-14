package io.bidmachine.iab.vast.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import b9.u;
import c9.e;
import c9.f;
import c9.g;
import c9.i;
import c9.m;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.Map;
import pd.b0;

/* JADX INFO: loaded from: classes12.dex */
public class VastActivity extends io.bidmachine.rendering.internal.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final Map f80316i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final Map f80317j = new ConcurrentHashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static WeakReference f80318k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static WeakReference f80319l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static WeakReference f80320m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f80322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private VastView f80323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c9.b f80324e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f80326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f80327h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f80321b = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f80325f = false;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g f80328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c9.b f80329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private VastView f80330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f f80331d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private a9.c f80332e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private a9.b f80333f;

        Intent a(Context context) {
            Intent intent = new Intent(context, (Class<?>) VastActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        }

        public y8.b b(Context context) {
            g gVar = this.f80328a;
            if (gVar == null) {
                e.b("VastActivity", "VastRequest is null", new Object[0]);
                return y8.b.f("VastRequest is null");
            }
            try {
                i.b(gVar);
                Intent intentA = a(context);
                intentA.putExtra("vast_request_id", this.f80328a.H());
                c9.b bVar = this.f80329b;
                if (bVar != null) {
                    VastActivity.s(this.f80328a, bVar);
                }
                VastView vastView = this.f80330c;
                if (vastView != null) {
                    VastActivity.t(this.f80328a, vastView);
                }
                if (this.f80331d != null) {
                    WeakReference unused = VastActivity.f80318k = new WeakReference(this.f80331d);
                } else {
                    WeakReference unused2 = VastActivity.f80318k = null;
                }
                if (this.f80332e != null) {
                    WeakReference unused3 = VastActivity.f80319l = new WeakReference(this.f80332e);
                } else {
                    WeakReference unused4 = VastActivity.f80319l = null;
                }
                if (this.f80333f != null) {
                    WeakReference unused5 = VastActivity.f80320m = new WeakReference(this.f80333f);
                } else {
                    WeakReference unused6 = VastActivity.f80320m = null;
                }
                context.startActivity(intentA);
                return null;
            } catch (Throwable th2) {
                e.c("VastActivity", th2);
                VastActivity.y(this.f80328a);
                VastActivity.z(this.f80328a);
                WeakReference unused7 = VastActivity.f80318k = null;
                WeakReference unused8 = VastActivity.f80319l = null;
                WeakReference unused9 = VastActivity.f80320m = null;
                return y8.b.j("Exception during displaying VastActivity", th2);
            }
        }

        public a c(a9.c cVar) {
            this.f80332e = cVar;
            return this;
        }

        public a d(c9.b bVar) {
            this.f80329b = bVar;
            return this;
        }

        public a e(f fVar) {
            this.f80331d = fVar;
            return this;
        }

        public a f(a9.b bVar) {
            this.f80333f = bVar;
            return this;
        }

        public a g(g gVar) {
            this.f80328a = gVar;
            return this;
        }

        public a h(VastView vastView) {
            this.f80330c = vastView;
            return this;
        }
    }

    private class c implements m {
        private c() {
        }

        @Override // c9.m
        public void a(VastView vastView, g gVar, boolean z10) {
            VastActivity.this.l(gVar, z10);
        }

        @Override // c9.m
        public void b(VastView vastView, g gVar) {
            if (VastActivity.this.f80324e != null) {
                VastActivity.this.f80324e.onVastShown(VastActivity.this, gVar);
            }
        }

        @Override // c9.m
        public void c(VastView vastView, g gVar, b9.f fVar, String str) {
            if (VastActivity.this.f80324e != null) {
                VastActivity.this.f80324e.onVastClick(VastActivity.this, gVar, fVar, str);
            }
        }

        @Override // c9.m
        public void d(VastView vastView, g gVar, y8.b bVar) {
            VastActivity.this.k(gVar, bVar);
        }

        @Override // c9.m
        public void e(VastView vastView, g gVar) {
            if (VastActivity.this.f80324e != null) {
                VastActivity.this.f80324e.onVastComplete(VastActivity.this, gVar);
            }
        }

        @Override // c9.m
        public void f(VastView vastView, g gVar, int i10) {
            int iF = gVar.F();
            if (iF > -1) {
                i10 = iF;
            }
            VastActivity.this.g(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i10) {
        setRequestedOrientation(i10 == 1 ? 7 : i10 == 2 ? 6 : 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(g gVar, y8.b bVar) {
        c9.b bVar2 = this.f80324e;
        if (bVar2 != null) {
            bVar2.onVastShowFailed(gVar, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(g gVar, boolean z10) {
        c9.b bVar = this.f80324e;
        if (bVar != null && !this.f80327h) {
            bVar.onVastDismiss(this, gVar, z10);
        }
        this.f80327h = true;
        try {
            getWindow().clearFlags(128);
        } catch (Exception e10) {
            e.b("VastActivity", e10.getMessage(), new Object[0]);
        }
        if (gVar != null) {
            g(gVar.L());
        }
        b0.a(this);
    }

    private void p(VastView vastView) {
        u.g(this);
        u.F(vastView);
        setContentView(vastView);
        u.i(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void s(g gVar, c9.b bVar) {
        f80316i.put(gVar.H(), new WeakReference(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t(g gVar, VastView vastView) {
        f80317j.put(gVar.H(), new WeakReference(vastView));
    }

    private Integer u(g gVar) {
        int iF = gVar.F();
        if (iF > -1) {
            return Integer.valueOf(iF);
        }
        int iK = gVar.K();
        if (iK == 0 || iK == getResources().getConfiguration().orientation) {
            return null;
        }
        return Integer.valueOf(iK);
    }

    private static c9.b w(g gVar) {
        WeakReference weakReference = (WeakReference) f80316i.get(gVar.H());
        if (weakReference != null && weakReference.get() != null) {
            return (c9.b) weakReference.get();
        }
        y(gVar);
        return null;
    }

    private static VastView x(g gVar) {
        WeakReference weakReference = (WeakReference) f80317j.get(gVar.H());
        if (weakReference != null && weakReference.get() != null) {
            return (VastView) weakReference.get();
        }
        z(gVar);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void y(g gVar) {
        f80316i.remove(gVar.H());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void z(g gVar) {
        f80317j.remove(gVar.H());
    }

    @Override // io.bidmachine.rendering.internal.a
    protected void b() {
        VastView vastView = this.f80323d;
        if (vastView != null) {
            vastView.u0();
        }
    }

    @Override // io.bidmachine.rendering.internal.a, android.app.Activity
    protected void onCreate(Bundle bundle) {
        Integer numU;
        super.onCreate(bundle);
        this.f80322c = i.a(getIntent().getStringExtra("vast_request_id"));
        if (bundle != null && bundle.getBoolean("isFinishedPerformed")) {
            finish();
            return;
        }
        g gVar = this.f80322c;
        if (gVar == null) {
            k(null, y8.b.f("VastRequest is null"));
            l(null, false);
            return;
        }
        if (bundle == null && (numU = u(gVar)) != null) {
            g(numU.intValue());
            try {
                if ((getPackageManager().getActivityInfo(getComponentName(), 65536).configChanges & 128) == 0) {
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.f80324e = w(this.f80322c);
        VastView vastViewX = x(this.f80322c);
        this.f80323d = vastViewX;
        if (vastViewX == null) {
            this.f80325f = true;
            this.f80323d = new VastView(this);
        }
        this.f80323d.setId(1);
        this.f80323d.setListener(this.f80321b);
        WeakReference weakReference = f80318k;
        if (weakReference != null) {
            this.f80323d.setPlaybackListener((f) weakReference.get());
        }
        WeakReference weakReference2 = f80319l;
        if (weakReference2 != null) {
            this.f80323d.setAdMeasurer((a9.c) weakReference2.get());
        }
        WeakReference weakReference3 = f80320m;
        if (weakReference3 != null) {
            this.f80323d.setPostBannerAdMeasurer((a9.b) weakReference3.get());
        }
        if (bundle != null && bundle.getBoolean("isLoadPerformed")) {
            p(this.f80323d);
            return;
        }
        this.f80326g = true;
        if (this.f80323d.f0(this.f80322c, Boolean.TRUE)) {
            p(this.f80323d);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        g gVar;
        VastView vastView;
        super.onDestroy();
        if (isChangingConfigurations() || (gVar = this.f80322c) == null) {
            return;
        }
        VastView vastView2 = this.f80323d;
        l(gVar, vastView2 != null && vastView2.z0());
        if (this.f80325f && (vastView = this.f80323d) != null) {
            vastView.e0();
        }
        y(this.f80322c);
        z(this.f80322c);
        f80318k = null;
        f80319l = null;
        f80320m = null;
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("isLoadPerformed", this.f80326g);
        bundle.putBoolean("isFinishedPerformed", this.f80327h);
    }
}
