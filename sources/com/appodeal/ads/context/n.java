package com.appodeal.ads.context;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f13203b = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f13204a = (j) l.f13200a.getValue();

    public final void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        j jVar = this.f13204a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        jVar.f13198b = new WeakReference(activity);
    }

    public final void b(boolean z10) {
        this.f13204a.b(z10);
    }
}
