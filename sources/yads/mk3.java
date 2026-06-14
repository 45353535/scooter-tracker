package yads;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes4.dex */
public final class mk3 implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vw1 f113543a;

    public /* synthetic */ mk3() {
        this(new vw1());
    }

    @Override // yads.hf0
    public final void a(ViewGroup viewGroup) {
        this.f113543a.getClass();
        TextView textView = (TextView) viewGroup.findViewById(R$id.warning);
        if (textView != null) {
            textView.setSelected(true);
        }
    }

    @Override // yads.hf0
    public final void c() {
    }

    public mk3(vw1 vw1Var) {
        this.f113543a = vw1Var;
    }
}
