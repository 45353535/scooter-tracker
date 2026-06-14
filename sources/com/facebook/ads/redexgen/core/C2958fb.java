package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.NativeAd;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2958fb implements S7 {
    public static String[] A02 = {"XqTxzibSN1zAjaiM9LtVSqsxSG", "xqN5bEwB0Nihon7KSuA", "FVkOY26I4teb9ftOLmk9A45ZS3TS2DIY", "wzTDEcMKt7VvW9W8eKeIWksTnJ0tE", "iGRCr9OHUARnshCNCmKS3XNzEIA09VDm", "MJLgHxMJm3Fw", ExifInterface.LATITUDE_SOUTH, "m77T1m6dtAhGTcgbhkAg"};
    public final List<C3116iN> A00;
    public final /* synthetic */ C2957fa A01;

    public C2958fb(C2957fa c2957fa, List<C3116iN> list) {
        this.A01 = c2957fa;
        this.A00 = list;
    }

    private void A00() {
        this.A01.A00.A05(true);
        this.A01.A00.A02();
        this.A01.A00.A03(0);
        Iterator<C3116iN> it = this.A00.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A02[4].charAt(3) == 'E') {
                throw new RuntimeException();
            }
            A02[0] = "GKxyFdZ7ADxfGJ";
            if (zHasNext) {
                C2363Qc c2363Qc = new C2363Qc(this.A01.A01, it.next(), null, C2363Qc.A0K(), this.A01.A00.A01());
                if (c2363Qc.A0z() != null && c2363Qc.A0z().A0F() != null) {
                    ((AbstractC3061hL) c2363Qc.A0z().A0F()).A00(c2363Qc);
                }
                this.A01.A00.A04(new NativeAd(this.A01.A01, c2363Qc));
            } else {
                AbstractC2498Vk.A00(new C2959fc(this));
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACh() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACq() {
        A00();
    }
}
