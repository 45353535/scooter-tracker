package p4;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class d {
    public static void a(AdapterAdViewListener adapterAdViewListener, Map map) {
        adapterAdViewListener.onAdLeftApplication();
    }

    public static void b(AdapterAdViewListener adapterAdViewListener, View view, FrameLayout.LayoutParams layoutParams, Map map) {
        adapterAdViewListener.onAdLoadSuccess(view, layoutParams);
    }

    public static void c(AdapterAdViewListener adapterAdViewListener, Map map) {
        adapterAdViewListener.onAdScreenDismissed();
    }

    public static void d(AdapterAdViewListener adapterAdViewListener, Map map) {
        adapterAdViewListener.onAdScreenPresented();
    }
}
