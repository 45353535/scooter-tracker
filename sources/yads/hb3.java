package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class hb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f111537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yd3 f111538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public om3 f111539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f111540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f111541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f111542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f111543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f111544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ui3 f111545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f111546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f111547k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f111548l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f111549m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f111550n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public rb3 f111551o;

    public hb3(boolean z10, yd3 yd3Var) {
        this.f111537a = z10;
        this.f111538b = yd3Var;
        MapsKt.emptyMap();
        this.f111550n = new LinkedHashMap();
        this.f111551o = new rb3();
    }

    public final hb3 a(Map map) {
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List listEmptyList = (List) entry.getValue();
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            for (String str2 : CollectionsKt.filterNotNull(listEmptyList)) {
                LinkedHashMap linkedHashMap = this.f111550n;
                Object arrayList = linkedHashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(str, arrayList);
                }
                ((List) arrayList).add(str2);
            }
        }
        return this;
    }

    public final ib3 a() {
        yd3 yd3Var = this.f111538b;
        Map mutableMap = this.f111550n;
        ui3 ui3Var = this.f111545i;
        yd3Var.getClass();
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(yd3Var.f118166a);
        if (hr2VarA == null || !hr2VarA.f111737l) {
            mutableMap = MapsKt.toMutableMap(mutableMap);
            List list = ui3Var != null ? ui3Var.f116669a : null;
            List list2 = (List) mutableMap.get("impression");
            if (list != null) {
                mutableMap.put("impression", list);
            } else {
                mutableMap.remove("impression");
            }
            if (list2 != null) {
                mutableMap.put("render_impression", list2);
            } else {
                mutableMap.remove("render_impression");
            }
        }
        return new ib3(this.f111537a, this.f111548l, this.f111550n, this.f111551o, this.f111540d, this.f111541e, this.f111542f, this.f111543g, this.f111544h, this.f111545i, this.f111546j, this.f111547k, this.f111539c, this.f111549m, mutableMap);
    }
}
