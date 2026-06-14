package p4;

import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class b {
    public static void a(AdapterAdListener adapterAdListener, Map map) {
        adapterAdListener.onAdClicked();
    }

    public static void b(AdapterAdListener adapterAdListener, AdapterErrorType adapterErrorType, int i10, String str, Map map) {
        adapterAdListener.onAdLoadFailed(adapterErrorType, i10, str);
    }

    public static void c(AdapterAdListener adapterAdListener, Map map) {
        adapterAdListener.onAdLoadSuccess();
    }

    public static void d(AdapterAdListener adapterAdListener, Map map) {
        adapterAdListener.onAdOpened();
    }

    public static void e(AdapterAdListener adapterAdListener, int i10, String str, Map map) {
        adapterAdListener.onAdShowFailed(i10, str);
    }
}
