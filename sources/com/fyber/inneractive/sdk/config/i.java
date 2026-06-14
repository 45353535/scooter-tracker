package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f20408b;

    public i(Context context, Context context2) {
        h hVar = new h(this);
        this.f20407a = context2;
        if (context instanceof Activity) {
            this.f20408b = new WeakReference(context);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(hVar);
        }
    }

    public final Context a() {
        Context context = (Context) com.fyber.inneractive.sdk.util.v.a(this.f20408b);
        return context != null ? context : this.f20407a;
    }
}
