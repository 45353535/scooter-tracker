package com.mbridge.msdk.advanced.middle;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.advanced.view.MBOutNativeAdvancedViewGroup;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class c {
    private static String G = "NativeAdvancedProvider";
    private boolean A;
    private boolean B;
    private boolean C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MBridgeIds f46360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.advanced.manager.b f46361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.advanced.manager.c f46362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f46363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private NativeAdvancedAdListener f46364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f46365h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MBNativeAdvancedView f46366i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MBNativeAdvancedWebview f46367j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.advanced.view.a f46368k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private l f46369l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f46370m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private j f46371n;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private JSONObject f46381x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private MBOutNativeAdvancedViewGroup f46383z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f46372o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f46373p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f46374q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f46375r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f46376s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f46377t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f46378u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f46379v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Object f46380w = new Object();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f46382y = false;
    private boolean D = true;
    public boolean E = false;
    private ViewTreeObserver.OnScrollChangedListener F = new a();

    class a implements ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.middle.c$a$a, reason: collision with other inner class name */
        class RunnableC0490a implements Runnable {
            RunnableC0490a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.D = true;
            }
        }

        a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            if (c.this.D) {
                c.this.D = false;
                if (c.this.f46383z != null) {
                    c.this.f46383z.postDelayed(new RunnableC0490a(), 1000L);
                }
                try {
                    c.this.i();
                } catch (Exception e10) {
                    q0.b(c.G, e10.getMessage());
                }
            }
        }
    }

    public c(String str, String str2, Activity activity) {
        this.f46359b = TextUtils.isEmpty(str) ? "" : str;
        this.f46358a = str2;
        this.f46360c = new MBridgeIds(str, str2);
        a(activity);
    }

    private void e(int i10) {
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f46367j;
        if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
            return;
        }
        try {
            if (this.f46367j != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netstat", i10);
                f.a().a((WebView) this.f46367j, "onNetstatChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th2) {
            q0.a(G, th2.getMessage());
        }
    }

    private void j() {
        a(this.f46372o);
        c(this.f46374q);
        g(this.f46376s);
        a(this.f46381x);
        e(m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
    }

    public MBOutNativeAdvancedViewGroup d() {
        return this.f46383z;
    }

    public int f() {
        return this.f46372o;
    }

    public boolean g() {
        return this.f46370m;
    }

    public void h(int i10) {
        this.f46377t = true;
        g(i10);
    }

    public void i(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    if (this.C) {
                        return;
                    } else {
                        this.C = true;
                    }
                }
            } else if (this.B) {
                return;
            } else {
                this.B = true;
            }
        } else if (this.A) {
            return;
        } else {
            this.A = true;
        }
        try {
            i();
        } catch (Exception e10) {
            q0.b(G, e10.getMessage());
        }
    }

    private void g(int i10) {
        if (this.f46377t) {
            this.f46376s = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f46367j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f46367j, "setVideoPlayMode", "autoPlay", Integer.valueOf(i10));
        }
    }

    public void b(JSONObject jSONObject) {
        this.f46382y = true;
        a(jSONObject);
    }

    public void c(String str) throws Throwable {
        b bVar = new b(this, this.f46360c);
        this.f46363f = bVar;
        bVar.a(this.f46364g);
        this.f46363f.a(str);
        a(str, 2);
    }

    public void d(String str) throws Throwable {
        if (!TextUtils.isEmpty(str)) {
            c(str);
            return;
        }
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f46364g;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLoadFailed(this.f46360c, "bid  token is null or empty");
        }
    }

    public void f(int i10) {
        if (i10 == 1) {
            this.A = false;
        } else if (i10 == 2) {
            this.B = false;
        } else if (i10 == 3) {
            this.C = false;
        }
        h();
    }

    private void h() {
        com.mbridge.msdk.advanced.manager.c cVar = this.f46362e;
        if (cVar != null) {
            cVar.e();
        }
    }

    public void a(boolean z10) {
        this.f46370m = z10;
    }

    public boolean b(String str) {
        return (this.f46383z == null || com.mbridge.msdk.advanced.manager.d.a(this.f46366i, this.f46359b, this.f46358a, str, this.f46372o, false, true) == null) ? false : true;
    }

    private void a(JSONObject jSONObject) {
        if (this.f46382y) {
            this.f46381x = jSONObject;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f46367j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f46367j, "setStyleList", "", jSONObject);
        }
    }

    public void b(int i10) {
        this.f46373p = true;
        a(i10);
    }

    private void c(int i10) {
        if (this.f46375r) {
            this.f46374q = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f46367j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f46367j, "setVolume", "mute", Integer.valueOf(i10));
        }
    }

    public void d(int i10) {
        this.f46375r = true;
        c(i10);
    }

    public void b(int i10, int i11) {
        a(i10, i11);
    }

    public String e() {
        if (this.E) {
            com.mbridge.msdk.advanced.manager.c cVar = this.f46362e;
            if (cVar != null) {
                return cVar.c();
            }
            return "";
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f46361d;
        if (bVar != null) {
            return bVar.d();
        }
        return "";
    }

    public void b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (this.f46369l == null) {
                this.f46369l = h.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f46358a);
            }
            this.f46365h = new d(this, this.f46364g, campaignEx);
            q0.a(G, "show start");
            if (this.f46378u != 0 && this.f46379v != 0) {
                a(campaignEx, false);
                return;
            }
            d dVar = this.f46365h;
            if (dVar != null) {
                dVar.a(this.f46360c, "width or height is 0  or width or height is too small");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.A && this.B && this.C) {
            CampaignEx campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f46366i, this.f46359b, this.f46358a, "", this.f46372o, true, true);
            com.mbridge.msdk.advanced.manager.c cVar = this.f46362e;
            if (cVar != null) {
                cVar.f();
            }
            b(campaignExA);
        }
    }

    public void a(NativeAdvancedAdListener nativeAdvancedAdListener) {
        this.f46364g = nativeAdvancedAdListener;
    }

    private void a(int i10) {
        if (this.f46373p) {
            this.f46372o = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f46367j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            int i11 = this.f46372o;
            if (i11 == 1) {
                this.f46362e.a(true);
                com.mbridge.msdk.advanced.signal.a.a(this.f46367j, "showCloseButton", "", null);
            } else if (i11 == 0) {
                this.f46362e.a(false);
                com.mbridge.msdk.advanced.signal.a.a(this.f46367j, "hideCloseButton", "", null);
            }
        }
    }

    public String c() {
        if (this.E) {
            com.mbridge.msdk.advanced.manager.c cVar = this.f46362e;
            if (cVar != null) {
                return cVar.a();
            }
            return "";
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f46361d;
        if (bVar != null) {
            return bVar.c();
        }
        return "";
    }

    public void b() {
        if (this.f46364g != null) {
            this.f46364g = null;
        }
        if (this.f46363f != null) {
            this.f46363f = null;
        }
        if (this.f46365h != null) {
            this.f46365h = null;
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f46361d;
        if (bVar != null) {
            bVar.a((MBNativeAdvancedView) null);
            this.f46361d.e();
        }
        com.mbridge.msdk.advanced.manager.c cVar = this.f46362e;
        if (cVar != null) {
            cVar.g();
        }
        MBNativeAdvancedView mBNativeAdvancedView = this.f46366i;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.destroy();
        }
        com.mbridge.msdk.advanced.common.c.b(this.f46359b + this.f46358a + e());
        com.mbridge.msdk.advanced.view.a aVar = this.f46368k;
        if (aVar != null) {
            aVar.b();
        }
        MBOutNativeAdvancedViewGroup mBOutNativeAdvancedViewGroup = this.f46383z;
        if (mBOutNativeAdvancedViewGroup != null) {
            mBOutNativeAdvancedViewGroup.getViewTreeObserver().removeOnScrollChangedListener(this.F);
            this.f46383z.removeAllViews();
            this.f46383z = null;
        }
    }

    void a(CampaignEx campaignEx, boolean z10) {
        j();
        MBOutNativeAdvancedViewGroup mBOutNativeAdvancedViewGroup = this.f46383z;
        if (mBOutNativeAdvancedViewGroup == null || mBOutNativeAdvancedViewGroup.getParent() == null) {
            return;
        }
        if (campaignEx != null && z10) {
            if (this.f46369l == null) {
                this.f46369l = h.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f46358a);
            }
            this.f46365h = new d(this, this.f46364g, campaignEx);
        }
        if (this.f46362e == null) {
            com.mbridge.msdk.advanced.manager.c cVar = new com.mbridge.msdk.advanced.manager.c(com.mbridge.msdk.foundation.controller.c.n().d(), this.f46359b, this.f46358a);
            this.f46362e = cVar;
            cVar.a(this);
        }
        a(campaignEx);
    }

    private void a(CampaignEx campaignEx) {
        if (com.mbridge.msdk.advanced.manager.d.a(this.f46366i, campaignEx, this.f46359b, this.f46358a)) {
            this.f46362e.a(this.f46365h);
            q0.b(G, "start show process");
            this.f46362e.a(campaignEx, this.f46366i, true);
        }
    }

    private void a(String str, int i10) throws Throwable {
        boolean zB;
        this.D = true;
        synchronized (this.f46380w) {
            try {
                if (this.f46370m) {
                    if (this.f46363f != null) {
                        this.f46363f.a(new com.mbridge.msdk.foundation.error.b(880016, "current unit is loading"), i10);
                        this.f46370m = true;
                    }
                    return;
                }
                this.f46370m = true;
                if (this.f46378u != 0 && this.f46379v != 0) {
                    if (this.f46366i == null) {
                        if (this.f46363f != null) {
                            this.f46363f.a(new com.mbridge.msdk.foundation.error.b(880030), i10);
                            return;
                        }
                        return;
                    }
                    try {
                        zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
                    } catch (Exception e10) {
                        q0.b(G, e10.getMessage());
                        zB = false;
                    }
                    if (!zB) {
                        if (this.f46363f != null) {
                            this.f46363f.a(new com.mbridge.msdk.foundation.error.b(880029), i10);
                            return;
                        }
                        return;
                    }
                    this.f46366i.clearResStateAndRemoveClose();
                    l lVarA = h.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f46358a);
                    this.f46369l = lVarA;
                    if (lVarA == null) {
                        this.f46369l = l.k(this.f46358a);
                    }
                    if (this.f46361d == null) {
                        this.f46361d = new com.mbridge.msdk.advanced.manager.b(this.f46359b, this.f46358a, 0L);
                    }
                    b bVar = this.f46363f;
                    if (bVar != null) {
                        bVar.a(str);
                        this.f46361d.a(this.f46363f);
                    }
                    this.f46366i.resetLoadState();
                    this.f46361d.a(this.f46366i);
                    this.f46361d.a(this.f46369l);
                    this.f46361d.a(this.f46378u, this.f46379v);
                    this.f46361d.a(this.f46372o);
                    this.f46361d.b(str, i10);
                    return;
                }
                if (this.f46363f != null) {
                    this.f46363f.a(new com.mbridge.msdk.foundation.error.b(880028), i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a(Activity activity) {
        com.mbridge.msdk.advanced.view.a aVar;
        ViewGroup.LayoutParams layoutParams;
        if (this.f46362e == null) {
            com.mbridge.msdk.advanced.manager.c cVar = new com.mbridge.msdk.advanced.manager.c(com.mbridge.msdk.foundation.controller.c.n().d(), this.f46359b, this.f46358a);
            this.f46362e = cVar;
            cVar.a(this);
        }
        if (this.f46367j == null) {
            try {
                this.f46367j = new MBNativeAdvancedWebview(com.mbridge.msdk.foundation.controller.c.n().d());
            } catch (Exception e10) {
                q0.b(G, e10.getMessage());
            }
            if (this.f46368k == null) {
                try {
                    this.f46368k = new com.mbridge.msdk.advanced.view.a(this.f46358a, this.f46362e.b(), this);
                } catch (Exception e11) {
                    q0.b(G, e11.getMessage());
                }
            }
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f46367j;
            if (mBNativeAdvancedWebview != null && (aVar = this.f46368k) != null) {
                mBNativeAdvancedWebview.setWebViewClient(aVar);
            }
        }
        if (this.f46366i == null) {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            Context context = activity;
            if (activity == null) {
                context = contextD;
            }
            MBNativeAdvancedView mBNativeAdvancedView = new MBNativeAdvancedView(context);
            this.f46366i = mBNativeAdvancedView;
            mBNativeAdvancedView.setAdvancedNativeWebview(this.f46367j);
            MBNativeAdvancedWebview mBNativeAdvancedWebview2 = this.f46367j;
            if (mBNativeAdvancedWebview2 != null && mBNativeAdvancedWebview2.getParent() == null) {
                this.f46366i.addView(this.f46367j, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.f46383z == null) {
            this.f46383z = new MBOutNativeAdvancedViewGroup(com.mbridge.msdk.foundation.controller.c.n().d());
            if (this.f46378u != 0 && this.f46379v != 0) {
                layoutParams = new ViewGroup.LayoutParams(this.f46378u, this.f46379v);
            } else {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            this.f46383z.setLayoutParams(layoutParams);
            this.f46383z.setProvider(this);
            this.f46383z.addView(this.f46366i);
            this.f46383z.getViewTreeObserver().addOnScrollChangedListener(this.F);
        }
        if (this.f46371n == null) {
            this.f46371n = new j();
        }
        this.f46371n.a(com.mbridge.msdk.foundation.controller.c.n().d(), com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c(), this.f46358a);
    }

    public String a(String str) {
        com.mbridge.msdk.advanced.manager.b bVar = this.f46361d;
        if (bVar != null) {
            return bVar.a(str);
        }
        return "";
    }

    private void a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f46379v = i10;
        this.f46378u = i11;
        this.f46383z.setLayoutParams(new ViewGroup.LayoutParams(i11, i10));
    }
}
