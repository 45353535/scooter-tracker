package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4991bf extends Fd implements Do {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f76897d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f76898e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f76899f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f76900g = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f76911r = "SESSION_";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C5043df f76901h = new C5043df("PERMISSIONS_CHECK_TIME", null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C5043df f76902i = new C5043df("PROFILE_ID", null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C5043df f76903j = new C5043df("APP_ENVIRONMENT", null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C5043df f76904k = new C5043df("APP_ENVIRONMENT_REVISION", null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C5043df f76905l = new C5043df("LAST_APP_VERSION_WITH_FEATURES", null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C5043df f76906m = new C5043df("APPLICATION_FEATURES", null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C5043df f76907n = new C5043df("CERTIFICATES_SHA1_FINGERPRINTS", null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C5043df f76908o = new C5043df("VITAL_DATA", null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C5043df f76909p = new C5043df("SENT_EXTERNAL_ATTRIBUTIONS", null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C5043df f76910q = new C5043df("AUTO_COLLECTED_DATA_SUBSCRIBERS", null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C5043df f76912s = new C5043df("MAIN_REPORTER_EVENTS_TRIGGER_CONDITION_MET", null);

    public C4991bf(Oa oa2) {
        super(oa2);
    }

    public final C4991bf a(C5157i0 c5157i0) {
        synchronized (this) {
            b(f76903j.f77017b, c5157i0.f77362a);
            b(f76904k.f77017b, c5157i0.f77363b);
        }
        return this;
    }

    public final void b(boolean z10) {
        b(f76912s.f77017b, z10);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5017cf
    @NonNull
    public final Set<String> c() {
        return this.f76970a.a();
    }

    public final C5157i0 d() {
        C5157i0 c5157i0;
        synchronized (this) {
            c5157i0 = new C5157i0(this.f76970a.getString(f76903j.f77017b, JsonUtils.EMPTY_JSON), this.f76970a.getLong(f76904k.f77017b, 0L));
        }
        return c5157i0;
    }

    public final String e() {
        return this.f76970a.getString(f76906m.f77017b, "");
    }

    public final Map<String, Long> f() {
        HashMap map = new HashMap();
        try {
            String string = this.f76970a.getString(f76910q.f77017b, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, Long.valueOf(jSONObject.getLong(next)));
                }
            }
        } catch (Throwable unused) {
        }
        return map;
    }

    @NonNull
    public final List<String> g() {
        String str = f76907n.f77017b;
        List list = Collections.EMPTY_LIST;
        String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        String string = this.f76970a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                strArr = new String[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    strArr[i10] = jSONArray.optString(i10);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    public final int h() {
        return this.f76970a.getInt(f76905l.f77017b, -1);
    }

    public final long i() {
        return this.f76970a.getLong(f76901h.f77017b, 0L);
    }

    @Nullable
    public final String j() {
        return this.f76970a.getString(f76902i.f77017b, null);
    }

    @NonNull
    public final Map<Integer, String> k() {
        HashMap map = new HashMap();
        try {
            String string = this.f76970a.getString(f76909p.f77017b, null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(Integer.valueOf(Integer.parseInt(next)), jSONObject.getString(next));
                }
            }
        } catch (Throwable unused) {
        }
        return map;
    }

    public final void b(@NonNull Map<Integer, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(f76909p.f77017b, jSONObject.toString());
    }

    public final String h(String str) {
        return this.f76970a.getString(new C5043df(f76911r, str).f77017b, "");
    }

    public final C4991bf i(String str) {
        return (C4991bf) b(f76906m.f77017b, str);
    }

    public final C4991bf j(@Nullable String str) {
        return (C4991bf) b(f76902i.f77017b, str);
    }

    public final C4991bf e(String str, String str2) {
        return (C4991bf) b(new C5043df(f76911r, str).f77017b, str2);
    }

    public final C4991bf a(long j10) {
        return (C4991bf) b(f76901h.f77017b, j10);
    }

    @Override // io.appmetrica.analytics.impl.Fd
    @NonNull
    public final String f(@NonNull String str) {
        return new C5043df(str, null).f77017b;
    }

    public final C4991bf a(int i10) {
        return (C4991bf) b(f76905l.f77017b, i10);
    }

    public final C4991bf a(List<String> list) {
        return (C4991bf) a(f76907n.f77017b, list);
    }

    public final boolean a(boolean z10) {
        return this.f76970a.getBoolean(f76912s.f77017b, z10);
    }

    @Override // io.appmetrica.analytics.impl.Do
    @Nullable
    public final String a() {
        return this.f76970a.getString(f76908o.f77017b, null);
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final void a(@NonNull String str) {
        b(f76908o.f77017b, str);
    }

    public final void a(@NonNull Map<String, Long> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(f76910q.f77017b, jSONObject.toString());
    }
}
