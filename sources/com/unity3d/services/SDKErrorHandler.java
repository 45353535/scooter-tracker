package com.unity3d.services;

import com.google.protobuf.ByteString;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.CoroutineOpportunity;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import eg.c0;
import eg.e0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 02\u00020\u0001:\u00010B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/unity3d/services/SDKErrorHandler;", "Leg/c0;", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "alternativeFlowReader", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "sdkMetricsSender", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;)V", "", "name", "reason", "scopeName", "stackTrace", "Lcom/google/protobuf/ByteString;", "opportunityId", "", "sendDiagnostic", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/protobuf/ByteString;)V", "Lcom/unity3d/services/core/request/metrics/Metric;", "metric", "sendMetric", "(Lcom/unity3d/services/core/request/metrics/Metric;)V", "Lkotlin/coroutines/CoroutineContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "retrieveCoroutineName", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "retrieveOpportunityId", "(Lkotlin/coroutines/CoroutineContext;)Lcom/google/protobuf/ByteString;", "", "exception", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/services/core/request/metrics/SDKMetricsSender;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "Leg/c0$b;", C4240b4.i.W, "Leg/c0$b;", "getKey", "()Leg/c0$b;", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SDKErrorHandler implements c0 {

    @NotNull
    public static final String UNITY_PACKAGE = "com.unity3d";

    @NotNull
    public static final String UNKNOWN_FILE = "unknown";

    @NotNull
    private final AlternativeFlowReader alternativeFlowReader;

    @NotNull
    private final CoroutineDispatcher ioDispatcher;

    @NotNull
    private final c0.b key;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final SDKMetricsSender sdkMetricsSender;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.services.SDKErrorHandler$sendDiagnostic$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.services.SDKErrorHandler$sendDiagnostic$1", f = "SDKErrorHandler.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ String $name;
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ String $reason;
        final /* synthetic */ String $scopeName;
        final /* synthetic */ String $stackTrace;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, String str2, String str3, String str4, ByteString byteString, Continuation continuation) {
            super(2, continuation);
            this.$name = str;
            this.$reason = str2;
            this.$stackTrace = str3;
            this.$scopeName = str4;
            this.$opportunityId = byteString;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return SDKErrorHandler.this.new AnonymousClass1(this.$name, this.$reason, this.$stackTrace, this.$scopeName, this.$opportunityId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            SendDiagnosticEvent sendDiagnosticEvent = SDKErrorHandler.this.sendDiagnosticEvent;
            String str = this.$name;
            String str2 = this.$reason;
            String str3 = this.$stackTrace;
            String str4 = this.$scopeName;
            ByteString byteString = this.$opportunityId;
            Map mapCreateMapBuilder = MapsKt.createMapBuilder();
            mapCreateMapBuilder.put("reason", str2);
            mapCreateMapBuilder.put("reason_debug", str3);
            mapCreateMapBuilder.put("coroutine_name", str4);
            if (byteString != null) {
                String string = ProtobufExtensionsKt.toUUID(byteString).toString();
                Intrinsics.checkNotNullExpressionValue(string, "it.toUUID().toString()");
                mapCreateMapBuilder.put("impressionOpportunityId", string);
            }
            Unit unit = Unit.f93236a;
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str, null, MapsKt.build(mapCreateMapBuilder), null, null, null, 58, null);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public SDKErrorHandler(@NotNull CoroutineDispatcher ioDispatcher, @NotNull AlternativeFlowReader alternativeFlowReader, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull SDKMetricsSender sdkMetricsSender) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(alternativeFlowReader, "alternativeFlowReader");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(sdkMetricsSender, "sdkMetricsSender");
        this.ioDispatcher = ioDispatcher;
        this.alternativeFlowReader = alternativeFlowReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sdkMetricsSender = sdkMetricsSender;
        this.scope = i.j(i.a(ioDispatcher), new e0("SDKErrorHandler"));
        this.key = c0.J8;
    }

    private final String retrieveCoroutineName(CoroutineContext context) {
        String strM;
        e0 e0Var = (e0) context.get(e0.f69143c);
        return (e0Var == null || (strM = e0Var.m()) == null) ? "unknown" : strM;
    }

    private final ByteString retrieveOpportunityId(CoroutineContext context) {
        CoroutineOpportunity coroutineOpportunity = (CoroutineOpportunity) context.get(CoroutineOpportunity.INSTANCE);
        if (coroutineOpportunity != null) {
            return coroutineOpportunity.getValue();
        }
        return null;
    }

    private final void sendDiagnostic(String name, String reason, String scopeName, String stackTrace, ByteString opportunityId) {
        eg.i.d(this.scope, null, null, new AnonymousClass1(name, reason, stackTrace, scopeName, opportunityId, null), 3, null);
    }

    private final void sendMetric(Metric metric) {
        this.sdkMetricsSender.sendMetric(metric);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) c0.a.a(this, r10, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b bVar) {
        return (E) c0.a.b(this, bVar);
    }

    @Override // eg.c0
    public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exception, "exception");
        String strRetrieveCoroutineName = retrieveCoroutineName(context);
        ByteString byteStringRetrieveOpportunityId = retrieveOpportunityId(context);
        String str = exception instanceof NullPointerException ? "native_exception_npe" : exception instanceof OutOfMemoryError ? "native_exception_oom" : exception instanceof IllegalStateException ? "native_exception_ise" : exception instanceof SecurityException ? "native_exception_se" : exception instanceof RuntimeException ? "native_exception_re" : "native_exception";
        boolean zInvoke = this.alternativeFlowReader.invoke();
        String strRetrieveUnityCrashValue = ExceptionExtensionsKt.retrieveUnityCrashValue(exception);
        DeviceLog.error("Unity Ads SDK encountered an exception: " + strRetrieveUnityCrashValue);
        if (zInvoke) {
            sendDiagnostic(str, strRetrieveUnityCrashValue, strRetrieveCoroutineName, ExceptionExtensionsKt.getShortenedStackTrace(exception, 15), byteStringRetrieveOpportunityId);
        } else {
            sendMetric(new Metric(str, strRetrieveUnityCrashValue, null, 4, null));
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.b bVar) {
        return c0.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return c0.a.d(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public c0.b getKey() {
        return this.key;
    }
}
