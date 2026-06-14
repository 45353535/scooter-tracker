package k6;

import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {
    public static void a(LevelPlayRewardedAdListener levelPlayRewardedAdListener, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    public static void b(LevelPlayRewardedAdListener levelPlayRewardedAdListener, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    public static void c(LevelPlayRewardedAdListener levelPlayRewardedAdListener, LevelPlayAdError error, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    public static void d(LevelPlayRewardedAdListener levelPlayRewardedAdListener, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }
}
