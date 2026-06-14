package yads;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.yandex.div.core.DivConfiguration;
import com.yandex.mobile.ads.R$layout;

/* JADX INFO: loaded from: classes4.dex */
public final class sh0 implements hx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k8.ea f115794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c4 f115795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final es2 f115796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hf0 f115797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f2 f115798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xg0 f115799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f115800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gg0 f115801h;

    public /* synthetic */ sh0(k8.ea eaVar, c4 c4Var, es2 es2Var, sx sxVar, f2 f2Var, xg0 xg0Var, int i10) {
        this(eaVar, c4Var, es2Var, sxVar, f2Var, xg0Var, i10, new gg0(((pr3) es2Var).a()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.hx0
    public final dd1 a(Context context, t9 t9Var, jz1 jz1Var, wy wyVar, l00 l00Var) {
        DivConfiguration divConfigurationA;
        hf0 cy1Var;
        gu guVar = new gu();
        hh0 hh0Var = new hh0(guVar);
        gg0 gg0Var = this.f115801h;
        k8.ea eaVar = this.f115794a;
        gg0Var.getClass();
        boolean z10 = jz1Var instanceof i12;
        if (z10) {
            dm2 dm2Var = gg0Var.f111180a;
            jy2 jy2Var = new jy2(dm2Var);
            i12 i12Var = (i12) jz1Var;
            jy2Var.f112517e.put(eaVar, new ly2(i12Var, dm2Var, new sg0(), new uo0(), new ej(kz1.a(i12Var, fh0.f110724c))));
            gg0Var.f111181b.getClass();
            divConfigurationA = ky2.a(context, jy2Var, hh0Var);
        } else {
            divConfigurationA = (DivConfiguration) lf.i.a(new nh0(context, hh0Var)).getValue();
        }
        DivConfiguration divConfiguration = divConfigurationA;
        wg0 wg0Var = new wg0(context, this.f115795b, this.f115796c, t9Var, wyVar, this.f115799f, hh0Var);
        mr1 mr1VarA = ((pr3) this.f115796c).a();
        gh0 gh0Var = new gh0(this.f115794a, wg0Var, divConfiguration, mr1VarA, null, context instanceof LifecycleOwner ? (LifecycleOwner) context : null, 208);
        en2 en2Var = new en2(this.f115798e, this.f115800g);
        if (z10) {
            i12 i12Var2 = (i12) jz1Var;
            cy1Var = new gy2(i12Var2, wyVar, l00Var, guVar, mr1VarA, new ww1(), new ej(kz1.a(i12Var2, fh0.f110723b)));
        } else {
            cy1Var = new cy1(jz1Var, wyVar, l00Var, guVar, mr1VarA, new ww1(), new ej(kz1.a(jz1Var, null)));
        }
        return new dd1(R$layout.monetization_ads_internal_divkit, new sx(en2Var, gh0Var, new dx0(cy1Var), this.f115797d), new rh0(t9Var));
    }

    public sh0(k8.ea eaVar, c4 c4Var, es2 es2Var, sx sxVar, f2 f2Var, xg0 xg0Var, int i10, gg0 gg0Var) {
        this.f115794a = eaVar;
        this.f115795b = c4Var;
        this.f115796c = es2Var;
        this.f115797d = sxVar;
        this.f115798e = f2Var;
        this.f115799f = xg0Var;
        this.f115800g = i10;
        this.f115801h = gg0Var;
    }
}
