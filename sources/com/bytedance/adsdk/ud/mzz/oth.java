package com.bytedance.adsdk.ud.mzz;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.bytedance.adsdk.ud.lnr.lnr.mzz;
import com.google.common.base.Ascii;
import com.mbridge.msdk.foundation.entity.b;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class oth {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ud.mzz.oth$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] qdl;

        static {
            int[] iArr = new int[mzz.ud.values().length];
            qdl = iArr;
            try {
                iArr[mzz.ud.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                qdl[mzz.ud.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static com.bytedance.adsdk.ud.lnr.lnr.mzz qdl(com.bytedance.adsdk.ud.wd wdVar) {
        Rect rectMml = wdVar.mml();
        List list = Collections.EMPTY_LIST;
        return new com.bytedance.adsdk.ud.lnr.lnr.mzz(list, wdVar, "__container", -1L, mzz.qdl.PRE_COMP, -1L, null, list, new com.bytedance.adsdk.ud.lnr.qdl.fs(), 0, 0, 0, 0.0f, 0.0f, rectMml.width(), rectMml.height(), null, null, list, mzz.ud.NONE, null, false, null, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static com.bytedance.adsdk.ud.lnr.lnr.mzz qdl(JsonReader jsonReader, com.bytedance.adsdk.ud.wd wdVar) throws IOException {
        Float f10;
        int i10;
        mzz.ud udVar = mzz.ud.NONE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        String strNextString = "UNSET";
        String strNextString2 = null;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        mzz.ud udVar2 = udVar;
        com.bytedance.adsdk.ud.lnr.qdl.rq rqVarQdl = null;
        com.bytedance.adsdk.ud.lnr.qdl.ud udVarQdl = null;
        com.bytedance.adsdk.ud.lnr.ud.qdl qdlVarQdl = null;
        to toVarQdl = null;
        float fNextDouble = 0.0f;
        float fWd = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        Float f11 = fValueOf;
        long jNextInt = -1;
        float fNextDouble5 = 1.0f;
        int color = 0;
        int iNextInt = 0;
        int iNextInt2 = 0;
        boolean zNextBoolean = false;
        com.bytedance.adsdk.ud.lnr.qdl.fs fsVarQdl = null;
        com.bytedance.adsdk.ud.lnr.qdl.to toVarMo = null;
        long jNextInt2 = 0;
        mzz.qdl qdlVar = null;
        String strNextString3 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            byte b10 = -1;
            switch (strNextName.hashCode()) {
                case -995424086:
                    if (strNextName.equals("parent")) {
                        b10 = 0;
                    }
                    break;
                case -903568142:
                    if (strNextName.equals("shapes")) {
                        b10 = 1;
                    }
                    break;
                case 104:
                    if (strNextName.equals("h")) {
                        b10 = 2;
                    }
                    break;
                case 116:
                    if (strNextName.equals(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP)) {
                        b10 = 3;
                    }
                    break;
                case 119:
                    if (strNextName.equals(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH)) {
                        b10 = 4;
                    }
                    break;
                case 3177:
                    if (strNextName.equals("cl")) {
                        b10 = 5;
                    }
                    break;
                case 3233:
                    if (strNextName.equals("ef")) {
                        b10 = 6;
                    }
                    break;
                case 3324:
                    if (strNextName.equals("hd")) {
                        b10 = 7;
                    }
                    break;
                case 3367:
                    if (strNextName.equals("ip")) {
                        b10 = 8;
                    }
                    break;
                case 3432:
                    if (strNextName.equals("ks")) {
                        b10 = 9;
                    }
                    break;
                case 3519:
                    if (strNextName.equals("nm")) {
                        b10 = 10;
                    }
                    break;
                case 3553:
                    if (strNextName.equals("op")) {
                        b10 = Ascii.VT;
                    }
                    break;
                case 3664:
                    if (strNextName.equals("sc")) {
                        b10 = Ascii.FF;
                    }
                    break;
                case 3669:
                    if (strNextName.equals(b.JSON_KEY_SH)) {
                        b10 = 13;
                    }
                    break;
                case 3679:
                    if (strNextName.equals("sr")) {
                        b10 = Ascii.SO;
                    }
                    break;
                case 3681:
                    if (strNextName.equals("st")) {
                        b10 = Ascii.SI;
                    }
                    break;
                case 3684:
                    if (strNextName.equals("sw")) {
                        b10 = Ascii.DLE;
                    }
                    break;
                case 3705:
                    if (strNextName.equals("tm")) {
                        b10 = 17;
                    }
                    break;
                case 3712:
                    if (strNextName.equals("tt")) {
                        b10 = Ascii.DC2;
                    }
                    break;
                case 3717:
                    if (strNextName.equals("ty")) {
                        b10 = 19;
                    }
                    break;
                case 104415:
                    if (strNextName.equals("ind")) {
                        b10 = Ascii.DC4;
                    }
                    break;
                case 108390670:
                    if (strNextName.equals("refId")) {
                        b10 = Ascii.NAK;
                    }
                    break;
                case 1441620890:
                    if (strNextName.equals("masksProperties")) {
                        b10 = Ascii.SYN;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    jNextInt = jsonReader.nextInt();
                    break;
                case 1:
                    f10 = f11;
                    i10 = color;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.ud.lnr.ud.lnr lnrVarQdl = jpc.qdl(jsonReader, wdVar);
                        if (lnrVarQdl != null) {
                            arrayList2.add(lnrVarQdl);
                        }
                    }
                    jsonReader.endArray();
                    f11 = f10;
                    color = i10;
                    break;
                case 2:
                    f10 = f11;
                    i10 = color;
                    fNextDouble3 = (float) (jsonReader.nextDouble() * ((double) com.bytedance.adsdk.ud.mo.mo.qdl()));
                    f11 = f10;
                    color = i10;
                    break;
                case 3:
                    f10 = f11;
                    i10 = color;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("a")) {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                rqVarQdl = ud.qdl(jsonReader, wdVar);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        } else if (!strNextName2.equals("d")) {
                            jsonReader.skipValue();
                        } else {
                            toVarMo = mml.mo(jsonReader, wdVar);
                        }
                    }
                    jsonReader.endObject();
                    f11 = f10;
                    color = i10;
                    break;
                case 4:
                    f10 = f11;
                    i10 = color;
                    fNextDouble2 = (float) (jsonReader.nextDouble() * ((double) com.bytedance.adsdk.ud.mo.mo.qdl()));
                    f11 = f10;
                    color = i10;
                    break;
                case 5:
                    strNextString2 = jsonReader.nextString();
                    break;
                case 6:
                    f10 = f11;
                    jsonReader.beginArray();
                    ArrayList arrayList3 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName3 = jsonReader.nextName();
                            strNextName3.getClass();
                            if (!strNextName3.equals("nm")) {
                                if (!strNextName3.equals("ty")) {
                                    jsonReader.skipValue();
                                } else {
                                    int iNextInt3 = jsonReader.nextInt();
                                    if (iNextInt3 == 29) {
                                        qdlVarQdl = mzz.qdl(jsonReader, wdVar);
                                    } else if (iNextInt3 == 25) {
                                        toVarQdl = new rq().qdl(jsonReader, wdVar);
                                    }
                                }
                            } else {
                                arrayList3.add(jsonReader.nextString());
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    wdVar.qdl("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList3)));
                    f11 = f10;
                    break;
                case 7:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case 8:
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case 9:
                    fsVarQdl = lnr.qdl(jsonReader, wdVar);
                    break;
                case 10:
                    strNextString = jsonReader.nextString();
                    break;
                case 11:
                    fWd = (float) jsonReader.nextDouble();
                    break;
                case 12:
                    color = Color.parseColor(jsonReader.nextString());
                    break;
                case 13:
                    iNextInt2 = (int) (jsonReader.nextInt() * com.bytedance.adsdk.ud.mo.mo.qdl());
                    break;
                case 14:
                    fNextDouble5 = (float) jsonReader.nextDouble();
                    break;
                case 15:
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case 16:
                    f10 = f11;
                    iNextInt = (int) (jsonReader.nextInt() * com.bytedance.adsdk.ud.mo.mo.qdl());
                    f11 = f10;
                    break;
                case 17:
                    udVarQdl = mml.qdl(jsonReader, wdVar, false);
                    break;
                case 18:
                    f10 = f11;
                    int iNextInt4 = jsonReader.nextInt();
                    if (iNextInt4 >= mzz.ud.values().length) {
                        wdVar.qdl("Unsupported matte type: ".concat(String.valueOf(iNextInt4)));
                        i10 = color;
                        f11 = f10;
                        color = i10;
                    } else {
                        udVar2 = mzz.ud.values()[iNextInt4];
                        int i11 = AnonymousClass1.qdl[udVar2.ordinal()];
                        if (i11 == 1) {
                            wdVar.qdl("Unsupported matte type: Luma");
                        } else if (i11 == 2) {
                            wdVar.qdl("Unsupported matte type: Luma Inverted");
                        }
                        wdVar.qdl(1);
                        f11 = f10;
                    }
                    break;
                case 19:
                    f10 = f11;
                    int iNextInt5 = jsonReader.nextInt();
                    qdlVar = mzz.qdl.UNKNOWN;
                    if (iNextInt5 < qdlVar.ordinal()) {
                        qdlVar = mzz.qdl.values()[iNextInt5];
                    }
                    f11 = f10;
                    break;
                case 20:
                    f10 = f11;
                    jNextInt2 = jsonReader.nextInt();
                    f11 = f10;
                    break;
                case 21:
                    strNextString3 = jsonReader.nextString();
                    break;
                case 22:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(bch.qdl(jsonReader, wdVar));
                    }
                    wdVar.qdl(arrayList.size());
                    jsonReader.endArray();
                    f10 = f11;
                    i10 = color;
                    f11 = f10;
                    color = i10;
                    break;
                default:
                    jsonReader.skipValue();
                    f10 = f11;
                    i10 = color;
                    f11 = f10;
                    color = i10;
                    break;
            }
        }
        Float f12 = f11;
        int i12 = color;
        jsonReader.endObject();
        ArrayList arrayList4 = new ArrayList();
        if (fNextDouble > 0.0f) {
            arrayList4.add(new com.bytedance.adsdk.ud.wd.qdl(wdVar, f12, f12, null, 0.0f, Float.valueOf(fNextDouble)));
        }
        if (fWd <= 0.0f) {
            fWd = wdVar.wd();
        }
        arrayList4.add(new com.bytedance.adsdk.ud.wd.qdl(wdVar, fValueOf2, fValueOf2, null, fNextDouble, Float.valueOf(fWd)));
        arrayList4.add(new com.bytedance.adsdk.ud.wd.qdl(wdVar, f12, f12, null, fWd, Float.valueOf(Float.MAX_VALUE)));
        if (strNextString.endsWith(".ai") || "ai".equals(strNextString2)) {
            wdVar.qdl("Convert your Illustrator layers to shape layers.");
        }
        return new com.bytedance.adsdk.ud.lnr.lnr.mzz(arrayList2, wdVar, strNextString, jNextInt2, qdlVar, jNextInt, strNextString3, arrayList, fsVarQdl, iNextInt, iNextInt2, i12, fNextDouble5, fNextDouble4, fNextDouble2, fNextDouble3, toVarMo, rqVarQdl, arrayList4, udVar2, udVarQdl, zNextBoolean, qdlVarQdl, toVarQdl);
    }
}
