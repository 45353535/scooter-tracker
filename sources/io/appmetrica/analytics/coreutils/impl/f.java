package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f75221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f75222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f75223c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, ComponentName componentName, int i10) {
        super(0);
        this.f75221a = context;
        this.f75222b = componentName;
        this.f75223c = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f75221a.getPackageManager().getServiceInfo(this.f75222b, this.f75223c);
    }
}
