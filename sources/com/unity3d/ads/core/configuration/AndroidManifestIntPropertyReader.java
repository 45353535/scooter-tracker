package com.unity3d.ads.core.configuration;

import android.content.Context;
import android.os.Bundle;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/configuration/AndroidManifestIntPropertyReader;", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "getPropertyByName", "", "propertyName", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidManifestIntPropertyReader {

    @NotNull
    private final Context context;

    public AndroidManifestIntPropertyReader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Nullable
    public final Integer getPropertyByName(@NotNull String propertyName) {
        Bundle bundle;
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        try {
            bundle = this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128).metaData;
            numValueOf = Integer.valueOf(bundle.getInt(propertyName));
        } catch (Exception unused) {
        }
        if (bundle.containsKey(propertyName)) {
            return numValueOf;
        }
        return null;
    }
}
