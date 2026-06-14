package sg.bigo.ads.controller.loader;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.ad.c;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.b.i;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static int a(b[] bVarArr) {
        b bVar = (b) k.b(bVarArr);
        if (bVar != null) {
            return bVar.w();
        }
        return 0;
    }

    public static void a(@NonNull Ad ad2, String str) {
        b[] bVarArrA = a(ad2);
        if (k.a(bVarArrA)) {
            return;
        }
        for (b bVar : bVarArrA) {
            bVar.a(str);
        }
    }

    public static void a(b[] bVarArr, int i10) {
        if (k.a(bVarArr)) {
            return;
        }
        for (b bVar : bVarArr) {
            if (bVar != null) {
                bVar.b(i10);
            }
        }
    }

    public static void a(b[] bVarArr, int i10, int i11, boolean z10) {
        if (k.a(bVarArr)) {
            return;
        }
        for (b bVar : bVarArr) {
            if (bVar != null) {
                bVar.a(i10, i11, z10);
            }
        }
    }

    @Nullable
    public static b[] a(@NonNull Ad ad2) {
        if (ad2 instanceof i) {
            return ((i) ad2).a();
        }
        if (ad2 instanceof c) {
            return new b[]{((c) ad2).f()};
        }
        return null;
    }

    @Nullable
    public static b[] a(@NonNull f... fVarArr) {
        if (k.a(fVarArr)) {
            return null;
        }
        b[] bVarArr = new b[fVarArr.length];
        for (int i10 = 0; i10 < fVarArr.length; i10++) {
            bVarArr[i10] = fVarArr[i10].f102174a;
        }
        return bVarArr;
    }
}
