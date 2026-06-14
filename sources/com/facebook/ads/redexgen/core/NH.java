package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.text.TextUtils;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class NH {
    public static byte[] A05;
    public static String[] A06 = {"SwW", "nKJOmWTx3LjNZvOp7YbBROgXIyGkfXUh", "cNvS8LZQYgXEdOP85dYAvAy4C3J", "ICxq6EmLG0dgZi7UJ5PBV2wBsvrmCfpb", "tKedy3gZYTLe", "bmz0vq", "hvIAQTYE0cdtFIL2", "tj9oqRvQS19ndgZTuA"};
    public SF A00;
    public EnumC2609Zt A01 = EnumC2609Zt.A05;
    public ArrayList<C2731bt> A02 = new ArrayList<>();
    public final AbstractC2273Mo A03;
    public final NG A04;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-35, Ascii.ETB, 35, Ascii.FS, Ascii.ESC, -66, -29, -23, -38, -25, -29, -42, -31, -107, -70, -25, -25, -28, -25, -107, -89, -91, -91, -85, -107, -20, -34, -23, -35, -28, -22, -23, -107, -42, -107, -21, -42, -31, -34, -39, -107, -74, -39, -66, -29, -37, -28, -93, Ascii.NAK, Ascii.CAN, 19, Ascii.CAN, Ascii.NAK, 40, Ascii.NAK, 19, Ascii.SYN, 41, 34, Ascii.CAN, 32, Ascii.EM, -29, -14, -21, -36, -31, -38, -30, -25, -40, -23, -38, -21, -38, -26, -20, Ascii.DC2, Ascii.ETB, Ascii.DLE, Ascii.CAN, Ascii.GS, Ascii.DC4, 19, -16, 19, -13, Ascii.DLE, 35, Ascii.DLE, -15, 36, Ascii.GS, 19, Ascii.ESC, Ascii.DC4, Utf8.REPLACEMENT_BYTE, 68, 74, 59, 72, 73, 74, Utf8.REPLACEMENT_BYTE, 74, Utf8.REPLACEMENT_BYTE, 55, 66};
    }

    static {
        A06();
    }

    public NH(C2820dL c2820dL, NU nu, NG ng2, String str) {
        JSONObject dataObject = nu.A03();
        this.A03 = A01(c2820dL, nu, str, dataObject);
        this.A04 = ng2;
    }

    private AdError A00(C2820dL c2820dL, AbstractC3095hy abstractC3095hy) {
        if (abstractC3095hy == null || abstractC3095hy.A27().isEmpty()) {
            c2820dL.A08().AAy(A04(62, 3, 33), AbstractC2433Sv.A0Z, new C2434Sw(A04(5, 43, 20)));
            return AdError.internalError(2006);
        }
        return null;
    }

    public static AbstractC2273Mo A01(C2820dL c2820dL, NU nu, String str, JSONObject jSONObject) {
        AbstractC2273Mo abstractC2273MoA00 = null;
        if (jSONObject.has(A04(65, 12, 24))) {
            try {
                abstractC2273MoA00 = C3093hw.A01(jSONObject, c2820dL, true);
                abstractC2273MoA00.A1L(true);
                abstractC2273MoA00.A1I(A04(96, 12, 117));
            } catch (JSONException unused) {
            }
        }
        if (abstractC2273MoA00 == null) {
            abstractC2273MoA00 = AnonymousClass77.A00(jSONObject, c2820dL);
        }
        abstractC2273MoA00.A1H(str);
        TF tfA01 = nu.A01();
        if (tfA01 != null) {
            abstractC2273MoA00.A1D(tfA01.A06());
        }
        return abstractC2273MoA00;
    }

    private SF A03(C2820dL c2820dL) {
        return this.A00 != null ? this.A00 : new SF(c2820dL);
    }

    /* JADX WARN: Failed to check method usage
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.MethodNode.getTopParentClass()" because "m" is null
    	at jadx.core.codegen.ClassGen.lambda$skipMethod$0(ClassGen.java:366)
    	at java.base/java.util.stream.ReferencePipeline$2$1.accept(Unknown Source)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
    	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
    	at java.base/java.util.stream.ReferencePipeline.collect(Unknown Source)
    	at jadx.core.codegen.ClassGen.skipMethod(ClassGen.java:367)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:329)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
    	at jadx.core.ProcessClass.process(ProcessClass.java:88)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
     */
    public static /* synthetic */ ArrayList A05(NH nh2) {
        return nh2.A02;
    }

    private void A08(C2820dL c2820dL, AnonymousClass77 anonymousClass77) {
        NB playableData = anonymousClass77.A20().A0H().A07();
        A0B(playableData != null ? playableData.A0B() : EnumC2609Zt.A05);
        C3077hb c3077hb = new C3077hb(this);
        SF sf2 = new SF(c2820dL);
        boolean z10 = U7.A2A(c2820dL) && C2392Rf.A0A(anonymousClass77.A1C());
        if (z10) {
            C2392Rf unifiedAssetsLoader = new C2392Rf(sf2, anonymousClass77.A1C(), anonymousClass77.A0v(), anonymousClass77.A17(), z10, new C3076ha(this));
            sf2.A0e(new C2463Ua(anonymousClass77.A25(), c2820dL.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        NR.A02(c2820dL, anonymousClass77, true, c3077hb);
    }

    private void A09(C2820dL c2820dL, EnumSet<CacheFlag> enumSet, AbstractC3095hy abstractC3095hy, int i10, NG ng2) {
        boolean zA1Y = abstractC3095hy.A1Y();
        SF sfA03 = A03(c2820dL);
        sfA03.A0e(new C2463Ua(abstractC3095hy.A25(), c2820dL.A0A()));
        boolean z10 = U7.A2A(c2820dL) && C2392Rf.A0A(abstractC3095hy.A1C());
        if (z10) {
            new C2392Rf(sfA03, abstractC3095hy.A1C(), abstractC3095hy.A0v(), abstractC3095hy.A17(), z10, new C3082hi(this, c2820dL, zA1Y, abstractC3095hy, ng2)).A0B();
            return;
        }
        String strA04 = A04(96, 12, 117);
        if (zA1Y) {
            SB sb2 = new SB(abstractC3095hy.A0s(), abstractC3095hy.A17(), strA04);
            sb2.A04 = true;
            sb2.A03 = A04(0, 5, 78);
            sfA03.A0Y(sb2);
        }
        sfA03.A0d(new SD(abstractC3095hy.A23().A01(), C2786cm.A04, C2786cm.A04, abstractC3095hy.A17(), A04(96, 12, 117)));
        boolean zContains = enumSet.contains(CacheFlag.VIDEO);
        int i11 = 0;
        boolean zA2s = U7.A2s(c2820dL, C2875eF.A03());
        for (C2274Mp adInfo : abstractC3095hy.A27()) {
            SD sd2 = new SD(adInfo.A0H().A08(), NN.A00(adInfo.A0H()), NN.A01(adInfo.A0H()), abstractC3095hy.A17(), A04(96, 12, 117));
            if (i11 == 0) {
                sfA03.A0c(sd2);
            } else {
                sfA03.A0d(sd2);
            }
            Iterator<String> it = adInfo.A0K().A02().iterator();
            while (it.hasNext()) {
                sfA03.A0d(new SD(it.next(), -1, -1, abstractC3095hy.A17(), A04(96, 12, 117)));
            }
            if (zContains && !TextUtils.isEmpty(adInfo.A0H().A09())) {
                SB sb3 = new SB(adInfo.A0H().A09(), abstractC3095hy.A17(), A04(96, 12, 117), adInfo.A0H().A06());
                sb3.A04 = false;
                if (i11 == 0) {
                    if (zA1Y && !zA2s) {
                        sfA03.A0Y(sb3);
                    } else {
                        sfA03.A0b(sb3);
                    }
                } else if (zA1Y && !zA2s) {
                    sfA03.A0Z(sb3);
                } else {
                    sfA03.A0a(sb3);
                }
            }
            i11++;
        }
        sfA03.A0X(new C3080hg(this, c2820dL, zA1Y, abstractC3095hy, ng2), new S8(abstractC3095hy.A17(), strA04, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C2820dL c2820dL, EnumSet<CacheFlag> enumSet, C3093hw c3093hw, AbstractC3095hy abstractC3095hy, int i10, NG ng2) {
        A09(c2820dL, enumSet, abstractC3095hy, i10, new C3084hk(this, c2820dL, abstractC3095hy, c3093hw, i10, ng2, enumSet));
    }

    private void A0B(EnumC2609Zt enumC2609Zt) {
        this.A01 = enumC2609Zt;
    }

    private boolean A0C(C2820dL c2820dL, AbstractC3095hy abstractC3095hy) {
        AdError adErrorA00 = A00(c2820dL, abstractC3095hy);
        if (adErrorA00 != null) {
            this.A04.ACF(adErrorA00);
            return true;
        }
        return false;
    }

    public final AbstractC2273Mo A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        return com.facebook.ads.redexgen.core.EnumC2490Vb.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        return com.facebook.ads.redexgen.core.EnumC2490Vb.A0B;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.core.EnumC2490Vb A0E() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.Mo r0 = r5.A03
            boolean r0 = r0.A1T()
            if (r0 == 0) goto Lb
            com.facebook.ads.redexgen.X.Vb r0 = com.facebook.ads.redexgen.core.EnumC2490Vb.A04
            return r0
        Lb:
            com.facebook.ads.redexgen.X.Mo r4 = r5.A03
            com.facebook.ads.redexgen.X.hy r4 = (com.facebook.ads.redexgen.core.AbstractC3095hy) r4
            boolean r0 = r4.A1Y()
            if (r0 == 0) goto L18
            com.facebook.ads.redexgen.X.Vb r0 = com.facebook.ads.redexgen.core.EnumC2490Vb.A06
            return r0
        L18:
            java.util.List r0 = r4.A27()
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L26
            com.facebook.ads.redexgen.X.Vb r0 = com.facebook.ads.redexgen.core.EnumC2490Vb.A0A
            return r0
        L26:
            com.facebook.ads.redexgen.X.Mp r0 = r4.A20()
            com.facebook.ads.redexgen.X.Ms r0 = r0.A0H()
            com.facebook.ads.redexgen.X.NB r3 = r0.A07()
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.NH.A06
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 14
            if (r1 == r0) goto L77
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.NH.A06
            java.lang.String r1 = "HO5lN2vl3hawZ3xdOTbB4PXxItmZOFKM"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "QabHGQsenJFHZf5mHftqzVXi6FXcwsQx"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L50
            com.facebook.ads.redexgen.X.Vb r0 = com.facebook.ads.redexgen.core.EnumC2490Vb.A0C
            return r0
        L50:
            boolean r3 = r5.A0L(r4)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.NH.A06
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L71
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.NH.A06
            java.lang.String r1 = "iV2CDA2M2IfUZLXvhnmiNr1pV0Sur2CQ"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "GDT4frbvCKvkZrCQcOaJTMqN9T6RIdn0"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L74
        L6e:
            com.facebook.ads.redexgen.X.Vb r0 = com.facebook.ads.redexgen.core.EnumC2490Vb.A0D
            return r0
        L71:
            if (r3 == 0) goto L74
            goto L6e
        L74:
            com.facebook.ads.redexgen.X.Vb r0 = com.facebook.ads.redexgen.core.EnumC2490Vb.A0B
            return r0
        L77:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.NH.A0E():com.facebook.ads.redexgen.X.Vb");
    }

    public final EnumC2609Zt A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A1T()) {
            return ((C3093hw) this.A03).A20();
        }
        return ((AbstractC3095hy) this.A03).A25();
    }

    public final void A0H() {
        this.A04.AJm();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        this.A03.A1F(rewardData);
        this.A03.A1J(str);
        if (A0D().A1T()) {
            intent.putExtra(A04(77, 19, 78), this.A03);
        }
        intent.putExtra(A04(48, 14, 83), this.A03);
    }

    public final void A0J(C2820dL c2820dL, EnumSet<CacheFlag> enumSet) {
        if (A0E() == EnumC2490Vb.A04) {
            C3093hw c3093hw = (C3093hw) this.A03;
            AbstractC3095hy abstractC3095hyA1w = c3093hw.A1w();
            if (A0C(c2820dL, abstractC3095hyA1w) || abstractC3095hyA1w == null) {
                return;
            }
            this.A04.AGo();
            A0A(c2820dL, enumSet, c3093hw, abstractC3095hyA1w, 0, this.A04);
            return;
        }
        AbstractC3095hy abstractC3095hy = (AbstractC3095hy) this.A03;
        if (A06[5].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "h3j4XQE4N9RDZ4AU6tvjsFYKX3e30HKG";
        strArr[3] = "lDhcJ7lgFtqhZjTb781X3zaoWDc2BWUc";
        if (A0C(c2820dL, abstractC3095hy)) {
            return;
        }
        this.A04.AGo();
        if (A0E() == EnumC2490Vb.A0C) {
            AnonymousClass77 anonymousClass77 = (AnonymousClass77) this.A03;
            String[] strArr2 = A06;
            if (strArr2[2].length() != strArr2[6].length()) {
                A06[7] = "0uVLF1bkkTEn2WeYm46QMmOd1A6";
                A08(c2820dL, anonymousClass77);
                return;
            } else {
                A08(c2820dL, anonymousClass77);
                return;
            }
        }
        A09(c2820dL, enumSet, (AnonymousClass77) this.A03, -1, this.A04);
    }

    public final boolean A0K() {
        return this.A03.A1P();
    }

    public final boolean A0L(AbstractC3095hy abstractC3095hy) {
        return !TextUtils.isEmpty(abstractC3095hy.A20().A0H().A09());
    }
}
