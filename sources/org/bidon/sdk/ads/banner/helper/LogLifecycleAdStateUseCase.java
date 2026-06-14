package org.bidon.sdk.ads.banner.helper;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\u0002¨\u0006\b"}, d2 = {"Lorg/bidon/sdk/ads/banner/helper/LogLifecycleAdStateUseCase;", "", "<init>", "()V", "invoke", "", "adLifecycle", "Lorg/bidon/sdk/ads/banner/helper/AdLifecycle;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LogLifecycleAdStateUseCase {

    @NotNull
    public static final LogLifecycleAdStateUseCase INSTANCE = new LogLifecycleAdStateUseCase();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdLifecycle.values().length];
            try {
                iArr[AdLifecycle.Created.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdLifecycle.LoadingFailed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdLifecycle.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdLifecycle.Displaying.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdLifecycle.Displayed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdLifecycle.DisplayingFailed.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AdLifecycle.Destroyed.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AdLifecycle.Loaded.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private LogLifecycleAdStateUseCase() {
    }

    public final void invoke(@NotNull AdLifecycle adLifecycle) {
        String str;
        Intrinsics.checkNotNullParameter(adLifecycle, "adLifecycle");
        switch (WhenMappings.$EnumSwitchMapping$0[adLifecycle.ordinal()]) {
            case 1:
            case 2:
            case 3:
                str = "Banner not loaded";
                break;
            case 4:
            case 5:
                str = "Banner shown";
                break;
            case 6:
                str = "Banner show failed";
                break;
            case 7:
                str = "Banner destroyed";
                break;
            case 8:
                str = "Banner loaded";
                break;
            default:
                throw new m();
        }
        LogExtKt.logInfo("AdLifecycle", str);
    }
}
