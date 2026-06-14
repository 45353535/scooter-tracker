package yads;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class uc1 extends r90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f116610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f116611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f116612c;

    public uc1(View view) {
        super(view);
        this.f116610a = (TextView) view.findViewById(R$id.item_title);
        this.f116611b = (TextView) view.findViewById(R$id.item_subtitle);
        this.f116612c = (TextView) view.findViewById(R$id.item_text);
    }

    @Override // yads.r90
    public final void a(o90 o90Var) {
        k90 k90Var = (k90) o90Var;
        String str = k90Var.f112651a;
        k80 k80Var = k90Var.f112652b;
        d50 d50Var = k90Var.f112653c;
        Context context = this.itemView.getContext();
        if (str != null) {
            this.f116610a.setVisibility(0);
            this.f116610a.setText(str);
        } else {
            this.f116610a.setVisibility(8);
        }
        if (k80Var == null || StringsKt.y0(k80Var.f112637a)) {
            this.f116611b.setVisibility(8);
        } else {
            this.f116611b.setVisibility(0);
            this.f116611b.setText(k80Var.f112637a);
            this.f116611b.setTextColor(ak.a(context, k80Var.f112638b));
            Integer num = k80Var.f112639c;
            this.f116611b.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, num != null ? num.intValue() : 0, 0);
        }
        if (d50Var == null || StringsKt.y0(d50Var.f109764a)) {
            this.f116612c.setVisibility(8);
            return;
        }
        this.f116612c.setVisibility(0);
        this.f116612c.setText(d50Var.f109764a);
        this.f116612c.setTextColor(ak.a(context, d50Var.f109765b));
    }
}
