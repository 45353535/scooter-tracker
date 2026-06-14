package com.unity3d.ads.core.domain;

import android.app.Activity;
import com.unity3d.ads.core.domain.LifecycleEvent;
import gg.v;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.ads.core.domain.AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1", f = "AndroidGetLifecycleFlow.kt", l = {58}, m = "invokeSuspend")
final class AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ v $$this$channelFlow;
    final /* synthetic */ Activity $activity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1(v vVar, Activity activity, Continuation continuation) {
        super(2, continuation);
        this.$$this$channelFlow = vVar;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1(this.$$this$channelFlow, this.$activity, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            v vVar = this.$$this$channelFlow;
            LifecycleEvent.Destroyed destroyed = new LifecycleEvent.Destroyed(new WeakReference(this.$activity));
            this.label = 1;
            if (vVar.w(destroyed, this) == objG) {
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

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((AndroidGetLifecycleFlow$invoke$2$listener$1$onActivityDestroyed$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
