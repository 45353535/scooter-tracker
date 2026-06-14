package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2375Qo {
    public static byte[] A02;
    public static String[] A03 = {"TTkBeT", "dgqPpyxawDBTokVKz6usds7DGGljbLlG", "Om", "1", "lOfLhIubd0jJyTpTkNltmpZf14oHCLV9", "yX0qRkYxaN2cv8t3SuJSwpxSeia", "n9D4XHOOTGgVdLWa6Wuko3wZCERnKgc", "NKR9b6EIrIhl49GaATLNKeLdYiLud"};
    public final C3017gb<AbstractC2367Qg, C2373Qm> A00 = new C3017gb<>();
    public final OS<AbstractC2367Qg> A01 = new OS<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {78, 118, 112, 119, 35, 115, 113, 108, 117, 106, 103, 102, 35, 101, 111, 98, 100, 35, 83, 81, 70, 35, 108, 113, 35, 83, 76, 80, 87};
        if (A03[1].charAt(27) != 'j') {
            throw new RuntimeException();
        }
        A03[0] = "DMTuNl";
        A02 = bArr;
    }

    static {
        A02();
    }

    private QJ A00(AbstractC2367Qg abstractC2367Qg, int i10) {
        C2373Qm c2373QmA0B;
        QJ info;
        int iA08 = this.A00.A08(abstractC2367Qg);
        if (iA08 >= 0 && (c2373QmA0B = this.A00.A0B(iA08)) != null) {
            int i11 = c2373QmA0B.A00;
            if (A03[2].length() != 2) {
                throw new RuntimeException();
            }
            A03[2] = "6x";
            if ((i11 & i10) != 0) {
                int i12 = c2373QmA0B.A00;
                int index = ~i10;
                c2373QmA0B.A00 = i12 & index;
                if (i10 == 4) {
                    info = c2373QmA0B.A02;
                } else if (i10 == 8) {
                    info = c2373QmA0B.A01;
                } else {
                    throw new IllegalArgumentException(A01(0, 29, 14));
                }
                int index2 = c2373QmA0B.A00;
                if ((index2 & 12) == 0) {
                    this.A00.A0A(iA08);
                    C2373Qm.A02(c2373QmA0B);
                }
                return info;
            }
        }
        return null;
    }

    public final QJ A03(AbstractC2367Qg abstractC2367Qg) {
        return A00(abstractC2367Qg, 8);
    }

    public final QJ A04(AbstractC2367Qg abstractC2367Qg) {
        return A00(abstractC2367Qg, 4);
    }

    public final AbstractC2367Qg A05(long j10) {
        return this.A01.A08(j10);
    }

    public final void A06() {
        this.A00.clear();
        this.A01.A09();
    }

    public final void A07() {
        C2373Qm.A01();
    }

    public final void A08(long j10, AbstractC2367Qg abstractC2367Qg) {
        this.A01.A0B(j10, abstractC2367Qg);
    }

    public final void A09(AbstractC2367Qg abstractC2367Qg) {
        C2373Qm c2373QmA00 = this.A00.get(abstractC2367Qg);
        if (c2373QmA00 == null) {
            c2373QmA00 = C2373Qm.A00();
            this.A00.put(abstractC2367Qg, c2373QmA00);
        }
        c2373QmA00.A00 |= 1;
    }

    public final void A0A(AbstractC2367Qg abstractC2367Qg) {
        C2373Qm c2373Qm = this.A00.get(abstractC2367Qg);
        if (c2373Qm == null) {
            return;
        }
        c2373Qm.A00 &= -2;
    }

    public final void A0B(AbstractC2367Qg abstractC2367Qg) {
        int iA06 = this.A01.A06() - 1;
        while (true) {
            if (iA06 < 0) {
                break;
            }
            if (abstractC2367Qg == this.A01.A07(iA06)) {
                this.A01.A0A(iA06);
                break;
            }
            iA06--;
        }
        C2373Qm info = this.A00.remove(abstractC2367Qg);
        if (info != null) {
            C2373Qm.A02(info);
        }
    }

    public final void A0C(AbstractC2367Qg abstractC2367Qg) {
        A0A(abstractC2367Qg);
    }

    public final void A0D(AbstractC2367Qg abstractC2367Qg, QJ qj) {
        C2373Qm c2373QmA00 = this.A00.get(abstractC2367Qg);
        if (c2373QmA00 == null) {
            c2373QmA00 = C2373Qm.A00();
            this.A00.put(abstractC2367Qg, c2373QmA00);
        }
        c2373QmA00.A00 |= 2;
        c2373QmA00.A02 = qj;
    }

    public final void A0E(AbstractC2367Qg abstractC2367Qg, QJ qj) {
        C2373Qm c2373QmA00 = this.A00.get(abstractC2367Qg);
        if (c2373QmA00 == null) {
            c2373QmA00 = C2373Qm.A00();
            this.A00.put(abstractC2367Qg, c2373QmA00);
        }
        c2373QmA00.A01 = qj;
        c2373QmA00.A00 |= 8;
    }

    public final void A0F(AbstractC2367Qg abstractC2367Qg, QJ qj) {
        C2373Qm c2373QmA00 = this.A00.get(abstractC2367Qg);
        if (c2373QmA00 == null) {
            c2373QmA00 = C2373Qm.A00();
            this.A00.put(abstractC2367Qg, c2373QmA00);
        }
        c2373QmA00.A02 = qj;
        c2373QmA00.A00 |= 4;
    }

    public final void A0G(InterfaceC2374Qn interfaceC2374Qn) {
        for (int size = this.A00.size() - 1; size >= 0; size--) {
            AbstractC2367Qg abstractC2367QgA09 = this.A00.A09(size);
            C2373Qm c2373QmA0A = this.A00.A0A(size);
            if ((c2373QmA0A.A00 & 3) == 3) {
                interfaceC2374Qn.AJo(abstractC2367QgA09);
            } else {
                int index = c2373QmA0A.A00;
                if ((index & 1) != 0) {
                    if (c2373QmA0A.A02 == null) {
                        interfaceC2374Qn.AJo(abstractC2367QgA09);
                    } else {
                        interfaceC2374Qn.AGR(abstractC2367QgA09, c2373QmA0A.A02, c2373QmA0A.A01);
                    }
                } else if ((c2373QmA0A.A00 & 14) == 14) {
                    interfaceC2374Qn.AGP(abstractC2367QgA09, c2373QmA0A.A02, c2373QmA0A.A01);
                } else if ((c2373QmA0A.A00 & 12) == 12) {
                    interfaceC2374Qn.AGT(abstractC2367QgA09, c2373QmA0A.A02, c2373QmA0A.A01);
                } else {
                    int index2 = c2373QmA0A.A00;
                    if ((index2 & 4) != 0) {
                        interfaceC2374Qn.AGR(abstractC2367QgA09, c2373QmA0A.A02, null);
                    } else {
                        int index3 = c2373QmA0A.A00;
                        if ((index3 & 8) != 0) {
                            QJ qj = c2373QmA0A.A02;
                            if (A03[4].charAt(6) == 'y') {
                                throw new RuntimeException();
                            }
                            A03[7] = "pRTOxDzzIVV0VuKMKqyuKOShfW9n8";
                            interfaceC2374Qn.AGP(abstractC2367QgA09, qj, c2373QmA0A.A01);
                        } else {
                            continue;
                        }
                    }
                }
            }
            C2373Qm.A02(c2373QmA0A);
        }
    }

    public final boolean A0H(AbstractC2367Qg abstractC2367Qg) {
        C2373Qm record = this.A00.get(abstractC2367Qg);
        return (record == null || (record.A00 & 1) == 0) ? false : true;
    }

    public final boolean A0I(AbstractC2367Qg abstractC2367Qg) {
        C2373Qm record = this.A00.get(abstractC2367Qg);
        return (record == null || (record.A00 & 4) == 0) ? false : true;
    }
}
