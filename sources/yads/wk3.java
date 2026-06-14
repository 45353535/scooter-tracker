package yads;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class wk3 implements sj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l02 f117506a;

    public wk3(l02 l02Var) {
        this.f117506a = l02Var;
    }

    @Override // yads.sj1
    public final TextView getCountDownProgress() {
        return null;
    }

    @Override // yads.sj1
    public final CheckBox getMuteControl() {
        gk2 gk2Var = this.f117506a.f112905c;
        KProperty kProperty = l02.f112902g[2];
        return (CheckBox) gk2Var.f111244a.get();
    }

    @Override // yads.sj1
    public final ProgressBar getVideoProgress() {
        gk2 gk2Var = this.f117506a.f112906d;
        KProperty kProperty = l02.f112902g[3];
        return (ProgressBar) gk2Var.f111244a.get();
    }
}
