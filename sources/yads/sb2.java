package yads;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* JADX INFO: loaded from: classes4.dex */
public final class sb2 implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k00 f115739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sw1 f115740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vw1 f115741c;

    public /* synthetic */ sb2(k00 k00Var) {
        this(k00Var, new sw1(), new vw1());
    }

    @Override // yads.hf0
    public final void a(ViewGroup viewGroup) {
        this.f115740b.getClass();
        ImageView imageView = (ImageView) viewGroup.findViewById(R$id.icon_placeholder);
        k00 k00Var = this.f115739a;
        m00 m00Var = k00Var.f112531c;
        m00 m00Var2 = k00Var.f112530b;
        if (imageView != null && m00Var == null && m00Var2 == null) {
            this.f115741c.getClass();
            ei3 ei3Var = new ei3((TextView) viewGroup.findViewById(R$id.title));
            imageView.setVisibility(0);
            imageView.setOnClickListener(ei3Var);
        }
    }

    @Override // yads.hf0
    public final void c() {
    }

    public sb2(k00 k00Var, sw1 sw1Var, vw1 vw1Var) {
        this.f115739a = k00Var;
        this.f115740b = sw1Var;
        this.f115741c = vw1Var;
    }
}
