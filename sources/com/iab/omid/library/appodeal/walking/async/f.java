package com.iab.omid.library.appodeal.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.appodeal.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class f extends a {
    public f(b.InterfaceC0376b interfaceC0376b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0376b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.appodeal.internal.c cVarC = com.iab.omid.library.appodeal.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.appodeal.adsession.a aVar : cVarC.b()) {
                if (this.f34472c.contains(aVar.c())) {
                    aVar.d().b(str, this.f34474e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.appodeal.utils.c.h(this.f34473d, this.f34476b.a())) {
            return null;
        }
        this.f34476b.a(this.f34473d);
        return this.f34473d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.appodeal.walking.async.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
