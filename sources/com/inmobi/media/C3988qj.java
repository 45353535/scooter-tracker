package com.inmobi.media;

import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.qj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3988qj extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4137wj f39396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f39397b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3988qj(C4137wj c4137wj, FrameLayout frameLayout, Continuation continuation) {
        super(2, continuation);
        this.f39396a = c4137wj;
        this.f39397b = frameLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3988qj(this.f39396a, this.f39397b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3988qj(this.f39396a, this.f39397b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        C3903n9 c3903n9 = this.f39396a.f39869e;
        if (c3903n9 != null) {
            c3903n9.a("StaticExperienceManager", "inflate called - adding ImageView to parent layout");
        }
        AbstractC4116vn.a(this.f39396a.f39871g);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f39397b.addView(this.f39396a.f39871g, layoutParams);
        return Unit.f93236a;
    }
}
