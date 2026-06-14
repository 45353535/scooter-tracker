package com.bytedance.adsdk.ud.mzz;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
class exc {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ud.mzz.exc$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] qdl;

        static {
            int[] iArr = new int[JsonToken.values().length];
            qdl = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qdl[JsonToken.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                qdl[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static PointF lnr(JsonReader jsonReader, float f10) throws IOException {
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new PointF(fNextDouble * f10, fNextDouble2 * f10);
    }

    private static PointF mml(JsonReader jsonReader, float f10) throws IOException {
        jsonReader.beginArray();
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.peek() != JsonToken.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return new PointF(fNextDouble * f10, fNextDouble2 * f10);
    }

    private static PointF mzz(JsonReader jsonReader, float f10) throws IOException {
        jsonReader.beginObject();
        float fUd = 0.0f;
        float fUd2 = 0.0f;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("x")) {
                fUd = ud(jsonReader);
            } else if (strNextName.equals("y")) {
                fUd2 = ud(jsonReader);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new PointF(fUd * f10, fUd2 * f10);
    }

    static int qdl(JsonReader jsonReader) throws IOException {
        jsonReader.beginArray();
        int iNextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    static PointF ud(JsonReader jsonReader, float f10) throws IOException {
        int i10 = AnonymousClass1.qdl[jsonReader.peek().ordinal()];
        if (i10 == 1) {
            return lnr(jsonReader, f10);
        }
        if (i10 == 2) {
            return mml(jsonReader, f10);
        }
        if (i10 == 3) {
            return mzz(jsonReader, f10);
        }
        throw new IllegalArgumentException("Unknown point starts with " + jsonReader.peek());
    }

    static float ud(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i10 = AnonymousClass1.qdl[jsonTokenPeek.ordinal()];
        if (i10 == 1) {
            return (float) jsonReader.nextDouble();
        }
        if (i10 == 2) {
            jsonReader.beginArray();
            float fNextDouble = (float) jsonReader.nextDouble();
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            jsonReader.endArray();
            return fNextDouble;
        }
        throw new IllegalArgumentException("Unknown value for token of type ".concat(String.valueOf(jsonTokenPeek)));
    }

    static List<PointF> qdl(JsonReader jsonReader, float f10) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(ud(jsonReader, f10));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }
}
