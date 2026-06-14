package p4;

import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {
    public static void a(AdapterAdInteractionListener adapterAdInteractionListener, Map map) {
        adapterAdInteractionListener.onAdClosed();
    }

    public static void b(AdapterAdInteractionListener adapterAdInteractionListener, Map map) {
        adapterAdInteractionListener.onAdEnded();
    }

    public static void c(AdapterAdInteractionListener adapterAdInteractionListener, Map map) {
        adapterAdInteractionListener.onAdStarted();
    }

    public static void d(AdapterAdInteractionListener adapterAdInteractionListener, Map map) {
        adapterAdInteractionListener.onAdVisible();
    }
}
