package com.google.firebase.remoteconfig;

import gg.t;
import gg.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgg/v;", "Lcom/google/firebase/remoteconfig/ConfigUpdate;", "", "<anonymous>", "(Lgg/v;)V"}, k = 3, mv = {2, 0, 0})
@kotlin.coroutines.jvm.internal.e(c = "com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1", f = "RemoteConfig.kt", l = {76}, m = "invokeSuspend")
final class RemoteConfigKt$configUpdates$1 extends kotlin.coroutines.jvm.internal.k implements Function2<v, Continuation, Object> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f32987r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private /* synthetic */ Object f32988s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ FirebaseRemoteConfig f32989t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteConfigKt$configUpdates$1(FirebaseRemoteConfig firebaseRemoteConfig, Continuation continuation) {
        super(2, continuation);
        this.f32989t = firebaseRemoteConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(ConfigUpdateListenerRegistration configUpdateListenerRegistration) {
        configUpdateListenerRegistration.remove();
        return Unit.f93236a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        RemoteConfigKt$configUpdates$1 remoteConfigKt$configUpdates$1 = new RemoteConfigKt$configUpdates$1(this.f32989t, continuation);
        remoteConfigKt$configUpdates$1.f32988s = obj;
        return remoteConfigKt$configUpdates$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v vVar, Continuation continuation) {
        return ((RemoteConfigKt$configUpdates$1) create(vVar, continuation)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f32987r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            v vVar = (v) this.f32988s;
            FirebaseRemoteConfig firebaseRemoteConfig = this.f32989t;
            final ConfigUpdateListenerRegistration configUpdateListenerRegistrationAddOnConfigUpdateListener = firebaseRemoteConfig.addOnConfigUpdateListener(new RemoteConfigKt$configUpdates$1$registration$1(firebaseRemoteConfig, vVar));
            Intrinsics.checkNotNullExpressionValue(configUpdateListenerRegistrationAddOnConfigUpdateListener, "addOnConfigUpdateListener(...)");
            Function0 function0 = new Function0() { // from class: com.google.firebase.remoteconfig.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RemoteConfigKt$configUpdates$1.i(configUpdateListenerRegistrationAddOnConfigUpdateListener);
                }
            };
            this.f32987r = 1;
            if (t.b(vVar, function0, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        return Unit.f93236a;
    }
}
