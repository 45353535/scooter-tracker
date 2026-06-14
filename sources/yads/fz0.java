package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes4.dex */
public final class fz0 extends r90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f110984a;

    public fz0(View view) {
        super(view);
        this.f110984a = (TextView) view.findViewById(R$id.item_text);
    }

    @Override // yads.r90
    public final void a(o90 o90Var) {
        this.f110984a.setText(((j90) o90Var).f112271a);
    }
}
