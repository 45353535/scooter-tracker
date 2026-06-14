package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f75224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f75225b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str) {
        super(0);
        this.f75224a = context;
        this.f75225b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(this.f75224a.getPackageManager().hasSystemFeature(this.f75225b));
    }
}
