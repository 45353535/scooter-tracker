package com.appodeal.ads.utils.session;

import com.appodeal.ads.modules.common.internal.context.ActivityProvider;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f15058r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ActivityProvider.State f15059s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ActivityProvider.State state, Continuation continuation) {
        super(2, continuation);
        this.f15058r = dVar;
        this.f15059s = state;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f15058r, this.f15059s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c(this.f15058r, this.f15059s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        Set set = (Set) this.f15058r.f15062a.getValue();
        ActivityProvider.State state = this.f15059s;
        if (state instanceof ActivityProvider.State.Destroyed) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((ActivityProvider.LifecycleCallback) it.next()).onActivityDestroyed(((ActivityProvider.State.Destroyed) state).getActivity().get());
            }
        } else if (state instanceof ActivityProvider.State.Paused) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                ((ActivityProvider.LifecycleCallback) it2.next()).onActivityPaused(((ActivityProvider.State.Paused) state).getActivity().get());
            }
        } else if (state instanceof ActivityProvider.State.Resumed) {
            Iterator it3 = set.iterator();
            while (it3.hasNext()) {
                ((ActivityProvider.LifecycleCallback) it3.next()).onActivityResumed(((ActivityProvider.State.Resumed) state).getActivity().get());
            }
        } else {
            if (!(state instanceof ActivityProvider.State.ConfigurationChanged)) {
                throw new lf.m();
            }
            Iterator it4 = set.iterator();
            while (it4.hasNext()) {
                ((ActivityProvider.LifecycleCallback) it4.next()).onAppConfigurationChanged(((ActivityProvider.State.ConfigurationChanged) state).getNewConfig());
            }
        }
        return Unit.f93236a;
    }
}
