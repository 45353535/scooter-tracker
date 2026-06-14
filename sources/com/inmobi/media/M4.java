package com.inmobi.media;

import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes9.dex */
public abstract class M4 {
    public static JSONArray a(L4 it, List skipList) {
        Intrinsics.checkNotNullParameter(it, "it");
        Intrinsics.checkNotNullParameter(skipList, "skipList");
        JSONArray jSONArray = new JSONArray();
        List list = L4.f37255j;
        Intrinsics.checkNotNullParameter(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, C4240b4.i.W);
        Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME)) {
            jSONArray.put(it.f37256a);
        }
        Intrinsics.checkNotNullParameter("bid", C4240b4.i.W);
        Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("bid")) {
            jSONArray.put(it.f37257b);
        }
        Intrinsics.checkNotNullParameter("its", C4240b4.i.W);
        Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("its")) {
            jSONArray.put(it.f37258c);
        }
        Intrinsics.checkNotNullParameter("vtm", C4240b4.i.W);
        Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("vtm")) {
            jSONArray.put(it.f37259d);
        }
        Intrinsics.checkNotNullParameter("plid", C4240b4.i.W);
        Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("plid")) {
            jSONArray.put(it.f37260e);
        }
        Intrinsics.checkNotNullParameter("catid", C4240b4.i.W);
        Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("catid")) {
            jSONArray.put(it.f37261f);
        }
        Intrinsics.checkNotNullParameter("hcd", C4240b4.i.W);
        Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("hcd")) {
            jSONArray.put(it.f37262g);
        }
        Intrinsics.checkNotNullParameter("hsv", C4240b4.i.W);
        Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("hsv")) {
            jSONArray.put(it.f37263h);
        }
        Intrinsics.checkNotNullParameter("hcv", C4240b4.i.W);
        Intrinsics.checkNotNullParameter(skipList, "skipList");
        if (!skipList.contains("hcv")) {
            jSONArray.put(it.f37264i);
        }
        return jSONArray;
    }
}
