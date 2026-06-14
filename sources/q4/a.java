package q4;

import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {
    public static void a(NetworkInitializationListener networkInitializationListener, int i10, String str, Map map) {
        networkInitializationListener.onInitFailed(i10, str);
    }

    public static void b(NetworkInitializationListener networkInitializationListener, Map map) {
        networkInitializationListener.onInitSuccess();
    }
}
