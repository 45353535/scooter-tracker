package com.unity3d.ads.core.data.model;

import com.unity3d.services.core.properties.SdkProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, d2 = {"toBold", "Lcom/unity3d/ads/core/data/model/InitializationState;", "Lcom/unity3d/services/core/properties/SdkProperties$InitializationState;", "toLegacy", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class InitializationStateKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InitializationState.values().length];
            try {
                iArr[InitializationState.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitializationState.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InitializationState.INITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InitializationState.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SdkProperties.InitializationState.values().length];
            try {
                iArr2[SdkProperties.InitializationState.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SdkProperties.InitializationState.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SdkProperties.InitializationState.INITIALIZED_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final InitializationState toBold(@NotNull SdkProperties.InitializationState initializationState) {
        Intrinsics.checkNotNullParameter(initializationState, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[initializationState.ordinal()];
        if (i10 == 1) {
            return InitializationState.NOT_INITIALIZED;
        }
        if (i10 == 2) {
            return InitializationState.INITIALIZING;
        }
        if (i10 == 3) {
            return InitializationState.INITIALIZED;
        }
        if (i10 == 4) {
            return InitializationState.FAILED;
        }
        throw new m();
    }

    @NotNull
    public static final SdkProperties.InitializationState toLegacy(@NotNull InitializationState initializationState) {
        Intrinsics.checkNotNullParameter(initializationState, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[initializationState.ordinal()];
        if (i10 == 1) {
            return SdkProperties.InitializationState.NOT_INITIALIZED;
        }
        if (i10 == 2) {
            return SdkProperties.InitializationState.INITIALIZING;
        }
        if (i10 == 3) {
            return SdkProperties.InitializationState.INITIALIZED_SUCCESSFULLY;
        }
        if (i10 == 4) {
            return SdkProperties.InitializationState.INITIALIZED_FAILED;
        }
        throw new m();
    }
}
