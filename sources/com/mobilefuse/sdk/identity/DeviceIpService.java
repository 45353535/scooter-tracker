package com.mobilefuse.sdk.identity;

import androidx.annotation.VisibleForTesting;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.MobileFuseSettings;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.core.BuildConfig;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.network.client.HttpError;
import com.mobilefuse.sdk.network.client.HttpFlowKt;
import com.mobilefuse.sdk.network.client.HttpResponse;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import com.mobilefuse.sdk.service.MobileFuseService;
import com.mobilefuse.sdk.service.MobileFuseServices_LogsKt;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\r\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0002\b\nJ'\u0010\u000b\u001a\u00020\b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\rH\u0010¢\u0006\u0002\b\u000fJ\u001f\u0010\u0010\u001a\u00020\b2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0012H\u0001¢\u0006\u0002\b\u0013J\u0016\u0010\u0014\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\u001f\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170\u001a0\u0019H\u0000¢\u0006\u0002\b\u001cJ\b\u0010\u001d\u001a\u00020\bH\u0014J\b\u0010\u001e\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/mobilefuse/sdk/identity/DeviceIpService;", "Lcom/mobilefuse/sdk/service/MobileFuseService;", "()V", "JOB_TIME_TO_GET_IP", "", "timer", "Ljava/util/Timer;", "cancelTimer", "", "createScheduleTimer", "createScheduleTimer$mobilefuse_sdk_core_release", "initServiceImpl", "completeAction", "Lkotlin/Function2;", "", "initServiceImpl$mobilefuse_sdk_core_release", "obtainDeviceIp", "callback", "Lkotlin/Function0;", "obtainDeviceIp$mobilefuse_sdk_core_release", "onIpObtained", "networkResponse", "Lcom/mobilefuse/sdk/exception/SuccessResult;", "Lcom/mobilefuse/sdk/network/client/HttpResponse;", "performRequest", "Lcom/mobilefuse/sdk/rx/Flow;", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/network/client/HttpError;", "performRequest$mobilefuse_sdk_core_release", "resetImpl", "scheduleIpTimer", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class DeviceIpService extends MobileFuseService {

    @NotNull
    public static final DeviceIpService INSTANCE = new DeviceIpService();
    public static final long JOB_TIME_TO_GET_IP = 300000;
    private static Timer timer;

    private DeviceIpService() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTimer() {
        Timer timer2 = timer;
        if (timer2 != null) {
            timer2.cancel();
        }
        timer = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void obtainDeviceIp$mobilefuse_sdk_core_release$default(DeviceIpService deviceIpService, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = null;
        }
        deviceIpService.obtainDeviceIp$mobilefuse_sdk_core_release(function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onIpObtained(SuccessResult<HttpResponse> networkResponse) {
        String string = StringsKt.v1(networkResponse.getValue().getBody()).toString();
        if (string.length() <= 0 || StringsKt.y0(string)) {
            return;
        }
        MobileFuseSettings.INSTANCE.setDeviceIp$mobilefuse_sdk_core_release(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleIpTimer() {
        createScheduleTimer$mobilefuse_sdk_core_release();
        AppLifecycleHelper.addActivityLifecycleObserver(new AppLifecycleHelper.ActivityLifecycleObserver() { // from class: com.mobilefuse.sdk.identity.DeviceIpService$scheduleIpTimer$activityLifecycleObserver$1
            @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
            public void onApplicationInBackground() {
                DeviceIpService.INSTANCE.cancelTimer();
            }

            @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
            public void onApplicationInForeground() {
                DeviceIpService deviceIpService = DeviceIpService.INSTANCE;
                DeviceIpService.obtainDeviceIp$mobilefuse_sdk_core_release$default(deviceIpService, null, 1, null);
                deviceIpService.createScheduleTimer$mobilefuse_sdk_core_release();
            }
        });
    }

    @VisibleForTesting
    public final void createScheduleTimer$mobilefuse_sdk_core_release() {
        if (timer != null) {
            return;
        }
        Timer timer2 = new Timer();
        timer = timer2;
        timer2.schedule(new TimerTask() { // from class: com.mobilefuse.sdk.identity.DeviceIpService$createScheduleTimer$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                DeviceIpService.INSTANCE.performRequest$mobilefuse_sdk_core_release().collect(new FlowCollector() { // from class: com.mobilefuse.sdk.identity.DeviceIpService$createScheduleTimer$1$run$$inlined$collectResult$1
                    @Override // com.mobilefuse.sdk.rx.FlowCollector
                    public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result instanceof SuccessResult) {
                            Either either = (Either) ((SuccessResult) result).getValue();
                            if (either instanceof SuccessResult) {
                                DeviceIpService.INSTANCE.onIpObtained((SuccessResult) either);
                            } else if (either instanceof ErrorResult) {
                                DebuggingKt.logError$default(this.this$0, "There was an error getting the device IP", null, 2, null);
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
            }
        }, 300000L, 300000L);
    }

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    public void initServiceImpl$mobilefuse_sdk_core_release(@NotNull final Function2<? super MobileFuseService, ? super Boolean, Unit> completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        obtainDeviceIp$mobilefuse_sdk_core_release(new Function0<Unit>() { // from class: com.mobilefuse.sdk.identity.DeviceIpService$initServiceImpl$1
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
                Function2 function2 = completeAction;
                DeviceIpService deviceIpService = DeviceIpService.INSTANCE;
                function2.invoke(deviceIpService, Boolean.TRUE);
                deviceIpService.scheduleIpTimer();
            }
        });
    }

    @VisibleForTesting
    public final void obtainDeviceIp$mobilefuse_sdk_core_release(@Nullable final Function0<Unit> callback) {
        Either errorResult;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            INSTANCE.performRequest$mobilefuse_sdk_core_release().collect(new FlowCollector() { // from class: com.mobilefuse.sdk.identity.DeviceIpService$obtainDeviceIp$$inlined$gracefullyHandleException$lambda$1
                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                    Function0 function0;
                    Intrinsics.checkNotNullParameter(result, "result");
                    if (result instanceof SuccessResult) {
                        Either either = (Either) ((SuccessResult) result).getValue();
                        if (!(either instanceof SuccessResult)) {
                            if (!(either instanceof ErrorResult) || (function0 = callback) == null) {
                                return;
                            }
                            return;
                        }
                        DeviceIpService.INSTANCE.onIpObtained((SuccessResult) either);
                        Function0 function02 = callback;
                        if (function02 != null) {
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
        } catch (Throwable th2) {
            if (DeviceIpService$obtainDeviceIp$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
            MobileFuseServices_LogsKt.logServiceDebug(INSTANCE, "error when getting the device ip");
            if (callback != null) {
                callback.invoke();
            }
        }
    }

    @NotNull
    public final Flow<Either<HttpError, HttpResponse>> performRequest$mobilefuse_sdk_core_release() {
        return HttpFlowKt.requestHttpGet$default(FlowKt.flowSingle(BuildConfig.IP_SERVICE_URL), 0L, null, false, null, 11, null);
    }

    @Override // com.mobilefuse.sdk.service.MobileFuseService
    protected void resetImpl() {
        cancelTimer();
    }
}
