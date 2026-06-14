package com.moloco.sdk.internal.android_context;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f54128a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Context f54129b;

    public final Context a() {
        Context context = f54129b;
        if (context != null) {
            return context;
        }
        Intrinsics.throwUninitializedPropertyAccessException("value");
        return null;
    }

    public final void b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        f54129b = context.getApplicationContext();
    }
}
