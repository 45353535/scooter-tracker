package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.ext.SdkExtensions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4371j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4371j0 f43388a = new C4371j0();

    private C4371j0() {
    }

    @SuppressLint({"WrongConstant", "NewApi"})
    public static final int a() {
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        try {
            return SdkExtensions.getExtensionVersion(1000000);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return 0;
        }
    }

    public static /* synthetic */ void b() {
    }

    @SuppressLint({"NewApi"})
    @Nullable
    public static final MeasurementManager a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 30 && a() >= 4) {
            try {
                return androidx.privacysandbox.ads.adservices.measurement.k.a(context.getSystemService(androidx.privacysandbox.ads.adservices.measurement.j.a()));
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
