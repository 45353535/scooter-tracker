package yads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class zv implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wy f118842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m30 f118843b;

    public zv(wy wyVar, m30 m30Var) {
        this.f118842a = wyVar;
        this.f118843b = m30Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f118842a.e();
        this.f118843b.a(l30.f112933c);
    }
}
