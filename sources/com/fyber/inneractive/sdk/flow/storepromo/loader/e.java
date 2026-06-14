package com.fyber.inneractive.sdk.flow.storepromo.loader;

import com.fyber.inneractive.sdk.util.r;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f20907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f20908b;

    public e(f fVar, d dVar) {
        this.f20908b = fVar;
        this.f20907a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.flow.storepromo.model.c cVar;
        int i10 = 2;
        f fVar = this.f20908b;
        if (fVar.f20914f == null || (cVar = fVar.f20910b) == null) {
            return;
        }
        d dVar = this.f20907a;
        StringBuilder sb2 = new StringBuilder("\n<script>\n");
        ArrayList<com.fyber.inneractive.sdk.flow.storepromo.model.a> arrayList = cVar.f20957a;
        StringBuilder sb3 = new StringBuilder();
        int i11 = 0;
        int i12 = 0;
        for (com.fyber.inneractive.sdk.flow.storepromo.model.a aVar : arrayList) {
            int i13 = h.f20924a[aVar.f20954a.ordinal()];
            if (i13 == 1) {
                i11++;
                String str = i.f20925a;
                String str2 = String.format("app_screen_%d", Integer.valueOf(i11));
                sb3.append("var " + str2 + "_el = document.createElement('img');\n" + str2 + "_el.id = '" + str2 + "';\ndocument.getElementById('carousel').appendChild(" + str2 + "_el);\n");
                sb3.append(String.format(i.f20925a, Integer.valueOf(i11), aVar.f20955b));
                sb3.append(String.format(i.f20926b, Integer.valueOf(i11), Integer.valueOf(i11)));
                i10 = 2;
            } else if (i13 == i10) {
                i12++;
                String str3 = i.f20925a;
                String str4 = String.format("app_video_url_%d", Integer.valueOf(i12));
                sb3.append("var " + str4 + "_el = document.createElement('video');\n" + str4 + "_el.id = '" + str4 + "';\ndocument.getElementById('carousel').appendChild(" + str4 + "_el);\n");
                sb3.append(String.format(i.f20927c, Integer.valueOf(i12), aVar.f20955b));
                sb3.append(String.format(i.f20928d, Integer.valueOf(i12), Integer.valueOf(i12)));
                i10 = 2;
            } else if (i13 == 3) {
                sb3.append(String.format(i.f20929e, aVar.f20955b));
                sb3.append(i.f20930f);
            } else if (i13 == 4) {
                sb3.append(String.format(i.f20941q, aVar.f20955b));
                sb3.append(i.f20942r);
            }
        }
        sb2.append(sb3.toString());
        sb2.append(String.format(i.f20931g, cVar.f20958b.replace("`", "\\`")) + i.f20932h + String.format(i.f20933i, cVar.f20962f.replace("`", "\\`")) + i.f20934j + String.format(i.f20935k, cVar.f20963g.f20967b.replace("`", "\\`")) + i.f20936l + String.format(i.f20939o, cVar.f20963g.f20966a.replace("`", "\\`")) + i.f20940p + String.format(i.f20937m, cVar.f20963g.f20968c.replace("`", "\\`")) + i.f20938n);
        StringBuilder sb4 = new StringBuilder();
        boolean z10 = Boolean.parseBoolean(cVar.f20960d);
        boolean z11 = Boolean.parseBoolean(cVar.f20961e);
        sb4.append(i.a(z10, "in_app_purchases"));
        sb4.append(i.a(z11, "app_contains_ads"));
        sb4.append(i.a(z11 && z10, "app_subtitle_separator"));
        sb2.append(sb4.toString());
        sb2.append("</script>");
        String str5 = cVar.f20959c + sb2.toString();
        dVar.getClass();
        r.f23896b.post(new c(dVar, str5));
    }
}
