package com.mobilefuse.sdk.service;

import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.Utils;
import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.internal.SdkInitializer;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0002J(\u0010\u0018\u001a\u00020\u00192\u001e\u0010\u001a\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c\u0012\u0004\u0012\u00020\u00190\u001bH\u0007J6\u0010\u001f\u001a\u00020\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0!2\u001e\u0010\u001a\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c\u0012\u0004\u0012\u00020\u00190\u001bH\u0007J\u001b\u0010\"\u001a\u00020\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0!H\u0000¢\u0006\u0002\b#J\b\u0010$\u001a\u00020\u0019H\u0007J\u0016\u0010$\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190%H\u0007J$\u0010&\u001a\u00020\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0!2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190%H\u0007J\b\u0010'\u001a\u00020\u0019H\u0007R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR*\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\r8\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/mobilefuse/sdk/service/MobileFuseServices;", "", "()V", "<set-?>", "", "allServicesInitialized", "getAllServicesInitialized", "()Z", "registeredServices", "", "Lcom/mobilefuse/sdk/service/MobileFuseService;", "getRegisteredServices$mobilefuse_sdk_core_release", "()Ljava/util/Set;", "", "sdkDisableReason", "getSdkDisableReason$annotations", "getSdkDisableReason", "()Ljava/lang/String;", "sdkEnabled", "getSdkEnabled$annotations", "getSdkEnabled", "servicesResultMap", "", "deviceMeetsMobileFuseSdkRequirements", "initAllServices", "", "completeAction", "Lkotlin/Function1;", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/service/ServicesInitError;", "Lcom/mobilefuse/sdk/service/ServicesInitResult;", "initServices", "services", "", "registerServices", "registerServices$mobilefuse_sdk_core_release", "requireAllServices", "Lkotlin/Function0;", "requireServices", "resetAllServices", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class MobileFuseServices {
    private static boolean allServicesInitialized;

    @Nullable
    private static String sdkDisableReason;

    @NotNull
    public static final MobileFuseServices INSTANCE = new MobileFuseServices();
    private static boolean sdkEnabled = true;

    @NotNull
    private static final Set<MobileFuseService> registeredServices = new LinkedHashSet();
    private static final Map<MobileFuseService, Boolean> servicesResultMap = new LinkedHashMap();

    /* JADX INFO: renamed from: com.mobilefuse.sdk.service.MobileFuseServices$initServices$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 3})
    static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Function1 $completeAction;
        final /* synthetic */ Set $services;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Set set, Function1 function1) {
            super(0);
            this.$services = set;
            this.$completeAction = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SdkInitializer.ensureSdkSetup(false);
            MobileFuseServices mobileFuseServices = MobileFuseServices.INSTANCE;
            MobileFuseServices_LogsKt.logServiceDebug(mobileFuseServices, "Require services: " + this.$services);
            if (!mobileFuseServices.deviceMeetsMobileFuseSdkRequirements()) {
                DebuggingKt.logError$default(mobileFuseServices, "The MobileFuse SDK has been disabled because: " + MobileFuseServices.getSdkDisableReason(), null, 2, null);
                this.$completeAction.invoke(new ErrorResult(new ServicesInitError("The MobileFuse SDK has been disabled because: " + MobileFuseServices.getSdkDisableReason())));
                return;
            }
            if (mobileFuseServices.getAllServicesInitialized()) {
                MobileFuseServices_LogsKt.logServiceDebug(mobileFuseServices, "All services are initialized. Call the complete action");
                this.$completeAction.invoke(new SuccessResult(new ServicesInitResult(MobileFuseServices.access$getServicesResultMap$p(mobileFuseServices))));
            } else {
                if (MobileFuseServicesKt.getAllInitialized(this.$services)) {
                    MobileFuseServices_LogsKt.logServiceDebug(mobileFuseServices, "Required services are initialized. Call the complete action");
                    this.$completeAction.invoke(new SuccessResult(new ServicesInitResult(MobileFuseServices.access$getServicesResultMap$p(mobileFuseServices))));
                    return;
                }
                final Flow flow = FlowKt.flow(new Function1<FlowCollector<? super Set<? extends MobileFuseService>>, Unit>() { // from class: com.mobilefuse.sdk.service.MobileFuseServices.initServices.1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Set<? extends MobileFuseService>> flowCollector) {
                        invoke2(flowCollector);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull FlowCollector<? super Set<? extends MobileFuseService>> receiver) {
                        Intrinsics.checkNotNullParameter(receiver, "$receiver");
                        receiver.emit(new SuccessResult(AnonymousClass1.this.$services));
                    }
                });
                final Schedulers schedulers = Schedulers.MAIN;
                final Flow flow2 = FlowKt.flow(new Function1<FlowCollector<? super Set<? extends MobileFuseService>>, Unit>() { // from class: com.mobilefuse.sdk.service.MobileFuseServices$initServices$1$$special$$inlined$runOn$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Set<? extends MobileFuseService>> flowCollector) {
                        invoke2(flowCollector);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull final FlowCollector<? super Set<? extends MobileFuseService>> flow3) {
                        Intrinsics.checkNotNullParameter(flow3, "$this$flow");
                        flow.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.service.MobileFuseServices$initServices$1$$special$$inlined$runOn$1.1
                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public final void emit(@NotNull final Either<? extends Throwable, ? extends T> value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                final FlowCollector flowCollector = flow3;
                                SchedulersKt.runOnScheduler(schedulers, new Function0<Unit>() { // from class: com.mobilefuse.sdk.service.MobileFuseServices$initServices$1$$special$.inlined.runOn.1.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                        flowCollector.emit(value);
                                    }
                                });
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
                    }
                });
                final Flow flow3 = FlowKt.flow(new Function1<FlowCollector<? super Map<MobileFuseService, ? extends Boolean>>, Unit>() { // from class: com.mobilefuse.sdk.service.MobileFuseServices$initServices$1$$special$$inlined$transform$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Map<MobileFuseService, ? extends Boolean>> flowCollector) {
                        invoke2(flowCollector);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull final FlowCollector<? super Map<MobileFuseService, ? extends Boolean>> flow4) {
                        Intrinsics.checkNotNullParameter(flow4, "$this$flow");
                        flow2.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.service.MobileFuseServices$initServices$1$$special$$inlined$transform$1.1
                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                if (!(value instanceof SuccessResult)) {
                                    if (value instanceof ErrorResult) {
                                        flow4.emit(value);
                                        return;
                                    }
                                    return;
                                }
                                FlowCollector flowCollector = flow4;
                                Set<MobileFuseService> set = (Set) ((SuccessResult) value).getValue();
                                MobileFuseServices$initServices$1$$special$$inlined$transform$1$1$lambda$1 mobileFuseServices$initServices$1$$special$$inlined$transform$1$1$lambda$1 = new MobileFuseServices$initServices$1$$special$$inlined$transform$1$1$lambda$1(flowCollector, new LinkedHashMap(), set);
                                for (MobileFuseService mobileFuseService : set) {
                                    MobileFuseServices_LogsKt.logServiceDebug(MobileFuseServices.INSTANCE, "Request service to init: " + mobileFuseService);
                                    mobileFuseService.initService(new MobileFuseServices$initServices$1$$special$$inlined$transform$1$1$lambda$2(mobileFuseServices$initServices$1$$special$$inlined$transform$1$1$lambda$1));
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
                    }
                });
                FlowKt.flow(new Function1<FlowCollector<? super Map<MobileFuseService, ? extends Boolean>>, Unit>() { // from class: com.mobilefuse.sdk.service.MobileFuseServices$initServices$1$$special$$inlined$catchElse$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Map<MobileFuseService, ? extends Boolean>> flowCollector) {
                        invoke2(flowCollector);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull final FlowCollector<? super Map<MobileFuseService, ? extends Boolean>> flow4) {
                        Intrinsics.checkNotNullParameter(flow4, "$this$flow");
                        flow3.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.service.MobileFuseServices$initServices$1$$special$$inlined$catchElse$1.1
                            @Override // com.mobilefuse.sdk.rx.FlowCollector
                            public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                FlowCollector flowCollector = flow4;
                                if (!(value instanceof ErrorResult)) {
                                    if (value instanceof SuccessResult) {
                                        flowCollector.emit(value);
                                        return;
                                    }
                                    return;
                                }
                                Throwable th2 = (Throwable) ((ErrorResult) value).getValue();
                                MobileFuseServices mobileFuseServices2 = MobileFuseServices.INSTANCE;
                                MobileFuseServices_LogsKt.logServiceDebug(mobileFuseServices2, "An exception has been caught. Use empty map.");
                                MobileFuseServices_LogsKt.logServiceDebug(mobileFuseServices2, "Exception: " + th2);
                                flowCollector.emit(new SuccessResult(MapsKt.emptyMap()));
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
                    }
                }).collect(new FlowCollector() { // from class: com.mobilefuse.sdk.service.MobileFuseServices$initServices$1$$special$$inlined$collectResult$1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result instanceof SuccessResult) {
                            Map map = (Map) ((SuccessResult) result).getValue();
                            MobileFuseServices mobileFuseServices2 = MobileFuseServices.INSTANCE;
                            MobileFuseServices_LogsKt.logServiceDebug(mobileFuseServices2, "All services completed initialization. Call the complete action");
                            MobileFuseServices.access$getServicesResultMap$p(mobileFuseServices2).putAll(map);
                            if (Intrinsics.areEqual(MobileFuseServices.access$getServicesResultMap$p(mobileFuseServices2).keySet(), mobileFuseServices2.getRegisteredServices$mobilefuse_sdk_core_release()) && !MobileFuseServices.access$getServicesResultMap$p(mobileFuseServices2).values().contains(Boolean.FALSE)) {
                                MobileFuseServices.allServicesInitialized = true;
                            }
                            this.this$0.$completeAction.invoke(new SuccessResult(new ServicesInitResult(map)));
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
            }
        }
    }

    private MobileFuseServices() {
    }

    public static final /* synthetic */ Map access$getServicesResultMap$p(MobileFuseServices mobileFuseServices) {
        return servicesResultMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean deviceMeetsMobileFuseSdkRequirements() {
        Either errorResult;
        Object value;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (!sdkEnabled) {
                return false;
            }
            if (!Utils.isJavaVersionSupported()) {
                sdkDisableReason = "The MobileFuse SDK requires Java 8 or higher.";
                sdkEnabled = false;
            }
            errorResult = new SuccessResult(Boolean.valueOf(sdkEnabled));
        } catch (Throwable th2) {
            if (MobileFuseServices$deviceMeetsMobileFuseSdkRequirements$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
            value = Boolean.FALSE;
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return ((Boolean) value).booleanValue();
    }

    @Nullable
    public static final String getSdkDisableReason() {
        return sdkDisableReason;
    }

    public static /* synthetic */ void getSdkDisableReason$annotations() {
    }

    public static final boolean getSdkEnabled() {
        return sdkEnabled;
    }

    public static /* synthetic */ void getSdkEnabled$annotations() {
    }

    public static final void initAllServices(@NotNull Function1<? super Either<ServicesInitError, ServicesInitResult>, Unit> completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        initServices(registeredServices, completeAction);
    }

    public static final void initServices(@NotNull Set<? extends MobileFuseService> services, @NotNull Function1<? super Either<ServicesInitError, ServicesInitResult>, Unit> completeAction) {
        Intrinsics.checkNotNullParameter(services, "services");
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        SchedulersKt.safelyRunOnMainThread$default(null, new AnonymousClass1(services, completeAction), 1, null);
    }

    public static final void requireAllServices() {
        requireAllServices(new Function0<Unit>() { // from class: com.mobilefuse.sdk.service.MobileFuseServices.requireAllServices.1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }
        });
    }

    public static final void requireServices(@NotNull Set<? extends MobileFuseService> services, @NotNull final Function0<Unit> completeAction) {
        Intrinsics.checkNotNullParameter(services, "services");
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        initServices(services, new Function1<Either<? extends ServicesInitError, ? extends ServicesInitResult>, Unit>() { // from class: com.mobilefuse.sdk.service.MobileFuseServices.requireServices.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Either<? extends ServicesInitError, ? extends ServicesInitResult> either) {
                invoke2((Either<ServicesInitError, ServicesInitResult>) either);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Either<ServicesInitError, ServicesInitResult> result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof SuccessResult) {
                    completeAction.invoke();
                } else {
                    boolean z10 = result instanceof ErrorResult;
                }
            }
        });
    }

    public static final void resetAllServices() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            allServicesInitialized = false;
            sdkEnabled = true;
            sdkDisableReason = null;
            servicesResultMap.clear();
            Iterator<T> it = registeredServices.iterator();
            while (it.hasNext()) {
                ((MobileFuseService) it.next()).reset();
            }
            registeredServices.clear();
        } catch (Throwable th2) {
            int i10 = MobileFuseServices$resetAllServices$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    public final boolean getAllServicesInitialized() {
        return allServicesInitialized;
    }

    @NotNull
    public final Set<MobileFuseService> getRegisteredServices$mobilefuse_sdk_core_release() {
        return registeredServices;
    }

    public final void registerServices$mobilefuse_sdk_core_release(@NotNull Set<? extends MobileFuseService> services) {
        Intrinsics.checkNotNullParameter(services, "services");
        CollectionsKt.addAll(registeredServices, services);
    }

    public static final void requireAllServices(@NotNull final Function0<Unit> completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        initAllServices(new Function1<Either<? extends ServicesInitError, ? extends ServicesInitResult>, Unit>() { // from class: com.mobilefuse.sdk.service.MobileFuseServices.requireAllServices.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Either<? extends ServicesInitError, ? extends ServicesInitResult> either) {
                invoke2((Either<ServicesInitError, ServicesInitResult>) either);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Either<ServicesInitError, ServicesInitResult> result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof SuccessResult) {
                    completeAction.invoke();
                } else {
                    boolean z10 = result instanceof ErrorResult;
                }
            }
        });
    }
}
