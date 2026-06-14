package com.unity3d.ads.core.domain.scar;

import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JA\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/domain/scar/LoadScarAd;", "", "scarManager", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "(Lcom/unity3d/ads/core/data/manager/ScarManager;)V", "invoke", "", "adFormat", "", "placementId", "adUnitId", HandleInvocationsFromAdViewer.KEY_AD_STRING, HandleInvocationsFromAdViewer.KEY_QUERY_ID, "videoLength", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LoadScarAd {

    @NotNull
    private final ScarManager scarManager;

    public LoadScarAd(@NotNull ScarManager scarManager) {
        Intrinsics.checkNotNullParameter(scarManager, "scarManager");
        this.scarManager = scarManager;
    }

    @Nullable
    public final Object invoke(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i10, @NotNull Continuation continuation) {
        if (Intrinsics.areEqual(str, "banner")) {
            return Unit.f93236a;
        }
        Object objLoadAd = this.scarManager.loadAd(str, str2, str4, str3, str5, i10, continuation);
        return objLoadAd == b.g() ? objLoadAd : Unit.f93236a;
    }
}
