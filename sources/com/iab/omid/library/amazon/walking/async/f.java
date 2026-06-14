package com.iab.omid.library.amazon.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.amazon.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class f extends a {
    public f(b.InterfaceC0368b interfaceC0368b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0368b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.amazon.internal.c cVarC = com.iab.omid.library.amazon.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.amazon.adsession.a aVar : cVarC.b()) {
                if (this.f34201c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f34203e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.amazon.utils.c.h(this.f34202d, this.f34205b.a())) {
            return null;
        }
        this.f34205b.a(this.f34202d);
        return this.f34202d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.amazon.walking.async.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
