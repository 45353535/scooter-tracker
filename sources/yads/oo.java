package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class oo extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f114377a;

    public /* synthetic */ oo(Context context) {
        this(context, null);
    }

    public final String a(String str) {
        return str + b() + "<body style='margin:0; padding:0;'>";
    }

    @Override // android.webkit.WebView
    public final void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
        this.f114377a.put(str, obj);
    }

    public String b() {
        return "";
    }

    public void c() {
        qi3.a((ViewGroup) this);
        Iterator it = this.f114377a.keySet().iterator();
        while (it.hasNext()) {
            removeJavascriptInterface((String) it.next());
        }
        this.f114377a.clear();
        destroy();
        getClass().toString();
        boolean z10 = lb1.f113032a;
    }

    public final void d() {
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        if (sb.a(11)) {
            settings.setAllowContentAccess(false);
            if (sb.a(16)) {
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            }
        }
    }

    @Override // android.webkit.WebView
    public final void removeJavascriptInterface(String str) {
        if (sb.a(11)) {
            super.removeJavascriptInterface(str);
        }
    }

    public final void setDisplayZoomControls(boolean z10) {
        if (sb.a(11)) {
            getSettings().setDisplayZoomControls(z10);
        }
    }

    public oo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114377a = new LinkedHashMap();
        d();
    }
}
