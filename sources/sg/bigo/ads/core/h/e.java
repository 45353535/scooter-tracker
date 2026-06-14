package sg.bigo.ads.core.h;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes4.dex */
public class e extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f104341a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected boolean f104342j;

    public interface a {
        void a(MotionEvent motionEvent);
    }

    e(Context context) {
        super(context);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setMixedContentMode(0);
    }

    @Nullable
    public static e a(@NonNull Context context) {
        try {
            return new e(context);
        } catch (Exception e10) {
            sg.bigo.ads.core.d.b.a(3000, 10100, Log.getStackTraceString(e10));
            return null;
        }
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.f104342j) {
            return;
        }
        this.f104342j = true;
        stopLoading();
        u.b(this);
        removeAllViews();
        setWebChromeClient(null);
        setWebViewClient(null);
        super.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a aVar = this.f104341a;
        if (aVar != null) {
            aVar.a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setOnWebViewTouchListener(a aVar) {
        this.f104341a = aVar;
    }
}
