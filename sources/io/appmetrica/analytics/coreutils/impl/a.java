package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f75208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f75209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f75210c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, ComponentName componentName, int i10) {
        super(0);
        this.f75208a = context;
        this.f75209b = componentName;
        this.f75210c = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f75208a.getPackageManager().getActivityInfo(this.f75209b, this.f75210c);
    }
}
