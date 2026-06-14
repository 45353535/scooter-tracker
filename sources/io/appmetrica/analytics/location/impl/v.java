package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class v implements LastKnownLocationExtractorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f78734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78735c;

    public v(@NotNull String str, @NotNull s sVar, @NotNull String str2) {
        this.f78733a = str;
        this.f78734b = sVar;
        this.f78735c = str2;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final u getExtractor(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor iHandlerExecutor, @NotNull LocationListener locationListener) {
        return new u(context, this.f78734b.a(permissionExtractor), locationListener, this.f78733a);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    @NotNull
    public final String getIdentifier() {
        return this.f78735c;
    }
}
