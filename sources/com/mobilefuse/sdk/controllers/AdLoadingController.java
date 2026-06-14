package com.mobilefuse.sdk.controllers;

import com.mobilefuse.sdk.AdError;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.WinningBidInfo;
import com.mobilefuse.sdk.component.ParsedAdMarkup;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.internal.repository.AdRepository;
import com.mobilefuse.sdk.internal.repository.ParsedAdMarkupResponse;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import com.mobilefuse.sdk.network.model.MfxBidResponseToWinningBidInfoKt;
import com.mobilefuse.sdk.state.AdState;
import com.mobilefuse.sdk.state.AdStateKt;
import com.mobilefuse.sdk.state.Stateful;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\nR.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R4\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010%\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010#8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/mobilefuse/sdk/controllers/AdLoadingController;", "Lcom/mobilefuse/sdk/state/Stateful;", "Lcom/mobilefuse/sdk/state/AdState;", "<init>", "()V", "Lcom/mobilefuse/sdk/internal/repository/AdRepository;", "Lcom/mobilefuse/sdk/internal/repository/ParsedAdMarkupResponse;", "adRepository", "", "loadAd", "(Lcom/mobilefuse/sdk/internal/repository/AdRepository;)V", "Lkotlin/Function1;", "Lcom/mobilefuse/sdk/AdError;", "onError", "Lkotlin/jvm/functions/Function1;", "getOnError", "()Lkotlin/jvm/functions/Function1;", "setOnError", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "Lcom/mobilefuse/sdk/component/ParsedAdMarkup;", "Lcom/mobilefuse/sdk/network/model/MfxBidResponse;", "onMarkupReceived", "Lkotlin/jvm/functions/Function2;", "getOnMarkupReceived", "()Lkotlin/jvm/functions/Function2;", "setOnMarkupReceived", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function0;", "onLoadingComplete", "Lkotlin/jvm/functions/Function0;", "getOnLoadingComplete", "()Lkotlin/jvm/functions/Function0;", "setOnLoadingComplete", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/mobilefuse/sdk/WinningBidInfo;", "<set-?>", "winningBidInfo", "Lcom/mobilefuse/sdk/WinningBidInfo;", "getWinningBidInfo", "()Lcom/mobilefuse/sdk/WinningBidInfo;", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class AdLoadingController extends Stateful<AdState> {

    @NotNull
    private Function1<? super AdError, Unit> onError;

    @NotNull
    private Function0<Unit> onLoadingComplete;

    @NotNull
    private Function2<? super ParsedAdMarkup, ? super MfxBidResponse, Unit> onMarkupReceived;

    @Nullable
    private WinningBidInfo winningBidInfo;

    public AdLoadingController() {
        super(AdState.IDLE);
        this.onError = new Function1<AdError, Unit>() { // from class: com.mobilefuse.sdk.controllers.AdLoadingController$onError$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AdError it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AdError adError) {
                invoke2(adError);
                return Unit.f93236a;
            }
        };
        this.onMarkupReceived = new Function2<ParsedAdMarkup, MfxBidResponse, Unit>() { // from class: com.mobilefuse.sdk.controllers.AdLoadingController$onMarkupReceived$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ParsedAdMarkup parsedAdMarkup, @NotNull MfxBidResponse mfxBidResponse) {
                Intrinsics.checkNotNullParameter(parsedAdMarkup, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(mfxBidResponse, "<anonymous parameter 1>");
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ParsedAdMarkup parsedAdMarkup, MfxBidResponse mfxBidResponse) {
                invoke2(parsedAdMarkup, mfxBidResponse);
                return Unit.f93236a;
            }
        };
        this.onLoadingComplete = new Function0<Unit>() { // from class: com.mobilefuse.sdk.controllers.AdLoadingController$onLoadingComplete$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }
        };
    }

    @NotNull
    public final Function1<AdError, Unit> getOnError() {
        return this.onError;
    }

    @NotNull
    public final Function0<Unit> getOnLoadingComplete() {
        return this.onLoadingComplete;
    }

    @NotNull
    public final Function2<ParsedAdMarkup, MfxBidResponse, Unit> getOnMarkupReceived() {
        return this.onMarkupReceived;
    }

    @Nullable
    public final WinningBidInfo getWinningBidInfo() {
        return this.winningBidInfo;
    }

    public final void loadAd(@NotNull final AdRepository<ParsedAdMarkupResponse> adRepository) {
        Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        if (stateIsOneOf(AdState.DESTROYED)) {
            return;
        }
        if (!AdStateKt.hasAd(this)) {
            setState(AdState.LOADING);
            adRepository.loadAd(new Function1<BaseError, Unit>() { // from class: com.mobilefuse.sdk.controllers.AdLoadingController.loadAd.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BaseError baseError) {
                    invoke2(baseError);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull BaseError it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    AdLoadingController.this.setState(AdState.NOT_FILLED);
                }
            }, new Function1<ParsedAdMarkupResponse, Unit>() { // from class: com.mobilefuse.sdk.controllers.AdLoadingController.loadAd.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ParsedAdMarkupResponse parsedAdMarkupResponse) {
                    invoke2(parsedAdMarkupResponse);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ParsedAdMarkupResponse response) {
                    Intrinsics.checkNotNullParameter(response, "response");
                    try {
                        AdLoadingController adLoadingController = AdLoadingController.this;
                        WinningBidInfo winningBidInfo = MfxBidResponseToWinningBidInfoKt.getWinningBidInfo(response.getBidResponse());
                        DebuggingKt.logDebug$default(AdLoadingController.this, "Winning bid received with CRID: " + winningBidInfo.getCreativeId(), null, 2, null);
                        Unit unit = Unit.f93236a;
                        adLoadingController.winningBidInfo = winningBidInfo;
                        AdLoadingController.this.getOnMarkupReceived().invoke(response.getMarkup(), response.getBidResponse());
                        AdLoadingController.this.setState(AdState.LOADED);
                        AdLoadingController.this.getOnLoadingComplete().invoke();
                    } catch (Throwable th2) {
                        AdLoadingController.this.setState(AdState.NOT_FILLED);
                        Function1<AdError, Unit> onError = AdLoadingController.this.getOnError();
                        AdError adError = AdError.AD_LOAD_ERROR;
                        onError.invoke(adError);
                        StabilityHelper.logAdErrorException(AdLoadingController.this, th2, adRepository.getAdLoadingConfig().getObservable(), adError);
                    }
                }
            });
            return;
        }
        DebuggingKt.logDebug$default(this, "Ad can't be loaded: Current ad state is " + getState().name(), null, 2, null);
        this.onError.invoke(AdError.AD_ALREADY_LOADED);
    }

    public final void setOnError(@NotNull Function1<? super AdError, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onError = function1;
    }

    public final void setOnLoadingComplete(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onLoadingComplete = function0;
    }

    public final void setOnMarkupReceived(@NotNull Function2<? super ParsedAdMarkup, ? super MfxBidResponse, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.onMarkupReceived = function2;
    }
}
