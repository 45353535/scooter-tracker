package com.pubmatic.sdk.openwrap.core.signal;

import com.pubmatic.sdk.openwrap.core.signal.admob.POBAdMobSignalGenerator;
import com.pubmatic.sdk.openwrap.core.signal.ulevelplay.POBULevelPlaySignalGenerator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/pubmatic/sdk/openwrap/core/signal/POBSignalGeneratorFactory;", "", "()V", "getSignalGenerator", "Lcom/pubmatic/sdk/openwrap/core/signal/POBSignalGeneration;", "biddingHost", "Lcom/pubmatic/sdk/openwrap/core/signal/POBBiddingHost;", "openwrapcore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class POBSignalGeneratorFactory {

    @NotNull
    public static final POBSignalGeneratorFactory INSTANCE = new POBSignalGeneratorFactory();

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[POBBiddingHost.values().length];
            iArr[POBBiddingHost.ALMAX.ordinal()] = 1;
            iArr[POBBiddingHost.ADMOB.ordinal()] = 2;
            iArr[POBBiddingHost.UNITYLEVELPLAY.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private POBSignalGeneratorFactory() {
    }

    @NotNull
    public static final POBSignalGeneration getSignalGenerator(@NotNull POBBiddingHost biddingHost) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(biddingHost, "biddingHost");
        int i10 = WhenMappings.$EnumSwitchMapping$0[biddingHost.ordinal()];
        if (i10 == 1) {
            return new POBALMAXSignalGenerator();
        }
        if (i10 == 2) {
            return new POBAdMobSignalGenerator();
        }
        if (i10 == 3) {
            return new POBULevelPlaySignalGenerator();
        }
        throw new IllegalArgumentException("Unknown bidding host");
    }
}
