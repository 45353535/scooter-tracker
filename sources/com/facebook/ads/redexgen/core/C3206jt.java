package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3206jt implements InterfaceC2210Kc {
    public static byte[] A02;
    public static String[] A03 = {"H5L2tIFZt", "7T8ctTOgfri2uFWYkrl4fLjFw3zYZmyw", "rpSuNqLmPSNrp8BaktpsZc4frut4njZi", "OS1ujTmztQNXT6hqD6nsoX0kfRSYmmsY", "PkY6KfFeVbpCvwlFdEj", "TmaVkoyYGnCbszGh0vcMc", "p0AihzwiszaEN", "o1l4pHohEGjnpBhSGl6NtukXiQnI0CCo"};
    public final int A00;
    public final List<C3497or> A01;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 72);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private List<C3497or> A03(C2209Kb c2209Kb) {
        String strA02;
        int i10;
        if (A05(32)) {
            return this.A01;
        }
        C4J c4j = new C4J(c2209Kb.A03);
        List<C3497or> arrayList = this.A01;
        while (c4j.A07() > 0) {
            int iA0I = c4j.A0I();
            int iA09 = c4j.A09() + c4j.A0I();
            if (iA0I == 134) {
                arrayList = new ArrayList<>();
                int iA0I2 = c4j.A0I() & 31;
                for (int i11 = 0; i11 < iA0I2; i11++) {
                    String strA0W = c4j.A0W(3);
                    int iA0I3 = c4j.A0I();
                    boolean z10 = (iA0I3 & 128) != 0;
                    if (z10) {
                        strA02 = A02(19, 19, 47);
                        i10 = iA0I3 & 63;
                    } else {
                        strA02 = A02(0, 19, 57);
                        i10 = 1;
                    }
                    byte bA0I = (byte) c4j.A0I();
                    c4j.A0g(1);
                    List<byte[]> listA04 = null;
                    if (z10) {
                        boolean z11 = (bA0I & SignedBytes.MAX_POWER_OF_TWO) != 0;
                        if (A03[5].length() != 21) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[6] = "Fx9tcNCtSciYr";
                        strArr[4] = "fWuzF8xs7o61BMX22RC";
                        listA04 = C3U.A04(z11);
                    }
                    arrayList.add(new C2D().A11(strA02).A10(strA0W).A0Z(i10).A12(listA04).A14());
                }
            }
            c4j.A0f(iA09);
        }
        return arrayList;
    }

    public static void A04() {
        A02 = new byte[]{-30, -15, -15, -19, -22, -28, -30, -11, -22, -16, -17, -80, -28, -26, -30, -82, -73, -79, -71, -40, -25, -25, -29, -32, -38, -40, -21, -32, -26, -27, -90, -38, -36, -40, -92, -82, -89, -81, Ascii.FF, Ascii.ESC, Ascii.ESC, Ascii.ETB, Ascii.DC4, Ascii.SO, Ascii.FF, Ascii.US, Ascii.DC4, Ascii.SUB, Ascii.EM, -38, 33, Ascii.EM, Ascii.SI, -39, Ascii.SI, 33, 13, -39, Ascii.FF, Ascii.DC4, Ascii.US, -61, -46, -46, -50, -53, -59, -61, -42, -53, -47, -48, -111, -38, -113, -43, -59, -42, -57, -107, -105};
    }

    static {
        A04();
    }

    public C3206jt() {
        this(0);
    }

    @MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    public C3206jt(int i10) {
        this(i10, MetaExoPlayerCustomizedCollections.A03(new C3497or[0]));
    }

    public C3206jt(int i10, List<C3497or> list) {
        this.A00 = i10;
        this.A01 = list;
    }

    private KX A00(C2209Kb c2209Kb) {
        return new KX(A03(c2209Kb));
    }

    private C2215Kh A01(C2209Kb c2209Kb) {
        return new C2215Kh(A03(c2209Kb));
    }

    private boolean A05(int i10) {
        return (this.A00 & i10) != 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2210Kc
    public final SparseArray<InterfaceC2213Kf> A5I() {
        return new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2210Kc
    public final InterfaceC2213Kf A5N(int i10, C2209Kb c2209Kb) {
        switch (i10) {
            case 2:
            case 128:
                return new C3195ji(new C3203jq(A01(c2209Kb)));
            case 3:
            case 4:
                return new C3195ji(new C3197jk(c2209Kb.A01));
            case 15:
                if (A05(2)) {
                    return null;
                }
                return new C3195ji(new C3207ju(false, c2209Kb.A01));
            case 16:
                return new C3195ji(new C3202jp(A01(c2209Kb)));
            case 17:
                if (A05(2)) {
                    return null;
                }
                return new C3195ji(new C3198jl(c2209Kb.A01));
            case 21:
                return new C3195ji(new C3199jm());
            case 27:
                if (A05(4)) {
                    return null;
                }
                return new C3195ji(new C3201jo(A00(c2209Kb), A05(1), A05(8)));
            case 36:
                return new C3195ji(new C3200jn(A00(c2209Kb)));
            case 89:
                return new C3195ji(new C3204jr(c2209Kb.A02));
            case 129:
            case 135:
                return new C3195ji(new C3213k0(c2209Kb.A01));
            case 130:
                if (!A05(64)) {
                    return null;
                }
                break;
            case 134:
                if (A05(16)) {
                    return null;
                }
                return new C3190jd(new C3196jj(A02(61, 20, 26)));
            case 138:
                break;
            case 172:
                return new C3195ji(new C3210jx(c2209Kb.A01));
            case 257:
                return new C3190jd(new C3196jj(A02(38, 23, 99)));
            default:
                return null;
        }
        return new C3195ji(new C3205js(c2209Kb.A01));
    }
}
