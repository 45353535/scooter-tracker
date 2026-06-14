package com.applovin.impl;

import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class r1 extends e2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private JSONObject f10273i;

    public r1(com.applovin.impl.sdk.k kVar) {
        super(kVar, d2.b.ERROR);
    }

    public void a(String str, Throwable th2) {
        a(str, th2, new HashMap());
    }

    public void b() {
        this.f10273i = JsonUtils.deserialize((String) this.f8725a.a(x4.K));
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(String str, String str2, Throwable th2) {
        a(str, str2, th2, new HashMap());
    }

    public void a(String str, String str2, Throwable th2, Map map) {
        a(str + StringUtils.PROCESS_POSTFIX_DELIMITER + str2, th2, map);
    }

    public void b(final String str, final String str2, final Throwable th2) {
        this.f8725a.q0().a((i5) new r6(this.f8725a, "reportCaughtException", new Runnable() { // from class: com.applovin.impl.xd
            @Override // java.lang.Runnable
            public final void run() {
                this.f11488b.a(str, str2, th2);
            }
        }), d6.b.OTHER);
    }

    public void a(String str, Throwable th2, Map map) {
        map.put("source", str);
        map.put("top_main_method", th2.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        for (Throwable th3 : th2.getSuppressed()) {
            HashMap map2 = new HashMap();
            CollectionUtils.putStringIfValid("source", str, map2);
            CollectionUtils.putStringIfValid("top_main_method", th2.toString(), map2);
            CollectionUtils.putStringIfValid("suppressed_throwable", th3.toString(), map2);
            arrayList.add(map2);
        }
        a(d2.N0, arrayList, 0L);
    }

    public void a(String str, String str2, com.applovin.impl.sdk.ad.b bVar) {
        HashMap map = new HashMap();
        map.put("source", str);
        map.put("error_message", str2);
        if (bVar != null) {
            map.putAll(f2.a((AppLovinAdImpl) bVar));
            map.putAll(f2.a(bVar));
            boolean zC0 = bVar.C0();
            map.put("is_video_stream", String.valueOf(zC0));
            if (zC0 && (bVar instanceof com.applovin.impl.sdk.ad.a)) {
                CollectionUtils.putStringIfValid("video_url", ((com.applovin.impl.sdk.ad.a) bVar).i1(), map);
            } else {
                CollectionUtils.putStringIfValid("video_url", bVar.I(), map);
            }
        }
        d(d2.T0, map);
    }

    public void a(String str, String str2, int i10, String str3) {
        List listA = a(str2);
        boolean z10 = listA != null;
        if (z10 && listA.contains(Integer.valueOf(i10))) {
            return;
        }
        if (z10 || i10 >= 400) {
            HashMap map = new HashMap(4);
            map.put("source", str);
            map.put("url", com.applovin.impl.sdk.utils.StringUtils.emptyIfNull(str2));
            map.put("code", String.valueOf(i10));
            map.put("error_message", f2.a(str3));
            d(d2.W0, map);
        }
    }

    private List a(String str) {
        List<Integer> integerList = JsonUtils.getIntegerList(this.f10273i, com.applovin.impl.sdk.utils.StringUtils.getHost(str), null);
        return integerList == null ? JsonUtils.getIntegerList(this.f10273i, "default", null) : integerList;
    }
}
