package coil.target;

import a0.b;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import b0.c;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0004¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0018\u0010\u0007R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\f¨\u0006\u001f"}, d2 = {"Lcoil/target/GenericViewTarget;", "Landroid/view/View;", "T", "La0/b;", "Lb0/c;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "Landroid/graphics/drawable/Drawable;", "placeholder", "", "b", "(Landroid/graphics/drawable/Drawable;)V", "error", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "result", "a", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onStart", "(Landroidx/lifecycle/LifecycleOwner;)V", "onStop", "drawable", "g", InneractiveMediationDefs.GENDER_FEMALE, "", "Z", "isStarted", "d", "()Landroid/graphics/drawable/Drawable;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class GenericViewTarget<T extends View> implements b, c, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isStarted;

    @Override // a0.a
    public void a(Drawable result) {
        g(result);
    }

    @Override // a0.a
    public void b(Drawable placeholder) {
        g(placeholder);
    }

    @Override // a0.a
    public void c(Drawable error) {
        g(error);
    }

    public abstract Drawable d();

    public abstract void e(Drawable drawable);

    protected final void f() {
        Object objD = d();
        Animatable animatable = objD instanceof Animatable ? (Animatable) objD : null;
        if (animatable == null) {
            return;
        }
        if (this.isStarted) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    protected final void g(Drawable drawable) {
        Object objD = d();
        Animatable animatable = objD instanceof Animatable ? (Animatable) objD : null;
        if (animatable != null) {
            animatable.stop();
        }
        e(drawable);
        f();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.a(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.b(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.c(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.d(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        this.isStarted = true;
        f();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        this.isStarted = false;
        f();
    }
}
