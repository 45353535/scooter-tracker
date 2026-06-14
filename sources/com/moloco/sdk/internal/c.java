package com.moloco.sdk.internal;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements com.moloco.sdk.internal.a, LifecycleOwner, SavedStateRegistryOwner {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f54136d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f54137e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LifecycleRegistry f54138b = new LifecycleRegistry(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SavedStateRegistryController f54139c = SavedStateRegistryController.INSTANCE.create(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f54140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f54141c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f54142d;

        public b(View view, c cVar, View view2) {
            this.f54140b = view;
            this.f54141c = cVar;
            this.f54142d = view2;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f54140b.removeOnAttachStateChangeListener(this);
            this.f54141c.f(this.f54142d);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    @Override // com.moloco.sdk.internal.a
    public void a(final View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.moloco.sdk.internal.scheduling.e.a(new Function0() { // from class: com.moloco.sdk.internal.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.a(view, this);
            }
        });
    }

    @Override // com.moloco.sdk.internal.a
    public void c(View view) {
        Object objB;
        Intrinsics.checkNotNullParameter(view, "view");
        View rootView = view.getRootView();
        Intrinsics.checkNotNull(rootView);
        if (e(rootView)) {
            try {
                Result.Companion companion = Result.f93230c;
                this.f54138b.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
                objB = Result.b(Unit.f93236a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "lifecycle pause success " + Result.j(objB), Result.g(objB), false, 8, null);
        }
    }

    @Override // com.moloco.sdk.internal.a
    public void d(View view) {
        Object objB;
        Intrinsics.checkNotNullParameter(view, "view");
        View rootView = view.getRootView();
        Intrinsics.checkNotNull(rootView);
        if (e(rootView)) {
            try {
                Result.Companion companion = Result.f93230c;
                this.f54138b.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                objB = Result.b(Unit.f93236a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            if (Result.j(objB)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "lifecycle resume success", null, false, 12, null);
            }
            Throwable thG = Result.g(objB);
            if (thG != null) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "lifecycle resume failure", thG, false, 8, null);
            }
        }
    }

    public final boolean e(View view) {
        return Intrinsics.areEqual(ViewTreeLifecycleOwner.get(view), this);
    }

    public final void f(View view) {
        View rootView = view.getRootView();
        if (rootView == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "RootView is absent, skipping", null, false, 12, null);
            return;
        }
        if (ViewTreeSavedStateRegistryOwner.get(rootView) == null) {
            ViewTreeSavedStateRegistryOwner.set(rootView, this);
            try {
                Result.Companion companion = Result.f93230c;
                this.f54139c.performRestore(null);
                Result.b(Unit.f93236a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                Result.b(kotlin.d.a(th2));
            }
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "ViewTreeSavedStateRegistryOwner is absent, setting custom one", null, false, 12, null);
        }
        if (ViewTreeLifecycleOwner.get(rootView) == null) {
            ViewTreeLifecycleOwner.set(rootView, this);
            this.f54138b.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
            this.f54138b.handleLifecycleEvent(Lifecycle.Event.ON_START);
            this.f54138b.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "ViewTreeLifecycleOwner is absent, setting custom one", null, false, 12, null);
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.f54138b;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public SavedStateRegistry getSavedStateRegistry() {
        return this.f54139c.getSavedStateRegistry();
    }

    public static final Unit a(View view, c cVar) {
        if (ViewCompat.isAttachedToWindow(view)) {
            cVar.f(view);
        } else {
            view.addOnAttachStateChangeListener(new b(view, cVar, view));
        }
        return Unit.f93236a;
    }

    @Override // com.moloco.sdk.internal.a
    public void b(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        View rootView = view.getRootView();
        if (rootView == null) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "RootView is absent, skipping", null, false, 12, null);
            return;
        }
        if (Intrinsics.areEqual(ViewTreeSavedStateRegistryOwner.get(rootView), this)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "Removing ViewTreeSavedStateRegistryOwner", null, false, 12, null);
            ViewTreeSavedStateRegistryOwner.set(rootView, null);
        }
        if (e(rootView)) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "ViewLifecycleOwner", "Removing ViewTreeLifecycleOwner", null, false, 12, null);
            ViewTreeLifecycleOwner.set(rootView, null);
        }
    }
}
