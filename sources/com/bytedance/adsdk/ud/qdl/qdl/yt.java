package com.bytedance.adsdk.ud.qdl.qdl;

import android.graphics.PointF;
import com.bytedance.adsdk.ud.qdl.ud.qdl;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class yt implements exc, qdl.InterfaceC0205qdl {
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> lnr;
    private com.bytedance.adsdk.ud.lnr.ud.rdp mml;
    private final com.bytedance.adsdk.ud.tvp qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final String f16102ud;

    public yt(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar, com.bytedance.adsdk.ud.lnr.ud.exu exuVar) {
        this.qdl = tvpVar;
        this.f16102ud = exuVar.qdl();
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl = exuVar.ud().qdl();
        this.lnr = qdlVarQdl;
        qdlVar.qdl(qdlVarQdl);
        qdlVarQdl.qdl(this);
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.lnr
    public void qdl(List<lnr> list, List<lnr> list2) {
    }

    public com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> ud() {
        return this.lnr;
    }

    private com.bytedance.adsdk.ud.lnr.ud.rdp ud(com.bytedance.adsdk.ud.lnr.ud.rdp rdpVar) {
        List<com.bytedance.adsdk.ud.lnr.qdl> listLnr = rdpVar.lnr();
        boolean zUd = rdpVar.ud();
        int size = listLnr.size() - 1;
        int i10 = 0;
        while (size >= 0) {
            com.bytedance.adsdk.ud.lnr.qdl qdlVar = listLnr.get(size);
            com.bytedance.adsdk.ud.lnr.qdl qdlVar2 = listLnr.get(qdl(size - 1, listLnr.size()));
            PointF pointFLnr = (size != 0 || zUd) ? qdlVar2.lnr() : rdpVar.qdl();
            i10 = (((size != 0 || zUd) ? qdlVar2.ud() : pointFLnr).equals(pointFLnr) && qdlVar.qdl().equals(pointFLnr) && !(!rdpVar.ud() && size == 0 && size == listLnr.size() - 1)) ? i10 + 2 : i10 + 1;
            size--;
        }
        com.bytedance.adsdk.ud.lnr.ud.rdp rdpVar2 = this.mml;
        if (rdpVar2 == null || rdpVar2.lnr().size() != i10) {
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new com.bytedance.adsdk.ud.lnr.qdl());
            }
            this.mml = new com.bytedance.adsdk.ud.lnr.ud.rdp(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.mml.qdl(zUd);
        return this.mml;
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0205qdl
    public void qdl() {
        this.qdl.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    @Override // com.bytedance.adsdk.ud.qdl.qdl.exc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.adsdk.ud.lnr.ud.rdp qdl(com.bytedance.adsdk.ud.lnr.ud.rdp r19) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ud.qdl.qdl.yt.qdl(com.bytedance.adsdk.ud.lnr.ud.rdp):com.bytedance.adsdk.ud.lnr.ud.rdp");
    }

    private static int ud(int i10, int i11) {
        int i12 = i10 / i11;
        return ((i10 ^ i11) >= 0 || i11 * i12 == i10) ? i12 : i12 - 1;
    }

    private static int qdl(int i10, int i11) {
        return i10 - (ud(i10, i11) * i11);
    }
}
