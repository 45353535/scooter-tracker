package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okhttp3.internal.tls.CertificateChainCleaner;
import com.applovin.shadow.okio.ByteString;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.taurusx.tax.f.y;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 *2\u00020\u0001:\u0003+*,B#\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0016\"\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0017J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/applovin/shadow/okhttp3/CertificatePinner;", "", "", "Lcom/applovin/shadow/okhttp3/CertificatePinner$Pin;", "pins", "Lcom/applovin/shadow/okhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "<init>", "(Ljava/util/Set;Luh/c;)V", "", "hostname", "", "Ljava/security/cert/Certificate;", "peerCertificates", "", "check", "(Ljava/lang/String;Ljava/util/List;)V", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "check$okhttp", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "findMatchingPins", "(Ljava/lang/String;)Ljava/util/List;", "withCertificateChainCleaner$okhttp", "(Lcom/applovin/shadow/okhttp3/internal/tls/CertificateChainCleaner;)Lcom/applovin/shadow/okhttp3/CertificatePinner;", "withCertificateChainCleaner", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/Set;", "getPins", "()Ljava/util/Set;", "Lcom/applovin/shadow/okhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Luh/c;", y.f66058y, "Builder", "Pin", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CertificatePinner {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final CertificatePinner DEFAULT = new Builder().build();

    @Nullable
    private final CertificateChainCleaner certificateChainCleaner;

    @NotNull
    private final Set<Pin> pins;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\t\"\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/applovin/shadow/okhttp3/CertificatePinner$Builder;", "", "<init>", "()V", "Lcom/applovin/shadow/okhttp3/CertificatePinner;", "build", "()Lcom/applovin/shadow/okhttp3/CertificatePinner;", "", "pattern", "", "pins", "add", "(Ljava/lang/String;[Ljava/lang/String;)Lhh/g$a;", "", "Lcom/applovin/shadow/okhttp3/CertificatePinner$Pin;", "Ljava/util/List;", "getPins", "()Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private final List<Pin> pins = new ArrayList();

        @NotNull
        public final Builder add(@NotNull String pattern, @NotNull String... pins) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            Intrinsics.checkNotNullParameter(pins, "pins");
            for (String str : pins) {
                this.pins.add(new Pin(pattern, str));
            }
            return this;
        }

        @NotNull
        public final CertificatePinner build() {
            return new CertificatePinner(CollectionsKt.toSet(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        @NotNull
        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0007J\f\u0010\f\u001a\u00020\n*\u00020\u000bH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/applovin/shadow/okhttp3/CertificatePinner$Companion;", "", "()V", "DEFAULT", "Lcom/applovin/shadow/okhttp3/CertificatePinner;", "pin", "", "certificate", "Ljava/security/cert/Certificate;", "sha1Hash", "Lcom/applovin/shadow/okio/ByteString;", "Ljava/security/cert/X509Certificate;", "sha256Hash", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String pin(@NotNull Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + sha256Hash((X509Certificate) certificate).base64();
        }

        @NotNull
        public final ByteString sha1Hash(@NotNull X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            ByteString.Companion companion = ByteString.INSTANCE;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha1();
        }

        @NotNull
        public final ByteString sha256Hash(@NotNull X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            ByteString.Companion companion = ByteString.INSTANCE;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "publicKey.encoded");
            return ByteString.Companion.of$default(companion, encoded, 0, 0, 3, null).sha256();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/applovin/shadow/okhttp3/CertificatePinner$Pin;", "", "", "pattern", "pin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "hostname", "", "matchesHostname", "(Ljava/lang/String;)Z", "Ljava/security/cert/X509Certificate;", "certificate", "matchesCertificate", "(Ljava/security/cert/X509Certificate;)Z", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getPattern", "hashAlgorithm", "getHashAlgorithm", "Lcom/applovin/shadow/okio/ByteString;", "hash", "Lcom/applovin/shadow/okio/ByteString;", "getHash", "()Lvh/h;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Pin {

        @NotNull
        private final ByteString hash;

        @NotNull
        private final String hashAlgorithm;

        @NotNull
        private final String pattern;

        /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Pin(@org.jetbrains.annotations.NotNull java.lang.String r12, @org.jetbrains.annotations.NotNull java.lang.String r13) {
            /*
                Method dump skipped, instruction units count: 261
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.CertificatePinner.Pin.<init>(java.lang.String, java.lang.String):void");
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) other;
            return Intrinsics.areEqual(this.pattern, pin.pattern) && Intrinsics.areEqual(this.hashAlgorithm, pin.hashAlgorithm) && Intrinsics.areEqual(this.hash, pin.hash);
        }

        @NotNull
        public final ByteString getHash() {
            return this.hash;
        }

        @NotNull
        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        @NotNull
        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public final boolean matchesCertificate(@NotNull X509Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            String str = this.hashAlgorithm;
            if (Intrinsics.areEqual(str, "sha256")) {
                return Intrinsics.areEqual(this.hash, CertificatePinner.INSTANCE.sha256Hash(certificate));
            }
            if (Intrinsics.areEqual(str, "sha1")) {
                return Intrinsics.areEqual(this.hash, CertificatePinner.INSTANCE.sha1Hash(certificate));
            }
            return false;
        }

        public final boolean matchesHostname(@NotNull String hostname) {
            Intrinsics.checkNotNullParameter(hostname, "hostname");
            if (StringsKt.a0(this.pattern, "**.", false, 2, null)) {
                int length = this.pattern.length() - 3;
                int length2 = hostname.length() - length;
                return StringsKt.R(hostname, hostname.length() - length, this.pattern, 3, length, false, 16, null) && (length2 == 0 || hostname.charAt(length2 - 1) == '.');
            }
            if (!StringsKt.a0(this.pattern, "*.", false, 2, null)) {
                return Intrinsics.areEqual(hostname, this.pattern);
            }
            int length3 = this.pattern.length() - 1;
            return StringsKt.R(hostname, hostname.length() - length3, this.pattern, 1, length3, false, 16, null) && StringsKt.B0(hostname, '.', (hostname.length() - length3) + (-1), false, 4, null) == -1;
        }

        @NotNull
        public String toString() {
            return this.hashAlgorithm + IOUtils.DIR_SEPARATOR_UNIX + this.hash.base64();
        }
    }

    public CertificatePinner(@NotNull Set<Pin> pins, @Nullable CertificateChainCleaner certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.pins = pins;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    @NotNull
    public static final String pin(@NotNull Certificate certificate) {
        return INSTANCE.pin(certificate);
    }

    @NotNull
    public static final ByteString sha1Hash(@NotNull X509Certificate x509Certificate) {
        return INSTANCE.sha1Hash(x509Certificate);
    }

    @NotNull
    public static final ByteString sha256Hash(@NotNull X509Certificate x509Certificate) {
        return INSTANCE.sha256Hash(x509Certificate);
    }

    public final void check(@NotNull final String hostname, @NotNull final List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        check$okhttp(hostname, new Function0<List<? extends X509Certificate>>() { // from class: com.applovin.shadow.okhttp3.CertificatePinner.check.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends X509Certificate> invoke() {
                List<Certificate> listClean;
                CertificateChainCleaner certificateChainCleaner = CertificatePinner.this.getCertificateChainCleaner();
                if (certificateChainCleaner == null || (listClean = certificateChainCleaner.clean(peerCertificates, hostname)) == null) {
                    listClean = peerCertificates;
                }
                List<Certificate> list = listClean;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (Certificate certificate : list) {
                    Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            }
        });
    }

    public final void check$okhttp(@NotNull String hostname, @NotNull Function0<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<Pin> listFindMatchingPins = findMatchingPins(hostname);
        if (listFindMatchingPins.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listInvoke = cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : listInvoke) {
            ByteString byteStringSha256Hash = null;
            ByteString byteStringSha1Hash = null;
            for (Pin pin : listFindMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                if (Intrinsics.areEqual(hashAlgorithm, "sha256")) {
                    if (byteStringSha256Hash == null) {
                        byteStringSha256Hash = INSTANCE.sha256Hash(x509Certificate);
                    }
                    if (Intrinsics.areEqual(pin.getHash(), byteStringSha256Hash)) {
                        return;
                    }
                } else {
                    if (!Intrinsics.areEqual(hashAlgorithm, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                    }
                    if (byteStringSha1Hash == null) {
                        byteStringSha1Hash = INSTANCE.sha1Hash(x509Certificate);
                    }
                    if (Intrinsics.areEqual(pin.getHash(), byteStringSha1Hash)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : listInvoke) {
            sb2.append("\n    ");
            sb2.append(INSTANCE.pin(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(hostname);
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        for (Pin pin2 : listFindMatchingPins) {
            sb2.append("\n    ");
            sb2.append(pin2);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) other;
        return Intrinsics.areEqual(certificatePinner.pins, this.pins) && Intrinsics.areEqual(certificatePinner.certificateChainCleaner, this.certificateChainCleaner);
    }

    @NotNull
    public final List<Pin> findMatchingPins(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set<Pin> set = this.pins;
        List<Pin> listEmptyList = CollectionsKt.emptyList();
        for (Object obj : set) {
            if (((Pin) obj).matchesHostname(hostname)) {
                if (listEmptyList.isEmpty()) {
                    listEmptyList = new ArrayList<>();
                }
                Intrinsics.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                b1.c(listEmptyList).add(obj);
            }
        }
        return listEmptyList;
    }

    @Nullable
    /* JADX INFO: renamed from: getCertificateChainCleaner$okhttp, reason: from getter */
    public final CertificateChainCleaner getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    @NotNull
    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int iHashCode = (1517 + this.pins.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    @NotNull
    public final CertificatePinner withCertificateChainCleaner$okhttp(@NotNull CertificateChainCleaner certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.areEqual(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }

    public final void check(@NotNull String hostname, @NotNull Certificate... peerCertificates) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        check(hostname, ArraysKt.toList(peerCertificates));
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i10 & 2) != 0 ? null : certificateChainCleaner);
    }
}
