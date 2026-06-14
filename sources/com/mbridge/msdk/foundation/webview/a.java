package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.exoplayer2.C;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.taurusx.tax.g.n;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class a implements BrowserView.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static String f49141o = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f49142a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f49144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f49145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BaseTrackingListener f49146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BrowserView f49147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CampaignEx f49148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.click.a f49149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Context f49150i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private JumpLoaderResult f49152k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f49155n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f49143b = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f49153l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f49154m = new RunnableC0524a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Handler f49151j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.webview.a$a, reason: collision with other inner class name */
    class RunnableC0524a implements Runnable {
        RunnableC0524a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.b(a.f49141o, "webview js！超时上限：" + a.this.f49142a + "ms");
            if (a.this.f49149h != null && a.this.f49152k != null) {
                a.this.f49152k.setSuccess(false);
                a.this.f49152k.setUrl(a.this.f49144c);
                a.this.f49152k.setType(2);
                a.this.f49152k.setExceptionMsg("linktype 8 time out");
                a.this.f49149h.a(a.this.f49152k, a.this.f49148g, 1, false);
            }
            a aVar = a.this;
            if (aVar.b(null, aVar.f49144c) && !a.this.f49153l) {
                a.this.f49153l = true;
                a aVar2 = a.this;
                aVar2.a(aVar2.f49150i, a.this.f49144c, a.this.f49148g);
            }
            if (a.this.f49146e != null) {
                a.this.f49146e.onFinishRedirection(a.this.f49148g, a.this.f49144c);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f49157a;

        b(String str) {
            this.f49157a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f49149h != null && a.this.f49152k != null) {
                a.this.f49152k.setSuccess(true);
                a.this.f49152k.setUrl(this.f49157a);
                a.this.f49152k.setType(2);
                a.this.f49149h.a(a.this.f49152k, a.this.f49148g, 1, true);
            }
            if (a.this.f49146e != null) {
                a.this.f49146e.onFinishRedirection(a.this.f49148g, this.f49157a);
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f49159a;

        c(String str) {
            this.f49159a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f49146e != null) {
                a.this.f49146e.onFinishRedirection(a.this.f49148g, this.f49159a);
            }
            if (a.this.f49149h == null || a.this.f49152k == null) {
                return;
            }
            a.this.f49152k.setSuccess(true);
            a.this.f49152k.setUrl(this.f49159a);
            a.this.f49152k.setType(2);
            a.this.f49149h.a(a.this.f49152k, a.this.f49148g, 1, true);
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f49161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f49162b;

        d(String str, String str2) {
            this.f49161a = str;
            this.f49162b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f49146e != null) {
                a.this.f49146e.onFinishRedirection(a.this.f49148g, this.f49161a);
            }
            if (a.this.f49149h == null || a.this.f49152k == null) {
                return;
            }
            a.this.f49152k.setSuccess(false);
            a.this.f49152k.setUrl(this.f49161a);
            a.this.f49152k.setType(2);
            a.this.f49152k.setExceptionMsg(this.f49162b);
            a.this.f49149h.a(a.this.f49152k, a.this.f49148g, 1, true);
        }
    }

    public a(Context context, CampaignEx campaignEx, com.mbridge.msdk.click.a aVar, BrowserView browserView, BaseTrackingListener baseTrackingListener) {
        this.f49142a = 10000;
        this.f49152k = null;
        this.f49150i = context;
        this.f49148g = campaignEx;
        this.f49147f = browserView;
        this.f49146e = baseTrackingListener;
        g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        gVarD = gVarD == null ? h.b().a() : gVarD;
        this.f49149h = aVar;
        this.f49152k = new JumpLoaderResult();
        this.f49142a = (int) gVarD.p0();
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void a() {
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void onPageFinished(WebView webView, String str) {
        q0.b(f49141o, "onPageFinished1  " + str);
        if (this.f49143b) {
            this.f49155n = 0L;
            this.f49143b = false;
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new c(str));
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c();
            Uri uri = Uri.parse(str);
            if ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && !this.f49153l) {
                this.f49153l = true;
                a(this.f49150i, str, this.f49148g);
            }
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.f49155n == 0) {
            this.f49155n = System.currentTimeMillis();
            if (!this.f49145d) {
                this.f49145d = true;
                d();
            }
            this.f49153l = false;
        }
        this.f49144c = str;
        this.f49143b = true;
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        q0.d(f49141o, str);
        c();
        com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new d(str2, str));
        if (!b(webView, str2) || this.f49153l) {
            return;
        }
        this.f49153l = true;
        a(this.f49150i, str2, this.f49148g);
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        q0.b(f49141o, "shouldOverrideUrlLoading1  " + str);
        this.f49143b = false;
        if (u0.a.b(str) && u0.a.a(this.f49150i, str, null)) {
            this.f49153l = true;
        }
        boolean zC = c(webView, str);
        if (zC) {
            this.f49155n = 0L;
            this.f49143b = false;
            c();
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new b(str));
        }
        return zC;
    }

    private boolean c(WebView webView, String str) {
        String str2;
        try {
        } catch (Throwable th2) {
            q0.b(f49141o, th2.getMessage());
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        if (!uri.getScheme().equals("http") && !uri.getScheme().equals("https")) {
            if (uri.getScheme().equals(n.f66171o)) {
                Intent uri2 = Intent.parseUri(str, 1);
                try {
                    str2 = uri2.getPackage();
                } catch (Throwable th3) {
                    q0.b(f49141o, th3.getMessage());
                }
                if (!TextUtils.isEmpty(str2) && this.f49150i.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                    uri2.setFlags(268435456);
                    this.f49150i.startActivity(uri2);
                    this.f49153l = true;
                    return true;
                }
                try {
                    String stringExtra = uri2.getStringExtra("browser_fallback_url");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        Uri uri3 = Uri.parse(str);
                        if (!uri3.getScheme().equals("http") && !uri3.getScheme().equals("https")) {
                            str = stringExtra;
                        }
                        webView.loadUrl(stringExtra);
                        return false;
                    }
                } catch (Throwable th4) {
                    q0.b(f49141o, th4.getMessage());
                }
                q0.b(f49141o, th2.getMessage());
                return false;
            }
            if (com.mbridge.msdk.click.c.d(this.f49150i, str)) {
                q0.b(f49141o, "openDeepLink");
                this.f49153l = true;
                return true;
            }
        }
        return false;
    }

    private void d() {
        this.f49151j.postDelayed(this.f49154m, this.f49142a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(WebView webView, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            Uri uri = Uri.parse(str);
            if (!uri.getScheme().equals("http") && !uri.getScheme().equals("https")) {
                if (uri.getScheme().equals(n.f66171o)) {
                    Intent uri2 = Intent.parseUri(str, 1);
                    try {
                        String str2 = uri2.getPackage();
                        if (!TextUtils.isEmpty(str2)) {
                            if (this.f49150i.getPackageManager().getLaunchIntentForPackage(str2) != null) {
                                return false;
                            }
                        }
                    } catch (Throwable th2) {
                        q0.b(f49141o, th2.getMessage());
                    }
                    try {
                        String stringExtra = uri2.getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            Uri uri3 = Uri.parse(str);
                            if (!uri3.getScheme().equals("http")) {
                                if (!uri3.getScheme().equals("https")) {
                                    str = stringExtra;
                                }
                            }
                            return true;
                        }
                    } catch (Throwable th3) {
                        q0.b(f49141o, th3.getMessage());
                    }
                }
                if (com.mbridge.msdk.click.c.d(this.f49150i, str)) {
                    q0.b(f49141o, "openDeepLink");
                    return false;
                }
            }
            return true;
        } catch (Throwable th4) {
            q0.b(f49141o, th4.getMessage());
            return true;
        }
    }

    @Override // com.mbridge.msdk.foundation.webview.BrowserView.e
    public void a(WebView webView, String str) {
        if (this.f49155n == 0) {
            this.f49155n = System.currentTimeMillis();
            if (!this.f49145d) {
                this.f49145d = true;
                d();
            }
        }
        this.f49144c = str;
        this.f49143b = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, CampaignEx campaignEx) {
        if (context == null) {
            return;
        }
        if (campaignEx != null) {
            campaignEx.getCurrentLocalRid();
        }
        try {
            int i10 = MBCommonActivity.f46221e;
            Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.foundation.webview.b.f49164a.put(str, this.f49147f);
            if (u0.a.d(str)) {
                str = "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", "");
            }
            intent.putExtra("url", str);
            q0.c("url", "webview url = " + str);
            intent.setFlags(C.ENCODING_PCM_32BIT);
            intent.putExtra("mvcommon", campaignEx);
            context.startActivity(intent);
        } catch (Exception unused) {
            u0.a(context, str, this.f49146e, campaignEx, new ArrayList());
        }
    }

    private void c() {
        this.f49151j.removeCallbacks(this.f49154m);
    }
}
