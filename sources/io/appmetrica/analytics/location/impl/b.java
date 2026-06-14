package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements LastKnownLocationExtractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f78681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f78682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocationListener f78683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IHandlerExecutor f78684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f78685e = new d();

    public b(@NotNull Context context, @NotNull PermissionResolutionStrategy permissionResolutionStrategy, @NotNull LocationListener locationListener, @NotNull IHandlerExecutor iHandlerExecutor) {
        this.f78681a = context;
        this.f78682b = permissionResolutionStrategy;
        this.f78683c = locationListener;
        this.f78684d = iHandlerExecutor;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    public final void updateLastKnownLocation() {
        IGplLibraryWrapper gplLibraryWrapper;
        if (this.f78682b.hasNecessaryPermissions(this.f78681a)) {
            try {
                d dVar = this.f78685e;
                Context context = this.f78681a;
                LocationListener locationListener = this.f78683c;
                IHandlerExecutor iHandlerExecutor = this.f78684d;
                dVar.getClass();
                if (ReflectionUtils.detectClassExists("com.google.android.gms.location.LocationRequest")) {
                    try {
                        gplLibraryWrapper = new GplLibraryWrapper(context, locationListener, iHandlerExecutor.getLooper(), iHandlerExecutor, TimeUnit.SECONDS.toMillis(1L));
                    } catch (Throwable unused) {
                        gplLibraryWrapper = new a();
                    }
                } else {
                    gplLibraryWrapper = new a();
                }
                gplLibraryWrapper.updateLastKnownLocation();
            } catch (Throwable unused2) {
            }
        }
    }
}
