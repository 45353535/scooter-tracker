package com.iab.omid.library.corpmailru.walking.a;

import android.text.TextUtils;
import com.iab.omid.library.corpmailru.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class f extends a {
    public f(b.InterfaceC0391b interfaceC0391b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0391b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.corpmailru.b.a aVarA = com.iab.omid.library.corpmailru.b.a.a();
        if (aVarA != null) {
            for (com.iab.omid.library.corpmailru.adsession.a aVar : aVarA.b()) {
                if (((a) this).f34976a.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().a(str, this.f34978c);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.corpmailru.d.b.b(this.f34977b, this.f34980d.b())) {
            return null;
        }
        this.f34980d.a(this.f34977b);
        return this.f34977b.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.corpmailru.walking.a.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
