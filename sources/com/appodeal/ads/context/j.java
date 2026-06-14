package com.appodeal.ads.context;

import android.app.Activity;
import com.appodeal.ads.ext.LogExtKt;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f13197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f13198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13199c;

    public j(o contextProvider) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        this.f13197a = contextProvider;
    }

    public final Activity a() {
        Activity activity;
        WeakReference weakReference = this.f13198b;
        if (weakReference == null || (activity = (Activity) weakReference.get()) == null || activity.isDestroyed() || this.f13199c) {
            activity = null;
        }
        LogExtKt.logInternal$default("AutoOnResumeActivityHolder", "Retrieving provided activity: " + activity, null, 4, null);
        return activity;
    }

    public final void b(boolean z10) {
        LogExtKt.logInternal$default("AutoOnResumeActivityHolder", "SetAutomaticActivityObserving: " + z10, null, 4, null);
        this.f13199c = z10;
        if (z10) {
            return;
        }
        WeakReference weakReference = this.f13198b;
        if ((weakReference != null ? (Activity) weakReference.get() : null) == null) {
            this.f13198b = new WeakReference(this.f13197a.getResumedActivity());
        }
    }
}
