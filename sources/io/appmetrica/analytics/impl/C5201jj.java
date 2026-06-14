package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment;
import io.appmetrica.analytics.coreapi.internal.model.SdkInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5201jj implements SdkEnvironmentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f77532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pb f77533b = new Pb();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f77534c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SdkEnvironment f77535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f77536e;

    public C5201jj(@NotNull Context context) {
        this.f77532a = context;
        this.f77535d = new SdkEnvironment(new AppVersionInfo(PackageManagerUtils.getAppVersionName(context), PackageManagerUtils.getAppVersionCodeString(context)), FrameworkDetector.framework(), new ScreenInfo(0, 0, 0, 0.0f), new SdkInfo("7.13.0", "50142752", AbstractC5227kj.a()), "phone", Pb.a(context.getResources().getConfiguration()));
    }

    public final synchronized void a(@Nullable ScreenInfo screenInfo) {
        float f10;
        if (screenInfo != null) {
            try {
                if (!Intrinsics.areEqual(screenInfo, getSdkEnvironment().getScreenInfo())) {
                    String str = this.f77536e;
                    if (str == null) {
                        Context context = this.f77532a;
                        Point point = new Point(screenInfo.getWidth(), screenInfo.getHeight());
                        SafePackageManager safePackageManager = T7.f76489a;
                        try {
                            f10 = context.getResources().getDisplayMetrics().density;
                        } catch (Throwable unused) {
                            f10 = 0.0f;
                        }
                        if (Float.isNaN(f10) || f10 == 0.0f) {
                            str = "phone";
                        } else {
                            int i10 = point.x;
                            int i11 = point.y;
                            if (T7.a(context)) {
                                str = "tv";
                            } else {
                                float f11 = 160 * f10;
                                float f12 = i10;
                                float f13 = f12 / f11;
                                float f14 = i11;
                                float f15 = f14 / f11;
                                str = (Math.sqrt((double) ((f15 * f15) + (f13 * f13))) >= ((double) 7) || kotlin.ranges.g.i(f12 / f10, f14 / f10) >= ((float) 600)) ? "tablet" : "phone";
                            }
                        }
                    }
                    this.f77535d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, screenInfo, null, str, null, 43, null);
                    Iterator it = this.f77534c.iterator();
                    while (it.hasNext()) {
                        ((AbstractC5488v5) ((InterfaceC5175ij) it.next())).d();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(@NotNull InterfaceC5175ij interfaceC5175ij) {
        this.f77534c.remove(interfaceC5175ij);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider
    @NotNull
    public final SdkEnvironment getSdkEnvironment() {
        SdkEnvironment sdkEnvironment = this.f77535d;
        if (sdkEnvironment != null) {
            return sdkEnvironment;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sdkEnvironment");
        return null;
    }

    public final synchronized void a(@Nullable String str) {
        if (str != null) {
            if (!Intrinsics.areEqual(str, this.f77536e)) {
                this.f77536e = str;
                if (!Intrinsics.areEqual(str, getSdkEnvironment().getDeviceType())) {
                    this.f77535d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, str, null, 47, null);
                    Iterator it = this.f77534c.iterator();
                    while (it.hasNext()) {
                        ((AbstractC5488v5) ((InterfaceC5175ij) it.next())).d();
                    }
                }
            }
        }
    }

    public final synchronized void a(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            try {
                str = getSdkEnvironment().getAppVersionInfo().getAppVersionName();
            } finally {
            }
        }
        if (str2 == null) {
            str2 = getSdkEnvironment().getAppVersionInfo().getAppBuildNumber();
        }
        AppVersionInfo appVersionInfo = getSdkEnvironment().getAppVersionInfo();
        if (!Intrinsics.areEqual(appVersionInfo.getAppVersionName(), str) || !Intrinsics.areEqual(appVersionInfo.getAppBuildNumber(), str2)) {
            this.f77535d = SdkEnvironment.copy$default(getSdkEnvironment(), new AppVersionInfo(str, str2), null, null, null, null, null, 62, null);
            Iterator it = this.f77534c.iterator();
            while (it.hasNext()) {
                ((AbstractC5488v5) ((InterfaceC5175ij) it.next())).d();
            }
        }
    }

    public final synchronized void a(@NotNull Configuration configuration) {
        this.f77533b.getClass();
        List listA = Pb.a(configuration);
        if (!Intrinsics.areEqual(getSdkEnvironment().getLocales(), listA)) {
            this.f77535d = SdkEnvironment.copy$default(getSdkEnvironment(), null, null, null, null, null, listA, 31, null);
            Iterator it = this.f77534c.iterator();
            while (it.hasNext()) {
                ((AbstractC5488v5) ((InterfaceC5175ij) it.next())).d();
            }
        }
    }

    public final void a(@NotNull InterfaceC5175ij interfaceC5175ij) {
        this.f77534c.add(interfaceC5175ij);
    }
}
