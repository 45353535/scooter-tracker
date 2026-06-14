package com.unity3d.ads.adplayer;

import androidx.annotation.CallSuper;
import com.unity3d.ads.adplayer.AdPlayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/unity3d/ads/adplayer/FullscreenAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface FullscreenAdPlayer extends AdPlayer {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @CallSuper
        @Nullable
        public static Object destroy(@NotNull FullscreenAdPlayer fullscreenAdPlayer, @NotNull Continuation continuation) {
            Object objDestroy = AdPlayer.DefaultImpls.destroy(fullscreenAdPlayer, continuation);
            return objDestroy == pf.b.g() ? objDestroy : Unit.f93236a;
        }

        public static void show(@NotNull FullscreenAdPlayer fullscreenAdPlayer, @NotNull ShowOptions showOptions) {
            Intrinsics.checkNotNullParameter(showOptions, "showOptions");
            AdPlayer.DefaultImpls.show(fullscreenAdPlayer, showOptions);
        }
    }
}
