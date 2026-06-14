package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SafePackageManager f75214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f75215b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SafePackageManager safePackageManager, Context context) {
        super(0);
        this.f75214a = safePackageManager;
        this.f75215b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SafePackageManager safePackageManager = this.f75214a;
        Context context = this.f75215b;
        ApplicationInfo applicationInfo = safePackageManager.getApplicationInfo(context, context.getPackageName(), 128);
        if (applicationInfo != null) {
            return applicationInfo.metaData;
        }
        return null;
    }
}
