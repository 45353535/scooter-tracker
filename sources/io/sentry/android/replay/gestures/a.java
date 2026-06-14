package io.sentry.android.replay.gestures;

import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import io.sentry.android.replay.e;
import io.sentry.android.replay.util.i;
import io.sentry.android.replay.x;
import io.sentry.g1;
import io.sentry.g7;
import io.sentry.v7;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v7 f83018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f83019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f83020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.sentry.util.a f83021e;

    /* JADX INFO: renamed from: io.sentry.android.replay.gestures.a$a, reason: collision with other inner class name */
    public static final class C1002a extends i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final v7 f83022c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f83023d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1002a(v7 options, c cVar, Window.Callback callback) {
            super(callback);
            Intrinsics.checkNotNullParameter(options, "options");
            this.f83022c = options;
            this.f83023d = cVar;
        }

        @Override // io.sentry.android.replay.util.i, android.view.Window.Callback
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent != null) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                Intrinsics.checkNotNullExpressionValue(motionEventObtainNoHistory, "obtainNoHistory(...)");
                try {
                    c cVar = this.f83023d;
                    if (cVar != null) {
                        cVar.onTouchEvent(motionEventObtainNoHistory);
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f83024f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(1);
            this.f83024f = view;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.areEqual(it.get(), this.f83024f));
        }
    }

    public a(v7 options, c touchRecorderCallback) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(touchRecorderCallback, "touchRecorderCallback");
        this.f83018b = options;
        this.f83019c = touchRecorderCallback;
        this.f83020d = new ArrayList();
        this.f83021e = new io.sentry.util.a();
    }

    private final void a(View view) {
        Window windowA = x.a(view);
        if (windowA == null) {
            this.f83018b.getLogger().c(g7.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
            return;
        }
        Window.Callback callback = windowA.getCallback();
        if (callback instanceof C1002a) {
            return;
        }
        windowA.setCallback(new C1002a(this.f83018b, this.f83019c, callback));
    }

    private final void d(View view) {
        Window windowA = x.a(view);
        if (windowA == null) {
            this.f83018b.getLogger().c(g7.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = windowA.getCallback();
        if (callback instanceof C1002a) {
            windowA.setCallback(((C1002a) callback).f83164b);
        }
    }

    public final void b() throws Exception {
        g1 g1VarD = this.f83021e.d();
        try {
            Iterator it = this.f83020d.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    Intrinsics.checkNotNull(view);
                    d(view);
                }
            }
            this.f83020d.clear();
            Unit unit = Unit.f93236a;
            wf.a.a(g1VarD, null);
        } finally {
        }
    }

    @Override // io.sentry.android.replay.e
    public void c(View root, boolean z10) throws Exception {
        Intrinsics.checkNotNullParameter(root, "root");
        g1 g1VarD = this.f83021e.d();
        try {
            if (z10) {
                this.f83020d.add(new WeakReference(root));
                a(root);
                Unit unit = Unit.f93236a;
            } else {
                d(root);
                CollectionsKt.removeAll((List) this.f83020d, (Function1) new b(root));
            }
            wf.a.a(g1VarD, null);
        } finally {
        }
    }
}
