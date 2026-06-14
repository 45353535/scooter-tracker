package com.appodeal.ads;

import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class c4 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UnifiedAdCallbackClickTrackListener f13161r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ JSONObject f13162s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener, JSONObject jSONObject, Continuation continuation) {
        super(2, continuation);
        this.f13161r = unifiedAdCallbackClickTrackListener;
        this.f13162s = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c4(this.f13161r, this.f13162s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c4(this.f13161r, this.f13162s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener = this.f13161r;
        if (unifiedAdCallbackClickTrackListener != null) {
            unifiedAdCallbackClickTrackListener.onTrackSuccess(this.f13162s);
        }
        return Unit.f93236a;
    }
}
