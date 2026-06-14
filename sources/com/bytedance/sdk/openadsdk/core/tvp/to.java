package com.bytedance.sdk.openadsdk.core.tvp;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import com.bytedance.sdk.component.adexpress.mml.tvp;
import com.bytedance.sdk.openadsdk.core.hkc;
import com.bytedance.sdk.openadsdk.core.model.ekw;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.google.common.net.HttpHeaders;
import com.ironsource.D5;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public class to extends com.bytedance.sdk.openadsdk.core.widget.qdl.mzz {
    public ArrayList<Integer> qdl;
    private boolean rq;
    private com.bytedance.sdk.component.adexpress.ud.exu to;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.model.ljh f17535ud;

    public to(Context context, hkc hkcVar, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, com.bytedance.sdk.openadsdk.mml.fs fsVar, com.bytedance.sdk.component.adexpress.ud.exu exuVar) {
        super(context, hkcVar, ljhVar.yre(), fsVar, false);
        this.rq = false;
        this.qdl = new ArrayList<>();
        this.f17535ud = ljhVar;
        this.to = exuVar;
        this.rq = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("inject_data_normal_open", 0) == 1;
    }

    private com.bytedance.sdk.component.adexpress.qdl.ud.qdl lnr(String str, tvp.qdl qdlVar) {
        ekw.qdl qdlVarMo;
        JSONArray jSONArrayLnr;
        ekw ekwVarKr = this.f17535ud.kr();
        if (ekwVarKr == null || (qdlVarMo = ekwVarKr.mo()) == null || (jSONArrayLnr = qdlVarMo.lnr()) == null || jSONArrayLnr.length() <= 0) {
            return null;
        }
        return qdl(jSONArrayLnr, str, qdlVar);
    }

    private WebResourceResponse mml(String str, tvp.qdl qdlVar) {
        InputStream inputStreamUd;
        if (TextUtils.isEmpty(str) || (inputStreamUd = rdp.ud(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse(qdlVar.qdl(), "UTF-8", inputStreamUd);
        qdl(webResourceResponse);
        return webResourceResponse;
    }

    private WebResourceResponse mzz() {
        InputStream inputStreamOpenRawResource;
        int iTvp = com.bytedance.sdk.openadsdk.core.tvp.ud().tvp();
        if (iTvp == 0) {
            return null;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.yt.qdl().getResources();
        if (resources != null) {
            try {
                inputStreamOpenRawResource = resources.openRawResource(iTvp);
            } catch (Resources.NotFoundException e10) {
                com.bytedance.sdk.component.utils.aaj.lnr("ExpressClient", e10.toString());
                inputStreamOpenRawResource = null;
            }
        } else {
            inputStreamOpenRawResource = null;
        }
        if (inputStreamOpenRawResource != null) {
            return new WebResourceResponse(tvp.qdl.IMAGE.qdl(), "UTF-8", inputStreamOpenRawResource);
        }
        return null;
    }

    private com.bytedance.sdk.component.adexpress.qdl.ud.qdl ud(String str, tvp.qdl qdlVar) {
        ekw.qdl qdlVarMo;
        JSONArray jSONArrayUd;
        ekw ekwVarKr = this.f17535ud.kr();
        if (ekwVarKr == null || (qdlVarMo = ekwVarKr.mo()) == null || (jSONArrayUd = qdlVarMo.ud()) == null || jSONArrayUd.length() <= 0) {
            return null;
        }
        return qdl(jSONArrayUd, str, qdlVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.f17574wd = false;
        super.onPageFinished(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.jpc = false;
        super.onPageStarted(webView, str, bitmap);
        com.bytedance.sdk.component.adexpress.ud.exu exuVar = this.to;
        if (exuVar != null && exuVar.ljh() && this.rq) {
            this.to.lnr();
            com.bytedance.sdk.component.utils.rdp.qdl(webView, "javascript:window.SDK_INJECT_DATA=" + this.to.lnr());
        }
    }

    public int qdl() {
        for (Integer num : this.qdl) {
            if (num.intValue() == 3 || num.intValue() == 2 || num.intValue() == -1) {
                return num.intValue();
            }
        }
        return TextUtils.isEmpty(mml()) ? -1 : 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
    @TargetApi(21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.aaj.qdl("ExpressClient", "shouldInterceptRequest error1", th2);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r9, java.lang.String r10) {
        /*
            r8 = this;
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            com.bytedance.sdk.component.adexpress.qdl.ud.qdl r0 = r8.qdl(r9, r10)     // Catch: java.lang.Throwable -> L19
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1d
            android.webkit.WebResourceResponse r1 = r0.qdl()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1d
            r1 = 1
        L15:
            r6 = r10
            r7 = r1
            r1 = r8
            goto L1f
        L19:
            r0 = move-exception
            r1 = r8
            r6 = r10
            goto L4b
        L1d:
            r1 = 2
            goto L15
        L1f:
            r1.qdl(r2, r4, r6, r7)     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L3e
            int r10 = r0.ud()     // Catch: java.lang.Throwable -> L3c
            r2 = 5
            if (r10 == r2) goto L3e
            r0.ud()     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList<java.lang.Integer> r10 = r1.qdl     // Catch: java.lang.Throwable -> L3c
            int r2 = r0.ud()     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L3c
            r10.add(r2)     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L3c:
            r0 = move-exception
            goto L4b
        L3e:
            if (r0 == 0) goto L52
            android.webkit.WebResourceResponse r10 = r0.qdl()     // Catch: java.lang.Throwable -> L3c
            if (r10 == 0) goto L52
            android.webkit.WebResourceResponse r9 = r0.qdl()     // Catch: java.lang.Throwable -> L3c
            return r9
        L4b:
            java.lang.String r10 = "ExpressClient"
            java.lang.String r2 = "shouldInterceptRequest error2"
            com.bytedance.sdk.component.utils.aaj.qdl(r10, r2, r0)
        L52:
            android.webkit.WebResourceResponse r9 = super.shouldInterceptRequest(r9, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.tvp.to.shouldInterceptRequest(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
    }

    private String mml() {
        com.bytedance.sdk.openadsdk.core.model.ljh ljhVar = this.f17535ud;
        if (ljhVar == null) {
            return null;
        }
        if (ljhVar.xdk() != null) {
            return this.f17535ud.xdk().rq();
        }
        if (this.f17535ud.kr() != null) {
            return "v3";
        }
        return null;
    }

    private WebResourceResponse mzz(String str) {
        InputStream inputStreamQdl;
        if (TextUtils.isEmpty(str) || (inputStreamQdl = com.bytedance.sdk.openadsdk.core.mzz.qdl.qdl().qdl(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse("audio/*", "UTF-8", inputStreamQdl);
        qdl(webResourceResponse);
        return webResourceResponse;
    }

    private com.bytedance.sdk.component.adexpress.qdl.ud.qdl qdl(WebView webView, String str) {
        com.bytedance.sdk.openadsdk.core.model.jl jlVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.equals("local://pag_open_icon_id") && !str.equals(com.bytedance.sdk.openadsdk.core.tvp.qdl.ud.qdl)) {
            ljh.qdl qdlVarXdk = this.f17535ud.xdk();
            if (qdlVarXdk != null && !TextUtils.isEmpty(str) && str.equals(qdlVarXdk.ud())) {
                com.bytedance.sdk.component.adexpress.qdl.ud.qdl qdlVar = new com.bytedance.sdk.component.adexpress.qdl.ud.qdl();
                qdlVar.qdl(5);
                WebResourceResponse webResourceResponseMzz = mzz(str);
                qdlVar.qdl(webResourceResponseMzz);
                com.bytedance.sdk.openadsdk.core.mzz.qdl.qdl().qdl(webResourceResponseMzz != null);
                return qdlVar;
            }
            tvp.qdl qdlVarQdl = com.bytedance.sdk.component.adexpress.mml.tvp.qdl(str);
            if (rdp.ud(this.f17535ud)) {
                com.bytedance.sdk.component.adexpress.qdl.ud.qdl qdlVarQdl2 = qdl(str, qdlVarQdl);
                if (qdlVarQdl2 != null) {
                    return qdlVarQdl2;
                }
                com.bytedance.sdk.component.adexpress.qdl.ud.qdl qdlVarUd = ud(str, qdlVarQdl);
                if (qdlVarUd != null) {
                    Log.d("ExpressClient", "interceptTemplate: Hit fetch file cache url=".concat(str));
                    return qdlVarUd;
                }
                com.bytedance.sdk.component.adexpress.qdl.ud.qdl qdlVarLnr = lnr(str, qdlVarQdl);
                if (qdlVarLnr != null) {
                    return qdlVarLnr;
                }
            }
            if (qdlVarQdl != tvp.qdl.IMAGE) {
                Iterator<com.bytedance.sdk.openadsdk.core.model.jl> it = this.f17535ud.vm().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.bytedance.sdk.openadsdk.core.model.jl next = it.next();
                    if (!TextUtils.isEmpty(next.qdl()) && !TextUtils.isEmpty(str)) {
                        String strQdl = next.qdl();
                        if (strQdl.startsWith("https")) {
                            strQdl = strQdl.replaceFirst("https", "http");
                        }
                        if ((str.startsWith("https") ? str.replaceFirst("https", "http") : str).equals(strQdl)) {
                            jlVar = next;
                            break;
                        }
                    }
                }
            }
            if (qdlVarQdl != tvp.qdl.IMAGE && jlVar == null) {
                return com.bytedance.sdk.component.adexpress.qdl.ud.ud.qdl(str, qdlVarQdl, "", mml());
            }
            com.bytedance.sdk.component.adexpress.qdl.ud.qdl qdlVar2 = new com.bytedance.sdk.component.adexpress.qdl.ud.qdl();
            qdlVar2.qdl(5);
            qdlVar2.qdl(qdl(str, com.bytedance.sdk.openadsdk.core.tvp.qdl.ud.qdl(this.f17535ud, str)));
            return qdlVar2;
        }
        com.bytedance.sdk.component.adexpress.qdl.ud.qdl qdlVar3 = new com.bytedance.sdk.component.adexpress.qdl.ud.qdl();
        qdlVar3.qdl(5);
        qdlVar3.qdl(mzz());
        return qdlVar3;
    }

    private com.bytedance.sdk.component.adexpress.qdl.ud.qdl qdl(String str, tvp.qdl qdlVar) {
        ekw.qdl qdlVarMo;
        JSONArray jSONArrayQdl;
        ekw ekwVarKr = this.f17535ud.kr();
        if (ekwVarKr != null && (qdlVarMo = ekwVarKr.mo()) != null && (jSONArrayQdl = qdlVarMo.qdl()) != null && jSONArrayQdl.length() > 0) {
            for (int i10 = 0; i10 < jSONArrayQdl.length(); i10++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.rq.lnr.qdl(jSONArrayQdl.optString(i10), com.bytedance.sdk.openadsdk.core.settings.rq.lnr().oth()), str) && qdlVar == tvp.qdl.IMAGE) {
                    com.bytedance.sdk.component.adexpress.qdl.ud.qdl qdlVar2 = new com.bytedance.sdk.component.adexpress.qdl.ud.qdl();
                    qdlVar2.qdl(5);
                    qdlVar2.qdl(qdl(str, com.bytedance.sdk.component.utils.mzz.qdl(str)));
                    return qdlVar2;
                }
            }
        }
        return null;
    }

    private com.bytedance.sdk.component.adexpress.qdl.ud.qdl qdl(JSONArray jSONArray, String str, tvp.qdl qdlVar) {
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.rq.lnr.qdl(jSONArray.optString(i10), com.bytedance.sdk.openadsdk.core.settings.rq.lnr().oth()), str)) {
                    com.bytedance.sdk.component.adexpress.qdl.ud.qdl qdlVar2 = new com.bytedance.sdk.component.adexpress.qdl.ud.qdl();
                    qdlVar2.qdl(5);
                    qdlVar2.qdl(mml(str, qdlVar));
                    return qdlVar2;
                }
            }
        }
        return null;
    }

    private WebResourceResponse qdl(String str, String str2) {
        WebResourceResponse webResourceResponse = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream inputStreamQdl = com.bytedance.sdk.openadsdk.tvp.mml.qdl(str, str2);
            if (inputStreamQdl == null) {
                return null;
            }
            WebResourceResponse webResourceResponse2 = new WebResourceResponse(tvp.qdl.IMAGE.qdl(), D5.N, inputStreamQdl);
            try {
                qdl(webResourceResponse2);
                return webResourceResponse2;
            } catch (Throwable th2) {
                th = th2;
                webResourceResponse = webResourceResponse2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        com.bytedance.sdk.component.utils.aaj.qdl("ExpressClient", "get image WebResourceResponse error", th);
        return webResourceResponse;
    }

    private void qdl(long j10, long j11, String str, int i10) {
        com.bytedance.sdk.openadsdk.mml.fs fsVar = this.mo;
        if (fsVar == null || fsVar.ud() == null) {
            return;
        }
        tvp.qdl qdlVarQdl = com.bytedance.sdk.component.adexpress.mml.tvp.qdl(str);
        if (qdlVarQdl == tvp.qdl.HTML) {
            this.mo.ud().qdl(str, j10, j11, i10);
        } else if (qdlVarQdl == tvp.qdl.JS) {
            this.mo.ud().ud(str, j10, j11, i10);
        }
    }

    private void qdl(WebResourceResponse webResourceResponse) {
        if (webResourceResponse == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, ProxyConfig.MATCH_ALL_SCHEMES);
        webResourceResponse.setResponseHeaders(map);
    }
}
