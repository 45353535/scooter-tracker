package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.pa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3954pa extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4103va f39267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HtmlVideoPlayerRequest f39268b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3954pa(C4103va c4103va, HtmlVideoPlayerRequest htmlVideoPlayerRequest, Continuation continuation) {
        super(2, continuation);
        this.f39267a = c4103va;
        this.f39268b = htmlVideoPlayerRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3954pa(this.f39267a, this.f39268b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3954pa(this.f39267a, this.f39268b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0177  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3954pa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
