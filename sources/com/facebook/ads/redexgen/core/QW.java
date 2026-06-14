package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import com.applovin.shadow.okio.Utf8;
import com.explorestack.protobuf.openrtb.LossReason;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class QW {
    public static byte[] A09;
    public static String[] A0A = {"", "d6jyZ4YF4aAx6mY2oyMV8cMH3x1tTmGX", "6ShmsSFKDmdiSeaEbVJI0pMmhv", "Jy6CLSdjiTJVmxisrmhO9od6ZqYVQGpz", "aKDRqPZxmSwbRmY5O7VQCqOvGq0yRVmO", "vr6xx06LqTBYtEPA9ZzozSqPDwzkbNaY", "Y84hViIy7qYskGYmJ3QVEouknT", ""};
    public QV A01;
    public AbstractC2365Qe A04;
    public final /* synthetic */ C18676g A08;
    public final ArrayList<AbstractC2367Qg> A05 = new ArrayList<>();
    public ArrayList<AbstractC2367Qg> A02 = null;
    public final ArrayList<AbstractC2367Qg> A06 = new ArrayList<>();
    public final List<AbstractC2367Qg> A07 = Collections.unmodifiableList(this.A05);
    public int A03 = 2;
    public int A00 = 2;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A09 = new byte[]{113, 56, 34, Ascii.DLE, 37, 37, 48, 50, 57, 52, 53, 107, 56, 86, 17, Ascii.CAN, Ascii.CAN, 13, Ascii.ESC, 10, 68, 32, 39, 41, SignedBytes.MAX_POWER_OF_TWO, 125, 108, 100, 41, 106, 102, 124, 103, 125, 51, 79, 72, Ascii.NAK, Ascii.DC2, 7, Ascii.DC2, 3, 92, 121, 91, 86, 86, 95, 94, Ascii.SUB, 73, 89, 72, 91, 74, Ascii.SUB, 76, 83, 95, 77, Ascii.SUB, 77, 83, 78, 82, Ascii.SUB, 91, 84, Ascii.SUB, 83, 84, 76, 91, 86, 83, 94, Ascii.SUB, 76, 83, 95, 77, Ascii.DC4, Ascii.SUB, 115, 84, 76, 91, 86, 83, 94, Ascii.SUB, 76, 83, 95, 77, 73, Ascii.SUB, 89, 91, 84, 84, 85, 78, Ascii.SUB, 88, 95, Ascii.SUB, 72, 95, 79, 73, 95, 94, Ascii.SUB, 92, 72, 85, 87, Ascii.SUB, 73, 89, 72, 91, 74, Ascii.SYN, Ascii.SUB, 78, 82, 95, 67, Ascii.SUB, 73, 82, 85, 79, 86, 94, Ascii.SUB, 72, 95, 88, 85, 79, 84, 94, Ascii.SUB, 92, 72, 85, 87, Ascii.SUB, 72, 95, 89, 67, 89, 86, 95, 72, Ascii.SUB, 74, 85, 85, 86, Ascii.DC4, 116, 83, 94, 82, 83, 78, 84, 78, 73, 88, 83, 94, 68, Ascii.GS, 89, 88, 73, 88, 94, 73, 88, 89, 19, Ascii.GS, 116, 83, 75, 92, 81, 84, 89, Ascii.GS, 84, 73, 88, 80, Ascii.GS, 77, 82, 78, 84, 73, 84, 82, 83, Ascii.GS, Ascii.US, 56, 53, 57, 56, 37, Utf8.REPLACEMENT_BYTE, 37, 34, 51, 56, 53, 47, 118, 50, 51, 34, 51, 53, 34, 51, 50, 120, 118, Ascii.US, 56, 32, 55, 58, Utf8.REPLACEMENT_BYTE, 50, 118, 32, Utf8.REPLACEMENT_BYTE, 51, 33, 118, 62, 57, 58, 50, 51, 36, 118, 55, 50, 55, 38, 34, 51, 36, 118, 38, 57, 37, Utf8.REPLACEMENT_BYTE, 34, Utf8.REPLACEMENT_BYTE, 57, 56, 89, 126, 102, 113, 124, 121, 116, 48, 121, 100, 117, 125, 48, 96, Ascii.DEL, 99, 121, 100, 121, Ascii.DEL, 126, 48, Ascii.DC2, 34, 51, 32, 49, 49, 36, 37, 97, 46, 51, 97, 32, 53, 53, 32, 34, 41, 36, 37, 97, 55, 40, 36, 54, 50, 97, 44, 32, 56, 97, 47, 46, 53, 97, 35, 36, 97, 51, 36, 34, 56, 34, 45, 36, 37, 111, 97, 40, 50, Ascii.DC2, 34, 51, 32, 49, 123, 108, 85, 72, Ascii.CAN, 92, 93, 76, 89, 91, 80, 93, 92, Ascii.CAN, 78, 81, 93, 79, Ascii.CAN, 75, 80, 87, 77, 84, 92, Ascii.CAN, 90, 93, Ascii.CAN, 74, 93, 85, 87, 78, 93, 92, Ascii.CAN, 94, 74, 87, 85, Ascii.CAN, 106, 93, 91, 65, 91, 84, 93, 74, 110, 81, 93, 79, Ascii.CAN, 90, 93, 94, 87, 74, 93, Ascii.CAN, 81, 76, Ascii.CAN, 91, 89, 86, Ascii.CAN, 90, 93, Ascii.CAN, 74, 93, 91, 65, 91, 84, 93, 92, 2, Ascii.CAN, 87, 113, 122, 106, 109, 100, 35, 119, 108, 35, 113, 102, 96, 122, 96, 111, 102, 35, 98, 109, 35, 106, 100, 109, 108, 113, 102, 103, 35, 117, 106, 102, 116, 35, 107, 108, 111, 103, 102, 113, 45, 35, 90, 108, 118, 35, 112, 107, 108, 118, 111, 103, 35, 101, 106, 113, 112, 119, 35, 96, 98, 111, 111, 35, 112, 119, 108, 115, 74, 100, 109, 108, 113, 106, 109, 100, 85, 106, 102, 116, 43, 117, 106, 102, 116, 42, 35, 97, 102, 101, 108, 113, 102, 35, 96, 98, 111, 111, 106, 109, 100, 35, 113, 102, 96, 122, 96, 111, 102, 45, 48, 50, 35, 1, 62, 50, 32, 17, 56, 37, 7, 56, 36, 62, 35, 62, 56, 57, Ascii.SYN, 57, 51, 3, 46, 39, 50, Ascii.GS, Ascii.DLE, 8, Ascii.RS, 4, 5, 81, Ascii.CAN, Ascii.US, Ascii.NAK, Ascii.DC4, 9, 81, 2, Ascii.EM, Ascii.RS, 4, Ascii.GS, Ascii.NAK, 81, Ascii.US, Ascii.RS, 5, 81, 19, Ascii.DC4, 81, 92, SignedBytes.MAX_POWER_OF_TWO, 81, Ascii.DLE, Ascii.ETB, 5, Ascii.DC4, 3, 81, 4, Ascii.US, Ascii.EM, Ascii.CAN, Ascii.NAK, Ascii.CAN, Ascii.US, Ascii.SYN, 81, Ascii.DLE, 81, 7, Ascii.CAN, Ascii.DC4, 6, 75, 69, 68, 124, 67, 79, 93, 120, 79, 73, 83, 73, 70, 79, 78};
    }

    static {
        A05();
    }

    public QW(C18676g c18676g) {
        this.A08 = c18676g;
    }

    private final View A00(int i10, boolean z10) {
        return A0I(i10, z10, Long.MAX_VALUE).A0H;
    }

    private final AbstractC2367Qg A01(int i10) {
        int size;
        int iA04;
        if (this.A02 == null || (size = this.A02.size()) == 0) {
            return null;
        }
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC2367Qg abstractC2367Qg = this.A02.get(i11);
            if (!abstractC2367Qg.A0m()) {
                int i12 = abstractC2367Qg.A0O();
                if (i12 == i10) {
                    abstractC2367Qg.A0Z(32);
                    return abstractC2367Qg;
                }
            }
        }
        if (this.A08.A04.A0M() && (iA04 = this.A08.A00.A04(i10)) > 0) {
            int offsetPosition = this.A08.A04.A0B();
            if (iA04 < offsetPosition) {
                long jA0D = this.A08.A04.A0D(iA04);
                for (int i13 = 0; i13 < size; i13++) {
                    AbstractC2367Qg abstractC2367Qg2 = this.A02.get(i13);
                    if (!abstractC2367Qg2.A0m() && abstractC2367Qg2.A0Q() == jA0D) {
                        abstractC2367Qg2.A0Z(32);
                        return abstractC2367Qg2;
                    }
                }
            }
        }
        return null;
    }

    private final AbstractC2367Qg A02(int i10, boolean z10) {
        View viewA08;
        int size = this.A05.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC2367Qg abstractC2367Qg = this.A05.get(i11);
            if (!abstractC2367Qg.A0m()) {
                int scrapCount = abstractC2367Qg.A0O();
                if (scrapCount == i10 && !abstractC2367Qg.A0f() && (this.A08.A0s.A09 || !abstractC2367Qg.A0g())) {
                    abstractC2367Qg.A0Z(32);
                    return abstractC2367Qg;
                }
            }
        }
        if (!z10 && (viewA08 = this.A08.A01.A08(i10)) != null) {
            AbstractC2367Qg abstractC2367QgA0F = C18676g.A0F(viewA08);
            this.A08.A01.A0G(viewA08);
            int iA07 = this.A08.A01.A07(viewA08);
            if (iA07 != -1) {
                this.A08.A01.A0C(iA07);
                A0S(viewA08);
                abstractC2367QgA0F.A0Z(8224);
                return abstractC2367QgA0F;
            }
            throw new IllegalStateException(A04(565, 52, 123) + abstractC2367QgA0F + this.A08.A1J());
        }
        int size2 = this.A06.size();
        for (int i12 = 0; i12 < size2; i12++) {
            AbstractC2367Qg holder = this.A06.get(i12);
            String[] strArr = A0A;
            String str = strArr[7];
            String str2 = strArr[0];
            int cacheSize = str.length();
            int scrapCount2 = str2.length();
            if (cacheSize != scrapCount2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "JIr6ryR6hWTh2WYmHdarh5TP4xAypylw";
            strArr2[1] = "npmC62BAQEqZygYceoAiNhkQGghR92x0";
            if (!holder.A0f()) {
                int scrapCount3 = holder.A0O();
                if (scrapCount3 == i10) {
                    if (!z10) {
                        this.A06.remove(i12);
                    }
                    return holder;
                }
            }
        }
        return null;
    }

    private final AbstractC2367Qg A03(long j10, int i10, boolean z10) {
        int count = this.A05.size();
        for (int i11 = count - 1; i11 >= 0; i11--) {
            AbstractC2367Qg abstractC2367Qg = this.A05.get(i11);
            if (abstractC2367Qg.A0Q() == j10 && !abstractC2367Qg.A0m()) {
                int count2 = abstractC2367Qg.A0N();
                if (i10 == count2) {
                    abstractC2367Qg.A0Z(32);
                    boolean zA0g = abstractC2367Qg.A0g();
                    String[] strArr = A0A;
                    String str = strArr[2];
                    String str2 = strArr[6];
                    int i12 = str.length();
                    int count3 = str2.length();
                    if (i12 == count3) {
                        String[] strArr2 = A0A;
                        strArr2[4] = "3Wf6vMFZ4V6K3VYEAeXlgILB3Kqn8tmj";
                        strArr2[1] = "2gRFj7AUivxslEY3Do0gPT185jjA6g6i";
                        if (zA0g && !this.A08.A0s.A07()) {
                            abstractC2367Qg.A0a(2, 14);
                        }
                        return abstractC2367Qg;
                    }
                } else if (z10) {
                    continue;
                } else {
                    this.A05.remove(i11);
                    C18676g c18676g = this.A08;
                    View view = abstractC2367Qg.A0H;
                    String[] strArr3 = A0A;
                    String str3 = strArr3[7];
                    String str4 = strArr3[0];
                    int i13 = str3.length();
                    int count4 = str4.length();
                    if (i13 == count4) {
                        String[] strArr4 = A0A;
                        strArr4[5] = "QSy8SYzj9TGZXONlvrRd2Hl7xNggaX2t";
                        strArr4[3] = "FStY7c67BTbAcWAeNWEJdNOuKPlMCdqH";
                        c18676g.removeDetachedView(view, false);
                        A0R(abstractC2367Qg.A0H);
                    }
                }
                throw new RuntimeException();
            }
        }
        int count5 = this.A06.size();
        for (int i14 = count5 - 1; i14 >= 0; i14--) {
            AbstractC2367Qg abstractC2367Qg2 = this.A06.get(i14);
            if (abstractC2367Qg2.A0Q() == j10) {
                int count6 = abstractC2367Qg2.A0N();
                if (i10 == count6) {
                    if (!z10) {
                        this.A06.remove(i14);
                    }
                    return abstractC2367Qg2;
                }
                if (!z10) {
                    A07(i14);
                    String[] strArr5 = A0A;
                    String str5 = strArr5[7];
                    String str6 = strArr5[0];
                    int cacheSize = str5.length();
                    int count7 = str6.length();
                    if (cacheSize != count7) {
                        throw new RuntimeException();
                    }
                    String[] strArr6 = A0A;
                    strArr6[2] = "Px4MCeB3tpw5Kws4bgsL6OQ2tD";
                    strArr6[6] = "cZzmTfGm3PDqBsfSjCaAnG9aB7";
                    return null;
                }
            }
        }
        return null;
    }

    private final void A06() {
        int count = this.A06.size();
        for (int count2 = count - 1; count2 >= 0; count2--) {
            A07(count2);
        }
        this.A06.clear();
        if (C18676g.A1E) {
            this.A08.A02.A02();
        }
    }

    private final void A07(int i10) {
        A0Z(this.A06.get(i10), true);
        this.A06.remove(i10);
    }

    private void A08(ViewGroup viewGroup, boolean z10) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                A08((ViewGroup) childAt, true);
            }
        }
        if (!z10) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
        } else {
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    private void A09(AbstractC2367Qg abstractC2367Qg) {
        if (this.A08.A1q()) {
            View view = abstractC2367Qg.A0H;
            if (P3.A00(view) == 0) {
                P3.A09(view, 1);
            }
            if (P3.A0F(view)) {
                return;
            }
            String[] strArr = A0A;
            if (strArr[4].charAt(14) != strArr[1].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "r5izwM6EITTd8J0QgfTuliuK3Ylx6gnH";
            strArr2[3] = "CLm8SGIYJT8sX0J5oMrTiG0qZUHKeksn";
            abstractC2367Qg.A0Z(16384);
            P3.A0B(view, this.A08.A09.A0A());
        }
    }

    private void A0A(AbstractC2367Qg abstractC2367Qg) {
        if (abstractC2367Qg.A0H instanceof ViewGroup) {
            A08((ViewGroup) abstractC2367Qg.A0H, false);
        }
    }

    private final void A0B(AbstractC2367Qg abstractC2367Qg) {
        if (0 != 0) {
            throw new NullPointerException(A04(617, 14, 32));
        }
        if (this.A08.A0s != null) {
            this.A08.A0t.A0B(abstractC2367Qg);
        }
    }

    private final boolean A0C(AbstractC2367Qg abstractC2367Qg) {
        if (abstractC2367Qg.A0g()) {
            return this.A08.A0s.A07();
        }
        if (abstractC2367Qg.A03 >= 0 && abstractC2367Qg.A03 < this.A08.A04.A0B()) {
            if (!this.A08.A0s.A07()) {
                int iA0C = this.A08.A04.A0C(abstractC2367Qg.A03);
                int type = abstractC2367Qg.A0N();
                if (iA0C != type) {
                    return false;
                }
            }
            return !this.A08.A04.A0M() || abstractC2367Qg.A0Q() == this.A08.A04.A0D(abstractC2367Qg.A03);
        }
        throw new IndexOutOfBoundsException(A04(LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 60, 92) + abstractC2367Qg + this.A08.A1J());
    }

    private boolean A0D(AbstractC2367Qg abstractC2367Qg, int i10, int i11, long j10) {
        abstractC2367Qg.A08 = this.A08;
        int iA0N = abstractC2367Qg.A0N();
        long nanoTime = this.A08.getNanoTime();
        if (j10 != Long.MAX_VALUE && !this.A01.A0A(iA0N, nanoTime, j10)) {
            return false;
        }
        this.A08.A04.A0J(abstractC2367Qg, i10);
        this.A01.A05(abstractC2367Qg.A0N(), this.A08.getNanoTime() - nanoTime);
        A09(abstractC2367Qg);
        if (this.A08.A0s.A07()) {
            abstractC2367Qg.A04 = i11;
            return true;
        }
        return true;
    }

    public final int A0E() {
        return this.A05.size();
    }

    public final View A0F(int i10) {
        return this.A05.get(i10).A0H;
    }

    public final View A0G(int i10) {
        return A00(i10, false);
    }

    public final QV A0H() {
        if (this.A01 == null) {
            this.A01 = new QV();
        }
        return this.A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0244  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.core.AbstractC2367Qg A0I(int r23, boolean r24, long r25) {
        /*
            Method dump skipped, instruction units count: 730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.QW.A0I(int, boolean, long):com.facebook.ads.redexgen.X.Qg");
    }

    public final List<AbstractC2367Qg> A0J() {
        return this.A07;
    }

    public final void A0K() {
        int size = this.A06.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A06.get(i10).A0S();
        }
        int i11 = this.A05.size();
        for (int scrapCount = 0; scrapCount < i11; scrapCount++) {
            this.A05.get(scrapCount).A0S();
        }
        if (this.A02 != null) {
            int changedScrapCount = this.A02.size();
            for (int scrapCount2 = 0; scrapCount2 < changedScrapCount; scrapCount2++) {
                this.A02.get(scrapCount2).A0S();
            }
        }
    }

    public final void A0L() {
        this.A05.clear();
        if (this.A02 != null) {
            this.A02.clear();
        }
    }

    public final void A0M() {
        int size = this.A06.size();
        for (int i10 = 0; i10 < size; i10++) {
            QP qp = (QP) this.A06.get(i10).A0H.getLayoutParams();
            if (qp != null) {
                qp.A01 = true;
            }
        }
    }

    public final void A0N() {
        if (this.A08.A04 != null && this.A08.A04.A0M()) {
            int size = this.A06.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC2367Qg abstractC2367Qg = this.A06.get(i10);
                if (abstractC2367Qg != null) {
                    abstractC2367Qg.A0Z(6);
                    abstractC2367Qg.A0c(null);
                }
            }
            return;
        }
        A06();
    }

    public final void A0O() {
        int i10 = this.A08.A06 != null ? this.A08.A06.A00 : 0;
        int extraCache = this.A03;
        this.A00 = extraCache + i10;
        int extraCache2 = this.A06.size();
        for (int i11 = extraCache2 - 1; i11 >= 0; i11--) {
            int size = this.A06.size();
            int i12 = this.A00;
            String[] strArr = A0A;
            String str = strArr[5];
            String str2 = strArr[3];
            int i13 = str.charAt(9);
            int extraCache3 = str2.charAt(9);
            if (i13 != extraCache3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "FM5srU9o6TBj8QlSYYqmaX9MZyJMPTMr";
            strArr2[3] = "mnADOFh1HT7Eu0tfTP5EsiAEmob0QgOc";
            if (size > i12) {
                A07(i11);
            } else {
                return;
            }
        }
    }

    public final void A0P() {
        this.A05.clear();
        A06();
    }

    public final void A0Q(int i10) {
        this.A03 = i10;
        A0O();
    }

    public final void A0R(View view) {
        AbstractC2367Qg abstractC2367QgA0F = C18676g.A0F(view);
        abstractC2367QgA0F.A0F = null;
        abstractC2367QgA0F.A0G = false;
        abstractC2367QgA0F.A0U();
        A0X(abstractC2367QgA0F);
    }

    public final void A0S(View view) {
        AbstractC2367Qg abstractC2367QgA0F = C18676g.A0F(view);
        if (abstractC2367QgA0F.A0o(12) || !abstractC2367QgA0F.A0j() || this.A08.A1y(abstractC2367QgA0F)) {
            if (!abstractC2367QgA0F.A0f() || abstractC2367QgA0F.A0g() || this.A08.A04.A0M()) {
                abstractC2367QgA0F.A0b(this, false);
                this.A05.add(abstractC2367QgA0F);
                return;
            }
            throw new IllegalArgumentException(A04(43, 122, 48) + this.A08.A1J());
        }
        if (this.A02 == null) {
            this.A02 = new ArrayList<>();
        }
        abstractC2367QgA0F.A0b(this, true);
        this.A02.add(abstractC2367QgA0F);
    }

    public final void A0T(View view) {
        AbstractC2367Qg abstractC2367QgA0F = C18676g.A0F(view);
        if (abstractC2367QgA0F.A0i()) {
            this.A08.removeDetachedView(view, false);
        }
        if (abstractC2367QgA0F.A0h()) {
            abstractC2367QgA0F.A0Y();
        } else if (abstractC2367QgA0F.A0m()) {
            abstractC2367QgA0F.A0U();
        }
        A0X(abstractC2367QgA0F);
    }

    public final void A0U(QC qc2, QC qc3, boolean z10) {
        A0P();
        A0H().A08(qc2, qc3, z10);
    }

    public final void A0V(QV qv) {
        if (this.A01 != null) {
            this.A01.A04();
        }
        this.A01 = qv;
        if (qv != null) {
            QV qv2 = this.A01;
            QC adapter = this.A08.getAdapter();
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "lsZK0accpgBQgJYjkQv5Abfcayw6pcR0";
            strArr2[1] = "Z7g3Rn3k4gV3vNYe90sCMa52PcoBzFf1";
            qv2.A07(adapter);
        }
    }

    public final void A0W(AbstractC2365Qe abstractC2365Qe) {
        this.A04 = abstractC2365Qe;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0X(com.facebook.ads.redexgen.core.AbstractC2367Qg r9) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.QW.A0X(com.facebook.ads.redexgen.X.Qg):void");
    }

    public final void A0Y(AbstractC2367Qg abstractC2367Qg) {
        if (abstractC2367Qg.A0G) {
            ArrayList<AbstractC2367Qg> arrayList = this.A02;
            String[] strArr = A0A;
            if (strArr[7].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "g9dUUHlnr2dNWy2bvXbXpUnxFV";
            strArr2[6] = "1VljHDZyW4yQ7QRXruVc6WBcEp";
            arrayList.remove(abstractC2367Qg);
        } else {
            this.A05.remove(abstractC2367Qg);
        }
        abstractC2367Qg.A0F = null;
        abstractC2367Qg.A0G = false;
        abstractC2367Qg.A0U();
    }

    public final void A0Z(AbstractC2367Qg abstractC2367Qg, boolean z10) {
        C18676g.A0s(abstractC2367Qg);
        if (abstractC2367Qg.A0o(16384)) {
            abstractC2367Qg.A0a(0, 16384);
            P3.A0B(abstractC2367Qg.A0H, null);
        }
        if (z10) {
            A0B(abstractC2367Qg);
        }
        abstractC2367Qg.A08 = null;
        A0H().A09(abstractC2367Qg);
    }
}
