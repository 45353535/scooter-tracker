package com.appodeal.ads;

import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class g4 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UnifiedAdCallbackClickTrackListener f13340r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener, Continuation continuation) {
        super(2, continuation);
        this.f13340r = unifiedAdCallbackClickTrackListener;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new g4(this.f13340r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new g4(this.f13340r, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener = this.f13340r;
        if (unifiedAdCallbackClickTrackListener != null) {
            unifiedAdCallbackClickTrackListener.onTrackError();
        }
        return Unit.f93236a;
    }
}
