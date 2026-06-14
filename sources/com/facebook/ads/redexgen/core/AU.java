package com.facebook.ads.redexgen.core;

import android.media.MediaCodec;
import android.os.SystemClock;
import android.util.Log;
import androidx.compose.material.TextFieldImplKt;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class AU {
    public static byte[] A03;
    public boolean A00 = false;
    public final ConcurrentLinkedQueue<AS> A01 = new ConcurrentLinkedQueue<>();
    public final /* synthetic */ AV A02;

    static {
        A05();
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-89, -38, -59, -57, -46, -42, -53, -47, -48, -126, -39, -54, -57, -48, -126, -42, -44, -37, -53, -48, -55, -126, -42, -47, -126, -53, -48, -43, -42, -61, -48, -42, -53, -61, -42, -57, -126, -121, -43, -100, -126, -121, -43, -72, -48, -49, -44, -52, -82, -38, -49, -48, -50, -69, -38, -38, -41, -70, -37, -33, -44, -40, -44, -27, -48, -49, -59, -46, -46, -49, -46, -115, -41, -56, -55, -52, -59, -115, -46, -59, -52, -59, -63, -45, -59, -115, -61, -49, -60, -59, -61, -115, -58, -46, -49, -51, -115, -45, -59, -44, -115, -58, -55, -50, -63, -52, -52, -39, -102, UnsignedBytes.MAX_POWER_OF_TWO, -123, -45, -40, -27, -27, -30, -27, -96, -22, -37, -36, -33, -40, -96, -27, -40, -33, -40, -44, -26, -40, -96, -42, -30, -41, -40, -42, -96, -39, -27, -30, -32, -96, -26, -40, -25, -83, -109, -104, -26, -34, -15, -24, -23, -27, -38, -14, -34, -21, -85, -89, -38, -17, -86, -89, -20, -21, -36, -89, -67, -38, -17, -86, -35, -58, -34, -35, -30, -38, -68, -24, -35, -34, -36, -70, -35, -38, -23, -19, -34, -21};
    }

    public AU(AV av) {
        this.A02 = av;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AO A02(boolean z10, C3092hv c3092hv, EnumC3089hq enumC3089hq, String str) throws Exception {
        Set<AO> set;
        if (this.A02.A0I(z10, c3092hv) && AV.A0G(str, c3092hv)) {
            synchronized (this.A02.A04) {
                set = this.A02.A04.get(str);
            }
            if (set != null) {
                synchronized (set) {
                    if (!set.isEmpty()) {
                        AV av = this.A02;
                        av.A00--;
                        Iterator<AO> it = set.iterator();
                        AO ret = it.next();
                        it.remove();
                        this.A02.A03().A0A(z10, str, enumC3089hq, ret.hashCode());
                        return ret;
                    }
                }
            }
        }
        try {
            C3087ho c3087hoA05 = this.A02.A03().A05(z10, str, enumC3089hq);
            AO aoA03 = A03(z10, str);
            this.A02.A03().A06(c3087hoA05, aoA03.hashCode());
            return aoA03;
        } catch (Exception e10) {
            throw new MediaCodecInitializationException(str, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AO A03(boolean z10, String str) throws Exception {
        String strA04 = A04(TextFieldImplKt.AnimationDuration, 41, 69);
        if (z10 && AV.A0E(str)) {
            try {
                return (AO) Class.forName(strA04).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e10) {
                Log.w(A04(43, 23, 55), String.format(A04(0, 43, 46), strA04, e10.getMessage()));
            }
        }
        return new C3364mf(MediaCodec.createByCodecName(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A07, reason: merged with bridge method [inline-methods] */
    public void A0B(EnumC3089hq enumC3089hq) {
        String strA04;
        String str;
        AV av;
        Set<AO> set;
        for (AS as : this.A01) {
            try {
                try {
                    if (!as.A05) {
                        A08(as.A01, enumC3089hq, Boolean.valueOf(as.A04), as.A00);
                    } else {
                        try {
                            try {
                                this.A02.A05 = SystemClock.elapsedRealtime();
                                as.A00.reset();
                                av = this.A02;
                            } catch (IllegalStateException unused) {
                                A09(as.A02, as.A00);
                                av = this.A02;
                            }
                            av.A05 = -1L;
                            if (as.A03) {
                                synchronized (this.A02.A04) {
                                    set = this.A02.A04.get(as.A02);
                                }
                                if (set != null) {
                                    synchronized (set) {
                                        set.add(as.A00);
                                        this.A02.A00++;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            this.A02.A05 = -1L;
                            throw th2;
                        }
                    }
                    try {
                        synchronized (this.A01) {
                            this.A01.remove(as);
                        }
                    } catch (Exception e10) {
                        strA04 = A04(43, 23, 55);
                        str = String.format(A04(66, 46, 44), e10.getMessage());
                        Log.w(strA04, str);
                    }
                } catch (Throwable th3) {
                    try {
                    } catch (Exception e11) {
                        Log.w(A04(43, 23, 55), String.format(A04(66, 46, 44), e11.getMessage()));
                    }
                    synchronized (this.A01) {
                        this.A01.remove(as);
                        throw th3;
                    }
                }
            } catch (Exception e12) {
                Log.w(A04(43, 23, 55), String.format(A04(112, 38, 63), e12.getMessage()));
                try {
                    synchronized (this.A01) {
                        this.A01.remove(as);
                    }
                } catch (Exception e13) {
                    strA04 = A04(43, 23, 55);
                    str = String.format(A04(66, 46, 44), e13.getMessage());
                    Log.w(strA04, str);
                }
            }
        }
    }

    private void A08(C3092hv c3092hv, EnumC3089hq enumC3089hq, Boolean bool, AO ao) {
        try {
            if (!c3092hv.A0Q || (!bool.booleanValue() && !c3092hv.A0P)) {
                ao.stop();
            }
        } finally {
            this.A02.A03().A08(enumC3089hq, ao.hashCode());
            ao.AGr();
            this.A02.A03().A07(enumC3089hq, ao.hashCode());
        }
    }

    private void A09(String str, AO ao) {
        Set<AO> set;
        synchronized (this.A02.A04) {
            set = this.A02.A04.get(str);
        }
        if (set != null) {
            synchronized (set) {
                if (set.remove(ao)) {
                    AV av = this.A02;
                    av.A00--;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0A(boolean r24, com.facebook.ads.redexgen.core.C3092hv r25, final com.facebook.ads.redexgen.core.EnumC3089hq r26, java.lang.String r27, com.facebook.ads.redexgen.core.AO r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.AU.A0A(boolean, com.facebook.ads.redexgen.X.hv, com.facebook.ads.redexgen.X.hq, java.lang.String, com.facebook.ads.redexgen.X.AO):void");
    }
}
