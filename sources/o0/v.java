package o0;

import android.graphics.Color;
import android.graphics.Rect;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m0.e;
import p0.c;

/* JADX INFO: loaded from: classes5.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f96305a = c.a.a("nm", "ind", "refId", "ty", "parent", "sw", com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, "sc", "ks", "tt", "masksProperties", "shapes", ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "ef", "sr", "st", POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c.a f96306b = c.a.a("d", "a");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c.a f96307c = c.a.a("ty", "nm");

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f96308a;

        static {
            int[] iArr = new int[e.b.values().length];
            f96308a = iArr;
            try {
                iArr[e.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f96308a[e.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static m0.e a(d0.i iVar) {
        Rect rectB = iVar.b();
        List list = Collections.EMPTY_LIST;
        return new m0.e(list, iVar, "__container", -1L, e.a.PRE_COMP, -1L, null, list, new k0.n(), 0, 0, 0, 0.0f, 0.0f, rectB.width(), rectB.height(), null, null, list, e.b.NONE, null, false, null, null, l0.h.NORMAL);
    }

    public static m0.e b(p0.c cVar, d0.i iVar) {
        Float f10;
        ArrayList arrayList;
        boolean z10;
        float f11;
        ArrayList arrayList2;
        float f12;
        float f13;
        e.b bVar = e.b.NONE;
        l0.h hVar = l0.h.NORMAL;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        cVar.beginObject();
        boolean z11 = false;
        float f14 = 0.0f;
        Float fValueOf = Float.valueOf(0.0f);
        float fNextDouble = 1.0f;
        Float fValueOf2 = Float.valueOf(1.0f);
        l0.h hVar2 = hVar;
        k0.j jVarD = null;
        k0.k kVarA = null;
        k0.b bVarF = null;
        l0.a aVarB = null;
        j jVarB = null;
        boolean z12 = false;
        int iNextInt = 0;
        int iNextInt2 = 0;
        int color = 0;
        boolean zM = false;
        long jNextInt = 0;
        float fNextDouble2 = 0.0f;
        float f15 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        e.b bVar2 = bVar;
        long jNextInt2 = -1;
        String strNextString = "UNSET";
        String strNextString2 = null;
        k0.n nVar = null;
        e.a aVar = null;
        String strNextString3 = null;
        float fNextDouble5 = 0.0f;
        while (cVar.hasNext()) {
            switch (cVar.q(f96305a)) {
                case 0:
                    strNextString = cVar.nextString();
                    z11 = false;
                    break;
                case 1:
                    jNextInt = cVar.nextInt();
                    z11 = false;
                    break;
                case 2:
                    strNextString3 = cVar.nextString();
                    z11 = false;
                    break;
                case 3:
                    f11 = f14;
                    int iNextInt3 = cVar.nextInt();
                    aVar = e.a.UNKNOWN;
                    if (iNextInt3 < aVar.ordinal()) {
                        aVar = e.a.values()[iNextInt3];
                    }
                    f14 = f11;
                    z11 = false;
                    break;
                case 4:
                    jNextInt2 = cVar.nextInt();
                    z11 = false;
                    break;
                case 5:
                    iNextInt = (int) (cVar.nextInt() * q0.p.e());
                    z11 = false;
                    break;
                case 6:
                    iNextInt2 = (int) (cVar.nextInt() * q0.p.e());
                    z11 = false;
                    break;
                case 7:
                    color = Color.parseColor(cVar.nextString());
                    z11 = false;
                    break;
                case 8:
                    nVar = c.g(cVar, iVar);
                    z11 = false;
                    break;
                case 9:
                    f11 = f14;
                    int iNextInt4 = cVar.nextInt();
                    if (iNextInt4 >= e.b.values().length) {
                        iVar.a("Unsupported matte type: " + iNextInt4);
                    } else {
                        bVar2 = e.b.values()[iNextInt4];
                        int i10 = a.f96308a[bVar2.ordinal()];
                        if (i10 == 1) {
                            iVar.a("Unsupported matte type: Luma");
                        } else if (i10 == 2) {
                            iVar.a("Unsupported matte type: Luma Inverted");
                        }
                        iVar.r(1);
                    }
                    f14 = f11;
                    z11 = false;
                    break;
                case 10:
                    f11 = f14;
                    cVar.beginArray();
                    while (cVar.hasNext()) {
                        arrayList3.add(x.a(cVar, iVar));
                    }
                    iVar.r(arrayList3.size());
                    cVar.endArray();
                    f14 = f11;
                    z11 = false;
                    break;
                case 11:
                    ArrayList arrayList5 = arrayList4;
                    f11 = f14;
                    cVar.beginArray();
                    while (cVar.hasNext()) {
                        l0.c cVarA = h.a(cVar, iVar);
                        ArrayList arrayList6 = arrayList5;
                        if (cVarA != null) {
                            arrayList6.add(cVarA);
                        }
                        arrayList5 = arrayList6;
                    }
                    arrayList4 = arrayList5;
                    cVar.endArray();
                    f14 = f11;
                    z11 = false;
                    break;
                case 12:
                    arrayList2 = arrayList4;
                    f12 = f14;
                    cVar.beginObject();
                    while (cVar.hasNext()) {
                        int iQ = cVar.q(f96306b);
                        if (iQ == 0) {
                            jVarD = d.d(cVar, iVar);
                        } else if (iQ != 1) {
                            cVar.s();
                            cVar.skipValue();
                        } else {
                            cVar.beginArray();
                            if (cVar.hasNext()) {
                                kVarA = b.a(cVar, iVar);
                            }
                            while (cVar.hasNext()) {
                                cVar.skipValue();
                            }
                            cVar.endArray();
                        }
                    }
                    cVar.endObject();
                    f14 = f12;
                    arrayList4 = arrayList2;
                    z11 = false;
                    break;
                case 13:
                    arrayList2 = arrayList4;
                    f12 = f14;
                    cVar.beginArray();
                    ArrayList arrayList7 = new ArrayList();
                    while (cVar.hasNext()) {
                        cVar.beginObject();
                        while (cVar.hasNext()) {
                            int iQ2 = cVar.q(f96307c);
                            if (iQ2 == 0) {
                                int iNextInt5 = cVar.nextInt();
                                if (iNextInt5 == 29) {
                                    aVarB = e.b(cVar, iVar);
                                } else if (iNextInt5 == 25) {
                                    jVarB = new k().b(cVar, iVar);
                                }
                            } else if (iQ2 != 1) {
                                cVar.s();
                                cVar.skipValue();
                            } else {
                                arrayList7.add(cVar.nextString());
                            }
                        }
                        cVar.endObject();
                    }
                    cVar.endArray();
                    iVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList7);
                    f14 = f12;
                    arrayList4 = arrayList2;
                    z11 = false;
                    break;
                case 14:
                    fNextDouble = (float) cVar.nextDouble();
                    z11 = false;
                    break;
                case 15:
                    fNextDouble5 = (float) cVar.nextDouble();
                    z11 = false;
                    break;
                case 16:
                    arrayList2 = arrayList4;
                    fNextDouble3 = (float) (cVar.nextDouble() * ((double) q0.p.e()));
                    arrayList4 = arrayList2;
                    z11 = false;
                    break;
                case 17:
                    f12 = f14;
                    arrayList2 = arrayList4;
                    fNextDouble4 = (float) (cVar.nextDouble() * ((double) q0.p.e()));
                    f14 = f12;
                    arrayList4 = arrayList2;
                    z11 = false;
                    break;
                case 18:
                    fNextDouble2 = (float) cVar.nextDouble();
                    break;
                case 19:
                    f15 = (float) cVar.nextDouble();
                    break;
                case 20:
                    bVarF = d.f(cVar, iVar, z11);
                    break;
                case 21:
                    strNextString2 = cVar.nextString();
                    break;
                case 22:
                    zM = cVar.m();
                    break;
                case 23:
                    f13 = f14;
                    z12 = cVar.nextInt() == 1 ? true : z11;
                    f14 = f13;
                    break;
                case 24:
                    int iNextInt6 = cVar.nextInt();
                    if (iNextInt6 < l0.h.values().length) {
                        hVar2 = l0.h.values()[iNextInt6];
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        f13 = f14;
                        sb2.append("Unsupported Blend Mode: ");
                        sb2.append(iNextInt6);
                        iVar.a(sb2.toString());
                        hVar2 = l0.h.NORMAL;
                        f14 = f13;
                    }
                    break;
                default:
                    cVar.s();
                    cVar.skipValue();
                    f11 = f14;
                    f14 = f11;
                    z11 = false;
                    break;
            }
        }
        float f16 = f14;
        cVar.endObject();
        ArrayList arrayList8 = new ArrayList();
        if (fNextDouble2 > f16) {
            arrayList = arrayList4;
            z10 = z12;
            f10 = fValueOf;
            arrayList8.add(new r0.a(iVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fNextDouble2)));
        } else {
            f10 = fValueOf;
            arrayList = arrayList4;
            z10 = z12;
        }
        if (f15 <= f16) {
            f15 = iVar.f();
        }
        arrayList8.add(new r0.a(iVar, fValueOf2, fValueOf2, null, fNextDouble2, Float.valueOf(f15)));
        arrayList8.add(new r0.a(iVar, f10, f10, null, f15, Float.valueOf(Float.MAX_VALUE)));
        if (strNextString.endsWith(".ai") || "ai".equals(strNextString2)) {
            iVar.a("Convert your Illustrator layers to shape layers.");
        }
        if (z10) {
            if (nVar == null) {
                nVar = new k0.n();
            }
            nVar.m(z10);
        }
        return new m0.e(arrayList, iVar, strNextString, jNextInt, aVar, jNextInt2, strNextString3, arrayList3, nVar, iNextInt, iNextInt2, color, fNextDouble, fNextDouble5, fNextDouble3, fNextDouble4, jVarD, kVarA, arrayList8, bVar2, bVarF, zM, aVarB, jVarB, hVar2);
    }
}
