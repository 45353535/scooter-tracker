package yads;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

/* JADX INFO: loaded from: classes4.dex */
public final class au0 extends Lifecycle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lifecycle.State f108820a = Lifecycle.State.STARTED;

    @Override // androidx.lifecycle.Lifecycle
    public final void addObserver(LifecycleObserver lifecycleObserver) {
    }

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State getCurrentState() {
        return this.f108820a;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void removeObserver(LifecycleObserver lifecycleObserver) {
    }
}
