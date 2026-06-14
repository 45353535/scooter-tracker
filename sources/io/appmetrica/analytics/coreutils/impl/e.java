package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f75218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f75219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f75220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String str, int i10) {
        super(0);
        this.f75218a = context;
        this.f75219b = str;
        this.f75220c = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f75218a.getPackageManager().getPackageInfo(this.f75219b, this.f75220c);
    }
}
