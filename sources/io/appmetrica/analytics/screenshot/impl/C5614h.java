package io.appmetrica.analytics.screenshot.impl;

import android.os.Bundle;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5614h implements BundleToServiceConfigConverter {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final D fromBundle(@NotNull Bundle bundle) {
        bundle.setClassLoader(D.class.getClassLoader());
        D d10 = (D) bundle.getParcelable("config");
        return d10 == null ? new D(new j0()) : d10;
    }
}
