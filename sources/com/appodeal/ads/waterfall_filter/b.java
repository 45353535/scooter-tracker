package com.appodeal.ads.waterfall_filter;

import android.text.TextUtils;
import com.appodeal.ads.b3;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.te;
import com.appodeal.ads.uc;
import com.appodeal.ads.utils.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f15209a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f15210b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f15211c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f15212d = new HashMap();

    public b(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("name") && jSONObjectOptJSONObject.has("max_requests") && jSONObjectOptJSONObject.has("max_requests_pf") && jSONObjectOptJSONObject.has("max_nofills")) {
                String strOptString = jSONObjectOptJSONObject.optString("name");
                if (!TextUtils.isEmpty(strOptString)) {
                    this.f15209a.put(strOptString, Integer.valueOf(jSONObjectOptJSONObject.optInt("max_requests", Integer.MAX_VALUE)));
                    this.f15210b.put(strOptString, Integer.valueOf(jSONObjectOptJSONObject.optInt("max_requests_pf", Integer.MAX_VALUE)));
                    this.f15211c.put(strOptString, Integer.valueOf(jSONObjectOptJSONObject.optInt("max_nofills", Integer.MAX_VALUE)));
                }
            }
        }
    }

    @Override // com.appodeal.ads.waterfall_filter.e
    public final void a(ArrayList arrayList, te teVar) {
        List list;
        if (arrayList == null) {
            Log.log(LogConstants.KEY_SDK, "ProcessWaterfall", "Waterfall JSON is null or empty");
            return;
        }
        if (teVar != null) {
            b(teVar.f14891c);
            b(teVar.f14892d);
        }
        com.appodeal.ads.utils.campaign_frequency.b.c(arrayList);
        if (!this.f15212d.isEmpty()) {
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            HashMap map4 = new HashMap();
            for (Map.Entry entry : this.f15211c.entrySet()) {
                map.put((String) entry.getKey(), 0);
                map2.put((String) entry.getKey(), 0);
                map3.put((String) entry.getKey(), new ArrayList());
                map4.put((String) entry.getKey(), new ArrayList());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                String strOptString = jSONObject.optString("status");
                String strOptString2 = jSONObject.optString("id");
                boolean zOptBoolean = jSONObject.optBoolean("cap", false);
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && this.f15211c.containsKey(strOptString)) {
                    Integer num = (Integer) this.f15211c.get(strOptString);
                    int iIntValue = num != null ? num.intValue() : 0;
                    Integer num2 = (Integer) this.f15212d.get(strOptString2);
                    if ((num2 != null ? num2.intValue() : 0) >= iIntValue) {
                        if (zOptBoolean) {
                            List list2 = (List) map3.get(strOptString);
                            list2.add(strOptString2);
                            map3.put(strOptString, list2);
                        } else {
                            List list3 = (List) map4.get(strOptString);
                            list3.add(strOptString2);
                            map4.put(strOptString, list3);
                        }
                    } else if (zOptBoolean) {
                        Integer num3 = (Integer) map.get(strOptString);
                        map.put(strOptString, Integer.valueOf((num3 != null ? num3.intValue() : 0) + 1));
                    } else {
                        Integer num4 = (Integer) map2.get(strOptString);
                        map2.put(strOptString, Integer.valueOf((num4 != null ? num4.intValue() : 0) + 1));
                    }
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                if (((Integer) entry2.getValue()).intValue() == 0 && (list = (List) map3.get(entry2.getKey())) != null && !list.isEmpty()) {
                    this.f15212d.keySet().removeAll(list);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        HashMap map5 = new HashMap(this.f15209a);
        HashMap map6 = new HashMap(this.f15210b);
        while (it2.hasNext()) {
            JSONObject jSONObject2 = (JSONObject) it2.next();
            String strOptString3 = jSONObject2.optString("status");
            String strOptString4 = jSONObject2.optString("id");
            boolean zOptBoolean2 = jSONObject2.optBoolean("cap", false);
            if (!TextUtils.isEmpty(strOptString3) && !TextUtils.isEmpty(strOptString4) && this.f15211c.containsKey(strOptString3)) {
                Integer num5 = (Integer) this.f15211c.get(strOptString3);
                int iIntValue2 = num5 != null ? num5.intValue() : 0;
                Integer num6 = (Integer) this.f15212d.get(strOptString4);
                int iIntValue3 = num6 != null ? num6.intValue() : 0;
                if (zOptBoolean2 && iIntValue3 >= iIntValue2) {
                    it2.remove();
                } else if (zOptBoolean2 && map6.containsKey(strOptString3)) {
                    Integer num7 = (Integer) map6.get(strOptString3);
                    int iIntValue4 = num7 != null ? num7.intValue() : 0;
                    if (iIntValue4 > 0) {
                        map6.put(strOptString3, Integer.valueOf(iIntValue4 - 1));
                    } else {
                        it2.remove();
                    }
                } else if (!zOptBoolean2 && map5.containsKey(strOptString3)) {
                    Integer num8 = (Integer) map5.get(strOptString3);
                    int iIntValue5 = num8 != null ? num8.intValue() : 0;
                    if (iIntValue5 > 0) {
                        map5.put(strOptString3, Integer.valueOf(iIntValue5 - 1));
                    } else {
                        it2.remove();
                    }
                }
            }
        }
    }

    public final void b(CopyOnWriteArrayList copyOnWriteArrayList) {
        boolean z10;
        Integer num;
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < copyOnWriteArrayList.size(); i10++) {
            jSONArray.put(((uc) copyOnWriteArrayList.get(i10)).f14937c.f15226c);
        }
        int length = jSONArray.length();
        int i11 = 0;
        while (true) {
            if (i11 >= copyOnWriteArrayList.size()) {
                z10 = false;
                break;
            } else {
                if (((uc) copyOnWriteArrayList.get(i11)).f14937c.f15243t == b3.f13109c) {
                    z10 = true;
                    break;
                }
                i11++;
            }
        }
        if (z10) {
            length--;
        }
        for (int i12 = 0; i12 < length; i12++) {
            String strOptString = jSONArray.optString(i12);
            if (!TextUtils.isEmpty(strOptString)) {
                this.f15212d.put(strOptString, Integer.valueOf(((!this.f15212d.containsKey(strOptString) || (num = (Integer) this.f15212d.get(strOptString)) == null) ? 0 : num.intValue()) + 1));
            }
        }
        if (z10) {
            String strOptString2 = jSONArray.optString(jSONArray.length() - 1);
            if (TextUtils.isEmpty(strOptString2)) {
                return;
            }
            this.f15212d.remove(strOptString2);
        }
    }
}
