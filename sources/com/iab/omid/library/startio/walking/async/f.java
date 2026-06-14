package com.iab.omid.library.startio.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.startio.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class f extends a {
    public f(b.InterfaceC0425b interfaceC0425b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0425b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.startio.internal.c cVarC = com.iab.omid.library.startio.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.startio.adsession.a aVar : cVarC.b()) {
                if (this.f36063c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f36065e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.startio.utils.c.h(this.f36064d, this.f36067b.a())) {
            return null;
        }
        this.f36067b.a(this.f36064d);
        return this.f36064d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.startio.walking.async.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
