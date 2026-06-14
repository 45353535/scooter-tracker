package org.bidon.sdk.stats.models;

import com.appodeal.ads.modules.common.internal.LogConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.stats.models.RoundStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"asRoundStatus", "Lorg/bidon/sdk/stats/models/RoundStatus;", "", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RoundStatusKt {
    @NotNull
    public static final RoundStatus asRoundStatus(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        BidonError bidonError = th2 instanceof BidonError ? (BidonError) th2 : null;
        if (bidonError instanceof BidonError.AdFormatIsNotSupported) {
            return RoundStatus.AdFormatNotSupported.INSTANCE;
        }
        if (bidonError instanceof BidonError.BidTimedOut) {
            return RoundStatus.BidTimeoutReached.INSTANCE;
        }
        if (bidonError instanceof BidonError.FillTimedOut) {
            return RoundStatus.FillTimeoutReached.INSTANCE;
        }
        if ((bidonError instanceof BidonError.InternalServerSdkError) || (bidonError instanceof BidonError.NetworkError)) {
            return RoundStatus.NetworkError.INSTANCE;
        }
        if (Intrinsics.areEqual(bidonError, BidonError.NoAppropriateAdUnitId.INSTANCE)) {
            return RoundStatus.NoAppropriateAdUnitId.INSTANCE;
        }
        if (bidonError instanceof BidonError.NoFill) {
            return RoundStatus.NoFill.INSTANCE;
        }
        if (bidonError instanceof BidonError.NoBid) {
            return RoundStatus.NoBid.INSTANCE;
        }
        if (Intrinsics.areEqual(bidonError, BidonError.AuctionCancelled.INSTANCE)) {
            return RoundStatus.AuctionCancelled.INSTANCE;
        }
        if (bidonError instanceof BidonError.AppKeyIsInvalid) {
            return new RoundStatus.UnspecifiedException("AppKeyIsInvalid");
        }
        if (bidonError instanceof BidonError.AdNotReady) {
            return new RoundStatus.UnspecifiedException("AdNotReady");
        }
        if (bidonError instanceof BidonError.NoAuctionResults) {
            return new RoundStatus.UnspecifiedException("NoAuctionResults");
        }
        if (bidonError instanceof BidonError.NoContextFound) {
            return new RoundStatus.UnspecifiedException("NoContextFound");
        }
        if (bidonError instanceof BidonError.NoRoundResults) {
            return new RoundStatus.UnspecifiedException("NoRoundResults");
        }
        if (bidonError instanceof BidonError.Expired) {
            return new RoundStatus.UnspecifiedException(LogConstants.EVENT_EXPIRED);
        }
        if (bidonError instanceof BidonError.AuctionInProgress) {
            return new RoundStatus.UnspecifiedException("AuctionInProgress");
        }
        if (bidonError instanceof BidonError.SdkNotInitialized) {
            return new RoundStatus.UnspecifiedException("SdkNotInitialized");
        }
        if (bidonError instanceof BidonError.Unspecified) {
            Throwable cause = ((BidonError.Unspecified) th2).getCause();
            return new RoundStatus.UnspecifiedException(cause != null ? cause.getMessage() : null);
        }
        if (bidonError instanceof BidonError.IncorrectAdUnit) {
            return new RoundStatus.IncorrectAdUnit(((BidonError.IncorrectAdUnit) th2).getMessage());
        }
        if (bidonError != null) {
            throw new m();
        }
        String message = th2.getMessage();
        if (message == null) {
            message = "NO_EXPLANATION_AVAILABLE";
        }
        return new RoundStatus.UnspecifiedException(message);
    }
}
