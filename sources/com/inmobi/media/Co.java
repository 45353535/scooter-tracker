package com.inmobi.media;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import com.inmobi.media.Co;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class Co extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f36689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f36690c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Co(ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.f36690c = viewGroup;
    }

    public static final void a(gg.v vVar, boolean z10) {
        vVar.e(Boolean.valueOf(z10));
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        Co co = new Co(this.f36690c, continuation);
        co.f36689b = obj;
        return co;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Co co = new Co(this.f36690c, (Continuation) obj2);
        co.f36689b = (gg.v) obj;
        return co.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f36688a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            final gg.v vVar = (gg.v) this.f36689b;
            ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: w3.g
                @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                public final void onWindowFocusChanged(boolean z10) {
                    Co.a(vVar, z10);
                }
            };
            this.f36690c.getViewTreeObserver().addOnWindowFocusChangeListener(onWindowFocusChangeListener);
            ViewGroup viewGroup = this.f36690c;
            if (ViewCompat.isAttachedToWindow(viewGroup)) {
                viewGroup.addOnAttachStateChangeListener(new Bo(viewGroup, viewGroup, onWindowFocusChangeListener));
            } else {
                viewGroup.getViewTreeObserver().removeOnWindowFocusChangeListener(onWindowFocusChangeListener);
            }
            Function0 function0 = new Function0() { // from class: w3.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Co.a();
                }
            };
            this.f36688a = 1;
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
