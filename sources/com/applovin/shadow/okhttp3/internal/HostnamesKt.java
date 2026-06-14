package com.applovin.shadow.okhttp3.internal;

import com.applovin.shadow.okio.Buffer;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002\u001a\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u00020\u0003¨\u0006\u000f"}, d2 = {"decodeIpv4Suffix", "", "input", "", POBCTAOverlayData.KEY_CTA_POS, "", "limit", "address", "", "addressOffset", "decodeIpv6", "Ljava/net/InetAddress;", "inet6AddressToAscii", "containsInvalidHostnameAsciiCodes", "toCanonicalHost", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, 127) >= 0 || StringsKt.u0(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String str, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == bArr.length) {
                return false;
            }
            if (i13 != i12) {
                if (str.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char cCharAt = str.charAt(i14);
                if (Intrinsics.compare((int) cCharAt, 48) < 0 || Intrinsics.compare((int) cCharAt, 57) > 0) {
                    break;
                }
                if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i14++;
            }
            if (i14 - i10 == 0) {
                return false;
            }
            bArr[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
    
        if (r11 == 16) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        if (r12 != (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0096, code lost:
    
        r0 = r11 - r12;
        java.lang.System.arraycopy(r8, r12, r8, 16 - r0, r0);
        java.util.Arrays.fill(r8, r12, (16 - r11) + r12, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a6, code lost:
    
        return java.net.InetAddress.getByAddress(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.net.InetAddress decodeIpv6(java.lang.String r16, int r17, int r18) {
        /*
            r6 = r18
            r7 = 16
            byte[] r8 = new byte[r7]
            r9 = 0
            r10 = -1
            r2 = r17
            r11 = r9
            r12 = r10
            r13 = r12
        Ld:
            r14 = 0
            if (r2 >= r6) goto L91
            if (r11 != r7) goto L13
            return r14
        L13:
            int r15 = r2 + 2
            if (r15 > r6) goto L33
            r4 = 4
            r5 = 0
            java.lang.String r1 = "::"
            r3 = 0
            r0 = r16
            boolean r1 = kotlin.text.StringsKt.Z(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L33
            if (r12 == r10) goto L27
            return r14
        L27:
            int r11 = r11 + 2
            if (r15 != r6) goto L2e
            r12 = r11
            goto L91
        L2e:
            r0 = r16
            r12 = r11
            r13 = r15
            goto L62
        L33:
            if (r11 == 0) goto L44
            r4 = 4
            r5 = 0
            java.lang.String r1 = ":"
            r3 = 0
            r0 = r16
            boolean r1 = kotlin.text.StringsKt.Z(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L48
            int r2 = r2 + 1
        L44:
            r0 = r16
            r13 = r2
            goto L62
        L48:
            r4 = 4
            r5 = 0
            java.lang.String r1 = "."
            r3 = 0
            r0 = r16
            boolean r1 = kotlin.text.StringsKt.Z(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L61
            int r1 = r11 + (-2)
            boolean r0 = decodeIpv4Suffix(r0, r13, r6, r8, r1)
            if (r0 != 0) goto L5e
            return r14
        L5e:
            int r11 = r11 + 2
            goto L91
        L61:
            return r14
        L62:
            r1 = r9
            r2 = r13
        L64:
            if (r2 >= r6) goto L76
            char r3 = r0.charAt(r2)
            int r3 = com.applovin.shadow.okhttp3.internal.Util.parseHexDigit(r3)
            if (r3 == r10) goto L76
            int r1 = r1 << 4
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L64
        L76:
            int r3 = r2 - r13
            if (r3 == 0) goto L90
            r4 = 4
            if (r3 <= r4) goto L7e
            goto L90
        L7e:
            int r3 = r11 + 1
            int r4 = r1 >>> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r8[r11] = r4
            int r11 = r11 + 2
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r8[r3] = r1
            goto Ld
        L90:
            return r14
        L91:
            if (r11 == r7) goto La2
            if (r12 != r10) goto L96
            return r14
        L96:
            int r0 = r11 - r12
            int r1 = 16 - r0
            java.lang.System.arraycopy(r8, r12, r8, r1, r0)
            int r7 = r7 - r11
            int r7 = r7 + r12
            java.util.Arrays.fill(r8, r12, r7, r9)
        La2:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.internal.HostnamesKt.decodeIpv6(java.lang.String, int, int):java.net.InetAddress");
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i12;
            while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i10 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        Buffer buffer = new Buffer();
        while (i11 < bArr.length) {
            if (i11 == i10) {
                buffer.writeByte(58);
                i11 += i13;
                if (i11 == 16) {
                    buffer.writeByte(58);
                }
            } else {
                if (i11 > 0) {
                    buffer.writeByte(58);
                }
                buffer.writeHexadecimalUnsignedLong((Util.and(bArr[i11], 255) << 8) | Util.and(bArr[i11 + 1], 255));
                i11 += 2;
            }
        }
        return buffer.readUtf8();
    }

    @Nullable
    public static final String toCanonicalHost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!StringsKt.g0(str, StringUtils.PROCESS_POSTFIX_DELIMITER, false, 2, null)) {
            try {
                String ascii = IDN.toASCII(str);
                Intrinsics.checkNotNullExpressionValue(ascii, "toASCII(host)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = ascii.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                if (containsInvalidHostnameAsciiCodes(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressDecodeIpv6 = (StringsKt.a0(str, C4240b4.j.f42672d, false, 2, null) && StringsKt.M(str, C4240b4.j.f42674e, false, 2, null)) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
        if (inetAddressDecodeIpv6 == null) {
            return null;
        }
        byte[] address = inetAddressDecodeIpv6.getAddress();
        if (address.length == 16) {
            Intrinsics.checkNotNullExpressionValue(address, "address");
            return inet6AddressToAscii(address);
        }
        if (address.length == 4) {
            return inetAddressDecodeIpv6.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
