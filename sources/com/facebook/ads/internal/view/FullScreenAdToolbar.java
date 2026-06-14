package com.facebook.ads.internal.view;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.facebook.ads.redexgen.core.AbstractC2523Wl;
import com.facebook.ads.redexgen.core.AbstractC2550Xm;
import com.facebook.ads.redexgen.core.AbstractC2645aV;
import com.facebook.ads.redexgen.core.C2283My;
import com.facebook.ads.redexgen.core.C2463Ua;
import com.facebook.ads.redexgen.core.C2548Xk;
import com.facebook.ads.redexgen.core.C2786cm;
import com.facebook.ads.redexgen.core.C2820dL;
import com.facebook.ads.redexgen.core.InterfaceC2549Xl;
import com.facebook.ads.redexgen.core.InterfaceC2551Xn;
import com.facebook.ads.redexgen.core.KE;
import com.facebook.ads.redexgen.core.N9;
import com.facebook.ads.redexgen.core.NF;
import com.facebook.ads.redexgen.core.ViewOnClickListenerC2560Xw;
import com.facebook.ads.redexgen.core.XP;
import com.facebook.ads.redexgen.core.XX;
import com.facebook.ads.redexgen.core.YG;
import com.facebook.ads.redexgen.core.YO;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FullScreenAdToolbar extends AbstractC2550Xm {
    public static byte[] A0B;
    public static String[] A0C = {"bFTGQZCDUsZohbmTeIVqSIHEteTzH9ln", "yXw5A2C", "1AgOSkHO0Pb00RrFT9UOiqy", "TxDFqDHdXRoHKl2DTNxbpTLqI26RISWJ", "CWbWmw8OaNX6ff1fhEYiHQW6wjCjGro9", "znIzyGoGhCcdAsXYdQkLlPNG9alZ5sNL", "lf2qO9K", "XEgUxEHpppw1PxIgjlcxmDWHelwWu1Ow"};
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public C2548Xk A00;
    public InterfaceC2549Xl A01;
    public InterfaceC2549Xl A02;
    public YG A03;
    public boolean A04;
    public boolean A05;
    public final RelativeLayout A06;
    public final C2463Ua A07;
    public final InterfaceC2551Xn A08;
    public final YO A09;
    public final C2786cm A0A;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 22);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {113, -102, -99, -95, -109, 78, 111, -110, -100, -81, -70, -71, -68, -66, 106, -117, -82, -71, -76, -76, -79, -89, -90, -73};
        if (A0C[5].charAt(20) != 'l') {
            throw new RuntimeException();
        }
        A0C[2] = "ATFpsL3dKIxr1CEZIKZeGPZ";
        A0B = bArr;
    }

    static {
        A03();
        A0D = (int) (AbstractC2523Wl.A02 * 10.0f);
        A0H = (int) (AbstractC2523Wl.A02 * 16.0f);
        A0F = A0H - A0D;
        A0G = (A0H * 2) - A0D;
        A0E = (int) (AbstractC2523Wl.A02 * 4.0f);
    }

    public FullScreenAdToolbar(C2820dL c2820dL, InterfaceC2551Xn interfaceC2551Xn, C2463Ua c2463Ua, int i10, int i11, boolean z10) {
        super(c2820dL);
        this.A01 = null;
        this.A04 = true;
        this.A05 = z10;
        this.A08 = interfaceC2551Xn;
        this.A07 = c2463Ua;
        setGravity(16);
        this.A09 = new YO(c2820dL, i10, z10);
        this.A09.setContentDescription(A02(0, 8, 24));
        this.A09.setActionClickListener(new ViewOnClickListenerC2560Xw(this));
        if (!this.A05) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(A0F, A0F, A0G, A0F);
            addView(this.A09, layoutParams);
            this.A06 = new RelativeLayout(c2820dL);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
            layoutParams2.weight = 1.0f;
            this.A0A = new C2786cm(c2820dL);
            XP.A0E(1006, this.A0A);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            this.A0A.setLayoutParams(layoutParams3);
            this.A06.addView(this.A0A);
            addView(this.A06, layoutParams2);
            if (i11 != -1) {
                A0D(c2820dL, i11);
                return;
            }
            return;
        }
        if (i11 != -1) {
            A0D(c2820dL, i11);
        }
        this.A06 = new RelativeLayout(c2820dL);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.A0A = new C2786cm(c2820dL);
        XP.A0E(1006, this.A0A);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 17;
        this.A0A.setLayoutParams(layoutParams5);
        this.A06.addView(this.A0A);
        addView(this.A06, layoutParams4);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.setMargins(0, A0H / 2, A0H / 2, A0H / 2);
        addView(this.A09, layoutParams6);
    }

    private void A04(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.setVisibility(z10 ? 0 : 8);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2550Xm
    public final void A06() {
        this.A09.A02();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2550Xm
    public final void A07() {
        if (this.A01 != null) {
            this.A02 = this.A01;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2550Xm
    public final void A08() {
        this.A01 = getToolbarListener();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2550Xm
    public final void A09(float f10, int i10) {
        this.A09.A03(f10, i10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2550Xm
    public final void A0A(C2283My c2283My, boolean z10) {
        boolean z11 = this.A04;
        int iA05 = c2283My.A05(z11);
        this.A0A.A02(c2283My.A0B(z11), iA05);
        boolean z12 = this.A05;
        String strA02 = A02(8, 9, 52);
        if (!z12) {
            if (this.A00 != null) {
                this.A00.setIconColors(iA05);
                this.A00.setContentDescription(strA02);
            }
        } else if (this.A03 != null) {
            this.A03.setIconColors(iA05);
            this.A03.setContentDescription(strA02);
        }
        this.A09.A04(c2283My, z11, z10);
        if (z11) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            XP.A0Q(this, gradientDrawable);
            boolean fullScreenEnabled = this.A05;
            setReportingViewColor(!fullScreenEnabled ? this.A00 : this.A03);
            return;
        }
        XP.A0K(this, 0);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2550Xm
    public final boolean A0B() {
        return this.A09.A05();
    }

    public final void A0C(N9 n92, String str, int i10) {
        this.A09.setInitialUnskippableSeconds(i10);
        if (this.A05) {
            if (this.A03 != null) {
                this.A03.setAdDetails(n92, str, this.A07, this.A08);
            }
        } else {
            if (this.A00 == null) {
                return;
            }
            this.A00.setAdDetails(n92, str, this.A07, this.A08);
        }
    }

    public final void A0D(C2820dL c2820dL, int i10) {
        if (this.A00 != null) {
            XP.A0H(this.A00);
            this.A00.removeAllViews();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (!this.A05) {
            this.A00 = new C2548Xk(c2820dL, i10);
            layoutParams.setMargins(0, A0H / 2, A0H / 2, A0H / 2);
            addView(this.A00, layoutParams);
        } else {
            this.A03 = new YG(c2820dL);
            layoutParams.setMargins(A0F, A0F, A0G, A0F);
            addView(this.A03, layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2550Xm
    public int getToolbarActionMode() {
        return this.A09.getToolbarActionMode();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2550Xm
    public int getToolbarHeight() {
        return AbstractC2550Xm.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2550Xm
    public InterfaceC2549Xl getToolbarListener() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2550Xm
    public void setAdReportingVisible(boolean z10) {
        A04(!this.A05 ? this.A00 : this.A03, z10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2550Xm
    public void setCTAClickListener(View.OnClickListener onClickListener) {
        this.A0A.setOnClickListener(onClickListener);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2550Xm
    public void setCTAClickListener(KE ke2) {
        this.A0A.setOnClickListener(AbstractC2645aV.A03(ke2, A02(17, 7, 47)));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2550Xm
    public void setFullscreen(boolean z10) {
        this.A04 = z10;
    }

    public void setOnlyPageDetails(N9 n92) {
        if (n92 != null) {
            this.A0A.setPageDetails(n92);
        } else {
            this.A0A.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2550Xm
    public void setPageDetails(N9 n92, String str, int i10, NF nf2) {
        this.A09.setInitialUnskippableSeconds(i10);
        this.A0A.setPageDetails(n92);
        if (this.A05) {
            if (this.A03 != null) {
                this.A03.setAdDetails(n92, str, this.A07, this.A08);
            }
        } else {
            if (this.A00 == null) {
                return;
            }
            this.A00.setAdDetails(n92, str, this.A07, this.A08);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2550Xm
    public void setPageDetailsVisible(boolean z10) {
        this.A06.removeAllViews();
        if (z10) {
            this.A06.addView(this.A0A);
        }
        this.A09.setToolbarMessageEnabled(!z10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2550Xm
    public void setProgress(float f10) {
        this.A09.setProgress(f10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2550Xm
    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A09.setProgressClickListener(onClickListener);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2550Xm
    public void setProgressImage(XX xx) {
        this.A09.setProgressImage(xx);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2550Xm
    public void setProgressImmediate(float f10) {
        this.A09.setProgressImmediate(f10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2550Xm
    public void setProgressSpinnerInvisible(boolean z10) {
        this.A09.setProgressSpinnerInvisible(z10);
    }

    private void setReportingViewColor(View view) {
        if (view != null) {
            XP.A0O(view, 0, ViewCompat.MEASURED_STATE_MASK, A0E);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2550Xm
    public void setToolbarActionMessage(String str) {
        this.A09.setToolbarMessage(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2550Xm
    public void setToolbarActionMode(int i10) {
        this.A09.setToolbarActionMode(i10);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2550Xm
    public void setToolbarListener(InterfaceC2549Xl interfaceC2549Xl) {
        this.A02 = interfaceC2549Xl;
    }
}
