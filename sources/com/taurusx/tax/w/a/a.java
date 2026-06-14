package com.taurusx.tax.w.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.iab.omid.library.taurusx.adsession.AdSession;
import com.iab.omid.library.taurusx.adsession.CreativeType;
import com.iab.omid.library.taurusx.adsession.media.MediaEvents;
import com.taurusx.tax.R;
import com.taurusx.tax.api.MediaView;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.g.f0;
import com.taurusx.tax.g.j0;
import com.taurusx.tax.g.m;
import com.taurusx.tax.g.p;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.ui.TaxMediaView;
import com.taurusx.tax.vast.VastConfig;
import com.taurusx.tax.vast.VastManager;
import com.taurusx.tax.w.c.y;
import com.taurusx.tax.w.s.c;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class a extends com.taurusx.tax.w.a.z {
    public static final int N = 100;
    public static final int O = 100;
    public TaxMediaView A;
    public boolean B;
    public MediaEvents C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public long H;
    public boolean I;
    public long J;
    public AtomicBoolean K;
    public AtomicBoolean L;
    public View.OnTouchListener M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f67079b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public VastConfig f67080d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ViewGroup f67081h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.taurusx.tax.w.c.w f67082j;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f67083q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.taurusx.tax.w.s.a f67084r;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public com.taurusx.tax.w.s.z f67085x;

    /* JADX INFO: renamed from: com.taurusx.tax.w.a.a$a, reason: collision with other inner class name */
    public class ViewOnTouchListenerC0818a implements View.OnTouchListener {
        public ViewOnTouchListenerC0818a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                a.this.f67084r.f67468z = System.currentTimeMillis();
                a.this.f67085x.w(String.valueOf((int) motionEvent.getX()));
                a.this.f67085x.y(String.valueOf((int) motionEvent.getY()));
            } else if (motionEvent.getAction() == 1) {
                a.this.f67084r.f67466w = System.currentTimeMillis();
                a.this.f67084r.f67467y = motionEvent.getDownTime();
                a.this.f67084r.f67463c = motionEvent.getEventTime();
                a.this.f67084r.z(motionEvent);
                a.this.f67085x.o(String.valueOf((int) motionEvent.getX()));
                a.this.f67085x.s(String.valueOf((int) motionEvent.getY()));
                a.this.f67085x.c(String.valueOf(view.getHeight()));
                a.this.f67085x.a(String.valueOf(view.getWidth()));
                a.this.f67085x.z(String.valueOf(System.currentTimeMillis()));
                LogUtil.d("CoordinateInfo", "the coordinate info " + a.this.f67085x.toString());
                a aVar = a.this;
                if (j0.z(aVar.f67235c, aVar.f67085x)) {
                    a aVar2 = a.this;
                    z(view, aVar2.f67085x, aVar2.f67084r);
                }
            }
            return true;
        }

        public void z(View view, com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
            if (a.this.f67081h != null) {
                a aVar2 = a.this;
                if (aVar2.z((View) aVar2.f67081h)) {
                    try {
                        if (a.this.f67082j != null) {
                            a.this.z(view.getContext(), view, a.this.f67082j.o(), true);
                            com.taurusx.tax.w.a.c cVar = a.this.f67236o;
                            if (cVar != null) {
                                cVar.onAdClicked();
                            }
                            a aVar3 = a.this;
                            aVar3.z(aVar3.f67238w.s(), zVar, aVar);
                            a.this.z(zVar, aVar);
                            a.this.w(zVar, aVar);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f67087w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ Context f67089z;

        public c(Context context, String str) {
            this.f67089z = context;
            this.f67087w = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new com.taurusx.tax.t.y.z((Activity) this.f67089z).z(this.f67087w).z(a.this.f67240z).w();
        }
    }

    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.taurusx.tax.w.c.y yVar = a.this.f67235c;
            if (yVar != null && yVar.c() != null && a.this.f67235c.c().w() != null && a.this.f67235c.c().w().q() == 1) {
                if (!a.this.D) {
                    a.this.D = true;
                    a aVar = a.this;
                    aVar.z(25, aVar.A.getVideoLength());
                    a.this.z(25);
                    MediaEvents mediaEvents = a.this.C;
                    a aVar2 = a.this;
                    com.taurusx.tax.s.z.y(mediaEvents, aVar2.f67247m, aVar2.f67240z);
                }
                if (!a.this.E) {
                    a.this.E = true;
                    a aVar3 = a.this;
                    aVar3.z(50, aVar3.A.getVideoLength());
                    a.this.z(50);
                    MediaEvents mediaEvents2 = a.this.C;
                    a aVar4 = a.this;
                    com.taurusx.tax.s.z.c(mediaEvents2, aVar4.f67247m, aVar4.f67240z);
                }
                if (!a.this.F) {
                    a.this.F = true;
                    a aVar5 = a.this;
                    aVar5.z(75, aVar5.A.getVideoLength());
                    a.this.z(75);
                    MediaEvents mediaEvents3 = a.this.C;
                    a aVar6 = a.this;
                    com.taurusx.tax.s.z.a(mediaEvents3, aVar6.f67247m, aVar6.f67240z);
                }
                if (!a.this.G) {
                    a.this.G = true;
                    a aVar7 = a.this;
                    aVar7.z(100, aVar7.A.getVideoLength());
                    a.this.z(100);
                    MediaEvents mediaEvents4 = a.this.C;
                    a aVar8 = a.this;
                    com.taurusx.tax.s.z.w(mediaEvents4, aVar8.f67247m, aVar8.f67240z);
                    com.taurusx.tax.s.z.z(a.this.C, a.this.f67240z);
                }
            }
            a aVar9 = a.this;
            com.taurusx.tax.s.z.y(aVar9.f67247m, aVar9.f67240z);
            a aVar10 = a.this;
            aVar10.f67247m = null;
            if (aVar10.A != null) {
                a.this.A.p();
            }
            a.this.f67245k = true;
        }
    }

    public class o implements Runnable {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f67092z;

        public o(ViewGroup viewGroup) {
            this.f67092z = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("checkVisible: ");
            sb2.append(a.this.z((View) this.f67092z));
            sb2.append(StringUtils.COMMA);
            sb2.append(a.this.f67251v);
            sb2.append(StringUtils.COMMA);
            sb2.append(a.this.f67246l);
            sb2.append(StringUtils.COMMA);
            ViewGroup viewGroup = this.f67092z;
            a aVar = a.this;
            sb2.append(j0.z(viewGroup, aVar.f67235c, aVar.f67251v, aVar.f67246l));
            LogUtil.d("taurusx", sb2.toString());
            if (a.this.f67079b) {
                if (a.this.z((View) this.f67092z)) {
                    a.this.z(this.f67092z);
                    return;
                } else {
                    a.this.t();
                    return;
                }
            }
            if (a.this.z((View) this.f67092z)) {
                ViewGroup viewGroup2 = this.f67092z;
                a aVar2 = a.this;
                if (!j0.z(viewGroup2, aVar2.f67235c, aVar2.f67251v, aVar2.f67246l)) {
                    a aVar3 = a.this;
                    int i10 = aVar3.f67241e + 1;
                    aVar3.f67241e = i10;
                    if (i10 < j0.w(aVar3.f67235c)) {
                        a.this.z(this.f67092z);
                        return;
                    }
                    a.this.f67081h = this.f67092z;
                    a.this.f67079b = true;
                    a.this.o();
                    a.this.z(this.f67092z);
                    return;
                }
            }
            a.this.z(this.f67092z);
        }
    }

    public class s implements Runnable {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ ArrayList f67093w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f67095z;

        public s(ViewGroup viewGroup, ArrayList arrayList) {
            this.f67095z = viewGroup;
            this.f67093w = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a aVar = a.this;
                Context context = TaurusXAds.getContext();
                CreativeType creativeType = CreativeType.NATIVE_DISPLAY;
                a aVar2 = a.this;
                aVar.f67247m = com.taurusx.tax.s.z.z(context, (String) null, creativeType, aVar2.f67238w, aVar2.f67240z);
                a aVar3 = a.this;
                AdSession adSession = aVar3.f67247m;
                if (adSession != null) {
                    aVar3.f67248p = com.taurusx.tax.s.z.z(adSession, aVar3.f67240z);
                    a.this.y(this.f67095z, (ArrayList<View>) this.f67093w);
                    a aVar4 = a.this;
                    com.taurusx.tax.s.z.o(aVar4.f67247m, aVar4.f67240z);
                    a aVar5 = a.this;
                    com.taurusx.tax.s.z.w(aVar5.f67248p, aVar5.f67240z);
                }
            } catch (Throwable th2) {
                Log.d(com.taurusx.tax.w.a.y.f67233n, "createSession failed", th2);
                com.taurusx.tax.w.s.s sVar = a.this.f67240z;
                if (sVar != null) {
                    sVar.w(th2.getMessage(), false);
                }
            }
        }
    }

    public class t implements Runnable {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f67097z;

        public t(ViewGroup viewGroup) {
            this.f67097z = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a aVar = a.this;
                Context context = TaurusXAds.getContext();
                CreativeType creativeType = CreativeType.VIDEO;
                VastConfig vastConfig = a.this.f67080d;
                a aVar2 = a.this;
                aVar.f67247m = com.taurusx.tax.s.z.z(context, null, creativeType, vastConfig, aVar2.f67238w, aVar2.f67240z);
                a aVar3 = a.this;
                AdSession adSession = aVar3.f67247m;
                if (adSession != null) {
                    aVar3.f67248p = com.taurusx.tax.s.z.z(adSession, aVar3.f67240z);
                    a aVar4 = a.this;
                    aVar4.C = com.taurusx.tax.s.z.w(aVar4.f67247m, aVar4.f67240z);
                    if (a.this.A != null) {
                        TaxMediaView taxMediaView = a.this.A;
                        a aVar5 = a.this;
                        taxMediaView.z(aVar5.f67247m, aVar5.C);
                    }
                    a aVar6 = a.this;
                    com.taurusx.tax.s.z.z(aVar6.f67247m, this.f67097z, aVar6.f67240z);
                    a aVar7 = a.this;
                    com.taurusx.tax.s.z.o(aVar7.f67247m, aVar7.f67240z);
                    a aVar8 = a.this;
                    com.taurusx.tax.s.z.w(aVar8.f67248p, aVar8.f67240z);
                }
            } catch (Throwable th2) {
                Log.d(com.taurusx.tax.w.a.y.f67233n, "createSession failed", th2);
                com.taurusx.tax.w.s.s sVar = a.this.f67240z;
                if (sVar != null) {
                    sVar.w(th2.getMessage(), false);
                }
            }
        }
    }

    public class w implements TaxMediaView.g {
        public w() {
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onPlayEnd() {
            if (a.this.I) {
                return;
            }
            a aVar = a.this;
            if (aVar.f67240z != null) {
                aVar.I = true;
                String diskMediaFileUrl = a.this.f67080d != null ? a.this.f67080d.getDiskMediaFileUrl() : null;
                if (TextUtils.isEmpty(diskMediaFileUrl)) {
                    return;
                }
                a aVar2 = a.this;
                aVar2.f67240z.z(diskMediaFileUrl, aVar2.H, false);
            }
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onPlayFailed() {
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onPlayProgress(int i10) {
            a aVar = a.this;
            aVar.z(i10, aVar.A.getVideoLength());
            a.this.z(i10);
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onPlayStart() {
            a aVar;
            com.taurusx.tax.w.s.s sVar;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("totalDuration", a.this.A.getVideoLength());
                com.taurusx.tax.w.c.y yVar = a.this.f67235c;
                if (yVar != null && yVar.c() != null && a.this.f67235c.c().w() != null && a.this.f67235c.c().w().R()) {
                    jSONObject.put("spendTime", System.currentTimeMillis() - a.this.J);
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), a.this.f67238w.k(), com.taurusx.tax.w.s.w.f67537s, 0L, a.this.f67235c, jSONObject, (c.a) null);
            if (a.this.f67080d != null && (sVar = (aVar = a.this).f67240z) != null) {
                sVar.y(aVar.f67080d.getDiskMediaFileUrl(), false);
            }
            a.this.z(0);
            com.taurusx.tax.s.z.w(a.this.C, a.this.f67240z);
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onProgress(int i10, int i11) {
            a.this.H = i10;
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void w() {
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void y() {
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void z() {
            a aVar = a.this;
            aVar.z(100, aVar.A.getVideoLength());
            a.this.z(100);
            MediaEvents mediaEvents = a.this.C;
            a aVar2 = a.this;
            com.taurusx.tax.s.z.w(mediaEvents, aVar2.f67247m, aVar2.f67240z);
            com.taurusx.tax.s.z.z(a.this.C, a.this.f67240z);
        }
    }

    public class y implements View.OnClickListener {
        public y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.z(view.getContext(), com.taurusx.tax.w.o.w.y(), (f0.z) null);
        }
    }

    public class z implements VastManager.VastManagerListener {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ JSONObject f67101z;

        public z(JSONObject jSONObject) {
            this.f67101z = jSONObject;
        }

        @Override // com.taurusx.tax.vast.VastManager.VastManagerListener
        public void onVastVideoConfigurationPrepared(VastConfig vastConfig, com.taurusx.tax.w.w wVar, long j10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onVastVideoConfigurationPrepared ");
            sb2.append(vastConfig == null ? "null" : vastConfig.toJsonString());
            LogUtil.v(com.taurusx.tax.w.a.y.f67233n, sb2.toString());
            if (vastConfig == null || TextUtils.isEmpty(vastConfig.getDiskMediaFileUrl())) {
                com.taurusx.tax.w.a.c cVar = a.this.f67236o;
                if (cVar != null) {
                    cVar.onAdLoadFailed(wVar);
                }
                com.taurusx.tax.w.s.s sVar = a.this.f67240z;
                if (sVar != null) {
                    sVar.z(1, System.currentTimeMillis() - a.this.J, vastConfig != null ? vastConfig.getDownloadRetriedCount() + 1 : 0, wVar.getCode(), wVar.getMessageCompatibility(), j10);
                    return;
                }
                return;
            }
            int downloadRetriedCount = vastConfig.isDownloadFromCache() ? 0 : vastConfig.getDownloadRetriedCount() + 1;
            com.taurusx.tax.w.s.s sVar2 = a.this.f67240z;
            if (sVar2 != null) {
                sVar2.z(1, System.currentTimeMillis() - a.this.J, downloadRetriedCount, com.taurusx.tax.w.w.SUCCESS.getCode(), "", j10);
            }
            a.this.f67080d = vastConfig;
            com.taurusx.tax.w.c.w wVar2 = new com.taurusx.tax.w.c.w();
            if (TextUtils.isEmpty(a.this.f67080d.getClickThroughUrl())) {
                wVar2.o(this.f67101z.optString(com.taurusx.tax.w.o.z.f67448v));
            } else {
                wVar2.o(a.this.f67080d.getClickThroughUrl());
            }
            wVar2.s(this.f67101z.optString(com.taurusx.tax.w.o.z.f67397e));
            wVar2.z(this.f67101z.optString(com.taurusx.tax.w.o.z.f67415k));
            wVar2.y(this.f67101z.optString(com.taurusx.tax.w.o.z.f67436r));
            wVar2.w(TextUtils.isEmpty(this.f67101z.optString(com.taurusx.tax.w.o.z.f67445u)) ? TaurusXAds.getContext().getString(R.string.taurusx_ads_know_more) : this.f67101z.optString(com.taurusx.tax.w.o.z.f67445u));
            a.this.f67082j = wVar2;
            com.taurusx.tax.w.a.c cVar2 = a.this.f67236o;
            if (cVar2 != null) {
                cVar2.onAdLoaded();
            }
        }

        @Override // com.taurusx.tax.vast.VastManager.VastManagerListener
        public void onVastVideoDownloadStart() {
        }
    }

    public a(String str, com.taurusx.tax.w.c.y yVar) {
        super(str, yVar);
        this.f67085x = new com.taurusx.tax.w.s.z();
        this.f67084r = new com.taurusx.tax.w.s.a();
        this.H = 0L;
        this.I = false;
        this.J = 0L;
        this.K = new AtomicBoolean(false);
        this.L = new AtomicBoolean(false);
        this.M = new ViewOnTouchListenerC0818a();
    }

    public com.taurusx.tax.w.c.w n() {
        return this.f67082j;
    }

    public void t() {
        m.c(new n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(ViewGroup viewGroup, ArrayList<View> arrayList) {
        com.taurusx.tax.s.z.z(this.f67247m, viewGroup, this.f67240z);
        if (arrayList != null) {
            for (View view : arrayList) {
                if (view != null) {
                    com.taurusx.tax.s.z.z(this.f67247m, view, this.f67240z);
                }
            }
        }
    }

    @Override // com.taurusx.tax.w.a.y
    public void c() {
        this.J = System.currentTimeMillis();
        try {
            String strW = this.f67238w.w();
            this.f67083q = strW;
            if ("native".equalsIgnoreCase(strW)) {
                JSONObject jSONObject = new JSONObject(this.f67238w.z());
                if (!TextUtils.isEmpty(jSONObject.optString(com.taurusx.tax.w.o.z.f67454x))) {
                    this.B = true;
                    com.taurusx.tax.w.s.s sVar = this.f67240z;
                    if (sVar != null) {
                        sVar.z(1);
                    }
                    new VastManager(TaurusXAds.getContext(), true, this.f67235c).prepareVastVideoConfiguration(jSONObject.optString(com.taurusx.tax.w.o.z.f67454x), new z(jSONObject), TaurusXAds.getContext());
                    return;
                }
                if (!TextUtils.isEmpty(jSONObject.optString(com.taurusx.tax.w.o.z.f67418l))) {
                    this.f67082j = z(new JSONObject(this.f67238w.z()));
                    com.taurusx.tax.w.a.c cVar = this.f67236o;
                    if (cVar != null) {
                        cVar.onAdLoaded();
                        return;
                    }
                    return;
                }
                com.taurusx.tax.w.a.c cVar2 = this.f67236o;
                if (cVar2 != null) {
                    cVar2.onAdLoadFailed(com.taurusx.tax.w.w.AD_CONTENT_ADM_NOT_SUPPORT);
                    return;
                }
                return;
            }
            com.taurusx.tax.w.a.c cVar3 = this.f67236o;
            if (cVar3 != null) {
                cVar3.onAdLoadFailed(com.taurusx.tax.w.w.AD_CONTENT_ADM_NOT_SUPPORT);
            }
        } catch (Throwable unused) {
            this.f67236o.onAdLoadFailed(com.taurusx.tax.w.w.AD_CONTENT_PARSE_FAILED);
        }
    }

    private void w(ViewGroup viewGroup, ArrayList<View> arrayList) {
        m.c(new s(viewGroup, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
        if (this.L.getAndSet(true)) {
            return;
        }
        this.f67240z.w(zVar, aVar, null, false);
    }

    private void w(ViewGroup viewGroup) {
        m.c(new t(viewGroup));
    }

    @Override // com.taurusx.tax.w.a.y
    public void z(com.taurusx.tax.w.y yVar) {
        super.z(yVar);
        this.f67251v = 100;
        this.f67246l = 100;
    }

    private com.taurusx.tax.w.c.w z(JSONObject jSONObject) {
        String strOptString;
        com.taurusx.tax.w.c.w wVar = new com.taurusx.tax.w.c.w();
        wVar.s(jSONObject.optString(com.taurusx.tax.w.o.z.f67397e, null));
        wVar.z(jSONObject.optString(com.taurusx.tax.w.o.z.f67415k, null));
        if (jSONObject.has(com.taurusx.tax.w.o.z.f67448v)) {
            wVar.o(jSONObject.optString(com.taurusx.tax.w.o.z.f67448v));
        }
        if (jSONObject.has(com.taurusx.tax.w.o.z.f67445u)) {
            if (TextUtils.isEmpty(jSONObject.optString(com.taurusx.tax.w.o.z.f67445u))) {
                strOptString = TaurusXAds.getContext().getString(R.string.taurusx_ads_know_more);
            } else {
                strOptString = jSONObject.optString(com.taurusx.tax.w.o.z.f67445u);
            }
            wVar.w(strOptString);
        }
        if (jSONObject.has(com.taurusx.tax.w.o.z.f67436r)) {
            wVar.y(jSONObject.optString(com.taurusx.tax.w.o.z.f67436r));
        }
        if (jSONObject.has(com.taurusx.tax.w.o.z.f67418l)) {
            wVar.c(jSONObject.optString(com.taurusx.tax.w.o.z.f67418l));
        }
        return wVar;
    }

    public com.taurusx.tax.w.w z(ViewGroup viewGroup, ImageView imageView, MediaView mediaView, List<View> list, com.taurusx.tax.w.c.w wVar) {
        com.taurusx.tax.w.c.w wVar2;
        if (this.f67240z == null) {
            this.f67240z = com.taurusx.tax.w.s.s.z(this.f67235c);
        }
        if (viewGroup == null) {
            Log.v(com.taurusx.tax.w.a.y.f67233n, "registerView viewGroup is null");
            return com.taurusx.tax.w.w.AD_REGISTER_WITH_NULL_VIEW_GROUP;
        }
        if (wVar != null && (wVar2 = this.f67082j) != null && wVar == wVar2) {
            z(viewGroup, imageView, mediaView, list);
            return com.taurusx.tax.w.w.SUCCESS;
        }
        Log.v(com.taurusx.tax.w.a.y.f67233n, "nativeAd is not valid");
        return com.taurusx.tax.w.w.AD_CONTENT_EMPTY;
    }

    public void z(ViewGroup viewGroup, ImageView imageView, MediaView mediaView, List<View> list) {
        Context context = viewGroup.getContext();
        if (this.B) {
            if (imageView != null) {
                p.z(imageView, this.f67082j.y());
            }
            TaxMediaView taxMediaView = new TaxMediaView(TaurusXAds.getContext());
            this.A = taxMediaView;
            taxMediaView.z(this.f67238w, this.f67080d);
            this.A.setMute(true);
            this.A.setmEnableAutoOrientation(true);
            this.A.setAdContainerView(mediaView);
            this.A.setTaxCustomEvent(this.f67240z);
            this.A.setOnPlayerListener(new w());
            this.A.e();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            mediaView.addView(this.A, layoutParams);
        } else {
            if (imageView != null) {
                p.z(imageView, this.f67082j.y());
            }
            if (mediaView != null) {
                ImageView imageView2 = new ImageView(mediaView.getContext());
                imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView2.setAdjustViewBounds(true);
                p.z(imageView2, this.f67082j.c());
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.addRule(13);
                mediaView.addView(imageView2, layoutParams2);
            }
        }
        if (mediaView != null) {
            ImageView imageView3 = new ImageView(context);
            imageView3.setImageResource(R.drawable.taurusx_ic_privacy);
            ViewGroup.LayoutParams layoutParamsZ = j0.z(mediaView, j0.z(context, 14), j0.z(context, 14), 2);
            imageView3.setOnClickListener(new y());
            mediaView.addView(imageView3, layoutParamsZ);
        }
        y.z zVar = this.f67238w;
        String strZ = (zVar == null || zVar.f() == null) ? "" : this.f67238w.f().z();
        if (!TextUtils.isEmpty(strZ) && mediaView != null && (context instanceof Activity)) {
            ImageView imageView4 = new ImageView(context);
            imageView4.setImageResource(R.drawable.taurusx_ic_more);
            ViewGroup.LayoutParams layoutParamsZ2 = j0.z(mediaView, j0.z(context, 22), j0.z(context, 22), 1);
            if (layoutParamsZ2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParamsZ2;
                marginLayoutParams.topMargin = j0.z(context, 4);
                marginLayoutParams.rightMargin = j0.z(context, 4);
            }
            imageView4.setOnClickListener(new c(context, strZ));
            mediaView.addView(imageView4, layoutParamsZ2);
        }
        com.taurusx.tax.w.c.y yVar = this.f67235c;
        if (yVar != null && yVar.c() != null && this.f67235c.c().w() != null && this.f67235c.c().w().J()) {
            TextView textView = new TextView(context);
            textView.setText("AD");
            textView.setTextSize(8.0f);
            textView.setGravity(17);
            textView.setTextColor(Color.parseColor("#70ffffff"));
            ViewGroup.LayoutParams layoutParamsZ3 = j0.z(mediaView, -2, j0.z(context, 14), 2);
            if (layoutParamsZ3 instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParamsZ3).leftMargin = j0.z(context, 16);
            }
            mediaView.addView(textView, layoutParamsZ3);
        }
        try {
            ArrayList<View> arrayList = new ArrayList<>();
            z(viewGroup, arrayList);
            if (this.B) {
                w(viewGroup);
            } else {
                w(viewGroup, arrayList);
            }
            z(arrayList, list, this.M);
        } catch (Exception e10) {
            Log.v(com.taurusx.tax.w.a.y.f67233n, "register view click exception:" + e10);
        }
        z(viewGroup);
    }

    @Override // com.taurusx.tax.w.a.z
    public void z(ViewGroup viewGroup) {
        if (this.f67245k) {
            return;
        }
        m.z(new o(viewGroup), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
        if (this.K.getAndSet(true)) {
            return;
        }
        this.f67240z.z(zVar, aVar, (String) null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z(View view) {
        return view.getVisibility() == 0 && view.isShown() && view.getWidth() > 100 && view.getHeight() > 100 && view.getGlobalVisibleRect(new Rect());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(int i10) {
        if (this.f67080d == null) {
            return;
        }
        com.taurusx.tax.n.y.z().z(i10, this.f67080d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(int i10, int i11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("totalDuration", i11);
        } catch (JSONException unused) {
        }
        if (i10 == 25) {
            this.D = true;
            com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.f67238w.k(), com.taurusx.tax.w.s.w.f67529a, 0L, this.f67235c, jSONObject, (c.a) null);
            return;
        }
        if (i10 == 50) {
            this.E = true;
            com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.f67238w.k(), com.taurusx.tax.w.s.w.f67534n, 0L, this.f67235c, jSONObject, (c.a) null);
        } else if (i10 == 75) {
            this.F = true;
            com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.f67238w.k(), com.taurusx.tax.w.s.w.f67538t, 0L, this.f67235c, jSONObject, (c.a) null);
        } else if (i10 == 100) {
            this.G = true;
            com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.f67238w.k(), com.taurusx.tax.w.s.w.f67532g, 0L, this.f67235c, jSONObject, (c.a) null);
        }
    }
}
