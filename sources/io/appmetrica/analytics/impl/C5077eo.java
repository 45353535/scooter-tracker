package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.network.UserAgent;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.eo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5077eo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77135a = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "7.13.0", "50142752");

    public final String a() {
        return this.f77135a;
    }
}
