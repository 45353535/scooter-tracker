package com.mobilefuse.sdk.internal;

import com.taurusx.tax.f.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/mobilefuse/sdk/internal/BiddingTokenIdGenerator;", "", "()V", y.f66058y, "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class BiddingTokenIdGenerator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int NEXT_BID_TOKEN_INSTANCE_ID = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/mobilefuse/sdk/internal/BiddingTokenIdGenerator$Companion;", "", "()V", "NEXT_BID_TOKEN_INSTANCE_ID", "", "getNextBidTokenId", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        public final int getNextBidTokenId() {
            int i10 = BiddingTokenIdGenerator.NEXT_BID_TOKEN_INSTANCE_ID;
            BiddingTokenIdGenerator.NEXT_BID_TOKEN_INSTANCE_ID = i10 + 1;
            return i10;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
