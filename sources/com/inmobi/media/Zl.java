package com.inmobi.media;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class Zl extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3941om f38131a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zl(C3941om c3941om, Continuation continuation) {
        super(2, continuation);
        this.f38131a = c3941om;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Zl(this.f38131a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Zl(this.f38131a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        ViewGroup viewGroup = this.f38131a.f39223j;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(null);
        }
        return Unit.f93236a;
    }
}
