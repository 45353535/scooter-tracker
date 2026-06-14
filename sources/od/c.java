package od;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface c {
    void onAdClicked();

    void onAdExpired();

    void onAdLoadFailed(ae.a aVar);

    void onAdShowFailed(ae.a aVar);

    void onAdShown();

    void onBrokenCreativeEvent(Map map);

    void setVisibilitySource(io.bidmachine.core.k kVar);
}
