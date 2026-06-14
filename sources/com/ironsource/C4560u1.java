package com.ironsource;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.ironsource.C4560u1;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4560u1 implements M1 {

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.ironsource.u1$a */
    static final class a implements LifecycleEventObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final InterfaceC4381ja f45536a;

        /* JADX INFO: renamed from: com.ironsource.u1$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0483a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f45537a;

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
                f45537a = iArr;
            }
        }

        public a(@NotNull InterfaceC4381ja listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f45536a = listener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Lifecycle.Event event, a this$0) {
            Intrinsics.checkNotNullParameter(event, "$event");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            int i10 = C0483a.f45537a[event.ordinal()];
            if (i10 == 1) {
                this$0.f45536a.b();
                return;
            }
            if (i10 == 2) {
                this$0.f45536a.c();
            } else if (i10 == 3) {
                this$0.f45536a.d();
            } else {
                if (i10 != 4) {
                    return;
                }
                this$0.f45536a.a();
            }
        }

        public boolean equals(@Nullable Object obj) {
            InterfaceC4381ja interfaceC4381ja = this.f45536a;
            a aVar = obj instanceof a ? (a) obj : null;
            return Intrinsics.areEqual(interfaceC4381ja, aVar != null ? aVar.f45536a : null);
        }

        public int hashCode() {
            return this.f45536a.hashCode();
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(@NotNull LifecycleOwner source, @NotNull final Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.zm
                @Override // java.lang.Runnable
                public final void run() {
                    C4560u1.a.a(event, this);
                }
            }, 0L, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(InterfaceC4381ja observer) {
        Intrinsics.checkNotNullParameter(observer, "$observer");
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(new a(observer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC4381ja observer) {
        Intrinsics.checkNotNullParameter(observer, "$observer");
        ProcessLifecycleOwner.INSTANCE.get().getLifecycle().removeObserver(new a(observer));
    }

    @Override // com.ironsource.M1
    public void a(@NotNull final InterfaceC4381ja observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Adding lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.xm
            @Override // java.lang.Runnable
            public final void run() {
                C4560u1.c(observer);
            }
        }, 0L, 2, null);
    }

    @Override // com.ironsource.M1
    public void b(@NotNull final InterfaceC4381ja observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        IronLog.INTERNAL.verbose("Removing lifecycle event observer");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new Runnable() { // from class: com.ironsource.ym
            @Override // java.lang.Runnable
            public final void run() {
                C4560u1.d(observer);
            }
        }, 0L, 2, null);
    }
}
