package com.facebook.ads.redexgen.core;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractRunnableC2507Vt implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<InterfaceC2497Vj> A04;
    public final C2495Vh A00;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{44, Ascii.VT, Ascii.DLE, Ascii.DLE, Ascii.US, Ascii.FS, Ascii.DC2, Ascii.ESC, 94, Ascii.GS, Ascii.FF, Ascii.ESC, Ascii.US, 10, Ascii.ESC, Ascii.SUB, 80, 94, 42, Ascii.SYN, Ascii.FF, Ascii.ESC, Ascii.US, Ascii.SUB, 68, 94};
    }

    public abstract void A07();

    static {
        A03();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public AbstractRunnableC2507Vt() {
        if (A03.get()) {
            this.A00 = C2512Vy.A01(new C2511Vx(A02(0, 26, 94) + Thread.currentThread().getName()));
        } else {
            this.A00 = null;
        }
    }

    public static void A04(boolean z10) {
        A03.set(z10);
    }

    public static void A05(boolean z10, InterfaceC2497Vj interfaceC2497Vj) {
        A02.set(z10);
        A04.set(interfaceC2497Vj);
    }

    public final C2495Vh A06() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                C2512Vy.A03(this);
            }
            try {
                A07();
            } catch (Throwable th2) {
                if (A02.get()) {
                    W0.A00().AAo(3301, th2);
                    InterfaceC2497Vj interfaceC2497Vj = A04.get();
                    if (interfaceC2497Vj != null) {
                        interfaceC2497Vj.AHp(th2, this);
                    }
                } else {
                    throw th2;
                }
            }
            if (A03.get()) {
                C2512Vy.A04(this);
            }
        } catch (Throwable th3) {
            AbstractC2499Vl.A00(th3, this);
        }
    }
}
