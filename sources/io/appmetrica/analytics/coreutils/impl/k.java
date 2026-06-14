package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f75234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f75235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f75236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f75237d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, ComponentName componentName, int i10, int i11) {
        super(0);
        this.f75234a = context;
        this.f75235b = componentName;
        this.f75236c = i10;
        this.f75237d = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f75234a.getPackageManager().setComponentEnabledSetting(this.f75235b, this.f75236c, this.f75237d);
        return Unit.f93236a;
    }
}
