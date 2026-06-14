package com.iab.omid.library.taurusx.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.taurusx.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class f extends a {
    public f(b.InterfaceC0429b interfaceC0429b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0429b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.taurusx.internal.c cVarC = com.iab.omid.library.taurusx.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.taurusx.adsession.a aVar : cVarC.b()) {
                if (this.f36191c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f36193e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.taurusx.utils.c.h(this.f36192d, this.f36195b.a())) {
            return null;
        }
        this.f36195b.a(this.f36192d);
        return this.f36192d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.taurusx.walking.async.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
