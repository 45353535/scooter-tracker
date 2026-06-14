package com.facebook.ads.redexgen.core;

import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.media3.common.PlaybackException;
import com.google.common.base.Ascii;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractViewOnTouchListenerC17100d extends C18676g implements View.OnTouchListener {
    public static byte[] A07;
    public static String[] A08 = {"ySOBxSJ7y2GELC2cR9WRTK6hAhZYocJS", "8dRmuXbfMCidMDGiSpjEcbCkPgx3mm8G", "li61zS9WhZTBvI47lvKtLPcqAcNkij1S", "lH5BfkXLxOyhi", "q0Ccq4Fbg7VKO8sxkIKNcZgKtjQ1fZ14", "ep7ggC7RKpg7Ol5cXUmXF8JhcfOkgUip", "fpgtpMAGWAVh3a0xLZP1kWTjCGk3An57", "s5"};
    public int A00;

    @Nullable
    public C3000gI A01;
    public InterfaceC2784ck A02;
    public boolean A03;
    public boolean A04;
    public int A05;
    public final int A06;

    public static String A09(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) + PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{-4, Ascii.ETB, 10, Ascii.EM, -5, Ascii.SO, Ascii.FF, 34, Ascii.FF, Ascii.NAK, Ascii.SO, Ascii.ESC, -1, Ascii.DC2, Ascii.SO, 32, -55, Ascii.CAN, Ascii.ETB, Ascii.NAK, 34, -55, Ascii.FS, Ascii.RS, Ascii.EM, Ascii.EM, Ascii.CAN, Ascii.ESC, Ascii.GS, Ascii.FS, -55, -11, Ascii.DC2, Ascii.ETB, Ascii.SO, 10, Ascii.ESC, -11, 10, 34, Ascii.CAN, Ascii.RS, Ascii.GS, -10, 10, Ascii.ETB, 10, Ascii.DLE, Ascii.SO, Ascii.ESC};
    }

    static {
        A0A();
    }

    public AbstractViewOnTouchListenerC17100d(C2820dL c2820dL) {
        super(c2820dL);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A05();
        setOnTouchListener(this);
    }

    public AbstractViewOnTouchListenerC17100d(C2820dL c2820dL, AttributeSet attributeSet) {
        super(c2820dL, attributeSet);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A05();
        setOnTouchListener(this);
    }

    public AbstractViewOnTouchListenerC17100d(C2820dL c2820dL, AttributeSet attributeSet, int i10) {
        super(c2820dL, attributeSet, i10);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A05();
        setOnTouchListener(this);
    }

    private int A05() {
        return ((int) getContext().getResources().getDisplayMetrics().density) * 10;
    }

    private int A06(int i10) {
        int delta = this.A00 - i10;
        int iA8g = this.A02.A8g(delta);
        int scrollX = this.A06;
        if (delta > scrollX) {
            int scrollX2 = this.A05;
            return A08(scrollX2, iA8g);
        }
        int scrollX3 = this.A06;
        if (delta < (-scrollX3)) {
            int i11 = this.A05;
            if (A08[6].charAt(24) != 67) {
                throw new RuntimeException();
            }
            A08[7] = "Vh4";
            int scrollX4 = A07(i11, iA8g);
            return scrollX4;
        }
        int scrollX5 = this.A05;
        return scrollX5;
    }

    private int A07(int i10, int i11) {
        return Math.max(i10 - i11, 0);
    }

    private int A08(int i10, int i11) {
        return Math.min(i10 + i11, getItemCount() - 1);
    }

    public void A20(int i10, boolean z10) {
        if (getAdapter() == null) {
            return;
        }
        this.A05 = i10;
        if (z10) {
            A1Y(i10);
        } else {
            A1X(i10);
        }
    }

    public int getCurrentPosition() {
        return this.A05;
    }

    private int getItemCount() {
        if (getAdapter() == null) {
            return 0;
        }
        return getAdapter().A0B();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 6 && actionMasked != 3) {
            int action = A08[7].length();
            if (action == 18) {
                throw new RuntimeException();
            }
            A08[4] = "tIjSEqZVzrzr7cEE0p57iZetopRejSVd";
            if (actionMasked != 4) {
                if (actionMasked == 0 || actionMasked == 5 || (this.A03 && actionMasked == 2)) {
                    this.A00 = rawX;
                    if (this.A03) {
                        this.A03 = false;
                    }
                    this.A04 = true;
                }
                return false;
            }
        }
        if (this.A04) {
            int rawX2 = A06(rawX);
            A20(rawX2, true);
        }
        this.A03 = true;
        this.A04 = false;
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.C18676g
    public void setLayoutManager(QO qo) {
        if (qo instanceof C3000gI) {
            super.setLayoutManager(qo);
            this.A01 = (C3000gI) qo;
            return;
        }
        throw new IllegalArgumentException(A09(0, 50, 59));
    }

    public void setSnapDelegate(InterfaceC2784ck interfaceC2784ck) {
        this.A02 = interfaceC2784ck;
    }
}
