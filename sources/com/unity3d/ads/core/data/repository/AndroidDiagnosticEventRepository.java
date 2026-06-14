package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.services.core.log.DeviceLog;
import eg.e0;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import hg.c0;
import hg.l0;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\fH\u0016J\b\u0010#\u001a\u00020!H\u0016J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020!H\u0016R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\r\u001a&\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f \u0010*\u0012\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u00110\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u0014\u001a&\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f \u0010*\u0012\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u00110\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidDiagnosticEventRepository;", "Lcom/unity3d/ads/core/data/repository/DiagnosticEventRepository;", "flushTimer", "Lcom/unity3d/ads/core/utils/CoroutineTimer;", "getDiagnosticEventRequest", "Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/unity3d/ads/core/utils/CoroutineTimer;Lcom/unity3d/ads/core/domain/events/GetDiagnosticEventRequest;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_diagnosticEvents", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEvent;", "allowedEvents", "", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticEventType;", "kotlin.jvm.PlatformType", "", "batch", "Lkotlinx/coroutines/flow/MutableStateFlow;", "blockedEvents", "configured", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "diagnosticEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "getDiagnosticEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "enabled", "maxBatchSize", "", "addDiagnosticEvent", "", "diagnosticEvent", "clear", "configure", "diagnosticsEventsConfiguration", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DiagnosticEventsConfiguration;", "flush", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidDiagnosticEventRepository implements DiagnosticEventRepository {

    @NotNull
    private final MutableSharedFlow _diagnosticEvents;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEvents;

    @NotNull
    private final MutableStateFlow batch;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEvents;

    @NotNull
    private final MutableStateFlow configured;

    @NotNull
    private final CoroutineScope coroutineScope;

    @NotNull
    private final SharedFlow diagnosticEvents;

    @NotNull
    private final MutableStateFlow enabled;

    @NotNull
    private final CoroutineTimer flushTimer;

    @NotNull
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private int maxBatchSize;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$2", f = "AndroidDiagnosticEventRepository.kt", l = {70}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ List<DiagnosticEventRequestOuterClass.DiagnosticEvent> $events;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list, Continuation continuation) {
            super(2, continuation);
            this.$events = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return AndroidDiagnosticEventRepository.this.new AnonymousClass2(this.$events, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                MutableSharedFlow mutableSharedFlow = AndroidDiagnosticEventRepository.this._diagnosticEvents;
                List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list = this.$events;
                this.label = 1;
                if (mutableSharedFlow.emit(list, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public AndroidDiagnosticEventRepository(@NotNull CoroutineTimer flushTimer, @NotNull GetDiagnosticEventRequest getDiagnosticEventRequest, @NotNull CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(flushTimer, "flushTimer");
        Intrinsics.checkNotNullParameter(getDiagnosticEventRequest, "getDiagnosticEventRequest");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.flushTimer = flushTimer;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.coroutineScope = i.j(i.a(dispatcher), new e0("DiagnosticEventRepository"));
        this.batch = l0.a(CollectionsKt.emptyList());
        this.maxBatchSize = Integer.MAX_VALUE;
        this.allowedEvents = DesugarCollections.synchronizedSet(new LinkedHashSet());
        this.blockedEvents = DesugarCollections.synchronizedSet(new LinkedHashSet());
        Boolean bool = Boolean.FALSE;
        this.enabled = l0.a(bool);
        this.configured = l0.a(bool);
        MutableSharedFlow mutableSharedFlowB = c0.b(100, 0, null, 6, null);
        this._diagnosticEvents = mutableSharedFlowB;
        this.diagnosticEvents = hg.i.b(mutableSharedFlowB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String flush$lambda$3(AndroidDiagnosticEventRepository this$0, List events) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(events, "$events");
        return "Unity Ads Sending diagnostic batch enabled: " + ((Boolean) this$0.enabled.getValue()).booleanValue() + " size: " + events.size() + " :: " + events;
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void addDiagnosticEvent(@NotNull DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        Object value;
        Object value2;
        Intrinsics.checkNotNullParameter(diagnosticEvent, "diagnosticEvent");
        if (!((Boolean) this.configured.getValue()).booleanValue()) {
            MutableStateFlow mutableStateFlow = this.batch;
            do {
                value2 = mutableStateFlow.getValue();
            } while (!mutableStateFlow.b(value2, CollectionsKt.plus((Collection<? extends DiagnosticEventRequestOuterClass.DiagnosticEvent>) value2, diagnosticEvent)));
        } else if (((Boolean) this.enabled.getValue()).booleanValue()) {
            MutableStateFlow mutableStateFlow2 = this.batch;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.b(value, CollectionsKt.plus((Collection<? extends DiagnosticEventRequestOuterClass.DiagnosticEvent>) value, diagnosticEvent)));
            if (((List) this.batch.getValue()).size() >= this.maxBatchSize) {
                flush();
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void clear() {
        Object value;
        MutableStateFlow mutableStateFlow = this.batch;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value, CollectionsKt.emptyList()));
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void configure(@NotNull NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticsEventsConfiguration) {
        Intrinsics.checkNotNullParameter(diagnosticsEventsConfiguration, "diagnosticsEventsConfiguration");
        this.configured.setValue(Boolean.TRUE);
        this.enabled.setValue(Boolean.valueOf(diagnosticsEventsConfiguration.getEnabled()));
        if (!((Boolean) this.enabled.getValue()).booleanValue()) {
            clear();
            return;
        }
        this.maxBatchSize = diagnosticsEventsConfiguration.getMaxBatchSize();
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set = this.allowedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEventsList = diagnosticsEventsConfiguration.getAllowedEventsList();
        Intrinsics.checkNotNullExpressionValue(allowedEventsList, "diagnosticsEventsConfiguration.allowedEventsList");
        set.addAll(allowedEventsList);
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set2 = this.blockedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEventsList = diagnosticsEventsConfiguration.getBlockedEventsList();
        Intrinsics.checkNotNullExpressionValue(blockedEventsList, "diagnosticsEventsConfiguration.blockedEventsList");
        set2.addAll(blockedEventsList);
        this.flushTimer.start(0L, diagnosticsEventsConfiguration.getMaxBatchIntervalMs(), new Function0<Unit>() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository.configure.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AndroidDiagnosticEventRepository.this.flush();
            }
        });
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void flush() {
        Object value;
        if (((Boolean) this.enabled.getValue()).booleanValue()) {
            MutableStateFlow mutableStateFlow = this.batch;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.b(value, CollectionsKt.emptyList()));
            final List listC0 = kotlin.sequences.k.c0(kotlin.sequences.k.E(kotlin.sequences.k.E(kotlin.sequences.k.Q(CollectionsKt.asSequence((Iterable) value), new Function1<DiagnosticEventRequestOuterClass.DiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEvent>() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$events$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(@Nullable DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
                    return diagnosticEvent == null ? this.this$0.getDiagnosticEventRequest.invoke("null_diagnostic_event", null, null, null, null, null, null, null, null) : diagnosticEvent;
                }
            }), new Function1<DiagnosticEventRequestOuterClass.DiagnosticEvent, Boolean>() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$events$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull DiagnosticEventRequestOuterClass.DiagnosticEvent it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(this.this$0.allowedEvents.isEmpty() || this.this$0.allowedEvents.contains(it.getEventType()));
                }
            }), new Function1<DiagnosticEventRequestOuterClass.DiagnosticEvent, Boolean>() { // from class: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$events$4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull DiagnosticEventRequestOuterClass.DiagnosticEvent it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(!this.this$0.blockedEvents.contains(it.getEventType()));
                }
            }));
            if (listC0.isEmpty()) {
                return;
            }
            DeviceLog.debug((Callable<String>) new Callable() { // from class: com.unity3d.ads.core.data.repository.a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return AndroidDiagnosticEventRepository.flush$lambda$3(this.f67772b, listC0);
                }
            });
            eg.i.d(this.coroutineScope, null, null, new AnonymousClass2(listC0, null), 3, null);
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    @NotNull
    public SharedFlow getDiagnosticEvents() {
        return this.diagnosticEvents;
    }
}
