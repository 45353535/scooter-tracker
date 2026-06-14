package com.google.android.datatransport.cct;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedDestination;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class CCTDestination implements EncodedDestination {
    public static final CCTDestination INSTANCE;
    public static final CCTDestination LEGACY_INSTANCE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f24123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f24124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f24125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f24126f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f24128b;

    static {
        String strA = StringMerger.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f24123c = strA;
        String strA2 = StringMerger.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f24124d = strA2;
        String strA3 = StringMerger.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f24125e = strA3;
        f24126f = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(Encoding.of("proto"), Encoding.of("json"))));
        INSTANCE = new CCTDestination(strA, null);
        LEGACY_INSTANCE = new CCTDestination(strA2, strA3);
    }

    public CCTDestination(@NonNull String str, @Nullable String str2) {
        this.f24127a = str;
        this.f24128b = str2;
    }

    @NonNull
    public static CCTDestination fromByteArray(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new CCTDestination(str2, str3);
    }

    @Nullable
    public byte[] asByteArray() {
        String str = this.f24128b;
        if (str == null && this.f24127a == null) {
            return null;
        }
        String str2 = this.f24127a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    @Nullable
    public String getAPIKey() {
        return this.f24128b;
    }

    @NonNull
    public String getEndPoint() {
        return this.f24127a;
    }

    @Override // com.google.android.datatransport.runtime.Destination
    @Nullable
    public byte[] getExtras() {
        return asByteArray();
    }

    @Override // com.google.android.datatransport.runtime.Destination
    @NonNull
    public String getName() {
        return "cct";
    }

    @Override // com.google.android.datatransport.runtime.EncodedDestination
    public Set<Encoding> getSupportedEncodings() {
        return f24126f;
    }
}
