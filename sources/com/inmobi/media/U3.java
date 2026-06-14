package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class U3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f37818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3903n9 f37819b;

    public U3(Context context, C3903n9 c3903n9) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f37818a = context;
        this.f37819b = c3903n9;
    }

    public final C3913nj a(C4111vi resource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        resource.getClass();
        return new C3913nj(this.f37818a, this.f37819b);
    }
}
