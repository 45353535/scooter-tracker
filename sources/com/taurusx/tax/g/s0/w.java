package com.taurusx.tax.g.s0;

import android.annotation.TargetApi;
import android.webkit.CookieManager;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.taurusx.tax.log.LogUtil;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class w {

    public class z extends WebChromeClient {
        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            LogUtil.d("taurusx", str2);
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
            LogUtil.d("taurusx", str2);
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            LogUtil.d("taurusx", str2);
            jsResult.confirm();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            LogUtil.d("taurusx", str2);
            jsPromptResult.confirm();
            return true;
        }
    }

    @TargetApi(11)
    public static void w(WebView webView) {
        webView.onResume();
    }

    public static void y(WebView webView) {
        webView.setWebChromeClient(new z());
    }

    public static void z(WebView webView) {
        if (webView == null) {
            return;
        }
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
    }

    /* JADX INFO: renamed from: com.taurusx.tax.g.s0.w$w, reason: collision with other inner class name */
    public static class C0808w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f66355a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<Class<?>> f66356c = new ArrayList();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public List<Object> f66357o = new ArrayList();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f66358s;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final String f66359w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Class<?> f66360y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final Object f66361z;

        public C0808w(Object obj, String str) {
            this.f66361z = obj;
            this.f66359w = str;
            this.f66360y = obj != null ? obj.getClass() : null;
        }

        public C0808w w() {
            this.f66358s = true;
            return this;
        }

        public <T> C0808w z(Class<T> cls, T t10) {
            this.f66356c.add(cls);
            this.f66357o.add(t10);
            return this;
        }

        public C0808w z(Class<?> cls) {
            this.f66355a = true;
            this.f66360y = cls;
            return this;
        }

        public Object z() throws Exception {
            Method methodZ = w.z(this.f66360y, this.f66359w, (Class[]) this.f66356c.toArray(new Class[this.f66356c.size()]));
            if (this.f66358s) {
                methodZ.setAccessible(true);
            }
            Object[] array = this.f66357o.toArray();
            if (this.f66355a) {
                return methodZ.invoke(null, array);
            }
            return methodZ.invoke(this.f66361z, array);
        }
    }

    public static Method z(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        while (cls != null) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException();
    }

    @TargetApi(11)
    public static void z(WebView webView, boolean z10) {
        if (z10) {
            webView.stopLoading();
            webView.loadUrl("");
        }
        webView.onPause();
    }
}
