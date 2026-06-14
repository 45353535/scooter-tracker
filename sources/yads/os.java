package yads;

import android.view.ViewGroup;
import android.widget.TextView;
import com.monetization.ads.fullscreen.template.view.CallToActionView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes4.dex */
public final class os implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jz1 f114404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vw1 f114405b;

    public /* synthetic */ os(jz1 jz1Var) {
        this(jz1Var, new vw1());
    }

    @Override // yads.hf0
    public final void a(ViewGroup viewGroup) {
        this.f114405b.getClass();
        TextView textView = (TextView) viewGroup.findViewById(R$id.call_to_action);
        xn2 adType = this.f114404a.getAdType();
        if (!(textView instanceof CallToActionView) || adType == xn2.f117914d) {
            return;
        }
        ((CallToActionView) textView).a();
    }

    @Override // yads.hf0
    public final void c() {
    }

    public os(jz1 jz1Var, vw1 vw1Var) {
        this.f114404a = jz1Var;
        this.f114405b = vw1Var;
    }
}
