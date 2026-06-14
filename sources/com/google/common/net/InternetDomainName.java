package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import com.google.thirdparty.publicsuffix.PublicSuffixPatterns;
import com.google.thirdparty.publicsuffix.PublicSuffixType;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@Immutable
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class InternetDomainName {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final CharMatcher f31035e = CharMatcher.anyOf(".。．｡");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Splitter f31036f = Splitter.on('.');

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Joiner f31037g = Joiner.on('.');

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final CharMatcher f31038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final CharMatcher f31039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final CharMatcher f31040j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final CharMatcher f31041k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImmutableList f31043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31044c = -2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f31045d = -2;

    static {
        CharMatcher charMatcherAnyOf = CharMatcher.anyOf("-_");
        f31038h = charMatcherAnyOf;
        CharMatcher charMatcherInRange = CharMatcher.inRange('0', '9');
        f31039i = charMatcherInRange;
        CharMatcher charMatcherOr = CharMatcher.inRange('a', 'z').or(CharMatcher.inRange('A', 'Z'));
        f31040j = charMatcherOr;
        f31041k = charMatcherInRange.or(charMatcherOr).or(charMatcherAnyOf);
    }

    InternetDomainName(String str) {
        String lowerCase = Ascii.toLowerCase(f31035e.replaceFrom((CharSequence) str, '.'));
        lowerCase = lowerCase.endsWith(".") ? lowerCase.substring(0, lowerCase.length() - 1) : lowerCase;
        Preconditions.checkArgument(lowerCase.length() <= 253, "Domain name too long: '%s':", lowerCase);
        this.f31042a = lowerCase;
        ImmutableList immutableListCopyOf = ImmutableList.copyOf(f31036f.split(lowerCase));
        this.f31043b = immutableListCopyOf;
        Preconditions.checkArgument(immutableListCopyOf.size() <= 127, "Domain has too many parts: '%s'", lowerCase);
        Preconditions.checkArgument(g(immutableListCopyOf), "Not a valid domain name: '%s'", lowerCase);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InternetDomainName a(int i10) {
        ImmutableList immutableList = this.f31043b;
        ImmutableList immutableListSubList = immutableList.subList(i10, immutableList.size());
        int length = i10;
        for (int i11 = 0; i11 < i10; i11++) {
            length += ((String) this.f31043b.get(i11)).length();
        }
        return new InternetDomainName(this.f31042a.substring(length), immutableListSubList);
    }

    private int b(Optional optional) {
        int size = this.f31043b.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strJoin = f31037g.join(this.f31043b.subList(i10, size));
            if (i10 > 0 && c(optional, Optional.fromNullable(PublicSuffixPatterns.UNDER.get(strJoin)))) {
                return i10 - 1;
            }
            if (c(optional, Optional.fromNullable(PublicSuffixPatterns.EXACT.get(strJoin)))) {
                return i10;
            }
            if (PublicSuffixPatterns.EXCLUDED.containsKey(strJoin)) {
                return i10 + 1;
            }
        }
        return -1;
    }

    private static boolean c(Optional optional, Optional optional2) {
        return optional.isPresent() ? optional.equals(optional2) : optional2.isPresent();
    }

    private int d() {
        int i10 = this.f31044c;
        if (i10 != -2) {
            return i10;
        }
        int iB = b(Optional.absent());
        this.f31044c = iB;
        return iB;
    }

    private int e() {
        int i10 = this.f31045d;
        if (i10 != -2) {
            return i10;
        }
        int iB = b(Optional.of(PublicSuffixType.REGISTRY));
        this.f31045d = iB;
        return iB;
    }

    private static boolean f(String str, boolean z10) {
        if (str.length() >= 1 && str.length() <= 63) {
            if (!f31041k.matchesAllOf(CharMatcher.ascii().retainFrom(str))) {
                return false;
            }
            CharMatcher charMatcher = f31038h;
            if (!charMatcher.matches(str.charAt(0)) && !charMatcher.matches(str.charAt(str.length() - 1))) {
                return (z10 && f31039i.matches(str.charAt(0))) ? false : true;
            }
        }
        return false;
    }

    @CanIgnoreReturnValue
    public static InternetDomainName from(String str) {
        return new InternetDomainName((String) Preconditions.checkNotNull(str));
    }

    private static boolean g(List list) {
        int size = list.size() - 1;
        if (!f((String) list.get(size), true)) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!f((String) list.get(i10), false)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValid(String str) {
        try {
            from(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public InternetDomainName child(String str) {
        return from(((String) Preconditions.checkNotNull(str)) + "." + this.f31042a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InternetDomainName) {
            return this.f31042a.equals(((InternetDomainName) obj).f31042a);
        }
        return false;
    }

    public boolean hasParent() {
        return this.f31043b.size() > 1;
    }

    public boolean hasPublicSuffix() {
        return d() != -1;
    }

    public boolean hasRegistrySuffix() {
        return e() != -1;
    }

    public int hashCode() {
        return this.f31042a.hashCode();
    }

    public boolean isPublicSuffix() {
        return d() == 0;
    }

    public boolean isRegistrySuffix() {
        return e() == 0;
    }

    public boolean isTopDomainUnderRegistrySuffix() {
        return e() == 1;
    }

    public boolean isTopPrivateDomain() {
        return d() == 1;
    }

    public boolean isUnderPublicSuffix() {
        return d() > 0;
    }

    public boolean isUnderRegistrySuffix() {
        return e() > 0;
    }

    public InternetDomainName parent() {
        Preconditions.checkState(hasParent(), "Domain '%s' has no parent", this.f31042a);
        return a(1);
    }

    public ImmutableList<String> parts() {
        return this.f31043b;
    }

    public InternetDomainName publicSuffix() {
        if (hasPublicSuffix()) {
            return a(d());
        }
        return null;
    }

    public InternetDomainName registrySuffix() {
        if (hasRegistrySuffix()) {
            return a(e());
        }
        return null;
    }

    public String toString() {
        return this.f31042a;
    }

    public InternetDomainName topDomainUnderRegistrySuffix() {
        if (isTopDomainUnderRegistrySuffix()) {
            return this;
        }
        Preconditions.checkState(isUnderRegistrySuffix(), "Not under a registry suffix: %s", this.f31042a);
        return a(e() - 1);
    }

    public InternetDomainName topPrivateDomain() {
        if (isTopPrivateDomain()) {
            return this;
        }
        Preconditions.checkState(isUnderPublicSuffix(), "Not under a public suffix: %s", this.f31042a);
        return a(d() - 1);
    }

    private InternetDomainName(String str, ImmutableList immutableList) {
        Preconditions.checkArgument(!immutableList.isEmpty(), "Cannot create an InternetDomainName with zero parts.");
        this.f31042a = str;
        this.f31043b = immutableList;
    }
}
