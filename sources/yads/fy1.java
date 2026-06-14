package yads;

import android.os.SystemClock;
import android.view.View;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class fy1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gi f110976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x3 f110977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yz1 f110978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fl2 f110979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final td1 f110980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vv0 f110981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CoroutineScope f110982g = l10.b(null);

    public fy1(gi giVar, td1 td1Var, x3 x3Var, yz1 yz1Var, fl2 fl2Var, vv0 vv0Var) {
        this.f110976a = giVar;
        this.f110977b = x3Var;
        this.f110978c = yz1Var;
        this.f110979d = fl2Var;
        this.f110980e = td1Var;
        this.f110981f = vv0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jElapsedRealtime;
        Long l10 = this.f110979d.f110780a;
        if (l10 != null) {
            jElapsedRealtime = SystemClock.elapsedRealtime() - l10.longValue();
        } else {
            jElapsedRealtime = 0;
        }
        td1 td1Var = this.f110980e;
        if (td1Var == null || jElapsedRealtime < td1Var.f116209e || !this.f110976a.f111217e) {
            return;
        }
        eg.i.d(this.f110982g, null, null, new ey1(this, view, null), 3, null);
    }
}
