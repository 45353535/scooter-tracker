package com.google.common.net;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.CharMatcher;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.hash.Hashing;
import com.google.common.io.ByteStreams;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ironsource.C4240b4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.Objects;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class InetAddresses {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final CharMatcher f31026a = CharMatcher.is('.');

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final CharMatcher f31027b = CharMatcher.is(':');

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Inet4Address f31028c = (Inet4Address) forString("127.0.0.1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Inet4Address f31029d = (Inet4Address) forString("0.0.0.0");

    private static final class Scope {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f31030a;

        private Scope() {
        }
    }

    public static final class TeredoInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Inet4Address f31031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Inet4Address f31032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f31033c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f31034d;

        public TeredoInfo(Inet4Address inet4Address, Inet4Address inet4Address2, int i10, int i11) {
            boolean z10 = false;
            Preconditions.checkArgument(i10 >= 0 && i10 <= 65535, "port '%s' is out of range (0 <= port <= 0xffff)", i10);
            if (i11 >= 0 && i11 <= 65535) {
                z10 = true;
            }
            Preconditions.checkArgument(z10, "flags '%s' is out of range (0 <= flags <= 0xffff)", i11);
            this.f31031a = (Inet4Address) MoreObjects.firstNonNull(inet4Address, InetAddresses.f31029d);
            this.f31032b = (Inet4Address) MoreObjects.firstNonNull(inet4Address2, InetAddresses.f31029d);
            this.f31033c = i10;
            this.f31034d = i11;
        }

        public Inet4Address getClient() {
            return this.f31032b;
        }

        public int getFlags() {
            return this.f31034d;
        }

        public int getPort() {
            return this.f31033c;
        }

        public Inet4Address getServer() {
            return this.f31031a;
        }
    }

    private static InetAddress b(byte[] bArr, String str) {
        try {
            InetAddress byAddress = InetAddress.getByAddress(bArr);
            if (str == null) {
                return byAddress;
            }
            Preconditions.checkArgument(byAddress instanceof Inet6Address, "Unexpected state, scope should only appear for ipv6");
            Inet6Address inet6Address = (Inet6Address) byAddress;
            int iP = p(str, 0, str.length());
            if (iP != -1) {
                return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), iP);
            }
            try {
                NetworkInterface byName = NetworkInterface.getByName(str);
                if (byName != null) {
                    return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), byName);
                }
                throw f("No such interface: '%s'", str);
            } catch (SocketException e10) {
                e = e10;
                throw new IllegalArgumentException("No such interface: " + str, e);
            } catch (UnknownHostException e11) {
                e = e11;
                throw new IllegalArgumentException("No such interface: " + str, e);
            }
        } catch (UnknownHostException e12) {
            throw new AssertionError(e12);
        }
    }

    private static void c(int[] iArr) {
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < iArr.length + 1; i13++) {
            if (i13 >= iArr.length || iArr[i13] != 0) {
                if (i12 >= 0) {
                    int i14 = i13 - i12;
                    if (i14 > i10) {
                        i11 = i12;
                        i10 = i14;
                    }
                    i12 = -1;
                }
            } else if (i12 < 0) {
                i12 = i13;
            }
        }
        if (i10 >= 2) {
            Arrays.fill(iArr, i11, i10 + i11, -1);
        }
    }

    public static int coerceToInteger(InetAddress inetAddress) {
        return ByteStreams.newDataInput(getCoercedIPv4Address(inetAddress).getAddress()).readInt();
    }

    private static String d(String str) {
        int iLastIndexOf = str.lastIndexOf(58) + 1;
        String strSubstring = str.substring(0, iLastIndexOf);
        byte[] bArrN = n(str.substring(iLastIndexOf));
        if (bArrN == null) {
            return null;
        }
        return strSubstring + Integer.toHexString(((bArrN[0] & 255) << 8) | (bArrN[1] & 255)) + StringUtils.PROCESS_POSTFIX_DELIMITER + Integer.toHexString((bArrN[3] & 255) | ((bArrN[2] & 255) << 8));
    }

    public static InetAddress decrement(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        int length = address.length - 1;
        while (length >= 0 && address[length] == 0) {
            address[length] = -1;
            length--;
        }
        Preconditions.checkArgument(length >= 0, "Decrementing %s would wrap.", inetAddress);
        address[length] = (byte) (address[length] - 1);
        return b(address, null);
    }

    private static InetAddress e(String str, boolean z10) {
        int i10;
        Preconditions.checkNotNull(str);
        if (str.startsWith(C4240b4.j.f42672d) && str.endsWith(C4240b4.j.f42674e)) {
            str = str.substring(1, str.length() - 1);
            i10 = 16;
        } else {
            i10 = 4;
        }
        Scope scope = z10 ? new Scope() : null;
        byte[] bArrJ = j(str, scope);
        if (bArrJ == null || bArrJ.length != i10) {
            return null;
        }
        return b(bArrJ, scope != null ? scope.f31030a : null);
    }

    private static IllegalArgumentException f(String str, Object... objArr) {
        return new IllegalArgumentException(String.format(Locale.ROOT, str, objArr));
    }

    @CanIgnoreReturnValue
    public static InetAddress forString(String str) {
        Scope scope = new Scope();
        byte[] bArrJ = j(str, scope);
        if (bArrJ != null) {
            return b(bArrJ, scope.f31030a);
        }
        throw f("'%s' is not an IP string literal.", str);
    }

    public static InetAddress forUriString(String str) {
        InetAddress inetAddressE = e(str, true);
        if (inetAddressE != null) {
            return inetAddressE;
        }
        throw f("Not a valid URI IP literal: '%s'", str);
    }

    public static Inet4Address fromIPv4BigInteger(BigInteger bigInteger) {
        return (Inet4Address) g(bigInteger, false);
    }

    public static Inet6Address fromIPv6BigInteger(BigInteger bigInteger) {
        return (Inet6Address) g(bigInteger, true);
    }

    public static Inet4Address fromInteger(int i10) {
        return h(Ints.toByteArray(i10));
    }

    public static InetAddress fromLittleEndianByteArray(byte[] bArr) throws UnknownHostException {
        byte[] bArr2 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = bArr[(bArr.length - i10) - 1];
        }
        return InetAddress.getByAddress(bArr2);
    }

    private static InetAddress g(BigInteger bigInteger, boolean z10) {
        Preconditions.checkArgument(bigInteger.signum() >= 0, "BigInteger must be greater than or equal to 0");
        int i10 = z10 ? 16 : 4;
        byte[] byteArray = bigInteger.toByteArray();
        byte[] bArr = new byte[i10];
        int iMax = Math.max(0, byteArray.length - i10);
        int length = byteArray.length - iMax;
        int i11 = i10 - length;
        for (int i12 = 0; i12 < iMax; i12++) {
            if (byteArray[i12] != 0) {
                throw f("BigInteger cannot be converted to InetAddress because it has more than %d bytes: %s", Integer.valueOf(i10), bigInteger);
            }
        }
        System.arraycopy(byteArray, iMax, bArr, i11, length);
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e10) {
            throw new AssertionError(e10);
        }
    }

    public static Inet4Address get6to4IPv4Address(Inet6Address inet6Address) {
        Preconditions.checkArgument(is6to4Address(inet6Address), "Address '%s' is not a 6to4 address.", toAddrString(inet6Address));
        return h(Arrays.copyOfRange(inet6Address.getAddress(), 2, 6));
    }

    public static Inet4Address getCoercedIPv4Address(InetAddress inetAddress) {
        boolean z10;
        if (inetAddress instanceof Inet4Address) {
            return (Inet4Address) inetAddress;
        }
        byte[] address = inetAddress.getAddress();
        int i10 = 0;
        while (true) {
            if (i10 >= 15) {
                z10 = true;
                break;
            }
            if (address[i10] != 0) {
                z10 = false;
                break;
            }
            i10++;
        }
        if (z10 && address[15] == 1) {
            return f31028c;
        }
        if (z10 && address[15] == 0) {
            return f31029d;
        }
        Inet6Address inet6Address = (Inet6Address) inetAddress;
        int iAsInt = Hashing.murmur3_32_fixed().hashLong(hasEmbeddedIPv4ClientAddress(inet6Address) ? getEmbeddedIPv4ClientAddress(inet6Address).hashCode() : ByteBuffer.wrap(inet6Address.getAddress(), 0, 8).getLong()).asInt() | (-536870912);
        if (iAsInt == -1) {
            iAsInt = -2;
        }
        return h(Ints.toByteArray(iAsInt));
    }

    public static Inet4Address getCompatIPv4Address(Inet6Address inet6Address) {
        Preconditions.checkArgument(isCompatIPv4Address(inet6Address), "Address '%s' is not IPv4-compatible.", toAddrString(inet6Address));
        return h(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static Inet4Address getEmbeddedIPv4ClientAddress(Inet6Address inet6Address) {
        if (isCompatIPv4Address(inet6Address)) {
            return getCompatIPv4Address(inet6Address);
        }
        if (is6to4Address(inet6Address)) {
            return get6to4IPv4Address(inet6Address);
        }
        if (isTeredoAddress(inet6Address)) {
            return getTeredoInfo(inet6Address).getClient();
        }
        throw f("'%s' has no embedded IPv4 address.", toAddrString(inet6Address));
    }

    public static Inet4Address getIsatapIPv4Address(Inet6Address inet6Address) {
        Preconditions.checkArgument(isIsatapAddress(inet6Address), "Address '%s' is not an ISATAP address.", toAddrString(inet6Address));
        return h(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static TeredoInfo getTeredoInfo(Inet6Address inet6Address) {
        Preconditions.checkArgument(isTeredoAddress(inet6Address), "Address '%s' is not a Teredo address.", toAddrString(inet6Address));
        byte[] address = inet6Address.getAddress();
        Inet4Address inet4AddressH = h(Arrays.copyOfRange(address, 4, 8));
        int i10 = ByteStreams.newDataInput(address, 8).readShort() & 65535;
        int i11 = 65535 & (~ByteStreams.newDataInput(address, 10).readShort());
        byte[] bArrCopyOfRange = Arrays.copyOfRange(address, 12, 16);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) (~bArrCopyOfRange[i12]);
        }
        return new TeredoInfo(inet4AddressH, h(bArrCopyOfRange), i11, i10);
    }

    private static Inet4Address h(byte[] bArr) {
        Preconditions.checkArgument(bArr.length == 4, "Byte array has invalid length for an IPv4 address: %s != 4.", bArr.length);
        return (Inet4Address) b(bArr, null);
    }

    public static boolean hasEmbeddedIPv4ClientAddress(Inet6Address inet6Address) {
        return isCompatIPv4Address(inet6Address) || is6to4Address(inet6Address) || isTeredoAddress(inet6Address);
    }

    private static String i(int[] iArr) {
        StringBuilder sb2 = new StringBuilder(39);
        int i10 = 0;
        boolean z10 = false;
        while (i10 < iArr.length) {
            boolean z11 = iArr[i10] >= 0;
            if (z11) {
                if (z10) {
                    sb2.append(':');
                }
                sb2.append(Integer.toHexString(iArr[i10]));
            } else if (i10 == 0 || z10) {
                sb2.append("::");
            }
            i10++;
            z10 = z11;
        }
        return sb2.toString();
    }

    public static InetAddress increment(InetAddress inetAddress) {
        byte[] address = inetAddress.getAddress();
        int length = address.length - 1;
        while (true) {
            if (length < 0 || address[length] != -1) {
                break;
            }
            address[length] = 0;
            length--;
        }
        Preconditions.checkArgument(length >= 0, "Incrementing %s would wrap.", inetAddress);
        address[length] = (byte) (address[length] + 1);
        return b(address, null);
    }

    public static boolean is6to4Address(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        return address[0] == 32 && address[1] == 2;
    }

    public static boolean isCompatIPv4Address(Inet6Address inet6Address) {
        byte b10;
        if (!inet6Address.isIPv4CompatibleAddress()) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        return (address[12] == 0 && address[13] == 0 && address[14] == 0 && ((b10 = address[15]) == 0 || b10 == 1)) ? false : true;
    }

    public static boolean isInetAddress(String str) {
        return j(str, null) != null;
    }

    public static boolean isIsatapAddress(Inet6Address inet6Address) {
        if (isTeredoAddress(inet6Address)) {
            return false;
        }
        byte[] address = inet6Address.getAddress();
        return (address[8] | 3) == 3 && address[9] == 0 && address[10] == 94 && address[11] == -2;
    }

    public static boolean isMappedIPv4Address(String str) {
        byte[] bArrJ = j(str, null);
        if (bArrJ == null || bArrJ.length != 16) {
            return false;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= 10) {
                for (int i11 = 10; i11 < 12; i11++) {
                    if (bArrJ[i11] != -1) {
                        return false;
                    }
                }
                return true;
            }
            if (bArrJ[i10] != 0) {
                return false;
            }
            i10++;
        }
    }

    public static boolean isMaximum(InetAddress inetAddress) {
        for (byte b10 : inetAddress.getAddress()) {
            if (b10 != -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTeredoAddress(Inet6Address inet6Address) {
        byte[] address = inet6Address.getAddress();
        return address[0] == 32 && address[1] == 1 && address[2] == 0 && address[3] == 0;
    }

    public static boolean isUriInetAddress(String str) {
        return e(str, false) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
    
        if (r3 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (r2 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        r9 = d(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003a, code lost:
    
        if (r9 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        if (r1 == (-1)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        if (r10 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        r10.f31030a = r9.substring(r1 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        r9 = r9.substring(0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        return o(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
    
        if (r2 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0055, code lost:
    
        if (r1 == (-1)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0057, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:
    
        return n(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] j(java.lang.String r9, com.google.common.net.InetAddresses.Scope r10) {
        /*
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r9.length()
            r5 = 0
            r6 = -1
            if (r1 >= r4) goto L31
            char r4 = r9.charAt(r1)
            r7 = 46
            r8 = 1
            if (r4 != r7) goto L17
            r2 = r8
            goto L2e
        L17:
            r7 = 58
            if (r4 != r7) goto L20
            if (r2 == 0) goto L1e
            return r5
        L1e:
            r3 = r8
            goto L2e
        L20:
            r7 = 37
            if (r4 != r7) goto L25
            goto L32
        L25:
            r7 = 16
            int r4 = java.lang.Character.digit(r4, r7)
            if (r4 != r6) goto L2e
            return r5
        L2e:
            int r1 = r1 + 1
            goto L4
        L31:
            r1 = r6
        L32:
            if (r3 == 0) goto L53
            if (r2 == 0) goto L3d
            java.lang.String r9 = d(r9)
            if (r9 != 0) goto L3d
            return r5
        L3d:
            if (r1 == r6) goto L4e
            if (r10 == 0) goto L4a
            int r2 = r1 + 1
            java.lang.String r2 = r9.substring(r2)
            com.google.common.net.InetAddresses.Scope.b(r10, r2)
        L4a:
            java.lang.String r9 = r9.substring(r0, r1)
        L4e:
            byte[] r9 = o(r9)
            return r9
        L53:
            if (r2 == 0) goto L5d
            if (r1 == r6) goto L58
            return r5
        L58:
            byte[] r9 = n(r9)
            return r9
        L5d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.net.InetAddresses.j(java.lang.String, com.google.common.net.InetAddresses$Scope):byte[]");
    }

    private static short k(String str, int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 <= 0 || i12 > 4) {
            throw new NumberFormatException();
        }
        int iDigit = 0;
        while (i10 < i11) {
            iDigit = (iDigit << 4) | Character.digit(str.charAt(i10), 16);
            i10++;
        }
        return (short) iDigit;
    }

    private static byte l(String str, int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 <= 0 || i12 > 3) {
            throw new NumberFormatException();
        }
        if (i12 > 1 && str.charAt(i10) == '0') {
            throw new NumberFormatException();
        }
        int i13 = 0;
        while (i10 < i11) {
            int i14 = i13 * 10;
            int iDigit = Character.digit(str.charAt(i10), 10);
            if (iDigit < 0) {
                throw new NumberFormatException();
            }
            i13 = i14 + iDigit;
            i10++;
        }
        if (i13 <= 255) {
            return (byte) i13;
        }
        throw new NumberFormatException();
    }

    private static String m(Inet6Address inet6Address) {
        NetworkInterface scopedInterface = inet6Address.getScopedInterface();
        if (scopedInterface != null) {
            return "%" + scopedInterface.getName();
        }
        int scopeId = inet6Address.getScopeId();
        if (scopeId == 0) {
            return "";
        }
        return "%" + scopeId;
    }

    private static byte[] n(String str) {
        if (f31026a.countIn(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            int iIndexOf = str.indexOf(46, i10);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            try {
                bArr[i11] = l(str, i10, iIndexOf);
                i10 = iIndexOf + 1;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    private static byte[] o(String str) {
        int iCountIn = f31027b.countIn(str);
        if (iCountIn >= 2 && iCountIn <= 8) {
            int i10 = 1;
            int i11 = iCountIn + 1;
            int i12 = 8 - i11;
            boolean z10 = false;
            for (int i13 = 0; i13 < str.length() - 1; i13++) {
                if (str.charAt(i13) == ':' && str.charAt(i13 + 1) == ':') {
                    if (z10) {
                        return null;
                    }
                    int i14 = i12 + 1;
                    if (i13 == 0) {
                        i14 = i12 + 2;
                    }
                    if (i13 == str.length() - 2) {
                        i14++;
                    }
                    i12 = i14;
                    z10 = true;
                }
            }
            if (str.charAt(0) == ':' && str.charAt(1) != ':') {
                return null;
            }
            if (str.charAt(str.length() - 1) == ':' && str.charAt(str.length() - 2) != ':') {
                return null;
            }
            if (z10 && i12 <= 0) {
                return null;
            }
            if (!z10 && i11 != 8) {
                return null;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            try {
                if (str.charAt(0) != ':') {
                    i10 = 0;
                }
                while (i10 < str.length()) {
                    int iIndexOf = str.indexOf(58, i10);
                    if (iIndexOf == -1) {
                        iIndexOf = str.length();
                    }
                    if (str.charAt(i10) == ':') {
                        for (int i15 = 0; i15 < i12; i15++) {
                            byteBufferAllocate.putShort((short) 0);
                        }
                    } else {
                        byteBufferAllocate.putShort(k(str, i10, iIndexOf));
                    }
                    i10 = iIndexOf + 1;
                }
                return byteBufferAllocate.array();
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private static int p(String str, int i10, int i11) {
        int i12 = 0;
        while (i10 < i11) {
            if (i12 > 214748364) {
                return -1;
            }
            int i13 = i12 * 10;
            int iDigit = Character.digit(str.charAt(i10), 10);
            if (iDigit < 0) {
                return -1;
            }
            i12 = i13 + iDigit;
            i10++;
        }
        return i12;
    }

    public static String toAddrString(InetAddress inetAddress) {
        Preconditions.checkNotNull(inetAddress);
        if (inetAddress instanceof Inet4Address) {
            String hostAddress = inetAddress.getHostAddress();
            Objects.requireNonNull(hostAddress);
            return hostAddress;
        }
        byte[] address = inetAddress.getAddress();
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            int i11 = i10 * 2;
            iArr[i10] = Ints.fromBytes((byte) 0, (byte) 0, address[i11], address[i11 + 1]);
        }
        c(iArr);
        return i(iArr) + m((Inet6Address) inetAddress);
    }

    public static BigInteger toBigInteger(InetAddress inetAddress) {
        return new BigInteger(1, inetAddress.getAddress());
    }

    public static String toUriString(InetAddress inetAddress) {
        if (!(inetAddress instanceof Inet6Address)) {
            return toAddrString(inetAddress);
        }
        return C4240b4.j.f42672d + toAddrString(inetAddress) + C4240b4.j.f42674e;
    }
}
