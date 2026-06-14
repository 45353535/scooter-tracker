package sg.bigo.ads.api;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.Ad;

/* JADX INFO: loaded from: classes4.dex */
public interface AdLoadListener<T extends Ad> {
    @MainThread
    void onAdLoaded(@NonNull T t10);

    @MainThread
    void onError(@NonNull AdError adError);
}
