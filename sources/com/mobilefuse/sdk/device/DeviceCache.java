package com.mobilefuse.sdk.device;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.utils.SharedPreferenceFactoryKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/mobilefuse/sdk/device/DeviceCache;", "", "()V", "MF_SHARED_PREFS_FILE_NAME", "", "<set-?>", "Landroid/content/SharedPreferences;", "defaultAppSharedPrefs", "getDefaultAppSharedPrefs", "()Landroid/content/SharedPreferences;", "mfSharedPrefs", "Lkotlin/Function0;", "getMfSharedPrefs", "()Lkotlin/jvm/functions/Function0;", "initDefaultAppSharedPrefs", "", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class DeviceCache {

    @Nullable
    private static SharedPreferences defaultAppSharedPrefs;

    @NotNull
    public static final DeviceCache INSTANCE = new DeviceCache();
    private static final String MF_SHARED_PREFS_FILE_NAME = "com.mobilefuse.sdk.data";

    @NotNull
    private static final Function0<SharedPreferences> mfSharedPrefs = SharedPreferenceFactoryKt.createLazySharedPrefs(MF_SHARED_PREFS_FILE_NAME);

    private DeviceCache() {
    }

    @Nullable
    public final SharedPreferences getDefaultAppSharedPrefs() {
        return defaultAppSharedPrefs;
    }

    @NotNull
    public final Function0<SharedPreferences> getMfSharedPrefs() {
        return mfSharedPrefs;
    }

    public final void initDefaultAppSharedPrefs() {
        SchedulersKt.safelyRunOnBgThread$default(null, new Function0<Unit>() { // from class: com.mobilefuse.sdk.device.DeviceCache.initDefaultAppSharedPrefs.1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Either errorResult;
                Object value;
                DeviceCache deviceCache = DeviceCache.INSTANCE;
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    errorResult = new SuccessResult(PreferenceManager.getDefaultSharedPreferences(AppLifecycleHelper.getGlobalContext()));
                } catch (Throwable th2) {
                    if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    }
                    errorResult = new ErrorResult(th2);
                }
                if (errorResult instanceof ErrorResult) {
                    value = null;
                } else {
                    if (!(errorResult instanceof SuccessResult)) {
                        throw new m();
                    }
                    value = ((SuccessResult) errorResult).getValue();
                }
                DeviceCache.defaultAppSharedPrefs = (SharedPreferences) value;
            }
        }, 1, null);
    }
}
