package sg.bigo.ads.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public interface AdInteractionListener {
    void onAdClicked();

    void onAdClosed();

    void onAdError(@NonNull AdError adError);

    void onAdImpression();

    void onAdOpened();
}
