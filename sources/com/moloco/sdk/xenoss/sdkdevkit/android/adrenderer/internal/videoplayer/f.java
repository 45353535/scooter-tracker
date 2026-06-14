package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.os.Build;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lifecycle f58709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LifecycleEventObserver f58710c;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58711a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f58711a = iArr;
        }
    }

    public f(Lifecycle lifecycle, final Function0 onExoResume, final Function0 onExoPause) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(onExoResume, "onExoResume");
        Intrinsics.checkNotNullParameter(onExoPause, "onExoPause");
        this.f58709b = lifecycle;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                f.j(onExoResume, onExoPause, lifecycleOwner, event);
            }
        };
        this.f58710c = lifecycleEventObserver;
        lifecycle.addObserver(lifecycleEventObserver);
    }

    public static final void j(Function0 function0, Function0 function02, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = a.f58711a[event.ordinal()];
        if (i10 == 1) {
            if (Build.VERSION.SDK_INT > 23) {
                function0.invoke();
            }
        } else if (i10 == 2) {
            if (Build.VERSION.SDK_INT <= 23) {
                function0.invoke();
            }
        } else if (i10 == 3) {
            if (Build.VERSION.SDK_INT <= 23) {
                function02.invoke();
            }
        } else if (i10 == 4 && Build.VERSION.SDK_INT > 23) {
            function02.invoke();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void destroy() {
        this.f58709b.removeObserver(this.f58710c);
    }
}
