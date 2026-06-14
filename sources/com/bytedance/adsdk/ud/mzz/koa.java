package com.bytedance.adsdk.ud.mzz;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class koa implements wc<PointF> {
    public static final koa qdl = new koa();

    private koa() {
    }

    @Override // com.bytedance.adsdk.ud.mzz.wc
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public PointF ud(JsonReader jsonReader, float f10) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        if (jsonTokenPeek == JsonToken.BEGIN_ARRAY) {
            return exc.ud(jsonReader, f10);
        }
        if (jsonTokenPeek == JsonToken.BEGIN_OBJECT) {
            return exc.ud(jsonReader, f10);
        }
        if (jsonTokenPeek != JsonToken.NUMBER) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(String.valueOf(jsonTokenPeek)));
        }
        PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return pointF;
    }
}
