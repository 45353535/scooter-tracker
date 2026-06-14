package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.media3.common.PlaybackException;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3294lW implements FT, DisplayManager.DisplayListener {
    public static byte[] A02;
    public FS A00;
    public final DisplayManager A01;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) + PlaybackException.ERROR_CODE_NOT_AVAILABLE_IN_REGION);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{Ascii.SI, Ascii.DC4, Ascii.RS, Ascii.ESC, Ascii.ETB, Ascii.FF, 36};
    }

    public C3294lW(DisplayManager displayManager) {
        this.A01 = displayManager;
    }

    private Display A00() {
        return this.A01.getDisplay(0);
    }

    public static C3294lW A01(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(A02(0, 7, 65));
        if (displayManager != null) {
            return new C3294lW(displayManager);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.FT
    public final void AGn(FS fs) {
        this.A00 = fs;
        this.A01.registerDisplayListener(this, AbstractC18094a.A0Y());
        fs.ACz(A00());
    }

    @Override // com.facebook.ads.redexgen.core.FT
    public final void AJl() {
        this.A01.unregisterDisplayListener(this);
        this.A00 = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        if (this.A00 != null && i10 == 0) {
            this.A00.ACz(A00());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}
