package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.C4066tn;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.tn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4066tn extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f39620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f39621d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4066tn(View view, ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.f39620c = view;
        this.f39621d = viewGroup;
    }

    public static final Unit a(View view, ViewOnAttachStateChangeListenerC4041sn viewOnAttachStateChangeListenerC4041sn) {
        view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC4041sn);
        return Unit.f93236a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C4066tn c4066tn = new C4066tn(this.f39620c, this.f39621d, continuation);
        c4066tn.f39619b = obj;
        return c4066tn;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4066tn) create((gg.v) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39618a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            gg.v vVar = (gg.v) this.f39619b;
            View view = this.f39620c;
            final ViewOnAttachStateChangeListenerC4041sn viewOnAttachStateChangeListenerC4041sn = new ViewOnAttachStateChangeListenerC4041sn(vVar, view, this.f39621d);
            view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC4041sn);
            vVar.e(kotlin.coroutines.jvm.internal.b.a(AbstractC4116vn.b(this.f39620c, this.f39621d)));
            final View view2 = this.f39620c;
            Function0 function0 = new Function0() { // from class: w3.va
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4066tn.a(view2, viewOnAttachStateChangeListenerC4041sn);
                }
            };
            this.f39618a = 1;
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
