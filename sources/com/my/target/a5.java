package com.my.target;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.my.target.d;
import com.my.target.f1;
import com.my.target.l5;
import com.my.target.n6;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class a5 implements l5, n6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f59112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r6 f59113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n6 f59114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f59115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f59116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f59117f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f59118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f59119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f59120i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f59121j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f59122k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s6 f59123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l5.a f59124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j4 f59125n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f59126o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f59127p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f59128q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f59129r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f59130s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p6 f59131t;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a5.this.f();
        }
    }

    public class b implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.my.target.b f59133a;

        public b(com.my.target.b bVar) {
            this.f59133a = bVar;
        }

        @Override // com.my.target.d.a
        public void a(Context context) {
            l5.a aVar = a5.this.f59124m;
            if (aVar != null) {
                aVar.a(this.f59133a, context);
            }
        }
    }

    public static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f1 f59135a;

        public c(f1 f1Var) {
            this.f59135a = f1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            gb.a("InterstitialMraidPresenter$ShowCloseButtonRunnable: Banner became just closeable");
            this.f59135a.setCloseVisible(true);
        }
    }

    public a5(n6 n6Var, Handler handler, f1 f1Var, Context context) {
        this.f59130s = true;
        this.f59131t = p6.b();
        this.f59114c = n6Var;
        this.f59116e = context.getApplicationContext();
        this.f59117f = handler;
        this.f59112a = f1Var;
        if (context instanceof Activity) {
            this.f59115d = new WeakReference((Activity) context);
        } else {
            this.f59115d = new WeakReference(null);
        }
        this.f59120i = "loading";
        this.f59113b = r6.e();
        f1Var.setOnCloseListener(new f1.a() { // from class: k5.f
            @Override // com.my.target.f1.a
            public final void b() {
                this.f86026a.g();
            }
        });
        this.f59118g = new c(f1Var);
        this.f59119h = new i(context);
        n6Var.a(this);
    }

    private boolean h() {
        s6 s6Var;
        Activity activity = (Activity) this.f59115d.get();
        if (activity == null || (s6Var = this.f59123l) == null) {
            return false;
        }
        return kb.a(activity, s6Var);
    }

    private void k() {
        DisplayMetrics displayMetrics = this.f59116e.getResources().getDisplayMetrics();
        this.f59113b.a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.f59113b.b(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.f59113b.a(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.f59113b.c(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public final boolean a(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    @Override // com.my.target.n6.a
    public void b() {
        g();
    }

    @Override // com.my.target.n6.a
    public void c() {
        this.f59129r = true;
    }

    @Override // com.my.target.n6.a
    public boolean d() {
        gb.a("InterstitialMraidPresenter: Resize method not used with interstitials");
        return false;
    }

    @Override // com.my.target.b5
    public void destroy() {
        a(0);
    }

    public boolean e() {
        if (!"none".equals(this.f59131t.toString())) {
            return b(this.f59131t.a());
        }
        if (this.f59130s) {
            i();
            return true;
        }
        Activity activity = (Activity) this.f59115d.get();
        if (activity != null) {
            return b(kb.a(activity));
        }
        this.f59114c.a(MRAIDPresenter.SET_ORIENTATION_PROPERTIES, "Unable to set MRAID expand orientation to 'none'; expected passed in Activity Context.");
        return false;
    }

    public void f() {
        com.my.target.c cVarA;
        j4 j4Var = this.f59125n;
        if (j4Var == null || (cVarA = j4Var.a()) == null) {
            return;
        }
        f fVar = this.f59122k;
        if (fVar == null || !fVar.b()) {
            Activity activity = (Activity) this.f59115d.get();
            if (fVar == null || activity == null) {
                y3.a(cVarA.b(), this.f59116e);
            } else {
                fVar.a(activity);
            }
        }
    }

    public void g() {
        if (this.f59123l == null || "loading".equals(this.f59120i) || "hidden".equals(this.f59120i)) {
            return;
        }
        i();
        if ("default".equals(this.f59120i)) {
            this.f59112a.setVisibility(4);
            c("hidden");
        }
    }

    @Override // com.my.target.b5
    public View getCloseButton() {
        return null;
    }

    public void i() {
        Integer num;
        Activity activity = (Activity) this.f59115d.get();
        if (activity != null && (num = this.f59121j) != null) {
            activity.setRequestedOrientation(num.intValue());
        }
        this.f59121j = null;
    }

    @Override // com.my.target.b5
    public View j() {
        return this.f59112a;
    }

    @Override // com.my.target.b5
    public void pause() {
        this.f59126o = true;
        s6 s6Var = this.f59123l;
        if (s6Var != null) {
            s6Var.a(false);
        }
        this.f59117f.removeCallbacks(this.f59118g);
        if (this.f59128q > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f59128q;
            if (jCurrentTimeMillis > 0) {
                long j10 = this.f59127p;
                if (jCurrentTimeMillis < j10) {
                    this.f59127p = j10 - jCurrentTimeMillis;
                    return;
                }
            }
            this.f59127p = 0L;
        }
    }

    @Override // com.my.target.b5
    public void resume() {
        this.f59126o = false;
        s6 s6Var = this.f59123l;
        if (s6Var != null) {
            s6Var.e();
        }
        long j10 = this.f59127p;
        if (j10 > 0) {
            a(j10);
        }
    }

    @Override // com.my.target.b5
    public void stop() {
        this.f59126o = true;
        s6 s6Var = this.f59123l;
        if (s6Var != null) {
            s6Var.a(false);
        }
    }

    public static a5 a(Context context) {
        return new a5(context);
    }

    private void c(String str) {
        j4 j4Var;
        gb.a("InterstitialMraidPresenter: MRAID state set to " + str);
        this.f59120i = str;
        this.f59114c.e(str);
        if ("hidden".equals(str)) {
            gb.a("InterstitialMraidPresenter: Mraid on close");
            l5.a aVar = this.f59124m;
            if (aVar == null || (j4Var = this.f59125n) == null) {
                return;
            }
            aVar.b(j4Var, this.f59116e);
        }
    }

    @Override // com.my.target.n6.a
    public boolean b(Uri uri) {
        gb.a("InterstitialMraidPresenter: Expand method not used with interstitials");
        return false;
    }

    @Override // com.my.target.l5
    public void a(t4 t4Var, j4 j4Var) {
        this.f59125n = j4Var;
        long jL = (long) (j4Var.L() * 1000.0f);
        this.f59127p = jL;
        if (jL > 0) {
            this.f59112a.setCloseVisible(false);
            gb.a("InterstitialMraidPresenter: Banner will be allowed to close in " + this.f59127p + " millis");
            a(this.f59127p);
        } else {
            gb.a("InterstitialMraidPresenter: Banner is allowed to close");
            this.f59112a.setCloseVisible(true);
        }
        String strQ = j4Var.Q();
        if (strQ != null) {
            b(strQ);
        }
        a(j4Var);
    }

    public void b(String str) {
        s6 s6Var = new s6(this.f59116e);
        this.f59123l = s6Var;
        this.f59114c.a(s6Var);
        this.f59112a.addView(this.f59123l, new FrameLayout.LayoutParams(-1, -1));
        this.f59114c.f(str);
    }

    public boolean b(int i10) {
        Activity activity = (Activity) this.f59115d.get();
        if (activity != null && a(this.f59131t)) {
            if (this.f59121j == null) {
                this.f59121j = Integer.valueOf(activity.getRequestedOrientation());
            }
            activity.setRequestedOrientation(i10);
            return true;
        }
        this.f59114c.a(MRAIDPresenter.SET_ORIENTATION_PROPERTIES, "Attempted to lock orientation to unsupported value: " + this.f59131t.toString());
        return false;
    }

    @Override // com.my.target.l5
    public void a(l5.a aVar) {
        this.f59124m = aVar;
    }

    @Override // com.my.target.l5
    public void a(int i10) {
        s6 s6Var;
        this.f59117f.removeCallbacks(this.f59118g);
        if (!this.f59126o) {
            this.f59126o = true;
            if (i10 <= 0 && (s6Var = this.f59123l) != null) {
                s6Var.a(true);
            }
        }
        ViewParent parent = this.f59112a.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f59112a);
        }
        this.f59114c.a();
        s6 s6Var2 = this.f59123l;
        if (s6Var2 != null) {
            s6Var2.a(i10);
            this.f59123l = null;
        }
        this.f59112a.removeAllViews();
    }

    public a5(Context context) {
        this(n6.b("interstitial"), new Handler(Looper.getMainLooper()), new f1(context), context);
    }

    @Override // com.my.target.n6.a
    public void a(n6 n6Var, WebView webView) {
        j4 j4Var;
        this.f59120i = "default";
        k();
        ArrayList arrayList = new ArrayList();
        if (h()) {
            arrayList.add("'inlineVideo'");
        }
        arrayList.add("'vpaid'");
        n6Var.a(arrayList);
        n6Var.d("interstitial");
        n6Var.a(n6Var.c());
        c("default");
        n6Var.d();
        n6Var.a(this.f59113b);
        l5.a aVar = this.f59124m;
        if (aVar == null || (j4Var = this.f59125n) == null) {
            return;
        }
        aVar.a(j4Var, this.f59112a);
        this.f59124m.a(webView);
    }

    @Override // com.my.target.n6.a
    public void a(boolean z10) {
        this.f59114c.a(z10);
    }

    @Override // com.my.target.n6.a
    public boolean a(String str, JsResult jsResult) {
        gb.a("InterstitialMraidPresenter: JS Alert - " + str);
        jsResult.confirm();
        return true;
    }

    @Override // com.my.target.n6.a
    public boolean a(ConsoleMessage consoleMessage, n6 n6Var) {
        gb.a("InterstitialMraidPresenter: Console message - " + consoleMessage.message());
        return true;
    }

    @Override // com.my.target.n6.a
    public boolean a(boolean z10, p6 p6Var) {
        if (!a(p6Var)) {
            this.f59114c.a(MRAIDPresenter.SET_ORIENTATION_PROPERTIES, "Unable to force orientation to " + p6Var);
            return false;
        }
        this.f59130s = z10;
        this.f59131t = p6Var;
        return e();
    }

    @Override // com.my.target.n6.a
    public void a(Uri uri) {
        l5.a aVar = this.f59124m;
        if (aVar != null) {
            aVar.a(this.f59125n, uri.toString(), 1, this.f59112a.getContext());
        }
    }

    @Override // com.my.target.n6.a
    public void a() {
        k();
    }

    @Override // com.my.target.n6.a
    public boolean a(String str) {
        if (!this.f59129r) {
            this.f59114c.a("vpaidEvent", "Calling VPAID command before VPAID init");
            return false;
        }
        l5.a aVar = this.f59124m;
        boolean z10 = aVar != null;
        j4 j4Var = this.f59125n;
        if ((j4Var != null) & z10) {
            aVar.a(j4Var, str, this.f59116e);
        }
        return true;
    }

    @Override // com.my.target.n6.a
    public boolean a(float f10, float f11) {
        l5.a aVar;
        j4 j4Var;
        if (!this.f59129r) {
            this.f59114c.a("playheadEvent", "Calling VPAID command before VPAID init");
            return false;
        }
        if (f10 < 0.0f || f11 < 0.0f || (aVar = this.f59124m) == null || (j4Var = this.f59125n) == null) {
            return true;
        }
        aVar.a(j4Var, f10, f11, this.f59116e);
        return true;
    }

    @Override // com.my.target.n6.a
    public boolean a(int i10, int i11, int i12, int i13, boolean z10, int i14) {
        gb.a("InterstitialMraidPresenter: SetResizeProperties method not used with interstitials");
        return false;
    }

    public boolean a(p6 p6Var) {
        ActivityInfo activityInfo;
        int i10;
        if ("none".equals(p6Var.toString())) {
            return true;
        }
        Activity activity = (Activity) this.f59115d.get();
        if (activity == null) {
            return false;
        }
        try {
            activityInfo = activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 0);
            i10 = activityInfo.screenOrientation;
        } catch (Throwable unused) {
        }
        return i10 != -1 ? i10 == p6Var.a() : a(activityInfo.configChanges, 128) && a(activityInfo.configChanges, 1024);
    }

    private void a(long j10) {
        this.f59117f.removeCallbacks(this.f59118g);
        this.f59128q = System.currentTimeMillis();
        this.f59117f.postDelayed(this.f59118g, j10);
    }

    private void a(com.my.target.b bVar) {
        com.my.target.c cVarA = bVar.a();
        if (cVarA == null) {
            this.f59119h.setVisibility(8);
            return;
        }
        if (this.f59119h.getParent() != null) {
            return;
        }
        int iA = kb.a(10, this.f59116e);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(iA, iA, iA, iA);
        this.f59112a.addView(this.f59119h, layoutParams);
        this.f59119h.setImageBitmap(cVarA.c().getBitmap());
        this.f59119h.setOnClickListener(new a());
        List listA = cVarA.a();
        if (listA == null) {
            return;
        }
        f fVarA = f.a(listA, new q1());
        this.f59122k = fVarA;
        fVarA.a(new b(bVar));
    }
}
