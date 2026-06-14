package yads;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class yp1 extends r90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m70 f118312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f118313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f118314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public vs f118315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f118316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f118317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f118318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f118319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f118320i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f118321j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f118322k;

    public yp1(View view, m70 m70Var, yh3 yh3Var, zh3 zh3Var) {
        super(view);
        this.f118312a = m70Var;
        this.f118313b = yh3Var;
        this.f118314c = zh3Var;
        this.f118316e = (LinearLayout) view.findViewById(R$id.item_mediation_adapter);
        this.f118317f = (ImageView) view.findViewById(R$id.item_logo);
        this.f118318g = (TextView) view.findViewById(R$id.item_name);
        this.f118319h = (ImageView) view.findViewById(R$id.navigation_icon);
        this.f118320i = (TextView) view.findViewById(R$id.item_info_first);
        this.f118321j = (TextView) view.findViewById(R$id.item_info_second);
        this.f118322k = (ImageView) view.findViewById(R$id.item_warning_button);
    }

    public static final void b(yp1 yp1Var, l90 l90Var, View view) {
        yp1Var.f118313b.invoke(l90Var);
    }

    @Override // yads.r90
    public final void a(final l90 l90Var) {
        Context context = this.itemView.getContext();
        this.f118318g.setText(l90Var.f113004a);
        k80 k80Var = l90Var.f113006c;
        if (k80Var != null) {
            this.f118320i.setVisibility(0);
            this.f118320i.setText(k80Var.f112637a);
            this.f118320i.setTextAppearance(context, k80Var.f112640d);
            this.f118320i.setTextColor(ak.a(this.itemView.getContext(), k80Var.f112638b));
            TextView textView = this.f118320i;
            Integer num = k80Var.f112639c;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, num != null ? num.intValue() : 0, 0);
        } else {
            this.f118320i.setVisibility(8);
        }
        d50 d50Var = l90Var.f113007d;
        this.f118321j.setText(d50Var.f109764a);
        this.f118321j.setTextAppearance(context, d50Var.f109766c);
        this.f118321j.setTextColor(ak.a(this.itemView.getContext(), d50Var.f109765b));
        LinearLayout linearLayout = this.f118316e;
        String str = l90Var.f113008e;
        linearLayout.setClickable(((str == null || StringsKt.y0(str)) && l90Var.f113010g == null) ? false : true);
        String str2 = l90Var.f113008e;
        if (str2 == null || StringsKt.y0(str2)) {
            this.f118322k.setVisibility(8);
        } else {
            this.f118322k.setVisibility(0);
            this.f118316e.setOnClickListener(new View.OnClickListener() { // from class: yads.j71
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    yp1.a(this.f112251b, l90Var, view);
                }
            });
        }
        this.f118317f.setImageResource(0);
        vs vsVar = this.f118315d;
        if (vsVar != null) {
            vsVar.cancel();
        }
        m70 m70Var = this.f118312a;
        String str3 = l90Var.f113005b;
        if (str3 == null) {
            str3 = "";
        }
        this.f118315d = m70Var.a(str3, this.f118317f);
        if (l90Var.f113010g == null) {
            this.f118319h.setVisibility(8);
        } else {
            this.f118319h.setVisibility(0);
            this.f118316e.setOnClickListener(new View.OnClickListener() { // from class: yads.k71
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    yp1.b(this.f112623b, l90Var, view);
                }
            });
        }
    }

    public static final void a(yp1 yp1Var, l90 l90Var, View view) {
        yp1Var.f118314c.invoke(l90Var.f113008e);
    }
}
