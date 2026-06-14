package com.fyber.inneractive.sdk.click;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.f0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f20277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f20279c;

    public m(r rVar, String str, String str2) {
        this.f20279c = rVar;
        this.f20277a = str;
        this.f20278b = str2;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        c cVar = (c) obj;
        if (this.f20279c.f20286e) {
            return;
        }
        if (exc != null) {
            r.a(this.f20279c, null, this.f20277a, this.f20278b, exc);
            return;
        }
        if (cVar != null) {
            String str = this.f20277a;
            if (cVar.f20255a.size() > 1) {
                ArrayList arrayList = cVar.f20255a;
                str = (String) arrayList.get(arrayList.size() - 1);
            }
            b bVarA = this.f20279c.a(str);
            if ((bVarA == null || bVarA.f20249a == q.FAILED) && !TextUtils.isEmpty(cVar.f20256b)) {
                r rVar = this.f20279c;
                rVar.getClass();
                for (String str2 : cVar.f20255a) {
                    if (!TextUtils.equals(str2, str)) {
                        rVar.f20287f.add(new j(str2, true, q.INTERNAL_REDIRECT, null));
                    }
                }
                r.a(this.f20279c, cVar.f20256b, str, this.f20278b, null);
                return;
            }
            r rVar2 = this.f20279c;
            rVar2.getClass();
            for (String str3 : cVar.f20255a) {
                if (!TextUtils.equals(str3, str)) {
                    rVar2.f20287f.add(new j(str3, false, q.INTERNAL_REDIRECT, null));
                }
            }
            if (this.f20279c.f20287f.size() == 0) {
                this.f20279c.f20287f.add(new j(str, false, q.INTERNAL_REDIRECT, null));
            }
            this.f20279c.a(r.a(str, "followRedirects", "Invalid response"));
        }
    }
}
