package io.sentry.android.core;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class d1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d1 f82398b = new d1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference f82399a;

    private d1() {
    }

    public static d1 c() {
        return f82398b;
    }

    public void a(Activity activity) {
        WeakReference weakReference = this.f82399a;
        if (weakReference == null || weakReference.get() == activity) {
            this.f82399a = null;
        }
    }

    public Activity b() {
        WeakReference weakReference = this.f82399a;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public void d(Activity activity) {
        WeakReference weakReference = this.f82399a;
        if (weakReference == null || weakReference.get() != activity) {
            this.f82399a = new WeakReference(activity);
        }
    }
}
