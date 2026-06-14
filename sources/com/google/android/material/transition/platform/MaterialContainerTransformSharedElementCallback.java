package com.google.android.material.transition.platform;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import com.google.android.material.R;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@RequiresApi(21)
public class MaterialContainerTransformSharedElementCallback extends SharedElementCallback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static WeakReference f28541f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Rect f28545d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f28542a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28543b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28544c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ShapeProvider f28546e = new ShapeableViewShapeProvider();

    public interface ShapeProvider {
        @Nullable
        ShapeAppearanceModel provideShape(@NonNull View view);
    }

    public static class ShapeableViewShapeProvider implements ShapeProvider {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.ShapeProvider
        @Nullable
        public ShapeAppearanceModel provideShape(@NonNull View view) {
            if (view instanceof Shapeable) {
                return ((Shapeable) view).getShapeAppearanceModel();
            }
            return null;
        }
    }

    private static Drawable e(Window window) {
        return window.getDecorView().getBackground();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Window window) {
        Drawable drawableE = e(window);
        if (drawableE == null) {
            return;
        }
        drawableE.mutate().setColorFilter(BlendModeColorFilterCompat.createBlendModeColorFilterCompat(0, BlendModeCompat.CLEAR));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Window window) {
        Drawable drawableE = e(window);
        if (drawableE == null) {
            return;
        }
        drawableE.mutate().clearColorFilter();
    }

    private void h(final Window window) {
        Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof MaterialContainerTransform) {
            MaterialContainerTransform materialContainerTransform = (MaterialContainerTransform) sharedElementEnterTransition;
            if (!this.f28544c) {
                window.setSharedElementReenterTransition(null);
            }
            if (this.f28543b) {
                j(window, materialContainerTransform);
                materialContainerTransform.addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.1
                    @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                    public void onTransitionEnd(Transition transition) {
                        MaterialContainerTransformSharedElementCallback.g(window);
                    }

                    @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                    public void onTransitionStart(Transition transition) {
                        MaterialContainerTransformSharedElementCallback.f(window);
                    }
                });
            }
        }
    }

    private void i(final Activity activity, final Window window) {
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof MaterialContainerTransform) {
            MaterialContainerTransform materialContainerTransform = (MaterialContainerTransform) sharedElementReturnTransition;
            materialContainerTransform.setHoldAtEndEnabled(true);
            materialContainerTransform.addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.2
                @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                    View view;
                    if (MaterialContainerTransformSharedElementCallback.f28541f != null && (view = (View) MaterialContainerTransformSharedElementCallback.f28541f.get()) != null) {
                        view.setAlpha(1.0f);
                        WeakReference unused = MaterialContainerTransformSharedElementCallback.f28541f = null;
                    }
                    activity.finish();
                    activity.overridePendingTransition(0, 0);
                }
            });
            if (this.f28543b) {
                j(window, materialContainerTransform);
                materialContainerTransform.addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.3
                    @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                    public void onTransitionStart(Transition transition) {
                        MaterialContainerTransformSharedElementCallback.f(window);
                    }
                });
            }
        }
    }

    private static void j(Window window, MaterialContainerTransform materialContainerTransform) {
        if (materialContainerTransform.getDuration() >= 0) {
            window.setTransitionBackgroundFadeDuration(materialContainerTransform.getDuration());
        }
    }

    @Nullable
    public ShapeProvider getShapeProvider() {
        return this.f28546e;
    }

    public boolean isSharedElementReenterTransitionEnabled() {
        return this.f28544c;
    }

    public boolean isTransparentWindowBackgroundEnabled() {
        return this.f28543b;
    }

    @Override // android.app.SharedElementCallback
    @Nullable
    public Parcelable onCaptureSharedElementSnapshot(@NonNull View view, @NonNull Matrix matrix, @NonNull RectF rectF) {
        f28541f = new WeakReference(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    @Nullable
    public View onCreateSnapshotView(@NonNull Context context, @Nullable Parcelable parcelable) {
        WeakReference weakReference;
        View view;
        ShapeAppearanceModel shapeAppearanceModelProvideShape;
        View viewOnCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (viewOnCreateSnapshotView != null && (weakReference = f28541f) != null && this.f28546e != null && (view = (View) weakReference.get()) != null && (shapeAppearanceModelProvideShape = this.f28546e.provideShape(view)) != null) {
            viewOnCreateSnapshotView.setTag(R.id.mtrl_motion_snapshot_view, shapeAppearanceModelProvideShape);
        }
        return viewOnCreateSnapshotView;
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(@NonNull List<String> list, @NonNull Map<String, View> map) {
        View view;
        Activity activity;
        if (list.isEmpty() || map.isEmpty() || (view = map.get(list.get(0))) == null || (activity = ContextUtils.getActivity(view.getContext())) == null) {
            return;
        }
        Window window = activity.getWindow();
        if (this.f28542a) {
            h(window);
        } else {
            i(activity, window);
        }
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(@NonNull List<String> list, @NonNull List<View> list2, @NonNull List<View> list3) {
        if (!list2.isEmpty()) {
            View view = list2.get(0);
            int i10 = R.id.mtrl_motion_snapshot_view;
            if (view.getTag(i10) instanceof View) {
                list2.get(0).setTag(i10, null);
            }
        }
        if (!this.f28542a && !list2.isEmpty()) {
            this.f28545d = TransitionUtils.j(list2.get(0));
        }
        this.f28542a = false;
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(@NonNull List<String> list, @NonNull List<View> list2, @NonNull List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(R.id.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (this.f28542a || list2.isEmpty() || this.f28545d == null) {
            return;
        }
        View view = list2.get(0);
        view.measure(View.MeasureSpec.makeMeasureSpec(this.f28545d.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f28545d.height(), 1073741824));
        Rect rect = this.f28545d;
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setShapeProvider(@Nullable ShapeProvider shapeProvider) {
        this.f28546e = shapeProvider;
    }

    public void setSharedElementReenterTransitionEnabled(boolean z10) {
        this.f28544c = z10;
    }

    public void setTransparentWindowBackgroundEnabled(boolean z10) {
        this.f28543b = z10;
    }
}
