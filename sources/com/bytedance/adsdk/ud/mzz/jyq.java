package com.bytedance.adsdk.ud.mzz;

import android.util.JsonReader;
import android.util.JsonToken;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
class jyq {
    static <T> List<com.bytedance.adsdk.ud.wd.qdl<T>> qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar, float f10, wc<T> wcVar, boolean z10) throws IOException {
        JsonReader jsonReader2;
        com.bytedance.adsdk.ud.wd wdVar2;
        float f11;
        wc<T> wcVar2;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            wdVar.qdl("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals(CampaignEx.JSON_KEY_AD_K)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    JsonReader jsonReader3 = jsonReader;
                    com.bytedance.adsdk.ud.wd wdVar3 = wdVar;
                    float f12 = f10;
                    wc<T> wcVar3 = wcVar;
                    boolean z12 = z10;
                    com.bytedance.adsdk.ud.wd.qdl qdlVarQdl = aaj.qdl(jsonReader3, wdVar3, f12, wcVar3, false, z12);
                    jsonReader2 = jsonReader3;
                    wdVar2 = wdVar3;
                    f11 = f12;
                    wcVar2 = wcVar3;
                    z11 = z12;
                    arrayList.add(qdlVarQdl);
                } else {
                    jsonReader2 = jsonReader;
                    wdVar2 = wdVar;
                    f11 = f10;
                    wcVar2 = wcVar;
                    z11 = z10;
                    while (jsonReader2.hasNext()) {
                        arrayList.add(aaj.qdl(jsonReader2, wdVar2, f11, wcVar2, true, z11));
                    }
                }
                jsonReader2.endArray();
                jsonReader = jsonReader2;
                wdVar = wdVar2;
                f10 = f11;
                wcVar = wcVar2;
                z10 = z11;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(aaj.qdl(jsonReader4, wdVar, f10, wcVar, false, z10));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.endObject();
        qdl(arrayList);
        return arrayList;
    }

    public static <T> void qdl(List<? extends com.bytedance.adsdk.ud.wd.qdl<T>> list) {
        int i10;
        T t10;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            com.bytedance.adsdk.ud.wd.qdl<T> qdlVar = list.get(i11);
            i11++;
            com.bytedance.adsdk.ud.wd.qdl<T> qdlVar2 = list.get(i11);
            qdlVar.f16148wd = Float.valueOf(qdlVar2.mo);
            if (qdlVar.f16147ud == null && (t10 = qdlVar2.qdl) != null) {
                qdlVar.f16147ud = t10;
                if (qdlVar instanceof com.bytedance.adsdk.ud.qdl.ud.tvp) {
                    ((com.bytedance.adsdk.ud.qdl.ud.tvp) qdlVar).qdl();
                }
            }
        }
        com.bytedance.adsdk.ud.wd.qdl<T> qdlVar3 = list.get(i10);
        if ((qdlVar3.qdl == null || qdlVar3.f16147ud == null) && list.size() > 1) {
            list.remove(qdlVar3);
        }
    }
}
