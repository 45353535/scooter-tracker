package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class Vl implements NetworkResponseHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5024cm f76605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5031d3 f76606b;

    public Vl() {
        this(new C5024cm(), new C5031d3());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5153hm handle(@NonNull ResponseDataHolder responseDataHolder) {
        String strOptString;
        String strOptString2;
        if (200 == responseDataHolder.getResponseCode()) {
            byte[] responseData = responseDataHolder.getResponseData();
            Map<String, List<String>> responseHeaders = responseDataHolder.getResponseHeaders();
            List list = responseHeaders != null ? (List) CollectionUtils.getFromMapIgnoreCase(responseHeaders, "Content-Encoding") : null;
            if (!no.a((Collection) list) && "encrypted".equals(list.get(0))) {
                responseData = this.f76606b.a(responseDataHolder.getResponseData());
            }
            if (responseData != null) {
                C5024cm c5024cm = this.f76605a;
                c5024cm.getClass();
                C5153hm c5153hm = new C5153hm();
                try {
                    c5024cm.f76987h.getClass();
                    C5270mb c5270mb = new C5270mb(new String(responseData, "UTF-8"));
                    JSONObject jSONObjectOptJSONObject = c5270mb.optJSONObject("device_id");
                    if (jSONObjectOptJSONObject != null) {
                        strOptString = jSONObjectOptJSONObject.optString("hash");
                        strOptString2 = jSONObjectOptJSONObject.optString("value");
                    } else {
                        strOptString = "";
                        strOptString2 = "";
                    }
                    c5153hm.f77334h = strOptString2;
                    c5153hm.f77335i = strOptString;
                    c5024cm.a(c5153hm, c5270mb);
                    c5153hm.f77327a = TextUtils.isEmpty(c5153hm.f77335i) ? 1 : 2;
                } catch (Throwable unused) {
                    c5153hm = new C5153hm();
                    c5153hm.f77327a = 1;
                }
                if (2 == c5153hm.f77327a) {
                    return c5153hm;
                }
            }
        }
        return null;
    }

    public Vl(C5024cm c5024cm, C5031d3 c5031d3) {
        this.f76605a = c5024cm;
        this.f76606b = c5031d3;
    }
}
