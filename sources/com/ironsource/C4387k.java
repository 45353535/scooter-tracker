package com.ironsource;

import android.app.Activity;
import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.ironsource.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4387k implements hg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f43431a;

    public C4387k(Activity activity) {
        this.f43431a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.hg
    public void a() {
        Activity activity = this.f43431a.get();
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            activity.getWindow().setFlags(1024, 1024);
            return;
        }
        WindowInsetsController windowInsetsController = activity.getWindow().getDecorView().getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.hide(WindowInsets.Type.statusBars());
        }
    }
}
