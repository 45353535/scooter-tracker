package com.my.target;

import android.content.Context;
import android.graphics.Point;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class s4 extends s {
    public static s4 a() {
        return new s4();
    }

    @Override // com.my.target.s
    public t4 a(t4 t4Var, j jVar, n nVar, Context context) {
        e4 e4VarC = t4Var.c();
        if (e4VarC == null) {
            x5 x5VarB = t4Var.b();
            if (x5VarB == null || !x5VarB.b()) {
                nVar.a(m.f60113r);
                return null;
            }
        } else if (!a(context, jVar, e4VarC)) {
            nVar.a(m.f60114s);
            return null;
        }
        return t4Var;
    }

    public final boolean a(Context context, j jVar, e4 e4Var) {
        if (e4Var instanceof o4) {
            return a((o4) e4Var, jVar, context);
        }
        if (e4Var instanceof l4) {
            return a((l4) e4Var, jVar, context);
        }
        if (!(e4Var instanceof j4)) {
            return false;
        }
        a((j4) e4Var, jVar, context);
        return true;
    }

    public final boolean a(o4 o4Var, j jVar, Context context) {
        ArrayList arrayList = new ArrayList();
        s5 s5VarV = o4Var.V();
        if (s5VarV != null) {
            if (s5VarV.V() != null) {
                arrayList.add(s5VarV.V());
            }
            VideoData videoData = (VideoData) s5VarV.k0();
            if (videoData != null && videoData.isCacheable()) {
                sb.a(videoData).a(context);
                if (videoData.a() == null && o4Var.X()) {
                    return false;
                }
            }
        }
        if (o4Var.s() != null) {
            arrayList.add(o4Var.s());
        }
        if (o4Var.q() != null) {
            arrayList.add(o4Var.q());
        }
        if (o4Var.M() != null) {
            arrayList.add(o4Var.M());
        }
        if (o4Var.P() != null) {
            arrayList.add(o4Var.P());
        }
        if (o4Var.a() != null) {
            arrayList.add(o4Var.a().c());
        }
        ImageData imageDataI = o4Var.T().i();
        if (imageDataI != null) {
            arrayList.add(imageDataI);
        }
        List listS = o4Var.S();
        if (!listS.isEmpty()) {
            Iterator it = listS.iterator();
            while (it.hasNext()) {
                ImageData imageDataS = ((g4) it.next()).s();
                if (imageDataS != null) {
                    arrayList.add(imageDataS);
                }
            }
        }
        e4 e4VarR = o4Var.R();
        if (e4VarR != null && !a(context, jVar, e4VarR)) {
            o4Var.a((e4) null);
        }
        if (arrayList.size() <= 0) {
            return true;
        }
        a3.a(arrayList).a(jVar.i(), o4Var.r()).a(context);
        return true;
    }

    public final boolean a(l4 l4Var, j jVar, Context context) {
        ImageData imageDataM;
        ArrayList arrayList = new ArrayList();
        Point pointB = kb.b(context);
        ImageData imageDataA = a(l4Var.S(), Math.min(pointB.x, pointB.y), Math.max(pointB.x, pointB.y));
        if (imageDataA != null) {
            arrayList.add(imageDataA);
            l4Var.g(imageDataA);
        }
        ImageData imageDataA2 = a(l4Var.P(), Math.max(pointB.x, pointB.y), Math.min(pointB.x, pointB.y));
        if (imageDataA2 != null) {
            arrayList.add(imageDataA2);
            l4Var.f(imageDataA2);
        }
        if ((imageDataA != null || imageDataA2 != null) && (imageDataM = l4Var.M()) != null) {
            arrayList.add(imageDataM);
        }
        c cVarA = l4Var.a();
        if (cVarA != null) {
            arrayList.add(cVarA.c());
        }
        if (arrayList.size() > 0) {
            a3.a(arrayList).a(jVar.i(), l4Var.r()).a(context);
            if (imageDataA != null && imageDataA.getBitmap() != null) {
                return true;
            }
            if (imageDataA2 != null && imageDataA2.getBitmap() != null) {
                return true;
            }
        }
        return false;
    }

    public final void a(j4 j4Var, j jVar, Context context) {
        ArrayList arrayList = new ArrayList();
        c cVarA = j4Var.a();
        if (cVarA != null) {
            arrayList.add(cVarA.c());
        }
        ImageData imageDataM = j4Var.M();
        if (imageDataM != null) {
            arrayList.add(imageDataM);
        }
        a3.a(arrayList).a(jVar.i(), j4Var.r()).a(context);
    }

    public final ImageData a(List list, int i10, int i11) {
        float width;
        float f10;
        ImageData imageData = null;
        if (list.size() == 0) {
            return null;
        }
        if (i11 != 0 && i10 != 0) {
            float f11 = i10;
            float f12 = i11;
            float f13 = f11 / f12;
            Iterator it = list.iterator();
            float f14 = 0.0f;
            while (it.hasNext()) {
                ImageData imageData2 = (ImageData) it.next();
                if (imageData2.getWidth() > 0 && imageData2.getHeight() > 0) {
                    float width2 = imageData2.getWidth() / imageData2.getHeight();
                    if (f13 < width2) {
                        width = imageData2.getWidth();
                        if (width > f11) {
                            width = f11;
                        }
                        f10 = width / width2;
                    } else {
                        float height = imageData2.getHeight();
                        if (height > f12) {
                            height = f12;
                        }
                        float f15 = height;
                        width = width2 * height;
                        f10 = f15;
                    }
                    float f16 = f10 * width;
                    if (f16 <= f14) {
                        break;
                    }
                    imageData = imageData2;
                    f14 = f16;
                }
            }
            return imageData;
        }
        gb.a("InterstitialAdResultProcessor: Display size is zero");
        return null;
    }
}
