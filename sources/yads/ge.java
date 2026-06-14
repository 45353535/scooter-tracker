package yads;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes4.dex */
public final class ge implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k00 f111150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dy1 f111151b;

    public ge(k00 k00Var, dy1 dy1Var) {
        this.f111150a = k00Var;
        this.f111151b = dy1Var;
    }

    @Override // yads.hf0
    public final void a(ViewGroup viewGroup) {
        this.f111151b.getClass();
        View viewFindViewById = viewGroup.findViewById(R$id.age_divider);
        if (viewFindViewById == null || this.f111150a.f112534f != null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    @Override // yads.hf0
    public final void c() {
    }
}
