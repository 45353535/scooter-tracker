package f1;

import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.sdk.controller.f;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import f1.bf;
import f1.d2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f70541a;

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f70563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f70564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f70565c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f70566d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List f70567e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List f70568f;

        public c(String id2, String nbr, String currency, String bidId, List seatbidList, List assets) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(nbr, "nbr");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(bidId, "bidId");
            Intrinsics.checkNotNullParameter(seatbidList, "seatbidList");
            Intrinsics.checkNotNullParameter(assets, "assets");
            this.f70563a = id2;
            this.f70564b = nbr;
            this.f70565c = currency;
            this.f70566d = bidId;
            this.f70567e = seatbidList;
            this.f70568f = assets;
        }

        public final List a() {
            return this.f70568f;
        }

        public final Map b() {
            List list = this.f70568f;
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(((f9) obj).f69808b, obj);
            }
            return MapsKt.toMutableMap(linkedHashMap);
        }

        public final List c() {
            return this.f70567e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f70563a, cVar.f70563a) && Intrinsics.areEqual(this.f70564b, cVar.f70564b) && Intrinsics.areEqual(this.f70565c, cVar.f70565c) && Intrinsics.areEqual(this.f70566d, cVar.f70566d) && Intrinsics.areEqual(this.f70567e, cVar.f70567e) && Intrinsics.areEqual(this.f70568f, cVar.f70568f);
        }

        public int hashCode() {
            return (((((((((this.f70563a.hashCode() * 31) + this.f70564b.hashCode()) * 31) + this.f70565c.hashCode()) * 31) + this.f70566d.hashCode()) * 31) + this.f70567e.hashCode()) * 31) + this.f70568f.hashCode();
        }

        public String toString() {
            return "OpenRTBModel(id=" + this.f70563a + ", nbr=" + this.f70564b + ", currency=" + this.f70565c + ", bidId=" + this.f70566d + ", seatbidList=" + this.f70567e + ", assets=" + this.f70568f + ")";
        }
    }

    public n7(y base64Wrapper) {
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        this.f70541a = base64Wrapper;
    }

    public final a a(JSONObject jSONObject, b bVar) throws JSONException {
        String string = jSONObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = jSONObject.getString("impid");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        double d10 = jSONObject.getDouble("price");
        String strOptString = jSONObject.optString(C4424m2.f43626y);
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        String strOptString2 = jSONObject.optString("crid");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
        String strOptString3 = jSONObject.optString("adm");
        Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
        return new a(string, string2, d10, strOptString, strOptString2, strOptString3, jSONObject.optInt("mtype"), bVar);
    }

    public final b b(JSONObject jSONObject) throws JSONException {
        List listEmptyList;
        List listEmptyList2;
        d2 d2VarI;
        String strOptString = jSONObject.optString("impressionid");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        String strOptString2 = jSONObject.optString("crtype");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
        String strOptString3 = jSONObject.optString(f.b.f45109c);
        Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
        String strOptString4 = jSONObject.optString("cgn");
        Intrinsics.checkNotNullExpressionValue(strOptString4, "optString(...)");
        String string = jSONObject.getString("template");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String strOptString5 = jSONObject.optString("videoUrl");
        Intrinsics.checkNotNullExpressionValue(strOptString5, "optString(...)");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(POBCoreNativeConstants.NATIVE_IMPRESSION_TRACKER);
        if (jSONArrayOptJSONArray == null || (listEmptyList = vd.a(jSONArrayOptJSONArray)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        String strOptString6 = jSONObject.optString("params");
        Intrinsics.checkNotNullExpressionValue(strOptString6, "optString(...)");
        int iOptInt = jSONObject.optInt("clkp");
        String strOptString7 = jSONObject.optString("baseurl");
        Intrinsics.checkNotNullExpressionValue(strOptString7, "optString(...)");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("infoicon");
        d2 d2Var = (jSONObjectOptJSONObject == null || (d2VarI = i(jSONObjectOptJSONObject)) == null) ? new d2(null, null, null, null, null, null, 63, null) : d2VarI;
        w0 w0VarA = w0.f71423c.a(jSONObject.optString("renderingengine"));
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("scripts");
        if (jSONArrayOptJSONArray2 == null || (listEmptyList2 = vd.a(jSONArrayOptJSONArray2)) == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return new b(strOptString, strOptString2, strOptString3, strOptString4, string, strOptString5, list, strOptString6, iOptInt, strOptString7, d2Var, w0VarA, listEmptyList2);
    }

    public final c c(JSONObject jSONObject, List list, List list2) throws JSONException {
        String string = jSONObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String strOptString = jSONObject.optString("nbr");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        String strOptString2 = jSONObject.optString(BidResponsed.KEY_CUR, "USD");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
        String strOptString3 = jSONObject.optString("bidid");
        Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
        return new c(string, strOptString, strOptString2, strOptString3, list, list2);
    }

    public final f9 d(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String strSubstring = str.substring(StringsKt.B0(str, IOUtils.DIR_SEPARATOR_UNIX, 0, false, 6, null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return new f9("html", strSubstring, str);
    }

    public final f9 e(List list) {
        f9 f9Var = (f9) CollectionsKt.firstOrNull(list);
        return f9Var == null ? new f9("", "", "") : f9Var;
    }

    public final dg f(bf adType, JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(adType, "adType");
        if (jSONObject == null) {
            throw new JSONException("Missing response");
        }
        c cVarN = n(jSONObject);
        a aVarJ = j(m(cVarN.c()).a());
        b bVarB = aVarJ.b();
        f9 f9VarE = e(cVarN.a());
        Map mapB = cVarN.b();
        mapB.put("body", f9VarE);
        String strM = bVarB.m();
        String strB = w4.b(strM);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(POBCoreNativeConstants.NATIVE_IMPRESSION_TRACKER, bVarB.g());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        h(linkedHashMap2, aVarJ, adType);
        return new dg("", bVarB.a(), bVarB.b(), bVarB.f(), bVarB.h(), bVarB.c(), "", bVarB.e(), mapB, strM, strB, "", "", "", 0, "", "dummy_template", f9VarE, linkedHashMap2, bVarB.j(), bVarB.k(), linkedHashMap, aVarJ.a(), bVarB.i(), w4.a(aVarJ.c()), q0.f70796c.a(bVarB.d()), this.f70541a.b(aVarJ.a()));
    }

    public final String g(bf bfVar) {
        if (Intrinsics.areEqual(bfVar, bf.b.f69484g)) {
            return "true";
        }
        if (Intrinsics.areEqual(bfVar, bf.c.f69485g) || Intrinsics.areEqual(bfVar, bf.a.f69483g)) {
            return "false";
        }
        throw new lf.m();
    }

    public final void h(Map map, a aVar, bf bfVar) {
        map.put("{% encoding %}", "base64");
        map.put("{% adm %}", aVar.a());
        map.put("{{ ad_type }}", k(bfVar));
        map.put("{{ show_close_button }}", g(bfVar));
        map.put("{{ preroll_popup }}", "false");
        map.put("{{ post_video_reward_toaster_enabled }}", "false");
        if (Intrinsics.areEqual(bfVar, bf.a.f69483g)) {
            map.put("{% is_banner %}", "true");
        }
    }

    public final d2 i(JSONObject jSONObject) {
        d2.a aVarL;
        d2.a aVarL2;
        d2.a aVarL3;
        String strOptString = jSONObject.optString("imageurl");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        String strOptString2 = jSONObject.optString("clickthroughurl");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
        d2.b bVarA = d2.b.f69571c.a(jSONObject.optInt(C4240b4.i.L));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("margin");
        d2.a aVar = (jSONObjectOptJSONObject == null || (aVarL3 = l(jSONObjectOptJSONObject)) == null) ? new d2.a(0.0d, 0.0d, 3, null) : aVarL3;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("padding");
        d2.a aVar2 = (jSONObjectOptJSONObject2 == null || (aVarL2 = l(jSONObjectOptJSONObject2)) == null) ? new d2.a(0.0d, 0.0d, 3, null) : aVarL2;
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("size");
        return new d2(strOptString, strOptString2, bVarA, aVar, aVar2, (jSONObjectOptJSONObject3 == null || (aVarL = l(jSONObjectOptJSONObject3)) == null) ? new d2.a(0.0d, 0.0d, 3, null) : aVarL);
    }

    public final a j(List list) {
        a aVar = (a) CollectionsKt.firstOrNull(list);
        if (aVar != null) {
            return aVar;
        }
        return new a(null, null, 0.0d, null, null, null, 0, null, 255, null);
    }

    public final String k(bf bfVar) {
        if (Intrinsics.areEqual(bfVar, bf.a.f69483g)) {
            return "10";
        }
        if (Intrinsics.areEqual(bfVar, bf.b.f69484g)) {
            return "8";
        }
        if (Intrinsics.areEqual(bfVar, bf.c.f69485g)) {
            return "9";
        }
        throw new lf.m();
    }

    public final d2.a l(JSONObject jSONObject) {
        return new d2.a(jSONObject.optDouble(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH), jSONObject.optDouble("h"));
    }

    public final d m(List list) {
        d dVar = (d) CollectionsKt.firstOrNull(list);
        if (dVar != null) {
            return dVar;
        }
        return new d(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final c n(JSONObject jSONObject) throws JSONException {
        List<JSONObject> listA;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("seatbid");
        b bVar = new b(null, null, null, null, null, null, null, null, 0, null, null, null, null, 8191, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (jSONArrayOptJSONArray != null && (listA = vd.a(jSONArrayOptJSONArray)) != null) {
            for (JSONObject jSONObject2 : listA) {
                String strOptString = jSONObject2.optString("seat");
                JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("bid");
                if (jSONArrayOptJSONArray2 != null) {
                    Intrinsics.checkNotNull(jSONArrayOptJSONArray2);
                    List<JSONObject> listA2 = vd.a(jSONArrayOptJSONArray2);
                    if (listA2 != null) {
                        for (JSONObject jSONObject3 : listA2) {
                            JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("ext");
                            if (jSONObjectOptJSONObject != null) {
                                Intrinsics.checkNotNull(jSONObjectOptJSONObject);
                                bVar = b(jSONObjectOptJSONObject);
                                f9 f9VarD = d(bVar.l());
                                if (f9VarD != null) {
                                    arrayList.add(f9VarD);
                                }
                            }
                            arrayList2.add(a(jSONObject3, bVar));
                        }
                    }
                }
                Intrinsics.checkNotNull(strOptString);
                arrayList3.add(new d(strOptString, arrayList2));
            }
        }
        return c(jSONObject, arrayList3, arrayList);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f70570b;

        public d(String seat, List bidList) {
            Intrinsics.checkNotNullParameter(seat, "seat");
            Intrinsics.checkNotNullParameter(bidList, "bidList");
            this.f70569a = seat;
            this.f70570b = bidList;
        }

        public final List a() {
            return this.f70570b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.areEqual(this.f70569a, dVar.f70569a) && Intrinsics.areEqual(this.f70570b, dVar.f70570b);
        }

        public int hashCode() {
            return (this.f70569a.hashCode() * 31) + this.f70570b.hashCode();
        }

        public String toString() {
            return "SeatbidModel(seat=" + this.f70569a + ", bidList=" + this.f70570b + ")";
        }

        public /* synthetic */ d(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list);
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f70543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f70544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f70545d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f70546e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f70547f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f70548g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final b f70549h;

        public a(String id2, String impid, double d10, String burl, String crid, String adm, int i10, b ext) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(impid, "impid");
            Intrinsics.checkNotNullParameter(burl, "burl");
            Intrinsics.checkNotNullParameter(crid, "crid");
            Intrinsics.checkNotNullParameter(adm, "adm");
            Intrinsics.checkNotNullParameter(ext, "ext");
            this.f70542a = id2;
            this.f70543b = impid;
            this.f70544c = d10;
            this.f70545d = burl;
            this.f70546e = crid;
            this.f70547f = adm;
            this.f70548g = i10;
            this.f70549h = ext;
        }

        public final String a() {
            return this.f70547f;
        }

        public final b b() {
            return this.f70549h;
        }

        public final int c() {
            return this.f70548g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f70542a, aVar.f70542a) && Intrinsics.areEqual(this.f70543b, aVar.f70543b) && Double.compare(this.f70544c, aVar.f70544c) == 0 && Intrinsics.areEqual(this.f70545d, aVar.f70545d) && Intrinsics.areEqual(this.f70546e, aVar.f70546e) && Intrinsics.areEqual(this.f70547f, aVar.f70547f) && this.f70548g == aVar.f70548g && Intrinsics.areEqual(this.f70549h, aVar.f70549h);
        }

        public int hashCode() {
            return (((((((((((((this.f70542a.hashCode() * 31) + this.f70543b.hashCode()) * 31) + androidx.collection.a.a(this.f70544c)) * 31) + this.f70545d.hashCode()) * 31) + this.f70546e.hashCode()) * 31) + this.f70547f.hashCode()) * 31) + this.f70548g) * 31) + this.f70549h.hashCode();
        }

        public String toString() {
            return "BidModel(id=" + this.f70542a + ", impid=" + this.f70543b + ", price=" + this.f70544c + ", burl=" + this.f70545d + ", crid=" + this.f70546e + ", adm=" + this.f70547f + ", mtype=" + this.f70548g + ", ext=" + this.f70549h + ")";
        }

        public /* synthetic */ a(String str, String str2, double d10, String str3, String str4, String str5, int i10, b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? 0.0d : d10, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? "" : str4, (i11 & 32) == 0 ? str5 : "", (i11 & 64) != 0 ? 0 : i10, (i11 & 128) != 0 ? new b(null, null, null, null, null, null, null, null, 0, null, null, null, null, 8191, null) : bVar);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f70551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f70552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f70553d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f70554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f70555f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f70556g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f70557h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f70558i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f70559j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final d2 f70560k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final w0 f70561l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final List f70562m;

        public b(String impressionid, String crtype, String adId, String cgn, String template, String videoUrl, List imptrackers, String params, int i10, String baseUrl, d2 infoIcon, w0 renderEngine, List scripts) {
            Intrinsics.checkNotNullParameter(impressionid, "impressionid");
            Intrinsics.checkNotNullParameter(crtype, "crtype");
            Intrinsics.checkNotNullParameter(adId, "adId");
            Intrinsics.checkNotNullParameter(cgn, "cgn");
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
            Intrinsics.checkNotNullParameter(imptrackers, "imptrackers");
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
            Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
            Intrinsics.checkNotNullParameter(renderEngine, "renderEngine");
            Intrinsics.checkNotNullParameter(scripts, "scripts");
            this.f70550a = impressionid;
            this.f70551b = crtype;
            this.f70552c = adId;
            this.f70553d = cgn;
            this.f70554e = template;
            this.f70555f = videoUrl;
            this.f70556g = imptrackers;
            this.f70557h = params;
            this.f70558i = i10;
            this.f70559j = baseUrl;
            this.f70560k = infoIcon;
            this.f70561l = renderEngine;
            this.f70562m = scripts;
        }

        public final String a() {
            return this.f70552c;
        }

        public final String b() {
            return this.f70559j;
        }

        public final String c() {
            return this.f70553d;
        }

        public final int d() {
            return this.f70558i;
        }

        public final String e() {
            return this.f70551b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f70550a, bVar.f70550a) && Intrinsics.areEqual(this.f70551b, bVar.f70551b) && Intrinsics.areEqual(this.f70552c, bVar.f70552c) && Intrinsics.areEqual(this.f70553d, bVar.f70553d) && Intrinsics.areEqual(this.f70554e, bVar.f70554e) && Intrinsics.areEqual(this.f70555f, bVar.f70555f) && Intrinsics.areEqual(this.f70556g, bVar.f70556g) && Intrinsics.areEqual(this.f70557h, bVar.f70557h) && this.f70558i == bVar.f70558i && Intrinsics.areEqual(this.f70559j, bVar.f70559j) && Intrinsics.areEqual(this.f70560k, bVar.f70560k) && this.f70561l == bVar.f70561l && Intrinsics.areEqual(this.f70562m, bVar.f70562m);
        }

        public final String f() {
            return this.f70550a;
        }

        public final List g() {
            return this.f70556g;
        }

        public final d2 h() {
            return this.f70560k;
        }

        public int hashCode() {
            return (((((((((((((((((((((((this.f70550a.hashCode() * 31) + this.f70551b.hashCode()) * 31) + this.f70552c.hashCode()) * 31) + this.f70553d.hashCode()) * 31) + this.f70554e.hashCode()) * 31) + this.f70555f.hashCode()) * 31) + this.f70556g.hashCode()) * 31) + this.f70557h.hashCode()) * 31) + this.f70558i) * 31) + this.f70559j.hashCode()) * 31) + this.f70560k.hashCode()) * 31) + this.f70561l.hashCode()) * 31) + this.f70562m.hashCode();
        }

        public final String i() {
            return this.f70557h;
        }

        public final w0 j() {
            return this.f70561l;
        }

        public final List k() {
            return this.f70562m;
        }

        public final String l() {
            return this.f70554e;
        }

        public final String m() {
            return this.f70555f;
        }

        public String toString() {
            return "ExtensionModel(impressionid=" + this.f70550a + ", crtype=" + this.f70551b + ", adId=" + this.f70552c + ", cgn=" + this.f70553d + ", template=" + this.f70554e + ", videoUrl=" + this.f70555f + ", imptrackers=" + this.f70556g + ", params=" + this.f70557h + ", clkp=" + this.f70558i + ", baseUrl=" + this.f70559j + ", infoIcon=" + this.f70560k + ", renderEngine=" + this.f70561l + ", scripts=" + this.f70562m + ")";
        }

        public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, int i10, String str8, d2 d2Var, w0 w0Var, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? "" : str5, (i11 & 32) != 0 ? "" : str6, (i11 & 64) != 0 ? CollectionsKt.emptyList() : list, (i11 & 128) == 0 ? str7 : "", (i11 & 256) != 0 ? q0.f70797d.g() : i10, (i11 & 512) != 0 ? "https://live.chartboost.com" : str8, (i11 & 1024) != 0 ? new d2(null, null, null, null, null, null, 63, null) : d2Var, (i11 & 2048) != 0 ? w0.f71427g : w0Var, (i11 & 4096) != 0 ? CollectionsKt.emptyList() : list2);
        }
    }
}
