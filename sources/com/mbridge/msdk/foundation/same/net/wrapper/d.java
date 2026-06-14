package com.mbridge.msdk.foundation.same.net.wrapper;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.tools.q0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f48755a = "d";

    private void a(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        if (eVar.f48687b.f48712d == 204) {
            a(new JSONObject());
        } else {
            b(eVar);
        }
    }

    private void b(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        JSONObject jSONObject = eVar.f48688c;
        if (jSONObject == null) {
            a("response result is null");
            return;
        }
        int iOptInt = jSONObject.optInt("status", -9999);
        if (iOptInt == -9999) {
            a(eVar.f48688c);
            return;
        }
        if (iOptInt == 1 || iOptInt == 200) {
            a(eVar.f48688c.optJSONObject("data"));
            return;
        }
        String strOptString = eVar.f48688c.optString(NotificationCompat.CATEGORY_MESSAGE);
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = "error message is null";
        }
        a(strOptString);
    }

    public abstract void a(String str);

    public abstract void a(JSONObject jSONObject);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.b(f48755a, "errorCode = " + aVar.f48689a);
        a(com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        if (eVar == null) {
            a("response is null");
            return;
        }
        super.onSuccess(eVar);
        if (eVar.f48687b == null) {
            b(eVar);
        } else {
            a(eVar);
        }
    }
}
