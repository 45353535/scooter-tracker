package com.inmobi.media;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import com.inmobi.media.Eo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class Eo extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f36816c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eo(ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.f36816c = viewGroup;
    }

    public static final void a(gg.v vVar, int i10) {
        vVar.e(Boolean.valueOf(i10 == 0));
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        Eo eo = new Eo(this.f36816c, continuation);
        eo.f36815b = obj;
        return eo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Eo eo = new Eo(this.f36816c, (Continuation) obj2);
        eo.f36815b = (gg.v) obj;
        return eo.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f36814a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            final gg.v vVar = (gg.v) this.f36815b;
            vVar.e(kotlin.coroutines.jvm.internal.b.a(this.f36816c.getWindowVisibility() == 0));
            ViewTreeObserver.OnWindowVisibilityChangeListener onWindowVisibilityChangeListener = new ViewTreeObserver.OnWindowVisibilityChangeListener() { // from class: w3.e0
                @Override // android.view.ViewTreeObserver.OnWindowVisibilityChangeListener
                public final void onWindowVisibilityChanged(int i11) {
                    Eo.a(vVar, i11);
                }
            };
            this.f36816c.getViewTreeObserver().addOnWindowVisibilityChangeListener(onWindowVisibilityChangeListener);
            ViewGroup viewGroup = this.f36816c;
            if (ViewCompat.isAttachedToWindow(viewGroup)) {
                viewGroup.addOnAttachStateChangeListener(new Do(viewGroup, viewGroup, onWindowVisibilityChangeListener));
            } else {
                viewGroup.getViewTreeObserver().removeOnWindowVisibilityChangeListener(onWindowVisibilityChangeListener);
            }
            Function0 function0 = new Function0() { // from class: w3.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Eo.a();
                }
            };
            this.f36814a = 1;
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

    public static final Unit a() {
        return Unit.f93236a;
    }
}
