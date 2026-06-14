package com.bytedance.sdk.openadsdk.exu;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.adjust.sdk.Constants;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.tvp.mo;
import com.bytedance.sdk.openadsdk.core.model.aaj;
import com.bytedance.sdk.openadsdk.core.model.exc;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.widget.qdl.lnr;
import com.bytedance.sdk.openadsdk.core.widget.qdl.mzz;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.mml.fs;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.jyq;
import com.bytedance.sdk.openadsdk.wd.ud;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private static int lnr = 2;
    private static long mml = 3600000;
    private static volatile qdl qdl;
    private LinkedHashMap<Integer, SoftReference<mo>> mzz;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final Handler f17594ud;

    public qdl() {
        lnr = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("pre_render_count", 2);
        long jQdl = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("pre_render_duration", Constants.ONE_HOUR);
        mml = jQdl;
        if (lnr <= 0) {
            lnr = 2;
        }
        if (jQdl <= 0) {
            mml = 3600000L;
        }
        this.mzz = new LinkedHashMap<>();
        this.f17594ud = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.exu.qdl.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(@NonNull Message message) {
                SoftReference softReference;
                int i10 = message.what;
                if (qdl.this.mzz == null || (softReference = (SoftReference) qdl.this.mzz.get(Integer.valueOf(i10))) == null) {
                    return false;
                }
                mo moVar = (mo) softReference.get();
                qdl.this.qdl(i10, 2, new ljh(), moVar == null ? "" : moVar.getTag());
                return false;
            }
        });
    }

    public static boolean lnr(ljh ljhVar) {
        return aaj.jpc(ljhVar) || aaj.ud(ljhVar) || aaj.lnr(ljhVar);
    }

    public mo ud(ljh ljhVar) {
        if (ljhVar == null || TextUtils.isEmpty(ljhVar.od())) {
            return null;
        }
        String strOd = ljhVar.od();
        if (TextUtils.isEmpty(strOd)) {
            return null;
        }
        int iHashCode = strOd.hashCode();
        SoftReference<mo> softReference = this.mzz.get(Integer.valueOf(iHashCode));
        if (softReference == null || softReference.get() == null) {
            return null;
        }
        mo moVar = softReference.get();
        qdl(ljhVar, moVar.getTag(), Double.valueOf((System.currentTimeMillis() / 1000) - ljhVar.wsn()).floatValue(), "web_use_pre_render");
        qdl(iHashCode, 3, ljhVar, moVar.getTag());
        return moVar;
    }

    public static qdl qdl() {
        if (qdl == null) {
            synchronized (qdl.class) {
                try {
                    if (qdl == null) {
                        qdl = new qdl();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return qdl;
    }

    public void qdl(final ljh ljhVar) {
        final String str;
        if (ljhVar == null || !lnr(ljhVar)) {
            return;
        }
        exc excVarOth = ljhVar.oth();
        if (excVarOth == null) {
            excVarOth = new exc();
        }
        ljhVar.tu();
        if (ljhVar.tu()) {
            String strOd = ljhVar.od();
            if (TextUtils.isEmpty(strOd)) {
                return;
            }
            final int iHashCode = strOd.hashCode();
            if (aaj.ud(ljhVar)) {
                str = "landingpage_split_screen";
            } else if (aaj.mml(ljhVar)) {
                str = "landingpage_direct";
            } else if (aaj.lnr(ljhVar)) {
                str = "landingpage_split_ceiling";
            } else {
                str = "";
            }
            LinkedHashMap<Integer, SoftReference<mo>> linkedHashMap = this.mzz;
            if (linkedHashMap == null || !linkedHashMap.containsKey(Integer.valueOf(iHashCode))) {
                HashMap map = new HashMap();
                map.put(ljhVar.xmr(), ljhVar);
                if (excVarOth.ud() == 2) {
                    ud.qdl().qdl((Map<String, ljh>) map, new ud.qdl() { // from class: com.bytedance.sdk.openadsdk.exu.qdl.2
                        @Override // com.bytedance.sdk.openadsdk.wd.ud.qdl
                        public void qdl() {
                            qdl.this.qdl(iHashCode, ljhVar, str, true);
                        }
                    }, true);
                    return;
                }
                if (excVarOth.ud() == 1) {
                    ud.qdl().qdl((Map<String, ljh>) map, (ud.qdl) null, true);
                    qdl(iHashCode, ljhVar, str, true);
                } else if (excVarOth.ud() == 0) {
                    qdl(iHashCode, ljhVar, str, false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(final int i10, final ljh ljhVar, final String str, final boolean z10) {
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.exu.qdl.3
            private mzz qdl(@NonNull final mo moVar, fs fsVar) {
                mzz mzzVar = new mzz(yt.qdl(), null, ljhVar.yre(), fsVar, true) { // from class: com.bytedance.sdk.openadsdk.exu.qdl.3.3
                    @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
                    public void onPageFinished(WebView webView, String str2) {
                        mo moVar2 = moVar;
                        if (moVar2 != null) {
                            moVar2.setPreFinish(true);
                        }
                        super.onPageFinished(webView, str2);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
                    public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                        mo moVar2 = moVar;
                        if (moVar2 != null) {
                            moVar2.setPreStart(true);
                        }
                        super.onPageStarted(webView, str2, bitmap);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
                    public void onReceivedError(WebView webView, int i11, String str2, String str3) {
                        String strMml = mzz.mml(str3);
                        boolean z11 = false;
                        boolean z12 = strMml != null && strMml.startsWith("image");
                        if (strMml != null && strMml.startsWith("mp4")) {
                            z11 = true;
                        }
                        if (!z12 && !z11 && !moVar.lnr()) {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            qdl.this.qdl(i10, 4, ljhVar, str);
                        }
                        super.onReceivedError(webView, i11, str2, str3);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
                    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                        if (sslErrorHandler != null) {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            qdl.this.qdl(i10, 4, ljhVar, str);
                        }
                        super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                        try {
                            if (!z10) {
                                return super.shouldInterceptRequest(webView, str2);
                            }
                            mo moVar2 = moVar;
                            if (moVar2 != null) {
                                moVar2.qdl++;
                            }
                            WebResourceResponseModel webResourceResponseModelQdl = ud.qdl().qdl(ud.qdl().ud(), ljhVar.xmr(), str2);
                            if (webResourceResponseModelQdl != null && webResourceResponseModelQdl.getWebResourceResponse() != null) {
                                mo moVar3 = moVar;
                                if (moVar3 != null) {
                                    moVar3.f16676ud++;
                                }
                                return webResourceResponseModelQdl.getWebResourceResponse();
                            }
                            if (moVar != null && webResourceResponseModelQdl != null && webResourceResponseModelQdl.getMsg() == 2) {
                                moVar.lnr++;
                            }
                            return super.shouldInterceptRequest(webView, str2);
                        } catch (Throwable unused) {
                            return super.shouldInterceptRequest(webView, str2);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.qdl.mzz, android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView, String str2) {
                        return super.shouldOverrideUrlLoading(webView, str2);
                    }
                };
                mzzVar.qdl(ljhVar);
                mzzVar.qdl(str);
                return mzzVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instruction units count: 387
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.exu.qdl.AnonymousClass3.run():void");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(int i10, int i11, ljh ljhVar, String str) {
        LinkedHashMap<Integer, SoftReference<mo>> linkedHashMap = this.mzz;
        if (linkedHashMap != null && linkedHashMap.containsKey(Integer.valueOf(i10))) {
            this.mzz.remove(Integer.valueOf(i10));
        }
        Handler handler = this.f17594ud;
        if (handler != null) {
            handler.removeMessages(i10);
        }
        qdl(ljhVar, str, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(mo moVar, String str) {
        if (moVar == null) {
            return;
        }
        lnr.qdl(yt.qdl()).qdl(false).ud(false).qdl(moVar.getWebView());
        moVar.setMixedContentMode(0);
        jyq.qdl(moVar, str);
    }

    public static void qdl(ljh ljhVar, String str, final float f10, String str2) {
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), ljhVar, str, str2, new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.exu.qdl.4
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", f10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void qdl(ljh ljhVar, final String str, final int i10) {
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), ljhVar, str, "web_delete_pre_render", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.exu.qdl.5
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject qdl() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("reason", i10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }
}
