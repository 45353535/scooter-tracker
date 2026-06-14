package com.mobilefuse.sdk.internal.repository;

import com.mobilefuse.sdk.component.AdmParser;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.internal.repository.AdRepositoryResponse;
import com.mobilefuse.sdk.network.model.AdmMediaType;
import com.mobilefuse.sdk.telemetry.TelemetryAgent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J0\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\t2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\tH&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/mobilefuse/sdk/internal/repository/AdRepository;", "T", "Lcom/mobilefuse/sdk/internal/repository/AdRepositoryResponse;", "", "adLoadingConfig", "Lcom/mobilefuse/sdk/internal/repository/AdLoadingConfig;", "getAdLoadingConfig", "()Lcom/mobilefuse/sdk/internal/repository/AdLoadingConfig;", "parserFactory", "Lkotlin/Function1;", "Lcom/mobilefuse/sdk/network/model/AdmMediaType;", "Lcom/mobilefuse/sdk/component/AdmParser;", "getParserFactory", "()Lkotlin/jvm/functions/Function1;", "repositoryType", "", "getRepositoryType", "()Ljava/lang/String;", "telemetryAgent", "Lcom/mobilefuse/sdk/telemetry/TelemetryAgent;", "getTelemetryAgent", "()Lcom/mobilefuse/sdk/telemetry/TelemetryAgent;", "loadAd", "", "errorCallback", "Lcom/mobilefuse/sdk/exception/BaseError;", "successCallback", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public interface AdRepository<T extends AdRepositoryResponse> {
    @NotNull
    AdLoadingConfig getAdLoadingConfig();

    @NotNull
    Function1<AdmMediaType, AdmParser> getParserFactory();

    @NotNull
    String getRepositoryType();

    @NotNull
    TelemetryAgent getTelemetryAgent();

    void loadAd(@NotNull Function1<? super BaseError, Unit> errorCallback, @NotNull Function1<? super T, Unit> successCallback);
}
