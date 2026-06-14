package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes10.dex */
public final class fq extends fr {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2098 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2099;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2100 = {30806, 10691, 56107, 36057, ')', ' ', '\n', 22610, 2497, 64368, 44188};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2101 = -8183880007451782758L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private fr f2102;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private fr f2103;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ed f2104;

    public fq(ed edVar, fr frVar, fr frVar2) {
        this.f2104 = edVar;
        this.f2102 = frVar;
        this.f2103 = frVar2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6482(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1677) {
            try {
                char[] cArr = new char[i11];
                d.f1676 = 0;
                while (true) {
                    int i12 = d.f1676;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2100[i10 + i12]) ^ (((long) i12) * f2101)) ^ ((long) c10));
                        d.f1676 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r2.equals(r6.f2102) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r2.equals(r6.f2102) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r6.f2102 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.fq.f2098 = (com.ironsource.adqualitysdk.sdk.i.fq.f2099 + 41) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        r2 = r5.f2103;
        r6 = r6.f2103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        if (r2 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
    
        return r2.equals(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
    
        if (r6 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.fq.f2098 = (com.ironsource.adqualitysdk.sdk.i.fq.f2099 + 19) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0073, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 0
            if (r6 == 0) goto L74
            int r2 = com.ironsource.adqualitysdk.sdk.i.fq.f2099
            int r2 = r2 + 81
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.fq.f2098 = r2
            java.lang.Class r2 = r6.getClass()
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.fq> r3 = com.ironsource.adqualitysdk.sdk.i.fq.class
            if (r3 == r2) goto L18
            goto L74
        L18:
            com.ironsource.adqualitysdk.sdk.i.fq r6 = (com.ironsource.adqualitysdk.sdk.i.fq) r6
            com.ironsource.adqualitysdk.sdk.i.ed r2 = r5.f2104
            if (r2 == 0) goto L27
            com.ironsource.adqualitysdk.sdk.i.ed r3 = r6.f2104
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2c
            goto L2b
        L27:
            com.ironsource.adqualitysdk.sdk.i.ed r2 = r6.f2104
            if (r2 == 0) goto L2c
        L2b:
            return r1
        L2c:
            com.ironsource.adqualitysdk.sdk.i.fr r2 = r5.f2102
            if (r2 == 0) goto L51
            int r3 = com.ironsource.adqualitysdk.sdk.i.fq.f2098
            int r3 = r3 + 31
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.fq.f2099 = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L48
            com.ironsource.adqualitysdk.sdk.i.fr r3 = r6.f2102
            boolean r2 = r2.equals(r3)
            r3 = 48
            int r3 = r3 / r1
            if (r2 != 0) goto L5e
            goto L55
        L48:
            com.ironsource.adqualitysdk.sdk.i.fr r3 = r6.f2102
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5e
            goto L55
        L51:
            com.ironsource.adqualitysdk.sdk.i.fr r2 = r6.f2102
            if (r2 == 0) goto L5e
        L55:
            int r6 = com.ironsource.adqualitysdk.sdk.i.fq.f2099
            int r6 = r6 + 41
            int r6 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.fq.f2098 = r6
            return r1
        L5e:
            com.ironsource.adqualitysdk.sdk.i.fr r2 = r5.f2103
            com.ironsource.adqualitysdk.sdk.i.fr r6 = r6.f2103
            if (r2 == 0) goto L69
            boolean r6 = r2.equals(r6)
            return r6
        L69:
            if (r6 != 0) goto L74
            int r6 = com.ironsource.adqualitysdk.sdk.i.fq.f2099
            int r6 = r6 + 19
            int r6 = r6 % 128
            com.ironsource.adqualitysdk.sdk.i.fq.f2098 = r6
            return r0
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.fq.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ed edVar = this.f2104;
        int iHashCode = 0;
        int iHashCode2 = (edVar != null ? edVar.hashCode() : 0) * 31;
        fr frVar = this.f2102;
        int iHashCode3 = (iHashCode2 + (frVar != null ? frVar.hashCode() : 0)) * 31;
        fr frVar2 = this.f2103;
        if (frVar2 != null) {
            f2099 = (f2098 + 27) % 128;
            iHashCode = frVar2.hashCode();
            f2099 = (f2098 + 59) % 128;
        }
        int i10 = iHashCode3 + iHashCode;
        int i11 = f2099 + 9;
        f2098 = i11 % 128;
        if (i11 % 2 != 0) {
            return i10;
        }
        throw null;
    }

    public final String toString() {
        int size;
        char packedPositionType;
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6482(ViewConfiguration.getFadingEdgeLength() >> 16, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 30783), TextUtils.lastIndexOf("", '0', 0, 0) + 5).intern());
        sb2.append(this.f2104);
        sb2.append(m6482(4 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1).intern());
        if (this.f2102 instanceof fk) {
            int i10 = f2099 + 43;
            f2098 = i10 % 128;
            if (i10 % 2 == 0) {
                size = 5 % View.MeasureSpec.getSize(0);
                packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                iIndexOf = 1 / TextUtils.indexOf("", "");
            } else {
                size = View.MeasureSpec.getSize(0) + 5;
                packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                iIndexOf = TextUtils.indexOf("", "") + 1;
            }
            sb2.append(m6482(size, packedPositionType, iIndexOf).intern());
        } else {
            sb2.append(m6482((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern());
            f2098 = (f2099 + 69) % 128;
        }
        sb2.append(this.f2102);
        fr frVar = this.f2103;
        if (frVar != null) {
            if (frVar instanceof fk) {
                sb2.append(m6482(5 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((-1) - Process.getGidForName("")), -((byte) KeyEvent.getModifierMetaStateMask())).intern());
            } else {
                sb2.append(m6482((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), TextUtils.indexOf("", "", 0) + 1).intern());
            }
            sb2.append(m6482(View.getDefaultSize(0, 0) + 7, (char) (TextUtils.indexOf("", "") + 22583), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3).intern());
            if (this.f2103 instanceof fk) {
                f2098 = (f2099 + 67) % 128;
                sb2.append(m6482(5 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) KeyEvent.getDeadChar(0, 0), -TextUtils.lastIndexOf("", '0', 0, 0)).intern());
            } else {
                sb2.append(m6482(ExpandableListView.getPackedPositionChild(0L) + 7, (char) (ViewConfiguration.getPressedStateDuration() >> 16), 1 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern());
            }
            sb2.append(this.f2103);
            f2099 = (f2098 + 21) % 128;
        }
        return sb2.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ﾒ */
    public final dr mo6475(du duVar, cq cqVar) {
        if (this.f2104.m6434(duVar, cqVar).m6379()) {
            dr drVarMo6475 = this.f2102.mo6475(duVar, cqVar);
            f2098 = (f2099 + 39) % 128;
            return drVarMo6475;
        }
        fr frVar = this.f2103;
        if (frVar == null) {
            return new dr(Boolean.FALSE);
        }
        f2098 = (f2099 + 21) % 128;
        return frVar.mo6475(duVar, cqVar);
    }
}
