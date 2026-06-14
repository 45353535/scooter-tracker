package yads;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class r3 extends WebChromeClient {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f115287b = {ub.a(r3.class, POBCoreNativeConstants.NATIVE_CONTEXT, "getContext()Landroid/content/Context;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gk2 f115288a;

    public r3(Context context) {
        this.f115288a = hk2.a(context);
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        gk2 gk2Var = this.f115288a;
        KProperty kProperty = f115287b[0];
        Object obj = (Context) gk2Var.f111244a.get();
        t3 t3Var = obj instanceof t3 ? (t3) obj : null;
        if (t3Var != null) {
            t1 t1Var = (t1) t3Var;
            int i11 = i10 * 100;
            t1Var.f116017i.setProgress(i11);
            if (10000 > i11) {
                t1Var.a(0);
            } else {
                t1Var.f116016h.setText(webView.getTitle());
                t1Var.a(8);
            }
        }
    }
}
