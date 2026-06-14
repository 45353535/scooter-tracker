package yads;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes4.dex */
public final class ms implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vw1 f113598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls f113599b;

    public ms(vw1 vw1Var, ls lsVar) {
        this.f113598a = vw1Var;
        this.f113599b = lsVar;
    }

    @Override // yads.hf0
    public final void a(ViewGroup viewGroup) {
        this.f113598a.getClass();
        TextView textView = (TextView) viewGroup.findViewById(R$id.call_to_action);
        if (textView != null) {
            ls lsVar = this.f113599b;
            lsVar.f113204a.postDelayed(new x03(textView, lsVar.f113205b), 2000L);
        }
    }

    @Override // yads.hf0
    public final void c() {
        ls lsVar = this.f113599b;
        lsVar.f113204a.removeCallbacksAndMessages(null);
        lsVar.f113205b.cancel();
    }
}
