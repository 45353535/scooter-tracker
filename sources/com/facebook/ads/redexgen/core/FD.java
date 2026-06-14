package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FD extends AbstractC2367Qg implements InterfaceC2558Xu {
    public static String[] A08 = {"biNTtjxa0xULALtZEUOcP", "rMVpYr4hwZgX", "y0rebd1hOaNR", "snwXdVXwO66aPvNuuMD2", "jxkMgVVp1g5", "Dcah1JX", "lglxOXHbCZFpcLf1TWQPAMUDis4zLCZx", "n80A5ryznQOlcAJIvKv7FeLq2ck19EHB"};
    public N3 A00;
    public AbstractC2892eW A01;
    public C2893eX A02;
    public C2893eX A03;
    public final int A04;
    public final SparseBooleanArray A05;
    public final C2820dL A06;
    public final C18425h A07;

    public FD(C18425h c18425h, SparseBooleanArray sparseBooleanArray, C2893eX c2893eX, int i10, C2820dL c2820dL, N3 n32) {
        super(c18425h);
        this.A06 = c2820dL;
        this.A07 = c18425h;
        this.A05 = sparseBooleanArray;
        this.A02 = c2893eX;
        this.A04 = i10;
        this.A00 = n32;
    }

    private void A05(US us, XH xh2, String str, C2787cn c2787cn) {
        if (this.A05.get(c2787cn.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            String[] strArr = A08;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "sEemyGdXpNnP2WRBMWcD";
            strArr2[0] = "kawPFcVLuq3VyedHvbBIc";
            this.A03 = null;
        }
        this.A01 = new FF(this, str, c2787cn, us, c2787cn.A04(), xh2);
        this.A03 = new C2893eX(this.A07, 10, new WeakReference(this.A01), this.A06);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A07.setOnAssetsLoadedListener(new FE(this, c2787cn));
    }

    public final void A0p(C2787cn c2787cn, US us, SF sf2, XH xh2, String str, int i10, int i11, int i12) {
        int iA02 = c2787cn.A02();
        this.A07.setTag(-1593835536, Integer.valueOf(iA02));
        this.A07.setupNativeCtaExtension(c2787cn);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i10, -2);
        int rightMargin = iA02 == 0 ? i12 : i11;
        if (iA02 < this.A04 - 1) {
            i12 = i11;
        }
        String[] strArr = A08;
        if (strArr[1].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[1] = "ng4t5bAKqCWK";
        strArr2[2] = "n9xBZs9SEWUc";
        marginLayoutParams.setMargins(rightMargin, 0, i12, 0);
        String strA08 = c2787cn.A03().A0H().A08();
        String strA09 = c2787cn.A03().A0H().A09();
        this.A07.setIsVideo(!TextUtils.isEmpty(strA09));
        if (this.A07.A1T()) {
            this.A07.setVideoPlaceholderUrl(strA08);
            this.A07.setVideoUrl(sf2.A0T(strA09));
        } else {
            this.A07.setImageUrl(strA08);
        }
        this.A07.setLayoutParams(marginLayoutParams);
        this.A07.setCTAInfo(c2787cn.A03().A0J(), c2787cn.A04());
        this.A07.A1U(c2787cn.A04());
        A05(us, xh2, str, c2787cn);
    }

    public final void A0q(C2893eX c2893eX) {
        this.A02 = c2893eX;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2558Xu
    public final void AIV() {
        this.A07.A1O();
    }
}
