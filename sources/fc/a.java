package fc;

import id.a0;
import id.t;
import id.z0;

/* JADX INFO: loaded from: classes3.dex */
public interface a {
    void onAdAppeared(Object obj);

    void onAdClicked(Object obj);

    void onAdDisappeared(Object obj);

    void onAdExpired(Object obj);

    void onAdFailToLoad(Object obj, a0 a0Var);

    void onAdFailToShow(Object obj, a0 a0Var);

    void onAdFinished(Object obj);

    void onAdLoaded(Object obj);

    void onAdShown(Object obj);

    void onBrokenCreativeEvent(Object obj, t tVar);

    void onOpenPrivacySheet(Object obj, z0 z0Var);
}
