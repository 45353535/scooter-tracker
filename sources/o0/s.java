package o0;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p0.c;

/* JADX INFO: loaded from: classes5.dex */
abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c.a f96298a = c.a.a("x", "y");

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f96299a;

        static {
            int[] iArr = new int[c.b.values().length];
            f96299a = iArr;
            try {
                iArr[c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f96299a[c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f96299a[c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static PointF a(p0.c cVar, float f10) {
        cVar.beginArray();
        float fNextDouble = (float) cVar.nextDouble();
        float fNextDouble2 = (float) cVar.nextDouble();
        while (cVar.o() != c.b.END_ARRAY) {
            cVar.skipValue();
        }
        cVar.endArray();
        return new PointF(fNextDouble * f10, fNextDouble2 * f10);
    }

    private static PointF b(p0.c cVar, float f10) {
        float fNextDouble = (float) cVar.nextDouble();
        float fNextDouble2 = (float) cVar.nextDouble();
        while (cVar.hasNext()) {
            cVar.skipValue();
        }
        return new PointF(fNextDouble * f10, fNextDouble2 * f10);
    }

    private static PointF c(p0.c cVar, float f10) {
        cVar.beginObject();
        float fG = 0.0f;
        float fG2 = 0.0f;
        while (cVar.hasNext()) {
            int iQ = cVar.q(f96298a);
            if (iQ == 0) {
                fG = g(cVar);
            } else if (iQ != 1) {
                cVar.s();
                cVar.skipValue();
            } else {
                fG2 = g(cVar);
            }
        }
        cVar.endObject();
        return new PointF(fG * f10, fG2 * f10);
    }

    static int d(p0.c cVar) {
        cVar.beginArray();
        int iNextDouble = (int) (cVar.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (cVar.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (cVar.nextDouble() * 255.0d);
        while (cVar.hasNext()) {
            cVar.skipValue();
        }
        cVar.endArray();
        return Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    static PointF e(p0.c cVar, float f10) {
        int i10 = a.f96299a[cVar.o().ordinal()];
        if (i10 == 1) {
            return b(cVar, f10);
        }
        if (i10 == 2) {
            return a(cVar, f10);
        }
        if (i10 == 3) {
            return c(cVar, f10);
        }
        throw new IllegalArgumentException("Unknown point starts with " + cVar.o());
    }

    static List f(p0.c cVar, float f10) {
        ArrayList arrayList = new ArrayList();
        cVar.beginArray();
        while (cVar.o() == c.b.BEGIN_ARRAY) {
            cVar.beginArray();
            arrayList.add(e(cVar, f10));
            cVar.endArray();
        }
        cVar.endArray();
        return arrayList;
    }

    static float g(p0.c cVar) {
        c.b bVarO = cVar.o();
        int i10 = a.f96299a[bVarO.ordinal()];
        if (i10 == 1) {
            return (float) cVar.nextDouble();
        }
        if (i10 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + bVarO);
        }
        cVar.beginArray();
        float fNextDouble = (float) cVar.nextDouble();
        while (cVar.hasNext()) {
            cVar.skipValue();
        }
        cVar.endArray();
        return fNextDouble;
    }
}
