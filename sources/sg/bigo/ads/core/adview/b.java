package sg.bigo.ads.core.adview;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.core.adview.e;
import sg.bigo.ads.core.adview.e.b;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends c {
    public b(@NonNull sg.bigo.ads.api.a<?> aVar) {
        super(aVar);
    }

    public final void a(sg.bigo.ads.api.core.b bVar, final String str) {
        if (bVar == null) {
            return;
        }
        this.f103878a.removeAllViews();
        b.e eVarB = bVar.B();
        AdImageView adImageView = new AdImageView(this.f103878a.getContext());
        adImageView.setIconTag(true);
        String strA = eVarB != null ? eVarB.a() : "";
        final String strB = eVarB != null ? eVarB.b() : "";
        final String strD = eVarB != null ? eVarB.d() : "";
        final String strE = eVarB != null ? eVarB.e() : "";
        final String strG = eVarB != null ? eVarB.g() : "";
        final String strH = eVarB != null ? eVarB.h() : "";
        adImageView.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.b.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sg.bigo.ads.api.a<?> aVar = b.this.f103878a;
                String str2 = strB;
                String str3 = str;
                String str4 = strD;
                String str5 = strE;
                String str6 = strG;
                String str7 = strH;
                if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7)) {
                    return;
                }
                e.a aVar2 = new e.a(aVar);
                aVar2.f103882b = str2;
                aVar2.f103883c = str3;
                aVar2.f103884d = str4;
                aVar2.f103885e = str5;
                aVar2.f103886f = str6;
                aVar2.f103887g = str7;
                e eVar = new e(aVar2, (byte) 0);
                Activity activityA = sg.bigo.ads.common.utils.c.a(eVar.f103880a.f103881a);
                if (activityA == null) {
                    sg.bigo.ads.common.t.a.b("Feedback", "Cannot find Activity from container view");
                    return;
                }
                if (e.f103879b) {
                    sg.bigo.ads.common.t.a.b("Feedback", "Feedback dialog is showing. Cannot show again.");
                    return;
                }
                e.b bVar2 = eVar.new b(activityA);
                if (q.a((CharSequence) eVar.f103880a.f103882b) && q.a((CharSequence) eVar.f103880a.f103883c) && q.a((CharSequence) eVar.f103880a.f103884d) && q.a((CharSequence) eVar.f103880a.f103885e) && q.a((CharSequence) eVar.f103880a.f103886f) && q.a((CharSequence) eVar.f103880a.f103887g)) {
                    return;
                }
                bVar2.show();
                e.f103879b = true;
            }
        });
        if (TextUtils.isEmpty(strA)) {
            this.f103878a.setVisibility(8);
            return;
        }
        adImageView.a(strA, bVar.al());
        adImageView.setLayoutParams(new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(this.f103878a.getContext(), 16), sg.bigo.ads.common.utils.e.a(this.f103878a.getContext(), 16), 17));
        adImageView.setTag("ad_options_real_view");
        a(adImageView);
    }
}
