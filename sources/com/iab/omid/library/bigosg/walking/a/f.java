package com.iab.omid.library.bigosg.walking.a;

import android.text.TextUtils;
import com.iab.omid.library.bigosg.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class f extends a {
    public f(b.InterfaceC0379b interfaceC0379b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0379b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.bigosg.b.a aVarA = com.iab.omid.library.bigosg.b.a.a();
        if (aVarA != null) {
            for (com.iab.omid.library.bigosg.adsession.a aVar : aVarA.b()) {
                if (((a) this).f34593a.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().a(str, this.f34595c);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.bigosg.d.b.b(this.f34594b, this.f34597d.b())) {
            return null;
        }
        this.f34597d.a(this.f34594b);
        return this.f34594b.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.bigosg.walking.a.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
