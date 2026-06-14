package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f75211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f75212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f75213c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, String str, int i10) {
        super(0);
        this.f75211a = context;
        this.f75212b = str;
        this.f75213c = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f75211a.getPackageManager().getApplicationInfo(this.f75212b, this.f75213c);
    }
}
