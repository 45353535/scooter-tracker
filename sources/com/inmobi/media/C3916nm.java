package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.C3916nm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3916nm extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3941om f39118a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3916nm(C3941om c3941om, Continuation continuation) {
        super(2, continuation);
        this.f39118a = c3941om;
    }

    public static final void a(C3941om c3941om, View view) {
        P4.a(c3941om.f39217d, c3941om.f39215b, Ol.f37506a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3916nm(this.f39118a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3916nm(this.f39118a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        final C3941om c3941om = this.f39118a;
        ViewGroup viewGroup = c3941om.f39223j;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new View.OnClickListener() { // from class: w3.z9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3916nm.a(c3941om, view);
                }
            });
        }
        return Unit.f93236a;
    }
}
