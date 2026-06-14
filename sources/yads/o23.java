package yads;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.yandex.mobile.ads.R$id;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class o23 extends r90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2 f114173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Switch f114174b;

    public o23(View view, xh3 xh3Var) {
        super(view);
        this.f114173a = xh3Var;
        this.f114174b = (Switch) view.findViewById(R$id.item_switch);
    }

    @Override // yads.r90
    public final void a(final n90 n90Var) {
        this.f114174b.setOnCheckedChangeListener(null);
        Switch r02 = this.f114174b;
        n90Var.getClass();
        r02.setText("Debug Error Indicator");
        this.f114174b.setChecked(n90Var.f113761a);
        this.f114174b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: yads.lz
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                o23.a(this.f113276a, n90Var, compoundButton, z10);
            }
        });
    }

    public static final void a(o23 o23Var, n90 n90Var, CompoundButton compoundButton, boolean z10) {
        Function2 function2 = o23Var.f114173a;
        n90Var.getClass();
        function2.invoke(m90.f113351b, Boolean.valueOf(z10));
    }
}
