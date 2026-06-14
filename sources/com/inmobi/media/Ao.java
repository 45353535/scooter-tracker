package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.Ao;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class Ao extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f36599c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ao(ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.f36599c = viewGroup;
    }

    public static final Unit a(View view, zo zoVar) {
        view.removeOnAttachStateChangeListener(zoVar);
        return Unit.f93236a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        Ao ao = new Ao(this.f36599c, continuation);
        ao.f36598b = obj;
        return ao;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Ao ao = new Ao(this.f36599c, (Continuation) obj2);
        ao.f36598b = (gg.v) obj;
        return ao.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f36597a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            gg.v vVar = (gg.v) this.f36598b;
            vVar.e(kotlin.coroutines.jvm.internal.b.a(this.f36599c.isAttachedToWindow()));
            final zo zoVar = new zo(vVar);
            this.f36599c.addOnAttachStateChangeListener(zoVar);
            final ViewGroup viewGroup = this.f36599c;
            Function0 function0 = new Function0() { // from class: w3.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Ao.a(viewGroup, zoVar);
                }
            };
            this.f36597a = 1;
            if (gg.t.b(vVar, function0, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        return Unit.f93236a;
    }
}
