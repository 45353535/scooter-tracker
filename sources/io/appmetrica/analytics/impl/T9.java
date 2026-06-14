package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* JADX INFO: loaded from: classes12.dex */
public final class T9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f76494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Zm f76495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5056e3 f76496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SafePackageManager f76497d;

    public T9(Context context, Zm zm, C5056e3 c5056e3, SafePackageManager safePackageManager) {
        this.f76494a = context;
        this.f76495b = zm;
        this.f76496c = c5056e3;
        this.f76497d = safePackageManager;
    }

    public T9(Context context) {
        this(context, new Zm(context, "io.appmetrica.analytics.build_id"), new C5056e3(context, "io.appmetrica.analytics.is_offline"), new SafePackageManager());
    }
}
