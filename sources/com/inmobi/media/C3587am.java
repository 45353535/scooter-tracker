package com.inmobi.media;

import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3587am extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3941om f38218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f38219b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3587am(C3941om c3941om, FrameLayout frameLayout, Continuation continuation) {
        super(2, continuation);
        this.f38218a = c3941om;
        this.f38219b = frameLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3587am(this.f38218a, this.f38219b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3587am(this.f38218a, this.f38219b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        C3903n9 c3903n9 = this.f38218a.f39218e;
        if (c3903n9 != null) {
            c3903n9.a("VideoExperienceManager", "inflate called - adding media player to parent layout");
        }
        AbstractC4116vn.a(this.f38218a.f39223j);
        this.f38219b.addView(this.f38218a.f39223j);
        return Unit.f93236a;
    }
}
