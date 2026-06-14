package com.iab.omid.library.pubnativenet.walking.async;

import com.iab.omid.library.pubnativenet.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class e extends a {
    public e(b.InterfaceC0421b interfaceC0421b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0421b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.pubnativenet.internal.c cVarC = com.iab.omid.library.pubnativenet.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.pubnativenet.adsession.a aVar : cVarC.b()) {
                if (this.f35934c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().a(str, this.f35936e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f35935d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.pubnativenet.walking.async.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
