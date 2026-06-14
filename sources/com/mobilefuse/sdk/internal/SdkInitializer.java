package com.mobilefuse.sdk.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.MobileFuseSettings;
import com.mobilefuse.sdk.MobileFuseTargetingData;
import com.mobilefuse.sdk.SensorService;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.identity.DeviceIpService;
import com.mobilefuse.sdk.identity.EidServiceKt;
import com.mobilefuse.sdk.omid.OmidService;
import com.mobilefuse.sdk.service.MobileFuseService;
import com.mobilefuse.sdk.service.MobileFuseServices;
import com.mobilefuse.sdk.service.impl.AdvertisingIdService;
import com.mobilefuse.sdk.service.impl.DeviceCacheService;
import com.mobilefuse.sdk.service.impl.ExceptionHandlerSampleRateUpdateService;
import com.mobilefuse.sdk.service.impl.UserAgentService;
import com.mobilefuse.sdk.service.impl.ifv.AppSetIdService;
import com.mobilefuse.sdk.telemetry.Telemetry;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/mobilefuse/sdk/internal/SdkInitializer;", "", "()V", "isInitialized", "", "ensureSdkSetup", "", "allowMfServicesAutoInit", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final class SdkInitializer {

    @NotNull
    public static final SdkInitializer INSTANCE = new SdkInitializer();
    private static boolean isInitialized;

    private SdkInitializer() {
    }

    public static final void ensureSdkSetup(boolean allowMfServicesAutoInit) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (isInitialized) {
                return;
            }
            isInitialized = true;
            Context globalContext = AppLifecycleHelper.getGlobalContext();
            Telemetry.INSTANCE.initialize(globalContext, "1.9.3");
            MobileFuseSettings.initSettings();
            Set of2 = SetsKt.setOf((Object[]) new MobileFuseService[]{AdvertisingIdService.INSTANCE, OmidService.INSTANCE, SensorService.INSTANCE, ExceptionHandlerSampleRateUpdateService.INSTANCE, EidServiceKt.getEidService(), DeviceCacheService.INSTANCE, AppSetIdService.INSTANCE, DeviceIpService.INSTANCE});
            MobileFuseServices mobileFuseServices = MobileFuseServices.INSTANCE;
            Set<? extends MobileFuseService> setMutableSetOf = SetsKt.mutableSetOf(UserAgentService.INSTANCE);
            setMutableSetOf.addAll(of2);
            Unit unit = Unit.f93236a;
            mobileFuseServices.registerServices$mobilefuse_sdk_core_release(setMutableSetOf);
            ApplicationInfo applicationInfo = globalContext.getPackageManager().getApplicationInfo(globalContext.getPackageName(), 128);
            Bundle bundle = applicationInfo != null ? applicationInfo.metaData : null;
            if (bundle != null ? bundle.getBoolean("com.mobilefuse.sdk.disable_user_location") : false) {
                MobileFuseTargetingData.INSTANCE.setAllowLocation(false);
            }
            if (bundle != null && bundle.containsKey("com.mobilefuse.sdk.enable_eids")) {
                EidServiceKt.getEidService().setManagedModeEnabled(bundle.getBoolean("com.mobilefuse.sdk.enable_eids"));
            }
            if (allowMfServicesAutoInit) {
                if (bundle != null ? bundle.getBoolean("com.mobilefuse.sdk.disable_auto_init") : false) {
                    return;
                }
                MobileFuseServices.requireServices(of2, new Function0<Unit>() { // from class: com.mobilefuse.sdk.internal.SdkInitializer$ensureSdkSetup$1$2
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
        } catch (Throwable th2) {
            int i10 = SdkInitializer$ensureSdkSetup$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    public static /* synthetic */ void ensureSdkSetup$default(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        ensureSdkSetup(z10);
    }
}
