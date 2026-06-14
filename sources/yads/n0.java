package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends r90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f113667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f113668b;

    public n0(vh3 vh3Var, View view) {
        super(view);
        this.f113667a = vh3Var;
        this.f113668b = (TextView) view.findViewById(R$id.item_button);
    }

    @Override // yads.r90
    public final void a(final h90 h90Var) {
        TextView textView = this.f113668b;
        h90Var.getClass();
        textView.setText("Enable Test mode");
        this.f113668b.setOnClickListener(new View.OnClickListener() { // from class: yads.sp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n0.a(this.f115891b, h90Var, view);
            }
        });
    }

    public static final void a(n0 n0Var, h90 h90Var, View view) {
        Function1 function1 = n0Var.f113667a;
        h90Var.getClass();
        function1.invoke(g90.f111110b);
    }
}
