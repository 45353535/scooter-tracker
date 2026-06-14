package com.my.target;

import android.content.Context;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.VideoData;
import com.my.target.y5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class n7 extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f60190a = a2.f59081e;

    public static n7 a() {
        return new n7();
    }

    public final void a(x5 x5Var, final long j10) {
        x5Var.a(new l1() { // from class: k5.m1
            @Override // com.my.target.l1
            public final void a(Object obj) {
                this.f86086a.a(j10, (y5) obj);
            }
        });
    }

    public final /* synthetic */ void a(long j10, y5 y5Var) {
        if (y5Var.j() && (y5Var.g() instanceof o7)) {
            this.f60190a.a(((o7) y5Var.g()).c(), j10);
        }
    }

    @Override // com.my.target.s
    public o7 a(o7 o7Var, j jVar, n nVar, Context context) {
        List<b7> listC = o7Var.c();
        if (listC.isEmpty()) {
            x5 x5VarB = o7Var.b();
            if (x5VarB != null && x5VarB.b()) {
                a(x5VarB, o7Var.e());
                return o7Var;
            }
            nVar.a(m.f60113r);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iF = jVar.f();
        boolean z10 = iF == 0 || iF == 1;
        this.f60190a.a(listC, o7Var.e());
        for (b7 b7Var : listC) {
            s5 s5VarP = b7Var.P();
            if (s5VarP != null) {
                VideoData videoData = (VideoData) s5VarP.k0();
                boolean z11 = iF == 0 || iF == 2;
                if (videoData != null && z11 && videoData.isCacheable()) {
                    arrayList2.add(new p5(videoData, b7Var.d()));
                }
            }
            ImageData imageDataS = b7Var.s();
            if (imageDataS != null) {
                imageDataS.useCache(true);
                if (z10) {
                    arrayList.add(new p5(imageDataS, b7Var.d()));
                }
            }
            ImageData imageDataQ = b7Var.q();
            if (imageDataQ != null) {
                imageDataQ.useCache(true);
                if (z10) {
                    arrayList.add(new p5(imageDataQ, b7Var.d()));
                }
            }
            Iterator it = b7Var.O().iterator();
            while (it.hasNext()) {
                ImageData imageDataS2 = ((d7) it.next()).s();
                if (imageDataS2 != null) {
                    imageDataS2.useCache(true);
                    if (z10) {
                        arrayList.add(new p5(imageDataS2, b7Var.d()));
                    }
                }
            }
            c cVarA = b7Var.a();
            if (cVarA != null) {
                ImageData imageDataC = cVarA.c();
                imageDataC.useCache(true);
                if (z10) {
                    arrayList.add(new p5(imageDataC, b7Var.d()));
                }
            }
            ImageData imageDataM = b7Var.M();
            if (imageDataM != null) {
                arrayList.add(new p5(imageDataM, b7Var.d()));
            }
        }
        if (arrayList.size() > 0) {
            a3.b(arrayList).a(jVar.i(), (String) null).a(context);
        }
        if (arrayList2.size() > 0) {
            sb.a(arrayList2).a(context);
        }
        return o7Var;
    }
}
