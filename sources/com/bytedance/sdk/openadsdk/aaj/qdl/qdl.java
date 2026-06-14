package com.bytedance.sdk.openadsdk.aaj.qdl;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.qdl.bjy;
import com.bytedance.sdk.component.tvp.mo;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.aaj.jpc;
import com.bytedance.sdk.openadsdk.aaj.wd;
import com.bytedance.sdk.openadsdk.core.hkc;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.widget.qdl.mzz;
import com.bytedance.sdk.openadsdk.core.widget.to;
import com.bytedance.sdk.openadsdk.core.widget.tvp;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.mml.jl;
import com.bytedance.sdk.openadsdk.utils.exc;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private ud aaj;
    private long bch;
    private int bjy;
    private com.bytedance.sdk.openadsdk.core.lnr.qdl exc;
    private volatile boolean exu;
    private boolean fs;
    private tvp jl;
    private String jpc;
    private AtomicBoolean jtx;
    private boolean jyq;
    private int ljh;
    private final ljh lnr;
    private final int mml;

    @Nullable
    private to mo;
    private final FrameLayout mzz;
    private int oth;
    protected mo qdl;
    private volatile boolean rdp;

    @Nullable
    private com.bytedance.sdk.openadsdk.fs.mo rq;
    private jpc to;
    private final String tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final Context f16794ud;
    private StringBuilder uw;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private hkc f16795wd;
    private InterfaceC0244qdl xmv;
    private AtomicBoolean yt;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.aaj.qdl.qdl$qdl, reason: collision with other inner class name */
    public interface InterfaceC0244qdl {
        void qdl(int i10);
    }

    public interface ud {
        void qdl();
    }

    public qdl(Context context, ljh ljhVar, int i10, boolean z10, FrameLayout frameLayout) {
        this(context, ljhVar, i10, z10, frameLayout, false);
    }

    public qdl(Context context, ljh ljhVar, int i10, boolean z10, FrameLayout frameLayout, boolean z11) {
        this(context, ljhVar, i10, z10, frameLayout, z11, 0);
    }

    private void jpc() {
        this.qdl.setWebViewClient(new mzz(yt.qdl(), this.f16795wd, this.lnr.yre(), null, true) { // from class: com.bytedance.sdk.openadsdk.aaj.qdl.qdl.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (qdl.this.to != null) {
                    qdl.this.to.tvp(str);
                }
                if (qdl.this.fs) {
                    qdl.this.qdl(0, 0);
                    com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), qdl.this.lnr, qdl.this.jpc, "py_loading_success");
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i10, String str, String str2) {
                super.onReceivedError(webView, i10, str, str2);
                qdl.this.fs = false;
                if (qdl.this.to != null) {
                    qdl.this.to.mo(com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.qdl().qdl(qdl.this.lnr));
                    qdl.this.to.qdl(i10, str, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    qdl.this.fs = false;
                    if (qdl.this.to != null) {
                        qdl.this.to.mo(com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.qdl().qdl(qdl.this.lnr));
                        qdl.this.to.qdl(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                try {
                    if (qdl.this.lnr.tdy() != null && !TextUtils.isEmpty(qdl.this.lnr.tdy().exu())) {
                        if (qdl.this.to != null) {
                            qdl.this.to.to(str);
                        }
                        String strFs = vu.fs(qdl.this.lnr);
                        WebResourceResponse webResourceResponseQdl = com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.qdl().qdl(qdl.this.lnr.tdy().exu(), strFs, str);
                        if (webResourceResponseQdl == null) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        if (qdl.this.to != null) {
                            qdl.this.to.rq(str);
                        }
                        return webResourceResponseQdl;
                    }
                    return super.shouldInterceptRequest(webView, str);
                } catch (Throwable unused) {
                    return super.shouldInterceptRequest(webView, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
            @RequiresApi(api = 23)
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest.isForMainFrame()) {
                    qdl.this.fs = false;
                    if (qdl.this.to == null || webResourceError == null) {
                        return;
                    }
                    qdl.this.to.mo(com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.qdl().qdl(qdl.this.lnr));
                    qdl.this.to.qdl(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
                }
            }
        });
        this.qdl.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.qdl.mml(this.f16795wd) { // from class: com.bytedance.sdk.openadsdk.aaj.qdl.qdl.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mml, android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mml, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i10) {
                super.onProgressChanged(webView, i10);
                if (qdl.this.mo == null || qdl.this.mo.getVisibility() != 0) {
                    return;
                }
                qdl.this.mo.setProgress(i10);
            }
        });
        com.bytedance.sdk.openadsdk.core.widget.qdl.lnr.qdl(this.f16794ud).qdl(false).ud(false).qdl(this.qdl.getWebView());
        mo moVar = this.qdl;
        moVar.setUserAgentString(exc.qdl(moVar.getWebView(), BuildConfig.VERSION_CODE));
        this.qdl.setMixedContentMode(0);
    }

    private void lnr(boolean z10) {
        bjy bjyVarUd;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cid", this.lnr.yre());
            jSONObject.put("log_extra", this.lnr.ir());
        } catch (Throwable unused) {
        }
        if (com.bytedance.sdk.openadsdk.core.tvp.ud().yt()) {
            wd.qdl(new wd.qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.qdl.qdl.1
            });
        }
        jpc jpcVarQdl = jpc.qdl(yt.qdl(), this.qdl.getWebView(), new com.bytedance.sdk.openadsdk.aaj.lnr() { // from class: com.bytedance.sdk.openadsdk.aaj.qdl.qdl.2
            @Override // com.bytedance.sdk.openadsdk.aaj.lnr
            public void qdl(String str, JSONObject jSONObject2) {
                if (qdl.this.f16795wd != null) {
                    qdl.this.f16795wd.qdl(str, jSONObject2);
                }
            }
        }, new com.bytedance.sdk.openadsdk.aaj.qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.qdl.qdl.3
            @Override // com.bytedance.sdk.openadsdk.aaj.qdl
            public void lnr() {
                if (qdl.this.f16795wd.rdp() != null) {
                    qdl.this.f16795wd.rdp().qdl(true);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.aaj.qdl
            public com.bytedance.sdk.openadsdk.aaj.mml qdl() {
                String strMo = com.bytedance.sdk.openadsdk.common.ud.mo();
                strMo.getClass();
                switch (strMo) {
                    case "2g":
                        return com.bytedance.sdk.openadsdk.aaj.mml.TYPE_2G;
                    case "3g":
                        return com.bytedance.sdk.openadsdk.aaj.mml.TYPE_3G;
                    case "4g":
                        return com.bytedance.sdk.openadsdk.aaj.mml.TYPE_4G;
                    case "5g":
                        return com.bytedance.sdk.openadsdk.aaj.mml.TYPE_5G;
                    case "wifi":
                        return com.bytedance.sdk.openadsdk.aaj.mml.TYPE_WIFI;
                    default:
                        return com.bytedance.sdk.openadsdk.aaj.mml.TYPE_UNKNOWN;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.aaj.qdl
            public void ud() {
                qdl.this.f16795wd.ud(true);
                if (qdl.this.rq != null) {
                    qdl.this.rq.qdl();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.aaj.qdl
            public void qdl(final JSONObject jSONObject2) {
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), qdl.this.lnr, qdl.this.jpc, "playable_track", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.qdl.qdl.3.1
                    @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                    public JSONObject lnr() {
                        return jSONObject2;
                    }

                    @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                    public JSONObject qdl() {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("is_new_playable", 1);
                            if (!qdl.this.lnr.kz()) {
                                return jSONObject3;
                            }
                            jSONObject3.put("is_pre_render", 1);
                            return jSONObject3;
                        } catch (JSONException e10) {
                            aaj.lnr("PlayableManager", e10.getMessage());
                            return null;
                        }
                    }
                });
            }

            @Override // com.bytedance.sdk.openadsdk.aaj.qdl
            public void qdl(int i10, String str) {
                qdl.this.fs = false;
                if (i10 == 2 || i10 == 3 || i10 == 4) {
                    qdl.this.qdl(2, i10);
                } else if (i10 == 5) {
                    qdl.this.qdl(3, i10);
                } else {
                    qdl.this.qdl(1, 0);
                }
            }
        });
        this.to = jpcVarQdl;
        jpcVarQdl.wd(this.tvp).mzz(com.bytedance.sdk.openadsdk.common.ud.qdl(yt.qdl())).ud(com.bytedance.sdk.openadsdk.common.ud.mzz()).qdl(com.bytedance.sdk.openadsdk.common.ud.qdl()).mml(com.bytedance.sdk.openadsdk.common.ud.mml()).lnr(jSONObject).lnr(vu.to(this.lnr)).mml(true).qdl(z10).lnr(false).qdl(vu.yt(this.lnr)).ud(vu.yt(this.lnr)).qdl("sdkEdition", com.bytedance.sdk.openadsdk.common.ud.lnr()).mzz(vu.mo(this.lnr)).mo(this.jpc);
        this.to.qdl(com.bytedance.sdk.openadsdk.aaj.mzz.ud(this.f16794ud));
        Set<String> setRq = this.to.rq();
        final WeakReference weakReference = new WeakReference(this.to);
        for (String str : setRq) {
            if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str) && (bjyVarUd = this.f16795wd.ud()) != null) {
                bjyVarUd.qdl(str, new com.bytedance.sdk.component.qdl.mml<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.aaj.qdl.qdl.4
                    @Override // com.bytedance.sdk.component.qdl.mml
                    public JSONObject qdl(String str2, @NonNull JSONObject jSONObject2, @NonNull com.bytedance.sdk.component.qdl.mzz mzzVar) {
                        try {
                            jpc jpcVar = (jpc) weakReference.get();
                            if (jpcVar == null) {
                                return null;
                            }
                            return jpcVar.mml(qdl(), jSONObject2);
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        }
    }

    public void mml() {
        jpc jpcVar = this.to;
        if (jpcVar != null) {
            jpcVar.fco();
        }
        mo moVar = this.qdl;
        if (moVar != null) {
            moVar.jtx();
        }
        hkc hkcVar = this.f16795wd;
        if (hkcVar != null) {
            hkcVar.fs();
        }
        this.bch = System.currentTimeMillis();
        this.uw = new StringBuilder();
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                StringBuilder sb2 = this.uw;
                sb2.append(stackTraceElement);
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
        } catch (Throwable th2) {
            aaj.qdl("PlayableManager", "onDestroy() error", th2);
        }
        this.qdl = null;
    }

    public boolean mo() {
        hkc hkcVar = this.f16795wd;
        if (hkcVar != null) {
            return hkcVar.mo();
        }
        return false;
    }

    public boolean mzz() {
        return this.exu;
    }

    public void ud() {
        if (!this.jtx.get() || this.to == null) {
            return;
        }
        aaj.qdl("PlayableManager", "onResume() called");
        this.to.lnr(true);
    }

    public hkc wd() {
        return this.f16795wd;
    }

    public qdl(Context context, ljh ljhVar, int i10, boolean z10, FrameLayout frameLayout, boolean z11, int i11) {
        this.fs = true;
        this.jtx = new AtomicBoolean(false);
        this.yt = new AtomicBoolean(false);
        this.ljh = 0;
        this.bch = 0L;
        this.f16794ud = context;
        this.lnr = ljhVar;
        this.oth = i11;
        if (ljhVar != null && ljhVar.mml() != null && ljhVar.mml().mml() != null) {
            this.ljh = ljhVar.mml().mml().size();
        }
        this.mml = i10;
        String strLnr = gy.lnr(ljhVar.ji().getDurationSlotType());
        this.jpc = strLnr;
        int iQdl = gy.qdl(strLnr);
        this.jyq = z11;
        if (z11) {
            this.jpc = gy.ud(iQdl);
        }
        this.tvp = vu.fs(ljhVar);
        this.mzz = frameLayout;
        qdl(frameLayout);
        qdl(iQdl);
        lnr(z10);
        jpc();
    }

    public void qdl(InterfaceC0244qdl interfaceC0244qdl) {
        this.xmv = interfaceC0244qdl;
    }

    private void qdl(FrameLayout frameLayout) {
        mo moVar = new mo(this.f16794ud, true, mo.lnr.PLAYABLE);
        this.qdl = moVar;
        moVar.mzz();
        this.qdl.setLayerType(2, null);
        this.qdl.setVisibility(4);
        this.qdl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.qdl.setEnabled(true);
        this.qdl.setTag(this.jpc);
        this.qdl.setMaterialMeta(this.lnr.il());
        this.qdl.setLandingPage(true);
        frameLayout.addView(this.qdl, new FrameLayout.LayoutParams(-1, -1));
        tvp tvpVar = new tvp(this.f16794ud);
        this.jl = tvpVar;
        tvpVar.qdl(this.lnr, this.jpc, this.exc, this.jyq);
        frameLayout.addView(this.jl, new FrameLayout.LayoutParams(-1, -1));
        if (this.lnr.vdl()) {
            to toVar = new to(this.f16794ud);
            this.mo = toVar;
            toVar.ud();
            frameLayout.addView(this.mo, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void ud(boolean z10) {
        jpc jpcVar = this.to;
        if (jpcVar != null) {
            jpcVar.mzz(z10);
        }
    }

    private void qdl(int i10) {
        HashMap map = new HashMap();
        map.put("click_scence", 3);
        this.f16795wd = new hkc(this.f16794ud);
        String strHtl = this.lnr.htl();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isMultiAd", this.lnr.ax());
            jSONObject.put("currentIndex", this.oth);
            jSONObject.put("totalAdCount", this.ljh);
        } catch (JSONException unused) {
        }
        this.f16795wd.ud(this.qdl).qdl(this.lnr).qdl(com.bytedance.sdk.openadsdk.core.tvp.qdl.ud.qdl(this.lnr, true, jSONObject)).lnr(this.lnr.yre()).mml(this.lnr.ir()).ud(i10).mzz(strHtl).qdl(this.qdl).ud(this.jpc).qdl(map).qdl(new jl(3, this.jpc, this.lnr));
    }

    public void lnr() {
        if (!this.jtx.get() || this.to == null) {
            return;
        }
        aaj.qdl("PlayableManager", "onPause() called");
        this.to.lnr(false);
    }

    public void qdl(boolean z10, com.bytedance.sdk.openadsdk.fs.mo moVar) {
        this.rq = moVar;
        this.to.ud(z10);
        com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.qdl().ud(this.lnr);
        this.qdl.a_(this.tvp);
        jpc jpcVar = this.to;
        if (jpcVar != null) {
            jpcVar.mo(com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.qdl().qdl(this.lnr));
            this.to.jpc(this.tvp);
        }
    }

    public void qdl() {
        to toVar;
        final boolean z10 = true;
        if (this.jtx.getAndSet(true)) {
            return;
        }
        FrameLayout frameLayout = this.mzz;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        aaj.qdl("PlayableManager", "showPlayable() called with: hasLoading = [false], loadingViewIsHide = [" + this.rdp + C4240b4.j.f42674e);
        if (!this.rdp && (toVar = this.mo) != null) {
            toVar.ud(this.lnr, this.mml);
            jpc jpcVar = this.to;
            if (jpcVar != null) {
                jpcVar.rc();
            }
        } else {
            this.to.lnr(true);
            hkc hkcVar = this.f16795wd;
            if (hkcVar != null && hkcVar.rdp() != null) {
                this.f16795wd.rdp().mo();
            }
            InterfaceC0244qdl interfaceC0244qdl = this.xmv;
            if (interfaceC0244qdl != null) {
                interfaceC0244qdl.qdl(this.bjy);
            }
            z10 = false;
        }
        if (this.to != null) {
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), this.lnr, this.jpc, "playable_track", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.qdl.qdl.7
                @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                public JSONObject lnr() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_event", "start_show_plb");
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }

                @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                public JSONObject qdl() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("webview_state", qdl.this.to.ax());
                        jSONObject.put("has_loading", z10);
                        jSONObject.put("is_new_playable", 1);
                        return jSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            });
            this.to.mo(com.bytedance.sdk.openadsdk.core.exu.lnr.qdl.qdl().qdl(this.lnr));
        }
        mo moVar = this.qdl;
        if (moVar != null) {
            moVar.setVisibility(0);
        } else {
            com.bytedance.sdk.openadsdk.bjy.lnr.qdl("plb_npe_crash", false, new com.bytedance.sdk.openadsdk.bjy.ud() { // from class: com.bytedance.sdk.openadsdk.aaj.qdl.qdl.8
                @Override // com.bytedance.sdk.openadsdk.bjy.ud
                public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("crash_ts", System.currentTimeMillis());
                    if (qdl.this.uw != null) {
                        jSONObject.put("destroy_stack_trace", qdl.this.uw.toString());
                    }
                    jSONObject.put("destroy_ts", qdl.this.bch);
                    return com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl("plb_npe_crash").ud(jSONObject.toString());
                }
            });
        }
    }

    public void qdl(final int i10, final int i11) {
        InterfaceC0244qdl interfaceC0244qdl;
        jpc jpcVar;
        ud udVar;
        if (this.rdp) {
            return;
        }
        this.rdp = true;
        this.bjy = i10;
        aaj.qdl("PlayableManager", "onHidePlayableLoading() called with: hideReason = [" + i10 + "], errorDetail = [" + i11 + C4240b4.j.f42674e);
        if (i10 == 2) {
            this.exu = true;
            this.to.qdl(3);
        } else if (i10 == 1) {
            this.exu = true;
            this.to.qdl(2);
        } else if (i10 == 3) {
            this.exu = true;
            this.to.qdl(4);
        } else if (i10 == 0) {
            this.to.qdl(1);
        }
        if (this.exu && (udVar = this.aaj) != null) {
            udVar.qdl();
        }
        if (this.jtx.get() && (jpcVar = this.to) != null) {
            jpcVar.lnr(true);
        }
        hkc hkcVar = this.f16795wd;
        if (hkcVar != null && hkcVar.rdp() != null) {
            this.f16795wd.rdp().mo();
        }
        if (!this.exu && (interfaceC0244qdl = this.xmv) != null) {
            interfaceC0244qdl.qdl(i10);
        }
        to toVar = this.mo;
        if (toVar != null) {
            toVar.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.aaj.qdl.qdl.9
                @Override // java.lang.Runnable
                public void run() {
                    if (qdl.this.exu) {
                        qdl.this.jl.setVisibility(0);
                        if (qdl.this.xmv != null) {
                            qdl.this.xmv.qdl(i10);
                        }
                        qdl.this.qdl(true);
                    }
                    qdl.this.to.wd(qdl.this.exu);
                    qdl.this.mo.lnr();
                    if (qdl.this.jtx.get()) {
                        com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), qdl.this.lnr, qdl.this.jpc, "playable_track", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.qdl.qdl.9.1
                            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                            public JSONObject lnr() {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("playable_event", "remove_loading_page");
                                } catch (Throwable unused) {
                                }
                                return jSONObject;
                            }

                            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
                            public JSONObject qdl() {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("remove_loading_page_type", i10);
                                    jSONObject.put("remove_loading_page_reason", i11);
                                    jSONObject.put("playable_url", qdl.this.tvp);
                                    jSONObject.put("duration", qdl.this.mo.getDisplayDuration());
                                    jSONObject.put("is_new_playable", 1);
                                    return jSONObject;
                                } catch (Throwable unused) {
                                    return null;
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public void qdl(boolean z10) {
        jpc jpcVar = this.to;
        if (jpcVar != null) {
            jpcVar.qdl(z10);
        }
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.lnr.qdl qdlVar) {
        this.exc = qdlVar;
        to toVar = this.mo;
        if (toVar != null && toVar.getDownloadButton() != null) {
            com.bytedance.sdk.openadsdk.core.mo.jpc downloadButton = this.mo.getDownloadButton();
            downloadButton.setOnClickListener(qdlVar);
            downloadButton.setOnTouchListener(qdlVar);
        }
        tvp tvpVar = this.jl;
        if (tvpVar != null) {
            tvpVar.setClickListener(qdlVar);
        }
    }

    public void qdl(ud udVar) {
        this.aaj = udVar;
    }

    public void qdl(com.bytedance.sdk.openadsdk.core.exu.mml.ud udVar) {
        hkc hkcVar = this.f16795wd;
        if (hkcVar != null) {
            hkcVar.qdl(udVar);
        }
    }
}
