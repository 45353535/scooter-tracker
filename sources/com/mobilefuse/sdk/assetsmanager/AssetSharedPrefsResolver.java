package com.mobilefuse.sdk.assetsmanager;

import android.content.SharedPreferences;
import com.ironsource.C4240b4;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.utils.SharedPreferenceFactoryKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J\u0016\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/mobilefuse/sdk/assetsmanager/AssetSharedPrefsResolver;", "", "()V", "PREF_NAME_ASSETS", "", "sharedPrefs", "Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "removeAssetPreference", "", "removeSpecificAsset", "assetName", "resolveAssetsPreferences", C4240b4.i.W, "saveAssetsPreferences", "value", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class AssetSharedPrefsResolver {
    private final String PREF_NAME_ASSETS = "assets_json_preferences";
    private final Function0<SharedPreferences> sharedPrefs = SharedPreferenceFactoryKt.createLazySharedPrefs("assets_json_preferences");

    public final boolean removeAssetPreference() {
        Either errorResult;
        Object value;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorClear;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            SharedPreferences sharedPreferencesInvoke = this.sharedPrefs.invoke();
            errorResult = new SuccessResult(Boolean.valueOf((sharedPreferencesInvoke == null || (editorEdit = sharedPreferencesInvoke.edit()) == null || (editorClear = editorEdit.clear()) == null) ? false : editorClear.commit()));
        } catch (Throwable th2) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
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

    public final boolean removeSpecificAsset(@NotNull String assetName) {
        Either errorResult;
        Object value;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorRemove;
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            SharedPreferences sharedPreferencesInvoke = this.sharedPrefs.invoke();
            errorResult = new SuccessResult(Boolean.valueOf((sharedPreferencesInvoke == null || (editorEdit = sharedPreferencesInvoke.edit()) == null || (editorRemove = editorEdit.remove(assetName)) == null) ? false : editorRemove.commit()));
        } catch (Throwable th2) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
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

    @NotNull
    public final String resolveAssetsPreferences(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            SharedPreferences sharedPreferencesInvoke = this.sharedPrefs.invoke();
            if (sharedPreferencesInvoke != null) {
                String string = sharedPreferencesInvoke.getString(key, null);
                if (string != null) {
                    return string;
                }
            }
            return "";
        } catch (Throwable th2) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            return "";
        }
    }

    @NotNull
    public final Object saveAssetsPreferences(@NotNull String key, @NotNull String value) {
        Either errorResult;
        SharedPreferences.Editor editorEdit;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            SharedPreferences sharedPreferencesInvoke = this.sharedPrefs.invoke();
            if (sharedPreferencesInvoke != null && (editorEdit = sharedPreferencesInvoke.edit()) != null) {
                editorEdit.putString(key, value);
                editorEdit.commit();
            }
            DebuggingKt.logDebug$default(this, "Success saving preferences: key: " + key + " value: " + value, null, 2, null);
            errorResult = new SuccessResult(Unit.f93236a);
        } catch (Throwable th2) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (errorResult instanceof ErrorResult) {
            return Boolean.FALSE;
        }
        if (errorResult instanceof SuccessResult) {
            return ((SuccessResult) errorResult).getValue();
        }
        throw new m();
    }
}
