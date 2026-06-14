package yads;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class q2 implements f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f114851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x9 f114852b;

    public q2(Activity activity, x9 x9Var) {
        this.f114851a = activity;
        this.f114852b = x9Var;
    }

    public final void a(int i10, Bundle bundle) {
        x9 x9Var = this.f114852b;
        if (x9Var != null) {
            x9Var.a(i10, bundle);
        }
    }

    public final void a(int i10) {
        try {
            if (Build.VERSION.SDK_INT != 26) {
                this.f114851a.setRequestedOrientation(i10);
            }
        } catch (Exception unused) {
            boolean z10 = lb1.f113032a;
        }
    }
}
