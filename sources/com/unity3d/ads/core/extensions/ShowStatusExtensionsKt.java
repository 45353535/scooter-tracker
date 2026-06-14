package com.unity3d.ads.core.extensions;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.adplayer.model.ShowStatus;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"toUnityAdsShowCompletionState", "Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;", "Lcom/unity3d/ads/adplayer/model/ShowStatus;", "defaultShowCompletionState", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$ShowCompletionState;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ShowStatusExtensionsKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[NativeConfigurationOuterClass.ShowCompletionState.values().length];
            try {
                iArr[NativeConfigurationOuterClass.ShowCompletionState.SHOW_COMPLETION_STATE_COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NativeConfigurationOuterClass.ShowCompletionState.SHOW_COMPLETION_STATE_SKIPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ShowStatus.values().length];
            try {
                iArr2[ShowStatus.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ShowStatus.SKIPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ShowStatus.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final UnityAds.UnityAdsShowCompletionState toUnityAdsShowCompletionState(@NotNull ShowStatus showStatus, @NotNull NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState) {
        Intrinsics.checkNotNullParameter(showStatus, "<this>");
        Intrinsics.checkNotNullParameter(defaultShowCompletionState, "defaultShowCompletionState");
        int i10 = WhenMappings.$EnumSwitchMapping$1[showStatus.ordinal()];
        if (i10 == 1) {
            return UnityAds.UnityAdsShowCompletionState.COMPLETED;
        }
        if (i10 == 2) {
            return UnityAds.UnityAdsShowCompletionState.SKIPPED;
        }
        if (i10 != 3) {
            throw new m();
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[defaultShowCompletionState.ordinal()];
        return i11 != 1 ? i11 != 2 ? UnityAds.UnityAdsShowCompletionState.COMPLETED : UnityAds.UnityAdsShowCompletionState.SKIPPED : UnityAds.UnityAdsShowCompletionState.COMPLETED;
    }
}
