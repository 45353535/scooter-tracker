package yads;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kotlinx.serialization.json.b f109075a = rc1.f115402a;

    public static zo a(df1 df1Var) {
        ff1 ff1Var = (ff1) df1Var;
        Set setA = ff1Var.a("BiddingSettingsAdUnitIdsSet", SetsKt.emptySet());
        if (setA == null) {
            setA = SetsKt.emptySet();
        }
        Set setA2 = ff1Var.a("MediationPrefetchSettingsAdUnitIdsSet", SetsKt.emptySet());
        if (setA2 == null) {
            setA2 = SetsKt.emptySet();
        }
        ap apVar = new ap();
        ArrayList arrayList = new ArrayList(setA.size());
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            String strC = ff1Var.c(a((String) it.next()));
            if (strC != null && strC.length() != 0) {
                try {
                    eb ebVarA = apVar.a(new JSONObject(strC));
                    if (ebVarA != null) {
                        arrayList.add(ebVarA);
                    }
                } catch (JSONException unused) {
                    boolean z10 = lb1.f113032a;
                }
            }
        }
        long jB = ff1Var.b("MediationPrefetchLoadTimeoutMillis");
        ArrayList arrayList2 = new ArrayList(setA2.size());
        Iterator it2 = setA2.iterator();
        while (it2.hasNext()) {
            String strC2 = ff1Var.c(b((String) it2.next()));
            if (strC2 != null) {
                kotlinx.serialization.json.b bVar = f109075a;
                bVar.a();
                jq1 jq1Var = (jq1) bVar.c(vg.a.t(jq1.Companion.serializer()), strC2);
                if (jq1Var != null) {
                    arrayList2.add(jq1Var);
                }
            }
        }
        sq1 sq1Var = new sq1(jB, arrayList2);
        if (arrayList.isEmpty() && setA2.isEmpty()) {
            return null;
        }
        return new zo(arrayList, sq1Var);
    }

    public static String b(String str) {
        return "MediationPrefetchSettingsAdUnitIdsInfo_" + str;
    }

    public static void b(df1 df1Var) {
        ff1 ff1Var = (ff1) df1Var;
        Set setA = ff1Var.a("BiddingSettingsAdUnitIdsSet", SetsKt.emptySet());
        if (setA == null) {
            setA = SetsKt.emptySet();
        }
        Set setA2 = ff1Var.a("MediationPrefetchSettingsAdUnitIdsSet", SetsKt.emptySet());
        if (setA2 == null) {
            setA2 = SetsKt.emptySet();
        }
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            ff1Var.d(a((String) it.next()));
        }
        Iterator it2 = setA2.iterator();
        while (it2.hasNext()) {
            ff1Var.d(b((String) it2.next()));
        }
        ff1Var.d("BiddingSettingsAdUnitIdsSet");
        ff1Var.d("MediationPrefetchSettingsAdUnitIdsSet");
    }

    public static String a(String str) {
        return "BiddingSettingsAdUnitIdsInfo_" + str;
    }

    public static void a(df1 df1Var, zo zoVar) {
        List<jq1> listEmptyList;
        List<eb> list = zoVar.f118746b;
        HashSet hashSet = new HashSet(list.size());
        for (eb ebVar : list) {
            String str = ebVar.f110274b;
            String str2 = ebVar.f110276d;
            hashSet.add(str);
            ((ff1) df1Var).a(a(str), str2);
        }
        ff1 ff1Var = (ff1) df1Var;
        Set<String> setA = ff1Var.a("BiddingSettingsAdUnitIdsSet", SetsKt.emptySet());
        if (setA == null) {
            setA = SetsKt.emptySet();
        }
        for (String str3 : setA) {
            if (!hashSet.contains(str3)) {
                ff1Var.d(a(str3));
            }
        }
        ff1Var.a("BiddingSettingsAdUnitIdsSet", hashSet);
        sq1 sq1Var = zoVar.f118747c;
        long j10 = sq1Var != null ? sq1Var.f115899b : 0L;
        if (sq1Var == null || (listEmptyList = sq1Var.f115900c) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        HashSet hashSet2 = new HashSet(listEmptyList.size());
        for (jq1 jq1Var : listEmptyList) {
            hashSet2.add(jq1Var.f112433b);
            String strB = b(jq1Var.f112433b);
            kotlinx.serialization.json.b bVar = f109075a;
            bVar.a();
            ff1Var.a(strB, bVar.b(jq1.Companion.serializer(), jq1Var));
        }
        Set<String> setA2 = ff1Var.a("MediationPrefetchSettingsAdUnitIdsSet", SetsKt.emptySet());
        if (setA2 == null) {
            setA2 = SetsKt.emptySet();
        }
        for (String str4 : setA2) {
            if (!hashSet2.contains(str4)) {
                ff1Var.d(b(str4));
            }
        }
        ff1Var.a("MediationPrefetchSettingsAdUnitIdsSet", hashSet2);
        ff1Var.a("MediationPrefetchLoadTimeoutMillis", j10);
    }
}
