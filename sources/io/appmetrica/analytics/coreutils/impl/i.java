package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtilsTiramisu;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f75229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f75230b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, String str) {
        super(0);
        this.f75229a = context;
        this.f75230b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PackageManager packageManager = this.f75229a.getPackageManager();
        return AndroidUtils.isApiAchieved(33) ? PackageManagerUtilsTiramisu.INSTANCE.resolveContentProvider(packageManager, this.f75230b) : packageManager.resolveContentProvider(this.f75230b, 128);
    }
}
