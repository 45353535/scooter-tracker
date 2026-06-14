package com.iab.omid.library.pubmatic.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.pubmatic.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class f extends a {
    public f(b.InterfaceC0417b interfaceC0417b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0417b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.pubmatic.internal.c cVarC = com.iab.omid.library.pubmatic.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.pubmatic.adsession.a aVar : cVarC.b()) {
                if (this.f35799c.contains(aVar.c())) {
                    aVar.d().b(str, this.f35801e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.pubmatic.utils.c.h(this.f35800d, this.f35803b.a())) {
            return null;
        }
        this.f35803b.a(this.f35800d);
        return this.f35800d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.pubmatic.walking.async.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
