package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
public abstract class AbstractC2110Gf {
    public static byte[] A00;
    public static String[] A01 = {"jaTfwC0cI533jMSLFdbnMioREeamNCq8", "oxYS1uYBjADPdRUL4vsR12VppXrr4BxP", "o9bG5hJtiKIeIPN2CaXw8mH6vllsT8Pg", "8s8MZLb5TSIkvuwEDH", "W6kvFYauQlSyWCDb8CQhWvVbWb1Alqwq", "aw37R0CiGakhFrBRrvipxmkRXRxeCTzI", "Y2zfIeYjiYIsjSkQMxD0jwTDeetOAull", "DaiobFePrAznnRWN86LDTmrCW9O2HPvR"};

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 112);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{5, 34, 42, 47, 38, 39, 99, 55, 44, 99, 49, 38, 34, 39, 99, 5, Ascii.SI, 2, 0, 99, 48, 55, 49, 38, 34, 46, 99, 46, 34, 49, 40, 38, 49, 109, 125, 82, 73, 72, 79, Ascii.ESC, 93, 73, 90, 86, 94, Ascii.ESC, 95, 84, 94, 72, Ascii.ESC, 85, 84, 79, Ascii.ESC, 72, 79, 90, 73, 79, Ascii.ESC, 76, 82, 79, 83, Ascii.ESC, 72, 66, 85, 88, Ascii.ESC, 88, 84, 95, 94, Ascii.NAK};
    }

    static {
        A08();
    }

    public static int A00(InterfaceC3286lN interfaceC3286lN) throws IOException {
        interfaceC3286lN.AI1();
        C4J c4j = new C4J(2);
        interfaceC3286lN.AG9(c4j.A0l(), 0, 2);
        int syncCode = c4j.A0M();
        int frameStartMarker = syncCode >> 2;
        if (frameStartMarker == 16382) {
            interfaceC3286lN.AI1();
            return syncCode;
        }
        interfaceC3286lN.AI1();
        throw C17652i.A01(A06(34, 42, 75), null);
    }

    public static Metadata A01(InterfaceC3286lN interfaceC3286lN, boolean z10) throws IOException {
        InterfaceC2133Hc id3FramePredicate;
        if (z10) {
            id3FramePredicate = null;
        } else {
            id3FramePredicate = C19178i.A03;
        }
        Metadata metadataA00 = new C2115Gk().A00(interfaceC3286lN, id3FramePredicate);
        if (metadataA00 == null || metadataA00.A02() == 0) {
            return null;
        }
        return metadataA00;
    }

    public static Metadata A02(InterfaceC3286lN interfaceC3286lN, boolean z10) throws IOException {
        interfaceC3286lN.AI1();
        long jA8a = interfaceC3286lN.A8a();
        Metadata metadataA01 = A01(interfaceC3286lN, z10);
        interfaceC3286lN.AJJ((int) (interfaceC3286lN.A8a() - jA8a));
        return metadataA01;
    }

    public static C2111Gg A03(C4J c4j) {
        c4j.A0g(1);
        int iA0K = c4j.A0K();
        int length = c4j.A09();
        long j10 = ((long) length) + ((long) iA0K);
        int i10 = iA0K / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long jA0P = c4j.A0P();
            if (jA0P == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jA0P;
            jArrCopyOf2[i11] = c4j.A0P();
            c4j.A0g(2);
            i11++;
        }
        int length2 = c4j.A09();
        c4j.A0g((int) (j10 - ((long) length2)));
        return new C2111Gg(jArrCopyOf, jArrCopyOf2);
    }

    public static C2111Gg A04(InterfaceC3286lN interfaceC3286lN, int i10) throws IOException {
        C4J c4j = new C4J(i10);
        interfaceC3286lN.readFully(c4j.A0l(), 0, i10);
        return A03(c4j);
    }

    public static C2112Gh A05(InterfaceC3286lN interfaceC3286lN) throws IOException {
        byte[] bArr = new byte[38];
        interfaceC3286lN.readFully(bArr, 0, 38);
        return new C2112Gh(bArr, 4);
    }

    public static List<String> A07(InterfaceC3286lN interfaceC3286lN, int i10) throws IOException {
        C4J c4j = new C4J(i10);
        interfaceC3286lN.readFully(c4j.A0l(), 0, i10);
        c4j.A0g(4);
        return Arrays.asList(H8.A05(c4j, false, false).A02);
    }

    public static void A09(InterfaceC3286lN interfaceC3286lN) throws IOException {
        C4J c4j = new C4J(4);
        interfaceC3286lN.readFully(c4j.A0l(), 0, 4);
        if (c4j.A0Q() == 1716281667) {
        } else {
            throw C17652i.A01(A06(0, 34, 51), null);
        }
    }

    public static boolean A0A(InterfaceC3286lN interfaceC3286lN) throws IOException {
        C4J c4j = new C4J(4);
        interfaceC3286lN.AG9(c4j.A0l(), 0, 4);
        return c4j.A0Q() == 1716281667;
    }

    public static boolean A0B(InterfaceC3286lN interfaceC3286lN, C2109Ge c2109Ge) throws IOException {
        interfaceC3286lN.AI1();
        C4I c4i = new C4I(new byte[4]);
        interfaceC3286lN.AG9(c4i.A00, 0, 4);
        boolean zA0H = c4i.A0H();
        int iA04 = c4i.A04(7);
        int iA042 = c4i.A04(24) + 4;
        if (iA04 == 0) {
            C2112Gh c2112GhA05 = A05(interfaceC3286lN);
            String[] strArr = A01;
            if (strArr[1].charAt(0) != strArr[2].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "oF2KQg39ZEK5V6OHUZM6u4PkuH0D3J87";
            strArr2[2] = "opWNo3Pnwj2PHBTvqD8r5OWylRW508kK";
            c2109Ge.A00 = c2112GhA05;
        } else {
            C2112Gh c2112Gh = c2109Ge.A00;
            if (c2112Gh != null) {
                if (iA04 != 3) {
                    if (iA04 == 4) {
                        c2109Ge.A00 = c2112Gh.A0B(A07(interfaceC3286lN, iA042));
                    } else if (iA04 == 6) {
                        C4J c4j = new C4J(iA042);
                        interfaceC3286lN.readFully(c4j.A0l(), 0, iA042);
                        c4j.A0g(4);
                        PictureFrame pictureFrame = PictureFrame.A00(c4j);
                        c2109Ge.A00 = c2112Gh.A0A(MetaExoPlayerCustomizedCollections.A03(pictureFrame));
                    } else {
                        interfaceC3286lN.AJJ(iA042);
                    }
                } else {
                    c2109Ge.A00 = c2112Gh.A09(A04(interfaceC3286lN, iA042));
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
        return zA0H;
    }
}
