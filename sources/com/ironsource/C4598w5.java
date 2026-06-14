package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4598w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4598w5 f45712a = new C4598w5();

    private C4598w5() {
    }

    static /* synthetic */ IronSourceError a(C4598w5 c4598w5, EnumC4244b8 enumC4244b8, IronSourceError ironSourceError, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            ironSourceError = null;
        }
        return c4598w5.a(enumC4244b8, ironSourceError);
    }

    @NotNull
    public final IronSourceError b() {
        return a(this, EnumC4244b8.ISErrorInitHttpRequestFailed, null, 2, null);
    }

    @NotNull
    public final IronSourceError c() {
        return a(this, EnumC4244b8.ISErrorInitInvalidResponse, null, 2, null);
    }

    @NotNull
    public final IronSourceError d() {
        return a(this, EnumC4244b8.ISErrorLoadADMDecryptionFailure, null, 2, null);
    }

    @NotNull
    public final IronSourceError e() {
        return a(this, EnumC4244b8.ISErrorLoadADMEmptyServerData, null, 2, null);
    }

    @NotNull
    public final IronSourceError f() {
        return a(this, EnumC4244b8.ISErrorLoadADMEmptyWaterfall, null, 2, null);
    }

    @NotNull
    public final IronSourceError g() {
        return a(this, EnumC4244b8.ISErrorLoadADMInvalidConfigurationForRequestedNetwork, null, 2, null);
    }

    @NotNull
    public final IronSourceError h() {
        return a(this, EnumC4244b8.ISErrorLoadADMInvalidJSON, null, 2, null);
    }

    @NotNull
    public final IronSourceError i() {
        return a(this, EnumC4244b8.ISErrorLoadADMNoAuctionID, null, 2, null);
    }

    @NotNull
    public final IronSourceError j() {
        return a(this, EnumC4244b8.ISErrorLoadADMNoConfigurationForRequestedNetwork, null, 2, null);
    }

    @NotNull
    public final IronSourceError k() {
        return a(this, EnumC4244b8.ISErrorLoadBannerNetworkViewIsNull, null, 2, null);
    }

    @NotNull
    public final IronSourceError l() {
        return a(this, EnumC4244b8.ISErrorLoadBannerNotSupportedSize, null, 2, null);
    }

    @NotNull
    public final IronSourceError m() {
        return a(this, EnumC4244b8.ISErrorLoadBannerSizeIsNull, null, 2, null);
    }

    @NotNull
    public final IronSourceError n() {
        return a(this, EnumC4244b8.ISErrorLoadBiddingInNonBidding, null, 2, null);
    }

    @NotNull
    public final IronSourceError o() {
        return a(this, EnumC4244b8.ISErrorLoadInstanceNotInInitResponse, null, 2, null);
    }

    @NotNull
    public final IronSourceError p() {
        return a(this, EnumC4244b8.ISErrorLoadNoAdFormatConfigurations, null, 2, null);
    }

    @NotNull
    public final IronSourceError q() {
        return a(this, EnumC4244b8.ISErrorLoadNullADM, null, 2, null);
    }

    @NotNull
    public final IronSourceError r() {
        return a(this, EnumC4244b8.ISErrorLoadSDKNotInitialized, null, 2, null);
    }

    @NotNull
    public final IronSourceError s() {
        return a(this, EnumC4244b8.ISErrorLoadTimedOut, null, 2, null);
    }

    @NotNull
    public final IronSourceError t() {
        return a(this, EnumC4244b8.ISErrorShowNotReadyToShowAd, null, 2, null);
    }

    private final IronSourceError a(EnumC4244b8 enumC4244b8, IronSourceError ironSourceError) {
        String strC;
        if (ironSourceError != null) {
            strC = enumC4244b8.c() + " Underlying network error: '" + ironSourceError.getErrorCode() + StringUtils.PROCESS_POSTFIX_DELIMITER + ironSourceError.getErrorMessage() + "'";
        } else {
            strC = enumC4244b8.c();
        }
        return new IronSourceError(enumC4244b8.b(), strC);
    }

    @NotNull
    public final IronSourceError b(@NotNull IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return a(EnumC4244b8.ISErrorLoadNetworkFailed, error);
    }

    @NotNull
    public final IronSourceError c(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return a(EnumC4244b8.ISErrorLoadNetworkFailed, description);
    }

    @NotNull
    public final IronSourceError d(@Nullable String str) {
        return a(EnumC4244b8.ISErrorRewardedLoadNoConfig, str);
    }

    public static /* synthetic */ IronSourceError b(C4598w5 c4598w5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return c4598w5.b(str);
    }

    @NotNull
    public final IronSourceError c(@NotNull IronSourceError networkError) {
        Intrinsics.checkNotNullParameter(networkError, "networkError");
        return a(EnumC4244b8.ISErrorShowNetworkFailed, networkError);
    }

    public static /* synthetic */ IronSourceError c(C4598w5 c4598w5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return c4598w5.d(str);
    }

    @NotNull
    public final IronSourceError b(@Nullable String str) {
        return a(EnumC4244b8.ISErrorInterstitialLoadNoConfig, str);
    }

    private final IronSourceError a(EnumC4244b8 enumC4244b8, String str) {
        if (str == null || str.length() == 0) {
            str = enumC4244b8.c();
        }
        return new IronSourceError(enumC4244b8.b(), str);
    }

    @NotNull
    public final IronSourceError a(@NotNull IronSourceError networkError) {
        Intrinsics.checkNotNullParameter(networkError, "networkError");
        return a(EnumC4244b8.ISErrorInitNetworkFailed, networkError);
    }

    @NotNull
    public final IronSourceError a() {
        return a(this, EnumC4244b8.ISErrorInitDecryptionFailure, null, 2, null);
    }

    public static /* synthetic */ IronSourceError a(C4598w5 c4598w5, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return c4598w5.a(str);
    }

    @NotNull
    public final IronSourceError a(@Nullable String str) {
        return a(EnumC4244b8.ISErrorBannerLoadNoConfig, str);
    }
}
