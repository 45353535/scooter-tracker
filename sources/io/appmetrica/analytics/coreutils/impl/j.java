package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f75231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f75232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f75233c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, Intent intent, int i10) {
        super(0);
        this.f75231a = context;
        this.f75232b = intent;
        this.f75233c = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f75231a.getPackageManager().resolveService(this.f75232b, this.f75233c);
    }
}
