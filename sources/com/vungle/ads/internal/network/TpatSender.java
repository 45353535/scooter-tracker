package com.vungle.ads.internal.network;

import androidx.annotation.VisibleForTesting;
import com.taurusx.tax.f.y;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.model.ErrorInfo;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KTypeProjection;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ug.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 -2\u00020\u0001:\u0001-B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0007J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0002J(\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u001a\u0010&\u001a\u0004\u0018\u00010#2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u0017H\u0002J\r\u0010'\u001a\u00020\u001fH\u0000¢\u0006\u0002\b(J\u001c\u0010)\u001a\u00020\u001f2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0002J\u0018\u0010+\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010,\u001a\u00020\u001cR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006."}, d2 = {"Lcom/vungle/ads/internal/network/TpatSender;", "", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "ioExecutor", "Ljava/util/concurrent/Executor;", "jobExecutor", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "signalManager", "Lcom/vungle/ads/internal/signals/SignalManager;", "(Lcom/vungle/ads/internal/network/VungleApiClient;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lcom/vungle/ads/internal/util/PathProvider;Lcom/vungle/ads/internal/signals/SignalManager;)V", "getJobExecutor", "()Ljava/util/concurrent/Executor;", "getSignalManager", "()Lcom/vungle/ads/internal/signals/SignalManager;", "tpatFilePreferences", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "tpatLock", "getVungleApiClient", "()Lcom/vungle/ads/internal/network/VungleApiClient;", "getStoredTpats", "", "", "Lcom/vungle/ads/internal/network/FailedTpat;", "injectSessionIdToUrl", "url", "isPriorityTpat", "", "event", "logTpatError", "", "request", "Lcom/vungle/ads/internal/network/TpatRequest;", "error", "Lcom/vungle/ads/internal/model/ErrorInfo;", "reason", "Lcom/vungle/ads/internal/protos/Sdk$SDKError$Reason;", "performPriorityRetry", "resendStoredTpats", "resendStoredTpats$vungle_ads_release", "saveStoredTpats", "tpats", "sendTpat", "fromFailedTpat", y.f66058y, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class TpatSender {

    @NotNull
    private static final String FAILED_TPATS = "FAILED_TPATS";

    @NotNull
    private static final String TAG = "TpatSender";

    @NotNull
    private final Executor jobExecutor;

    @Nullable
    private final SignalManager signalManager;

    @NotNull
    private final FilePreferences tpatFilePreferences;

    @NotNull
    private final Object tpatLock;

    @NotNull
    private final VungleApiClient vungleApiClient;

    public TpatSender(@NotNull VungleApiClient vungleApiClient, @NotNull Executor ioExecutor, @NotNull Executor jobExecutor, @NotNull PathProvider pathProvider, @Nullable SignalManager signalManager) {
        Intrinsics.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        Intrinsics.checkNotNullParameter(ioExecutor, "ioExecutor");
        Intrinsics.checkNotNullParameter(jobExecutor, "jobExecutor");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.vungleApiClient = vungleApiClient;
        this.jobExecutor = jobExecutor;
        this.signalManager = signalManager;
        this.tpatFilePreferences = FilePreferences.INSTANCE.get(ioExecutor, pathProvider, FilePreferences.TPAT_FAILED_FILENAME);
        this.tpatLock = new Object();
    }

    private final Map<String, FailedTpat> getStoredTpats() {
        Object objB;
        String string = this.tpatFilePreferences.getString(FAILED_TPATS);
        if (string != null) {
            try {
                Result.Companion companion = Result.f93230c;
                b.a aVar = kotlinx.serialization.json.b.f93658d;
                ah.b bVarA = aVar.a();
                KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
                KSerializer kSerializerB = v.b(bVarA, v0.d(v0.q(Map.class, companion2.invariant(v0.o(String.class)), companion2.invariant(v0.o(FailedTpat.class)))));
                Intrinsics.checkNotNull(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                objB = Result.b((Map) aVar.c(kSerializerB, string));
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.f93230c;
                objB = Result.b(d.a(th2));
            }
            Throwable thG = Result.g(objB);
            if (thG != null) {
                Logger.INSTANCE.e(TAG, "Failed to decode stored tpats: " + thG);
            }
            if (Result.g(objB) != null) {
                objB = new LinkedHashMap();
            }
            Map<String, FailedTpat> map = (Map) objB;
            if (map != null) {
                return map;
            }
        }
        return new LinkedHashMap();
    }

    private final boolean isPriorityTpat(String event) {
        return Intrinsics.areEqual(event, Constants.CHECKPOINT_0) || Intrinsics.areEqual(event, Constants.CLICK_URL) || Intrinsics.areEqual(event, "impression") || Intrinsics.areEqual(event, Constants.LOAD_AD);
    }

    private final void logTpatError(TpatRequest request, String url, ErrorInfo error, Sdk.SDKError.Reason reason) {
        String str = "tpat key: " + request.getTpatKey() + ", error: " + error.getDescription() + ", errorIsTerminal: " + error.getErrorIsTerminal() + " url: " + url;
        Logger.INSTANCE.e(TAG, str);
        new TpatError(reason, str).setLogEntry$vungle_ads_release(request.getLogEntry()).logErrorNoReturnValue$vungle_ads_release();
    }

    private final ErrorInfo performPriorityRetry(TpatRequest request, String url) {
        String str;
        ErrorInfo errorInfoPingTPAT;
        Boolean priorityRetry = request.getPriorityRetry();
        int i10 = 0;
        boolean z10 = ConfigManager.INSTANCE.retryPriorityTPATs() && (priorityRetry != null ? priorityRetry.booleanValue() : isPriorityTpat(request.getTpatKey()));
        while (true) {
            str = url;
            errorInfoPingTPAT = this.vungleApiClient.pingTPAT(str, request.getHeaders(), request.getBody(), request.getMethod(), request.getLogEntry());
            if (!z10 || errorInfoPingTPAT == null || !errorInfoPingTPAT.isRetryCode() || (i10 = i10 + 1) >= request.getPriorityRetryCount()) {
                break;
            }
            url = str;
        }
        if (errorInfoPingTPAT != null) {
            logTpatError(request, str, errorInfoPingTPAT, i10 >= request.getPriorityRetryCount() ? Sdk.SDKError.Reason.TPAT_RETRY_FAILED : Sdk.SDKError.Reason.TPAT_ERROR);
        }
        return errorInfoPingTPAT;
    }

    private final void saveStoredTpats(Map<String, FailedTpat> tpats) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            FilePreferences filePreferences = this.tpatFilePreferences;
            b.a aVar = kotlinx.serialization.json.b.f93658d;
            ah.b bVarA = aVar.a();
            KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
            KSerializer kSerializerB = v.b(bVarA, v0.d(v0.q(Map.class, companion2.invariant(v0.o(String.class)), companion2.invariant(v0.o(FailedTpat.class)))));
            Intrinsics.checkNotNull(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            filePreferences.put(FAILED_TPATS, aVar.b(kSerializerB, tpats)).apply();
            objB = Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        if (Result.g(objB) != null) {
            Logger.INSTANCE.e(TAG, "Failed to encode the about to storing tpats: " + tpats);
        }
    }

    public static /* synthetic */ void sendTpat$default(TpatSender tpatSender, TpatRequest tpatRequest, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        tpatSender.sendTpat(tpatRequest, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: sendTpat$lambda-1, reason: not valid java name */
    public static final void m7538sendTpat$lambda1(TpatSender this$0, TpatRequest request, String urlWithSessionId, boolean z10) {
        FailedTpat failedTpat;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(urlWithSessionId, "$urlWithSessionId");
        ErrorInfo errorInfoPerformPriorityRetry = this$0.performPriorityRetry(request, urlWithSessionId);
        if (request.getRegularRetry()) {
            if (errorInfoPerformPriorityRetry == null || !errorInfoPerformPriorityRetry.getErrorIsTerminal()) {
                if (errorInfoPerformPriorityRetry != null || z10) {
                    synchronized (this$0.tpatLock) {
                        try {
                            Map<String, FailedTpat> storedTpats = this$0.getStoredTpats();
                            FailedTpat failedTpat2 = storedTpats.get(request.getUrl());
                            int retryAttempt = failedTpat2 != null ? failedTpat2.getRetryAttempt() : 0;
                            if (errorInfoPerformPriorityRetry == null && retryAttempt > 0) {
                                storedTpats.remove(request.getUrl());
                                this$0.saveStoredTpats(storedTpats);
                            } else if (errorInfoPerformPriorityRetry != null && retryAttempt >= request.getRegularRetryCount()) {
                                storedTpats.remove(request.getUrl());
                                this$0.saveStoredTpats(storedTpats);
                                this$0.logTpatError(request, urlWithSessionId, errorInfoPerformPriorityRetry, Sdk.SDKError.Reason.TPAT_RETRY_FAILED);
                            } else if (errorInfoPerformPriorityRetry != null) {
                                FailedTpat failedTpat3 = storedTpats.get(request.getUrl());
                                if (failedTpat3 == null || (failedTpat = FailedTpat.copy$default(failedTpat3, null, null, null, retryAttempt + 1, 0, null, 55, null)) == null) {
                                    failedTpat = new FailedTpat(request.getMethod(), request.getHeaders(), request.getBody(), 1, request.getRegularRetryCount(), request.getTpatKey());
                                }
                                storedTpats.put(request.getUrl(), failedTpat);
                                this$0.saveStoredTpats(storedTpats);
                            }
                            Unit unit = Unit.f93236a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    @NotNull
    public final Executor getJobExecutor() {
        return this.jobExecutor;
    }

    @Nullable
    public final SignalManager getSignalManager() {
        return this.signalManager;
    }

    @NotNull
    public final VungleApiClient getVungleApiClient() {
        return this.vungleApiClient;
    }

    @VisibleForTesting
    @NotNull
    public final String injectSessionIdToUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        SignalManager signalManager = this.signalManager;
        String uuid = signalManager != null ? signalManager.getUuid() : null;
        if (uuid == null) {
            uuid = "";
        }
        if (uuid.length() <= 0) {
            return url;
        }
        String strQuote = Pattern.quote(Constants.SESSION_ID);
        Intrinsics.checkNotNullExpressionValue(strQuote, "quote(Constants.SESSION_ID)");
        return new Regex(strQuote).replace(url, uuid);
    }

    public final void resendStoredTpats$vungle_ads_release() {
        for (Map.Entry<String, FailedTpat> entry : getStoredTpats().entrySet()) {
            String key = entry.getKey();
            FailedTpat value = entry.getValue();
            sendTpat(new TpatRequest.Builder(key).regularRetry(true).priorityRetry(false).headers(value.getHeaders()).body(value.getBody()).regularRetryCount(value.getRetryCount()).method(value.getMethod()).tpatKey(value.getTpatKey()).build(), true);
        }
    }

    public final void sendTpat(@NotNull final TpatRequest request, final boolean fromFailedTpat) {
        Intrinsics.checkNotNullParameter(request, "request");
        final String strInjectSessionIdToUrl = injectSessionIdToUrl(request.getUrl());
        this.jobExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.network.a
            @Override // java.lang.Runnable
            public final void run() {
                TpatSender.m7538sendTpat$lambda1(this.f68044b, request, strInjectSessionIdToUrl, fromFailedTpat);
            }
        });
    }

    public /* synthetic */ TpatSender(VungleApiClient vungleApiClient, Executor executor, Executor executor2, PathProvider pathProvider, SignalManager signalManager, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(vungleApiClient, executor, executor2, pathProvider, (i10 & 16) != 0 ? null : signalManager);
    }
}
