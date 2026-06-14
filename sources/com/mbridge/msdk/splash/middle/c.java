package com.mbridge.msdk.splash.middle;

import android.R;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.ZoomOutTypeEnum;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.splash.manager.e;
import com.mbridge.msdk.splash.manager.f;
import com.mbridge.msdk.splash.view.BaseSplashPopView;
import com.mbridge.msdk.splash.view.MBSplashPopView;
import com.mbridge.msdk.splash.view.MBSplashView;

/* JADX INFO: loaded from: classes10.dex */
public class c {
    private static String D = "SplashProvider";
    private CampaignEx A;
    private MBSplashPopView B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f50818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MBridgeIds f50820c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f50822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f50823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f50824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f50825h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MBSplashShowListener f50826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d f50827j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MBSplashView f50828k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ViewGroup f50829l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f50830m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l f50831n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f50832o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ViewGroup f50833p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private j f50834q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f50835r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Activity f50842y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f50843z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50821d = 5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f50836s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f50837t = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f50838u = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Object f50839v = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Object f50840w = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f50841x = false;
    private boolean C = false;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f50844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f50845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f50846c;

        a(CampaignEx campaignEx, int i10, boolean z10) {
            this.f50844a = campaignEx;
            this.f50845b = i10;
            this.f50846c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a(this.f50844a, this.f50845b - 1, this.f50846c);
        }
    }

    public c(Activity activity, String str, String str2) {
        this.f50819b = TextUtils.isEmpty(str) ? "" : str;
        this.f50818a = str2;
        this.f50820c = new MBridgeIds(str, str2);
        this.f50842y = activity;
        b(activity);
    }

    public void b(boolean z10) {
        this.f50832o = z10;
    }

    public void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        } else if (this.f50825h != null) {
            this.f50825h.a(new com.mbridge.msdk.foundation.error.b(880035), 1);
        }
    }

    public int d() {
        return this.f50821d;
    }

    public long e() {
        return this.f50822e;
    }

    public boolean f() {
        return this.f50835r;
    }

    public boolean g() {
        return this.f50832o;
    }

    public void h() {
        f fVar = this.f50824g;
        if (fVar != null) {
            fVar.f();
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView == null || !this.C) {
            return;
        }
        mBSplashPopView.pauseCountDown();
    }

    public void i() {
        f fVar = this.f50824g;
        if (fVar != null) {
            fVar.g();
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView == null || !this.C) {
            return;
        }
        mBSplashPopView.reStartCountDown();
    }

    public void j() {
        this.C = true;
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView != null) {
            mBSplashPopView.startCountDown();
        }
    }

    public void k() {
        this.C = false;
        MBSplashShowListener mBSplashShowListener = this.f50826i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onZoomOutPlayFinish(new MBridgeIds(this.f50819b, this.f50818a));
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView != null) {
            mBSplashPopView.release();
        }
    }

    public void a(ViewGroup viewGroup) {
        this.f50833p = viewGroup;
    }

    public void b(String str) {
        a(str, 1);
    }

    public void d(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA != null) {
            d(str, viewGroupA);
            return;
        }
        MBSplashShowListener mBSplashShowListener = this.f50826i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(this.f50820c, "activity is except,please check it");
        }
    }

    public void a(int i10) {
        this.f50836s = i10;
    }

    public void b(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA == null) {
            if (this.f50825h != null) {
                this.f50825h.a(new com.mbridge.msdk.foundation.error.b(880036), 1);
                return;
            }
            return;
        }
        b(str, viewGroupA);
    }

    public void a(long j10) {
        this.f50822e = j10;
    }

    public void a(MBSplashLoadListener mBSplashLoadListener) {
        if (this.f50825h == null) {
            this.f50825h = new b(this, this.f50820c);
        }
        this.f50825h.a(mBSplashLoadListener);
    }

    public void c(boolean z10) {
        this.f50835r = z10;
    }

    public void d(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            MBSplashShowListener mBSplashShowListener = this.f50826i;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.f50820c, "token is null or empty");
                return;
            }
            return;
        }
        c(str, viewGroup);
    }

    public String c() {
        if (!this.f50841x) {
            e eVar = this.f50823f;
            if (eVar != null) {
                return eVar.d();
            }
            return "";
        }
        f fVar = this.f50824g;
        if (fVar != null) {
            return fVar.d();
        }
        return "";
    }

    public void a(MBSplashShowListener mBSplashShowListener) {
        this.f50826i = mBSplashShowListener;
    }

    public void b(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            if (this.f50825h != null) {
                this.f50825h.a(new com.mbridge.msdk.foundation.error.b(880035), 1);
                return;
            }
            return;
        }
        a(str, viewGroup);
    }

    public void a(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA == null) {
            if (this.f50825h != null) {
                this.f50825h.a(new com.mbridge.msdk.foundation.error.b(880036), 1);
                return;
            }
            return;
        }
        a(str, viewGroupA);
    }

    public void d(boolean z10) {
        this.f50843z = z10;
    }

    public void b(int i10) {
        this.f50821d = i10;
    }

    public void c(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA == null) {
            MBSplashShowListener mBSplashShowListener = this.f50826i;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.f50820c, "activity is except,please check it");
                return;
            }
            return;
        }
        c(str, viewGroupA);
    }

    public void a(String str, ViewGroup viewGroup) {
        this.f50829l = viewGroup;
        MBSplashView mBSplashView = this.f50828k;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        a(str, 2);
    }

    public void b(int i10, int i11) {
        a(i11, i10);
    }

    public String b() {
        if (!this.f50841x) {
            e eVar = this.f50823f;
            if (eVar != null) {
                return eVar.c();
            }
            return "";
        }
        f fVar = this.f50824g;
        if (fVar != null) {
            return fVar.c();
        }
        return "";
    }

    public void c(String str, ViewGroup viewGroup) {
        this.f50829l = viewGroup;
        MBSplashView mBSplashView = this.f50828k;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        CampaignEx campaignExA = com.mbridge.msdk.splash.manager.d.a(this.f50828k, this.f50819b, this.f50818a, str, this.f50835r, this.f50821d, true, false);
        if (campaignExA != null) {
            if (this.f50831n == null) {
                this.f50831n = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f50818a);
            }
            d dVar = new d(this, this.f50826i, campaignExA);
            this.f50827j = dVar;
            if (this.f50837t != 0 && this.f50838u != 0) {
                int i10 = this.f50821d;
                if (i10 >= 2 && i10 <= 10) {
                    b(campaignExA, this.f50831n.E(), false);
                    return;
                }
                dVar.a(this.f50820c, "countDownTime must in 2 - 10 ,but now is " + this.f50821d);
                return;
            }
            dVar.a(this.f50820c, "width or height is 0  or width or height is too small");
            return;
        }
        MBSplashShowListener mBSplashShowListener = this.f50826i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(this.f50820c, "campaignEx is vali");
        }
    }

    public boolean a(String str) {
        return com.mbridge.msdk.splash.manager.d.a(this.f50828k, this.f50819b, this.f50818a, str, this.f50835r, this.f50821d, false, true) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, int i10, boolean z10) {
        if (!com.mbridge.msdk.splash.manager.d.a(this.f50828k, campaignEx)) {
            if (i10 > 0) {
                this.f50824g.f50719y.postDelayed(new a(campaignEx, i10, z10), 1L);
                return;
            }
            d dVar = this.f50827j;
            if (dVar != null) {
                dVar.a(this.f50820c, "campaignEx is not ready");
                return;
            }
            return;
        }
        a(true);
        ViewGroup.LayoutParams layoutParams = this.f50829l.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
        this.f50829l.setLayoutParams(layoutParams);
        this.f50829l.removeAllViews();
        this.f50824g.c(this.f50821d);
        this.f50824g.a(this.f50833p);
        this.f50824g.a(this.f50827j);
        q0.b(D, "start show process");
        ViewGroup viewGroup = this.f50829l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            f1.a(this.f50828k);
            this.f50829l.addView(this.f50828k);
        }
        this.f50824g.a(this.f50835r);
        this.f50824g.a(campaignEx, this.f50828k);
    }

    void b(CampaignEx campaignEx, int i10, boolean z10) {
        if (campaignEx != null && z10) {
            if (this.f50831n == null) {
                this.f50831n = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f50818a);
            }
            this.f50827j = new d(this, this.f50826i, campaignEx);
        }
        ViewGroup viewGroup = this.f50829l;
        if (viewGroup == null) {
            d dVar = this.f50827j;
            if (dVar != null) {
                dVar.a(this.f50820c, "container is null");
                return;
            }
            return;
        }
        if (this.f50824g == null) {
            this.f50824g = new f(viewGroup.getContext(), this.f50819b, this.f50818a);
        }
        this.A = campaignEx;
        a(campaignEx, i10, z10);
    }

    private void b(Activity activity) {
        if (this.f50824g == null) {
            if (activity != null) {
                this.f50824g = new f(activity, this.f50819b, this.f50818a);
            } else {
                this.f50824g = new f(com.mbridge.msdk.foundation.controller.c.n().d(), this.f50819b, this.f50818a);
            }
        }
        if (this.f50828k == null) {
            if (activity != null) {
                this.f50828k = new MBSplashView(activity);
            } else {
                this.f50828k = new MBSplashView(com.mbridge.msdk.foundation.controller.c.n().d());
            }
        }
        if (this.f50834q == null) {
            this.f50834q = new j();
        }
        this.f50834q.a(com.mbridge.msdk.foundation.controller.c.n().d(), com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c(), this.f50818a);
    }

    private void a(String str, int i10) {
        boolean zB;
        synchronized (this.f50839v) {
            try {
                if (this.f50832o) {
                    if (this.f50825h != null) {
                        this.f50825h.a(new com.mbridge.msdk.foundation.error.b(880016, "current unit is loading"), i10);
                        this.f50832o = true;
                    }
                    return;
                }
                this.f50832o = true;
                int i11 = this.f50821d;
                if (i11 >= 2 && i11 <= 10) {
                    if (this.f50837t != 0 && this.f50838u != 0) {
                        try {
                            zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
                        } catch (Exception unused) {
                            zB = false;
                        }
                        if (!zB) {
                            if (this.f50825h != null) {
                                this.f50825h.a(new com.mbridge.msdk.foundation.error.b(880029), i10);
                                return;
                            }
                            return;
                        }
                        this.f50828k.clearResState();
                        this.f50831n = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f50818a);
                        if (this.f50823f == null) {
                            this.f50823f = new e(this.f50819b, this.f50818a, this.f50822e * 1000);
                        }
                        b bVar = this.f50825h;
                        if (bVar != null) {
                            bVar.a(str);
                            this.f50823f.a(this.f50825h);
                        }
                        this.f50828k.resetLoadState();
                        this.f50823f.a(this.f50821d);
                        this.f50823f.a(this.f50828k);
                        this.f50823f.a(this.f50831n);
                        this.f50823f.a(this.f50837t, this.f50838u);
                        this.f50823f.a(this.f50835r);
                        this.f50823f.b(this.f50836s);
                        this.f50823f.a(str, i10);
                        return;
                    }
                    if (this.f50825h != null) {
                        this.f50825h.a(new com.mbridge.msdk.foundation.error.b(880028), i10);
                        return;
                    }
                    return;
                }
                if (this.f50825h != null) {
                    com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880037);
                    bVar2.c("countDownTime must in 2 - 10");
                    this.f50825h.a(bVar2, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f50830m = view;
        if (view != null) {
            a(layoutParams.width, layoutParams.height);
            MBSplashView mBSplashView = this.f50828k;
            if (mBSplashView != null) {
                mBSplashView.setIconVg(view, layoutParams);
            }
        }
    }

    public ViewGroup a(ZoomOutTypeEnum zoomOutTypeEnum) {
        MBSplashPopView mBSplashPopView = new MBSplashPopView(com.mbridge.msdk.foundation.controller.c.n().d(), new BaseSplashPopView.i(this.f50819b, this.f50818a, zoomOutTypeEnum.getIndex(), this.A), this.f50827j);
        this.B = mBSplashPopView;
        return mBSplashPopView;
    }

    private void a(int i10, int i11) {
        int iN = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());
        int iM = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());
        int i12 = this.f50836s;
        if (i12 == 1) {
            if (iM >= i11 * 4) {
                this.f50838u = iM - i11;
                this.f50837t = iN;
                return;
            } else {
                this.f50838u = 0;
                this.f50837t = 0;
                return;
            }
        }
        if (i12 == 2) {
            if (iN >= i10 * 4) {
                this.f50837t = iN - i10;
                this.f50838u = iM;
            } else {
                this.f50838u = 0;
                this.f50837t = 0;
            }
        }
    }

    public void a(boolean z10) {
        MBSplashView mBSplashView = this.f50828k;
        if (mBSplashView != null) {
            mBSplashView.setAllowClickSplash(z10);
        }
    }

    private ViewGroup a(Activity activity) {
        Throwable th2;
        ViewGroup viewGroup;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (activity == null) {
            q0.d(D, "splash can't show because, activity is null or activity is finishing");
            return null;
        }
        try {
            viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content);
        } catch (Throwable th3) {
            th2 = th3;
            viewGroup = null;
        }
        try {
            try {
                return (ViewGroup) viewGroup.getChildAt(0);
            } catch (Throwable th4) {
                th2 = th4;
                th2.printStackTrace();
                return viewGroup;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return viewGroup;
        }
    }

    public void a(int i10, int i11, int i12, int i13) {
        try {
            MBSplashView mBSplashView = this.f50828k;
            if (mBSplashView != null) {
                mBSplashView.setNotchPadding(i10, i11, i12, i13);
            }
        } catch (Throwable th2) {
            q0.b(D, th2.getMessage());
        }
    }

    public void a() {
        this.A = null;
        if (this.f50826i != null) {
            this.f50826i = null;
        }
        if (this.f50825h != null) {
            this.f50825h = null;
        }
        if (this.f50827j != null) {
            this.f50827j = null;
        }
        e eVar = this.f50823f;
        if (eVar != null) {
            eVar.e();
        }
        f fVar = this.f50824g;
        if (fVar != null) {
            fVar.h();
        }
        if (this.f50842y != null) {
            this.f50842y = null;
        }
    }
}
