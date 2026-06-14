package com.taurusx.tax.w.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.iab.omid.library.taurusx.adsession.AdSession;
import com.iab.omid.library.taurusx.adsession.CreativeType;
import com.iab.omid.library.taurusx.adsession.media.MediaEvents;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.R;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.core.AdSize;
import com.taurusx.tax.g.f0;
import com.taurusx.tax.g.j0;
import com.taurusx.tax.g.p;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.o.g0;
import com.taurusx.tax.t.z;
import com.taurusx.tax.ui.TaxMediaView;
import com.taurusx.tax.vast.VastConfig;
import com.taurusx.tax.vast.VastManager;
import com.taurusx.tax.w.c.y;
import com.taurusx.tax.w.s.c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class w extends com.taurusx.tax.w.a.z {
    public VastConfig A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public MediaEvents H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public long M;
    public boolean N;
    public com.taurusx.tax.w.s.z O;
    public com.taurusx.tax.w.s.a P;
    public long Q;
    public AtomicBoolean R;
    public AtomicBoolean S;
    public View.OnTouchListener T;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f67205b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f67206d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TaxMediaView f67207h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f67208j;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f67209q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.taurusx.tax.t.z f67210r;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public FrameLayout f67211x;

    public class a implements VastManager.VastManagerListener {
        public a() {
        }

        @Override // com.taurusx.tax.vast.VastManager.VastManagerListener
        public void onVastVideoConfigurationPrepared(VastConfig vastConfig, com.taurusx.tax.w.w wVar, long j10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onVastVideoConfigurationPrepared ");
            sb2.append(vastConfig == null ? "null" : vastConfig.toJsonString());
            LogUtil.v(com.taurusx.tax.w.a.y.f67233n, sb2.toString());
            if (vastConfig == null || TextUtils.isEmpty(vastConfig.getDiskMediaFileUrl())) {
                com.taurusx.tax.w.a.c cVar = w.this.f67236o;
                if (cVar != null) {
                    cVar.onAdLoadFailed(wVar);
                }
                com.taurusx.tax.w.s.s sVar = w.this.f67240z;
                if (sVar != null) {
                    sVar.z(1, System.currentTimeMillis() - w.this.Q, vastConfig != null ? vastConfig.getDownloadRetriedCount() + 1 : 0, wVar.getCode(), wVar.getMessageCompatibility(), j10);
                    return;
                }
                return;
            }
            int downloadRetriedCount = vastConfig.isDownloadFromCache() ? 0 : vastConfig.getDownloadRetriedCount() + 1;
            com.taurusx.tax.w.s.s sVar2 = w.this.f67240z;
            if (sVar2 != null) {
                sVar2.z(1, System.currentTimeMillis() - w.this.Q, downloadRetriedCount, com.taurusx.tax.w.w.SUCCESS.getCode(), "", j10);
            }
            w.this.A = vastConfig;
            com.taurusx.tax.w.a.c cVar2 = w.this.f67236o;
            if (cVar2 != null) {
                cVar2.onAdLoaded();
            }
            if (w.this.f67238w.f() != null) {
                w wVar2 = w.this;
                wVar2.C = wVar2.f67238w.f().o();
                w wVar3 = w.this;
                wVar3.D = wVar3.f67238w.f().a();
                w wVar4 = w.this;
                wVar4.E = wVar4.f67238w.f().y();
                w wVar5 = w.this;
                wVar5.G = wVar5.f67238w.f().w();
            }
            w.this.i();
            w.this.f67208j = false;
            w.this.n();
        }

        @Override // com.taurusx.tax.vast.VastManager.VastManagerListener
        public void onVastVideoDownloadStart() {
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                w.this.f67247m = com.taurusx.tax.s.z.z(TaurusXAds.getContext(), (String) null, CreativeType.VIDEO, w.this.A, w.this.f67240z);
                w wVar = w.this;
                AdSession adSession = wVar.f67247m;
                if (adSession != null) {
                    wVar.f67248p = com.taurusx.tax.s.z.z(adSession, wVar.f67240z);
                    w wVar2 = w.this;
                    wVar2.H = com.taurusx.tax.s.z.w(wVar2.f67247m, wVar2.f67240z);
                    if (w.this.f67207h != null) {
                        TaxMediaView taxMediaView = w.this.f67207h;
                        w wVar3 = w.this;
                        taxMediaView.z(wVar3.f67247m, wVar3.H);
                    }
                    w wVar4 = w.this;
                    com.taurusx.tax.s.z.z(wVar4.f67247m, (ViewGroup) wVar4.f67211x, w.this.f67240z);
                    w wVar5 = w.this;
                    com.taurusx.tax.s.z.o(wVar5.f67247m, wVar5.f67240z);
                    w wVar6 = w.this;
                    com.taurusx.tax.s.z.w(wVar6.f67248p, wVar6.f67240z);
                }
            } catch (Throwable th2) {
                Log.d(com.taurusx.tax.w.a.y.f67233n, "createSession failed", th2);
                com.taurusx.tax.w.s.s sVar = w.this.f67240z;
                if (sVar != null) {
                    sVar.w(th2.getMessage(), false);
                }
            }
        }
    }

    public class f implements TaxMediaView.g {
        public f() {
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onPlayEnd() {
            if (w.this.N) {
                return;
            }
            w wVar = w.this;
            if (wVar.f67240z != null) {
                wVar.N = true;
                String diskMediaFileUrl = w.this.A != null ? w.this.A.getDiskMediaFileUrl() : null;
                if (TextUtils.isEmpty(diskMediaFileUrl)) {
                    return;
                }
                w wVar2 = w.this;
                wVar2.f67240z.z(diskMediaFileUrl, wVar2.M, false);
            }
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onPlayFailed() {
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onPlayProgress(int i10) {
            w wVar = w.this;
            wVar.z(i10, wVar.f67207h.getVideoLength());
            w.this.z(i10);
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onPlayStart() {
            w wVar;
            com.taurusx.tax.w.s.s sVar;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("totalDuration", w.this.f67207h.getVideoLength());
                com.taurusx.tax.w.c.y yVar = w.this.f67235c;
                if (yVar != null && yVar.c() != null && w.this.f67235c.c().w() != null && w.this.f67235c.c().w().R()) {
                    jSONObject.put("spendTime", System.currentTimeMillis() - w.this.Q);
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), w.this.f67238w.k(), com.taurusx.tax.w.s.w.f67537s, 0L, w.this.f67235c, jSONObject, (c.a) null);
            if (w.this.A != null && (sVar = (wVar = w.this).f67240z) != null) {
                sVar.y(wVar.A.getDiskMediaFileUrl(), false);
            }
            w.this.z(0);
            com.taurusx.tax.s.z.w(w.this.H, w.this.f67240z);
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onProgress(int i10, int i11) {
            w.this.M = i10;
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void w() {
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void y() {
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void z() {
            w wVar = w.this;
            wVar.z(100, wVar.f67207h.getVideoLength());
            w.this.z(100);
            MediaEvents mediaEvents = w.this.H;
            w wVar2 = w.this;
            com.taurusx.tax.s.z.w(mediaEvents, wVar2.f67247m, wVar2.f67240z);
            com.taurusx.tax.s.z.z(w.this.H, w.this.f67240z);
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                w.this.p();
                com.taurusx.tax.w.a.c cVar = w.this.f67236o;
                if (cVar != null) {
                    cVar.onAdLoaded();
                }
                w.this.f67208j = false;
                w.this.n();
            } catch (Throwable unused) {
                com.taurusx.tax.w.a.c cVar2 = w.this.f67236o;
                if (cVar2 != null) {
                    cVar2.onAdLoadFailed(com.taurusx.tax.w.w.AD_HTML_LOAD_ERROR);
                }
            }
        }
    }

    public class i implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ ViewTreeObserver f67217z;

        public i(ViewTreeObserver viewTreeObserver) {
            this.f67217z = viewTreeObserver;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f67217z.isAlive()) {
                this.f67217z.removeOnGlobalLayoutListener(this);
            }
            LogUtil.d("taurusx", "banner width= " + w.this.f67211x.getWidth() + " height = " + w.this.f67211x.getHeight());
            if (w.this.f67208j) {
                return;
            }
            w.this.f67208j = true;
            if ("vast".equalsIgnoreCase(w.this.f67238w.w())) {
                w.this.f67207h.e();
                w.this.g();
            } else if ("native".equalsIgnoreCase(w.this.f67238w.w())) {
                w.this.t();
            } else if ("html".equalsIgnoreCase(w.this.f67238w.w())) {
                w.this.f67210r.loadHtmlResponse(w.this.f67238w.z());
            } else if (POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(w.this.f67238w.w())) {
                w.this.f67210r.loadUrl(w.this.f67238w.z());
            }
            w.this.w(System.currentTimeMillis());
            w wVar = w.this;
            if (wVar.f67240z != null) {
                w.this.f67240z.z(wVar.Q != 0 ? System.currentTimeMillis() - w.this.Q : 0L, w.this.z() != 0 ? System.currentTimeMillis() - w.this.z() : 0L, false, com.taurusx.tax.w.w.SUCCESS.getCode(), "");
            }
            if (j0.c(w.this.f67235c)) {
                w.this.o();
            } else {
                w wVar2 = w.this;
                wVar2.z((ViewGroup) wVar2.f67211x);
            }
        }
    }

    public class m implements View.OnClickListener {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f67218w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Context f67220z;

        public m(Context context, String str) {
            this.f67220z = context;
            this.f67218w = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new com.taurusx.tax.t.y.z((Activity) this.f67220z).z(this.f67218w).z(w.this.f67240z).w();
        }
    }

    public class n implements p.o {
        public n() {
        }

        @Override // com.taurusx.tax.g.p.o
        public void z(Bitmap bitmap, com.taurusx.tax.w.w wVar) {
            com.taurusx.tax.w.s.s sVar = w.this.f67240z;
            if (sVar != null) {
                sVar.z(2, System.currentTimeMillis() - w.this.Q, 1, bitmap != null ? com.taurusx.tax.w.w.SUCCESS.getCode() : wVar.getCode(), wVar.getMessageCompatibility(), 0L);
            }
            if (bitmap == null) {
                com.taurusx.tax.w.a.c cVar = w.this.f67236o;
                if (cVar != null) {
                    cVar.onAdLoadFailed(wVar);
                    return;
                }
                return;
            }
            com.taurusx.tax.w.a.c cVar2 = w.this.f67236o;
            if (cVar2 != null) {
                cVar2.onAdLoaded();
            }
            w.this.i();
            w.this.f67208j = false;
            w.this.n();
        }
    }

    public class o implements View.OnTouchListener {
        public o() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                w.this.P.f67468z = System.currentTimeMillis();
                w.this.O.w(String.valueOf((int) motionEvent.getX()));
                w.this.O.y(String.valueOf((int) motionEvent.getY()));
            } else if (motionEvent.getAction() == 1) {
                w.this.P.f67466w = System.currentTimeMillis();
                w.this.P.f67467y = motionEvent.getDownTime();
                w.this.P.f67463c = motionEvent.getEventTime();
                w.this.P.z(motionEvent);
                w.this.O.o(String.valueOf((int) motionEvent.getX()));
                w.this.O.s(String.valueOf((int) motionEvent.getY()));
                w.this.O.c(String.valueOf(view.getHeight()));
                w.this.O.a(String.valueOf(view.getWidth()));
                w.this.O.z(String.valueOf(System.currentTimeMillis()));
                LogUtil.d("CoordinateInfo", "the coordinate info " + w.this.O.toString());
                w wVar = w.this;
                if (j0.z(wVar.f67235c, wVar.O)) {
                    if ("vast".equalsIgnoreCase(w.this.f67238w.w())) {
                        w wVar2 = w.this;
                        wVar2.z(wVar2.f67211x.getContext(), (View) w.this.f67210r, w.this.A.getClickThroughUrl(), true);
                    } else if ("native".equalsIgnoreCase(w.this.f67238w.w())) {
                        w wVar3 = w.this;
                        wVar3.z(wVar3.f67211x.getContext(), (View) w.this.f67210r, w.this.F, true);
                    }
                    com.taurusx.tax.w.a.c cVar = w.this.f67236o;
                    if (cVar != null) {
                        cVar.onAdClicked();
                    }
                    w wVar4 = w.this;
                    wVar4.z(wVar4.f67238w.s(), w.this.O, w.this.P);
                    w wVar5 = w.this;
                    wVar5.z(wVar5.O, w.this.P);
                    w wVar6 = w.this;
                    wVar6.w(wVar6.O, w.this.P);
                }
            }
            return true;
        }
    }

    public class p implements View.OnClickListener {
        public p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.this.z(view.getContext(), com.taurusx.tax.w.o.w.y(), (f0.z) null);
        }
    }

    public class s implements Runnable {
        public s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                w wVar = w.this;
                Context context = TaurusXAds.getContext();
                CreativeType creativeType = CreativeType.NATIVE_DISPLAY;
                w wVar2 = w.this;
                wVar.f67247m = com.taurusx.tax.s.z.z(context, (String) null, creativeType, wVar2.f67238w, wVar2.f67240z);
                w wVar3 = w.this;
                AdSession adSession = wVar3.f67247m;
                if (adSession != null) {
                    wVar3.f67248p = com.taurusx.tax.s.z.z(adSession, wVar3.f67240z);
                    w wVar4 = w.this;
                    com.taurusx.tax.s.z.z(wVar4.f67247m, (ViewGroup) wVar4.f67211x, w.this.f67240z);
                    w wVar5 = w.this;
                    com.taurusx.tax.s.z.o(wVar5.f67247m, wVar5.f67240z);
                    w wVar6 = w.this;
                    com.taurusx.tax.s.z.w(wVar6.f67248p, wVar6.f67240z);
                }
            } catch (Throwable th2) {
                Log.d(com.taurusx.tax.w.a.y.f67233n, "createSession failed", th2);
                com.taurusx.tax.w.s.s sVar = w.this.f67240z;
                if (sVar != null) {
                    sVar.w(th2.getMessage(), false);
                }
            }
        }
    }

    public class t implements Runnable {
        public t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (w.this.f67238w.z().contains("mraid.js")) {
                    w.this.p();
                } else {
                    w.this.v();
                }
                com.taurusx.tax.w.a.c cVar = w.this.f67236o;
                if (cVar != null) {
                    cVar.onAdLoaded();
                }
                w.this.f67208j = false;
                w.this.n();
            } catch (Throwable unused) {
                com.taurusx.tax.w.a.c cVar2 = w.this.f67236o;
                if (cVar2 != null) {
                    cVar2.onAdLoadFailed(com.taurusx.tax.w.w.AD_HTML_LOAD_ERROR);
                }
            }
        }
    }

    public class v implements Runnable {
        public v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                w.this.f67247m = com.taurusx.tax.s.z.z(TaurusXAds.getContext(), w.this.f67210r, "", CreativeType.HTML_DISPLAY, w.this.f67240z);
                w wVar = w.this;
                AdSession adSession = wVar.f67247m;
                if (adSession != null) {
                    com.taurusx.tax.s.z.z(adSession, (ViewGroup) wVar.f67210r, w.this.f67240z);
                    w wVar2 = w.this;
                    com.taurusx.tax.s.z.o(wVar2.f67247m, wVar2.f67240z);
                    w wVar3 = w.this;
                    wVar3.f67248p = com.taurusx.tax.s.z.z(wVar3.f67247m, wVar3.f67240z);
                    w wVar4 = w.this;
                    com.taurusx.tax.s.z.w(wVar4.f67248p, wVar4.f67240z);
                    w wVar5 = w.this;
                    if (wVar5.f67244i) {
                        return;
                    }
                    wVar5.f67244i = true;
                    com.taurusx.tax.s.z.z(wVar5.f67248p, wVar5.f67240z);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
                com.taurusx.tax.w.s.s sVar = w.this.f67240z;
                if (sVar != null) {
                    sVar.w(th2.getMessage(), false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.taurusx.tax.w.a.w$w, reason: collision with other inner class name */
    public class RunnableC0820w implements Runnable {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f67228z;

        public RunnableC0820w(ViewGroup viewGroup) {
            this.f67228z = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("checkVisible: ");
            w wVar = w.this;
            sb2.append(wVar.w(wVar.f67211x));
            sb2.append(StringUtils.COMMA);
            sb2.append(w.this.f67251v);
            sb2.append(StringUtils.COMMA);
            sb2.append(w.this.f67246l);
            sb2.append(StringUtils.COMMA);
            sb2.append(j0.z(w.this.f67211x, w.this.f67235c, j0.z(this.f67228z.getContext(), w.this.f67251v), j0.z(this.f67228z.getContext(), w.this.f67246l)));
            LogUtil.d("taurusx", sb2.toString());
            w wVar2 = w.this;
            if (!wVar2.w(wVar2.f67211x)) {
                com.taurusx.tax.w.a.c cVar = w.this.f67236o;
                if (cVar != null) {
                    cVar.onAdClosed();
                    return;
                }
                return;
            }
            if (j0.z(w.this.f67211x, w.this.f67235c, j0.z(this.f67228z.getContext(), w.this.f67251v), j0.z(this.f67228z.getContext(), w.this.f67246l))) {
                w.this.z(this.f67228z);
                return;
            }
            if (w.this.f67209q) {
                w.this.z(this.f67228z);
                return;
            }
            w wVar3 = w.this;
            int i10 = wVar3.f67241e + 1;
            wVar3.f67241e = i10;
            if (i10 < j0.w(wVar3.f67235c)) {
                w.this.z(this.f67228z);
                return;
            }
            w.this.f67209q = true;
            w.this.o();
            w.this.z(this.f67228z);
        }
    }

    public class y implements Runnable {
        public y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.taurusx.tax.w.c.y yVar = w.this.f67235c;
            if (yVar != null && yVar.c() != null && w.this.f67235c.c().w() != null && w.this.f67235c.c().w().a() == 1) {
                if (!w.this.I) {
                    w.this.I = true;
                    w wVar = w.this;
                    wVar.z(25, wVar.f67207h.getVideoLength());
                    w.this.z(25);
                    MediaEvents mediaEvents = w.this.H;
                    w wVar2 = w.this;
                    com.taurusx.tax.s.z.y(mediaEvents, wVar2.f67247m, wVar2.f67240z);
                }
                if (!w.this.J) {
                    w.this.J = true;
                    w wVar3 = w.this;
                    wVar3.z(50, wVar3.f67207h.getVideoLength());
                    w.this.z(50);
                    MediaEvents mediaEvents2 = w.this.H;
                    w wVar4 = w.this;
                    com.taurusx.tax.s.z.c(mediaEvents2, wVar4.f67247m, wVar4.f67240z);
                }
                if (!w.this.K) {
                    w.this.K = true;
                    w wVar5 = w.this;
                    wVar5.z(75, wVar5.f67207h.getVideoLength());
                    w.this.z(75);
                    MediaEvents mediaEvents3 = w.this.H;
                    w wVar6 = w.this;
                    com.taurusx.tax.s.z.a(mediaEvents3, wVar6.f67247m, wVar6.f67240z);
                }
                if (!w.this.L) {
                    w.this.L = true;
                    w wVar7 = w.this;
                    wVar7.z(100, wVar7.f67207h.getVideoLength());
                    w.this.z(100);
                    MediaEvents mediaEvents4 = w.this.H;
                    w wVar8 = w.this;
                    com.taurusx.tax.s.z.w(mediaEvents4, wVar8.f67247m, wVar8.f67240z);
                    com.taurusx.tax.s.z.z(w.this.H, w.this.f67240z);
                }
            }
            w wVar9 = w.this;
            com.taurusx.tax.s.z.y(wVar9.f67247m, wVar9.f67240z);
            w wVar10 = w.this;
            wVar10.f67247m = null;
            if (wVar10.f67210r != null) {
                w.this.f67210r.destroy();
            }
            if (w.this.f67207h != null) {
                w.this.f67207h.p();
            }
            w.this.f67245k = true;
        }
    }

    public class z implements z.InterfaceC0815z {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public com.taurusx.tax.w.s.z f67232z = null;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public com.taurusx.tax.w.s.a f67230w = null;

        public z() {
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void w(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
            LogUtil.v("taurusx", "onClicked");
            this.f67232z = zVar;
            this.f67230w = aVar;
            if (j0.z(w.this.f67235c, zVar)) {
                com.taurusx.tax.w.a.c cVar = w.this.f67236o;
                if (cVar != null) {
                    cVar.onAdClicked();
                }
                w wVar = w.this;
                wVar.z(wVar.f67238w.s(), zVar, aVar);
                w.this.z(zVar, aVar);
            }
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public /* synthetic */ WebResourceResponse z(WebView webView, String str) {
            return z5.a.b(this, webView, str);
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void z(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
            w.this.f67206d = true;
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public boolean z(String str) {
            LogUtil.v(com.taurusx.tax.w.a.y.f67233n, "onJump :" + str);
            com.taurusx.tax.w.c.y yVar = w.this.f67235c;
            boolean z10 = false;
            boolean z11 = (yVar == null || yVar.c() == null || w.this.f67235c.c().w() == null || w.this.f67235c.c().w().G() != 1) ? false : true;
            if (!TextUtils.isEmpty(str)) {
                if (w.this.f67206d) {
                    w.this.w(this.f67232z, this.f67230w);
                }
                if (w.this.f67206d || !z11) {
                    w wVar = w.this;
                    z10 = wVar.z(wVar.f67211x.getContext(), w.this.f67210r, str, w.this.f67206d);
                }
                if (z11 && !w.this.f67206d && !str.startsWith("http") && !z10) {
                    z10 = true;
                }
            }
            if (!w.this.f67206d && !w.this.f67205b) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("html", w.this.f67238w.z());
                } catch (JSONException unused) {
                }
                com.taurusx.tax.w.s.c.z(w.this.f67210r.getContext(), w.this.f67238w.k(), com.taurusx.tax.w.s.w.f67536p, 0L, w.this.f67235c, jSONObject, (c.a) null);
                w.this.f67205b = true;
            }
            return z10;
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void w() {
            w wVar = w.this;
            com.taurusx.tax.s.z.y(wVar.f67247m, wVar.f67240z);
            w.this.f67247m = null;
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void w(WebView webView, String str) {
            w wVar = w.this;
            if (wVar.f67250u) {
                return;
            }
            wVar.f67250u = j0.c(str);
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void z() {
            y.z zVar = w.this.f67238w;
            if (zVar == null || zVar.y() != 7) {
                return;
            }
            w.this.e();
        }
    }

    public w(String str, com.taurusx.tax.w.c.y yVar, FrameLayout frameLayout) {
        super(str, yVar);
        this.f67208j = false;
        this.M = 0L;
        this.N = false;
        this.O = new com.taurusx.tax.w.s.z();
        this.P = new com.taurusx.tax.w.s.a();
        this.Q = 0L;
        this.R = new AtomicBoolean(false);
        this.S = new AtomicBoolean(false);
        this.T = new o();
        this.f67211x = frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f67247m != null) {
            return;
        }
        com.taurusx.tax.g.m.c(new v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        com.taurusx.tax.g.m.c(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        View viewInflate = LayoutInflater.from(TaurusXAds.getContext()).inflate(R.layout.mrec_layout, (ViewGroup) this.f67211x, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.image);
        this.f67207h = (TaxMediaView) viewInflate.findViewById(R.id.taxMediaView);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.icon);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.desc);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.cta);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.cta2);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.title_layout);
        CardView cardView = (CardView) viewInflate.findViewById(R.id.cardview);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.media_layout);
        com.taurusx.tax.g.p.z(imageView2, this.C);
        textView.setText(this.D);
        textView2.setText(this.E);
        if (!TextUtils.isEmpty(this.G)) {
            textView3.setText(this.G);
            textView4.setText(this.G);
        }
        if ("native".equalsIgnoreCase(this.f67238w.w())) {
            imageView.setVisibility(0);
            this.f67207h.setVisibility(8);
            com.taurusx.tax.g.p.z(imageView, this.B);
        } else if ("vast".equalsIgnoreCase(this.f67238w.w())) {
            imageView.setVisibility(8);
            this.f67207h.setVisibility(0);
            this.f67207h.z(this.f67238w, this.A);
            this.f67207h.setMute(true);
            this.f67207h.setmEnableAutoOrientation(true);
            this.f67207h.setAdContainerView(this.f67211x);
            this.f67207h.setTaxCustomEvent(this.f67240z);
            this.f67207h.setOnPlayerListener(new f());
        }
        y.z zVar = this.f67238w;
        String strZ = (zVar == null || zVar.f() == null) ? "" : this.f67238w.f().z();
        Context context = this.f67211x.getContext();
        if (!TextUtils.isEmpty(strZ) && (context instanceof Activity)) {
            ImageView imageView3 = new ImageView(context);
            imageView3.setImageResource(R.drawable.taurusx_ic_more);
            ViewGroup.LayoutParams layoutParamsZ = j0.z(relativeLayout, j0.z(context, 22), j0.z(context, 22), 1);
            if (layoutParamsZ instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParamsZ;
                marginLayoutParams.topMargin = j0.z(context, 4);
                marginLayoutParams.rightMargin = j0.z(context, 4);
            }
            imageView3.setOnClickListener(new m(context, strZ));
            relativeLayout.addView(imageView3, layoutParamsZ);
        }
        if (TextUtils.isEmpty(this.C)) {
            cardView.setVisibility(8);
        }
        if (TextUtils.isEmpty(this.D)) {
            linearLayout.setVisibility(8);
            cardView.setVisibility(8);
            textView3.setVisibility(8);
            textView4.setVisibility(0);
        }
        viewInflate.setOnTouchListener(this.T);
        z(viewInflate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        y.z zVar = this.f67238w;
        this.f67210r = new g0(this.f67211x.getContext(), zVar != null && zVar.y() == 7);
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        com.taurusx.tax.g.m.c(new s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        y.z zVar = this.f67238w;
        this.f67210r = new com.taurusx.tax.t.w(this.f67211x.getContext(), zVar != null && zVar.y() == 7);
        l();
    }

    public FrameLayout f() {
        return this.f67211x;
    }

    public void l() {
        z((View) this.f67210r);
        this.f67210r.setWebViewListener(new z());
    }

    public void m() {
        com.taurusx.tax.g.m.c(new y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        ViewTreeObserver viewTreeObserver = this.f67211x.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(new i(viewTreeObserver));
        }
    }

    @Override // com.taurusx.tax.w.a.y
    public void c() {
        this.Q = System.currentTimeMillis();
        com.taurusx.tax.w.s.s sVar = this.f67240z;
        if (sVar != null) {
            sVar.z(0L, 1, com.taurusx.tax.w.w.SUCCESS.getCode(), "");
        }
        if ("vast".equalsIgnoreCase(this.f67238w.w())) {
            int i10 = this.f67251v;
            AdSize adSize = AdSize.Banner_320_50;
            if (i10 == adSize.getWidth() && this.f67246l == adSize.getHeight()) {
                com.taurusx.tax.w.a.c cVar = this.f67236o;
                if (cVar != null) {
                    cVar.onAdLoadFailed(com.taurusx.tax.w.w.AD_CONTENT_ADM_NOT_SUPPORT);
                    return;
                }
                return;
            }
            com.taurusx.tax.w.s.s sVar2 = this.f67240z;
            if (sVar2 != null) {
                sVar2.z(1);
            }
            new VastManager(TaurusXAds.getContext(), true, this.f67235c).prepareVastVideoConfiguration(this.f67238w.z(), new a(), TaurusXAds.getContext());
            return;
        }
        if ("native".equalsIgnoreCase(this.f67238w.w())) {
            int i11 = this.f67251v;
            AdSize adSize2 = AdSize.Banner_320_50;
            if (i11 == adSize2.getWidth() && this.f67246l == adSize2.getHeight()) {
                com.taurusx.tax.w.a.c cVar2 = this.f67236o;
                if (cVar2 != null) {
                    cVar2.onAdLoadFailed(com.taurusx.tax.w.w.AD_CONTENT_ADM_NOT_SUPPORT);
                    return;
                }
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(this.f67238w.z());
                this.B = jSONObject.optString(com.taurusx.tax.w.o.z.f67418l);
                this.F = jSONObject.optString(com.taurusx.tax.w.o.z.f67448v);
                this.C = jSONObject.optString(com.taurusx.tax.w.o.z.f67436r);
                this.D = jSONObject.optString(com.taurusx.tax.w.o.z.f67397e);
                this.E = jSONObject.optString(com.taurusx.tax.w.o.z.f67415k);
                this.G = jSONObject.optString(com.taurusx.tax.w.o.z.f67445u);
                com.taurusx.tax.w.s.s sVar3 = this.f67240z;
                if (sVar3 != null) {
                    sVar3.z(2);
                }
                com.taurusx.tax.g.p.z(null, this.B, new n());
                return;
            } catch (Exception unused) {
                com.taurusx.tax.w.s.s sVar4 = this.f67240z;
                if (sVar4 != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.Q;
                    com.taurusx.tax.w.w wVar = com.taurusx.tax.w.w.AD_CONTENT_PARSE_FAILED;
                    sVar4.z(2, jCurrentTimeMillis, 1, wVar.getCode(), wVar.getMessageCompatibility(), 0L);
                }
                com.taurusx.tax.w.a.c cVar3 = this.f67236o;
                if (cVar3 != null) {
                    cVar3.onAdLoadFailed(com.taurusx.tax.w.w.AD_CONTENT_PARSE_FAILED);
                    return;
                }
                return;
            }
        }
        if ("html".equalsIgnoreCase(this.f67238w.w())) {
            com.taurusx.tax.g.m.c(new t());
            return;
        }
        if (POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(this.f67238w.w())) {
            com.taurusx.tax.g.m.c(new g());
            return;
        }
        com.taurusx.tax.w.a.c cVar4 = this.f67236o;
        if (cVar4 != null) {
            cVar4.onAdLoadFailed(com.taurusx.tax.w.w.AD_CONTENT_ADM_NOT_SUPPORT);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
        if (this.S.getAndSet(true)) {
            return;
        }
        this.f67240z.w(zVar, aVar, null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean w(View view) {
        if (view.getVisibility() == 0 && view.isShown()) {
            if (view.getWidth() > this.f67251v && view.getHeight() > this.f67246l) {
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect) && rect.width() > this.f67251v && rect.height() > this.f67246l) {
                    return true;
                }
            }
            return false;
        }
        LogUtil.d("taurusx", "view is not visible");
        return false;
    }

    @Override // com.taurusx.tax.w.a.y
    public void z(com.taurusx.tax.w.y yVar) {
        super.z(yVar);
        this.f67251v = yVar.y();
        this.f67246l = yVar.z();
    }

    private void z(View view) {
        FrameLayout.LayoutParams layoutParams;
        RelativeLayout.LayoutParams layoutParams2;
        int iZ;
        RelativeLayout relativeLayout = new RelativeLayout(this.f67211x.getContext());
        TextView textView = null;
        if (this.f67251v > 0 && (iZ = this.f67246l) > 0) {
            y.z zVar = this.f67238w;
            if (zVar != null && zVar.f() != null && this.f67238w.f().c() != null && this.f67238w.f().c().z() > 0 && this.f67238w.f().c().z() <= 100) {
                int i10 = this.f67246l;
                iZ = i10 + ((this.f67238w.f().c().z() * i10) / 100);
                textView = new TextView(this.f67211x.getContext());
                textView.setGravity(17);
                textView.setTextSize(8.0f);
                textView.setText(this.f67238w.f().c().w());
            }
            layoutParams = new FrameLayout.LayoutParams(j0.z(this.f67211x.getContext(), this.f67251v), j0.z(this.f67211x.getContext(), iZ));
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        }
        layoutParams.gravity = 17;
        this.f67211x.addView(relativeLayout, layoutParams);
        if (this.f67251v > 0 && this.f67246l > 0) {
            layoutParams2 = new RelativeLayout.LayoutParams(j0.z(this.f67211x.getContext(), this.f67251v), j0.z(this.f67211x.getContext(), this.f67246l));
        } else {
            layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        }
        layoutParams2.addRule(13);
        relativeLayout.addView(view, layoutParams2);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setImageResource(R.drawable.taurusx_ic_privacy);
        imageView.setOnClickListener(new p());
        relativeLayout.addView(imageView, new RelativeLayout.LayoutParams(j0.z(view.getContext(), 14), j0.z(view.getContext(), 14)));
        if (textView != null) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams3.addRule(12);
            relativeLayout.addView(textView, layoutParams3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
        if (this.R.getAndSet(true)) {
            return;
        }
        this.f67240z.z(zVar, aVar, (String) null, false);
    }

    @Override // com.taurusx.tax.w.a.z
    public void z(ViewGroup viewGroup) {
        if (androidx.activity.s.a(this.f67210r)) {
            if (this.f67245k) {
                return;
            }
            com.taurusx.tax.g.m.z(new RunnableC0820w(viewGroup), 1000L);
        } else {
            if (!w(this.f67211x) || j0.z(this.f67211x, this.f67235c, j0.z(viewGroup.getContext(), this.f67251v), j0.z(viewGroup.getContext(), this.f67246l))) {
                return;
            }
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(int i10) {
        if (this.A == null) {
            return;
        }
        com.taurusx.tax.n.y.z().z(i10, this.A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(int i10, int i11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("totalDuration", i11);
        } catch (JSONException unused) {
        }
        if (i10 == 25) {
            this.I = true;
            com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.f67238w.k(), com.taurusx.tax.w.s.w.f67529a, 0L, this.f67235c, jSONObject, (c.a) null);
            return;
        }
        if (i10 == 50) {
            this.J = true;
            com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.f67238w.k(), com.taurusx.tax.w.s.w.f67534n, 0L, this.f67235c, jSONObject, (c.a) null);
        } else if (i10 == 75) {
            this.K = true;
            com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.f67238w.k(), com.taurusx.tax.w.s.w.f67538t, 0L, this.f67235c, jSONObject, (c.a) null);
        } else if (i10 == 100) {
            this.L = true;
            com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.f67238w.k(), com.taurusx.tax.w.s.w.f67532g, 0L, this.f67235c, jSONObject, (c.a) null);
        }
    }
}
