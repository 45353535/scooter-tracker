package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3979qa extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4103va f39366a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3979qa(C4103va c4103va, Continuation continuation) {
        super(2, continuation);
        this.f39366a = c4103va;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3979qa(this.f39366a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3979qa(this.f39366a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        pf.b.g();
        kotlin.d.b(obj);
        InterfaceC3878m9 interfaceC3878m9 = this.f39366a.f39766c;
        if (interfaceC3878m9 != null) {
            String str = AbstractC4128wa.f39835a;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            ((C3903n9) interfaceC3878m9).a(str, "destroyVideoPlayer is called");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39366a.f39764a;
        gestureDetectorOnGestureListenerC3635ci.f38350a1 = null;
        C4101v8 c4101v8 = gestureDetectorOnGestureListenerC3635ci.Y0;
        if (c4101v8 != null) {
            c4101v8.a();
        }
        return Unit.f93236a;
    }
}
