package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.R$string;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class pb extends r90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f114598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f114599b;

    public pb(View view, ai3 ai3Var) {
        super(view);
        this.f114598a = ai3Var;
        this.f114599b = (TextView) view.findViewById(R$id.item_text);
    }

    public final void a() {
        this.f114599b.setText(this.itemView.getContext().getString(R$string.ad_units));
        this.f114599b.setOnClickListener(new View.OnClickListener() { // from class: yads.r00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pb.a(this.f115249b, view);
            }
        });
    }

    @Override // yads.r90
    public final /* bridge */ /* synthetic */ void a(o90 o90Var) {
        a();
    }

    public static final void a(pb pbVar, View view) {
        pbVar.f114598a.invoke();
    }
}
