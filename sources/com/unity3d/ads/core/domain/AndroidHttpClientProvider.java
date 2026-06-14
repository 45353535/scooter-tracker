package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.android.gms.net.CronetProviderInstaller;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.CronetClient;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.OkHttp3Client;
import hh.x;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import org.chromium.net.CronetEngine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ)\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u0011\u0010\u0016\u001a\u00020\u0010H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHttpClientProvider;", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "alternativeFlowReader", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "cronetEngineBuilderFactory", "Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;", "mediationTraitsMetadataReader", "Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "(Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Landroid/content/Context;Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;)V", "buildNetworkClient", "Lcom/unity3d/services/core/network/core/HttpClient;", "selectedHttpClient", "Lcom/unity3d/ads/core/domain/HttpClientSelection;", "(Landroid/content/Context;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/ads/core/domain/HttpClientSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOkHttp3Client", "Lcom/unity3d/services/core/network/core/OkHttp3Client;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidHttpClientProvider implements HttpClientProvider {

    @NotNull
    private final AlternativeFlowReader alternativeFlowReader;

    @NotNull
    private final Context context;

    @NotNull
    private final CronetEngineBuilderFactory cronetEngineBuilderFactory;

    @NotNull
    private final ISDKDispatchers dispatchers;

    @NotNull
    private final MediationTraitsMetadataReader mediationTraitsMetadataReader;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider", f = "AndroidHttpClientProvider.kt", l = {59}, m = "invoke")
    static final class AnonymousClass1 extends d {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHttpClientProvider.this.invoke(this);
        }
    }

    public AndroidHttpClientProvider(@NotNull AlternativeFlowReader alternativeFlowReader, @NotNull ISDKDispatchers dispatchers, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull Context context, @NotNull CronetEngineBuilderFactory cronetEngineBuilderFactory, @NotNull MediationTraitsMetadataReader mediationTraitsMetadataReader) {
        Intrinsics.checkNotNullParameter(alternativeFlowReader, "alternativeFlowReader");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cronetEngineBuilderFactory, "cronetEngineBuilderFactory");
        Intrinsics.checkNotNullParameter(mediationTraitsMetadataReader, "mediationTraitsMetadataReader");
        this.alternativeFlowReader = alternativeFlowReader;
        this.dispatchers = dispatchers;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.context = context;
        this.cronetEngineBuilderFactory = cronetEngineBuilderFactory;
        this.mediationTraitsMetadataReader = mediationTraitsMetadataReader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object buildNetworkClient(final Context context, final ISDKDispatchers iSDKDispatchers, final HttpClientSelection httpClientSelection, Continuation continuation) {
        final kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(b.d(continuation), 1);
        eVar.I();
        CronetProviderInstaller.installProvider(context).addOnCompleteListener(new OnCompleteListener() { // from class: com.unity3d.ads.core.domain.AndroidHttpClientProvider$buildNetworkClient$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(@NotNull Task<Void> it) {
                String str;
                String message;
                Intrinsics.checkNotNullParameter(it, "it");
                str = "Errored without message.";
                if (!it.isSuccessful()) {
                    SendDiagnosticEvent sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                    Exception exception = it.getException();
                    if (exception != null && (message = exception.getMessage()) != null) {
                        str = message;
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_cronet_install_error", null, MapsKt.mapOf(TuplesKt.to("reason", str)), null, null, null, 58, null);
                    CancellableContinuation cancellableContinuation = eVar;
                    Result.Companion companion = Result.f93230c;
                    cancellableContinuation.resumeWith(Result.b(this.this$0.getOkHttp3Client()));
                    return;
                }
                try {
                    CronetEngine.Builder builderCreateCronetEngineBuilder = this.this$0.cronetEngineBuilderFactory.createCronetEngineBuilder(context);
                    if (httpClientSelection == HttpClientSelection.CRONET_WITH_QUIC) {
                        builderCreateCronetEngineBuilder.enableQuic(true);
                        builderCreateCronetEngineBuilder.addQuicHint(ServiceProvider.GATEWAY_HOST, 443, 443);
                        builderCreateCronetEngineBuilder.addQuicHint(ServiceProvider.CDN_CREATIVES_HOST, 443, 443);
                    }
                    CronetEngine cronetEngine = builderCreateCronetEngineBuilder.build();
                    CancellableContinuation cancellableContinuation2 = eVar;
                    Result.Companion companion2 = Result.f93230c;
                    Intrinsics.checkNotNullExpressionValue(cronetEngine, "cronetEngine");
                    cancellableContinuation2.resumeWith(Result.b(new CronetClient(cronetEngine, iSDKDispatchers)));
                } catch (Throwable th2) {
                    SendDiagnosticEvent sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                    String message2 = th2.getMessage();
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_cronet_engine_error", null, MapsKt.mapOf(TuplesKt.to("reason", message2 != null ? message2 : "Errored without message.")), null, null, null, 58, null);
                    CancellableContinuation cancellableContinuation3 = eVar;
                    Result.Companion companion3 = Result.f93230c;
                    cancellableContinuation3.resumeWith(Result.b(this.this$0.getOkHttp3Client()));
                }
            }
        });
        Object objC = eVar.C();
        if (objC == b.g()) {
            g.c(continuation);
        }
        return objC;
    }

    @NotNull
    public final OkHttp3Client getOkHttp3Client() {
        return new OkHttp3Client(this.dispatchers, new x());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // com.unity3d.ads.core.domain.HttpClientProvider
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidHttpClientProvider.invoke(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
