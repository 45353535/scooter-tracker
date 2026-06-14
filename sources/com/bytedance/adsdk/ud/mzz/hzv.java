package com.bytedance.adsdk.ud.mzz;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class hzv implements wc<com.bytedance.adsdk.ud.lnr.ud.rdp> {
    public static final hzv qdl = new hzv();

    private hzv() {
    }

    @Override // com.bytedance.adsdk.ud.mzz.wc
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ud.lnr.ud.rdp ud(JsonReader jsonReader, float f10) throws IOException {
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> listQdl = null;
        boolean zNextBoolean = false;
        List<PointF> listQdl2 = null;
        List<PointF> listQdl3 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "c":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "i":
                    listQdl2 = exc.qdl(jsonReader, f10);
                    break;
                case "o":
                    listQdl3 = exc.qdl(jsonReader, f10);
                    break;
                case "v":
                    listQdl = exc.qdl(jsonReader, f10);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (jsonReader.peek() == JsonToken.END_ARRAY) {
            jsonReader.endArray();
        }
        if (listQdl == null || listQdl2 == null || listQdl3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listQdl.isEmpty()) {
            return new com.bytedance.adsdk.ud.lnr.ud.rdp(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = listQdl.size();
        PointF pointF = listQdl.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 1; i10 < size; i10++) {
            PointF pointF2 = listQdl.get(i10);
            int i11 = i10 - 1;
            arrayList.add(new com.bytedance.adsdk.ud.lnr.qdl(com.bytedance.adsdk.ud.mo.mzz.qdl(listQdl.get(i11), listQdl3.get(i11)), com.bytedance.adsdk.ud.mo.mzz.qdl(pointF2, listQdl2.get(i10)), pointF2));
        }
        if (zNextBoolean) {
            PointF pointF3 = listQdl.get(0);
            int i12 = size - 1;
            arrayList.add(new com.bytedance.adsdk.ud.lnr.qdl(com.bytedance.adsdk.ud.mo.mzz.qdl(listQdl.get(i12), listQdl3.get(i12)), com.bytedance.adsdk.ud.mo.mzz.qdl(pointF3, listQdl2.get(0)), pointF3));
        }
        return new com.bytedance.adsdk.ud.lnr.ud.rdp(pointF, zNextBoolean, arrayList);
    }
}
