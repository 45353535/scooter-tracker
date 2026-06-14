package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class nb extends r90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f113768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f113769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f113770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f113771d;

    public nb(bi3 bi3Var, View view) {
        super(view);
        this.f113768a = bi3Var;
        this.f113769b = (TextView) view.findViewById(R$id.item_name);
        this.f113770c = (TextView) view.findViewById(R$id.item_ad_unit_format);
        this.f113771d = (TextView) view.findViewById(R$id.item_ad_unit_id);
    }

    @Override // yads.r90
    public final void a(final e90 e90Var) {
        this.f113769b.setText(e90Var.f110264a);
        this.f113770c.setText(e90Var.f110265b);
        this.f113771d.setText(e90Var.f110266c);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: yads.uq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nb.a(this.f116736b, e90Var, view);
            }
        });
    }

    public static final void a(nb nbVar, e90 e90Var, View view) {
        nbVar.f113768a.invoke(e90Var.f110266c);
    }
}
