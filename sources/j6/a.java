package j6;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAdListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {
    public static void a(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    public static void b(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    public static void c(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener, LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    public static void d(LevelPlayInterstitialAdListener levelPlayInterstitialAdListener, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }
}
