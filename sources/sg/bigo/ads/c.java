package sg.bigo.ads;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: sg.bigo.ads.c$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f102243a;

        static {
            int[] iArr = new int[ConsentOptions.values().length];
            f102243a = iArr;
            try {
                iArr[ConsentOptions.LGPD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f102243a[ConsentOptions.CCPA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f102243a[ConsentOptions.COPPA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f102243a[ConsentOptions.GDPR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final List<a> f102244h = new ArrayList();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f102245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f102246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f102247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f102248d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f102249e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f102250f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f102251g;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f102245a = str;
            this.f102246b = str2;
            this.f102247c = str3;
            this.f102248d = str4;
            this.f102249e = str5;
            this.f102250f = str6;
            this.f102251g = str7;
        }

        public static List<a> a() {
            return f102244h;
        }

        static JSONObject b(a aVar) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("consent_type", aVar.f102245a);
                jSONObject.put("last_status", aVar.f102246b);
                jSONObject.put("cur_status", aVar.f102247c);
                jSONObject.put("get_token", aVar.f102248d);
                jSONObject.put("tcf_applias", aVar.f102249e);
                jSONObject.put("tcf_purpose", aVar.f102250f);
                jSONObject.put("tcf_interests", aVar.f102251g);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public static Map<String, String> c() {
            HashMap map = new HashMap();
            JSONArray jSONArray = new JSONArray();
            Iterator<a> it = f102244h.iterator();
            while (it.hasNext()) {
                jSONArray.put(b(it.next()));
            }
            map.put("user_consent_event", jSONArray.toString());
            map.put(CommonUrlParts.UUID, sg.bigo.ads.common.x.a.r());
            return map;
        }

        public static void a(a aVar) {
            f102244h.add(aVar);
        }

        public static void b() {
            f102244h.clear();
        }
    }
}
