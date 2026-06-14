package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f21786b;

    public c() {
        super(null);
        this.f21786b = -9223372036854775807L;
    }

    public final void a(n nVar, long j10) throws r {
        if (nVar.j() != 2) {
            throw new r();
        }
        int iO = nVar.o();
        int i10 = nVar.f23135b;
        nVar.e(i10 + iO);
        if ("onMetaData".equals(new String(nVar.f23134a, i10, iO)) && nVar.j() == 8) {
            HashMap mapA = a(nVar);
            if (mapA.containsKey("duration")) {
                double dDoubleValue = ((Double) mapA.get("duration")).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.f21786b = (long) (dDoubleValue * 1000000.0d);
                }
            }
        }
    }

    public static Serializable a(int i10, n nVar) {
        if (i10 == 8) {
            return a(nVar);
        }
        if (i10 == 10) {
            int iM = nVar.m();
            ArrayList arrayList = new ArrayList(iM);
            for (int i11 = 0; i11 < iM; i11++) {
                arrayList.add(a(nVar.j(), nVar));
            }
            return arrayList;
        }
        if (i10 == 11) {
            Date date = new Date((long) Double.longBitsToDouble(nVar.g()));
            nVar.e(nVar.f23135b + 2);
            return date;
        }
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(nVar.g()));
        }
        if (i10 == 1) {
            return Boolean.valueOf(nVar.j() == 1);
        }
        if (i10 == 2) {
            int iO = nVar.o();
            int i12 = nVar.f23135b;
            nVar.e(i12 + iO);
            return new String(nVar.f23134a, i12, iO);
        }
        if (i10 != 3) {
            return null;
        }
        HashMap map = new HashMap();
        while (true) {
            int iO2 = nVar.o();
            int i13 = nVar.f23135b;
            nVar.e(i13 + iO2);
            String str = new String(nVar.f23134a, i13, iO2);
            int iJ = nVar.j();
            if (iJ == 9) {
                return map;
            }
            map.put(str, a(iJ, nVar));
        }
    }

    public static HashMap a(n nVar) {
        int iM = nVar.m();
        HashMap map = new HashMap(iM);
        for (int i10 = 0; i10 < iM; i10++) {
            int iO = nVar.o();
            int i11 = nVar.f23135b;
            nVar.e(i11 + iO);
            map.put(new String(nVar.f23134a, i11, iO), a(nVar.j(), nVar));
        }
        return map;
    }
}
