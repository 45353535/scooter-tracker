package com.chartboost.sdk.internal.interruption;

import android.app.Application;
import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.media3.exoplayer.g;
import com.chartboost.sdk.internal.interruption.a;
import com.ironsource.C4240b4;
import eg.i;
import eg.o0;
import f1.d8;
import f1.eg;
import f1.f7;
import f1.k7;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class InterruptionController implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Context f17971h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static AudioManager f17972i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static AudioFocusRequest f17973j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterruptionController f17965b = new InterruptionController();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f17966c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f17967d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f17968e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f17969f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f17970g = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static k7 f17974k = new k7(0, 1, null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/internal/interruption/InterruptionController$AppProcessLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "()V", C4240b4.i.f42655u0, "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStart", "onStop", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AppProcessLifecycleObserver implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AppProcessLifecycleObserver f17975b = new AppProcessLifecycleObserver();

        private AppProcessLifecycleObserver() {
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
        public void onResume(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            synchronized (InterruptionController.f17966c) {
                try {
                    Set set = InterruptionController.f17967d;
                    a.C0307a c0307a = com.chartboost.sdk.internal.interruption.a.f17985b;
                    if (!set.contains(c0307a.a()) && InterruptionController.f17967d.contains(c0307a.b())) {
                        InterruptionController.f17965b.l(c0307a.b());
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            InterruptionController.f17965b.l(com.chartboost.sdk.internal.interruption.a.f17985b.a());
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            InterruptionController.f17965b.e(com.chartboost.sdk.internal.interruption.a.f17985b.a());
        }
    }

    public static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f17976r;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f17976r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(AppProcessLifecycleObserver.f17975b);
            eg.m("InterruptionController initialized with ProcessLifecycleOwner.", null, 2, null);
            return Unit.f93236a;
        }
    }

    public static final class b extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f17977r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f17978s;

        public static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f17979f = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(WeakReference it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.get() == null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, Continuation continuation) {
            super(2, continuation);
            this.f17978s = z10;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f17978s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            pf.b.g();
            if (this.f17977r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            Object obj2 = InterruptionController.f17966c;
            boolean z10 = this.f17978s;
            synchronized (obj2) {
                try {
                    CollectionsKt.removeAll(InterruptionController.f17969f, (Function1) a.f17979f);
                    Iterator it = InterruptionController.f17969f.iterator();
                    while (it.hasNext()) {
                        f7 f7Var = (f7) ((WeakReference) it.next()).get();
                        if (f7Var != null) {
                            f7Var.b(z10);
                        }
                    }
                    eg.m((z10 ? "Ducking" : "Restoring") + " ad audio volume", null, 2, null);
                    unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return unit;
        }
    }

    public static final class c extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f17980r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Set f17981s;

        public static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f17982f = new a();

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(WeakReference it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.get() == null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Set set, Continuation continuation) {
            super(2, continuation);
            this.f17981s = set;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f17981s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            pf.b.g();
            if (this.f17980r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            Object obj2 = InterruptionController.f17966c;
            Set set = this.f17981s;
            synchronized (obj2) {
                try {
                    CollectionsKt.removeAll(InterruptionController.f17968e, (Function1) a.f17982f);
                    Iterator it = InterruptionController.f17968e.iterator();
                    while (it.hasNext()) {
                        d8 d8Var = (d8) ((WeakReference) it.next()).get();
                        if (d8Var != null) {
                            d8Var.a(set);
                        }
                    }
                    unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return unit;
        }
    }

    public static final class d extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f7 f17983f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f7 f7Var) {
            super(1);
            this.f17983f = f7Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.get() == null || it.get() == this.f17983f);
        }
    }

    public static final class e extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d8 f17984f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d8 d8Var) {
            super(1);
            this.f17984f = d8Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.get() == null || it.get() == this.f17984f);
        }
    }

    public static /* synthetic */ void c(InterruptionController interruptionController, Application application, k7 k7Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            k7Var = new k7(0, 1, null);
        }
        interruptionController.b(application, k7Var);
    }

    public final void a() {
        AudioManager audioManager = f17972i;
        if (audioManager == null) {
            eg.j("AudioManager is null, cannot abandon audio focus.", null, 2, null);
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            eg.m("Abandoning audio focus (API < 26).", null, 2, null);
            audioManager.abandonAudioFocus(this);
            return;
        }
        AudioFocusRequest audioFocusRequest = f17973j;
        if (audioFocusRequest != null) {
            eg.m("Abandoning audio focus (API 26+).", null, 2, null);
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
        f17973j = null;
    }

    public final void b(Application application, k7 config) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(config, "config");
        Context applicationContext = application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        f17971h = applicationContext;
        f17974k = config;
        if (applicationContext == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appContext");
            applicationContext = null;
        }
        Object systemService = applicationContext.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager == null) {
            eg.j("Failed to get AudioManager. Audio focus handling will be disabled.", null, 2, null);
            audioManager = null;
        }
        f17972i = audioManager;
        i.d(kotlinx.coroutines.i.a(o0.c()), null, null, new a(null), 3, null);
    }

    public final void e(com.chartboost.sdk.internal.interruption.a aVar) {
        boolean z10;
        synchronized (f17966c) {
            Set set = f17967d;
            z10 = set.isEmpty() || set.add(aVar);
            Unit unit = Unit.f93236a;
        }
        if (z10) {
            eg.m("Ad interruption began: " + aVar, null, 2, null);
            t();
        }
    }

    public final void f(f7 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (f17966c) {
            f17969f.add(new WeakReference(listener));
        }
    }

    public final void g(d8 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (f17966c) {
            f17968e.add(new WeakReference(listener));
        }
    }

    public final void h(boolean z10) {
        i.d(kotlinx.coroutines.i.a(o0.c()), null, null, new b(z10, null), 3, null);
    }

    public final void l(com.chartboost.sdk.internal.interruption.a aVar) {
        boolean zRemove;
        synchronized (f17966c) {
            zRemove = f17967d.remove(aVar);
            Unit unit = Unit.f93236a;
        }
        if (zRemove) {
            eg.m("Ad interruption ended: " + aVar, null, 2, null);
            t();
        }
    }

    public final void m(f7 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (f17966c) {
            CollectionsKt.removeAll(f17969f, (Function1) new d(listener));
        }
    }

    public final void n(d8 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (f17966c) {
            CollectionsKt.removeAll(f17968e, (Function1) new e(listener));
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i10) {
        if (i10 == -3) {
            h(true);
            return;
        }
        if (i10 == -2 || i10 == -1) {
            e(com.chartboost.sdk.internal.interruption.a.f17985b.b());
        } else {
            if (i10 != 1) {
                return;
            }
            h(false);
            l(com.chartboost.sdk.internal.interruption.a.f17985b.b());
        }
    }

    public final Set s() {
        Set set;
        synchronized (f17966c) {
            set = CollectionsKt.toSet(f17967d);
        }
        return set;
    }

    public final void t() {
        i.d(kotlinx.coroutines.i.a(o0.c()), null, null, new c(s(), null), 3, null);
    }

    public final int u() {
        int iRequestAudioFocus;
        Unit unit;
        AudioManager audioManager = f17972i;
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                androidx.media3.exoplayer.i.a();
                AudioFocusRequest audioFocusRequestBuild = g.a(f17974k.a()).setOnAudioFocusChangeListener(this).setWillPauseWhenDucked(true).build();
                f17973j = audioFocusRequestBuild;
                iRequestAudioFocus = audioManager.requestAudioFocus(audioFocusRequestBuild);
            } else {
                iRequestAudioFocus = audioManager.requestAudioFocus(this, 3, f17974k.a());
            }
            if (iRequestAudioFocus == 0) {
                eg.j("Audio focus request FAILED.", null, 2, null);
            } else if (iRequestAudioFocus == 1) {
                eg.m("Audio focus request GRANTED.", null, 2, null);
            } else if (iRequestAudioFocus != 2) {
                eg.p("Audio focus request returned unknown result: " + iRequestAudioFocus, null, 2, null);
            } else {
                eg.m("Audio focus request DELAYED.", null, 2, null);
            }
            unit = Unit.f93236a;
        } else {
            iRequestAudioFocus = 0;
            unit = null;
        }
        if (unit == null) {
            eg.j("AudioManager is null, cannot request audio focus.", null, 2, null);
        }
        return iRequestAudioFocus;
    }
}
