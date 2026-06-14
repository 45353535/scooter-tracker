package com.mobilefuse.sdk.internal.repository;

import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.component.AdmParser;
import com.mobilefuse.sdk.encoding.Base64Kt;
import com.mobilefuse.sdk.encoding.Gzip;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.ProcessingError;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.network.model.AdmMediaType;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import com.mobilefuse.sdk.network.model.MfxBidResponseFromJsonKt;
import com.mobilefuse.sdk.rx.AdParserFlowKt;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import com.mobilefuse.sdk.telemetry.TelemetryAgent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\u0010\rJ0\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00190\n2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00190\nH\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/mobilefuse/sdk/internal/repository/BiddingAdRepository;", "Lcom/mobilefuse/sdk/internal/repository/AdRepository;", "Lcom/mobilefuse/sdk/internal/repository/ParsedAdMarkupResponse;", "bidResponse", "", "telemetryAgent", "Lcom/mobilefuse/sdk/telemetry/TelemetryAgent;", "adLoadingConfig", "Lcom/mobilefuse/sdk/internal/repository/AdLoadingConfig;", "parserFactory", "Lkotlin/Function1;", "Lcom/mobilefuse/sdk/network/model/AdmMediaType;", "Lcom/mobilefuse/sdk/component/AdmParser;", "(Ljava/lang/String;Lcom/mobilefuse/sdk/telemetry/TelemetryAgent;Lcom/mobilefuse/sdk/internal/repository/AdLoadingConfig;Lkotlin/jvm/functions/Function1;)V", "getAdLoadingConfig", "()Lcom/mobilefuse/sdk/internal/repository/AdLoadingConfig;", "getBidResponse", "()Ljava/lang/String;", "getParserFactory", "()Lkotlin/jvm/functions/Function1;", "repositoryType", "getRepositoryType", "getTelemetryAgent", "()Lcom/mobilefuse/sdk/telemetry/TelemetryAgent;", "loadAd", "", "errorCallback", "Lcom/mobilefuse/sdk/exception/BaseError;", "successCallback", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class BiddingAdRepository implements AdRepository<ParsedAdMarkupResponse> {

    @NotNull
    private final AdLoadingConfig adLoadingConfig;

    @NotNull
    private final String bidResponse;

    @NotNull
    private final Function1<AdmMediaType, AdmParser> parserFactory;

    @NotNull
    private final String repositoryType;

    @NotNull
    private final TelemetryAgent telemetryAgent;

    /* JADX WARN: Multi-variable type inference failed */
    public BiddingAdRepository(@NotNull String bidResponse, @NotNull TelemetryAgent telemetryAgent, @NotNull AdLoadingConfig adLoadingConfig, @NotNull Function1<? super AdmMediaType, ? extends AdmParser> parserFactory) {
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        Intrinsics.checkNotNullParameter(telemetryAgent, "telemetryAgent");
        Intrinsics.checkNotNullParameter(adLoadingConfig, "adLoadingConfig");
        Intrinsics.checkNotNullParameter(parserFactory, "parserFactory");
        this.bidResponse = bidResponse;
        this.telemetryAgent = telemetryAgent;
        this.adLoadingConfig = adLoadingConfig;
        this.parserFactory = parserFactory;
        this.repositoryType = "bidding";
    }

    @Override // com.mobilefuse.sdk.internal.repository.AdRepository
    @NotNull
    public AdLoadingConfig getAdLoadingConfig() {
        return this.adLoadingConfig;
    }

    @NotNull
    public final String getBidResponse() {
        return this.bidResponse;
    }

    @Override // com.mobilefuse.sdk.internal.repository.AdRepository
    @NotNull
    public Function1<AdmMediaType, AdmParser> getParserFactory() {
        return this.parserFactory;
    }

    @Override // com.mobilefuse.sdk.internal.repository.AdRepository
    @NotNull
    public String getRepositoryType() {
        return this.repositoryType;
    }

    @Override // com.mobilefuse.sdk.internal.repository.AdRepository
    @NotNull
    public TelemetryAgent getTelemetryAgent() {
        return this.telemetryAgent;
    }

    @Override // com.mobilefuse.sdk.internal.repository.AdRepository
    public void loadAd(@NotNull final Function1<? super BaseError, Unit> errorCallback, @NotNull final Function1<? super ParsedAdMarkupResponse, Unit> successCallback) {
        Either errorResult;
        byte[] bArrBase64Decode;
        String strGunzip;
        Intrinsics.checkNotNullParameter(errorCallback, "errorCallback");
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            bArrBase64Decode = Base64Kt.base64Decode(this.bidResponse);
        } catch (Throwable th2) {
            if (BiddingAdRepository$loadAd$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (bArrBase64Decode != null && (strGunzip = Gzip.gunzip(bArrBase64Decode)) != null) {
            AdParserFlowKt.parse(FlowKt.toFlow(MfxBidResponseFromJsonKt.fromJson(MfxBidResponse.INSTANCE, strGunzip)), getParserFactory()).collect(new FlowCollector() { // from class: com.mobilefuse.sdk.internal.repository.BiddingAdRepository$loadAd$$inlined$gracefullyHandleException$lambda$1
                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    if (result instanceof SuccessResult) {
                        Either either = (Either) ((SuccessResult) result).getValue();
                        BiddingAdRepository biddingAdRepository = this.this$0;
                        AdRepositoryTelemetryKt.addTelemetryBidResponseAction(biddingAdRepository, null, either, biddingAdRepository.getBidResponse());
                        if (either instanceof SuccessResult) {
                            successCallback.invoke(((SuccessResult) either).getValue());
                        } else if (either instanceof ErrorResult) {
                            errorCallback.invoke(((ErrorResult) either).getValue());
                        }
                    }
                }

                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public void emitError(@NotNull Throwable error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    FlowCollector.DefaultImpls.emitError(this, error);
                }

                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public void emitSuccess(T t10) {
                    FlowCollector.DefaultImpls.emitSuccess(this, t10);
                }
            });
            errorResult = new SuccessResult(Unit.f93236a);
            if (errorResult instanceof ErrorResult) {
                errorCallback.invoke(new ProcessingError(((Throwable) ((ErrorResult) errorResult).getValue()).getMessage()));
                return;
            }
            return;
        }
        errorCallback.invoke(new ProcessingError("Can't decode Bid Response"));
    }
}
