package com.inmobi.media;

import android.widget.ProgressBar;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class Ym implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3614bn f38078a;

    public Ym(CoroutineScope coroutineScope, C3614bn c3614bn) {
        this.f38078a = c3614bn;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        ProgressBar progressBar;
        Rl rl = (Rl) obj;
        C3614bn c3614bn = this.f38078a;
        c3614bn.getClass();
        if (rl instanceof C3842kn) {
            ProgressBar progressBar2 = c3614bn.f38298e;
            if (progressBar2 != null) {
                progressBar2.setVisibility(0);
            }
        } else if (rl instanceof Xm) {
            int i10 = ((Xm) rl).f38013b;
            ProgressBar progressBar3 = c3614bn.f38298e;
            if (progressBar3 != null) {
                H6.a(c3614bn.f38299f);
                c3614bn.f38299f = P4.a(c3614bn.f38294a, new C3588an(progressBar3, c3614bn, i10, null));
            }
        } else if ((rl instanceof Pl) && c3614bn.f38296c.f36855b && (progressBar = c3614bn.f38298e) != null) {
            progressBar.setVisibility(8);
        }
        return Unit.f93236a;
    }
}
