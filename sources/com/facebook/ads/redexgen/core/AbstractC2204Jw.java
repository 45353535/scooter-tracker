package com.facebook.ads.redexgen.core;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.material.TextFieldImplKt;
import com.applovin.shadow.okio.Utf8;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.ironsource.F9;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2204Jw extends AbstractC2654ae implements Wf {
    public static byte[] A0B;
    public static String[] A0C = {"OqBcBxPX2ZziMc2IT6MCTLtQAfN", "zbHyi1ztTRv4YAmmT0P0cBLwkAbgbibY", "SGCBgG4YDDdHsd7wreTLkUhlfmq", "6SoBxKZAX5xZewPuDXqUB5F5Zi6ZkxRk", "Ec2XCBDA1LqSXAKcLbhR3N0Z6X2H9u1y", "7uWZE4LuLIesc8VJARyN", "MrB", "uRKWJ0Ox"};
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public static final int A0Q;
    public C2206Jy A00;
    public D9 A01;
    public C2015Co A02;
    public CU A03;
    public final Handler A04;
    public final AbstractC3095hy A05;
    public final C2274Mp A06;
    public final InterfaceC2551Xn A07;
    public final AbstractC2611Zv A08;
    public final C2519Wh A09;
    public final AtomicBoolean A0A;

    public static String A0L(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0M() {
        A0B = new byte[]{-117, -96, -104, -104, -104, -104, -104, -104, -104, 60, 72, 70, 7, Utf8.REPLACEMENT_BYTE, 58, 60, 62, 59, 72, 72, 68, 7, 58, 61, 76, 7, 66, 71, 77, 62, 75, 76, 77, 66, 77, 66, 58, 69, 7, 60, 69, 66, 60, 68, 62, 61, SignedBytes.MAX_POWER_OF_TWO, 76, 74, Ascii.VT, 67, 62, SignedBytes.MAX_POWER_OF_TWO, 66, Utf8.REPLACEMENT_BYTE, 76, 76, 72, Ascii.VT, 62, 65, 80, Ascii.VT, 70, 75, 81, 66, 79, 80, 81, 70, 81, 70, 62, 73, Ascii.VT, 67, 70, 75, 70, 80, 69, 60, 62, SignedBytes.MAX_POWER_OF_TWO, 81, 70, 83, 70, 81, 86, Ascii.ETB, 10, Ascii.FS, 6, Ascii.ETB, 9, 10, 9, 4, Ascii.ESC, Ascii.SO, 9, 10, Ascii.DC4};
    }

    public abstract AbstractC2611Zv A1P(C2658ai c2658ai, C2274Mp c2274Mp, String str);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A1T() {
        LinearLayout linearLayout = new LinearLayout(super.A06.A06());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(super.A06.A06());
        textView.setText(super.A06.A05().A18());
        textView.setTextColor(-1);
        XP.A0W(textView, true, 24);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(AbstractC2654ae.A0F, 0, AbstractC2654ae.A0F, AbstractC2654ae.A0A);
        textView.setGravity(1);
        textView.setLayoutParams(layoutParams2);
        C2634aK c2634aK = new C2634aK(super.A06.A06());
        c2634aK.setRadius(15);
        XP.A0K(c2634aK, 0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A0G, A0G);
        layoutParams3.gravity = 17;
        c2634aK.setLayoutParams(layoutParams3);
        new KZ(c2634aK, super.A06.A06()).A05(A0G, A0G).A07(super.A06.A05().A23().A01());
        TextView textView2 = new TextView(super.A06.A06());
        textView2.setText(String.format(Locale.US, super.A06.A05().A19(), super.A06.A05().A20().A0I().A0F()));
        textView2.setTextColor(-1);
        XP.A0W(textView2, false, 17);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(AbstractC2654ae.A0D, AbstractC2654ae.A0A, AbstractC2654ae.A0D, 0);
        textView2.setGravity(1);
        textView2.setLayoutParams(layoutParams4);
        linearLayout.addView(textView);
        linearLayout.addView(c2634aK);
        linearLayout.addView(textView2);
        addView(linearLayout);
        addView(A0I());
        if (this.A05.A2H() && this.A05.A2I()) {
            addView(A00(super.A06.A06(), super.A06.A05(), super.A06.A08(), Z5.A05, super.A06.A0D(), this.A04));
        }
    }

    static {
        A0M();
        A0J = (int) (AbstractC2523Wl.A02 * 48.0f);
        A0I = (int) (AbstractC2523Wl.A02 * 80.0f);
        A0G = (int) (AbstractC2523Wl.A02 * 120.0f);
        A0H = (int) (AbstractC2523Wl.A02 * 128.0f);
        A0O = (int) (AbstractC2523Wl.A02 * 16.0f);
        A0D = (int) (AbstractC2523Wl.A02 * 4.0f);
        A0N = (int) (AbstractC2523Wl.A02 * 44.0f);
        A0L = (int) (AbstractC2523Wl.A02 * 8.0f);
        A0M = (int) (AbstractC2523Wl.A02 * 12.0f);
        A0Q = (int) (AbstractC2523Wl.A02 * 12.0f);
        A0P = (int) (AbstractC2523Wl.A02 * 26.0f);
        A0K = (int) (AbstractC2523Wl.A02 * 10.0f);
        A0E = OP.A02(-1, 77);
        A0F = OP.A02(A0E, 90);
    }

    public AbstractC2204Jw(C2658ai c2658ai, boolean z10) {
        super(c2658ai, z10);
        this.A04 = new Handler(Looper.getMainLooper());
        this.A0A = new AtomicBoolean(false);
        this.A05 = c2658ai.A05();
        this.A09 = C2519Wh.A00(c2658ai.A06(), this.A05, this);
        this.A06 = this.A05.A20();
        this.A08 = A0J(c2658ai);
        if (this.A05.A1m()) {
            this.A08.setVisibility(8);
        }
        if (this.A05.A1m() && !getAdDataBundle().A20().A0K().A03()) {
            this.A00 = A0K(c2658ai);
        }
        AbstractC2550Xm abstractC2550XmA0C = c2658ai.A0C();
        this.A07 = c2658ai.A0D();
        if (abstractC2550XmA0C != null) {
            abstractC2550XmA0C.setLayoutParams(new RelativeLayout.LayoutParams(-1, abstractC2550XmA0C.getToolbarHeight()));
            abstractC2550XmA0C.setPageDetailsVisible(false);
        }
    }

    private ImageView A0I() {
        ImageView imageView = new ImageView(super.A06.A06());
        imageView.setImageBitmap(Bitmap.createScaledBitmap(XY.A01(XX.NAV_CROSS), AbstractC2654ae.A0C, AbstractC2654ae.A0C, true));
        imageView.setColorFilter(-1);
        GradientDrawable circleBackground = new GradientDrawable();
        circleBackground.setShape(1);
        circleBackground.setColor(Color.parseColor(A0L(0, 9, 6)));
        imageView.setBackground(circleBackground);
        imageView.setPadding(A0K, A0K, A0K, A0K);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.aZ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.A00.A1V(view);
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, AbstractC2654ae.A0G, AbstractC2654ae.A0A, 0);
        layoutParams.addRule(11);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    private AbstractC2611Zv A0J(C2658ai c2658ai) {
        String clickEvent;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        if (this.A05.A1m()) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        }
        layoutParams.addRule(12);
        if (c2658ai.A05().A0v().equals(A0L(91, 14, 67))) {
            clickEvent = EnumC2842dh.A04.A03();
        } else {
            clickEvent = A0L(9, 37, 119);
        }
        AbstractC2611Zv abstractC2611ZvA1P = A1P(c2658ai, this.A06, clickEvent);
        abstractC2611ZvA1P.getCTAButton().getCtaActionHelper().A08(this.A05);
        abstractC2611ZvA1P.getCTAButton().setCreativeAsCtaLoggingHelper(this.A09);
        this.A03 = new CU(abstractC2611ZvA1P, 400, 100, 0);
        XP.A0I(abstractC2611ZvA1P);
        abstractC2611ZvA1P.A0h(c2658ai.A00());
        if (U7.A17(c2658ai.A06())) {
            abstractC2611ZvA1P.A0g();
            if (c2658ai.A0C() != null) {
                c2658ai.A0C().setCTAClickListener(getCtaButton());
            }
        }
        addView(abstractC2611ZvA1P, layoutParams);
        abstractC2611ZvA1P.getCTAButton().A0F(this.A05, c2658ai.A0C());
        return abstractC2611ZvA1P;
    }

    private C2206Jy A0K(C2658ai c2658ai) {
        String strA0L;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (c2658ai.A05().A0v().equals(A0L(91, 14, 67))) {
            EnumC2842dh enumC2842dh = EnumC2842dh.A04;
            String[] strArr = A0C;
            if (strArr[0].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0C[6] = "";
            strA0L = enumC2842dh.A03();
        } else {
            strA0L = A0L(9, 37, 119);
        }
        C2206Jy c2206JyA1Q = A1Q(c2658ai, this.A06, strA0L);
        if (c2206JyA1Q == null) {
            return null;
        }
        c2206JyA1Q.getCTAButton().getCtaActionHelper().A08(this.A05);
        c2206JyA1Q.getCTAButton().setCreativeAsCtaLoggingHelper(this.A09);
        XP.A0I(c2206JyA1Q);
        c2206JyA1Q.A0h(c2658ai.A00());
        if (U7.A17(c2658ai.A06())) {
            c2206JyA1Q.A0g();
            if (c2658ai.A0C() != null) {
                c2658ai.A0C().setCTAClickListener(getCtaButton());
            }
            if (c2658ai.A0B() != null) {
                c2658ai.A0B().setCTAClickListener(getCtaButton());
            }
        }
        c2206JyA1Q.setLayoutParams(layoutParams);
        c2206JyA1Q.getCTAButton().A0F(this.A05, c2658ai.A0C());
        return c2206JyA1Q;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2654ae
    public void A1B() {
        super.A1B();
        this.A04.removeCallbacksAndMessages(null);
        if (this.A05 != null && this.A05.A20().A0L() != null) {
            WX.A06(super.A06.A06().A02(), this.A05.A20().A0L());
        }
        this.A09.A03();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2654ae
    public void A1G(C2274Mp c2274Mp, String str, double d10, Bundle bundle) {
        super.A1G(c2274Mp, str, d10, bundle);
        this.A08.setInfo(c2274Mp.A0I(), c2274Mp.A0J(), str, this.A05.A23().A01(), super.A06.A09(), null);
        if (this.A00 != null) {
            this.A00.setInfo(c2274Mp.A0I(), c2274Mp.A0J(), str, this.A05.A23().A01(), super.A06.A09(), null);
        }
    }

    public final int A1O(AbstractC2550Xm abstractC2550Xm) {
        return abstractC2550Xm == null ? AbstractC2550Xm.A00 : abstractC2550Xm.getToolbarHeight();
    }

    public C2206Jy A1Q(C2658ai c2658ai, C2274Mp c2274Mp, String str) {
        return null;
    }

    public void A1R() {
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null) {
            this.A01 = new D9(true, false);
            if (this.A02 != null) {
                this.A01.A0L(this.A02);
            }
            C2283My c2283MyA01 = this.A05.A1z().A01();
            this.A01.A0L(new CY(getAdDetailsView().getCTAButton(), 300, -1, c2283MyA01.A0A(true)));
            Drawable startDrawable = XP.A08(A0E, A0F, A0D);
            this.A01.A0L(new C2016Cp(getAdDetailsView().getCTAButton(), 300, startDrawable, XP.A05(c2283MyA01.A09(true), A0D)));
            this.A01.A0L(new CZ(expandableLayout, TextFieldImplKt.AnimationDuration, false));
            this.A01.A0K(F9.b.f40893g);
        }
    }

    public final void A1S() {
        LinearLayout linearLayout = new LinearLayout(super.A06.A06());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(super.A06.A06());
        textView.setText(super.A06.A05().A0z());
        textView.setTextColor(-1);
        XP.A0W(textView, false, 15);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(A0O, A0O, A0O, A0O);
        textView.setGravity(1);
        textView.setLayoutParams(layoutParams2);
        C2628aE c2628aE = new C2628aE(super.A06.A06(), 0, -13524404, XX.REWARD_GRANTED_ICON);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(A0J, A0J);
        layoutParams3.gravity = 17;
        c2628aE.setLayoutParams(layoutParams3);
        linearLayout.addView(c2628aE);
        linearLayout.addView(textView);
        addView(linearLayout);
    }

    public final void A1U(int i10, ViewGroup viewGroup, RelativeLayout relativeLayout) {
        if (getAdDetailsView() instanceof KL) {
            if ((getAdDetailsView() instanceof C18525r) || (getAdDetailsView() instanceof C18515q)) {
                XP.A0H(getAdDetailsView());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                if (getResources().getConfiguration().orientation == 2) {
                    layoutParams.addRule(1, relativeLayout.getId());
                    getAdDetailsView().setLayoutParams(layoutParams);
                    viewGroup.addView(getAdDetailsView());
                } else {
                    addView(getAdDetailsView(), layoutParams);
                }
            }
            getAdDetailsView().A0h(i10);
            ((KL) getAdDetailsView()).A0s(viewGroup, relativeLayout, i10);
        }
    }

    public final /* synthetic */ void A1V(View view) {
        this.A07.A4b(A0L(46, 45, 123));
    }

    public AbstractC3095hy getAdDataBundle() {
        return this.A05;
    }

    public CU getAdDetailsAnimation() {
        return this.A03;
    }

    public AbstractC2611Zv getAdDetailsView() {
        return this.A08;
    }

    public C2274Mp getAdInfo() {
        return this.A06;
    }

    public D9 getAnimationPlugin() {
        return this.A01;
    }

    public AbstractC2611Zv getOldEndCardAdDetailsView() {
        if (this.A00 != null && this.A05.A1m() && !this.A05.A20().A0K().A03()) {
            this.A00.A0i();
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2654ae, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A0A.get() && (this.A05.A20().A0K().A02().isEmpty() || this.A05.A20().A0K().A03() || this.A05.A1b())) {
            return;
        }
        getAdDetailsView().A0h(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View expandableLayout;
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.A05.A20().A0K().A03() && !this.A05.A1b() && !this.A05.A1m() && (expandableLayout = getAdDetailsView().getExpandableLayout()) != null && z10 && this.A02 == null) {
            this.A02 = new C2015Co(expandableLayout, 300, expandableLayout.getHeight(), 0);
            this.A01.A0L(this.A02);
            this.A01.A0J();
        }
    }
}
