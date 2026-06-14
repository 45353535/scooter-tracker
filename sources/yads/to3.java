package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.InitializationListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class to3 implements xz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InitializationListener f116312a;

    public to3(InitializationListener initializationListener) {
        this.f116312a = initializationListener;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof to3) && Intrinsics.areEqual(((to3) obj).f116312a, this.f116312a);
    }

    public final int hashCode() {
        return this.f116312a.hashCode();
    }

    @Override // yads.xz
    public final void onInitializationCompleted() {
        new CallbackStackTraceMarker(new so3(this));
    }
}
