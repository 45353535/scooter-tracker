package y;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends Lifecycle {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f108243b = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final LifecycleOwner f108244c = new LifecycleOwner() { // from class: y.f
        @Override // androidx.lifecycle.LifecycleOwner
        public final Lifecycle getLifecycle() {
            return g.b();
        }
    };

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Lifecycle b() {
        return f108243b;
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(LifecycleObserver lifecycleObserver) {
        if (!(lifecycleObserver instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((lifecycleObserver + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) lifecycleObserver;
        LifecycleOwner lifecycleOwner = f108244c;
        defaultLifecycleObserver.onCreate(lifecycleOwner);
        defaultLifecycleObserver.onStart(lifecycleOwner);
        defaultLifecycleObserver.onResume(lifecycleOwner);
    }

    @Override // androidx.lifecycle.Lifecycle
    public Lifecycle.State getCurrentState() {
        return Lifecycle.State.RESUMED;
    }

    public String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(LifecycleObserver lifecycleObserver) {
    }
}
