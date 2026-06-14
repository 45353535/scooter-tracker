package com.taurusx.tax.ui;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
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
import com.taurusx.tax.g.h0;
import com.taurusx.tax.g.j;
import com.taurusx.tax.g.j0;
import com.taurusx.tax.g.k0;
import com.taurusx.tax.g.l;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.o.g0;
import com.taurusx.tax.t.z;
import com.taurusx.tax.ui.TaxMediaView;
import com.taurusx.tax.vast.VastCompanionAdConfig;
import com.taurusx.tax.vast.VastConfig;
import com.taurusx.tax.vast.VastManager;
import com.taurusx.tax.vast.VastTracker;
import com.taurusx.tax.w.a.s;
import com.taurusx.tax.w.c.y;
import com.taurusx.tax.w.s.c;
import io.appmetrica.analytics.impl.H2;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class TaxVideoActivity extends Activity implements View.OnClickListener {
    public static final String F0 = "TaxVideoActivity";
    public static final float G0 = 30.0f;
    public static final float H0 = 30.0f;
    public static final float I0 = 12.0f;
    public static final float J0 = 24.0f;
    public y.z A;
    public VastConfig B;
    public com.taurusx.tax.w.s.s C;
    public boolean C0;
    public String D;
    public boolean E;
    public boolean E0;
    public com.taurusx.tax.w.a.c F;
    public String G;
    public int H;
    public boolean I;
    public String J;
    public int K;
    public int L;
    public boolean N;
    public com.taurusx.tax.w.c.y O;
    public y.w.C0823w P;
    public String Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public AdSession V;
    public AdEvents W;
    public MediaEvents X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f66834a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f66835a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f66836b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f66837b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f66838c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f66839c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f66840d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f66841d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f66842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ViewGroup f66844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f66846g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public long f66847g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f66848h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f66849h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f66850i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f66851i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f66852j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Bitmap f66853j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f66854k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f66855k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f66856l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f66857l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.taurusx.tax.t.z f66858m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f66859m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f66860n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f66862o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f66864p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f66865p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f66866q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f66867q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinearLayout f66868r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f66869r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ImageView f66870s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f66871s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TaxMediaView f66872t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f66873t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ImageView f66874u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ImageView f66876v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ImageView f66878w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f66879w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ImageView f66880x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f66881x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ImageView f66882y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public RelativeLayout f66884z;
    public boolean M = true;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public com.taurusx.tax.w.s.z f66843e0 = new com.taurusx.tax.w.s.z();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public com.taurusx.tax.w.s.a f66845f0 = new com.taurusx.tax.w.s.a();

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public long f66861n0 = 0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public com.taurusx.tax.w.w f66863o0 = com.taurusx.tax.w.w.SUCCESS;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public long f66875u0 = 0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f66877v0 = false;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public Handler f66883y0 = new a();

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public View.OnTouchListener f66885z0 = new n();
    public AtomicBoolean A0 = new AtomicBoolean(false);
    public AtomicBoolean B0 = new AtomicBoolean(false);
    public JSONArray D0 = new JSONArray();

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            if (TaxVideoActivity.this.f66881x0 <= 0) {
                TaxVideoActivity.this.f66860n.setVisibility(8);
                if (TaxVideoActivity.this.H == 1 && !TaxVideoActivity.this.I) {
                    TaxVideoActivity.this.I = true;
                    TaxVideoActivity.this.e();
                }
                TaxVideoActivity.this.r();
                return;
            }
            if (!TaxVideoActivity.this.E0) {
                TaxVideoActivity.c(TaxVideoActivity.this);
                TaxVideoActivity.this.f66860n.setText(TaxVideoActivity.this.f66881x0 + "s");
            }
            sendEmptyMessageDelayed(0, 1000L);
        }
    }

    public class c implements z.InterfaceC0815z {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y.z f66887c;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ com.taurusx.tax.w.s.s f66890y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public com.taurusx.tax.w.s.z f66891z = null;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public com.taurusx.tax.w.s.a f66889w = null;

        public c(com.taurusx.tax.w.s.s sVar, y.z zVar) {
            this.f66890y = sVar;
            this.f66887c = zVar;
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
            Log.v(TaxVideoActivity.F0, "onClicked");
            this.f66891z = zVar;
            this.f66889w = aVar;
            if (!TaxVideoActivity.this.f66879w0) {
                if (j0.z(TaxVideoActivity.this.O, zVar)) {
                    if (TaxVideoActivity.this.F != null) {
                        TaxVideoActivity.this.F.onAdClicked();
                    }
                    TaxVideoActivity.this.z(zVar, aVar);
                    TaxVideoActivity taxVideoActivity = TaxVideoActivity.this;
                    taxVideoActivity.w(zVar, aVar, !"vast".equalsIgnoreCase(taxVideoActivity.J) ? "adcontent" : CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
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
            TaxVideoActivity.this.D0.put(jSONObject);
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void z(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
            TaxVideoActivity.this.C0 = true;
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public boolean z(String str) {
            LogUtil.v(TaxVideoActivity.F0, "onJump :" + str);
            boolean z10 = false;
            boolean z11 = (TaxVideoActivity.this.O == null || TaxVideoActivity.this.O.c() == null || TaxVideoActivity.this.O.c().w() == null || TaxVideoActivity.this.O.c().w().G() != 1) ? false : true;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (TaxVideoActivity.this.C0) {
                boolean z12 = TaxVideoActivity.this.f66879w0;
                String str2 = CampaignEx.JSON_NATIVE_VIDEO_ENDCARD;
                if (z12) {
                    if (TaxVideoActivity.this.F != null) {
                        TaxVideoActivity.this.F.onAdClicked();
                    }
                    TaxVideoActivity.this.z(this.f66891z, this.f66889w);
                    TaxVideoActivity taxVideoActivity = TaxVideoActivity.this;
                    taxVideoActivity.w(this.f66891z, this.f66889w, !"vast".equalsIgnoreCase(taxVideoActivity.J) ? "adcontent" : CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
                }
                TaxVideoActivity taxVideoActivity2 = TaxVideoActivity.this;
                com.taurusx.tax.w.s.z zVar = this.f66891z;
                com.taurusx.tax.w.s.a aVar = this.f66889w;
                if (!"vast".equalsIgnoreCase(taxVideoActivity2.J)) {
                    str2 = "adcontent";
                }
                taxVideoActivity2.y(zVar, aVar, str2);
            }
            if (TaxVideoActivity.this.C0 || !z11) {
                TaxVideoActivity taxVideoActivity3 = TaxVideoActivity.this;
                z10 = taxVideoActivity3.z(taxVideoActivity3, taxVideoActivity3.f66858m, str, this.f66890y.w());
            }
            if (!TaxVideoActivity.this.C0 && !TaxVideoActivity.this.f66841d0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("html", this.f66887c.z());
                    jSONObject.put("h", z10);
                    jSONObject.put("v", z11);
                    jSONObject.put(CampaignEx.KEY_SHOW_TYPE, 1);
                } catch (JSONException unused) {
                }
                com.taurusx.tax.w.s.c.z(TaxVideoActivity.this.f66858m.getContext(), this.f66887c.k(), com.taurusx.tax.w.s.w.f67536p, 0L, TaxVideoActivity.this.O, jSONObject, (c.a) null);
                TaxVideoActivity.this.f66841d0 = true;
            }
            if (!z11 || TaxVideoActivity.this.C0 || str.startsWith("http") || z10) {
                return z10;
            }
            return true;
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void w(WebView webView, String str) {
            if (TaxVideoActivity.this.f66877v0) {
                return;
            }
            TaxVideoActivity.this.f66877v0 = j0.c(str);
        }

        @Override // com.taurusx.tax.t.z.InterfaceC0815z
        public void z() {
            if (TaxVideoActivity.this.A != null && TaxVideoActivity.this.A.y() == 7 && "html".equalsIgnoreCase(TaxVideoActivity.this.A.w())) {
                try {
                    TaxVideoActivity.this.V = com.taurusx.tax.s.z.z(TaurusXAds.getContext(), TaxVideoActivity.this.f66858m, "", CreativeType.HTML_DISPLAY, TaxVideoActivity.this.C);
                    if (TaxVideoActivity.this.V != null) {
                        com.taurusx.tax.s.z.z(TaxVideoActivity.this.V, (ViewGroup) TaxVideoActivity.this.f66858m, TaxVideoActivity.this.C);
                        com.taurusx.tax.s.z.o(TaxVideoActivity.this.V, TaxVideoActivity.this.C);
                        TaxVideoActivity taxVideoActivity = TaxVideoActivity.this;
                        taxVideoActivity.W = com.taurusx.tax.s.z.z(taxVideoActivity.V, TaxVideoActivity.this.C);
                        com.taurusx.tax.s.z.w(TaxVideoActivity.this.W, TaxVideoActivity.this.C);
                        com.taurusx.tax.s.z.z(TaxVideoActivity.this.W, TaxVideoActivity.this.C);
                    }
                } catch (Throwable th2) {
                    if (TaxVideoActivity.this.C != null) {
                        TaxVideoActivity.this.C.w(th2.getMessage(), false);
                    }
                }
            }
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TaxVideoActivity.this.M) {
                if (TaxVideoActivity.this.E0) {
                    TaxVideoActivity.this.c();
                    return;
                }
                TaxVideoActivity.A(TaxVideoActivity.this);
                LogUtil.v(TaxVideoActivity.F0, "valid number  = " + j0.y(TaxVideoActivity.this.O));
                if (TaxVideoActivity.this.f66855k0 >= j0.y(TaxVideoActivity.this.O)) {
                    TaxVideoActivity.this.t();
                } else {
                    TaxVideoActivity.this.c();
                }
            }
        }
    }

    public class g implements TaxMediaView.g {
        public g() {
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onPlayEnd() {
            LogUtil.d("taurusx", "onPlayEnd, realPlayProgress: " + TaxVideoActivity.this.f66875u0);
            TaxVideoActivity.this.h();
            if (TaxVideoActivity.this.F != null) {
                TaxVideoActivity.this.F.onAdVideoEnd();
            }
            if (TaxVideoActivity.this.f66872t != null) {
                TaxVideoActivity.this.f66872t.p();
            }
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onPlayFailed() {
            TaxVideoActivity.this.z(com.taurusx.tax.g.n.f66166j);
            TaxVideoActivity.this.h();
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onPlayProgress(int i10) {
            TaxVideoActivity taxVideoActivity = TaxVideoActivity.this;
            taxVideoActivity.z(i10, taxVideoActivity.f66872t.getVideoLength());
            TaxVideoActivity.this.z(i10);
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onPlayStart() {
            if (TaxVideoActivity.this.F != null) {
                TaxVideoActivity.this.F.onAdVideoStart();
            }
            TaxVideoActivity.this.f66884z.setVisibility(8);
            TaxVideoActivity taxVideoActivity = TaxVideoActivity.this;
            taxVideoActivity.f66865p0 = taxVideoActivity.f66872t.getVideoLength();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("totalDuration", TaxVideoActivity.this.f66872t.getVideoLength());
                if (TaxVideoActivity.this.O != null && TaxVideoActivity.this.O.c() != null && TaxVideoActivity.this.O.c().w() != null && TaxVideoActivity.this.O.c().w().R()) {
                    jSONObject.put("spendTime", System.currentTimeMillis() - TaxVideoActivity.this.f66847g0);
                }
                jSONObject.put(CampaignEx.KEY_SHOW_TYPE, 1);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            TaxVideoActivity taxVideoActivity2 = TaxVideoActivity.this;
            com.taurusx.tax.w.s.c.z(taxVideoActivity2, taxVideoActivity2.A.k(), com.taurusx.tax.w.s.w.f67537s, 0L, TaxVideoActivity.this.O, jSONObject, (c.a) null);
            if (TaxVideoActivity.this.C != null && TaxVideoActivity.this.B != null) {
                TaxVideoActivity.this.C.y(TaxVideoActivity.this.B.getDiskMediaFileUrl(), false);
            }
            TaxVideoActivity.this.z(0);
            TaxVideoActivity.this.b();
            com.taurusx.tax.s.z.w(TaxVideoActivity.this.X, TaxVideoActivity.this.C);
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void onProgress(int i10, int i11) {
            if (!TaxVideoActivity.this.N) {
                TaxVideoActivity.this.f66875u0 = i10;
            }
            int videoLength = (TaxVideoActivity.this.f66872t.getVideoLength() - i10) / 1000;
            if (videoLength <= 0) {
                if (TaxVideoActivity.this.H == 1 && !TaxVideoActivity.this.I) {
                    TaxVideoActivity.this.I = true;
                }
                TaxVideoActivity.this.e();
                return;
            }
            TaxVideoActivity.this.f66860n.setText(videoLength + "s");
            int i12 = TaxVideoActivity.this.H == 1 ? TaxVideoActivity.this.K : TaxVideoActivity.this.L;
            long jC = TaxVideoActivity.this.H == 1 ? TaxVideoActivity.this.O.c().w().C() : TaxVideoActivity.this.O.c().w().l();
            if (TaxVideoActivity.this.f66872t.getDuration() / 1000 > i12) {
                if (TaxVideoActivity.this.H == 1 && i10 / 1000 > i12 && !TaxVideoActivity.this.I) {
                    TaxVideoActivity.this.I = true;
                }
                int i13 = i10 / 1000;
                if (i13 > i12) {
                    TaxVideoActivity.this.e();
                }
                if (i13 > i12 && !TaxVideoActivity.this.N) {
                    TaxVideoActivity.this.f66870s.setVisibility(0);
                    TaxVideoActivity.this.f66834a.setVisibility(0);
                    TaxVideoActivity.this.f66882y.setVisibility(8);
                    TaxVideoActivity.this.f66838c.setVisibility(8);
                }
                if (i10 > jC) {
                    TaxVideoActivity.this.f66870s.setVisibility(8);
                    TaxVideoActivity.this.f66834a.setVisibility(8);
                    TaxVideoActivity.this.f66882y.setVisibility(0);
                    TaxVideoActivity.this.f66838c.setVisibility(0);
                }
            }
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void w() {
            Log.v(TaxVideoActivity.F0, "onNoMute");
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void y() {
            Log.v(TaxVideoActivity.F0, "onMute");
        }

        @Override // com.taurusx.tax.ui.TaxMediaView.g
        public void z() {
            TaxVideoActivity taxVideoActivity = TaxVideoActivity.this;
            taxVideoActivity.z(100, taxVideoActivity.f66872t.getVideoLength());
            TaxVideoActivity.this.z(100);
            com.taurusx.tax.s.z.w(TaxVideoActivity.this.X, TaxVideoActivity.this.V, TaxVideoActivity.this.C);
            com.taurusx.tax.s.z.z(TaxVideoActivity.this.X, TaxVideoActivity.this.C);
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TaxVideoActivity.this.f66882y.getVisibility() == 8 && TaxVideoActivity.this.f66860n.getVisibility() == 8) {
                TaxVideoActivity.this.f66882y.setVisibility(0);
                TaxVideoActivity.this.f66838c.setVisibility(0);
            }
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if ("vast".equalsIgnoreCase(TaxVideoActivity.this.J)) {
                com.taurusx.tax.s.z.z(TaxVideoActivity.this.W, TaxVideoActivity.this.C);
            }
        }
    }

    public class n implements View.OnTouchListener {
        public n() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                TaxVideoActivity.this.f66845f0.f67468z = System.currentTimeMillis();
                TaxVideoActivity.this.f66843e0.w(String.valueOf((int) motionEvent.getX()));
                TaxVideoActivity.this.f66843e0.y(String.valueOf((int) motionEvent.getY()));
            } else if (motionEvent.getAction() == 1) {
                TaxVideoActivity.this.f66845f0.f67466w = System.currentTimeMillis();
                TaxVideoActivity.this.f66845f0.f67467y = motionEvent.getDownTime();
                TaxVideoActivity.this.f66845f0.f67463c = motionEvent.getEventTime();
                TaxVideoActivity.this.f66845f0.z(motionEvent);
                TaxVideoActivity.this.f66843e0.o(String.valueOf((int) motionEvent.getX()));
                TaxVideoActivity.this.f66843e0.s(String.valueOf((int) motionEvent.getY()));
                TaxVideoActivity.this.f66843e0.c(String.valueOf(view.getHeight()));
                TaxVideoActivity.this.f66843e0.a(String.valueOf(view.getWidth()));
                TaxVideoActivity.this.f66843e0.z(String.valueOf(System.currentTimeMillis()));
                LogUtil.d("CoordinateInfo", "the coordinate info " + TaxVideoActivity.this.f66843e0.toString());
                if (j0.z(TaxVideoActivity.this.O, TaxVideoActivity.this.f66843e0)) {
                    TaxVideoActivity taxVideoActivity = TaxVideoActivity.this;
                    taxVideoActivity.z(taxVideoActivity.f66843e0, TaxVideoActivity.this.f66845f0, view);
                }
            }
            return true;
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LogUtil.v(TaxVideoActivity.F0, "valid number  = " + j0.y(TaxVideoActivity.this.O));
            if (TaxVideoActivity.this.f66855k0 < j0.y(TaxVideoActivity.this.O) || TaxVideoActivity.this.f66864p.getVisibility() == 0) {
                return;
            }
            TaxVideoActivity.this.f66882y.setVisibility(0);
            TaxVideoActivity.this.f66838c.setVisibility(0);
        }
    }

    public class s implements Runnable {
        public s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if ("vast".equalsIgnoreCase(TaxVideoActivity.this.J)) {
                    boolean z10 = (TaxVideoActivity.this.B == null || TextUtils.isEmpty(TaxVideoActivity.this.B.getDiskMediaFileUrl())) ? false : true;
                    TaxVideoActivity.this.V = com.taurusx.tax.s.z.z(TaurusXAds.getContext(), (String) null, z10 ? CreativeType.VIDEO : CreativeType.NATIVE_DISPLAY, TaxVideoActivity.this.B, TaxVideoActivity.this.C);
                    if (TaxVideoActivity.this.V != null) {
                        TaxVideoActivity taxVideoActivity = TaxVideoActivity.this;
                        taxVideoActivity.W = com.taurusx.tax.s.z.z(taxVideoActivity.V, TaxVideoActivity.this.C);
                        TaxVideoActivity taxVideoActivity2 = TaxVideoActivity.this;
                        taxVideoActivity2.X = com.taurusx.tax.s.z.w(taxVideoActivity2.V, TaxVideoActivity.this.C);
                        if (z10 && TaxVideoActivity.this.f66872t != null) {
                            TaxVideoActivity.this.f66872t.z(TaxVideoActivity.this.V, TaxVideoActivity.this.X);
                        }
                        com.taurusx.tax.s.z.z(TaxVideoActivity.this.V, TaxVideoActivity.this.f66844f, TaxVideoActivity.this.C);
                        TaxVideoActivity.this.k();
                        com.taurusx.tax.s.z.o(TaxVideoActivity.this.V, TaxVideoActivity.this.C);
                        if (z10) {
                            com.taurusx.tax.s.z.z(TaxVideoActivity.this.W, VastProperties.createVastPropertiesForSkippableMedia(TaxVideoActivity.this.K * 1000, true, Position.STANDALONE), TaxVideoActivity.this.C);
                        } else {
                            com.taurusx.tax.s.z.w(TaxVideoActivity.this.W, TaxVideoActivity.this.C);
                        }
                    }
                }
            } catch (Throwable th2) {
                Log.d(TaxVideoActivity.F0, "createSession failed", th2);
                if (TaxVideoActivity.this.C != null) {
                    TaxVideoActivity.this.C.w(th2.getMessage(), false);
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
                Bitmap bitmapA = TaxVideoActivity.this.a();
                if (bitmapA != null) {
                    TaxVideoActivity.this.f66853j0 = j0.z(TaurusXAds.getContext(), bitmapA);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public class w implements Runnable {
        public w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TaxVideoActivity.this.f66876v.setVisibility(0);
            TaxVideoActivity.this.f66856l.setVisibility(0);
        }
    }

    public class y implements f0.z {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ View f66903z;

        public class z implements Runnable {

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Intent f66904w;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public final /* synthetic */ Context f66906z;

            public z(Context context, Intent intent) {
                this.f66906z = context;
                this.f66904w = intent;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f66906z.startActivity(this.f66904w);
            }
        }

        public y(View view) {
            this.f66903z = view;
        }

        @Override // com.taurusx.tax.g.f0.z
        public void z(Context context, Intent intent) {
            if (TaxVideoActivity.this.C0) {
                LogUtil.d("taurusx", "activityStartDelegate startActivity..." + intent.resolveActivity(TaxVideoActivity.this.getPackageManager()));
                context.startActivity(intent);
                return;
            }
            LogUtil.d("taurusx", "activityStartDelegate startActivity with postWhenViewShown..." + intent.resolveActivity(TaxVideoActivity.this.getPackageManager()));
            k0.z(this.f66903z, new z(context, intent));
        }
    }

    public class z implements View.OnClickListener {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f66908z;

        /* JADX INFO: renamed from: com.taurusx.tax.ui.TaxVideoActivity$z$z, reason: collision with other inner class name */
        public class DialogInterfaceOnDismissListenerC0817z implements DialogInterface.OnDismissListener {
            public DialogInterfaceOnDismissListenerC0817z() {
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                TaxVideoActivity taxVideoActivity = TaxVideoActivity.this;
                taxVideoActivity.z((Activity) taxVideoActivity);
            }
        }

        public z(String str) {
            this.f66908z = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.taurusx.tax.t.y.z zVarZ = new com.taurusx.tax.t.y.z(TaxVideoActivity.this).z(this.f66908z).z(TaxVideoActivity.this.C);
            zVarZ.setOnDismissListener(new DialogInterfaceOnDismissListenerC0817z());
            zVarZ.w();
        }
    }

    public static /* synthetic */ int A(TaxVideoActivity taxVideoActivity) {
        int i10 = taxVideoActivity.f66855k0;
        taxVideoActivity.f66855k0 = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int c(TaxVideoActivity taxVideoActivity) {
        int i10 = taxVideoActivity.f66881x0;
        taxVideoActivity.f66881x0 = i10 - 1;
        return i10;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f66857l0 = motionEvent.getX();
        this.f66859m0 = motionEvent.getY();
        LogUtil.v("taurusx", "dispatchTouchEvent at x = " + motionEvent.getX() + " and y = " + motionEvent.getY());
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        VastConfig vastConfig;
        int id2 = view.getId();
        if (id2 == R.id.tax_img_mute) {
            this.E = !this.E;
            u();
            return;
        }
        if (id2 == R.id.tax_imageview_close_click) {
            if (!this.T) {
                z();
                if (this.F != null) {
                    com.taurusx.tax.w.s.s sVar = this.C;
                    if (sVar != null) {
                        sVar.z(this.f66857l0, this.f66859m0, System.currentTimeMillis() - this.f66861n0, 0, this.D0, false);
                    }
                    com.taurusx.tax.n.y.z().z(this.B);
                    this.F.onAdClosed();
                    this.f66849h0 = true;
                }
                finish();
                return;
            }
            this.f66864p.setVisibility(0);
            this.f66882y.setVisibility(8);
            this.f66846g.setVisibility(8);
            this.f66880x.setVisibility(8);
            this.f66872t.setVisibility(8);
            Bitmap bitmap = this.f66853j0;
            if (bitmap != null) {
                this.f66874u.setImageBitmap(bitmap);
            }
            if (this.f66872t.t()) {
                this.f66872t.m();
                this.N = true;
            }
            this.f66862o.setVisibility(8);
            this.f66860n.setVisibility(8);
            this.f66870s.setVisibility(8);
            this.f66834a.setVisibility(8);
            this.f66878w.setVisibility(8);
            this.f66868r.setVisibility(8);
            com.taurusx.tax.w.s.s sVar2 = this.C;
            if (sVar2 != null) {
                sVar2.z(System.currentTimeMillis() - this.f66861n0, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, false);
            }
            com.taurusx.tax.g.m.w(new w(), this.S * 1000);
            return;
        }
        if (id2 == R.id.btn_endcard2_close_click) {
            this.f66864p.setVisibility(8);
            z();
            if (this.F != null) {
                com.taurusx.tax.w.s.s sVar3 = this.C;
                if (sVar3 != null) {
                    sVar3.z(this.f66857l0, this.f66859m0, System.currentTimeMillis() - this.f66861n0, 0, this.D0, false);
                }
                com.taurusx.tax.n.y.z().z(this.B);
                this.F.onAdClosed();
                this.f66849h0 = true;
            }
            finish();
            return;
        }
        if (id2 == R.id.tax_skip_click) {
            j();
            com.taurusx.tax.w.s.s sVar4 = this.C;
            if (sVar4 != null) {
                sVar4.z(System.currentTimeMillis() - this.f66861n0, "adcontent", false);
                return;
            }
            return;
        }
        if (id2 == R.id.layout_ad) {
            z(view.getContext(), com.taurusx.tax.w.o.w.y(), (f0.z) null);
            return;
        }
        int i10 = R.id.cta;
        String str = "";
        if (id2 != i10 && id2 != R.id.image && id2 != R.id.title && id2 != R.id.desc && id2 != R.id.bottom_layout) {
            int i11 = R.id.endcard2_cta;
            if ((id2 == i11 || id2 == R.id.endcard2_name || id2 == R.id.img_endcard2_icon) && (vastConfig = this.B) != null) {
                String clickThroughUrl = vastConfig.getClickThroughUrl();
                if (TextUtils.isEmpty(clickThroughUrl)) {
                    return;
                }
                this.f66872t.z();
                com.taurusx.tax.w.a.c cVar = this.F;
                if (cVar != null) {
                    cVar.onAdClicked();
                }
                z(this, view, clickThroughUrl, this.D);
                if (id2 == i11) {
                    str = "endcard2_cta";
                } else if (id2 == R.id.endcard2_name) {
                    str = "endcard2_title";
                } else if (id2 == R.id.img_endcard2_icon) {
                    str = "endcard2_icon";
                }
                z(new com.taurusx.tax.w.s.z(), new com.taurusx.tax.w.s.a(), str);
                w(new com.taurusx.tax.w.s.z(), new com.taurusx.tax.w.s.a(), str);
                y(new com.taurusx.tax.w.s.z(), new com.taurusx.tax.w.s.a(), str);
                return;
            }
            return;
        }
        VastConfig vastConfig2 = this.B;
        if (vastConfig2 != null) {
            String clickThroughUrl2 = vastConfig2.getClickThroughUrl();
            if (TextUtils.isEmpty(clickThroughUrl2)) {
                return;
            }
            this.f66872t.z();
            com.taurusx.tax.w.a.c cVar2 = this.F;
            if (cVar2 != null) {
                cVar2.onAdClicked();
            }
            z(this, view, clickThroughUrl2, this.D);
            if (id2 == i10) {
                str = "adcontent_card_cta";
            } else if (id2 == R.id.image || id2 == R.id.icon_text) {
                str = "adcontent_card_icon";
            } else if (id2 == R.id.title) {
                str = "adcontent_card_title";
            } else if (id2 == R.id.desc) {
                str = "adcontent_card_desc";
            } else if (id2 == R.id.bottom_layout) {
                str = "adcontent_card";
            }
            z(new com.taurusx.tax.w.s.z(), new com.taurusx.tax.w.s.a(), str);
            w(new com.taurusx.tax.w.s.z(), new com.taurusx.tax.w.s.a(), str);
            y(new com.taurusx.tax.w.s.z(), new com.taurusx.tax.w.s.a(), str);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.taurusx_activity_fullscreen);
        z((Activity) this);
        this.f66861n0 = System.currentTimeMillis();
        if (TaurusXAds.isInitialized()) {
            g();
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        LogUtil.i("taurusx", "onDestroy hasCallClose: " + this.f66849h0);
        if (this.C != null) {
            VastConfig vastConfig = this.B;
            String diskMediaFileUrl = vastConfig != null ? vastConfig.getDiskMediaFileUrl() : null;
            if (!TextUtils.isEmpty(diskMediaFileUrl)) {
                this.C.z(diskMediaFileUrl, this.f66875u0, false);
            }
        }
        if (!this.f66849h0 && this.F != null) {
            com.taurusx.tax.w.s.s sVar = this.C;
            if (sVar != null) {
                sVar.z(this.D0, false);
            }
            this.F.onAdClosed();
            this.f66849h0 = true;
        }
        this.M = false;
        s();
        s.w.z().w(this.D);
        TaxMediaView taxMediaView = this.f66872t;
        if (taxMediaView != null) {
            taxMediaView.p();
        }
        Bitmap bitmap = this.f66853j0;
        if (bitmap != null) {
            bitmap.recycle();
            this.f66853j0 = null;
        }
        this.f66883y0.removeCallbacksAndMessages(null);
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
        this.E0 = true;
        TaxMediaView taxMediaView = this.f66872t;
        if (taxMediaView != null && !this.N) {
            taxMediaView.m();
            com.taurusx.tax.n.y.z().w(this.B);
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        this.E0 = false;
        TaxMediaView taxMediaView = this.f66872t;
        if (taxMediaView != null && !taxMediaView.t() && !this.N) {
            this.f66872t.e();
            com.taurusx.tax.n.y.z().y(this.B);
        }
        z((Activity) this);
        super.onResume();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        LogUtil.i("taurusx", "onStop hasCallClose: " + this.f66849h0 + ",isFinishing: " + isFinishing());
        if (this.f66849h0 || !isFinishing() || this.F == null) {
            return;
        }
        com.taurusx.tax.w.s.s sVar = this.C;
        if (sVar != null) {
            sVar.z(this.D0, false);
        }
        this.F.onAdClosed();
        this.f66849h0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f66860n.setVisibility(0);
        this.f66862o.setVisibility(0);
        n();
    }

    private void d() {
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(30.0f));
        com.taurusx.tax.w.c.y yVar = this.O;
        int iDoubleValue = (int) bigDecimal.multiply(new BigDecimal(String.valueOf((yVar == null || yVar.c().w().n() <= 0.0f) ? com.taurusx.tax.w.o.w.d() : this.O.c().w().n()))).doubleValue();
        ViewGroup.LayoutParams layoutParams = this.f66838c.getLayoutParams();
        float f10 = iDoubleValue;
        layoutParams.width = j.z(getApplicationContext(), f10);
        layoutParams.height = j.z(getApplicationContext(), f10);
        this.f66838c.setLayoutParams(layoutParams);
        this.f66834a.setLayoutParams(layoutParams);
        this.f66856l.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f66839c0 || !this.I || this.F == null || this.H != 1) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("extra", this.Q);
            jSONObject.put("totalDuration", this.f66872t.getVideoLength());
            jSONObject.put(CampaignEx.KEY_SHOW_TYPE, 1);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        com.taurusx.tax.w.s.c.z(this, this.A.k(), com.taurusx.tax.w.s.w.f67531f, 0L, this.O, jSONObject, new p());
        this.f66839c0 = true;
    }

    private void f() {
        y.z zVar = this.A;
        String strZ = (zVar == null || zVar.f() == null) ? "" : this.A.f().z();
        if (TextUtils.isEmpty(strZ)) {
            return;
        }
        int i10 = R.id.btn_ru_ado;
        findViewById(i10).setVisibility(0);
        findViewById(i10).setOnClickListener(new z(strZ));
    }

    private void g() {
        x();
        this.D = getIntent().getStringExtra("placementId");
        com.taurusx.tax.w.c.z zVarZ = s.w.z().z(this.D);
        if (zVarZ != null) {
            com.taurusx.tax.w.c.y yVarK = zVarZ.k();
            this.O = yVarK;
            if (yVarK != null && yVarK.c() != null) {
                this.P = this.O.c().w();
            }
            this.Q = zVarZ.t();
            y.z zVarY = zVarZ.y();
            this.A = zVarY;
            if (zVarY != null && zVarY.f() != null) {
                this.f66879w0 = this.A.f().s() == 1;
            }
            this.B = zVarZ.u();
            this.D = zVarZ.i();
            boolean zB = zVarZ.b();
            this.E = zB;
            if (!zB) {
                this.E = j0.w(this);
            }
            this.H = zVarZ.p();
            this.J = zVarZ.c();
            this.C = zVarZ.l();
            this.F = zVarZ.e();
            this.K = zVarZ.v();
            this.L = zVarZ.m();
            this.R = zVarZ.f();
            this.T = zVarZ.h();
            this.S = zVarZ.g();
            this.U = zVarZ.j();
            i();
            o();
        } else {
            com.taurusx.tax.w.a.c cVar = this.F;
            if (cVar != null) {
                cVar.onAdClosed();
                this.f66849h0 = true;
            }
            z(com.taurusx.tax.g.n.f66164h);
            this.f66863o0 = com.taurusx.tax.w.w.AD_CONTENT_EMPTY;
            finish();
        }
        try {
            if (this.C == null) {
                this.C = com.taurusx.tax.w.s.s.z(this.D);
            }
            TaxMediaView taxMediaView = this.f66872t;
            if (taxMediaView != null) {
                taxMediaView.setTaxCustomEvent(this.C);
            }
            long jCurrentTimeMillis = 0;
            long jCurrentTimeMillis2 = (zVarZ == null || zVarZ.w() == 0) ? 0L : System.currentTimeMillis() - zVarZ.w();
            if (zVarZ != null && zVarZ.z() != 0) {
                jCurrentTimeMillis = System.currentTimeMillis() - zVarZ.z();
            }
            this.C.z(jCurrentTimeMillis2, jCurrentTimeMillis, false, this.f66863o0.getCode(), this.f66863o0.getMessageCompatibility());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        this.f66868r.setVisibility(8);
        r();
        Set<VastCompanionAdConfig> vastCompanionAdConfigs = this.B.getVastCompanionAdConfigs();
        if (vastCompanionAdConfigs != null) {
            for (VastCompanionAdConfig vastCompanionAdConfig : vastCompanionAdConfigs) {
                if (vastCompanionAdConfig != null) {
                    List<VastTracker> creativeViewTrackers = vastCompanionAdConfig.getCreativeViewTrackers();
                    ArrayList arrayList = new ArrayList();
                    Iterator<VastTracker> it = creativeViewTrackers.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getContent());
                    }
                    com.taurusx.tax.w.s.c.z(this, arrayList, "ad-companion-imp");
                }
            }
        }
        if (TextUtils.isEmpty(this.G)) {
            return false;
        }
        this.f66880x.setVisibility(0);
        this.f66872t.setVisibility(8);
        this.f66846g.setVisibility(0);
        return true;
    }

    private void i() {
        ImageView imageView = (ImageView) findViewById(R.id.tax_img_mute);
        this.f66878w = imageView;
        imageView.setOnClickListener(this);
        this.f66882y = (ImageView) findViewById(R.id.tax_imageview_close);
        ImageView imageView2 = (ImageView) findViewById(R.id.tax_imageview_close_click);
        this.f66838c = imageView2;
        imageView2.setOnClickListener(this);
        this.f66870s = (ImageView) findViewById(R.id.tax_skip);
        ImageView imageView3 = (ImageView) findViewById(R.id.tax_skip_click);
        this.f66834a = imageView3;
        imageView3.setOnClickListener(this);
        this.f66862o = (LinearLayout) findViewById(R.id.tax_progress_root);
        this.f66860n = (TextView) findViewById(R.id.tax_textView_time);
        this.f66880x = (ImageView) findViewById(R.id.img_endcard);
        this.f66844f = (ViewGroup) findViewById(R.id.inner_activity_main);
        this.f66884z = (RelativeLayout) findViewById(R.id.progress_rl);
        this.f66864p = (LinearLayout) findViewById(R.id.second_endcard);
        this.f66850i = (ImageView) findViewById(R.id.img_endcard2_icon);
        this.f66876v = (ImageView) findViewById(R.id.btn_endcard2_close);
        ImageView imageView4 = (ImageView) findViewById(R.id.btn_endcard2_close_click);
        this.f66856l = imageView4;
        imageView4.setOnClickListener(this);
        this.f66842e = (TextView) findViewById(R.id.endcard2_name);
        this.f66854k = (TextView) findViewById(R.id.endcard2_cta);
        this.f66874u = (ImageView) findViewById(R.id.img_blur);
        this.f66868r = (LinearLayout) findViewById(R.id.bottom_layout);
        this.f66848h = (LinearLayout) findViewById(R.id.title_layout);
        this.f66852j = (ImageView) findViewById(R.id.image);
        this.f66836b = (TextView) findViewById(R.id.title);
        this.f66840d = (TextView) findViewById(R.id.desc);
        this.f66866q = (TextView) findViewById(R.id.cta);
        findViewById(R.id.layout_ad).setOnClickListener(this);
        this.f66872t = (TaxMediaView) findViewById(R.id.tax_mediaview);
        com.taurusx.tax.w.c.y yVar = this.O;
        if (yVar != null && yVar.c().w().N()) {
            this.f66844f.setOnTouchListener(this.f66885z0);
        }
        this.f66872t.setOrientation(this.f66851i0);
        y.w.C0823w c0823w = this.P;
        if (c0823w != null) {
            if (c0823w.T()) {
                this.f66872t.setOnTouchListener(this.f66885z0);
            } else {
                this.f66872t.setOnClickListener(null);
            }
            if (this.P.H() == 1) {
                this.f66866q.setOnClickListener(this);
                this.f66836b.setOnClickListener(null);
                this.f66840d.setOnClickListener(null);
                this.f66852j.setOnClickListener(null);
                this.f66868r.setOnClickListener(null);
            } else if (this.P.H() == 2) {
                this.f66866q.setOnClickListener(this);
                this.f66836b.setOnClickListener(this);
                this.f66840d.setOnClickListener(this);
                this.f66852j.setOnClickListener(this);
                this.f66868r.setOnClickListener(null);
            } else if (this.P.H() == 3) {
                this.f66866q.setOnClickListener(this);
                this.f66836b.setOnClickListener(this);
                this.f66840d.setOnClickListener(this);
                this.f66852j.setOnClickListener(this);
                this.f66868r.setOnClickListener(this);
            }
            if (this.P.f() == 1) {
                this.f66854k.setOnClickListener(this);
                this.f66842e.setOnClickListener(null);
                this.f66850i.setOnClickListener(null);
                this.f66864p.setOnClickListener(null);
            } else if (this.P.f() == 2) {
                this.f66854k.setOnClickListener(this);
                this.f66842e.setOnClickListener(this);
                this.f66850i.setOnClickListener(this);
                this.f66864p.setOnClickListener(null);
            } else if (this.P.f() == 3) {
                this.f66854k.setOnClickListener(this);
                this.f66842e.setOnClickListener(this);
                this.f66850i.setOnClickListener(this);
                this.f66864p.setOnTouchListener(this.f66885z0);
            }
        }
        this.f66880x.setOnTouchListener(this.f66885z0);
        this.f66846g = (LinearLayout) findViewById(R.id.layout_intersittial_webview);
        this.f66847g0 = System.currentTimeMillis();
        m();
        if (this.T) {
            this.f66882y.setImageResource(R.drawable.taurusx_tax_ic_skip);
            com.taurusx.tax.g.p.z(this.f66850i, this.A.t());
            this.f66842e.setText(this.A.g());
            this.f66854k.setText(this.A.n());
        } else {
            this.f66882y.setImageResource(R.drawable.taurusx_ic_close);
        }
        com.taurusx.tax.w.c.y yVar2 = this.O;
        if (yVar2 != null && yVar2.c() != null && this.O.c().w() != null && this.O.c().w().J()) {
            findViewById(R.id.ad_tv).setVisibility(0);
        }
        f();
        if ("vast".equalsIgnoreCase(this.J)) {
            y.w.C0823w c0823w2 = this.P;
            if (c0823w2 == null || !c0823w2.S()) {
                this.f66868r.setVisibility(8);
            } else {
                this.f66868r.setVisibility(0);
            }
            y.z zVar = this.A;
            if (zVar != null && zVar.f() != null) {
                if (!TextUtils.isEmpty(this.A.f().w())) {
                    this.f66866q.setText(this.A.f().w());
                }
                if (TextUtils.isEmpty(this.A.f().a()) || TextUtils.isEmpty(this.A.f().y()) || TextUtils.isEmpty(this.A.f().o())) {
                    this.f66848h.setVisibility(8);
                }
                this.f66836b.setText(this.A.f().a());
                this.f66840d.setText(this.A.f().y());
                com.taurusx.tax.g.p.z(this.f66852j, this.A.f().o());
            }
            VastConfig vastConfig = this.B;
            if (vastConfig == null) {
                z("100");
                this.f66863o0 = com.taurusx.tax.w.w.AD_CONTENT_PARSE_FAILED;
                finish();
            } else if (!TextUtils.isEmpty(vastConfig.getDiskMediaFileUrl())) {
                p();
            } else if (h()) {
                n();
            } else {
                z(com.taurusx.tax.g.n.f66155b);
                this.f66863o0 = com.taurusx.tax.w.w.AD_VIDEO_WITH_NO_MEDIA;
                finish();
            }
        } else if ("html".equalsIgnoreCase(this.J) || POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(this.J)) {
            this.f66868r.setVisibility(8);
            int i10 = this.H == 1 ? this.K : this.L;
            this.f66860n.setVisibility(0);
            this.f66878w.setVisibility(8);
            this.f66862o.setVisibility(0);
            this.f66881x0 = i10;
            this.f66883y0.sendEmptyMessageDelayed(0, 1000L);
        }
        d();
    }

    private void j() {
        this.N = true;
        TaxMediaView taxMediaView = this.f66872t;
        if (taxMediaView != null) {
            taxMediaView.setIsSkip(true);
        }
        this.f66870s.setVisibility(8);
        this.f66834a.setVisibility(8);
        com.taurusx.tax.s.z.y(this.X, this.C);
        if (this.H == 1 && !this.I) {
            TaxMediaView taxMediaView2 = this.f66872t;
            if (taxMediaView2 == null || !taxMediaView2.t()) {
                return;
            }
            this.f66872t.m();
            return;
        }
        TaxMediaView taxMediaView3 = this.f66872t;
        if (taxMediaView3 == null || !taxMediaView3.t()) {
            return;
        }
        this.f66872t.m();
        if (!TextUtils.isEmpty(this.G)) {
            this.f66880x.setVisibility(0);
            this.f66872t.setVisibility(8);
            this.f66846g.setVisibility(0);
            this.f66862o.setVisibility(8);
            this.f66860n.setVisibility(8);
            this.f66870s.setVisibility(8);
            this.f66834a.setVisibility(8);
            this.f66878w.setVisibility(8);
        }
        h();
        com.taurusx.tax.n.y.z().c(this.B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        ArrayList<View> arrayList = new ArrayList();
        arrayList.add(this.f66878w);
        arrayList.add(this.f66882y);
        arrayList.add(this.f66838c);
        arrayList.add(this.f66870s);
        arrayList.add(this.f66834a);
        arrayList.add(this.f66860n);
        arrayList.add(this.f66880x);
        arrayList.add(findViewById(R.id.tax_progress_root));
        arrayList.add(findViewById(R.id.layout_ad));
        arrayList.add(findViewById(R.id.tv_tips));
        arrayList.add(this.f66846g);
        arrayList.add(this.f66864p);
        arrayList.add(this.f66874u);
        for (View view : arrayList) {
            if (view != null) {
                com.taurusx.tax.s.z.z(this.V, view, this.C);
            }
        }
    }

    private void l() {
        if (this.Y) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        y.z zVar = this.A;
        if (zVar != null) {
            arrayList.addAll(zVar.i());
        }
        VastConfig vastConfig = this.B;
        if (vastConfig != null) {
            Iterator<VastTracker> it = vastConfig.getImpressionTrackers().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getContent());
            }
        }
        com.taurusx.tax.w.s.c.z(this, arrayList, "ad-imp");
        JSONObject jSONObject = new JSONObject();
        try {
            if ("html".equalsIgnoreCase(this.J) || POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(this.J)) {
                jSONObject.put("html_imp_load", this.f66877v0);
            }
            jSONObject.put(CampaignEx.KEY_SHOW_TYPE, 1);
        } catch (Exception unused) {
        }
        com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), com.taurusx.tax.w.s.c.z(this.A), com.taurusx.tax.w.s.w.f67530c, 0L, this.O, jSONObject, (c.a) null);
        this.Y = true;
        com.taurusx.tax.w.z.t().a().z(com.taurusx.tax.w.s.w.f67530c, this.D);
    }

    private void m() {
        if ("vast".equalsIgnoreCase(this.J)) {
            VastConfig vastConfig = this.B;
            if (vastConfig != null && vastConfig.getVastCompanionAdConfigs().iterator().hasNext()) {
                this.G = this.B.getVastCompanionAdConfigs().iterator().next().getVastResource().getHtmlResourceValue();
            }
            if (TextUtils.isEmpty(this.G)) {
                return;
            }
            if (!this.G.startsWith("<") && !this.G.contains("mraid.js")) {
                com.taurusx.tax.g.p.z(this.f66880x, this.G);
                return;
            }
            try {
                if (this.G.contains("mraid.js")) {
                    z(this.C, this.A);
                } else {
                    w(this.C, this.A);
                }
                this.f66858m.loadHtmlResponse(this.G);
                return;
            } catch (Throwable unused) {
                com.taurusx.tax.w.a.c cVar = this.F;
                if (cVar != null) {
                    cVar.onAdClosed();
                    this.f66849h0 = true;
                }
                finish();
                return;
            }
        }
        if ("html".equalsIgnoreCase(this.J)) {
            try {
                if (this.A.z().contains("mraid.js")) {
                    z(this.C, this.A);
                } else {
                    w(this.C, this.A);
                }
                this.f66858m.loadHtmlResponse(this.A.z());
                this.f66846g.setVisibility(0);
                n();
                return;
            } catch (Throwable unused2) {
                com.taurusx.tax.w.a.c cVar2 = this.F;
                if (cVar2 != null) {
                    cVar2.onAdClosed();
                    this.f66849h0 = true;
                }
                z(com.taurusx.tax.g.n.f66155b);
                this.f66863o0 = com.taurusx.tax.w.w.AD_HTML_LOAD_ERROR;
                finish();
                return;
            }
        }
        if (POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(this.J)) {
            try {
                z(this.C, this.A);
                this.f66858m.loadUrl(this.A.z());
                this.f66846g.setVisibility(0);
                n();
            } catch (Throwable unused3) {
                com.taurusx.tax.w.a.c cVar3 = this.F;
                if (cVar3 != null) {
                    cVar3.onAdClosed();
                    this.f66849h0 = true;
                }
                z(com.taurusx.tax.g.n.f66155b);
                this.f66863o0 = com.taurusx.tax.w.w.AD_HTML_LOAD_ERROR;
                finish();
            }
        }
    }

    private void n() {
        if (j0.c(this.O)) {
            t();
        } else {
            c();
        }
    }

    private void o() {
        com.taurusx.tax.g.m.c(new s());
    }

    private void p() {
        this.f66884z.setVisibility(0);
        this.f66872t.z(this.A, this.B);
        if (this.U) {
            new Thread(new t()).start();
        }
        this.f66872t.setIsMute(this.E);
        u();
        this.f66872t.setOnPlayerListener(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        this.f66862o.setVisibility(8);
        this.f66860n.setVisibility(8);
        this.f66870s.setVisibility(8);
        this.f66834a.setVisibility(8);
        this.f66878w.setVisibility(8);
        com.taurusx.tax.g.m.w(new o(), this.R * 1000);
    }

    private void s() {
        com.taurusx.tax.s.z.c(this.V, this.C);
        com.taurusx.tax.s.z.y(this.V, this.C);
        this.V = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        l();
        v();
        com.taurusx.tax.w.a.c cVar = this.F;
        if (cVar != null) {
            cVar.onAdImpression();
        }
        com.taurusx.tax.g.m.c(new m());
        y();
    }

    private void u() {
        this.f66878w.setSelected(!this.E);
        TaxMediaView taxMediaView = this.f66872t;
        if (taxMediaView != null) {
            taxMediaView.setMute(this.E);
        }
    }

    private void v() {
        y.z zVar;
        if (this.Z || (zVar = this.A) == null) {
            return;
        }
        com.taurusx.tax.w.s.c.z(this, zVar.c(), "ad-bill");
        JSONObject jSONObject = new JSONObject();
        try {
            if ("html".equalsIgnoreCase(this.J) || POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(this.J)) {
                jSONObject.put("html_imp_load", this.f66877v0);
            }
            jSONObject.put(CampaignEx.KEY_SHOW_TYPE, 1);
        } catch (Exception unused) {
        }
        com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.A.k(), com.taurusx.tax.w.s.w.f67533m, 0L, this.O, jSONObject, (c.a) null);
        this.Z = true;
    }

    private void x() {
        int intExtra = getIntent().getIntExtra("orientation", 0);
        this.f66851i0 = intExtra;
        if (intExtra == 0) {
            setRequestedOrientation(1);
        } else {
            setRequestedOrientation(6);
        }
    }

    public Bitmap a() throws IOException {
        VastConfig vastConfig = this.B;
        String networkMediaFileUrl = "";
        String diskMediaFileUrl = vastConfig != null ? vastConfig.getDiskMediaFileUrl() : "";
        com.taurusx.tax.w.c.y yVar = this.O;
        if (yVar == null || yVar.c() == null || this.O.c().w() == null || !this.O.c().w().R()) {
            networkMediaFileUrl = diskMediaFileUrl;
        } else {
            VastConfig vastConfig2 = this.B;
            if (vastConfig2 != null) {
                networkMediaFileUrl = vastConfig2.getNetworkMediaFileUrl();
            }
        }
        if (TextUtils.isEmpty(networkMediaFileUrl)) {
            return null;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        com.taurusx.tax.w.c.y yVar2 = this.O;
        if (yVar2 == null || yVar2.c() == null || this.O.c().w() == null || !this.O.c().w().R()) {
            mediaMetadataRetriever.setDataSource(networkMediaFileUrl);
        } else {
            mediaMetadataRetriever.setDataSource(networkMediaFileUrl, new HashMap());
        }
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
        mediaMetadataRetriever.release();
        return frameAtTime;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.v(F0, "checkVisible:");
        com.taurusx.tax.g.m.z(new f(), 1000L);
    }

    private void y() {
        com.taurusx.tax.g.m.c(new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar, String str) {
        if (this.B0.getAndSet(true)) {
            return;
        }
        this.C.w(zVar, aVar, str, false);
    }

    public static void w(String str) {
        Intent intent = new Intent(TaurusXAds.getContext(), (Class<?>) TaxVideoActivity.class);
        intent.putExtra("placementId", str);
        intent.putExtra("orientation", com.taurusx.tax.g.t.a(TaurusXAds.getContext()));
        intent.addFlags(268435456);
        TaurusXAds.getContext().startActivity(intent);
    }

    private void y(com.taurusx.tax.w.s.s sVar, y.z zVar) {
        w();
        this.f66858m.setWebViewListener(new c(sVar, zVar));
    }

    public class p implements c.a {
        public p() {
        }

        @Override // com.taurusx.tax.w.s.c.a
        public void z(String str) {
            if (TextUtils.isEmpty(str)) {
                TaxVideoActivity.this.F.onAdRewardFailed();
                return;
            }
            try {
                if (new JSONObject(str).optBoolean("is_valid")) {
                    TaxVideoActivity.this.F.onAdReward();
                } else {
                    TaxVideoActivity.this.F.onAdRewardFailed();
                }
            } catch (JSONException e10) {
                TaxVideoActivity.this.F.onAdRewardFailed();
                e10.printStackTrace();
            }
        }

        @Override // com.taurusx.tax.w.s.c.a
        public void z() {
            TaxVideoActivity.this.F.onAdRewardFailed();
        }
    }

    private void w(com.taurusx.tax.w.s.s sVar, y.z zVar) {
        this.f66858m = new com.taurusx.tax.t.w(this, zVar != null && zVar.y() == 7);
        y(sVar, zVar);
    }

    private void w() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 17;
        this.f66846g.addView(this.f66858m, layoutParams);
    }

    public void z(Activity activity) {
        activity.getWindow().getDecorView().setSystemUiVisibility(4102);
        ActionBar actionBar = activity.getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        activity.getWindow().setFlags(1024, 1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar, String str) {
        if (this.A0.getAndSet(true)) {
            return;
        }
        this.C.z(zVar, aVar, str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(int i10, int i11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("totalDuration", i11);
            jSONObject.put(CampaignEx.KEY_SHOW_TYPE, 1);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        if (i10 == 25 && !this.f66867q0) {
            this.f66867q0 = true;
            com.taurusx.tax.w.s.c.z(this, this.A.k(), com.taurusx.tax.w.s.w.f67529a, 0L, this.O, jSONObject, (c.a) null);
            return;
        }
        if (i10 == 50 && !this.f66869r0) {
            this.f66869r0 = true;
            com.taurusx.tax.w.s.c.z(this, this.A.k(), com.taurusx.tax.w.s.w.f67534n, 0L, this.O, jSONObject, (c.a) null);
        } else if (i10 == 75 && !this.f66871s0) {
            this.f66871s0 = true;
            com.taurusx.tax.w.s.c.z(this, this.A.k(), com.taurusx.tax.w.s.w.f67538t, 0L, this.O, jSONObject, (c.a) null);
        } else {
            if (i10 != 100 || this.f66873t0) {
                return;
            }
            this.f66873t0 = true;
            com.taurusx.tax.w.s.c.z(this, this.A.k(), com.taurusx.tax.w.s.w.f67532g, 0L, this.O, jSONObject, (c.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(String str) {
        if (this.B != null) {
            HashSet hashSet = new HashSet();
            for (VastTracker vastTracker : this.B.getErrorTrackers()) {
                if (!TextUtils.isEmpty(vastTracker.getContent())) {
                    hashSet.add(vastTracker.getContent());
                }
            }
            com.taurusx.tax.n.z.z((HashSet<String>) hashSet, str, VastManager.getVastNetworkMediaUrl(this.B));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(int i10) {
        if (this.B == null) {
            return;
        }
        com.taurusx.tax.n.y.z().z(i10, this.B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar, View view) {
        String str;
        VastConfig vastConfig = this.B;
        if (vastConfig != null) {
            String clickThroughUrl = vastConfig.getClickThroughUrl();
            if (TextUtils.isEmpty(clickThroughUrl)) {
                return;
            }
            this.f66872t.z();
            com.taurusx.tax.w.a.c cVar = this.F;
            if (cVar != null) {
                cVar.onAdClicked();
            }
            z(this, view, clickThroughUrl, this.D);
            if (view.getId() == R.id.img_endcard) {
                z(zVar, aVar);
                str = CampaignEx.JSON_NATIVE_VIDEO_ENDCARD;
            } else if (view.getId() == R.id.tax_mediaview) {
                str = "adcontent";
                z(zVar, aVar, "adcontent");
            } else if (view.getId() == R.id.inner_activity_main) {
                str = H2.f75840g;
                z(zVar, aVar, H2.f75840g);
            } else if (view.getId() == R.id.second_endcard) {
                str = "endcard2";
                z(zVar, aVar, "endcard2");
            } else {
                str = "";
            }
            w(zVar, aVar, str);
            y(zVar, aVar, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z(Context context, View view, String str, String str2) {
        String strA = this.A.a();
        String strM = this.A.m();
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
        try {
            y yVar = new y(view);
            if (!f0.z(context, null, str, yVar)) {
                if (str == null || !str.startsWith("http")) {
                    return false;
                }
                z(context, str, yVar);
            }
            return true;
        } catch (Throwable th2) {
            LogUtil.v(F0, "onClickEvent:" + th2.getMessage());
            return false;
        }
    }

    private void z(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    private void z(Context context, String str, f0.z zVar) {
        Intent intent;
        if (l.z()) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addCategory("android.intent.category.BROWSABLE");
        } else {
            intent = new Intent(context, (Class<?>) TaxWebViewActivity.class);
            intent.putExtra("url", str);
            String string = UUID.randomUUID().toString();
            com.taurusx.tax.g.n0.c.z().z(string, this.O);
            intent.putExtra(TaxWebViewActivity.f66910a, string);
            intent.putExtra(TaxWebViewActivity.f66911n, this.D);
        }
        intent.setFlags(268435456);
        if (zVar != null) {
            zVar.z(context, intent);
        } else {
            context.startActivity(intent);
        }
    }

    private void z(com.taurusx.tax.w.s.s sVar, y.z zVar) {
        this.f66858m = new g0(this, zVar != null && zVar.y() == 7);
        y(sVar, zVar);
    }

    public void z(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar, String str) {
        if (this.f66835a0 || this.A == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        y.z zVar2 = this.A;
        if (zVar2 != null) {
            arrayList.addAll(zVar2.s());
        }
        VastConfig vastConfig = this.B;
        if (vastConfig != null) {
            Iterator<VastTracker> it = vastConfig.getClickTrackers().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getContent());
            }
        }
        com.taurusx.tax.w.s.c.z(this, e.z(arrayList, zVar), "ad-click");
        JSONObject jSONObjectZ = com.taurusx.tax.w.s.c.z(zVar);
        try {
            jSONObjectZ.put(CampaignEx.KEY_SHOW_TYPE, 1);
        } catch (Exception unused) {
        }
        com.taurusx.tax.w.s.c.z(this, this.A.k(), com.taurusx.tax.w.s.w.f67535o, 0L, this.O, jSONObjectZ, (c.a) null);
        this.f66835a0 = true;
        com.taurusx.tax.w.z.t().a().z(com.taurusx.tax.w.s.w.f67535o, this.D);
    }

    public void z(com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
        VastConfig vastConfig;
        boolean z10 = false;
        if (!this.f66837b0 && (vastConfig = this.B) != null) {
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
            this.f66837b0 = true;
        }
        z(zVar, aVar, z10 ? CampaignEx.JSON_NATIVE_VIDEO_ENDCARD : "adcontent");
    }

    private void z() {
        y.w.C0823w c0823w;
        y.w.C0823w c0823w2;
        boolean z10 = "vast".equalsIgnoreCase(this.J) && (this.H != 1 ? !((c0823w = this.P) == null || c0823w.b() != 1) : !((c0823w2 = this.P) == null || c0823w2.D() != 1));
        LogUtil.d("taurusx", "needSendProgress: " + z10);
        if (z10) {
            if (!this.f66867q0) {
                z(25, this.f66865p0);
                z(25);
                com.taurusx.tax.s.z.y(this.X, this.V, this.C);
                this.f66867q0 = true;
            }
            if (!this.f66869r0) {
                z(50, this.f66865p0);
                z(50);
                com.taurusx.tax.s.z.c(this.X, this.V, this.C);
                this.f66869r0 = true;
            }
            if (!this.f66871s0) {
                z(75, this.f66865p0);
                z(75);
                com.taurusx.tax.s.z.a(this.X, this.V, this.C);
                this.f66871s0 = true;
            }
            if (this.f66873t0) {
                return;
            }
            z(100, this.f66865p0);
            z(100);
            com.taurusx.tax.s.z.w(this.X, this.V, this.C);
            com.taurusx.tax.s.z.z(this.X, this.C);
            this.f66873t0 = true;
        }
    }
}
