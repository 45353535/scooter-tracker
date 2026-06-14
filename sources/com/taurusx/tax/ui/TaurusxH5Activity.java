package com.taurusx.tax.ui;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.iab.omid.library.taurusx.adsession.AdEvents;
import com.iab.omid.library.taurusx.adsession.AdSession;
import com.iab.omid.library.taurusx.adsession.CreativeType;
import com.iab.omid.library.taurusx.adsession.media.MediaEvents;
import com.iab.omid.library.taurusx.adsession.media.Position;
import com.iab.omid.library.taurusx.adsession.media.VastProperties;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.R;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.g.e;
import com.taurusx.tax.g.f0;
import com.taurusx.tax.g.j0;
import com.taurusx.tax.g.k0;
import com.taurusx.tax.g.l0;
import com.taurusx.tax.g.m;
import com.taurusx.tax.g.p;
import com.taurusx.tax.g.t;
import com.taurusx.tax.g.x;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.o.g0;
import com.taurusx.tax.t.z;
import com.taurusx.tax.vast.VastCompanionAdConfig;
import com.taurusx.tax.vast.VastConfig;
import com.taurusx.tax.vast.VastManager;
import com.taurusx.tax.vast.VastTracker;
import com.taurusx.tax.w.a.n;
import com.taurusx.tax.w.a.s;
import com.taurusx.tax.w.c.y;
import com.taurusx.tax.w.s.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class TaurusxH5Activity extends Activity {
    public static final String E0 = "TaurusxH5Activity";
    public static final String F0 = "cover.png";
    public boolean A;
    public boolean A0;
    public int B;
    public String C;
    public boolean D;
    public String E;
    public long F;
    public String G;
    public String H;
    public String I;
    public boolean J;
    public int K;
    public int L;
    public boolean M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public boolean T;
    public boolean U;
    public long V;
    public long W;
    public String Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y.z f66729a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f66730a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f66731b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f66732b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FrameLayout f66733c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f66734c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f66735d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f66736d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f66737e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f66738e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.taurusx.tax.w.s.s f66739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.taurusx.tax.w.c.y f66741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f66743h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public long f66744h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f66745i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f66746i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f66747j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f66748j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f66749k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f66751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f66753m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f66754m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f66755n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f66756n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f66757o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f66758o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.taurusx.tax.w.a.c f66759p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public long f66760p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f66761q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f66762q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f66763r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f66764r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f66765s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f66766s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public VastConfig f66767t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f66768t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f66769u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f66770u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public y.w.C0823w f66771v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.taurusx.tax.t.z f66773w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public AdSession f66774w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f66775x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public AdEvents f66776x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public RelativeLayout f66777y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public MediaEvents f66778y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.taurusx.tax.t.z f66779z;
    public boolean X = true;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public com.taurusx.tax.w.s.z f66740f0 = new com.taurusx.tax.w.s.z();

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public com.taurusx.tax.w.s.a f66742g0 = new com.taurusx.tax.w.s.a();

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public long f66750k0 = 0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public com.taurusx.tax.w.w f66752l0 = com.taurusx.tax.w.w.SUCCESS;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public long f66772v0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f66780z0 = false;
    public JSONArray B0 = new JSONArray();
    public AtomicBoolean C0 = new AtomicBoolean(false);
    public AtomicBoolean D0 = new AtomicBoolean(false);

    public class c implements z.InterfaceC0815z {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ List f66782w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ List f66784z;

        public class z implements f0.z {

            /* JADX INFO: renamed from: com.taurusx.tax.ui.TaurusxH5Activity$c$z$z, reason: collision with other inner class name */
            public class RunnableC0816z implements Runnable {

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ Intent f66786w;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                public final /* synthetic */ Context f66788z;

                public RunnableC0816z(Context context, Intent intent) {
                    this.f66788z = context;
                    this.f66786w = intent;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.f66788z.startActivity(this.f66786w);
                }
            }

            public z() {
            }

            @Override // com.taurusx.tax.g.f0.z
            public void z(Context context, Intent intent) {
                LogUtil.d("taurusx", "activityStartDelegate startActivity with postWhenViewShown..." + intent.resolveActivity(context.getPackageManager()));
                k0.z(TaurusxH5Activity.this.f66779z, new RunnableC0816z(context, intent));
            }
        }

        public c(List list, List list2) {
            this.f66784z = list;
            this.f66782w = list2;
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void w() {
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void z() {
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public /* synthetic */ void w(WebView webView, String str) {
            z5.a.a(this, webView, str);
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public /* synthetic */ void z(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
            z5.a.c(this, zVar, aVar);
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void w(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public boolean z(String str) {
            String str2;
            LogUtil.d("taurusx", "onJump url: " + str);
            Uri uri = Uri.parse(str);
            if (uri != null && "taurusx".equals(uri.getScheme())) {
                try {
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                if ("handle_start".equals(uri.getHost())) {
                    TaurusxH5Activity.this.f66777y.setVisibility(8);
                    if (TaurusxH5Activity.this.f66759p != null) {
                        TaurusxH5Activity.this.f66759p.onAdVideoStart();
                    }
                    if (j0.s(uri.getQueryParameter("value"))) {
                        TaurusxH5Activity.this.f66760p0 = Long.valueOf(uri.getQueryParameter("value")).longValue();
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("totalDuration", TaurusxH5Activity.this.f66760p0);
                        if (TaurusxH5Activity.this.f66741g != null && TaurusxH5Activity.this.f66741g.c() != null && TaurusxH5Activity.this.f66741g.c().w() != null && TaurusxH5Activity.this.f66741g.c().w().R()) {
                            jSONObject.put("spendTime", System.currentTimeMillis() - TaurusxH5Activity.this.f66744h0);
                        }
                        jSONObject.put(CampaignEx.KEY_SHOW_TYPE, 2);
                    } catch (JSONException e11) {
                        e11.printStackTrace();
                    }
                    if (TaurusxH5Activity.this.f66767t != null) {
                        TaurusxH5Activity taurusxH5Activity = TaurusxH5Activity.this;
                        com.taurusx.tax.w.s.c.z(taurusxH5Activity, taurusxH5Activity.f66729a.k(), com.taurusx.tax.w.s.w.f67537s, 0L, TaurusxH5Activity.this.f66741g, jSONObject, (c.a) null);
                    }
                    if (TaurusxH5Activity.this.f66767t != null && TaurusxH5Activity.this.f66739f != null) {
                        TaurusxH5Activity.this.f66739f.y(TaurusxH5Activity.this.f66767t.getDiskMediaFileUrl(), true);
                    }
                    TaurusxH5Activity.this.z(0);
                    com.taurusx.tax.s.z.z(TaurusxH5Activity.this.f66778y0, TaurusxH5Activity.this.f66774w0, TaurusxH5Activity.this.f66760p0, !TaurusxH5Activity.this.f66753m ? 1 : 0, TaurusxH5Activity.this.f66739f);
                } else if ("handle_end".equals(uri.getHost())) {
                    if (TaurusxH5Activity.this.f66759p != null) {
                        TaurusxH5Activity.this.f66759p.onAdVideoEnd();
                    }
                    if (TaurusxH5Activity.this.f66767t != null) {
                        TaurusxH5Activity.this.l();
                    }
                    TaurusxH5Activity.this.v();
                } else if ("handle_duration".equals(uri.getHost())) {
                    if (j0.s(uri.getQueryParameter("value"))) {
                        long jLongValue = Long.valueOf(uri.getQueryParameter("value")).longValue();
                        if (!TaurusxH5Activity.this.f66758o0) {
                            TaurusxH5Activity.this.f66772v0 = jLongValue;
                        }
                        if (jLongValue > TaurusxH5Activity.this.f66749k) {
                            TaurusxH5Activity.this.v();
                        }
                        if (TaurusxH5Activity.this.f66767t != null) {
                            TaurusxH5Activity.this.z(jLongValue);
                        }
                    }
                } else {
                    if ("handle_click".equals(uri.getHost())) {
                        if (TaurusxH5Activity.this.f66759p != null) {
                            TaurusxH5Activity.this.f66759p.onAdClicked();
                        }
                        String queryParameter = uri.getQueryParameter("value");
                        String queryParameter2 = uri.getQueryParameter("downX");
                        String queryParameter3 = uri.getQueryParameter("downY");
                        String queryParameter4 = uri.getQueryParameter("downTime");
                        String queryParameter5 = uri.getQueryParameter("upX");
                        String queryParameter6 = uri.getQueryParameter("upY");
                        String queryParameter7 = uri.getQueryParameter("upTime");
                        String queryParameter8 = uri.getQueryParameter("screenWidth");
                        String queryParameter9 = uri.getQueryParameter("screenHeight");
                        if (j0.s(queryParameter4)) {
                            str2 = queryParameter5;
                            TaurusxH5Activity.this.f66742g0.f67467y = x.z(queryParameter4, 0L);
                        } else {
                            str2 = queryParameter5;
                        }
                        if (j0.s(queryParameter7)) {
                            TaurusxH5Activity.this.f66742g0.f67463c = x.z(queryParameter7, 0L);
                        }
                        TaurusxH5Activity.this.f66740f0.w(j0.z(TaurusxH5Activity.this, x.z(queryParameter2, 0.0d)) + "");
                        TaurusxH5Activity.this.f66740f0.y(j0.z(TaurusxH5Activity.this, x.z(queryParameter3, 0.0d)) + "");
                        TaurusxH5Activity.this.f66740f0.o(j0.z(TaurusxH5Activity.this, x.z(str2, 0.0d)) + "");
                        TaurusxH5Activity.this.f66740f0.s(j0.z(TaurusxH5Activity.this, x.z(queryParameter6, 0.0d)) + "");
                        TaurusxH5Activity.this.f66740f0.z(queryParameter7);
                        TaurusxH5Activity.this.f66740f0.a(queryParameter8);
                        TaurusxH5Activity.this.f66740f0.c(queryParameter9);
                        TaurusxH5Activity taurusxH5Activity2 = TaurusxH5Activity.this;
                        taurusxH5Activity2.z(taurusxH5Activity2.f66740f0, TaurusxH5Activity.this.f66742g0, queryParameter);
                    } else if ("handle_skip".equals(uri.getHost())) {
                        TaurusxH5Activity.this.f66758o0 = true;
                        String queryParameter10 = uri.getQueryParameter("value");
                        if (TaurusxH5Activity.this.f66739f != null) {
                            TaurusxH5Activity.this.f66739f.z(System.currentTimeMillis() - TaurusxH5Activity.this.f66750k0, queryParameter10, true);
                        }
                        com.taurusx.tax.n.y.z().c(TaurusxH5Activity.this.f66767t);
                        com.taurusx.tax.s.z.y(TaurusxH5Activity.this.f66778y0, TaurusxH5Activity.this.f66739f);
                        if (TaurusxH5Activity.this.f66759p != null) {
                            TaurusxH5Activity.this.f66759p.onAdVideoEnd();
                        }
                    } else if ("handle_close".equals(uri.getHost())) {
                        TaurusxH5Activity.this.y();
                        if (TaurusxH5Activity.this.f66759p != null) {
                            int iIntValue = j0.o(uri.getQueryParameter("value")) ? Integer.valueOf(uri.getQueryParameter("value")).intValue() : 0;
                            if (TaurusxH5Activity.this.f66739f != null) {
                                TaurusxH5Activity.this.f66739f.z(0.0f, 0.0f, System.currentTimeMillis() - TaurusxH5Activity.this.f66750k0, iIntValue, TaurusxH5Activity.this.B0, true);
                            }
                            com.taurusx.tax.n.y.z().z(TaurusxH5Activity.this.f66767t);
                            TaurusxH5Activity.this.f66759p.onAdClosed();
                            TaurusxH5Activity.this.f66746i0 = true;
                        }
                        TaurusxH5Activity.this.finish();
                    } else if ("handle_logo_click".equals(uri.getHost())) {
                        com.taurusx.tax.g.o.z(TaurusxH5Activity.this.f66741g, TaurusxH5Activity.this.f66757o, TaurusXAds.getContext(), com.taurusx.tax.w.o.w.y(), null);
                    } else if ("handle_show".equals(uri.getHost()) && TaurusxH5Activity.this.B == 2) {
                        String queryParameter11 = uri.getQueryParameter("value");
                        if (CampaignEx.JSON_NATIVE_VIDEO_ENDCARD.equals(queryParameter11)) {
                            TaurusxH5Activity.this.f66773w.setVisibility(0);
                        } else if ("endcard2".equals(queryParameter11)) {
                            TaurusxH5Activity.this.f66773w.setVisibility(8);
                        }
                    } else if (TextUtils.equals("handle_coordinate", uri.getHost())) {
                        this.f66784z.clear();
                        String queryParameter12 = uri.getQueryParameter("value");
                        if (!TextUtils.isEmpty(queryParameter12)) {
                            JSONArray jSONArray = new JSONArray(queryParameter12);
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                JSONArray jSONArrayOptJSONArray = jSONArray.optJSONArray(i10);
                                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() >= 4) {
                                    this.f66784z.add(new Rect(j0.z(TaurusxH5Activity.this, jSONArrayOptJSONArray.optDouble(0)), j0.z(TaurusxH5Activity.this, jSONArrayOptJSONArray.optDouble(1)), j0.z(TaurusxH5Activity.this, jSONArrayOptJSONArray.optDouble(0) + jSONArrayOptJSONArray.optDouble(2)), j0.z(TaurusxH5Activity.this, jSONArrayOptJSONArray.optDouble(1) + jSONArrayOptJSONArray.optDouble(3))));
                                }
                            }
                        }
                    }
                    return true;
                }
                return true;
            }
            try {
                z zVar = new z();
                if (f0.z(TaurusxH5Activity.this, null, str, zVar)) {
                    return true;
                }
                if (str != null && str.startsWith("http")) {
                    com.taurusx.tax.g.o.z(TaurusxH5Activity.this.f66741g, TaurusxH5Activity.this.f66757o, TaurusxH5Activity.this, str, zVar);
                    return true;
                }
            } catch (Throwable th2) {
                LogUtil.v(TaurusxH5Activity.E0, "onClickEvent:" + th2.getMessage());
            }
            return false;
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public WebResourceResponse z(WebView webView, String str) {
            String strReplace;
            LogUtil.d("taurusx", "shouldInterceptRequest : " + str);
            if (TextUtils.isEmpty(str) || !str.startsWith("file:///")) {
                return null;
            }
            if (str.endsWith(".0")) {
                strReplace = str.replace("file:///", com.taurusx.tax.g.n0.z.z(webView.getContext()).getPath() + "/");
            } else {
                strReplace = str.replace("file:///", com.taurusx.tax.g.n0.z.z(webView.getContext()).getPath() + "/" + j0.z(TaurusxH5Activity.this.G) + "/");
            }
            return l0.z(strReplace);
        }
    }

    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (TaurusxH5Activity.this.f66755n == 1) {
                    TaurusxH5Activity.this.f66774w0 = com.taurusx.tax.s.z.z(TaurusXAds.getContext(), (String) null, CreativeType.VIDEO, TaurusxH5Activity.this.f66767t, TaurusxH5Activity.this.f66739f);
                    if (TaurusxH5Activity.this.f66774w0 != null) {
                        TaurusxH5Activity taurusxH5Activity = TaurusxH5Activity.this;
                        taurusxH5Activity.f66776x0 = com.taurusx.tax.s.z.z(taurusxH5Activity.f66774w0, TaurusxH5Activity.this.f66739f);
                        TaurusxH5Activity taurusxH5Activity2 = TaurusxH5Activity.this;
                        taurusxH5Activity2.f66778y0 = com.taurusx.tax.s.z.w(taurusxH5Activity2.f66774w0, TaurusxH5Activity.this.f66739f);
                        com.taurusx.tax.s.z.z(TaurusxH5Activity.this.f66774w0, (ViewGroup) TaurusxH5Activity.this.f66733c, TaurusxH5Activity.this.f66739f);
                        com.taurusx.tax.s.z.o(TaurusxH5Activity.this.f66774w0, TaurusxH5Activity.this.f66739f);
                        com.taurusx.tax.s.z.z(TaurusxH5Activity.this.f66776x0, VastProperties.createVastPropertiesForSkippableMedia(TaurusxH5Activity.this.f66745i ? TaurusxH5Activity.this.f66749k : TaurusxH5Activity.this.f66769u, true, Position.STANDALONE), TaurusxH5Activity.this.f66739f);
                        return;
                    }
                    return;
                }
                if (TaurusxH5Activity.this.f66755n == 3) {
                    TaurusxH5Activity.this.f66774w0 = com.taurusx.tax.s.z.z(TaurusXAds.getContext(), (String) null, CreativeType.NATIVE_DISPLAY, TaurusxH5Activity.this.f66729a, TaurusxH5Activity.this.f66739f);
                    if (TaurusxH5Activity.this.f66774w0 != null) {
                        TaurusxH5Activity taurusxH5Activity3 = TaurusxH5Activity.this;
                        taurusxH5Activity3.f66776x0 = com.taurusx.tax.s.z.z(taurusxH5Activity3.f66774w0, TaurusxH5Activity.this.f66739f);
                        com.taurusx.tax.s.z.z(TaurusxH5Activity.this.f66774w0, (ViewGroup) TaurusxH5Activity.this.f66733c, TaurusxH5Activity.this.f66739f);
                        com.taurusx.tax.s.z.o(TaurusxH5Activity.this.f66774w0, TaurusxH5Activity.this.f66739f);
                        com.taurusx.tax.s.z.w(TaurusxH5Activity.this.f66776x0, TaurusxH5Activity.this.f66739f);
                    }
                }
            } catch (Throwable th2) {
                Log.d(TaurusxH5Activity.E0, "createSession failed", th2);
                if (TaurusxH5Activity.this.f66739f != null) {
                    TaurusxH5Activity.this.f66739f.w(th2.getMessage(), true);
                }
            }
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TaurusxH5Activity.this.X) {
                if (TaurusxH5Activity.this.f66756n0) {
                    TaurusxH5Activity.this.o();
                    return;
                }
                TaurusxH5Activity.F(TaurusxH5Activity.this);
                LogUtil.v(TaurusxH5Activity.E0, "valid number  = " + j0.y(TaurusxH5Activity.this.f66741g));
                if (TaurusxH5Activity.this.f66748j0 >= j0.y(TaurusxH5Activity.this.f66741g)) {
                    TaurusxH5Activity.this.g();
                } else {
                    TaurusxH5Activity.this.o();
                }
            }
        }
    }

    public class s implements Runnable {
        public s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TaurusxH5Activity.this.f66755n == 1 || TaurusxH5Activity.this.f66755n == 3) {
                com.taurusx.tax.s.z.z(TaurusxH5Activity.this.f66776x0, TaurusxH5Activity.this.f66739f);
            }
        }
    }

    public class w implements View.OnLongClickListener {
        public w() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            WebView.HitTestResult hitTestResult = TaurusxH5Activity.this.f66779z.getHitTestResult();
            return hitTestResult != null && hitTestResult.getType() == 7 && TextUtils.equals("taurusx://stop_touch", hitTestResult.getExtra());
        }
    }

    public class y implements View.OnTouchListener {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ List f66794z;

        public y(List list) {
            this.f66794z = list;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onTouch(android.view.View r5, android.view.MotionEvent r6) {
            /*
                r4 = this;
                r5 = 0
                if (r6 != 0) goto L4
                return r5
            L4:
                java.util.List r0 = r4.f66794z
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L2f
                java.util.List r0 = r4.f66794z
                java.util.Iterator r0 = r0.iterator()
            L12:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2f
                java.lang.Object r1 = r0.next()
                android.graphics.Rect r1 = (android.graphics.Rect) r1
                float r2 = r6.getX()
                int r2 = (int) r2
                float r3 = r6.getY()
                int r3 = (int) r3
                boolean r1 = r1.contains(r2, r3)
                if (r1 == 0) goto L12
                goto L40
            L2f:
                com.taurusx.tax.ui.TaurusxH5Activity r0 = com.taurusx.tax.ui.TaurusxH5Activity.this
                com.taurusx.tax.t.z r0 = com.taurusx.tax.ui.TaurusxH5Activity.y(r0)
                if (r0 == 0) goto L40
                com.taurusx.tax.ui.TaurusxH5Activity r0 = com.taurusx.tax.ui.TaurusxH5Activity.this
                com.taurusx.tax.t.z r0 = com.taurusx.tax.ui.TaurusxH5Activity.y(r0)
                r0.dispatchTouchEvent(r6)
            L40:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.ui.TaurusxH5Activity.y.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    public class z implements z.InterfaceC0815z {

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ y.z f66797y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public com.taurusx.tax.w.s.z f66798z = null;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public com.taurusx.tax.w.s.a f66796w = null;

        public z(y.z zVar) {
            this.f66797y = zVar;
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void w() {
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public /* synthetic */ WebResourceResponse z(WebView webView, String str) {
            return z5.a.b(this, webView, str);
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void w(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
            this.f66798z = zVar;
            this.f66796w = aVar;
            if (!TaurusxH5Activity.this.A0) {
                if (j0.z(TaurusxH5Activity.this.f66741g, zVar)) {
                    if (TaurusxH5Activity.this.f66759p != null) {
                        TaurusxH5Activity.this.f66759p.onAdClicked();
                    }
                    TaurusxH5Activity.this.z(zVar, aVar);
                    TaurusxH5Activity taurusxH5Activity = TaurusxH5Activity.this;
                    taurusxH5Activity.y(zVar, aVar, taurusxH5Activity.f66767t != null ? CampaignEx.JSON_NATIVE_VIDEO_ENDCARD : "adcontent");
                    return;
                }
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("down_x", zVar.w());
                jSONObject.put("down_y", zVar.y());
                jSONObject.put("up_x", zVar.o());
                jSONObject.put("up_y", zVar.s());
                jSONObject.put("down_time", aVar.f67467y);
                jSONObject.put("up_time", aVar.f67463c);
                jSONObject.put("down_ts", aVar.f67468z);
                jSONObject.put("up_ts", aVar.f67466w);
            } catch (Exception unused) {
            }
            TaurusxH5Activity.this.B0.put(jSONObject);
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void z(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
            TaurusxH5Activity.this.f66754m0 = true;
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public boolean z(String str) {
            boolean z10 = false;
            boolean z11 = (TaurusxH5Activity.this.f66741g == null || TaurusxH5Activity.this.f66741g.c() == null || TaurusxH5Activity.this.f66741g.c().w() == null || TaurusxH5Activity.this.f66741g.c().w().G() != 1) ? false : true;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (TaurusxH5Activity.this.f66754m0) {
                if (TaurusxH5Activity.this.A0) {
                    if (TaurusxH5Activity.this.f66759p != null) {
                        TaurusxH5Activity.this.f66759p.onAdClicked();
                    }
                    TaurusxH5Activity.this.z(this.f66798z, this.f66796w);
                    TaurusxH5Activity taurusxH5Activity = TaurusxH5Activity.this;
                    taurusxH5Activity.y(this.f66798z, this.f66796w, taurusxH5Activity.f66767t != null ? CampaignEx.JSON_NATIVE_VIDEO_ENDCARD : "adcontent");
                }
                TaurusxH5Activity taurusxH5Activity2 = TaurusxH5Activity.this;
                taurusxH5Activity2.c(this.f66798z, this.f66796w, taurusxH5Activity2.f66767t != null ? CampaignEx.JSON_NATIVE_VIDEO_ENDCARD : "adcontent");
            }
            if (TaurusxH5Activity.this.f66754m0 || !z11) {
                y.z zVar = TaurusxH5Activity.this.f66729a;
                com.taurusx.tax.w.c.y yVar = TaurusxH5Activity.this.f66741g;
                String str2 = TaurusxH5Activity.this.f66757o;
                TaurusxH5Activity taurusxH5Activity3 = TaurusxH5Activity.this;
                z10 = com.taurusx.tax.g.o.z(zVar, yVar, str2, taurusxH5Activity3, taurusxH5Activity3.f66773w, str, TaurusxH5Activity.this.f66754m0);
            }
            if (!TaurusxH5Activity.this.f66754m0 && !TaurusxH5Activity.this.f66738e0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("html", this.f66797y.z());
                    jSONObject.put("h", z10);
                    jSONObject.put("v", z11);
                    jSONObject.put(CampaignEx.KEY_SHOW_TYPE, 2);
                } catch (JSONException unused) {
                }
                com.taurusx.tax.w.s.c.z(TaurusxH5Activity.this.f66779z.getContext(), this.f66797y.k(), com.taurusx.tax.w.s.w.f67536p, 0L, TaurusxH5Activity.this.f66741g, jSONObject, (c.a) null);
                TaurusxH5Activity.this.f66738e0 = true;
            }
            if (!z11 || TaurusxH5Activity.this.f66754m0 || str.startsWith("http") || z10) {
                return z10;
            }
            return true;
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void w(WebView webView, String str) {
            if (TaurusxH5Activity.this.f66780z0) {
                return;
            }
            TaurusxH5Activity.this.f66780z0 = j0.c(str);
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void z() {
            if (TaurusxH5Activity.this.f66729a != null && TaurusxH5Activity.this.f66729a.y() == 7 && TaurusxH5Activity.this.f66755n == 2) {
                try {
                    TaurusxH5Activity.this.f66774w0 = com.taurusx.tax.s.z.z(TaurusXAds.getContext(), TaurusxH5Activity.this.f66773w, "", CreativeType.HTML_DISPLAY, TaurusxH5Activity.this.f66739f);
                    if (TaurusxH5Activity.this.f66774w0 != null) {
                        com.taurusx.tax.s.z.z(TaurusxH5Activity.this.f66774w0, (ViewGroup) TaurusxH5Activity.this.f66773w, TaurusxH5Activity.this.f66739f);
                        com.taurusx.tax.s.z.z(TaurusxH5Activity.this.f66774w0, (View) TaurusxH5Activity.this.f66779z, TaurusxH5Activity.this.f66739f);
                        com.taurusx.tax.s.z.o(TaurusxH5Activity.this.f66774w0, TaurusxH5Activity.this.f66739f);
                        TaurusxH5Activity taurusxH5Activity = TaurusxH5Activity.this;
                        taurusxH5Activity.f66776x0 = com.taurusx.tax.s.z.z(taurusxH5Activity.f66774w0, TaurusxH5Activity.this.f66739f);
                        com.taurusx.tax.s.z.w(TaurusxH5Activity.this.f66776x0, TaurusxH5Activity.this.f66739f);
                        com.taurusx.tax.s.z.z(TaurusxH5Activity.this.f66776x0, TaurusxH5Activity.this.f66739f);
                    }
                } catch (Throwable th2) {
                    if (TaurusxH5Activity.this.f66739f != null) {
                        TaurusxH5Activity.this.f66739f.w(th2.getMessage(), true);
                    }
                }
            }
        }
    }

    public static /* synthetic */ int F(TaurusxH5Activity taurusxH5Activity) {
        int i10 = taurusxH5Activity.f66748j0;
        taurusxH5Activity.f66748j0 = i10 + 1;
        return i10;
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.taurusx_activity_h5);
        z((Activity) this);
        if (TaurusXAds.isInitialized()) {
            f();
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        LogUtil.i("taurusx", "onDestroy hasCallClose: " + this.f66746i0);
        if (this.f66739f != null) {
            VastConfig vastConfig = this.f66767t;
            String diskMediaFileUrl = vastConfig != null ? vastConfig.getDiskMediaFileUrl() : null;
            if (!TextUtils.isEmpty(diskMediaFileUrl)) {
                this.f66739f.z(diskMediaFileUrl, this.f66772v0, true);
            }
        }
        if (!this.f66746i0 && this.f66759p != null) {
            com.taurusx.tax.w.s.s sVar = this.f66739f;
            if (sVar != null) {
                sVar.z(this.B0, true);
            }
            this.f66759p.onAdClosed();
            this.f66746i0 = true;
        }
        this.X = false;
        if (this.f66765s) {
            n.y.z().w(this.f66757o);
        } else {
            s.w.z().w(this.f66757o);
        }
        n();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (4 == i10) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        this.f66756n0 = true;
        if (this.f66755n == 1 && !this.f66758o0) {
            com.taurusx.tax.n.y.z().w(this.f66767t);
        }
        com.taurusx.tax.t.z zVar = this.f66779z;
        if (zVar != null) {
            zVar.loadUrl("javascript:SDK_CONFIG_EVENT.pause()");
        }
        if (!this.f66768t0) {
            com.taurusx.tax.s.z.o(this.f66778y0, this.f66774w0, this.f66739f);
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        this.f66756n0 = false;
        if (this.f66755n == 1 && !this.f66758o0) {
            com.taurusx.tax.n.y.z().y(this.f66767t);
        }
        com.taurusx.tax.t.z zVar = this.f66779z;
        if (zVar != null) {
            zVar.loadUrl("javascript:SDK_CONFIG_EVENT.play()");
        }
        z((Activity) this);
        com.taurusx.tax.s.z.s(this.f66778y0, this.f66774w0, this.f66739f);
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        LogUtil.i("taurusx", "onStop hasCallClose: " + this.f66746i0 + ",isFinishing: " + isFinishing());
        if (this.f66746i0 || !isFinishing() || this.f66759p == null) {
            return;
        }
        com.taurusx.tax.w.s.s sVar = this.f66739f;
        if (sVar != null) {
            sVar.z(this.B0, true);
        }
        this.f66759p.onAdClosed();
        this.f66746i0 = true;
    }

    private void a() {
        m.c(new n());
    }

    private void e() {
        if (getIntent().getIntExtra("orientation", 0) == 0) {
            setRequestedOrientation(1);
        } else {
            setRequestedOrientation(6);
        }
    }

    private void f() {
        e();
        this.f66757o = getIntent().getStringExtra("placementId");
        boolean booleanExtra = getIntent().getBooleanExtra("isSplash", false);
        this.f66765s = booleanExtra;
        com.taurusx.tax.w.c.z zVarZ = booleanExtra ? n.y.z().z(this.f66757o) : s.w.z().z(this.f66757o);
        this.f66744h0 = System.currentTimeMillis();
        if (zVarZ != null) {
            this.f66741g = zVarZ.k();
            this.Y = zVarZ.t();
            y.z zVarY = zVarZ.y();
            this.f66729a = zVarY;
            if (zVarY != null) {
                if ("vast".equalsIgnoreCase(zVarY.w())) {
                    this.f66755n = 1;
                } else if ("html".equalsIgnoreCase(this.f66729a.w())) {
                    this.f66755n = 2;
                } else if ("native".equalsIgnoreCase(this.f66729a.w())) {
                    this.f66755n = 3;
                } else if (POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(this.f66729a.w())) {
                    this.f66755n = 4;
                }
                if (this.f66729a.f() != null) {
                    this.A0 = this.f66729a.f().s() == 1;
                }
            }
            this.f66767t = zVarZ.u();
            boolean zB = zVarZ.b();
            this.f66753m = zB;
            if (!zB) {
                this.f66753m = j0.w(this);
            }
            this.f66745i = zVarZ.p() == 1;
            this.f66739f = zVarZ.l();
            this.f66759p = zVarZ.e();
            int i10 = this.f66755n;
            if (i10 == 1) {
                VastConfig vastConfig = this.f66767t;
                if (vastConfig != null && vastConfig.getVastCompanionAdConfigs().iterator().hasNext()) {
                    this.C = this.f66767t.getVastCompanionAdConfigs().iterator().next().getVastResource().getHtmlResourceValue();
                }
                if (!TextUtils.isEmpty(this.C)) {
                    this.A = true;
                    if (this.C.startsWith("<") || this.C.contains("mraid.js")) {
                        this.B = 2;
                    } else {
                        this.B = 1;
                    }
                }
                if (this.f66729a.f() != null) {
                    this.O = this.f66729a.f().o();
                    this.P = this.f66729a.f().a();
                    this.Q = this.f66729a.f().w();
                    this.R = this.f66729a.f().y();
                }
            } else if (i10 == 3) {
                try {
                    JSONObject jSONObject = new JSONObject(this.f66729a.z());
                    this.N = jSONObject.optString(com.taurusx.tax.w.o.z.f67418l);
                    this.O = jSONObject.optString(com.taurusx.tax.w.o.z.f67436r);
                    this.P = jSONObject.optString(com.taurusx.tax.w.o.z.f67397e);
                    this.Q = jSONObject.optString(com.taurusx.tax.w.o.z.f67445u);
                    this.S = jSONObject.optString(com.taurusx.tax.w.o.z.f67448v);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            com.taurusx.tax.w.c.y yVar = this.f66741g;
            if (yVar != null && yVar.c() != null) {
                this.f66771v = this.f66741g.c().w();
            }
            y.w.C0823w c0823w = this.f66771v;
            if (c0823w != null) {
                this.f66751l = this.f66765s ? c0823w.c() : c0823w.n();
                this.f66737e = this.f66771v.N();
                this.f66747j = this.f66771v.O();
                this.f66743h = this.f66771v.P();
                this.f66763r = this.f66771v.g();
                this.f66775x = this.f66771v.m();
                this.f66749k = this.f66771v.I();
                this.f66769u = this.f66771v.e();
                this.D = this.f66771v.J();
                this.F = this.f66771v.F();
                this.G = this.f66771v.v();
                this.U = this.f66771v.L();
                this.T = this.f66771v.M();
                this.V = this.f66771v.y();
                this.W = this.f66755n == 1 ? this.f66771v.s() : this.f66771v.o();
                this.H = this.f66771v.i();
                this.I = this.f66771v.p();
                this.J = this.f66771v.T();
                this.K = this.f66771v.H();
                this.L = this.f66771v.f();
                this.M = this.f66771v.S();
            }
            y.z zVar = this.f66729a;
            if (zVar != null) {
                this.f66731b = zVar.n();
                this.f66735d = this.f66729a.g();
                this.f66761q = this.f66729a.t();
                if (this.f66729a.f() != null) {
                    this.E = this.f66729a.f().z();
                }
            }
        } else {
            com.taurusx.tax.w.a.c cVar = this.f66759p;
            if (cVar != null) {
                cVar.onAdClosed();
                this.f66746i0 = true;
            }
            z(com.taurusx.tax.g.n.f66164h);
            this.f66752l0 = com.taurusx.tax.w.w.AD_CONTENT_EMPTY;
            finish();
        }
        try {
            if (this.f66739f == null) {
                this.f66739f = com.taurusx.tax.w.s.s.z(this.f66757o);
            }
            long jCurrentTimeMillis = 0;
            long jCurrentTimeMillis2 = (zVarZ == null || zVarZ.w() == 0) ? 0L : System.currentTimeMillis() - zVarZ.w();
            if (zVarZ != null && zVarZ.z() != 0) {
                jCurrentTimeMillis = System.currentTimeMillis() - zVarZ.z();
            }
            this.f66739f.z(jCurrentTimeMillis2, jCurrentTimeMillis, true, this.f66752l0.getCode(), this.f66752l0.getMessageCompatibility());
            m();
            t();
            a();
        } catch (Throwable unused) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        i();
        p();
        com.taurusx.tax.w.a.c cVar = this.f66759p;
        if (cVar != null) {
            cVar.onAdImpression();
        }
        m.c(new s());
    }

    private void i() {
        if (this.Z) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        y.z zVar = this.f66729a;
        if (zVar != null) {
            arrayList.addAll(zVar.i());
        }
        VastConfig vastConfig = this.f66767t;
        if (vastConfig != null) {
            Iterator<VastTracker> it = vastConfig.getImpressionTrackers().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getContent());
            }
        }
        com.taurusx.tax.w.s.c.z(this, arrayList, "ad-imp");
        JSONObject jSONObject = new JSONObject();
        try {
            int i10 = this.f66755n;
            if (i10 == 2 || i10 == 4) {
                jSONObject.put("html_imp_load", this.f66780z0);
            }
            jSONObject.put(CampaignEx.KEY_SHOW_TYPE, 2);
        } catch (JSONException unused) {
        }
        com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), com.taurusx.tax.w.s.c.z(this.f66729a), com.taurusx.tax.w.s.w.f67530c, 0L, this.f66741g, jSONObject, (c.a) null);
        this.Z = true;
        com.taurusx.tax.w.z.t().a().z(com.taurusx.tax.w.s.w.f67530c, this.f66757o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f66768t0) {
            return;
        }
        this.f66768t0 = true;
        z(100, this.f66760p0);
        z(100);
        com.taurusx.tax.s.z.w(this.f66778y0, this.f66774w0, this.f66739f);
        com.taurusx.tax.s.z.z(this.f66778y0, this.f66739f);
    }

    private void m() throws Throwable {
        this.f66777y = (RelativeLayout) findViewById(R.id.progress_rl);
        this.f66733c = (FrameLayout) findViewById(R.id.framelayout);
        if (this.f66755n == 1) {
            this.f66777y.setVisibility(0);
        }
        int i10 = this.f66755n;
        if (i10 == 1 && this.B == 2) {
            if (!TextUtils.isEmpty(this.C) && this.C.startsWith("<") && this.C.contains("mraid.js")) {
                z(this.f66729a);
            } else {
                w(this.f66729a);
            }
        } else if (i10 == 2) {
            y.z zVar = this.f66729a;
            if (zVar == null || zVar.z() == null || !this.f66729a.z().contains("mraid.js")) {
                w(this.f66729a);
            } else {
                z(this.f66729a);
            }
        } else if (i10 == 4) {
            z(this.f66729a);
        }
        c();
        if (this.f66779z != null) {
            String str = com.taurusx.tax.g.n0.z.z(this).getPath() + "/" + j0.z(this.G);
            String str2 = "\"" + s() + "\"";
            String strZ = com.taurusx.tax.g.y.z(str, "index.html");
            if (TextUtils.isEmpty(strZ)) {
                return;
            }
            int i11 = this.f66755n;
            if (i11 == 1) {
                strZ = strZ.replace(com.taurusx.tax.g.n.S, str2).replace(com.taurusx.tax.g.n.T, "<video id=\"ad-video\" poster=\"placehold\"><source src= \"" + ("../" + Uri.parse(this.f66767t.getDiskMediaFileUrl()).getLastPathSegment()) + "\" ></source></video>");
            } else if (i11 == 2 || i11 == 3 || i11 == 4) {
                strZ = strZ.replace(com.taurusx.tax.g.n.S, str2).replace(com.taurusx.tax.g.n.T, "");
            }
            this.f66779z.loadHtmlResponseWithBaseUrl(strZ, "file:///taurusx");
            int i12 = this.f66755n;
            if (i12 == 1 && this.B == 2) {
                this.f66773w.loadHtmlResponse(this.C);
            } else if (i12 == 2) {
                this.f66773w.loadHtmlResponse(this.f66729a.z());
            } else if (i12 == 4) {
                this.f66773w.loadUrl(this.f66729a.z());
            }
        }
    }

    private void n() {
        com.taurusx.tax.s.z.c(this.f66774w0, this.f66739f);
        com.taurusx.tax.s.z.y(this.f66774w0, this.f66739f);
        this.f66774w0 = null;
    }

    private void p() {
        y.z zVar;
        if (this.f66730a0 || (zVar = this.f66729a) == null) {
            return;
        }
        com.taurusx.tax.w.s.c.z(this, zVar.c(), "ad-bill");
        JSONObject jSONObject = new JSONObject();
        try {
            int i10 = this.f66755n;
            if (i10 == 2 || i10 == 4) {
                jSONObject.put("html_imp_load", this.f66780z0);
            }
            jSONObject.put(CampaignEx.KEY_SHOW_TYPE, 2);
        } catch (JSONException unused) {
        }
        com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.f66729a.k(), com.taurusx.tax.w.s.w.f67533m, 0L, this.f66741g, jSONObject, (c.a) null);
        this.f66730a0 = true;
    }

    private String s() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(com.taurusx.tax.g.n.U, this.f66765s ? "splash" : Constants.NORMAL);
            jSONObject.put("layout", this.H);
            jSONObject.put("ad_type", this.f66755n);
            jSONObject.put(com.taurusx.tax.g.n.D, this.f66751l);
            if (this.f66765s) {
                jSONObject.put("skip_time_ms", this.V);
                jSONObject.put("time_down_time_ms", this.W);
            } else {
                jSONObject.put("skip_time_ms", this.f66745i ? this.f66749k : this.f66769u);
                int i10 = this.f66755n;
                if (i10 == 2 || i10 == 4) {
                    jSONObject.put("time_down_time_ms", this.f66745i ? this.f66749k : this.f66769u);
                }
            }
            jSONObject.put(com.taurusx.tax.g.n.H, this.f66737e);
            jSONObject.put("blur_enable", this.f66747j);
            boolean z10 = false;
            jSONObject.put("endcard2_enable_v2", this.f66765s ? false : this.f66743h);
            jSONObject.put("endcard2_close_time_ms", this.f66763r);
            jSONObject.put("endcard2_cta", this.f66731b);
            jSONObject.put("endcard2_title", this.f66735d);
            jSONObject.put("endcard2_icon_url", this.f66761q);
            if (!this.f66765s) {
                z10 = this.A;
            }
            jSONObject.put("endcard_enable", z10);
            jSONObject.put("endcard_type", this.B);
            jSONObject.put("video_click_enable", this.J);
            jSONObject.put("video_card_ct", this.K);
            jSONObject.put("endcard2_ct", this.L);
            jSONObject.put("video_card_show_enable", this.M);
            if (this.B == 1) {
                jSONObject.put("endcard_content", this.C);
            }
            jSONObject.put("endcard_close_button_show_time_ms", this.f66775x);
            jSONObject.put(com.taurusx.tax.g.n.J, this.D);
            jSONObject.put("ad_mute", this.f66753m);
            jSONObject.put("ad_abuse_url", j0.z(this.E, this));
            jSONObject.put(com.taurusx.tax.g.n.K, this.F);
            int i11 = this.f66755n;
            if (i11 == 1) {
                jSONObject.put("title", this.P);
                jSONObject.put("cta", this.Q);
                jSONObject.put("icon", this.O);
                jSONObject.put("description", this.R);
            } else if (i11 == 3) {
                jSONObject.put("image", j0.z(p.z(this.N)));
                jSONObject.put("title", this.P);
                jSONObject.put("cta", this.Q);
                jSONObject.put("icon", this.O);
            }
            jSONObject.put("use_skip", this.T);
            jSONObject.put("skip_text", getString(R.string.taurusx_ads_skip));
            jSONObject.put("app_name", com.taurusx.tax.g.w.z(this));
            jSONObject.put("app_icon", j0.w(this, com.taurusx.tax.w.z.t().z()));
            jSONObject.put(com.taurusx.tax.g.n.V, this.U);
            jSONObject.put(com.taurusx.tax.g.n.W, this.I);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return Base64.encodeToString(com.taurusx.tax.g.z.z(jSONObject.toString().getBytes(), "d1f13f90c0f9f5e5122fa701efea1ac9", "02c16663c6f0aa37f98d94d698c22b8c"), 2);
    }

    private void t() {
        if (j0.c(this.f66741g)) {
            g();
        } else {
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        if (this.f66736d0 || this.f66759p == null || !this.f66745i) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("extra", this.Y);
            jSONObject.put("totalDuration", this.f66760p0);
            jSONObject.put(CampaignEx.KEY_SHOW_TYPE, 2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        com.taurusx.tax.w.s.c.z(this, this.f66729a.k(), com.taurusx.tax.w.s.w.f67531f, 0L, this.f66741g, jSONObject, new a());
        this.f66736d0 = true;
    }

    private void c() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        com.taurusx.tax.t.w wVar = new com.taurusx.tax.t.w(this);
        this.f66779z = wVar;
        wVar.setBackgroundColor(0);
        this.f66733c.addView(this.f66779z, layoutParams);
        this.f66779z.setOnLongClickListener(new w());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f66779z.setOnTouchListener(new y(arrayList));
        this.f66779z.setFocusable(false);
        this.f66779z.setFocusableInTouchMode(false);
        this.f66779z.setWebViewListener(new c(arrayList, arrayList2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        LogUtil.v(E0, "checkVisible:");
        m.z(new o(), 1000L);
    }

    private void w(y.z zVar) {
        this.f66773w = new com.taurusx.tax.t.w(this, zVar != null && zVar.y() == 7);
        y(zVar);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void y(y.z zVar) {
        w();
        this.f66773w.setWebViewListener(new z(zVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar, String str) {
        if (this.C0.getAndSet(true)) {
            return;
        }
        this.f66739f.z(zVar, aVar, str, true);
    }

    public class a implements c.a {
        public a() {
        }

        @Override // com.taurusx.tax.w.s.c.a
        public void z(String str) {
            if (TextUtils.isEmpty(str)) {
                TaurusxH5Activity.this.f66759p.onAdRewardFailed();
                return;
            }
            try {
                if (new JSONObject(str).optBoolean("is_valid")) {
                    TaurusxH5Activity.this.f66759p.onAdReward();
                } else {
                    TaurusxH5Activity.this.f66759p.onAdRewardFailed();
                }
            } catch (JSONException e10) {
                TaurusxH5Activity.this.f66759p.onAdRewardFailed();
                e10.printStackTrace();
            }
        }

        @Override // com.taurusx.tax.w.s.c.a
        public void z() {
            TaurusxH5Activity.this.f66759p.onAdRewardFailed();
        }
    }

    private void w() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        if (this.f66755n == 1) {
            this.f66773w.setVisibility(8);
        }
        this.f66733c.addView(this.f66773w, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        y.w.C0823w c0823w;
        y.w.C0823w c0823w2;
        y.w.C0823w c0823w3;
        boolean z10 = this.f66755n == 1 && (!this.f66765s ? !this.f66745i ? !((c0823w = this.f66771v) == null || c0823w.b() != 1) : !((c0823w2 = this.f66771v) == null || c0823w2.D() != 1) : (c0823w3 = this.f66771v) == null || c0823w3.E() != 1);
        LogUtil.d("taurusx", "needSendProgress: " + z10);
        if (z10) {
            if (!this.f66762q0) {
                this.f66762q0 = true;
                z(25, this.f66760p0);
                z(25);
                com.taurusx.tax.s.z.y(this.f66778y0, this.f66774w0, this.f66739f);
            }
            if (!this.f66764r0) {
                this.f66764r0 = true;
                z(50, this.f66760p0);
                z(50);
                com.taurusx.tax.s.z.c(this.f66778y0, this.f66774w0, this.f66739f);
            }
            if (!this.f66766s0) {
                this.f66766s0 = true;
                z(75, this.f66760p0);
                z(75);
                com.taurusx.tax.s.z.a(this.f66778y0, this.f66774w0, this.f66739f);
            }
            if (this.f66768t0) {
                return;
            }
            this.f66768t0 = true;
            z(100, this.f66760p0);
            z(100);
            com.taurusx.tax.s.z.w(this.f66778y0, this.f66774w0, this.f66739f);
            com.taurusx.tax.s.z.z(this.f66778y0, this.f66739f);
        }
    }

    public static void z(String str, boolean z10) {
        Intent intent = new Intent(TaurusXAds.getContext(), (Class<?>) TaurusxH5Activity.class);
        intent.putExtra("placementId", str);
        intent.putExtra("isSplash", z10);
        intent.putExtra("orientation", t.a(TaurusXAds.getContext()));
        intent.addFlags(268435456);
        TaurusXAds.getContext().startActivity(intent);
    }

    public void w(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar, String str) {
        if (this.f66732b0 || this.f66729a == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        y.z zVar2 = this.f66729a;
        if (zVar2 != null) {
            arrayList.addAll(zVar2.s());
        }
        VastConfig vastConfig = this.f66767t;
        if (vastConfig != null) {
            Iterator<VastTracker> it = vastConfig.getClickTrackers().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getContent());
            }
        }
        com.taurusx.tax.w.s.c.z(this, e.z(arrayList, zVar), "ad-click");
        JSONObject jSONObjectZ = com.taurusx.tax.w.s.c.z(zVar);
        try {
            jSONObjectZ.put(CampaignEx.KEY_SHOW_TYPE, 2);
        } catch (Exception unused) {
        }
        com.taurusx.tax.w.s.c.z(this, this.f66729a.k(), com.taurusx.tax.w.s.w.f67535o, 0L, this.f66741g, jSONObjectZ, (c.a) null);
        this.f66732b0 = true;
        com.taurusx.tax.w.z.t().a().z(com.taurusx.tax.w.s.w.f67535o, this.f66757o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar, String str) {
        if (this.D0.getAndSet(true)) {
            return;
        }
        this.f66739f.w(zVar, aVar, str, true);
    }

    public void z(Activity activity) {
        activity.getWindow().getDecorView().setSystemUiVisibility(4102);
        ActionBar actionBar = activity.getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        activity.getWindow().setFlags(1024, 1024);
    }

    private void z(y.z zVar) {
        this.f66773w = new g0(this, zVar != null && zVar.y() == 7);
        y(zVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(long j10) {
        if (!this.f66762q0 && j10 > Math.round(this.f66760p0 * 0.25f)) {
            this.f66762q0 = true;
            z(25, this.f66760p0);
            z(25);
            com.taurusx.tax.s.z.y(this.f66778y0, this.f66774w0, this.f66739f);
        }
        if (!this.f66764r0 && j10 > Math.round(this.f66760p0 * 0.5f)) {
            this.f66764r0 = true;
            z(50, this.f66760p0);
            z(50);
            com.taurusx.tax.s.z.c(this.f66778y0, this.f66774w0, this.f66739f);
        }
        if (!this.f66766s0 && j10 > Math.round(this.f66760p0 * 0.75f)) {
            this.f66766s0 = true;
            z(75, this.f66760p0);
            z(75);
            com.taurusx.tax.s.z.a(this.f66778y0, this.f66774w0, this.f66739f);
        }
        if (this.f66770u0 || Math.ceil(j10 / 1000.0f) != Math.floor(this.f66760p0 / 1000.0f)) {
            return;
        }
        this.f66770u0 = true;
        l();
    }

    private void z(String str) {
        if (this.f66767t != null) {
            HashSet hashSet = new HashSet();
            for (VastTracker vastTracker : this.f66767t.getErrorTrackers()) {
                if (!TextUtils.isEmpty(vastTracker.getContent())) {
                    hashSet.add(vastTracker.getContent());
                }
            }
            com.taurusx.tax.n.z.z((HashSet<String>) hashSet, str, VastManager.getVastNetworkMediaUrl(this.f66767t));
        }
    }

    private void z(int i10, long j10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("totalDuration", j10);
            jSONObject.put(CampaignEx.KEY_SHOW_TYPE, 2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        if (i10 == 25) {
            com.taurusx.tax.w.s.c.z(this, this.f66729a.k(), com.taurusx.tax.w.s.w.f67529a, 0L, this.f66741g, jSONObject, (c.a) null);
            return;
        }
        if (i10 == 50) {
            com.taurusx.tax.w.s.c.z(this, this.f66729a.k(), com.taurusx.tax.w.s.w.f67534n, 0L, this.f66741g, jSONObject, (c.a) null);
        } else if (i10 == 75) {
            com.taurusx.tax.w.s.c.z(this, this.f66729a.k(), com.taurusx.tax.w.s.w.f67538t, 0L, this.f66741g, jSONObject, (c.a) null);
        } else if (i10 == 100) {
            com.taurusx.tax.w.s.c.z(this, this.f66729a.k(), com.taurusx.tax.w.s.w.f67532g, 0L, this.f66741g, jSONObject, (c.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(int i10) {
        if (this.f66767t == null) {
            return;
        }
        com.taurusx.tax.n.y.z().z(i10, this.f66767t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar, String str) {
        VastConfig vastConfig = this.f66767t;
        if (vastConfig != null) {
            String clickThroughUrl = vastConfig.getClickThroughUrl();
            if (TextUtils.isEmpty(clickThroughUrl)) {
                return;
            }
            com.taurusx.tax.w.a.c cVar = this.f66759p;
            if (cVar != null) {
                cVar.onAdClicked();
            }
            com.taurusx.tax.g.o.z(this.f66729a, this.f66741g, this.f66757o, this, this.f66779z, clickThroughUrl, true);
            if (CampaignEx.JSON_NATIVE_VIDEO_ENDCARD.equals(str)) {
                z(zVar, aVar);
                y(zVar, aVar, str);
                c(zVar, aVar, str);
            } else {
                w(zVar, aVar, str);
                y(zVar, aVar, str);
                c(zVar, aVar, str);
            }
            z();
            return;
        }
        if (this.f66755n == 3) {
            com.taurusx.tax.g.o.z(this.f66729a, this.f66741g, this.f66757o, this, this.f66779z, this.S, true);
            w(zVar, aVar, str);
            y(zVar, aVar, str);
            c(zVar, aVar, str);
        }
    }

    public void z(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
        VastConfig vastConfig;
        boolean z10 = false;
        if (!this.f66734c0 && (vastConfig = this.f66767t) != null) {
            Set<VastCompanionAdConfig> vastCompanionAdConfigs = vastConfig.getVastCompanionAdConfigs();
            if (vastCompanionAdConfigs != null) {
                for (VastCompanionAdConfig vastCompanionAdConfig : vastCompanionAdConfigs) {
                    if (vastCompanionAdConfig != null) {
                        List<VastTracker> clickTrackers = vastCompanionAdConfig.getClickTrackers();
                        ArrayList arrayList = new ArrayList();
                        Iterator<VastTracker> it = clickTrackers.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().getContent());
                        }
                        com.taurusx.tax.w.s.c.z(this, e.z(arrayList, zVar), "ad-companion-click");
                    }
                }
                z10 = true;
            }
            this.f66734c0 = true;
        }
        w(zVar, aVar, z10 ? CampaignEx.JSON_NATIVE_VIDEO_ENDCARD : "adcontent");
    }

    public void z() {
        com.taurusx.tax.s.z.z(this.f66778y0, this.f66774w0, this.f66739f);
    }
}
