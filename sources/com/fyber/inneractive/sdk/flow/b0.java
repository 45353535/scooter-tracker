package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.network.h1;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.y0;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b0 implements InneractiveAdRenderer, InneractiveInternalBrowserActivity.InternalBrowserListener, com.fyber.inneractive.sdk.click.f, com.fyber.inneractive.sdk.web.t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InneractiveAdSpot f20621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f20622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InneractiveUnitController.EventsListener f20623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20624d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20625e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20626f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f20627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.click.r f20628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z f20629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f20630j;

    public int A() {
        return -1;
    }

    public int B() {
        return -1;
    }

    public final boolean C() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        x xVar = this.f20622b;
        if (xVar == null || (rVar = xVar.f21037c) == null || rVar.a(com.fyber.inneractive.sdk.config.global.features.c.class) == null) {
            return false;
        }
        com.fyber.inneractive.sdk.config.global.features.c cVar = (com.fyber.inneractive.sdk.config.global.features.c) this.f20622b.f21037c.a(com.fyber.inneractive.sdk.config.global.features.c.class);
        cVar.getClass();
        return new ArrayList(cVar.f20380c.values()).size() > 0;
    }

    public boolean D() {
        return false;
    }

    public boolean E() {
        x xVar = this.f20622b;
        if (xVar != null) {
            return xVar.c();
        }
        return true;
    }

    public boolean F() {
        return this instanceof com.fyber.inneractive.sdk.renderers.a0;
    }

    public final void G() {
        com.fyber.inneractive.sdk.response.e eVarB;
        Context contextY = y();
        if (this.f20625e || this.f20623c == null) {
            return;
        }
        IAlog.a("%sCalling external interface onAdImpression", IAlog.a(this));
        this.f20623c.onAdImpression(this.f20621a);
        x xVar = this.f20622b;
        if (xVar != null && (eVarB = xVar.b()) != null) {
            IAConfigManager iAConfigManager = IAConfigManager.O;
            com.fyber.inneractive.sdk.config.x0 x0Var = iAConfigManager.f20318x;
            if (x0Var != null) {
                UnitDisplayType unitDisplayType = eVarB.f23736p;
                ImpressionData impressionData = eVarB.f23740t;
                x0Var.a(unitDisplayType, "LAST_DOMAIN_SHOWED", impressionData != null ? impressionData.getAdvertiserDomain() : null);
                x0Var.a(unitDisplayType, "LAST_APP_BUNDLE_ID", eVarB.A);
                if (this.f20622b.isVideoAd()) {
                    x0Var.a(unitDisplayType, new String[]{"LAST_VAST_SKIPED"}[0], "0");
                    x0Var.a(unitDisplayType, new String[]{"LAST_VAST_CLICKED_TYPE"}[0], "0");
                }
                x0Var.a(unitDisplayType, new String[]{"LAST_CLICKED"}[0], "0");
            }
            y0 y0Var = iAConfigManager.A;
            com.fyber.inneractive.sdk.config.s0 s0Var = this.f20622b.f21038d;
            ImpressionData impressionData2 = eVarB.f23740t;
            if (s0Var != null) {
                OnGlobalImpressionDataListener onGlobalImpressionDataListener = y0Var.f23923a;
                if (onGlobalImpressionDataListener != null) {
                    com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) s0Var;
                    onGlobalImpressionDataListener.onImpression(r0Var.f20434b, r0Var.f20433a, impressionData2);
                }
            } else {
                y0Var.getClass();
            }
            InneractiveUnitController.EventsListener eventsListener = this.f20623c;
            if (eventsListener instanceof InneractiveFullscreenAdEventsListenerWithImpressionData) {
                ((InneractiveFullscreenAdEventsListenerWithImpressionData) eventsListener).onAdImpression(this.f20621a, eVarB.f23740t);
            } else if (eventsListener instanceof InneractiveAdViewEventsListenerWithImpressionData) {
                ((InneractiveAdViewEventsListenerWithImpressionData) eventsListener).onAdImpression(this.f20621a, eVarB.f23740t);
            }
            com.fyber.inneractive.sdk.privacysandbox.b bVarA = com.fyber.inneractive.sdk.privacysandbox.b.a(contextY);
            if (bVarA == null) {
                bVarA = null;
            }
            String str = eVarB.f23733m;
            if (!TextUtils.isEmpty(str) && bVarA != null) {
                bVarA.a(str, null);
            }
        }
        this.f20625e = true;
    }

    public final void H() {
        if (this.f20623c != null) {
            IAlog.a("%sCalling external interface onAdWillOpenExternalApp", IAlog.a(this));
            this.f20623c.onAdWillOpenExternalApp(this.f20621a);
        }
    }

    public void I() {
        View viewZ = z();
        if (viewZ == null || this.f20630j == null || viewZ.getParent() == null || !(viewZ.getParent() instanceof ViewGroup)) {
            return;
        }
        viewZ.getLayoutParams();
        ((ViewGroup) viewZ.getParent()).removeView(this.f20630j);
        e(this.f20630j);
        this.f20630j = null;
    }

    public final void J() {
        x xVar = this.f20622b;
        if (xVar == null || xVar.b() == null) {
            return;
        }
        String str = this.f20622b.b().f23737q;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IAlog.e("%sfiring rewarded completion!", IAlog.a(this));
        z0.b(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fyber.inneractive.sdk.util.d0 a(android.content.Context r17, java.lang.String r18, com.fyber.inneractive.sdk.util.g1 r19, com.fyber.inneractive.sdk.util.g r20, boolean r21, com.fyber.inneractive.sdk.click.o r22) {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.b0.a(android.content.Context, java.lang.String, com.fyber.inneractive.sdk.util.g1, com.fyber.inneractive.sdk.util.g, boolean, com.fyber.inneractive.sdk.click.o):com.fyber.inneractive.sdk.util.d0");
    }

    public final void b(com.fyber.inneractive.sdk.response.e eVar) {
        String str = eVar.f23731k;
        if (str == null || str.trim().length() <= 0) {
            return;
        }
        IAlog.e("%sfiring impression!", IAlog.a(this));
        z0.b(str);
    }

    public final Context c(View view) {
        View view2;
        int i10 = 0;
        View[] viewArr = {view, z()};
        while (true) {
            if (i10 >= 2) {
                view2 = null;
                break;
            }
            view2 = viewArr[i10];
            if (view2 != null) {
                break;
            }
            i10++;
        }
        return com.fyber.inneractive.sdk.util.o.a(view2);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public boolean canRefreshAd() {
        return true;
    }

    public void d(View view) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        if (this.f20624d) {
            InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
            this.f20624d = false;
        }
        Runnable runnable = this.f20627g;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.f23896b.removeCallbacks(runnable);
            this.f20627g = null;
        }
        this.f20622b = null;
        this.f20623c = null;
        this.f20621a = null;
        if (this.f20628h != null) {
            I();
            com.fyber.inneractive.sdk.click.r rVar = this.f20628h;
            rVar.f20286e = true;
            Iterator it = rVar.f20290i.iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.click.a) it.next()).cancel();
            }
            rVar.f20290i.clear();
            h1 h1Var = rVar.f20289h;
            if (h1Var != null) {
                h1Var.f21374a = true;
            }
            rVar.f20285d = null;
            this.f20628h = null;
            this.f20629i = null;
        }
    }

    public void e(View view) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void initialize(InneractiveAdSpot inneractiveAdSpot) {
        this.f20621a = inneractiveAdSpot;
        this.f20622b = inneractiveAdSpot.getAdContent();
        this.f20623c = inneractiveAdSpot.getSelectedUnitController().getEventsListener();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public final void onApplicationInBackground() {
        H();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public final void onInternalBrowserDismissed() {
        IAlog.a("onInternalBrowserDismissed callback called", new Object[0]);
        if (this.f20624d) {
            this.f20624d = false;
            InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
        }
        if (this.f20623c != null) {
            IAlog.a("%sCalling external interface onAdWillCloseInternalBrowser", IAlog.a(this));
            this.f20623c.onAdWillCloseInternalBrowser(this.f20621a);
        }
    }

    public final com.fyber.inneractive.sdk.ignite.m p() {
        x xVar = this.f20622b;
        return (xVar == null || !xVar.d() || this.f20622b.b() == null) ? com.fyber.inneractive.sdk.ignite.m.NONE : this.f20622b.b().H;
    }

    public void u() {
        G();
    }

    public void x() {
        View viewZ = z();
        if (viewZ == null || viewZ.getParent() == null || !(viewZ.getParent() instanceof ViewGroup) || this.f20630j != null) {
            return;
        }
        View viewInflate = View.inflate(viewZ.getContext(), R.layout.ia_layout_click_overlay, null);
        this.f20630j = viewInflate;
        if (viewInflate != null) {
            ((ViewGroup) viewZ.getParent()).addView(this.f20630j, viewZ.getLayoutParams());
            d(this.f20630j);
        }
    }

    public Context y() {
        return com.fyber.inneractive.sdk.util.o.a(z());
    }

    public abstract View z();

    /* JADX WARN: Removed duplicated region for block: B:101:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.fyber.inneractive.sdk.click.b r13, com.fyber.inneractive.sdk.util.g1 r14, com.fyber.inneractive.sdk.util.g r15) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.b0.b(com.fyber.inneractive.sdk.click.b, com.fyber.inneractive.sdk.util.g1, com.fyber.inneractive.sdk.util.g):void");
    }

    public static void a(com.fyber.inneractive.sdk.response.e eVar) {
        String str = eVar.f23732l;
        if (str == null || str.trim().length() <= 0) {
            return;
        }
        z0.b(str);
    }

    @Override // com.fyber.inneractive.sdk.click.f
    public final void a(com.fyber.inneractive.sdk.click.b bVar, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        b(bVar, g1Var, gVar);
    }

    public final void a(String str, com.fyber.inneractive.sdk.click.q qVar) {
        com.fyber.inneractive.sdk.response.e eVarB;
        JSONArray jSONArrayB;
        InneractiveAdRequest inneractiveAdRequest;
        x xVar = this.f20622b;
        if (xVar != null) {
            eVarB = xVar.b();
            x xVar2 = this.f20622b;
            inneractiveAdRequest = xVar2.f21035a;
            com.fyber.inneractive.sdk.config.global.r rVar = xVar2.f21037c;
            jSONArrayB = rVar != null ? rVar.b() : null;
        } else {
            eVarB = null;
            jSONArrayB = null;
            inneractiveAdRequest = null;
        }
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.EXTERNAL_BROWSER_OPENED;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
        wVar.f21418c = uVar;
        wVar.f21416a = inneractiveAdRequest;
        wVar.f21419d = jSONArrayB;
        wVar.a("url", str).a(POBCoreNativeConstants.NATIVE_FALLBACK_URL, (qVar == com.fyber.inneractive.sdk.click.q.OPENED_USING_CHROME_NAVIGATE || qVar == com.fyber.inneractive.sdk.click.q.OPENED_IN_EXTERNAL_BROWSER) ? "chrome" : "na").a((String) null);
    }

    public final void a(Context context, boolean z10, float f10, float f11) {
        com.fyber.inneractive.sdk.response.e eVarB;
        if (z10) {
            IAlog.a("%s : will not notify click on fallback", IAlog.a(this));
            return;
        }
        if (this.f20623c != null) {
            IAlog.a("%sCalling external interface onAdClicked", IAlog.a(this));
            this.f20623c.onAdClicked(this.f20621a);
        }
        x xVar = this.f20622b;
        if (xVar == null || (eVarB = xVar.b()) == null) {
            return;
        }
        IAConfigManager.O.f20318x.a(eVarB.f23736p, "LAST_CLICKED", "1");
        com.fyber.inneractive.sdk.privacysandbox.b bVarA = com.fyber.inneractive.sdk.privacysandbox.b.a(context);
        if (bVarA == null) {
            bVarA = null;
        }
        String str = eVarB.f23734n;
        Float fValueOf = Float.valueOf(f10);
        Float fValueOf2 = Float.valueOf(f11);
        if (!fValueOf.isNaN() && !fValueOf2.isNaN() && f10 >= 0.0f && f11 >= 0.0f) {
            MotionEvent motionEventObtain = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, f10, f11, 0);
            if (TextUtils.isEmpty(str) || bVarA == null) {
                return;
            }
            bVarA.a(str, motionEventObtain);
            return;
        }
        if (TextUtils.isEmpty(str) || bVarA == null) {
            return;
        }
        bVarA.a(str, null);
    }

    public final void a(WebViewRendererProcessHasGoneError webViewRendererProcessHasGoneError) {
        String simpleName = webViewRendererProcessHasGoneError.getClass().getSimpleName();
        String message = webViewRendererProcessHasGoneError.getMessage();
        x xVar = this.f20622b;
        com.fyber.inneractive.sdk.network.z.a(simpleName, message, xVar != null ? xVar.f21035a : null, xVar != null ? xVar.b() : null);
        if (this.f20623c != null) {
            IAlog.a("%sCalling external interface onAdEnteredErrorState: %s", IAlog.a(this), webViewRendererProcessHasGoneError.getMessage());
            this.f20623c.onAdEnteredErrorState(this.f20621a, webViewRendererProcessHasGoneError);
        }
    }

    public static void a(com.fyber.inneractive.sdk.cache.session.enums.a aVar, com.fyber.inneractive.sdk.cache.session.enums.c cVar) {
        com.fyber.inneractive.sdk.cache.session.e eVar = IAConfigManager.O.f20318x.f20510a;
        if (eVar != null) {
            com.fyber.inneractive.sdk.util.r.f23895a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar, aVar, cVar));
        }
    }
}
