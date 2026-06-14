package com.google.common.net;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.net.InetAddress;
import java.text.ParseException;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class HostSpecifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31025a;

    private HostSpecifier(String str) {
        this.f31025a = str;
    }

    @CanIgnoreReturnValue
    public static HostSpecifier from(String str) throws ParseException {
        try {
            return fromValid(str);
        } catch (IllegalArgumentException e10) {
            ParseException parseException = new ParseException("Invalid host specifier: " + str, 0);
            parseException.initCause(e10);
            throw parseException;
        }
    }

    public static HostSpecifier fromValid(String str) {
        InetAddress inetAddressForString;
        HostAndPort hostAndPortFromString = HostAndPort.fromString(str);
        Preconditions.checkArgument(!hostAndPortFromString.hasPort());
        String host = hostAndPortFromString.getHost();
        try {
            inetAddressForString = InetAddresses.forString(host);
        } catch (IllegalArgumentException unused) {
            inetAddressForString = null;
        }
        if (inetAddressForString != null) {
            return new HostSpecifier(InetAddresses.toUriString(inetAddressForString));
        }
        InternetDomainName internetDomainNameFrom = InternetDomainName.from(host);
        if (internetDomainNameFrom.hasPublicSuffix()) {
            return new HostSpecifier(internetDomainNameFrom.toString());
        }
        throw new IllegalArgumentException("Domain name does not have a recognized public suffix: " + host);
    }

    public static boolean isValid(String str) {
        try {
            fromValid(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HostSpecifier) {
            return this.f31025a.equals(((HostSpecifier) obj).f31025a);
        }
        return false;
    }

    public int hashCode() {
        return this.f31025a.hashCode();
    }

    public String toString() {
        return this.f31025a;
    }
}
