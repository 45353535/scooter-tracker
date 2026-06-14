package com.applovin.impl;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.taurusx.tax.vast.VastIconXmlManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class b8 implements q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f8452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f8453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f8455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f8456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u7 f8457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f8458g;

    private b8() {
        List list = Collections.EMPTY_LIST;
        this.f8452a = list;
        this.f8453b = list;
        this.f8456e = new HashSet();
        this.f8458g = new HashMap();
    }

    public static b8 a(p8 p8Var, b8 b8Var, s7 s7Var, com.applovin.impl.sdk.k kVar) {
        p8 p8VarC;
        u7 u7VarA;
        List listA;
        p8 p8VarC2;
        List listA2;
        p8 p8VarC3;
        int iA;
        if (p8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (s7Var == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (b8Var == null) {
            try {
                b8Var = new b8(s7Var);
            } catch (Throwable th2) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastVideoCreative", "Error occurred while initializing", th2);
                }
                kVar.D().a("VastVideoCreative", th2);
                return null;
            }
        }
        if (b8Var.f8454c == 0 && (p8VarC3 = p8Var.c("Duration")) != null && (iA = a(p8VarC3.d(), kVar)) > 0) {
            b8Var.f8454c = iA;
        }
        p8 p8VarC4 = p8Var.c(com.taurusx.tax.f.s.f66008a);
        if (p8VarC4 != null && (listA2 = a(p8VarC4, kVar)) != null && listA2.size() > 0) {
            List list = b8Var.f8452a;
            if (list != null) {
                listA2.addAll(list);
            }
            b8Var.f8452a = listA2;
        }
        p8 p8VarC5 = p8Var.c(com.taurusx.tax.f.s.f66032y);
        if (p8VarC5 != null) {
            if (b8Var.f8455d == null && (p8VarC2 = p8VarC5.c(com.taurusx.tax.f.s.f66022o)) != null) {
                String strD = p8VarC2.d();
                if (StringUtils.isValidString(strD)) {
                    b8Var.f8455d = Uri.parse(strD);
                }
            }
            a8.a(p8VarC5.a(com.taurusx.tax.f.s.f66026s), b8Var.f8456e, s7Var, kVar);
        }
        p8 p8VarC6 = p8Var.c(com.taurusx.tax.f.s.f66027t);
        if (p8VarC6 != null && (u7VarA = u7.a((p8VarC = p8VarC6.c(com.taurusx.tax.f.s.f66014g)), kVar)) != null) {
            p8 p8VarC7 = p8VarC.c(VastIconXmlManager.ICON_CLICKS);
            if (p8VarC7 != null && (listA = p8VarC7.a(VastIconXmlManager.ICON_CLICK_TRACKING)) != null) {
                a8.a(listA, u7VarA.f11073a, s7Var, kVar);
            }
            List listA3 = p8VarC.a(VastIconXmlManager.ICON_VIEW_TRACKING);
            if (listA3 != null) {
                a8.a(listA3, u7VarA.f11074b, s7Var, kVar);
            }
            b8Var.f8457f = u7VarA;
        }
        a8.a(p8Var, b8Var.f8458g, s7Var, kVar);
        return b8Var;
    }

    public Uri c() {
        return this.f8455d;
    }

    public int d() {
        return this.f8454c;
    }

    public Map e() {
        return this.f8458g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8)) {
            return false;
        }
        b8 b8Var = (b8) obj;
        if (this.f8454c != b8Var.f8454c) {
            return false;
        }
        List list = this.f8452a;
        if (list == null ? b8Var.f8452a != null : !list.equals(b8Var.f8452a)) {
            return false;
        }
        Uri uri = this.f8455d;
        if (uri == null ? b8Var.f8455d != null : !uri.equals(b8Var.f8455d)) {
            return false;
        }
        Set set = this.f8456e;
        if (set == null ? b8Var.f8456e != null : !set.equals(b8Var.f8456e)) {
            return false;
        }
        Map map = this.f8458g;
        Map map2 = b8Var.f8458g;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public u7 f() {
        return this.f8457f;
    }

    public List g() {
        return this.f8452a;
    }

    public int hashCode() {
        List list = this.f8452a;
        int iHashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f8454c) * 31;
        Uri uri = this.f8455d;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set set = this.f8456e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f8458g;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f8452a + ", durationSeconds=" + this.f8454c + ", destinationUri=" + this.f8455d + ", clickTrackers=" + this.f8456e + ", eventTrackers=" + this.f8458g + ", industryIcon=" + this.f8457f + '}';
    }

    public Set b() {
        return this.f8456e;
    }

    private b8(s7 s7Var) {
        List list = Collections.EMPTY_LIST;
        this.f8452a = list;
        this.f8453b = list;
        this.f8456e = new HashSet();
        this.f8458g = new HashMap();
        this.f8453b = s7Var.f();
    }

    private static int a(String str, com.applovin.impl.sdk.k kVar) {
        try {
            List<String> listExplode = CollectionUtils.explode(str, io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER);
            if (listExplode.size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds(StringUtils.parseInt(listExplode.get(0))) + TimeUnit.MINUTES.toSeconds(StringUtils.parseInt(listExplode.get(1))) + ((long) StringUtils.parseInt(listExplode.get(2))));
            }
        } catch (Throwable unused) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    private static List a(p8 p8Var, com.applovin.impl.sdk.k kVar) {
        List listA = p8Var.a(com.taurusx.tax.f.s.f66021n);
        ArrayList arrayList = new ArrayList(listA.size());
        List<String> listExplode = CollectionUtils.explode((String) kVar.a(x4.S4));
        List<String> listExplode2 = CollectionUtils.explode((String) kVar.a(x4.R4));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            c8 c8VarA = c8.a((p8) it.next(), kVar);
            if (c8VarA != null) {
                try {
                    String strC = c8VarA.c();
                    if (StringUtils.isValidString(strC) && !listExplode.contains(strC)) {
                        arrayList.add(c8VarA);
                    } else {
                        if (((Boolean) kVar.a(x4.T4)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(c8VarA.e().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !listExplode2.contains(fileExtensionFromUrl)) {
                                arrayList.add(c8VarA);
                            }
                        }
                        kVar.O();
                        if (com.applovin.impl.sdk.o.a()) {
                            kVar.O().k("VastVideoCreative", "Video file not supported: " + c8VarA);
                        }
                    }
                } catch (Throwable th2) {
                    kVar.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        kVar.O().a("VastVideoCreative", "Failed to validate video file: " + c8VarA, th2);
                    }
                }
            }
        }
        return arrayList;
    }

    public c8 a(long j10) {
        List list = this.f8452a;
        c8 c8Var = null;
        if (list == null || list.size() == 0) {
            return null;
        }
        List<c8> arrayList = new ArrayList(3);
        for (String str : this.f8453b) {
            for (c8 c8Var2 : this.f8452a) {
                String strC = c8Var2.c();
                if (StringUtils.isValidString(strC) && str.equalsIgnoreCase(strC)) {
                    arrayList.add(c8Var2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = this.f8452a;
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.applovin.impl.i9
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b8.a((c8) obj, (c8) obj2);
            }
        });
        for (c8 c8Var3 : arrayList) {
            if (c8Var3.b() > j10) {
                break;
            }
            c8Var = c8Var3;
        }
        return c8Var != null ? c8Var : (c8) arrayList.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(c8 c8Var, c8 c8Var2) {
        return Long.compare(c8Var.b(), c8Var2.b());
    }

    public static b8 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        b8 b8Var = new b8();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "video_files", new JSONArray());
        b8Var.f8452a = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            c8 c8VarA = c8.a(JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null), kVar);
            if (c8VarA != null) {
                b8Var.f8452a.add(c8VarA);
            }
        }
        b8Var.f8453b = JsonUtils.getStringList(jSONObject, "preferred_video_file_types", Collections.EMPTY_LIST);
        b8Var.f8454c = JsonUtils.getInt(jSONObject, "duration_seconds", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        b8Var.f8455d = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, com.taurusx.tax.g.n.f66153a, new JSONArray());
        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
            y7 y7VarA = y7.a(JsonUtils.getJSONObject(jSONArray2, i11, (JSONObject) null), kVar);
            if (y7VarA != null) {
                b8Var.f8456e.add(y7VarA);
            }
        }
        b8Var.f8457f = u7.a(JsonUtils.getJSONObject(jSONObject, "industry_icon", (JSONObject) null), kVar);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "event_trackers", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            HashSet hashSet = new HashSet();
            String next = itKeys.next();
            JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject2, next, new JSONArray());
            for (int i12 = 0; i12 < jSONArray3.length(); i12++) {
                y7 y7VarA2 = y7.a(JsonUtils.getJSONObject(jSONArray3, i12, (JSONObject) null), kVar);
                if (y7VarA2 != null) {
                    hashSet.add(y7VarA2);
                }
            }
            b8Var.f8458g.put(next, hashSet);
        }
        return b8Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        List list = this.f8452a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((c8) it.next()).a());
            }
        }
        JsonUtils.putJsonArray(jSONObject, "video_files", jSONArray);
        JsonUtils.putJsonArray(jSONObject, "preferred_video_file_types", new JSONArray((Collection) this.f8453b));
        JsonUtils.putInt(jSONObject, "duration_seconds", this.f8454c);
        Uri uri = this.f8455d;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.f8456e.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(((y7) it2.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, com.taurusx.tax.g.n.f66153a, jSONArray2);
        u7 u7Var = this.f8457f;
        if (u7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "industry_icon", u7Var.a());
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f8458g.keySet()) {
            Set set = (Set) this.f8458g.get(str);
            if (set != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((y7) it3.next()).a());
                }
                JsonUtils.putJsonArray(jSONObject2, str, jSONArray3);
            }
        }
        JsonUtils.putJSONObject(jSONObject, "event_trackers", jSONObject2);
        return jSONObject;
    }
}
