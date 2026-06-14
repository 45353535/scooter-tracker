package com.taurusx.tax.w.a;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.adjust.sdk.Constants;
import com.iab.omid.library.taurusx.adsession.AdEvents;
import com.iab.omid.library.taurusx.adsession.AdSession;
import com.iab.omid.library.taurusx.adsession.CreativeType;
import com.iab.omid.library.taurusx.adsession.media.MediaEvents;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.api.TaurusXInstreamAds;
import com.taurusx.tax.g.f0;
import com.taurusx.tax.g.h0;
import com.taurusx.tax.g.j0;
import com.taurusx.tax.g.k0;
import com.taurusx.tax.g.p;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.o.g0;
import com.taurusx.tax.t.z;
import com.taurusx.tax.ui.CircularProgressBar;
import com.taurusx.tax.ui.TaxMediaView;
import com.taurusx.tax.ui.TaxWebViewActivity;
import com.taurusx.tax.vast.VastConfig;
import com.taurusx.tax.vast.VastManager;
import com.taurusx.tax.vast.VastTracker;
import com.taurusx.tax.w.c.y;
import com.taurusx.tax.w.s.c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class o extends com.taurusx.tax.w.a.y {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f67111r0 = 290;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f67112s0 = 290;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f67113t0 = 1;
    public TextView A;
    public LinearLayout B;
    public String C;
    public String D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public com.taurusx.tax.w.s.z O;
    public com.taurusx.tax.w.s.a P;
    public long Q;
    public AdSession R;
    public AdEvents S;
    public MediaEvents T;
    public boolean U;
    public boolean V;
    public boolean W;
    public String X;
    public long Y;
    public long Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f67114a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f67115b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Handler f67116b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ValueAnimator f67117c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f67118d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public TaurusXInstreamAds.InstreamTypes f67119d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RelativeLayout f67120e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f67121e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ViewGroup f67122f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f67123f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public VastConfig f67124g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f67125g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f67126h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f67127h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f67128i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public long f67129i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f67130j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f67131j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.taurusx.tax.t.z f67132k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f67133k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TaxMediaView f67134l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public long f67135l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.taurusx.tax.w.a.t f67136m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f67137m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public View.OnLayoutChangeListener f67138n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public AtomicBoolean f67139o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f67140p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public AtomicBoolean f67141p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public RelativeLayout f67142q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public View.OnTouchListener f67143q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CardView f67144r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f67145t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ImageView f67146u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ViewGroup f67147v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f67148x;

    public class a implements f0.z {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ View f67150z;

        public class z implements Runnable {

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Intent f67151w;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public final /* synthetic */ Context f67153z;

            public z(Context context, Intent intent) {
                this.f67153z = context;
                this.f67151w = intent;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f67153z.startActivity(this.f67151w);
            }
        }

        public a(View view) {
            this.f67150z = view;
        }

        @Override // com.taurusx.tax.g.f0.z
        public void z(Context context, Intent intent) {
            if (o.this.V) {
                context.startActivity(intent);
            } else {
                k0.z(this.f67150z, new z(context, intent));
            }
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((CircularProgressBar) o.this.f67148x).setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public class c implements z.InterfaceC0815z {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public com.taurusx.tax.w.s.z f67157z = null;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public com.taurusx.tax.w.s.a f67155w = null;

        public c() {
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void w(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
            LogUtil.v("taurusx", "onClicked");
            this.f67157z = zVar;
            this.f67155w = aVar;
            if (j0.z(o.this.f67235c, zVar)) {
                com.taurusx.tax.w.a.c cVar = o.this.f67236o;
                if (cVar != null) {
                    cVar.onAdClicked();
                }
                o oVar = o.this;
                oVar.z(oVar.f67238w.s(), zVar, aVar);
                o.this.z(zVar, aVar);
            }
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public /* synthetic */ WebResourceResponse z(WebView webView, String str) {
            return z5.a.b(this, webView, str);
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void z() {
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void z(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
            o.this.V = true;
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public boolean z(String str) {
            LogUtil.v(com.taurusx.tax.w.a.y.f67233n, "onJump :" + str);
            com.taurusx.tax.w.c.y yVar = o.this.f67235c;
            boolean z10 = (yVar == null || yVar.c() == null || o.this.f67235c.c().w() == null || o.this.f67235c.c().w().G() != 1) ? false : true;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (o.this.V) {
                o.this.w(this.f67157z, this.f67155w);
            }
            boolean z11 = (o.this.V || !z10) ? o.this.z(TaurusXAds.getContext(), o.this.f67132k, str) : false;
            if (!o.this.V && !o.this.U) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("html", o.this.f67238w.z());
                } catch (JSONException unused) {
                }
                com.taurusx.tax.w.s.c.z(o.this.f67132k.getContext(), o.this.f67238w.k(), com.taurusx.tax.w.s.w.f67536p, 0L, o.this.f67235c, jSONObject, (c.a) null);
                o.this.U = true;
            }
            if (!z10 || o.this.V || str.startsWith("http") || z11) {
                return z11;
            }
            return true;
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void w() {
            com.taurusx.tax.s.z.y(o.this.R, o.this.f67240z);
            o.this.R = null;
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void w(WebView webView, String str) {
            if (o.this.f67133k0) {
                return;
            }
            o.this.f67133k0 = j0.c(str);
        }
    }

    public class e implements p.o {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ long f67164z;

        public e(long j10) {
            this.f67164z = j10;
        }

        @Override // com.taurusx.tax.g.p.o
        public void z(Bitmap bitmap, com.taurusx.tax.w.w wVar) {
            com.taurusx.tax.w.s.s sVar = o.this.f67240z;
            if (sVar != null) {
                sVar.z(2, System.currentTimeMillis() - this.f67164z, 1, bitmap != null ? com.taurusx.tax.w.w.SUCCESS.getCode() : wVar.getCode(), wVar.getMessageCompatibility(), 0L);
            }
            if (bitmap != null) {
                com.taurusx.tax.w.a.c cVar = o.this.f67236o;
                if (cVar != null) {
                    cVar.onAdLoaded();
                    return;
                }
                return;
            }
            com.taurusx.tax.w.a.c cVar2 = o.this.f67236o;
            if (cVar2 != null) {
                cVar2.onAdLoadFailed(wVar);
            }
        }
    }

    public class f implements VastManager.VastManagerListener {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ long f67166z;

        public f(long j10) {
            this.f67166z = j10;
        }

        @Override // com.taurusx.tax.vast.VastManager.VastManagerListener
        public void onVastVideoConfigurationPrepared(VastConfig vastConfig, com.taurusx.tax.w.w wVar, long j10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onVastVideoConfigurationPrepared ");
            sb2.append(vastConfig == null ? "null" : vastConfig.toJsonString());
            LogUtil.sensitiveD(com.taurusx.tax.w.a.y.f67233n, sb2.toString());
            if (vastConfig == null || TextUtils.isEmpty(vastConfig.getDiskMediaFileUrl())) {
                com.taurusx.tax.w.a.c cVar = o.this.f67236o;
                if (cVar != null) {
                    cVar.onAdLoadFailed(wVar);
                }
                com.taurusx.tax.w.s.s sVar = o.this.f67240z;
                if (sVar != null) {
                    sVar.z(1, System.currentTimeMillis() - this.f67166z, vastConfig != null ? vastConfig.getDownloadRetriedCount() + 1 : 0, wVar.getCode(), wVar.getMessageCompatibility(), j10);
                    return;
                }
                return;
            }
            int downloadRetriedCount = vastConfig.isDownloadFromCache() ? 0 : vastConfig.getDownloadRetriedCount() + 1;
            com.taurusx.tax.w.s.s sVar2 = o.this.f67240z;
            if (sVar2 != null) {
                sVar2.z(1, System.currentTimeMillis() - this.f67166z, downloadRetriedCount, com.taurusx.tax.w.w.SUCCESS.getCode(), "", j10);
            }
            o.this.f67124g = vastConfig;
            com.taurusx.tax.w.a.c cVar2 = o.this.f67236o;
            if (cVar2 != null) {
                cVar2.onAdLoaded();
            }
        }

        @Override // com.taurusx.tax.vast.VastManager.VastManagerListener
        public void onVastVideoDownloadStart() {
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.H = true;
            if ("vast".equalsIgnoreCase(o.this.X) && o.this.f67134l != null) {
                o.this.f67134l.p();
            }
            if (o.this.f67116b0 != null) {
                o.this.f67116b0.removeCallbacksAndMessages(null);
            }
            if (o.this.f67122f != null) {
                o.this.f67122f.removeOnLayoutChangeListener(o.this.f67138n0);
            }
            com.taurusx.tax.s.z.y(o.this.R, o.this.f67240z);
            o.this.R = null;
        }
    }

    public class h implements p.o {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f67169z;

        public h(String str) {
            this.f67169z = str;
        }

        @Override // com.taurusx.tax.g.p.o
        public void z(Bitmap bitmap, com.taurusx.tax.w.w wVar) {
            if (bitmap != null) {
                o.this.f67126h.setVisibility(0);
                o.this.A.setVisibility(8);
            } else {
                o.this.f67126h.setVisibility(8);
                o.this.A.setVisibility(0);
                o.this.A.setText(this.f67169z.substring(0, 1).toUpperCase());
            }
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                o.this.R = com.taurusx.tax.s.z.z(TaurusXAds.getContext(), (String) null, CreativeType.VIDEO, o.this.f67124g, o.this.f67240z);
                if (o.this.R != null) {
                    o oVar = o.this;
                    oVar.S = com.taurusx.tax.s.z.z(oVar.R, o.this.f67240z);
                    o oVar2 = o.this;
                    oVar2.T = com.taurusx.tax.s.z.w(oVar2.R, o.this.f67240z);
                    if (o.this.f67134l != null) {
                        o.this.f67134l.z(o.this.R, o.this.T);
                    }
                    com.taurusx.tax.s.z.z(o.this.R, o.this.f67122f, o.this.f67240z);
                    com.taurusx.tax.s.z.o(o.this.R, o.this.f67240z);
                    com.taurusx.tax.s.z.w(o.this.S, o.this.f67240z);
                }
            } catch (Throwable th2) {
                Log.d(com.taurusx.tax.w.a.y.f67233n, "createSession failed", th2);
                com.taurusx.tax.w.s.s sVar = o.this.f67240z;
                if (sVar != null) {
                    sVar.w(th2.getMessage(), false);
                }
            }
        }
    }

    public class j implements ValueAnimator.AnimatorUpdateListener {
        public j() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((ProgressBar) o.this.f67148x).setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (o.this.f67238w.z().contains("mraid.js")) {
                o.this.m();
            } else {
                o.this.p();
            }
            com.taurusx.tax.w.a.c cVar = o.this.f67236o;
            if (cVar != null) {
                cVar.onAdLoaded();
            }
        }
    }

    public static /* synthetic */ class l {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final /* synthetic */ int[] f67173z;

        static {
            int[] iArr = new int[TaurusXInstreamAds.InstreamTypes.values().length];
            f67173z = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f67173z;
                TaurusXInstreamAds.InstreamTypes instreamTypes = TaurusXInstreamAds.InstreamTypes.PRE_ROLL;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f67173z;
                TaurusXInstreamAds.InstreamTypes instreamTypes2 = TaurusXInstreamAds.InstreamTypes.PRE_ROLL;
                iArr3[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class m implements Runnable {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f67175z;

        public class z implements View.OnAttachStateChangeListener {
            public z() {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                o oVar = o.this;
                if (oVar.f67240z != null) {
                    o.this.f67240z.z(0.0f, 0.0f, oVar.f67135l0 < 0 ? -1L : System.currentTimeMillis() - o.this.f67135l0, !o.this.f67137m0 ? 1 : 0, (JSONArray) null, false);
                }
            }
        }

        public m(ViewGroup viewGroup) {
            this.f67175z = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (o.this.f67147v != null && o.this.f67147v.getParent() != null && (o.this.f67147v.getParent() instanceof ViewGroup)) {
                ((ViewGroup) o.this.f67147v.getParent()).removeView(o.this.f67147v);
            }
            o.this.f67122f = this.f67175z;
            o.this.Q = System.currentTimeMillis();
            o.this.f67116b0 = new q(o.this);
            o.this.o();
            if (o.this.f67147v != null) {
                o.this.f67147v.addOnAttachStateChangeListener(new z());
            }
        }
    }

    public class n implements Runnable {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f67178z;

        public n(ViewGroup viewGroup) {
            this.f67178z = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("checkVisible: ");
            sb2.append(o.this.z((View) this.f67178z));
            sb2.append(StringUtils.COMMA);
            sb2.append(o.this.E);
            sb2.append(StringUtils.COMMA);
            sb2.append(o.this.F);
            sb2.append(StringUtils.COMMA);
            ViewGroup viewGroup = this.f67178z;
            sb2.append(j0.z(viewGroup, o.this.f67235c, j0.z(viewGroup.getContext(), o.this.E), j0.z(this.f67178z.getContext(), o.this.F)));
            LogUtil.d("taurusx", sb2.toString());
            if (o.this.I) {
                return;
            }
            if (o.this.z((View) this.f67178z)) {
                ViewGroup viewGroup2 = this.f67178z;
                if (!j0.z(viewGroup2, o.this.f67235c, j0.z(viewGroup2.getContext(), o.this.E), j0.z(this.f67178z.getContext(), o.this.F))) {
                    o.C(o.this);
                    if (o.this.G < j0.y(o.this.f67235c)) {
                        o.this.z(this.f67178z);
                        return;
                    }
                    o.this.I = true;
                    o.this.g();
                    o.this.z(this.f67178z);
                    return;
                }
            }
            o.this.z(this.f67178z);
        }
    }

    /* JADX INFO: renamed from: com.taurusx.tax.w.a.o$o, reason: collision with other inner class name */
    public class RunnableC0819o implements Runnable {
        public RunnableC0819o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                o.this.R = com.taurusx.tax.s.z.z(TaurusXAds.getContext(), o.this.f67132k, "", CreativeType.HTML_DISPLAY, o.this.f67240z);
                if (o.this.R != null) {
                    com.taurusx.tax.s.z.z(o.this.R, (ViewGroup) o.this.f67132k, o.this.f67240z);
                    com.taurusx.tax.s.z.o(o.this.R, o.this.f67240z);
                    o oVar = o.this;
                    oVar.S = com.taurusx.tax.s.z.z(oVar.R, o.this.f67240z);
                    com.taurusx.tax.s.z.w(o.this.S, o.this.f67240z);
                    if (o.this.W) {
                        return;
                    }
                    o.this.W = true;
                    com.taurusx.tax.s.z.z(o.this.S, o.this.f67240z);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
                com.taurusx.tax.w.s.s sVar = o.this.f67240z;
                if (sVar != null) {
                    sVar.w(th2.getMessage(), false);
                }
            }
        }
    }

    public class p implements Runnable {
        public p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.x();
            o.this.J = true;
            if (o.this.f67147v != null) {
                o oVar = o.this;
                oVar.z(oVar.f67147v);
            }
        }
    }

    public static class q extends Handler {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public WeakReference<o> f67181z;

        public q(o oVar) {
            this.f67181z = new WeakReference<>(oVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            o oVar = this.f67181z.get();
            if (oVar == null || message.what != 1) {
                return;
            }
            o.H(oVar);
            if (oVar.f67114a0 * 1000 >= oVar.Y) {
                if (oVar.f67128i != null) {
                    oVar.f67128i.setVisibility(0);
                }
                if (oVar.f67140p != null) {
                    oVar.f67140p.setVisibility(0);
                    oVar.f67148x.setVisibility(4);
                }
            }
            if (oVar.f67114a0 * 1000 < oVar.Z) {
                if ("native".equalsIgnoreCase(oVar.X) || "html".equalsIgnoreCase(oVar.X) || POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(oVar.X)) {
                    oVar.f67136m.onProgress(oVar.f67114a0 * 1000, (int) oVar.Z);
                }
            } else if ("native".equalsIgnoreCase(oVar.X) || "html".equalsIgnoreCase(oVar.X) || POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(oVar.X)) {
                oVar.f67136m.onPlayEnd();
            }
            if (("native".equalsIgnoreCase(oVar.X) || "html".equalsIgnoreCase(oVar.X) || POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(oVar.X)) && oVar.f67114a0 * 1000 < oVar.Z) {
                sendEmptyMessageDelayed(1, 1000L);
            } else {
                if (!"vast".equalsIgnoreCase(oVar.X) || oVar.f67114a0 * 1000 >= oVar.Y) {
                    return;
                }
                sendEmptyMessageDelayed(1, 1000L);
            }
        }
    }

    public class r implements p.o {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f67183z;

        public r(String str) {
            this.f67183z = str;
        }

        @Override // com.taurusx.tax.g.p.o
        public void z(Bitmap bitmap, com.taurusx.tax.w.w wVar) {
            if (bitmap != null) {
                o.this.f67126h.setVisibility(0);
                o.this.A.setVisibility(8);
            } else {
                o.this.f67126h.setVisibility(8);
                o.this.A.setVisibility(0);
                o.this.A.setText(this.f67183z.substring(0, 1).toUpperCase());
            }
        }
    }

    public class s implements View.OnTouchListener {
        public s() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!o.this.J) {
                return true;
            }
            if (motionEvent.getAction() == 0) {
                o.this.P.f67468z = System.currentTimeMillis();
                o.this.O.w(String.valueOf((int) motionEvent.getX()));
                o.this.O.y(String.valueOf((int) motionEvent.getY()));
            } else if (motionEvent.getAction() == 1) {
                o.this.P.f67466w = System.currentTimeMillis();
                o.this.P.f67467y = motionEvent.getDownTime();
                o.this.P.f67463c = motionEvent.getEventTime();
                o.this.P.z(motionEvent);
                o.this.O.o(String.valueOf((int) motionEvent.getX()));
                o.this.O.s(String.valueOf((int) motionEvent.getY()));
                o.this.O.c(String.valueOf(view.getHeight()));
                o.this.O.a(String.valueOf(view.getWidth()));
                o.this.O.z(String.valueOf(System.currentTimeMillis()));
                LogUtil.d("CoordinateInfo", "the coordinate info " + o.this.O.toString());
                o oVar = o.this;
                if (j0.z(oVar.f67235c, oVar.O)) {
                    z(view, o.this.O, o.this.P);
                }
            }
            return true;
        }

        public void z(View view, com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
            try {
                if ("vast".equalsIgnoreCase(o.this.X)) {
                    o.this.z(view.getContext(), view, o.this.f67124g.getClickThroughUrl());
                    o.this.f67134l.z();
                } else if ("native".equalsIgnoreCase(o.this.X)) {
                    o.this.z(view.getContext(), view, o.this.D);
                }
                com.taurusx.tax.w.a.c cVar = o.this.f67236o;
                if (cVar != null) {
                    cVar.onAdClicked();
                }
                o oVar = o.this;
                oVar.z(oVar.f67238w.s(), zVar, aVar);
                o.this.z(zVar, aVar);
                o.this.w(zVar, aVar);
            } catch (Exception unused) {
            }
        }
    }

    public class t implements Runnable {
        public t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (o.this.W) {
                return;
            }
            com.taurusx.tax.s.z.z(o.this.S, o.this.f67240z);
            o.this.W = true;
        }
    }

    public class u implements Runnable {
        public u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.m();
            com.taurusx.tax.w.a.c cVar = o.this.f67236o;
            if (cVar != null) {
                cVar.onAdLoaded();
            }
        }
    }

    public class v implements Runnable {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ ArrayList f67187w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f67189z;

        public v(ViewGroup viewGroup, ArrayList arrayList) {
            this.f67189z = viewGroup;
            this.f67187w = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                o oVar = o.this;
                Context context = TaurusXAds.getContext();
                CreativeType creativeType = CreativeType.NATIVE_DISPLAY;
                o oVar2 = o.this;
                oVar.R = com.taurusx.tax.s.z.z(context, (String) null, creativeType, oVar2.f67238w, oVar2.f67240z);
                if (o.this.R != null) {
                    o oVar3 = o.this;
                    oVar3.S = com.taurusx.tax.s.z.z(oVar3.R, o.this.f67240z);
                    o.this.y(this.f67189z, (ArrayList<View>) this.f67187w);
                    com.taurusx.tax.s.z.o(o.this.R, o.this.f67240z);
                    com.taurusx.tax.s.z.w(o.this.S, o.this.f67240z);
                }
            } catch (Throwable th2) {
                Log.d(com.taurusx.tax.w.a.y.f67233n, "createSession failed", th2);
                com.taurusx.tax.w.s.s sVar = o.this.f67240z;
                if (sVar != null) {
                    sVar.w(th2.getMessage(), false);
                }
            }
        }
    }

    public class w implements View.OnClickListener {
        public w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o.this.z(view.getContext(), com.taurusx.tax.w.o.w.y(), (f0.z) null);
        }
    }

    public class x implements View.OnLayoutChangeListener {
        public x() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int height = o.this.f67122f.getHeight();
            LogUtil.d("taurusx", "onLayoutChange: " + height);
            com.taurusx.tax.g.j.w(TaurusXAds.getContext());
            d dVarA = o.this.a();
            int iOrdinal = o.this.n().ordinal();
            if (iOrdinal == 0) {
                o.this.y(dVarA);
            } else if (iOrdinal == 1) {
                o.this.z(dVarA);
            } else if (iOrdinal != 2) {
                LogUtil.e("taurusx", "Unsupported InstreamTypes");
            } else {
                o.this.w(dVarA);
            }
            if (height > 0) {
                o.this.f67122f.removeOnLayoutChangeListener(this);
            }
        }
    }

    public class y implements View.OnClickListener {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f67193z;

        public y(String str) {
            this.f67193z = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Activity activityW = o.w(view);
            if (activityW != null) {
                new com.taurusx.tax.t.y.z(activityW).z(this.f67193z).z(o.this.f67240z).w();
            }
        }
    }

    public class z implements TaxMediaView.g {
        public z() {
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onPlayEnd() {
            if (!o.this.f67131j0) {
                o oVar = o.this;
                if (oVar.f67240z != null) {
                    oVar.f67131j0 = true;
                    String diskMediaFileUrl = o.this.f67124g != null ? o.this.f67124g.getDiskMediaFileUrl() : null;
                    if (!TextUtils.isEmpty(diskMediaFileUrl)) {
                        o oVar2 = o.this;
                        oVar2.f67240z.z(diskMediaFileUrl, oVar2.f67129i0, false);
                    }
                }
            }
            o.this.f67136m.onPlayEnd();
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onPlayFailed() {
            if (!o.this.K) {
                o.this.K = true;
            }
            o.this.f67136m.onPlayFailed();
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onPlayProgress(int i10) {
            o oVar = o.this;
            oVar.z(i10, oVar.f67134l.getVideoLength());
            o.this.z(i10);
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onPlayStart() {
            o oVar;
            com.taurusx.tax.w.s.s sVar;
            o.this.f67136m.onPlayStart();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("totalDuration", o.this.f67134l.getVideoLength());
                com.taurusx.tax.w.c.y yVar = o.this.f67235c;
                if (yVar != null && yVar.c() != null && o.this.f67235c.c().w() != null && o.this.f67235c.c().w().R()) {
                    jSONObject.put("spendTime", System.currentTimeMillis() - o.this.Q);
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), o.this.f67238w.k(), com.taurusx.tax.w.s.w.f67537s, 0L, o.this.f67235c, jSONObject, (c.a) null);
            if (o.this.f67124g != null && (sVar = (oVar = o.this).f67240z) != null) {
                sVar.y(oVar.f67124g.getDiskMediaFileUrl(), false);
            }
            o.this.z(0);
            com.taurusx.tax.s.z.w(o.this.T, o.this.f67240z);
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onProgress(int i10, int i11) {
            o.this.f67136m.onProgress(i10, i11);
            o.this.f67129i0 = i10;
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void w() {
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void y() {
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void z() {
            o oVar = o.this;
            oVar.z(100, oVar.f67134l.getVideoLength());
            o.this.z(100);
            com.taurusx.tax.s.z.w(o.this.T, o.this.R, o.this.f67240z);
            com.taurusx.tax.s.z.z(o.this.T, o.this.f67240z);
        }
    }

    public o(String str, com.taurusx.tax.w.c.y yVar) {
        super(str, yVar);
        this.f67145t = false;
        this.I = false;
        this.J = false;
        this.K = false;
        this.O = new com.taurusx.tax.w.s.z();
        this.P = new com.taurusx.tax.w.s.a();
        this.f67119d0 = TaurusXInstreamAds.InstreamTypes.PRE_ROLL;
        this.f67129i0 = 0L;
        this.f67131j0 = false;
        this.f67133k0 = false;
        this.f67135l0 = -1L;
        this.f67137m0 = false;
        this.f67138n0 = new x();
        this.f67139o0 = new AtomicBoolean(false);
        this.f67141p0 = new AtomicBoolean(false);
        this.f67143q0 = new s();
    }

    public static /* synthetic */ int C(o oVar) {
        int i10 = oVar.G;
        oVar.G = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int H(o oVar) {
        int i10 = oVar.f67114a0;
        oVar.f67114a0 = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        y.z zVar;
        LogUtil.d("taurusx", "onImpression");
        if ("vast".equalsIgnoreCase(this.X)) {
            s();
        } else if ("native".equalsIgnoreCase(this.X)) {
            try {
                ArrayList<View> arrayList = new ArrayList<>();
                w(this.f67147v, arrayList);
                z(this.f67147v, arrayList);
            } catch (Exception e10) {
                Log.v(com.taurusx.tax.w.a.y.f67233n, "register view click exception:" + e10);
            }
        } else if ("html".equalsIgnoreCase(this.X)) {
            y.z zVar2 = this.f67238w;
            if (zVar2 != null && zVar2.y() == 7) {
                k();
            }
        } else if (POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(this.X) && (zVar = this.f67238w) != null && zVar.y() == 7) {
            k();
        }
        l();
        v();
        com.taurusx.tax.w.a.c cVar = this.f67236o;
        if (cVar != null) {
            cVar.onAdImpression();
        }
        if ("vast".equalsIgnoreCase(this.X) || "native".equalsIgnoreCase(this.X)) {
            com.taurusx.tax.g.m.c(new t());
        }
    }

    private void h() {
        if (this.f67147v == null) {
            return;
        }
        String str = new String[]{"#FFEC3A48", "#FFFF5D1D", "#FFEDC900", "#FF81A700", "#FF155DFF", "#FF00C4C1", "#FF790DFF"}[new Random().nextInt(7)];
        TaurusXInstreamAds.InstreamTypes instreamTypesN = n();
        if (this.f67140p != null && instreamTypesN == TaurusXInstreamAds.InstreamTypes.PRE_ROLL) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(Color.parseColor("#80000000"));
            gradientDrawable.setCornerRadius(j0.z(TaurusXAds.getContext(), 100));
            this.f67140p.setBackground(gradientDrawable);
        }
        if (this.A != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1);
            gradientDrawable2.setColor(Color.parseColor(str));
            this.A.setBackground(gradientDrawable2);
        }
        if (this.f67118d != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setShape(0);
            gradientDrawable3.setColor(Color.parseColor(str));
            if (instreamTypesN == TaurusXInstreamAds.InstreamTypes.PLAY_OVERLAY) {
                float fZ = j0.z(TaurusXAds.getContext(), 3);
                gradientDrawable3.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, fZ, fZ, fZ, fZ});
            } else {
                gradientDrawable3.setCornerRadius(j0.z(TaurusXAds.getContext(), 3));
            }
            this.f67118d.setBackground(gradientDrawable3);
        }
        View view = this.f67148x;
        if (view != null) {
            if (instreamTypesN != TaurusXInstreamAds.InstreamTypes.PRE_ROLL) {
                if (instreamTypesN == TaurusXInstreamAds.InstreamTypes.PLAY_OVERLAY || instreamTypesN == TaurusXInstreamAds.InstreamTypes.PAUSE_OVERLAY) {
                    ((CircularProgressBar) view).setProgressBarColor(Color.parseColor(str));
                    return;
                }
                return;
            }
            GradientDrawable gradientDrawable4 = new GradientDrawable();
            gradientDrawable4.setCornerRadius(j0.z(TaurusXAds.getContext(), 5));
            gradientDrawable4.setColor(0);
            GradientDrawable gradientDrawable5 = new GradientDrawable();
            gradientDrawable5.setCornerRadius(j0.z(TaurusXAds.getContext(), 5));
            gradientDrawable5.setColor(Color.parseColor(str));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable4, new ClipDrawable(gradientDrawable5, 3, 1)});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.progress);
            ((ProgressBar) this.f67148x).setProgressDrawable(layerDrawable);
        }
    }

    private void i() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f67120e.addView(this.f67132k, layoutParams);
        this.f67132k.setWebViewListener(new c());
        if ("html".equalsIgnoreCase(this.X)) {
            this.f67132k.loadHtmlResponse(this.f67238w.z());
        } else if (POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(this.X)) {
            this.f67132k.loadUrl(this.f67238w.z());
        }
    }

    private void k() {
        if (this.R != null) {
            return;
        }
        com.taurusx.tax.g.m.c(new RunnableC0819o());
    }

    private void l() {
        if (this.L || this.f67238w == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        y.z zVar = this.f67238w;
        if (zVar != null) {
            arrayList.addAll(zVar.i());
        }
        VastConfig vastConfig = this.f67124g;
        if (vastConfig != null) {
            Iterator<VastTracker> it = vastConfig.getImpressionTrackers().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getContent());
            }
        }
        com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), arrayList, "ad-imp");
        JSONObject jSONObject = new JSONObject();
        if ("html".equalsIgnoreCase(this.X) || POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(this.X)) {
            try {
                jSONObject.put("html_imp_load", this.f67133k0);
            } catch (JSONException unused) {
            }
        }
        com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), com.taurusx.tax.w.s.c.z(this.f67238w), com.taurusx.tax.w.s.w.f67530c, 0L, this.f67235c, jSONObject, (c.a) null);
        this.L = true;
        com.taurusx.tax.w.z.t().a().z(com.taurusx.tax.w.s.w.f67530c, this.f67239y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        y.z zVar = this.f67238w;
        this.f67132k = new g0(TaurusXAds.getContext(), zVar != null && zVar.y() == 7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        y.z zVar = this.f67238w;
        this.f67132k = new com.taurusx.tax.t.w(TaurusXAds.getContext(), zVar != null && zVar.y() == 7);
    }

    private void r() {
        float fK;
        if (this.f67140p == null || this.f67128i == null) {
            return;
        }
        BigDecimal bigDecimal = new BigDecimal(this.f67140p.getLayoutParams().width);
        BigDecimal bigDecimal2 = new BigDecimal(this.f67140p.getLayoutParams().height);
        if (n() == TaurusXInstreamAds.InstreamTypes.PLAY_OVERLAY) {
            com.taurusx.tax.w.c.y yVar = this.f67235c;
            fK = (yVar == null || yVar.c().w().r() <= 0.0f) ? com.taurusx.tax.w.o.w.N() : this.f67235c.c().w().r();
        } else {
            com.taurusx.tax.w.c.y yVar2 = this.f67235c;
            fK = (yVar2 == null || yVar2.c().w().k() <= 0.0f) ? com.taurusx.tax.w.o.w.K() : this.f67235c.c().w().k();
        }
        BigDecimal bigDecimal3 = new BigDecimal(String.valueOf(fK));
        ViewGroup.LayoutParams layoutParams = this.f67128i.getLayoutParams();
        layoutParams.width = (int) bigDecimal.multiply(bigDecimal3).doubleValue();
        layoutParams.height = (int) bigDecimal2.multiply(bigDecimal3).doubleValue();
        this.f67128i.setLayoutParams(layoutParams);
    }

    private void v() {
        if (this.M || this.f67238w == null) {
            return;
        }
        com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.f67238w.c(), "ad-bill");
        JSONObject jSONObject = new JSONObject();
        if ("html".equalsIgnoreCase(this.X) || POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(this.X)) {
            try {
                jSONObject.put("html_imp_load", this.f67133k0);
            } catch (JSONException unused) {
            }
        }
        com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.f67238w.k(), com.taurusx.tax.w.s.w.f67533m, 0L, this.f67235c, jSONObject, (c.a) null);
        this.M = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        TaxMediaView taxMediaView;
        if (this.f67147v == null || this.f67122f == null) {
            return;
        }
        if (n() == TaurusXInstreamAds.InstreamTypes.PLAY_OVERLAY && ("html".equalsIgnoreCase(this.X) || POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(this.X))) {
            return;
        }
        if ("vast".equalsIgnoreCase(this.X) && (taxMediaView = this.f67134l) != null) {
            taxMediaView.setIsAutoPlay(true);
            this.f67134l.e();
        } else if ("native".equalsIgnoreCase(this.X)) {
            this.f67136m.onPlayStart();
        } else if ("html".equalsIgnoreCase(this.X) || POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(this.X)) {
            i();
            this.f67136m.onPlayStart();
        }
        this.f67116b0.sendEmptyMessageDelayed(1, 1000L);
        int iOrdinal = n().ordinal();
        if (iOrdinal == 0) {
            if (this.Y > 0) {
                ((ProgressBar) this.f67148x).setMax(100);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 100);
                this.f67117c0 = valueAnimatorOfInt;
                valueAnimatorOfInt.setDuration(this.Y);
                this.f67117c0.addUpdateListener(new j());
                this.f67117c0.start();
                return;
            }
            View view = this.f67128i;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.f67140p;
            if (view2 != null) {
                view2.setVisibility(0);
                this.f67148x.setVisibility(4);
                return;
            }
            return;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            if (this.Y > 0) {
                ((CircularProgressBar) this.f67148x).setProgressMax(100.0f);
                this.f67148x.setVisibility(0);
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, 100);
                this.f67117c0 = valueAnimatorOfInt2;
                valueAnimatorOfInt2.setDuration(this.Y);
                this.f67117c0.addUpdateListener(new b());
                this.f67117c0.start();
                return;
            }
            View view3 = this.f67128i;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            View view4 = this.f67140p;
            if (view4 != null) {
                view4.setVisibility(0);
                this.f67148x.setVisibility(4);
            }
        }
    }

    public void e() {
        TaxMediaView taxMediaView;
        if ("vast".equalsIgnoreCase(this.X) && (taxMediaView = this.f67134l) != null && !taxMediaView.n()) {
            this.f67134l.e();
        }
        Handler handler = this.f67116b0;
        if (handler != null) {
            handler.sendEmptyMessage(1);
        }
        ValueAnimator valueAnimator = this.f67117c0;
        if (valueAnimator != null) {
            valueAnimator.resume();
        }
    }

    public void f() {
        TaxMediaView taxMediaView;
        if ("vast".equalsIgnoreCase(this.X) && (taxMediaView = this.f67134l) != null && !taxMediaView.n()) {
            this.f67134l.m();
        }
        Handler handler = this.f67116b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ValueAnimator valueAnimator = this.f67117c0;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
    }

    public void u() {
        com.taurusx.tax.g.m.c(new p());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        int i10;
        ImageView imageView;
        TaurusXInstreamAds.InstreamTypes instreamTypesN = n();
        int iOrdinal = instreamTypesN.ordinal();
        if (iOrdinal == 0) {
            i10 = com.taurusx.tax.R.layout.instream_layout_detail_preroll;
        } else if (iOrdinal == 1) {
            i10 = com.taurusx.tax.R.layout.instream_layout_detail_pause_overlay;
        } else if (iOrdinal != 2) {
            LogUtil.e("taurusx", "Unsupported InstreamTypes");
            i10 = 0;
        } else {
            d dVarA = a();
            i10 = (TextUtils.isEmpty(dVarA.f67162z) && TextUtils.isEmpty(dVarA.f67161y)) ? com.taurusx.tax.R.layout.instream_layout_detail_play_overlay_simple : com.taurusx.tax.R.layout.instream_layout_detail_play_overlay;
        }
        this.f67135l0 = System.currentTimeMillis();
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(TaurusXAds.getContext()).inflate(i10, (ViewGroup) null);
        this.f67147v = viewGroup;
        this.f67122f.addView(viewGroup);
        this.f67122f.addOnLayoutChangeListener(this.f67138n0);
        ViewGroup viewGroup2 = this.f67147v;
        if (viewGroup2 != null) {
            this.f67134l = (TaxMediaView) viewGroup2.findViewById(com.taurusx.tax.R.id.tax_mediaview);
            this.f67120e = (RelativeLayout) this.f67147v.findViewById(com.taurusx.tax.R.id.webview);
            this.f67146u = (ImageView) this.f67147v.findViewById(com.taurusx.tax.R.id.image);
            this.f67148x = this.f67147v.findViewById(com.taurusx.tax.R.id.progressbar);
            this.f67140p = this.f67147v.findViewById(com.taurusx.tax.R.id.skip_ll);
            this.f67128i = this.f67147v.findViewById(com.taurusx.tax.R.id.skip_ll_click);
            this.f67144r = (CardView) this.f67147v.findViewById(com.taurusx.tax.R.id.icon_view);
            this.f67126h = (ImageView) this.f67147v.findViewById(com.taurusx.tax.R.id.icon_img);
            this.f67130j = (TextView) this.f67147v.findViewById(com.taurusx.tax.R.id.title);
            this.f67115b = (TextView) this.f67147v.findViewById(com.taurusx.tax.R.id.body);
            this.f67118d = (TextView) this.f67147v.findViewById(com.taurusx.tax.R.id.cta);
            this.f67142q = (RelativeLayout) this.f67147v.findViewById(com.taurusx.tax.R.id.rl_title);
            this.A = (TextView) this.f67147v.findViewById(com.taurusx.tax.R.id.icon_text);
            this.B = (LinearLayout) this.f67147v.findViewById(com.taurusx.tax.R.id.ll_info);
            if ("vast".equalsIgnoreCase(this.X)) {
                this.f67134l.setVisibility(0);
                this.f67120e.setVisibility(8);
                this.f67146u.setVisibility(8);
                this.f67134l.setIsAutoPlay(false);
                this.f67134l.z(this.f67238w, this.f67124g);
                this.f67134l.setMute(this.f67145t);
                this.f67134l.setmEnableAutoOrientation(true);
                this.f67134l.setTaxCustomEvent(this.f67240z);
                if (instreamTypesN == TaurusXInstreamAds.InstreamTypes.PLAY_OVERLAY) {
                    TaxMediaView taxMediaView = this.f67134l;
                    taxMediaView.setAdContainerView((ViewGroup) taxMediaView.getParent());
                } else {
                    this.f67134l.setAdContainerView(this.f67122f);
                }
                this.f67134l.setOnPlayerListener(new z());
                this.f67144r.setOnTouchListener(this.f67143q0);
                this.f67130j.setOnTouchListener(this.f67143q0);
                this.f67115b.setOnTouchListener(this.f67143q0);
                this.f67118d.setOnTouchListener(this.f67143q0);
                this.f67134l.setOnTouchListener(this.f67143q0);
            } else if ("native".equalsIgnoreCase(this.X)) {
                this.f67134l.setVisibility(8);
                this.f67120e.setVisibility(8);
                this.f67146u.setVisibility(0);
                com.taurusx.tax.g.p.z(this.f67146u, this.C);
                this.f67144r.setOnTouchListener(this.f67143q0);
                this.f67130j.setOnTouchListener(this.f67143q0);
                this.f67115b.setOnTouchListener(this.f67143q0);
                this.f67118d.setOnTouchListener(this.f67143q0);
                this.f67146u.setOnTouchListener(this.f67143q0);
            } else if ("html".equalsIgnoreCase(this.X) || POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(this.X)) {
                this.f67134l.setVisibility(8);
                this.f67120e.setVisibility(0);
                this.f67146u.setVisibility(8);
            }
            com.taurusx.tax.w.c.y yVar = this.f67235c;
            if (yVar != null && yVar.c().w().N()) {
                this.f67147v.setOnTouchListener(this.f67143q0);
            }
            this.f67128i.setOnClickListener(new View.OnClickListener() { // from class: c6.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6516b.y(view);
                }
            });
            r();
            h();
            ImageView imageView2 = (ImageView) this.f67147v.findViewById(com.taurusx.tax.R.id.tax_privacy_tips);
            if (imageView2 != null) {
                imageView2.setOnClickListener(new w());
            }
            y.z zVar = this.f67238w;
            String strZ = (zVar == null || zVar.f() == null) ? "" : this.f67238w.f().z();
            Context context = this.f67147v.getContext();
            if (TextUtils.isEmpty(strZ) || context == null || (imageView = (ImageView) this.f67147v.findViewById(com.taurusx.tax.R.id.ado_iv)) == null) {
                return;
            }
            imageView.setVisibility(0);
            imageView.setOnClickListener(new y(strZ));
        }
    }

    private void s() {
        com.taurusx.tax.g.m.c(new i());
    }

    @Override // com.taurusx.tax.w.a.y
    public void c() {
        z(this.f67238w, this.f67235c);
    }

    public TaurusXInstreamAds.InstreamTypes n() {
        TaurusXInstreamAds.InstreamTypes instreamTypesInt2Type;
        com.taurusx.tax.w.c.y yVar = this.f67235c;
        return (yVar == null || yVar.c() == null || this.f67235c.c().w() == null || (instreamTypesInt2Type = TaurusXInstreamAds.InstreamTypes.int2Type(this.f67235c.c().w().j())) == null) ? this.f67119d0 : instreamTypesInt2Type;
    }

    public void t() {
        com.taurusx.tax.g.m.c(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(d dVar) {
        String str = dVar.f67162z;
        String str2 = dVar.f67160w;
        String str3 = dVar.f67161y;
        String str4 = dVar.f67158c;
        boolean z10 = dVar.f67159o;
        if (z10 && TextUtils.isEmpty(str) && TextUtils.isEmpty(str3)) {
            ViewGroup.LayoutParams layoutParams = this.B.getLayoutParams();
            layoutParams.height = 0;
            this.B.setLayoutParams(layoutParams);
        } else {
            ViewGroup.LayoutParams layoutParams2 = this.B.getLayoutParams();
            layoutParams2.height = -2;
            this.B.setLayoutParams(layoutParams2);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f67142q.setVisibility(0);
            this.f67130j.setText(str);
            com.taurusx.tax.g.p.z(this.f67126h, str2, new h(str));
        } else {
            this.f67142q.setVisibility(8);
        }
        if (!TextUtils.isEmpty(str3)) {
            this.f67115b.setVisibility(0);
            this.f67115b.setText(str3);
        } else {
            this.f67115b.setVisibility(8);
        }
        if (z10) {
            this.f67118d.setVisibility(8);
        } else {
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            this.f67118d.setVisibility(0);
            this.f67118d.setText(str4);
        }
    }

    public d a() {
        y.z zVar;
        y.z zVar2;
        y.z zVar3;
        d dVar = new d(null);
        if ("vast".equalsIgnoreCase(this.X) && (zVar3 = this.f67238w) != null && zVar3.f() != null) {
            dVar.f67162z = this.f67238w.f().a();
            dVar.f67160w = this.f67238w.f().o();
            dVar.f67161y = this.f67238w.f().y();
            dVar.f67158c = this.f67238w.f().w();
            dVar.f67159o = false;
            return dVar;
        }
        if ("native".equalsIgnoreCase(this.X)) {
            try {
                JSONObject jSONObject = new JSONObject(this.f67238w.z());
                dVar.f67162z = jSONObject.optString(com.taurusx.tax.w.o.z.f67397e);
                dVar.f67160w = jSONObject.optString(com.taurusx.tax.w.o.z.f67436r);
                dVar.f67161y = jSONObject.optString(com.taurusx.tax.w.o.z.f67415k);
                dVar.f67158c = jSONObject.optString(com.taurusx.tax.w.o.z.f67445u);
                dVar.f67159o = false;
                return dVar;
            } catch (Exception unused) {
            }
        } else {
            if ("html".equalsIgnoreCase(this.X) && (zVar2 = this.f67238w) != null && zVar2.f() != null) {
                dVar.f67162z = this.f67238w.f().a();
                dVar.f67160w = this.f67238w.f().o();
                dVar.f67161y = this.f67238w.f().y();
                dVar.f67158c = this.f67238w.f().w();
                dVar.f67159o = true;
                return dVar;
            }
            if (POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(this.X) && (zVar = this.f67238w) != null && zVar.f() != null) {
                dVar.f67162z = this.f67238w.f().a();
                dVar.f67160w = this.f67238w.f().o();
                dVar.f67161y = this.f67238w.f().y();
                dVar.f67158c = this.f67238w.f().w();
                dVar.f67159o = true;
            }
        }
        return dVar;
    }

    public static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f67158c;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f67159o;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public String f67160w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f67161y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f67162z;

        public d() {
            this.f67162z = "";
            this.f67160w = "";
            this.f67161y = "";
            this.f67158c = "";
            this.f67159o = false;
        }

        public /* synthetic */ d(f fVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(d dVar) {
        ViewGroup viewGroup;
        String str = dVar.f67162z;
        String str2 = dVar.f67161y;
        String str3 = dVar.f67158c;
        if (!TextUtils.isEmpty(str3)) {
            this.f67118d.setText(str3);
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            if (this.f67147v == null || (viewGroup = this.f67122f) == null || k0.z(viewGroup).booleanValue()) {
                return;
            }
            RelativeLayout relativeLayout = (RelativeLayout) this.f67147v.findViewById(com.taurusx.tax.R.id.rt);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.removeRule(20);
            layoutParams.addRule(21, -1);
            relativeLayout.setLayoutParams(layoutParams);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.f67130j.setVisibility(0);
            this.f67130j.setText(str);
        } else {
            this.f67130j.setVisibility(8);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f67115b.setVisibility(0);
            this.f67115b.setText(str2);
        } else {
            this.f67115b.setVisibility(8);
        }
    }

    public void z(com.taurusx.tax.w.a.t tVar) {
        this.f67136m = tVar;
    }

    @Override // com.taurusx.tax.w.a.y
    public void z(com.taurusx.tax.w.y yVar) {
        super.z(yVar);
        this.f67145t = yVar.s();
        this.E = 290;
        this.F = 290;
    }

    private void z(y.z zVar, com.taurusx.tax.w.c.y yVar) {
        LogUtil.d("taurusx", "TaxInstreamImp parseAdm");
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iOrdinal = n().ordinal();
        if (iOrdinal == 0) {
            this.E = 290;
            this.F = 290;
        } else if (iOrdinal == 1) {
            this.E = 193;
            this.F = 193;
        } else if (iOrdinal == 2) {
            this.E = 96;
            this.F = 96;
        }
        this.X = zVar.w();
        if (yVar != null && yVar.c() != null && yVar.c().w() != null) {
            this.Y = yVar.c().w().h();
            this.Z = yVar.c().w().u();
        }
        if ("vast".equalsIgnoreCase(this.X)) {
            com.taurusx.tax.w.s.s sVar = this.f67240z;
            if (sVar != null) {
                sVar.z(1);
            }
            new VastManager(TaurusXAds.getContext(), true, yVar).prepareVastVideoConfiguration(zVar.z(), new f(jCurrentTimeMillis), TaurusXAds.getContext());
            return;
        }
        if ("native".equalsIgnoreCase(this.X)) {
            try {
                JSONObject jSONObject = new JSONObject(zVar.z());
                this.C = jSONObject.optString(com.taurusx.tax.w.o.z.f67418l);
                this.D = jSONObject.optString(com.taurusx.tax.w.o.z.f67448v);
                com.taurusx.tax.w.s.s sVar2 = this.f67240z;
                if (sVar2 != null) {
                    sVar2.z(2);
                }
                com.taurusx.tax.g.p.z(null, this.C, new e(jCurrentTimeMillis));
                return;
            } catch (Exception unused) {
                com.taurusx.tax.w.s.s sVar3 = this.f67240z;
                if (sVar3 != null) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    com.taurusx.tax.w.w wVar = com.taurusx.tax.w.w.AD_CONTENT_PARSE_FAILED;
                    sVar3.z(2, jCurrentTimeMillis2, 1, wVar.getCode(), wVar.getMessageCompatibility(), 0L);
                }
                com.taurusx.tax.w.a.c cVar = this.f67236o;
                if (cVar != null) {
                    cVar.onAdLoadFailed(com.taurusx.tax.w.w.AD_CONTENT_PARSE_FAILED);
                    return;
                }
                return;
            }
        }
        if ("html".equalsIgnoreCase(this.X)) {
            if (n() == TaurusXInstreamAds.InstreamTypes.PLAY_OVERLAY) {
                com.taurusx.tax.w.a.c cVar2 = this.f67236o;
                if (cVar2 != null) {
                    cVar2.onAdLoadFailed(com.taurusx.tax.w.w.AD_CONTENT_ADM_NOT_SUPPORT);
                    return;
                }
                return;
            }
            com.taurusx.tax.g.m.c(new k());
            return;
        }
        if (POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(this.X)) {
            if (n() == TaurusXInstreamAds.InstreamTypes.PLAY_OVERLAY) {
                com.taurusx.tax.w.a.c cVar3 = this.f67236o;
                if (cVar3 != null) {
                    cVar3.onAdLoadFailed(com.taurusx.tax.w.w.AD_CONTENT_ADM_NOT_SUPPORT);
                    return;
                }
                return;
            }
            com.taurusx.tax.g.m.c(new u());
            return;
        }
        com.taurusx.tax.w.a.c cVar4 = this.f67236o;
        if (cVar4 != null) {
            cVar4.onAdLoadFailed(com.taurusx.tax.w.w.AD_CONTENT_ADM_NOT_SUPPORT);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
        if (this.f67141p0.getAndSet(true)) {
            return;
        }
        this.f67240z.w(zVar, aVar, null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(View view) {
        this.f67137m0 = true;
        com.taurusx.tax.w.s.s sVar = this.f67240z;
        if (sVar != null) {
            sVar.z(System.currentTimeMillis() - this.f67135l0, com.taurusx.tax.w.o.w.f67354a, false);
        }
        if ("vast".equalsIgnoreCase(this.X)) {
            if (!this.f67131j0 && this.f67240z != null) {
                this.f67131j0 = true;
                VastConfig vastConfig = this.f67124g;
                String diskMediaFileUrl = vastConfig != null ? vastConfig.getDiskMediaFileUrl() : null;
                if (!TextUtils.isEmpty(diskMediaFileUrl)) {
                    this.f67240z.z(diskMediaFileUrl, this.f67129i0, false);
                }
            }
            TaxMediaView taxMediaView = this.f67134l;
            if (taxMediaView != null) {
                taxMediaView.m();
            }
            com.taurusx.tax.w.c.y yVar = this.f67235c;
            if (yVar != null && yVar.c() != null && this.f67235c.c().w() != null && this.f67235c.c().w().x() == 1) {
                if (!this.f67121e0) {
                    this.f67121e0 = true;
                    z(25, this.f67134l.getVideoLength());
                    z(25);
                    com.taurusx.tax.s.z.y(this.T, this.R, this.f67240z);
                }
                if (!this.f67123f0) {
                    this.f67123f0 = true;
                    z(50, this.f67134l.getVideoLength());
                    z(50);
                    com.taurusx.tax.s.z.c(this.T, this.R, this.f67240z);
                }
                if (!this.f67125g0) {
                    this.f67125g0 = true;
                    z(75, this.f67134l.getVideoLength());
                    z(75);
                    com.taurusx.tax.s.z.a(this.T, this.R, this.f67240z);
                }
                if (!this.f67127h0) {
                    this.f67127h0 = true;
                    z(100, this.f67134l.getVideoLength());
                    z(100);
                    com.taurusx.tax.s.z.w(this.T, this.R, this.f67240z);
                    com.taurusx.tax.s.z.z(this.T, this.f67240z);
                }
            }
        }
        com.taurusx.tax.w.a.t tVar = this.f67136m;
        if (tVar != null) {
            if (!this.I && !this.K) {
                tVar.onPlayFailed();
            }
            this.f67136m.onSkip();
        }
        Handler handler = this.f67116b0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void w(ViewGroup viewGroup) {
        com.taurusx.tax.g.m.c(new m(viewGroup));
    }

    private void w(ViewGroup viewGroup, ArrayList<View> arrayList) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof ViewGroup) {
                w((ViewGroup) childAt, arrayList);
            }
            arrayList.add(childAt);
        }
    }

    public static Activity w(View view) {
        if (view == null) {
            return null;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        Object parent = view.getParent();
        if (parent instanceof View) {
            return w((View) parent);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(d dVar) {
        String str = dVar.f67162z;
        String str2 = dVar.f67160w;
        String str3 = dVar.f67161y;
        String str4 = dVar.f67158c;
        boolean z10 = dVar.f67159o;
        if (z10 && TextUtils.isEmpty(str) && TextUtils.isEmpty(str3)) {
            ViewGroup.LayoutParams layoutParams = this.B.getLayoutParams();
            layoutParams.height = 0;
            this.B.setLayoutParams(layoutParams);
        } else {
            ViewGroup.LayoutParams layoutParams2 = this.B.getLayoutParams();
            layoutParams2.height = -2;
            this.B.setLayoutParams(layoutParams2);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f67130j.setVisibility(0);
            this.f67144r.setVisibility(0);
            this.f67130j.setText(str);
            com.taurusx.tax.g.p.z(this.f67126h, str2, new r(str));
        } else {
            this.f67130j.setVisibility(8);
            this.f67144r.setVisibility(8);
        }
        if (!TextUtils.isEmpty(str3)) {
            this.f67115b.setVisibility(0);
            this.f67115b.setText(str3);
        } else {
            this.f67115b.setVisibility(8);
        }
        if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str)) {
            this.f67142q.setVisibility(8);
        } else {
            this.f67142q.setVisibility(0);
        }
        if (z10) {
            this.f67118d.setVisibility(8);
        } else {
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            this.f67118d.setVisibility(0);
            this.f67118d.setText(str4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(ViewGroup viewGroup, ArrayList<View> arrayList) {
        com.taurusx.tax.s.z.z(this.R, viewGroup, this.f67240z);
        if (arrayList != null) {
            for (View view : arrayList) {
                if (view != null) {
                    com.taurusx.tax.s.z.z(this.R, view, this.f67240z);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
        if (this.f67139o0.getAndSet(true)) {
            return;
        }
        this.f67240z.z(zVar, aVar, (String) null, false);
    }

    public boolean z(Context context, View view, String str) {
        String strA = this.f67238w.a();
        String strM = this.f67238w.m();
        if (!TextUtils.isEmpty(strA)) {
            if (h0.z(context, strA)) {
                h0.z(context, strA, Constants.DEEPLINK);
                return true;
            }
            if (!TextUtils.isEmpty(strM)) {
                h0.z(context, strM, POBCoreNativeConstants.NATIVE_FALLBACK_URL);
                return true;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            a aVar = new a(view);
            if (!f0.z(context, null, str, aVar)) {
                if (str == null || !str.startsWith("http")) {
                    return false;
                }
                z(context, str, aVar);
            }
            return true;
        } catch (Throwable th2) {
            LogUtil.v(com.taurusx.tax.w.a.y.f67233n, "onClick throwable:" + th2.getMessage());
            return false;
        }
    }

    public void z(Context context, String str, f0.z zVar) {
        Intent intent;
        if (com.taurusx.tax.g.l.z()) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addCategory("android.intent.category.BROWSABLE");
        } else {
            intent = new Intent(context, (Class<?>) TaxWebViewActivity.class);
            intent.putExtra("url", str);
            String string = UUID.randomUUID().toString();
            com.taurusx.tax.g.n0.c.z().z(string, this.f67235c);
            intent.putExtra(TaxWebViewActivity.f66910a, string);
            intent.putExtra(TaxWebViewActivity.f66911n, this.f67239y);
        }
        intent.setFlags(268435456);
        if (zVar != null) {
            zVar.z(context, intent);
        } else {
            context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(ViewGroup viewGroup) {
        if (this.H) {
            return;
        }
        com.taurusx.tax.g.m.z(new n(viewGroup), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z(View view) {
        if (view.getVisibility() == 0 && view.isShown()) {
            if (view.getWidth() > this.E && view.getHeight() > this.F) {
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect) && rect.width() > this.E && rect.height() > this.F) {
                    return true;
                }
            }
            return false;
        }
        LogUtil.d("taurusx", "view is not visible");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(ArrayList<String> arrayList, com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
        if (this.N || this.f67238w == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        y.z zVar2 = this.f67238w;
        if (zVar2 != null) {
            arrayList2.addAll(zVar2.s());
        }
        VastConfig vastConfig = this.f67124g;
        if (vastConfig != null) {
            Iterator<VastTracker> it = vastConfig.getClickTrackers().iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().getContent());
            }
        }
        com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), com.taurusx.tax.g.e.z(arrayList2, zVar), "ad-click");
        com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.f67238w.k(), com.taurusx.tax.w.s.w.f67535o, 0L, this.f67235c, com.taurusx.tax.w.s.c.z(zVar), (c.a) null);
        this.N = true;
        com.taurusx.tax.w.z.t().a().z(com.taurusx.tax.w.s.w.f67535o, this.f67239y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(int i10, int i11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("totalDuration", i11);
        } catch (JSONException unused) {
        }
        if (i10 == 25) {
            this.f67121e0 = true;
            com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.f67238w.k(), com.taurusx.tax.w.s.w.f67529a, 0L, this.f67235c, jSONObject, (c.a) null);
            return;
        }
        if (i10 == 50) {
            this.f67123f0 = true;
            com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.f67238w.k(), com.taurusx.tax.w.s.w.f67534n, 0L, this.f67235c, jSONObject, (c.a) null);
        } else if (i10 == 75) {
            this.f67125g0 = true;
            com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.f67238w.k(), com.taurusx.tax.w.s.w.f67538t, 0L, this.f67235c, jSONObject, (c.a) null);
        } else if (i10 == 100) {
            this.f67127h0 = true;
            com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.f67238w.k(), com.taurusx.tax.w.s.w.f67532g, 0L, this.f67235c, jSONObject, (c.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(int i10) {
        if (this.f67124g == null) {
            return;
        }
        com.taurusx.tax.n.y.z().z(i10, this.f67124g);
    }

    private void z(ViewGroup viewGroup, ArrayList<View> arrayList) {
        com.taurusx.tax.g.m.c(new v(viewGroup, arrayList));
    }
}
