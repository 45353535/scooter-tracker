package com.mobilefuse.sdk.utils;

import android.content.SharedPreferences;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"createLazySharedPrefs", "Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "prefsName", "", "mobilefuse-sdk-common_release"}, k = 2, mv = {1, 4, 3})
public final class SharedPreferenceFactoryKt {
    @NotNull
    public static final Function0<SharedPreferences> createLazySharedPrefs(@NotNull final String prefsName) {
        Intrinsics.checkNotNullParameter(prefsName, "prefsName");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f93280b = null;
        return new Function0<SharedPreferences>() { // from class: com.mobilefuse.sdk.utils.SharedPreferenceFactoryKt.createLazySharedPrefs.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final SharedPreferences invoke() {
                Object errorResult;
                Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                if (((Either) ref$ObjectRef2.f93280b) == null) {
                    ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                    try {
                        errorResult = new SuccessResult(AppLifecycleHelper.getGlobalContext().getSharedPreferences(prefsName, 0));
                    } catch (Throwable th2) {
                        if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                            StabilityHelper.logException("[Automatically caught]", th2);
                        }
                        errorResult = new ErrorResult(th2);
                    }
                    ref$ObjectRef2.f93280b = errorResult;
                }
                Either either = (Either) ref$ObjectRef.f93280b;
                if (either == null || (either instanceof ErrorResult)) {
                    return null;
                }
                if (either instanceof SuccessResult) {
                    return (SharedPreferences) ((SuccessResult) either).getValue();
                }
                throw new m();
            }
        };
    }
}
