package com.moloco.sdk.acm.services;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import eg.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/moloco/sdk/acm/services/ApplicationLifecycleObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/moloco/sdk/acm/eventprocessing/b;", "dbWorkRequest", "Lkotlinx/coroutines/CoroutineScope;", "scope", "<init>", "(Lcom/moloco/sdk/acm/eventprocessing/b;Lkotlinx/coroutines/CoroutineScope;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "", "onStop", "(Landroidx/lifecycle/LifecycleOwner;)V", "b", "Lcom/moloco/sdk/acm/eventprocessing/b;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lkotlinx/coroutines/CoroutineScope;", "moloco-android-client-metrics_release"}, k = 1, mv = {2, 0, 0})
public final class ApplicationLifecycleObserver implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final com.moloco.sdk.acm.eventprocessing.b dbWorkRequest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final CoroutineScope scope;

    public static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54096r;

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
            return ApplicationLifecycleObserver.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f54096r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            ApplicationLifecycleObserver.this.dbWorkRequest.a();
            return Unit.f93236a;
        }
    }

    public ApplicationLifecycleObserver(com.moloco.sdk.acm.eventprocessing.b dbWorkRequest, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(dbWorkRequest, "dbWorkRequest");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.dbWorkRequest = dbWorkRequest;
        this.scope = scope;
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
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        androidx.lifecycle.c.e(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        androidx.lifecycle.c.f(this, owner);
        d.f(d.f54105a, "ApplicationLifecycleObserver", "Application onStop", false, 4, null);
        i.d(this.scope, null, null, new a(null), 3, null);
    }
}
