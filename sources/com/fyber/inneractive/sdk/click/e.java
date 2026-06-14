package com.fyber.inneractive.sdk.click;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.f0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f20258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f20259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f20260c;

    public e(g gVar, List list, Uri uri) {
        this.f20260c = gVar;
        this.f20258a = list;
        this.f20259b = uri;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        c cVar = (c) obj;
        if (this.f20260c.f20266f) {
            return;
        }
        if (exc != null || cVar == null) {
            String string = this.f20259b.toString();
            IAConfigManager iAConfigManager = IAConfigManager.O;
            com.fyber.inneractive.sdk.util.r.f23896b.post(new com.fyber.inneractive.sdk.config.f0(string, null));
            Uri uri = this.f20259b;
            this.f20260c.getClass();
            b bVarA = r.a(uri.toString(), "IgniteGooglePlay", "failed getting redirects");
            List list = this.f20258a;
            if (list != null) {
                list.add(new j(this.f20259b.toString(), false, q.INTERNAL_REDIRECT, "failed getting redirects. ignite click handler"));
                List list2 = this.f20258a;
                bVarA.f20254f.clear();
                bVarA.f20254f.addAll(list2);
            }
            g gVar = this.f20260c;
            f fVar = gVar.f20263c;
            if (fVar != null) {
                fVar.a(bVarA, gVar.f20264d, gVar.f20265e);
                return;
            }
            return;
        }
        if (cVar.f20255a.size() > 0) {
            ArrayList arrayList = cVar.f20255a;
            String str = (String) arrayList.get(arrayList.size() - 1);
            if (this.f20258a != null) {
                for (String str2 : cVar.f20255a) {
                    if (!TextUtils.equals(str2, str)) {
                        this.f20258a.add(new j(str2, true, q.INTERNAL_REDIRECT, null));
                    }
                }
                List list3 = this.f20258a;
                q qVar = q.OPEN_INTERNAL_STORE;
                list3.add(new j(str, true, qVar, null));
                this.f20260c.getClass();
                b bVar = new b(str, qVar, "IgniteGooglePlay", null);
                List list4 = this.f20258a;
                bVar.f20254f.clear();
                bVar.f20254f.addAll(list4);
                g gVar2 = this.f20260c;
                f fVar2 = gVar2.f20263c;
                if (fVar2 != null) {
                    fVar2.a(bVar, gVar2.f20264d, gVar2.f20265e);
                }
            }
            if (str.startsWith("market")) {
                String strReplace = str.replace("market://details?id=", "https://play.google.com/store/apps/details?id=");
                IAConfigManager iAConfigManager2 = IAConfigManager.O;
                com.fyber.inneractive.sdk.util.r.f23896b.post(new com.fyber.inneractive.sdk.config.f0(strReplace, null));
            } else {
                String str3 = cVar.f20256b;
                IAConfigManager iAConfigManager3 = IAConfigManager.O;
                com.fyber.inneractive.sdk.util.r.f23896b.post(new com.fyber.inneractive.sdk.config.f0(str, str3));
            }
        }
    }
}
