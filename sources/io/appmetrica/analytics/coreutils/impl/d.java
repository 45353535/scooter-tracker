package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManagerHelperForR;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f75216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f75217b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str) {
        super(0);
        this.f75216a = context;
        this.f75217b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PackageManager packageManager = this.f75216a.getPackageManager();
        return AndroidUtils.isApiAchieved(30) ? SafePackageManagerHelperForR.extractPackageInstaller(packageManager, this.f75217b) : packageManager.getInstallerPackageName(this.f75217b);
    }
}
