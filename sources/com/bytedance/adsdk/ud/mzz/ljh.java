package com.bytedance.adsdk.ud.mzz;

import android.graphics.Rect;
import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.bytedance.adsdk.ud.lnr.lnr.mzz;
import com.bytedance.adsdk.ud.to;
import com.bytedance.adsdk.ud.wd;
import com.google.common.base.Ascii;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ljh {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static org.json.JSONArray lnr(android.util.JsonReader r8) {
        /*
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r8.beginArray()     // Catch: java.lang.Exception -> L66
        L8:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Exception -> L66
            if (r1 == 0) goto L63
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L66
            r1.<init>()     // Catch: java.lang.Exception -> L66
            r0.put(r1)     // Catch: java.lang.Exception -> L66
            r8.beginObject()     // Catch: java.lang.Exception -> L66
        L19:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Exception -> L66
            if (r2 == 0) goto L5f
            java.lang.String r2 = r8.nextName()     // Catch: java.lang.Exception -> L66
            int r3 = r2.hashCode()     // Catch: java.lang.Exception -> L66
            r4 = 3324(0xcfc, float:4.658E-42)
            r5 = 1
            java.lang.String r6 = "hd"
            java.lang.String r7 = "vid"
            if (r3 == r4) goto L3e
            r4 = 116753(0x1c811, float:1.63606E-40)
            if (r3 == r4) goto L36
            goto L46
        L36:
            boolean r2 = r2.equals(r7)     // Catch: java.lang.Exception -> L66
            if (r2 == 0) goto L46
            r2 = 0
            goto L47
        L3e:
            boolean r2 = r2.equals(r6)     // Catch: java.lang.Exception -> L66
            if (r2 == 0) goto L46
            r2 = r5
            goto L47
        L46:
            r2 = -1
        L47:
            if (r2 == 0) goto L57
            if (r2 == r5) goto L4f
            r8.skipValue()     // Catch: java.lang.Exception -> L66
            goto L19
        L4f:
            int r2 = r8.nextInt()     // Catch: org.json.JSONException -> L19 java.lang.Exception -> L66
            r1.put(r6, r2)     // Catch: org.json.JSONException -> L19 java.lang.Exception -> L66
            goto L19
        L57:
            java.lang.String r2 = r8.nextString()     // Catch: org.json.JSONException -> L19 java.lang.Exception -> L66
            r1.put(r7, r2)     // Catch: org.json.JSONException -> L19 java.lang.Exception -> L66
            goto L19
        L5f:
            r8.endObject()     // Catch: java.lang.Exception -> L66
            goto L8
        L63:
            r8.endArray()     // Catch: java.lang.Exception -> L66
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ud.mzz.ljh.lnr(android.util.JsonReader):org.json.JSONArray");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<com.bytedance.adsdk.ud.to.qdl> mml(android.util.JsonReader r5) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ud.mzz.ljh.mml(android.util.JsonReader):java.util.List");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static com.bytedance.adsdk.ud.wd qdl(JsonReader jsonReader) throws IOException {
        float f10;
        wd.lnr lnrVar;
        float fQdl = com.bytedance.adsdk.ud.mo.mo.qdl();
        LongSparseArray<com.bytedance.adsdk.ud.lnr.lnr.mzz> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArray<com.bytedance.adsdk.ud.lnr.mml> sparseArray = new SparseArray<>();
        wd.lnr lnrVar2 = new wd.lnr();
        wd.qdl qdlVar = new wd.qdl();
        wd.ud udVar = new wd.ud();
        com.bytedance.adsdk.ud.wd wdVar = new com.bytedance.adsdk.ud.wd();
        jsonReader.beginObject();
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        int iNextInt = 0;
        int iNextInt2 = 0;
        String strNextString = null;
        float fNextDouble3 = 0.0f;
        while (jsonReader.hasNext()) {
            float f11 = fQdl;
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            byte b10 = -1;
            switch (strNextName.hashCode()) {
                case -1408207997:
                    f10 = fNextDouble;
                    if (strNextName.equals(POBCoreNativeConstants.NATIVE_ASSETS)) {
                        b10 = 0;
                    }
                    break;
                case -1109732030:
                    f10 = fNextDouble;
                    if (strNextName.equals("layers")) {
                        b10 = 1;
                    }
                    break;
                case -865448777:
                    f10 = fNextDouble;
                    if (strNextName.equals("globalEvent")) {
                        b10 = 2;
                    }
                    break;
                case 104:
                    f10 = fNextDouble;
                    if (strNextName.equals("h")) {
                        b10 = 3;
                    }
                    break;
                case 118:
                    f10 = fNextDouble;
                    if (strNextName.equals("v")) {
                        b10 = 4;
                    }
                    break;
                case 119:
                    f10 = fNextDouble;
                    if (strNextName.equals(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH)) {
                        b10 = 5;
                    }
                    break;
                case 3208:
                    f10 = fNextDouble;
                    if (strNextName.equals(CmcdConfiguration.KEY_DEADLINE)) {
                        b10 = 6;
                    }
                    break;
                case 3276:
                    f10 = fNextDouble;
                    if (strNextName.equals("fr")) {
                        b10 = 7;
                    }
                    break;
                case 3292:
                    f10 = fNextDouble;
                    if (strNextName.equals("gc")) {
                        b10 = 8;
                    }
                    break;
                case 3367:
                    f10 = fNextDouble;
                    if (strNextName.equals("ip")) {
                        b10 = 9;
                    }
                    break;
                case 3553:
                    f10 = fNextDouble;
                    if (strNextName.equals("op")) {
                        b10 = 10;
                    }
                    break;
                case 94623709:
                    f10 = fNextDouble;
                    if (strNextName.equals("chars")) {
                        b10 = Ascii.VT;
                    }
                    break;
                case 97615364:
                    f10 = fNextDouble;
                    if (strNextName.equals("fonts")) {
                        b10 = Ascii.FF;
                    }
                    break;
                case 110364485:
                    f10 = fNextDouble;
                    if (strNextName.equals("timer")) {
                        b10 = 13;
                    }
                    break;
                case 839250809:
                    f10 = fNextDouble;
                    if (strNextName.equals("markers")) {
                        b10 = Ascii.SO;
                    }
                    break;
                default:
                    f10 = fNextDouble;
                    break;
            }
            switch (b10) {
                case 0:
                    lnrVar = lnrVar2;
                    qdl(jsonReader, wdVar, map, map2);
                    lnrVar2 = lnrVar;
                    fQdl = f11;
                    fNextDouble = f10;
                    break;
                case 1:
                    lnrVar = lnrVar2;
                    qdl(jsonReader, wdVar, arrayList, longSparseArray);
                    lnrVar2 = lnrVar;
                    fQdl = f11;
                    fNextDouble = f10;
                    break;
                case 2:
                    lnrVar = lnrVar2;
                    qdl(jsonReader, udVar);
                    lnrVar2 = lnrVar;
                    fQdl = f11;
                    fNextDouble = f10;
                    break;
                case 3:
                    iNextInt = jsonReader.nextInt();
                    fQdl = f11;
                    fNextDouble = f10;
                    break;
                case 4:
                    lnrVar = lnrVar2;
                    String[] strArrSplit = jsonReader.nextString().split("\\.");
                    if (!com.bytedance.adsdk.ud.mo.mo.qdl(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        wdVar.qdl("Lottie only supports bodymovin >= 4.4.0");
                    }
                    lnrVar2 = lnrVar;
                    fQdl = f11;
                    fNextDouble = f10;
                    break;
                case 5:
                    iNextInt2 = jsonReader.nextInt();
                    fQdl = f11;
                    fNextDouble = f10;
                    break;
                case 6:
                    strNextString = jsonReader.nextString();
                    fQdl = f11;
                    fNextDouble = f10;
                    break;
                case 7:
                    lnrVar = lnrVar2;
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    lnrVar2 = lnrVar;
                    fQdl = f11;
                    fNextDouble = f10;
                    break;
                case 8:
                    lnrVar = lnrVar2;
                    qdl(jsonReader, qdlVar);
                    lnrVar2 = lnrVar;
                    fQdl = f11;
                    fNextDouble = f10;
                    break;
                case 9:
                    lnrVar2 = lnrVar2;
                    fNextDouble = (float) jsonReader.nextDouble();
                    fQdl = f11;
                    break;
                case 10:
                    lnrVar = lnrVar2;
                    fNextDouble3 = ((float) jsonReader.nextDouble()) - 0.01f;
                    lnrVar2 = lnrVar;
                    fQdl = f11;
                    fNextDouble = f10;
                    break;
                case 11:
                    qdl(jsonReader, wdVar, sparseArray);
                    lnrVar = lnrVar2;
                    lnrVar2 = lnrVar;
                    fQdl = f11;
                    fNextDouble = f10;
                    break;
                case 12:
                    qdl(jsonReader, map3);
                    lnrVar = lnrVar2;
                    lnrVar2 = lnrVar;
                    fQdl = f11;
                    fNextDouble = f10;
                    break;
                case 13:
                    qdl(jsonReader, lnrVar2);
                    lnrVar = lnrVar2;
                    lnrVar2 = lnrVar;
                    fQdl = f11;
                    fNextDouble = f10;
                    break;
                case 14:
                    qdl(jsonReader, arrayList2);
                    lnrVar = lnrVar2;
                    lnrVar2 = lnrVar;
                    fQdl = f11;
                    fNextDouble = f10;
                    break;
                default:
                    jsonReader.skipValue();
                    lnrVar = lnrVar2;
                    lnrVar2 = lnrVar;
                    fQdl = f11;
                    fNextDouble = f10;
                    break;
            }
        }
        float f12 = fQdl;
        jsonReader.endObject();
        wdVar.qdl(new Rect(0, 0, (int) (iNextInt2 * f12), (int) (iNextInt * f12)), fNextDouble, fNextDouble3, fNextDouble2, arrayList, longSparseArray, map, map2, sparseArray, map3, arrayList2, lnrVar2, strNextString, qdlVar, udVar);
        return wdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ud(android.util.JsonReader r5, com.bytedance.adsdk.ud.wd.qdl r6) {
        /*
            r5.beginObject()     // Catch: java.io.IOException -> L62
        L3:
            boolean r0 = r5.hasNext()     // Catch: java.io.IOException -> L62
            if (r0 == 0) goto L5f
            java.lang.String r0 = r5.nextName()     // Catch: java.io.IOException -> L62
            int r1 = r0.hashCode()     // Catch: java.io.IOException -> L62
            r2 = 3239(0xca7, float:4.539E-42)
            r3 = 1
            r4 = 2
            if (r1 == r2) goto L35
            r2 = 3276(0xccc, float:4.59E-42)
            if (r1 == r2) goto L2b
            r2 = 107027(0x1a213, float:1.49977E-40)
            if (r1 == r2) goto L21
            goto L3f
        L21:
            java.lang.String r1 = "lel"
            boolean r0 = r0.equals(r1)     // Catch: java.io.IOException -> L62
            if (r0 == 0) goto L3f
            r0 = r4
            goto L40
        L2b:
            java.lang.String r1 = "fr"
            boolean r0 = r0.equals(r1)     // Catch: java.io.IOException -> L62
            if (r0 == 0) goto L3f
            r0 = 0
            goto L40
        L35:
            java.lang.String r1 = "el"
            boolean r0 = r0.equals(r1)     // Catch: java.io.IOException -> L62
            if (r0 == 0) goto L3f
            r0 = r3
            goto L40
        L3f:
            r0 = -1
        L40:
            if (r0 == 0) goto L58
            if (r0 == r3) goto L51
            if (r0 == r4) goto L4a
            r5.skipValue()     // Catch: java.io.IOException -> L62
            goto L3
        L4a:
            org.json.JSONArray r0 = lnr(r5)     // Catch: java.io.IOException -> L62
            r6.f16144wd = r0     // Catch: java.io.IOException -> L62
            goto L3
        L51:
            java.lang.String r0 = r5.nextString()     // Catch: java.io.IOException -> L62
            r6.mo = r0     // Catch: java.io.IOException -> L62
            goto L3
        L58:
            int r0 = r5.nextInt()     // Catch: java.io.IOException -> L62
            r6.mzz = r0     // Catch: java.io.IOException -> L62
            goto L3
        L5f:
            r5.endObject()     // Catch: java.io.IOException -> L62
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ud.mzz.ljh.ud(android.util.JsonReader, com.bytedance.adsdk.ud.wd$qdl):void");
    }

    private static Map<String, Object> ud(JsonReader jsonReader) throws IOException {
        HashMap map = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("lel")) {
                map.put("lel", lnr(jsonReader));
            } else if (!strNextName.equals("lottie_back")) {
                jsonReader.skipValue();
            } else {
                JSONObject jSONObject = new JSONObject();
                map.put("lottie_back", jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("hd")) {
                        try {
                            jSONObject.putOpt("hd", Integer.valueOf(jsonReader.nextInt()));
                            jSONObject.putOpt("vid", "lottie_back");
                        } catch (JSONException unused) {
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            }
        }
        jsonReader.endObject();
        Object objRemove = map.remove("lottie_back");
        if (objRemove instanceof JSONObject) {
            Object obj = map.get("lel");
            if (obj instanceof JSONArray) {
                ((JSONArray) obj).put(objRemove);
            } else {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(objRemove);
                map.put("lel", jSONArray);
            }
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void qdl(android.util.JsonReader r7, com.bytedance.adsdk.ud.wd.ud r8) {
        /*
            r0 = 0
            r1 = 1
            r7.beginObject()     // Catch: java.lang.Exception -> L91
        L5:
            boolean r2 = r7.hasNext()     // Catch: java.lang.Exception -> L91
            if (r2 == 0) goto L8e
            java.lang.String r2 = r7.nextName()     // Catch: java.lang.Exception -> L91
            int r3 = r2.hashCode()     // Catch: java.lang.Exception -> L91
            r4 = 3239(0xca7, float:4.539E-42)
            r5 = 2
            r6 = -1
            if (r3 == r4) goto L38
            r4 = 107027(0x1a213, float:1.49977E-40)
            if (r3 == r4) goto L2e
            r4 = 3237004(0x31648c, float:4.536009E-39)
            if (r3 == r4) goto L24
            goto L42
        L24:
            java.lang.String r3 = "inel"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L91
            if (r2 == 0) goto L42
            r2 = r0
            goto L43
        L2e:
            java.lang.String r3 = "lel"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L91
            if (r2 == 0) goto L42
            r2 = r5
            goto L43
        L38:
            java.lang.String r3 = "el"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L91
            if (r2 == 0) goto L42
            r2 = r1
            goto L43
        L42:
            r2 = r6
        L43:
            if (r2 == 0) goto L5b
            if (r2 == r1) goto L54
            if (r2 == r5) goto L4d
            r7.skipValue()     // Catch: java.lang.Exception -> L91
            goto L5
        L4d:
            org.json.JSONArray r2 = lnr(r7)     // Catch: java.lang.Exception -> L91
            r8.lnr = r2     // Catch: java.lang.Exception -> L91
            goto L5
        L54:
            java.lang.String r2 = r7.nextString()     // Catch: java.lang.Exception -> L91
            r8.qdl = r2     // Catch: java.lang.Exception -> L91
            goto L5
        L5b:
            int[] r2 = new int[]{r6, r6}     // Catch: java.lang.Exception -> L91
            int[][] r3 = new int[r1][]     // Catch: java.lang.Exception -> L91
            r3[r0] = r2     // Catch: java.lang.Exception -> L91
            r8.f16145ud = r3     // Catch: java.lang.Exception -> L91
            r7.beginArray()     // Catch: java.lang.Exception -> L91
            boolean r2 = r7.hasNext()     // Catch: java.lang.Exception -> L91
            if (r2 == 0) goto L89
            r7.beginArray()     // Catch: java.lang.Exception -> L91
            r2 = r0
        L72:
            if (r2 >= r5) goto L86
            boolean r3 = r7.hasNext()     // Catch: java.lang.Exception -> L91
            if (r3 == 0) goto L84
            int[][] r3 = r8.f16145ud     // Catch: java.lang.Exception -> L91
            r3 = r3[r0]     // Catch: java.lang.Exception -> L91
            int r4 = r7.nextInt()     // Catch: java.lang.Exception -> L91
            r3[r2] = r4     // Catch: java.lang.Exception -> L91
        L84:
            int r2 = r2 + r1
            goto L72
        L86:
            r7.endArray()     // Catch: java.lang.Exception -> L91
        L89:
            r7.endArray()     // Catch: java.lang.Exception -> L91
            goto L5
        L8e:
            r7.endObject()     // Catch: java.lang.Exception -> L91
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ud.mzz.ljh.qdl(android.util.JsonReader, com.bytedance.adsdk.ud.wd$ud):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void qdl(android.util.JsonReader r7, com.bytedance.adsdk.ud.wd.qdl r8) {
        /*
            r7.beginObject()     // Catch: java.lang.Exception -> L91
        L3:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Exception -> L91
            if (r0 == 0) goto L8e
            java.lang.String r0 = r7.nextName()     // Catch: java.lang.Exception -> L91
            int r1 = r0.hashCode()     // Catch: java.lang.Exception -> L91
            r2 = 3139(0xc43, float:4.399E-42)
            r3 = 1
            r4 = 2
            r5 = 3
            r6 = 4
            if (r1 == r2) goto L53
            r2 = 3232(0xca0, float:4.529E-42)
            if (r1 == r2) goto L49
            r2 = 3571(0xdf3, float:5.004E-42)
            if (r1 == r2) goto L3f
            r2 = 3666(0xe52, float:5.137E-42)
            if (r1 == r2) goto L35
            r2 = 98713(0x18199, float:1.38326E-40)
            if (r1 == r2) goto L2b
            goto L5d
        L2b:
            java.lang.String r1 = "cpf"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L91
            if (r0 == 0) goto L5d
            r0 = r6
            goto L5e
        L35:
            java.lang.String r1 = "se"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L91
            if (r0 == 0) goto L5d
            r0 = 0
            goto L5e
        L3f:
            java.lang.String r1 = "pc"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L91
            if (r0 == 0) goto L5d
            r0 = r5
            goto L5e
        L49:
            java.lang.String r1 = "ee"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L91
            if (r0 == 0) goto L5d
            r0 = r4
            goto L5e
        L53:
            java.lang.String r1 = "be"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L91
            if (r0 == 0) goto L5d
            r0 = r3
            goto L5e
        L5d:
            r0 = -1
        L5e:
            if (r0 == 0) goto L86
            if (r0 == r3) goto L7e
            if (r0 == r4) goto L77
            if (r0 == r5) goto L70
            if (r0 == r6) goto L6c
            r7.skipValue()     // Catch: java.lang.Exception -> L91
            goto L3
        L6c:
            ud(r7, r8)     // Catch: java.lang.Exception -> L91
            goto L3
        L70:
            int r0 = r7.nextInt()     // Catch: java.lang.Exception -> L91
            r8.mml = r0     // Catch: java.lang.Exception -> L91
            goto L3
        L77:
            java.util.Map r0 = ud(r7)     // Catch: java.lang.Exception -> L91
            r8.lnr = r0     // Catch: java.lang.Exception -> L91
            goto L3
        L7e:
            java.util.Map r0 = ud(r7)     // Catch: java.lang.Exception -> L91
            r8.f16143ud = r0     // Catch: java.lang.Exception -> L91
            goto L3
        L86:
            int r0 = r7.nextInt()     // Catch: java.lang.Exception -> L91
            r8.qdl = r0     // Catch: java.lang.Exception -> L91
            goto L3
        L8e:
            r7.endObject()     // Catch: java.lang.Exception -> L91
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ud.mzz.ljh.qdl(android.util.JsonReader, com.bytedance.adsdk.ud.wd$qdl):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void qdl(android.util.JsonReader r6, com.bytedance.adsdk.ud.wd.lnr r7) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ud.mzz.ljh.qdl(android.util.JsonReader, com.bytedance.adsdk.ud.wd$lnr):void");
    }

    private static void qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar, List<com.bytedance.adsdk.ud.lnr.lnr.mzz> list, LongSparseArray<com.bytedance.adsdk.ud.lnr.lnr.mzz> longSparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.ud.lnr.lnr.mzz mzzVarQdl = oth.qdl(jsonReader, wdVar);
            mzzVarQdl.rq();
            mzz.qdl qdlVar = mzz.qdl.PRE_COMP;
            list.add(mzzVarQdl);
            longSparseArray.put(mzzVarQdl.mzz(), mzzVarQdl);
        }
        jsonReader.endArray();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar, Map<String, List<com.bytedance.adsdk.ud.lnr.lnr.mzz>> map, Map<String, com.bytedance.adsdk.ud.to> map2) throws IOException {
        int i10;
        int i11 = 2;
        int i12 = -1;
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.beginObject();
            int iNextInt = 0;
            int iNextInt2 = 0;
            String strNextString = null;
            String strNextString2 = null;
            String strNextString3 = null;
            String strNextString4 = null;
            List<to.qdl> listMml = null;
            String strNextString5 = null;
            int[][] iArr = null;
            JSONArray jSONArrayLnr = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                switch (strNextName.hashCode()) {
                    case -1109732030:
                        i10 = strNextName.equals("layers") ? 0 : i12;
                        break;
                    case 104:
                        i10 = strNextName.equals("h") ? 1 : i12;
                        break;
                    case 112:
                        i10 = strNextName.equals("p") ? i11 : i12;
                        break;
                    case 117:
                        i10 = strNextName.equals(ApsMetricsDataMap.APSMETRICS_FIELD_URL) ? 3 : i12;
                        break;
                    case 119:
                        i10 = strNextName.equals(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH) ? 4 : i12;
                        break;
                    case 3239:
                        i10 = strNextName.equals("el") ? 5 : i12;
                        break;
                    case 3355:
                        i10 = strNextName.equals("id") ? 6 : i12;
                        break;
                    case 3695:
                        i10 = strNextName.equals("tc") ? 7 : i12;
                        break;
                    case 107027:
                        i10 = strNextName.equals("lel") ? 8 : i12;
                        break;
                    case 112793:
                        i10 = strNextName.equals("rel") ? 9 : i12;
                        break;
                    case 3237004:
                        i10 = strNextName.equals("inel") ? 10 : i12;
                        break;
                    default:
                        i10 = i12;
                        break;
                }
                switch (i10) {
                    case 0:
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.ud.lnr.lnr.mzz mzzVarQdl = oth.qdl(jsonReader, wdVar);
                            longSparseArray.put(mzzVarQdl.mzz(), mzzVarQdl);
                            arrayList.add(mzzVarQdl);
                        }
                        jsonReader.endArray();
                        i11 = 2;
                        i12 = -1;
                        break;
                    case 1:
                        iNextInt2 = jsonReader.nextInt();
                        break;
                    case 2:
                        strNextString2 = jsonReader.nextString();
                        break;
                    case 3:
                        strNextString3 = jsonReader.nextString();
                        break;
                    case 4:
                        iNextInt = jsonReader.nextInt();
                        break;
                    case 5:
                        strNextString5 = jsonReader.nextString();
                        break;
                    case 6:
                        strNextString = jsonReader.nextString();
                        break;
                    case 7:
                        jsonReader.beginArray();
                        listMml = mml(jsonReader);
                        jsonReader.endArray();
                        break;
                    case 8:
                        jSONArrayLnr = lnr(jsonReader);
                        break;
                    case 9:
                        strNextString4 = jsonReader.nextString();
                        break;
                    case 10:
                        int[][] iArr2 = {new int[]{i12, i12}};
                        jsonReader.beginArray();
                        if (jsonReader.hasNext()) {
                            jsonReader.beginArray();
                            for (int i13 = 0; i13 < i11; i13++) {
                                if (jsonReader.hasNext()) {
                                    iArr2[0][i13] = jsonReader.nextInt();
                                }
                            }
                            jsonReader.endArray();
                        }
                        jsonReader.endArray();
                        iArr = iArr2;
                        break;
                    default:
                        jsonReader.skipValue();
                        i11 = 2;
                        i12 = -1;
                        break;
                }
            }
            jsonReader.endObject();
            if (strNextString2 != null) {
                com.bytedance.adsdk.ud.to toVar = new com.bytedance.adsdk.ud.to(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3, strNextString4, listMml, strNextString5, iArr, jSONArrayLnr);
                map2.put(toVar.jpc(), toVar);
            } else {
                map.put(strNextString, arrayList);
            }
            i11 = 2;
            i12 = -1;
        }
        jsonReader.endArray();
    }

    private static void qdl(JsonReader jsonReader, Map<String, com.bytedance.adsdk.ud.lnr.lnr> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("list")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.ud.lnr.lnr lnrVarQdl = rdp.qdl(jsonReader);
                    map.put(lnrVarQdl.ud(), lnrVarQdl);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    private static void qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar, SparseArray<com.bytedance.adsdk.ud.lnr.mml> sparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.ud.lnr.mml mmlVarQdl = exu.qdl(jsonReader, wdVar);
            sparseArray.put(mmlVarQdl.hashCode(), mmlVarQdl);
        }
        jsonReader.endArray();
    }

    private static void qdl(JsonReader jsonReader, List<com.bytedance.adsdk.ud.lnr.mo> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            float fNextDouble = 0.0f;
            String strNextString = null;
            float fNextDouble2 = 0.0f;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "cm":
                        strNextString = jsonReader.nextString();
                        break;
                    case "dr":
                        fNextDouble2 = (float) jsonReader.nextDouble();
                        break;
                    case "tm":
                        fNextDouble = (float) jsonReader.nextDouble();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            list.add(new com.bytedance.adsdk.ud.lnr.mo(strNextString, fNextDouble, fNextDouble2));
        }
        jsonReader.endArray();
    }
}
