package com.inmobi.media;

import android.R;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class Wd extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3579ae f37947a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wd(C3579ae c3579ae, Continuation continuation) {
        super(2, continuation);
        this.f37947a = c3579ae;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Wd(this.f37947a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Wd(this.f37947a, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        C3579ae c3579ae = this.f37947a;
        c3579ae.getClass();
        c3579ae.f38198a.addView(c3579ae.f38204g, new RelativeLayout.LayoutParams(-1, -1));
        C3579ae c3579ae2 = this.f37947a;
        boolean z10 = c3579ae2.f38201d.f37620d.f37467a;
        c3579ae2.f38206i = z10;
        if (z10) {
            c3579ae2.a(c3579ae2.f38207j, c3579ae2.f38208k);
        } else {
            c3579ae2.a(c3579ae2.f38208k, c3579ae2.f38207j);
        }
        C3614bn c3614bn = this.f37947a.f38209l;
        if (c3614bn.f38296c.f36854a) {
            float fB = J5.b();
            ProgressBar progressBar = new ProgressBar(c3614bn.f38295b.getContext(), null, R.attr.progressBarStyleHorizontal);
            c3614bn.f38298e = progressBar;
            D6.a(progressBar, c3614bn.f38296c, fB);
            c3614bn.f38295b.addView(c3614bn.f38298e);
            eg.i.d(c3614bn.f38294a, eg.o0.c(), null, new Zm(c3614bn.f38297d, null, c3614bn), 2, null);
        }
        return Unit.f93236a;
    }
}
