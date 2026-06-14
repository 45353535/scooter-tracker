package com.unity3d.ads.core.domain;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import eg.i;
import gg.t;
import gg.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;", "", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidGetLifecycleFlow {

    @NotNull
    private final Context applicationContext;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgg/v;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "", "<anonymous>", "(Lgg/v;)V"}, k = 3, mv = {1, 8, 0})
    @e(c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2", f = "AndroidGetLifecycleFlow.kt", l = {64}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<v, Continuation, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass2 anonymousClass2 = AndroidGetLifecycleFlow.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull v vVar, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(vVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Application$ActivityLifecycleCallbacks, com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1] */
        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                final v vVar = (v) this.L$0;
                final ?? r12 = new Application.ActivityLifecycleCallbacks() { // from class: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        v vVar2 = vVar;
                        i.d(vVar2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityCreated$1(vVar2, activity, bundle, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(@NotNull Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        v vVar2 = vVar;
                        i.d(vVar2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1(vVar2, activity, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPaused(@NotNull Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        v vVar2 = vVar;
                        i.d(vVar2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityPaused$1(vVar2, activity, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityResumed(@NotNull Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        v vVar2 = vVar;
                        i.d(vVar2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityResumed$1(vVar2, activity, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        Intrinsics.checkNotNullParameter(bundle, "bundle");
                        v vVar2 = vVar;
                        i.d(vVar2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivitySaveInstanceState$1(vVar2, activity, bundle, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(@NotNull Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        v vVar2 = vVar;
                        i.d(vVar2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStarted$1(vVar2, activity, null), 3, null);
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStopped(@NotNull Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        v vVar2 = vVar;
                        i.d(vVar2, null, null, new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityStopped$1(vVar2, activity, null), 3, null);
                    }
                };
                ((Application) AndroidGetLifecycleFlow.this.applicationContext).registerActivityLifecycleCallbacks(r12);
                final AndroidGetLifecycleFlow androidGetLifecycleFlow = AndroidGetLifecycleFlow.this;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: com.unity3d.ads.core.domain.AndroidGetLifecycleFlow.invoke.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ((Application) androidGetLifecycleFlow.applicationContext).unregisterActivityLifecycleCallbacks(r12);
                    }
                };
                this.label = 1;
                if (t.b(vVar, function0, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    public AndroidGetLifecycleFlow(@NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    @NotNull
    public final Flow invoke() {
        if (this.applicationContext instanceof Application) {
            return hg.i.j(new AnonymousClass2(null));
        }
        throw new IllegalArgumentException("Application context is required");
    }
}
