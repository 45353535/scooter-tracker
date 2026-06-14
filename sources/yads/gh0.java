package yads;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.div.DivDataTag;
import com.yandex.div.R$style;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.view2.Div2View;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class gh0 implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k8.ea f111186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wg0 f111187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DivConfiguration f111188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dm2 f111189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f111190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LifecycleOwner f111191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ei0 f111192g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final rg0 f111193h;

    public /* synthetic */ gh0(k8.ea eaVar, wg0 wg0Var, DivConfiguration divConfiguration, mr1 mr1Var, String str, LifecycleOwner lifecycleOwner, int i10) {
        this(eaVar, wg0Var, divConfiguration, mr1Var, (i10 & 16) != 0 ? "" : str, lifecycleOwner, new ei0(), new rg0());
    }

    @Override // yads.hf0
    public final void a(ViewGroup viewGroup) {
        ExtendedNativeAdView extendedNativeAdView = (ExtendedNativeAdView) viewGroup;
        try {
            Context context = extendedNativeAdView.getContext();
            ei0 ei0Var = this.f111192g;
            DivConfiguration divConfiguration = this.f111188c;
            LifecycleOwner lifecycleOwner = this.f111191f;
            String str = this.f111190e;
            ei0Var.getClass();
            Div2View div2View = new Div2View(new Div2Context(new ContextThemeWrapper(context, R$style.Div), divConfiguration, 0, lifecycleOwner, 4, null), null, 0, 6, null);
            div2View.setTag(str);
            extendedNativeAdView.addView(div2View);
            this.f111193h.getClass();
            div2View.setData(this.f111186a, new DivDataTag(UUID.randomUUID().toString()));
            eg0.a(div2View).a(this.f111187b);
        } catch (Throwable th2) {
            boolean z10 = lb1.f113032a;
            this.f111189d.reportError("Failed to bind DivKit", th2);
        }
    }

    @Override // yads.hf0
    public final void c() {
    }

    public gh0(k8.ea eaVar, wg0 wg0Var, DivConfiguration divConfiguration, mr1 mr1Var, String str, LifecycleOwner lifecycleOwner, ei0 ei0Var, rg0 rg0Var) {
        this.f111186a = eaVar;
        this.f111187b = wg0Var;
        this.f111188c = divConfiguration;
        this.f111189d = mr1Var;
        this.f111190e = str;
        this.f111191f = lifecycleOwner;
        this.f111192g = ei0Var;
        this.f111193h = rg0Var;
    }
}
