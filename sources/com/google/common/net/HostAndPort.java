package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
@Immutable
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class HostAndPort implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f31023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f31024d;

    private HostAndPort(String str, int i10, boolean z10) {
        this.f31022b = str;
        this.f31023c = i10;
        this.f31024d = z10;
    }

    private static String[] a(String str) {
        Preconditions.checkArgument(str.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", str);
        int iIndexOf = str.indexOf(58);
        int iLastIndexOf = str.lastIndexOf(93);
        Preconditions.checkArgument(iIndexOf > -1 && iLastIndexOf > iIndexOf, "Invalid bracketed host/port: %s", str);
        String strSubstring = str.substring(1, iLastIndexOf);
        int i10 = iLastIndexOf + 1;
        if (i10 == str.length()) {
            return new String[]{strSubstring, ""};
        }
        Preconditions.checkArgument(str.charAt(i10) == ':', "Only a colon may follow a close bracket: %s", str);
        int i11 = iLastIndexOf + 2;
        for (int i12 = i11; i12 < str.length(); i12++) {
            Preconditions.checkArgument(Character.isDigit(str.charAt(i12)), "Port must be numeric: %s", str);
        }
        return new String[]{strSubstring, str.substring(i11)};
    }

    private static boolean b(int i10) {
        return i10 >= 0 && i10 <= 65535;
    }

    public static HostAndPort fromHost(String str) {
        HostAndPort hostAndPortFromString = fromString(str);
        Preconditions.checkArgument(!hostAndPortFromString.hasPort(), "Host has a port: %s", str);
        return hostAndPortFromString;
    }

    public static HostAndPort fromParts(String str, int i10) {
        Preconditions.checkArgument(b(i10), "Port out of range: %s", i10);
        HostAndPort hostAndPortFromString = fromString(str);
        Preconditions.checkArgument(!hostAndPortFromString.hasPort(), "Host has a port: %s", str);
        return new HostAndPort(hostAndPortFromString.f31022b, i10, hostAndPortFromString.f31024d);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.common.net.HostAndPort fromString(java.lang.String r7) {
        /*
            com.google.common.base.Preconditions.checkNotNull(r7)
            java.lang.String r0 = "["
            boolean r0 = r7.startsWith(r0)
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L19
            java.lang.String[] r0 = a(r7)
            r4 = r0[r3]
            r0 = r0[r2]
        L16:
            r5 = r4
            r4 = r3
            goto L3c
        L19:
            r0 = 58
            int r4 = r7.indexOf(r0)
            if (r4 < 0) goto L32
            int r5 = r4 + 1
            int r0 = r7.indexOf(r0, r5)
            if (r0 != r1) goto L32
            java.lang.String r4 = r7.substring(r3, r4)
            java.lang.String r0 = r7.substring(r5)
            goto L16
        L32:
            if (r4 < 0) goto L36
            r0 = r2
            goto L37
        L36:
            r0 = r3
        L37:
            r4 = 0
            r5 = r4
            r4 = r0
            r0 = r5
            r5 = r7
        L3c:
            boolean r6 = com.google.common.base.Strings.isNullOrEmpty(r0)
            if (r6 != 0) goto L80
            java.lang.String r1 = "+"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L55
            com.google.common.base.CharMatcher r1 = com.google.common.base.CharMatcher.ascii()
            boolean r1 = r1.matchesAllOf(r0)
            if (r1 == 0) goto L55
            goto L56
        L55:
            r2 = r3
        L56:
            java.lang.String r1 = "Unparseable port number: %s"
            com.google.common.base.Preconditions.checkArgument(r2, r1, r7)
            int r1 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L69
            boolean r0 = b(r1)
            java.lang.String r2 = "Port number out of range: %s"
            com.google.common.base.Preconditions.checkArgument(r0, r2, r7)
            goto L80
        L69:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unparseable port number: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L80:
            com.google.common.net.HostAndPort r7 = new com.google.common.net.HostAndPort
            r7.<init>(r5, r1, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.net.HostAndPort.fromString(java.lang.String):com.google.common.net.HostAndPort");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HostAndPort) {
            HostAndPort hostAndPort = (HostAndPort) obj;
            if (Objects.equal(this.f31022b, hostAndPort.f31022b) && this.f31023c == hostAndPort.f31023c) {
                return true;
            }
        }
        return false;
    }

    public String getHost() {
        return this.f31022b;
    }

    public int getPort() {
        Preconditions.checkState(hasPort());
        return this.f31023c;
    }

    public int getPortOrDefault(int i10) {
        return hasPort() ? this.f31023c : i10;
    }

    public boolean hasPort() {
        return this.f31023c >= 0;
    }

    public int hashCode() {
        return Objects.hashCode(this.f31022b, Integer.valueOf(this.f31023c));
    }

    @CanIgnoreReturnValue
    public HostAndPort requireBracketsForIPv6() {
        Preconditions.checkArgument(!this.f31024d, "Possible bracketless IPv6 literal: %s", this.f31022b);
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.f31022b.length() + 8);
        if (this.f31022b.indexOf(58) >= 0) {
            sb2.append('[');
            sb2.append(this.f31022b);
            sb2.append(']');
        } else {
            sb2.append(this.f31022b);
        }
        if (hasPort()) {
            sb2.append(':');
            sb2.append(this.f31023c);
        }
        return sb2.toString();
    }

    public HostAndPort withDefaultPort(int i10) {
        Preconditions.checkArgument(b(i10));
        return hasPort() ? this : new HostAndPort(this.f31022b, i10, this.f31024d);
    }
}
