package zb;

import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public interface a {
    Map getCustomParams();

    b getParams();

    void hide();

    void load(ContextProvider contextProvider, od.d dVar, NetworkAdUnit networkAdUnit);

    void onClicked();

    void onClosed(boolean z10);

    void onDestroy();

    void onExpired();

    void onFinished();

    void onImpression();

    void onShowFailed();

    void onShown();
}
