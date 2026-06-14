package com.appsflyer.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AFi1hSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    public static final Map AFLogger;
    private static long afDebugLog;
    private static int afErrorLog;
    private static byte afErrorLogForExcManagerOnly;
    private static long afInfoLog;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f15606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Object f15607e;
    private static int force;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Object f15608i;
    private static byte[] unregisterClient;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static long f15609v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static byte[] f15610w;

    private static String $$c(short s10, byte b10, short s11) {
        int i10;
        int i11;
        int i12;
        byte[] bArr;
        byte[] bArr2;
        int i13;
        int i14 = $13 + 123;
        $12 = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 83 >>> b10;
            i10 = s10 + 38;
            i12 = 1355 % s11;
            bArr = $$a;
            bArr2 = new byte[i15];
            i11 = i15 + 19;
            if (bArr == null) {
                byte[] bArr3 = bArr2;
                int i16 = i12;
                i12++;
                i10 = (i16 + i10) - 3;
                $12 = ($13 + 15) % 128;
                bArr2 = bArr3;
                i13 = 0;
            } else {
                i13 = 0;
            }
        } else {
            i10 = s10 + 33;
            int i17 = 1152 - s11;
            byte[] bArr4 = $$a;
            byte[] bArr5 = new byte[49 - b10];
            i11 = 48 - b10;
            if (bArr4 == null) {
                i12 = i17;
                bArr = bArr4;
                bArr2 = bArr5;
                byte[] bArr32 = bArr2;
                int i162 = i12;
                i12++;
                i10 = (i162 + i10) - 3;
                $12 = ($13 + 15) % 128;
                bArr2 = bArr32;
                i13 = 0;
            } else {
                i12 = i17;
                bArr = bArr4;
                bArr2 = bArr5;
                i13 = 0;
            }
        }
        while (true) {
            bArr2[i13] = (byte) i10;
            if (i13 == i11) {
                return new String(bArr2, 0);
            }
            int i18 = i13 + 1;
            byte b11 = bArr[i12];
            byte[] bArr6 = bArr2;
            i12++;
            i10 = (i10 + b11) - 3;
            $12 = ($13 + 15) % 128;
            bArr2 = bArr6;
            i13 = i18;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:579:0x1b73, code lost:
    
        r15 = r61 == true ? 1 : 0;
        r5 = r65;
        r25 = 4;
        r0 = r64.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r0.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x1b8e, code lost:
    
        if (r40 != false) goto L582;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x1b90, code lost:
    
        com.appsflyer.internal.AFi1hSDK.$10 = (com.appsflyer.internal.AFi1hSDK.$11 + 87) % 128;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x1b9b, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x1b9d, code lost:
    
        com.appsflyer.internal.AFi1hSDK.f15608i = r0.newInstance(r1, java.lang.Boolean.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x1bb0, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x1bb3, code lost:
    
        r14 = 1;
        r15 = r15;
        r41 = r41;
        r57 = r57;
        r58 = r58;
        r59 = r59;
        r63 = r63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:235:0x09ec A[Catch: all -> 0x0939, TryCatch #9 {all -> 0x0939, blocks: (B:157:0x077c, B:196:0x0932, B:198:0x0938, B:203:0x094e, B:209:0x0958, B:214:0x09b6, B:216:0x09bc, B:217:0x09bd, B:205:0x0950, B:207:0x0956, B:208:0x0957, B:219:0x09bf, B:221:0x09c5, B:222:0x09c6, B:233:0x09e6, B:235:0x09ec, B:236:0x09ed, B:192:0x08fe, B:211:0x0989, B:212:0x09b4, B:188:0x0879), top: B:811:0x077c, inners: #4, #61, #65, #108 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x09ed A[Catch: all -> 0x0939, TRY_LEAVE, TryCatch #9 {all -> 0x0939, blocks: (B:157:0x077c, B:196:0x0932, B:198:0x0938, B:203:0x094e, B:209:0x0958, B:214:0x09b6, B:216:0x09bc, B:217:0x09bd, B:205:0x0950, B:207:0x0956, B:208:0x0957, B:219:0x09bf, B:221:0x09c5, B:222:0x09c6, B:233:0x09e6, B:235:0x09ec, B:236:0x09ed, B:192:0x08fe, B:211:0x0989, B:212:0x09b4, B:188:0x0879), top: B:811:0x077c, inners: #4, #61, #65, #108 }] */
    /* JADX WARN: Removed duplicated region for block: B:646:0x1cd7 A[Catch: all -> 0x1b31, TryCatch #3 {all -> 0x1b31, blocks: (B:547:0x1b1e, B:551:0x1b36, B:553:0x1b3c, B:554:0x1b3d, B:559:0x1b43, B:561:0x1b49, B:562:0x1b4a, B:564:0x1b4c, B:566:0x1b54, B:567:0x1b55, B:569:0x1b57, B:571:0x1b5f, B:572:0x1b60, B:579:0x1b73, B:583:0x1b9d, B:594:0x1bd7, B:596:0x1bdd, B:599:0x1be0, B:600:0x1be1, B:605:0x1c44, B:607:0x1c4a, B:608:0x1c4b, B:612:0x1c52, B:614:0x1c60, B:615:0x1c61, B:623:0x1c73, B:625:0x1c82, B:626:0x1c83, B:628:0x1c85, B:630:0x1c94, B:631:0x1c95, B:644:0x1cd1, B:646:0x1cd7, B:647:0x1cd8, B:657:0x1cf6, B:659:0x1d06, B:660:0x1d07, B:662:0x1d09, B:664:0x1d19, B:665:0x1d1a, B:671:0x1d2d, B:673:0x1d33, B:674:0x1d34, B:679:0x1d47, B:681:0x1d4d, B:682:0x1d4e, B:684:0x1d50, B:686:0x1d64, B:687:0x1d65, B:546:0x1afd, B:602:0x1c17, B:603:0x1c42, B:542:0x1aa1, B:250:0x0abe, B:488:0x16aa, B:541:0x1a72, B:454:0x14bf, B:452:0x148c, B:272:0x0c64, B:257:0x0b52), top: B:802:0x1b73, inners: #6, #14, #16, #18, #20, #22, #43, #47, #102, #109 }] */
    /* JADX WARN: Removed duplicated region for block: B:647:0x1cd8 A[Catch: all -> 0x1b31, TryCatch #3 {all -> 0x1b31, blocks: (B:547:0x1b1e, B:551:0x1b36, B:553:0x1b3c, B:554:0x1b3d, B:559:0x1b43, B:561:0x1b49, B:562:0x1b4a, B:564:0x1b4c, B:566:0x1b54, B:567:0x1b55, B:569:0x1b57, B:571:0x1b5f, B:572:0x1b60, B:579:0x1b73, B:583:0x1b9d, B:594:0x1bd7, B:596:0x1bdd, B:599:0x1be0, B:600:0x1be1, B:605:0x1c44, B:607:0x1c4a, B:608:0x1c4b, B:612:0x1c52, B:614:0x1c60, B:615:0x1c61, B:623:0x1c73, B:625:0x1c82, B:626:0x1c83, B:628:0x1c85, B:630:0x1c94, B:631:0x1c95, B:644:0x1cd1, B:646:0x1cd7, B:647:0x1cd8, B:657:0x1cf6, B:659:0x1d06, B:660:0x1d07, B:662:0x1d09, B:664:0x1d19, B:665:0x1d1a, B:671:0x1d2d, B:673:0x1d33, B:674:0x1d34, B:679:0x1d47, B:681:0x1d4d, B:682:0x1d4e, B:684:0x1d50, B:686:0x1d64, B:687:0x1d65, B:546:0x1afd, B:602:0x1c17, B:603:0x1c42, B:542:0x1aa1, B:250:0x0abe, B:488:0x16aa, B:541:0x1a72, B:454:0x14bf, B:452:0x148c, B:272:0x0c64, B:257:0x0b52), top: B:802:0x1b73, inners: #6, #14, #16, #18, #20, #22, #43, #47, #102, #109 }] */
    /* JADX WARN: Removed duplicated region for block: B:726:0x1e2a A[Catch: all -> 0x1bbe, TryCatch #64 {all -> 0x1bbe, blocks: (B:694:0x1d76, B:693:0x1d73, B:584:0x1bb0, B:702:0x1d9a, B:704:0x1da0, B:705:0x1da1, B:707:0x1da3, B:709:0x1db8, B:710:0x1db9, B:729:0x1e33, B:734:0x1e87, B:736:0x1e8d, B:737:0x1e8e, B:724:0x1e24, B:726:0x1e2a, B:727:0x1e2b, B:690:0x1d6e, B:731:0x1e64, B:732:0x1e85, B:242:0x0a1a), top: B:917:0x1bb0, inners: #44, #49, #54 }] */
    /* JADX WARN: Removed duplicated region for block: B:727:0x1e2b A[Catch: all -> 0x1bbe, TryCatch #64 {all -> 0x1bbe, blocks: (B:694:0x1d76, B:693:0x1d73, B:584:0x1bb0, B:702:0x1d9a, B:704:0x1da0, B:705:0x1da1, B:707:0x1da3, B:709:0x1db8, B:710:0x1db9, B:729:0x1e33, B:734:0x1e87, B:736:0x1e8d, B:737:0x1e8e, B:724:0x1e24, B:726:0x1e2a, B:727:0x1e2b, B:690:0x1d6e, B:731:0x1e64, B:732:0x1e85, B:242:0x0a1a), top: B:917:0x1bb0, inners: #44, #49, #54 }] */
    /* JADX WARN: Removed duplicated region for block: B:742:0x1eb1 A[Catch: Exception -> 0x1f7d, TRY_ENTER, TryCatch #79 {Exception -> 0x1f7d, blocks: (B:8:0x0163, B:10:0x0173, B:54:0x03c5, B:64:0x047c, B:69:0x04c6, B:71:0x04cc, B:72:0x04cd, B:73:0x04ce, B:74:0x0516, B:86:0x055e, B:90:0x0568, B:95:0x057b, B:104:0x059e, B:742:0x1eb1, B:744:0x1eb5, B:758:0x1f3a, B:746:0x1ec2, B:747:0x1eca, B:752:0x1f15, B:754:0x1f1b, B:755:0x1f1c, B:759:0x1f56, B:761:0x1f5e, B:59:0x03ce, B:766:0x1f63, B:768:0x1f69, B:769:0x1f6a, B:771:0x1f6c, B:773:0x1f72, B:774:0x1f73, B:47:0x036b, B:776:0x1f75, B:778:0x1f7b, B:779:0x1f7c, B:61:0x0457, B:60:0x03e3, B:49:0x0394, B:66:0x0490, B:749:0x1ee5, B:750:0x1f13), top: B:945:0x0163, inners: #28, #38, #45, #69, #113 }] */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v191, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v258, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r10v117 */
    /* JADX WARN: Type inference failed for: r10v118 */
    /* JADX WARN: Type inference failed for: r10v119 */
    /* JADX WARN: Type inference failed for: r10v120 */
    /* JADX WARN: Type inference failed for: r10v121 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v42, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r10v99 */
    /* JADX WARN: Type inference failed for: r11v140, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r12v102 */
    /* JADX WARN: Type inference failed for: r12v147 */
    /* JADX WARN: Type inference failed for: r12v148 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v52, types: [short] */
    /* JADX WARN: Type inference failed for: r12v89 */
    /* JADX WARN: Type inference failed for: r13v131, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r13v163 */
    /* JADX WARN: Type inference failed for: r14v134 */
    /* JADX WARN: Type inference failed for: r14v135 */
    /* JADX WARN: Type inference failed for: r14v187 */
    /* JADX WARN: Type inference failed for: r14v188 */
    /* JADX WARN: Type inference failed for: r14v189 */
    /* JADX WARN: Type inference failed for: r14v190 */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r14v53 */
    /* JADX WARN: Type inference failed for: r14v54 */
    /* JADX WARN: Type inference failed for: r14v55 */
    /* JADX WARN: Type inference failed for: r14v86 */
    /* JADX WARN: Type inference failed for: r14v87 */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v101 */
    /* JADX WARN: Type inference failed for: r15v109 */
    /* JADX WARN: Type inference failed for: r15v110, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r15v123, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r15v133 */
    /* JADX WARN: Type inference failed for: r15v134 */
    /* JADX WARN: Type inference failed for: r15v135 */
    /* JADX WARN: Type inference failed for: r15v136 */
    /* JADX WARN: Type inference failed for: r15v137 */
    /* JADX WARN: Type inference failed for: r15v138 */
    /* JADX WARN: Type inference failed for: r15v152 */
    /* JADX WARN: Type inference failed for: r15v154 */
    /* JADX WARN: Type inference failed for: r15v155 */
    /* JADX WARN: Type inference failed for: r15v156 */
    /* JADX WARN: Type inference failed for: r15v157 */
    /* JADX WARN: Type inference failed for: r15v158 */
    /* JADX WARN: Type inference failed for: r15v159 */
    /* JADX WARN: Type inference failed for: r15v162 */
    /* JADX WARN: Type inference failed for: r15v163 */
    /* JADX WARN: Type inference failed for: r15v164 */
    /* JADX WARN: Type inference failed for: r15v166 */
    /* JADX WARN: Type inference failed for: r15v167 */
    /* JADX WARN: Type inference failed for: r15v168 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v55, types: [int] */
    /* JADX WARN: Type inference failed for: r15v58, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v73, types: [int] */
    /* JADX WARN: Type inference failed for: r15v75 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v84 */
    /* JADX WARN: Type inference failed for: r15v85 */
    /* JADX WARN: Type inference failed for: r15v86 */
    /* JADX WARN: Type inference failed for: r15v88 */
    /* JADX WARN: Type inference failed for: r15v89 */
    /* JADX WARN: Type inference failed for: r15v90 */
    /* JADX WARN: Type inference failed for: r15v91 */
    /* JADX WARN: Type inference failed for: r15v92 */
    /* JADX WARN: Type inference failed for: r15v93 */
    /* JADX WARN: Type inference failed for: r15v95 */
    /* JADX WARN: Type inference failed for: r15v97 */
    /* JADX WARN: Type inference failed for: r15v99, types: [short] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r1v157, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r1v215, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r1v238, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r3v108, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v124, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v142, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v146, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r41v0 */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v10 */
    /* JADX WARN: Type inference failed for: r41v11 */
    /* JADX WARN: Type inference failed for: r41v12 */
    /* JADX WARN: Type inference failed for: r41v13 */
    /* JADX WARN: Type inference failed for: r41v14 */
    /* JADX WARN: Type inference failed for: r41v17 */
    /* JADX WARN: Type inference failed for: r41v18 */
    /* JADX WARN: Type inference failed for: r41v19 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v20 */
    /* JADX WARN: Type inference failed for: r41v21 */
    /* JADX WARN: Type inference failed for: r41v22 */
    /* JADX WARN: Type inference failed for: r41v23 */
    /* JADX WARN: Type inference failed for: r41v24 */
    /* JADX WARN: Type inference failed for: r41v25 */
    /* JADX WARN: Type inference failed for: r41v26 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /* JADX WARN: Type inference failed for: r41v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r41v5 */
    /* JADX WARN: Type inference failed for: r41v6 */
    /* JADX WARN: Type inference failed for: r41v7 */
    /* JADX WARN: Type inference failed for: r41v8 */
    /* JADX WARN: Type inference failed for: r41v9 */
    /* JADX WARN: Type inference failed for: r4v128 */
    /* JADX WARN: Type inference failed for: r4v129 */
    /* JADX WARN: Type inference failed for: r4v130 */
    /* JADX WARN: Type inference failed for: r4v181, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r4v185 */
    /* JADX WARN: Type inference failed for: r4v311 */
    /* JADX WARN: Type inference failed for: r4v312 */
    /* JADX WARN: Type inference failed for: r4v313 */
    /* JADX WARN: Type inference failed for: r4v314 */
    /* JADX WARN: Type inference failed for: r4v315 */
    /* JADX WARN: Type inference failed for: r4v316 */
    /* JADX WARN: Type inference failed for: r4v317 */
    /* JADX WARN: Type inference failed for: r57v10 */
    /* JADX WARN: Type inference failed for: r57v13 */
    /* JADX WARN: Type inference failed for: r57v2 */
    /* JADX WARN: Type inference failed for: r57v22 */
    /* JADX WARN: Type inference failed for: r57v23 */
    /* JADX WARN: Type inference failed for: r57v26 */
    /* JADX WARN: Type inference failed for: r57v27 */
    /* JADX WARN: Type inference failed for: r57v28 */
    /* JADX WARN: Type inference failed for: r57v29 */
    /* JADX WARN: Type inference failed for: r57v30 */
    /* JADX WARN: Type inference failed for: r57v31 */
    /* JADX WARN: Type inference failed for: r57v35 */
    /* JADX WARN: Type inference failed for: r57v36 */
    /* JADX WARN: Type inference failed for: r57v4 */
    /* JADX WARN: Type inference failed for: r57v41 */
    /* JADX WARN: Type inference failed for: r57v42 */
    /* JADX WARN: Type inference failed for: r57v43 */
    /* JADX WARN: Type inference failed for: r57v44 */
    /* JADX WARN: Type inference failed for: r57v45 */
    /* JADX WARN: Type inference failed for: r57v46 */
    /* JADX WARN: Type inference failed for: r57v47 */
    /* JADX WARN: Type inference failed for: r57v48 */
    /* JADX WARN: Type inference failed for: r57v49 */
    /* JADX WARN: Type inference failed for: r57v5 */
    /* JADX WARN: Type inference failed for: r57v50 */
    /* JADX WARN: Type inference failed for: r57v51 */
    /* JADX WARN: Type inference failed for: r57v52 */
    /* JADX WARN: Type inference failed for: r57v53 */
    /* JADX WARN: Type inference failed for: r57v54 */
    /* JADX WARN: Type inference failed for: r57v56 */
    /* JADX WARN: Type inference failed for: r57v57 */
    /* JADX WARN: Type inference failed for: r57v9 */
    /* JADX WARN: Type inference failed for: r58v1 */
    /* JADX WARN: Type inference failed for: r58v12 */
    /* JADX WARN: Type inference failed for: r58v15 */
    /* JADX WARN: Type inference failed for: r58v16 */
    /* JADX WARN: Type inference failed for: r58v19 */
    /* JADX WARN: Type inference failed for: r58v2 */
    /* JADX WARN: Type inference failed for: r58v20 */
    /* JADX WARN: Type inference failed for: r58v21 */
    /* JADX WARN: Type inference failed for: r58v22 */
    /* JADX WARN: Type inference failed for: r58v23 */
    /* JADX WARN: Type inference failed for: r58v29, types: [long] */
    /* JADX WARN: Type inference failed for: r58v3 */
    /* JADX WARN: Type inference failed for: r58v34 */
    /* JADX WARN: Type inference failed for: r58v35 */
    /* JADX WARN: Type inference failed for: r58v36 */
    /* JADX WARN: Type inference failed for: r58v37 */
    /* JADX WARN: Type inference failed for: r58v38 */
    /* JADX WARN: Type inference failed for: r58v39 */
    /* JADX WARN: Type inference failed for: r58v4 */
    /* JADX WARN: Type inference failed for: r58v40 */
    /* JADX WARN: Type inference failed for: r58v46 */
    /* JADX WARN: Type inference failed for: r58v56 */
    /* JADX WARN: Type inference failed for: r58v57 */
    /* JADX WARN: Type inference failed for: r58v58 */
    /* JADX WARN: Type inference failed for: r58v61 */
    /* JADX WARN: Type inference failed for: r58v62 */
    /* JADX WARN: Type inference failed for: r58v63 */
    /* JADX WARN: Type inference failed for: r58v64 */
    /* JADX WARN: Type inference failed for: r58v65 */
    /* JADX WARN: Type inference failed for: r58v66 */
    /* JADX WARN: Type inference failed for: r58v67 */
    /* JADX WARN: Type inference failed for: r58v68 */
    /* JADX WARN: Type inference failed for: r58v69 */
    /* JADX WARN: Type inference failed for: r58v70 */
    /* JADX WARN: Type inference failed for: r58v71 */
    /* JADX WARN: Type inference failed for: r58v72 */
    /* JADX WARN: Type inference failed for: r58v73 */
    /* JADX WARN: Type inference failed for: r58v74 */
    /* JADX WARN: Type inference failed for: r58v75 */
    /* JADX WARN: Type inference failed for: r58v76 */
    /* JADX WARN: Type inference failed for: r58v77 */
    /* JADX WARN: Type inference failed for: r58v78 */
    /* JADX WARN: Type inference failed for: r58v8 */
    /* JADX WARN: Type inference failed for: r58v83 */
    /* JADX WARN: Type inference failed for: r58v84 */
    /* JADX WARN: Type inference failed for: r58v85 */
    /* JADX WARN: Type inference failed for: r58v86 */
    /* JADX WARN: Type inference failed for: r58v9 */
    /* JADX WARN: Type inference failed for: r59v1 */
    /* JADX WARN: Type inference failed for: r59v10 */
    /* JADX WARN: Type inference failed for: r59v11 */
    /* JADX WARN: Type inference failed for: r59v12 */
    /* JADX WARN: Type inference failed for: r59v13 */
    /* JADX WARN: Type inference failed for: r59v14 */
    /* JADX WARN: Type inference failed for: r59v15 */
    /* JADX WARN: Type inference failed for: r59v16 */
    /* JADX WARN: Type inference failed for: r59v17 */
    /* JADX WARN: Type inference failed for: r59v18 */
    /* JADX WARN: Type inference failed for: r59v19 */
    /* JADX WARN: Type inference failed for: r59v2 */
    /* JADX WARN: Type inference failed for: r59v20 */
    /* JADX WARN: Type inference failed for: r59v21 */
    /* JADX WARN: Type inference failed for: r59v22 */
    /* JADX WARN: Type inference failed for: r59v23 */
    /* JADX WARN: Type inference failed for: r59v24 */
    /* JADX WARN: Type inference failed for: r59v25 */
    /* JADX WARN: Type inference failed for: r59v26 */
    /* JADX WARN: Type inference failed for: r59v27 */
    /* JADX WARN: Type inference failed for: r59v28 */
    /* JADX WARN: Type inference failed for: r59v29 */
    /* JADX WARN: Type inference failed for: r59v3 */
    /* JADX WARN: Type inference failed for: r59v31 */
    /* JADX WARN: Type inference failed for: r59v32 */
    /* JADX WARN: Type inference failed for: r59v33 */
    /* JADX WARN: Type inference failed for: r59v34 */
    /* JADX WARN: Type inference failed for: r59v35 */
    /* JADX WARN: Type inference failed for: r59v36 */
    /* JADX WARN: Type inference failed for: r59v37 */
    /* JADX WARN: Type inference failed for: r59v38 */
    /* JADX WARN: Type inference failed for: r59v39 */
    /* JADX WARN: Type inference failed for: r59v4 */
    /* JADX WARN: Type inference failed for: r59v40 */
    /* JADX WARN: Type inference failed for: r59v41 */
    /* JADX WARN: Type inference failed for: r59v42 */
    /* JADX WARN: Type inference failed for: r59v43 */
    /* JADX WARN: Type inference failed for: r59v44 */
    /* JADX WARN: Type inference failed for: r59v46 */
    /* JADX WARN: Type inference failed for: r59v47 */
    /* JADX WARN: Type inference failed for: r59v5 */
    /* JADX WARN: Type inference failed for: r59v50, types: [int] */
    /* JADX WARN: Type inference failed for: r59v51 */
    /* JADX WARN: Type inference failed for: r59v52 */
    /* JADX WARN: Type inference failed for: r59v55 */
    /* JADX WARN: Type inference failed for: r59v56 */
    /* JADX WARN: Type inference failed for: r59v57 */
    /* JADX WARN: Type inference failed for: r59v58 */
    /* JADX WARN: Type inference failed for: r59v59 */
    /* JADX WARN: Type inference failed for: r59v6 */
    /* JADX WARN: Type inference failed for: r59v60 */
    /* JADX WARN: Type inference failed for: r59v61 */
    /* JADX WARN: Type inference failed for: r59v62 */
    /* JADX WARN: Type inference failed for: r59v63 */
    /* JADX WARN: Type inference failed for: r59v64 */
    /* JADX WARN: Type inference failed for: r59v65 */
    /* JADX WARN: Type inference failed for: r59v66 */
    /* JADX WARN: Type inference failed for: r59v67 */
    /* JADX WARN: Type inference failed for: r59v68 */
    /* JADX WARN: Type inference failed for: r59v69 */
    /* JADX WARN: Type inference failed for: r59v7 */
    /* JADX WARN: Type inference failed for: r59v70 */
    /* JADX WARN: Type inference failed for: r59v71 */
    /* JADX WARN: Type inference failed for: r59v72 */
    /* JADX WARN: Type inference failed for: r59v73 */
    /* JADX WARN: Type inference failed for: r59v74 */
    /* JADX WARN: Type inference failed for: r59v75 */
    /* JADX WARN: Type inference failed for: r59v76 */
    /* JADX WARN: Type inference failed for: r59v77 */
    /* JADX WARN: Type inference failed for: r59v78 */
    /* JADX WARN: Type inference failed for: r59v8 */
    /* JADX WARN: Type inference failed for: r59v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v100 */
    /* JADX WARN: Type inference failed for: r5v101 */
    /* JADX WARN: Type inference failed for: r5v102 */
    /* JADX WARN: Type inference failed for: r5v103 */
    /* JADX WARN: Type inference failed for: r5v104 */
    /* JADX WARN: Type inference failed for: r5v105 */
    /* JADX WARN: Type inference failed for: r5v106 */
    /* JADX WARN: Type inference failed for: r5v107 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v18, types: [short] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v4, types: [short] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v75, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r5v76 */
    /* JADX WARN: Type inference failed for: r5v77, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r5v93 */
    /* JADX WARN: Type inference failed for: r5v94 */
    /* JADX WARN: Type inference failed for: r5v95 */
    /* JADX WARN: Type inference failed for: r5v96 */
    /* JADX WARN: Type inference failed for: r5v97 */
    /* JADX WARN: Type inference failed for: r5v98 */
    /* JADX WARN: Type inference failed for: r5v99 */
    /* JADX WARN: Type inference failed for: r61v24 */
    /* JADX WARN: Type inference failed for: r61v6 */
    /* JADX WARN: Type inference failed for: r61v7 */
    /* JADX WARN: Type inference failed for: r61v8 */
    /* JADX WARN: Type inference failed for: r61v9 */
    /* JADX WARN: Type inference failed for: r63v1 */
    /* JADX WARN: Type inference failed for: r63v13 */
    /* JADX WARN: Type inference failed for: r63v16 */
    /* JADX WARN: Type inference failed for: r63v17 */
    /* JADX WARN: Type inference failed for: r63v18 */
    /* JADX WARN: Type inference failed for: r63v19 */
    /* JADX WARN: Type inference failed for: r63v2 */
    /* JADX WARN: Type inference failed for: r63v20 */
    /* JADX WARN: Type inference failed for: r63v21 */
    /* JADX WARN: Type inference failed for: r63v27 */
    /* JADX WARN: Type inference failed for: r63v28 */
    /* JADX WARN: Type inference failed for: r63v29 */
    /* JADX WARN: Type inference failed for: r63v3 */
    /* JADX WARN: Type inference failed for: r63v30 */
    /* JADX WARN: Type inference failed for: r63v36 */
    /* JADX WARN: Type inference failed for: r63v37 */
    /* JADX WARN: Type inference failed for: r63v38 */
    /* JADX WARN: Type inference failed for: r63v39 */
    /* JADX WARN: Type inference failed for: r63v4 */
    /* JADX WARN: Type inference failed for: r63v40 */
    /* JADX WARN: Type inference failed for: r63v41 */
    /* JADX WARN: Type inference failed for: r63v42 */
    /* JADX WARN: Type inference failed for: r63v43 */
    /* JADX WARN: Type inference failed for: r63v44 */
    /* JADX WARN: Type inference failed for: r63v45 */
    /* JADX WARN: Type inference failed for: r63v46 */
    /* JADX WARN: Type inference failed for: r63v47 */
    /* JADX WARN: Type inference failed for: r63v48 */
    /* JADX WARN: Type inference failed for: r63v49 */
    /* JADX WARN: Type inference failed for: r63v51 */
    /* JADX WARN: Type inference failed for: r63v52 */
    /* JADX WARN: Type inference failed for: r63v53 */
    /* JADX WARN: Type inference failed for: r63v54 */
    /* JADX WARN: Type inference failed for: r63v55 */
    /* JADX WARN: Type inference failed for: r63v56 */
    /* JADX WARN: Type inference failed for: r63v57 */
    /* JADX WARN: Type inference failed for: r63v58 */
    /* JADX WARN: Type inference failed for: r63v59 */
    /* JADX WARN: Type inference failed for: r63v60 */
    /* JADX WARN: Type inference failed for: r63v61 */
    /* JADX WARN: Type inference failed for: r63v62 */
    /* JADX WARN: Type inference failed for: r63v63 */
    /* JADX WARN: Type inference failed for: r63v64 */
    /* JADX WARN: Type inference failed for: r63v65 */
    /* JADX WARN: Type inference failed for: r63v66 */
    /* JADX WARN: Type inference failed for: r63v67 */
    /* JADX WARN: Type inference failed for: r63v68 */
    /* JADX WARN: Type inference failed for: r63v69 */
    /* JADX WARN: Type inference failed for: r63v70 */
    /* JADX WARN: Type inference failed for: r63v71 */
    /* JADX WARN: Type inference failed for: r63v72 */
    /* JADX WARN: Type inference failed for: r63v73 */
    /* JADX WARN: Type inference failed for: r63v74 */
    /* JADX WARN: Type inference failed for: r63v75 */
    /* JADX WARN: Type inference failed for: r63v76 */
    /* JADX WARN: Type inference failed for: r63v77 */
    /* JADX WARN: Type inference failed for: r63v8 */
    /* JADX WARN: Type inference failed for: r63v9 */
    /* JADX WARN: Type inference failed for: r65v1 */
    /* JADX WARN: Type inference failed for: r65v10 */
    /* JADX WARN: Type inference failed for: r65v11 */
    /* JADX WARN: Type inference failed for: r65v12 */
    /* JADX WARN: Type inference failed for: r65v13 */
    /* JADX WARN: Type inference failed for: r65v14 */
    /* JADX WARN: Type inference failed for: r65v15 */
    /* JADX WARN: Type inference failed for: r65v16 */
    /* JADX WARN: Type inference failed for: r65v17 */
    /* JADX WARN: Type inference failed for: r65v18 */
    /* JADX WARN: Type inference failed for: r65v19 */
    /* JADX WARN: Type inference failed for: r65v2 */
    /* JADX WARN: Type inference failed for: r65v20 */
    /* JADX WARN: Type inference failed for: r65v21 */
    /* JADX WARN: Type inference failed for: r65v23 */
    /* JADX WARN: Type inference failed for: r65v24 */
    /* JADX WARN: Type inference failed for: r65v25 */
    /* JADX WARN: Type inference failed for: r65v26 */
    /* JADX WARN: Type inference failed for: r65v27 */
    /* JADX WARN: Type inference failed for: r65v28 */
    /* JADX WARN: Type inference failed for: r65v29 */
    /* JADX WARN: Type inference failed for: r65v3 */
    /* JADX WARN: Type inference failed for: r65v30 */
    /* JADX WARN: Type inference failed for: r65v31 */
    /* JADX WARN: Type inference failed for: r65v32 */
    /* JADX WARN: Type inference failed for: r65v33 */
    /* JADX WARN: Type inference failed for: r65v34 */
    /* JADX WARN: Type inference failed for: r65v35 */
    /* JADX WARN: Type inference failed for: r65v36 */
    /* JADX WARN: Type inference failed for: r65v4 */
    /* JADX WARN: Type inference failed for: r65v5 */
    /* JADX WARN: Type inference failed for: r65v6 */
    /* JADX WARN: Type inference failed for: r65v7 */
    /* JADX WARN: Type inference failed for: r65v8 */
    /* JADX WARN: Type inference failed for: r65v9 */
    /* JADX WARN: Type inference failed for: r6v201, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v60, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v65, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r6v72, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v174, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v297 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r8v48, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r8v53, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r8v58, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r9v129, types: [java.lang.Class] */
    static {
        /*
            Method dump skipped, instruction units count: 8118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1hSDK.<clinit>():void");
    }

    private AFi1hSDK() {
    }

    public static int getCurrencyIso4217Code(int i10) throws Throwable {
        Object obj;
        int i11 = $11;
        int i12 = i11 + 73;
        $10 = i12 % 128;
        if (i12 % 2 != 0) {
            obj = f15608i;
            int i13 = 67 / 0;
        } else {
            obj = f15608i;
        }
        $10 = (i11 + 95) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i10)};
            int i14 = $$b;
            byte[] bArr = $$a;
            int iIntValue = ((Integer) Class.forName($$c((byte) i14, bArr[4], (short) (i14 | 512)), true, (ClassLoader) f15607e).getMethod($$c(bArr[487], bArr[637], bArr[7]), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i15 = $10 + 25;
            $11 = i15 % 128;
            if (i15 % 2 != 0) {
                return iIntValue;
            }
            throw null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    private static void getMediationNetwork(int i10, int i11) {
        $11 = ($10 + 121) % 128;
    }

    static void init$0() {
        int i10;
        int i11 = $11;
        int i12 = (i11 ^ 7) + ((i11 & 7) << 1);
        $10 = i12 % 128;
        if (i12 % 2 != 0) {
            byte[] bArr = new byte[1166];
            System.arraycopy("@ÛÛ¡\u0010ù\u0011\u0000ýþÍ<\u000eò\u0012û\u0004ý\u0013¾\u0018/\u0000\u0006\u0006øþ\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b&Ë6òô\n\u000b\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0001\u0012Õ&\u0006ü\u0011Ô(\f\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\u0001\u0012Ò!\u0005\b\u0000â(\f8\u0000\u0016ðÑ8\u0000\u0016ðÑú\u0018îÐ>\tÂ\u001b&\u0006üú\u0018îÐ>\tÂIü\u0006÷\b\fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ô\n\u0017í\b\t\u0001\u0010ì\u001eú\u000eôî\tí\u000bú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\f\u0006\u0007õî\u0006ð\u000b5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ5\u0004\u0004\u0003Ó\u00022\u0003Ö\u00070Ï\u000bý\b.Í\u0001\u0012á\u0016\u0011ÿ\t\u0000ô\u0005ú\u0018îÐCú\u0012½*\u0000ý\u0001\u0012ß\u0014\u0016÷ú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000föÿ\u0006å2ú\u0003\u0010ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u0014\u0003ò\u001bí\u000f\u0004\f\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b(ÉBæô\n\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b&Ë6òô\n\u000b\u0003\u0001\u0012Ü\u001b\u0002\bû\u0016ø\t\u0002ã\u001a\u0012\u0006û\u0006üû\u0001\nöÿ\u0006õ\u0012á\u0016ÿ\u0006î\"\u0001\u0010î\u0007ï\u000bþú\u000eô\u0001\u0012Õ\u0001ú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006\tøø\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u0006õ\u0006ã$\u0016\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0004\nü\u0012ô\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nÜ(\u0005\b\u0002â$\u0001öÿ\u000f\u0001\u0012Ý\u001a\u0016ÿÔ,\t\u0001\nú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nØ,\t\u0001\n\u0001\u0012â\u0019\u0014îú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000fþÖ:þôß4\u0003ò\u001bú\u0018îÐ>\tÂ\u0018,\u0006\u0007õÿ\u0004\rü\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010ú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010þò\u0012\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ô\u0016÷ç \r\u0004ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\u0001\u0012Ò/\u0001\u0006\u0002\u0002ú\f\tã(úøî\u000bë\u000b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b&Ë:îô\nÜH5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\b2Ó\u0003\u00072þ\u0004Ô\u0004\b\u0001\u00031Ñ\u00070Ìî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸\u0001\u0012á\u0016\u0014ò\f\nó\bþ&ñ\u0016\u0014ò\f\nóâ \u0016ð".getBytes("ISO-8859-1"), 0, bArr, 0, 1166);
            $$a = bArr;
            i10 = 72;
        } else {
            byte[] bArr2 = new byte[1166];
            System.arraycopy("@ÛÛ¡\u0010ù\u0011\u0000ýþÍ<\u000eò\u0012û\u0004ý\u0013¾\u0018/\u0000\u0006\u0006øþ\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b&Ë6òô\n\u000b\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0001\u0012Õ&\u0006ü\u0011Ô(\f\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\u0001\u0012Ò!\u0005\b\u0000â(\f8\u0000\u0016ðÑ8\u0000\u0016ðÑú\u0018îÐ>\tÂ\u001b&\u0006üú\u0018îÐ>\tÂIü\u0006÷\b\fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ô\n\u0017í\b\t\u0001\u0010ì\u001eú\u000eôî\tí\u000bú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\f\u0006\u0007õî\u0006ð\u000b5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ5\u0004\u0004\u0003Ó\u00022\u0003Ö\u00070Ï\u000bý\b.Í\u0001\u0012á\u0016\u0011ÿ\t\u0000ô\u0005ú\u0018îÐCú\u0012½*\u0000ý\u0001\u0012ß\u0014\u0016÷ú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000föÿ\u0006å2ú\u0003\u0010ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u0014\u0003ò\u001bí\u000f\u0004\f\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b(ÉBæô\n\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b&Ë6òô\n\u000b\u0003\u0001\u0012Ü\u001b\u0002\bû\u0016ø\t\u0002ã\u001a\u0012\u0006û\u0006üû\u0001\nöÿ\u0006õ\u0012á\u0016ÿ\u0006î\"\u0001\u0010î\u0007ï\u000bþú\u000eô\u0001\u0012Õ\u0001ú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006\tøø\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u0006õ\u0006ã$\u0016\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0004\nü\u0012ô\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nÜ(\u0005\b\u0002â$\u0001öÿ\u000f\u0001\u0012Ý\u001a\u0016ÿÔ,\t\u0001\nú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nØ,\t\u0001\n\u0001\u0012â\u0019\u0014îú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000fþÖ:þôß4\u0003ò\u001bú\u0018îÐ>\tÂ\u0018,\u0006\u0007õÿ\u0004\rü\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010ú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010þò\u0012\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ô\u0016÷ç \r\u0004ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\u0001\u0012Ò/\u0001\u0006\u0002\u0002ú\f\tã(úøî\u000bë\u000b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b&Ë:îô\nÜH5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\b2Ó\u0003\u00072þ\u0004Ô\u0004\b\u0001\u00031Ñ\u00070Ìî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸\u0001\u0012á\u0016\u0014ò\f\nó\bþ&ñ\u0016\u0014ò\f\nóâ \u0016ð".getBytes("ISO-8859-1"), 0, bArr2, 0, 1166);
            $$a = bArr2;
            i10 = 66;
        }
        $$b = i10;
        $11 = ($10 + 37) % 128;
    }

    public static int getCurrencyIso4217Code(Object obj) throws Throwable {
        System.currentTimeMillis();
        System.currentTimeMillis();
        Object obj2 = f15608i;
        $11 = ($10 + 65) % 128;
        try {
            Object[] objArr = {obj};
            int i10 = $$b;
            byte[] bArr = $$a;
            int iIntValue = ((Integer) Class.forName($$c((byte) i10, bArr[4], (short) (i10 | 512)), true, (ClassLoader) f15607e).getMethod($$c(bArr[487], bArr[637], bArr[7]), Object.class).invoke(obj2, objArr)).intValue();
            int i11 = $10 + 55;
            $11 = i11 % 128;
            if (i11 % 2 != 0) {
                return iIntValue;
            }
            throw null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static Object getCurrencyIso4217Code(char c10, int i10, int i11) throws Throwable {
        int i12 = ($10 + 107) % 128;
        Object obj = f15608i;
        int i13 = ((i12 & 71) + (i12 | 71)) % 128;
        $10 = i13;
        $11 = (i13 + 71) % 128;
        try {
            Object[] objArr = {Character.valueOf(c10), Integer.valueOf(i10), Integer.valueOf(i11)};
            int i14 = $$b;
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c((byte) i14, bArr[4], (short) (i14 | 512)), true, (ClassLoader) f15607e);
            String str$$c = $$c((byte) (i14 + 4), (byte) (-bArr[815]), bArr[35]);
            Class<?> cls2 = Integer.TYPE;
            Object objInvoke = cls.getMethod(str$$c, Character.TYPE, cls2, cls2).invoke(obj, objArr);
            int i15 = $11 + 119;
            $10 = i15 % 128;
            if (i15 % 2 == 0) {
                return objInvoke;
            }
            throw null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }
}
