package com.appodeal.ads.network.endpoint;

import com.appodeal.ads.ext.ByteArrayExtKt;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.network.AppodealEndpoint;
import com.appodeal.ads.network.IndexProvider;
import com.appodeal.ads.network.b;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements AppodealEndpoint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13952a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13953b = "https://c.appbaqend.com";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IndexProvider f13954c;

    public a() {
        IndexProvider.Companion.getClass();
        this.f13954c = b.f13949b;
    }

    public static String a(String str) {
        byte[] bArrDigest;
        String hexString;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-224");
            messageDigest.update(bytes);
            bArrDigest = messageDigest.digest();
        } catch (NoSuchAlgorithmException unused) {
            bArrDigest = null;
        }
        return (bArrDigest == null || (hexString = ByteArrayExtKt.toHexString(bArrDigest)) == null) ? "appbaqend" : hexString;
    }

    public static ArrayList b() {
        Date date = new Date();
        ArrayList arrayList = new ArrayList();
        Locale locale = Locale.ENGLISH;
        String str = new SimpleDateFormat("yyyy", locale).format(date);
        String str2 = new SimpleDateFormat("yyyyMM", locale).format(date);
        String str3 = new SimpleDateFormat("yyyyMMww", locale).format(date);
        Intrinsics.checkNotNull(str);
        arrayList.add("https://c." + a(str) + ".com");
        Intrinsics.checkNotNull(str2);
        arrayList.add("https://c." + a(str2) + ".com");
        Intrinsics.checkNotNull(str3);
        arrayList.add("https://c." + a(str3) + ".com");
        return arrayList;
    }

    @Override // com.appodeal.ads.network.AppodealEndpoint
    public final String getActiveEndpoint() {
        String str = (String) CollectionsKt.getOrNull(this.f13952a, this.f13954c.currentIndex());
        return str == null ? this.f13953b : str;
    }

    @Override // com.appodeal.ads.network.AppodealEndpoint
    public final boolean hasNextEndpoint() {
        return this.f13954c.popNextIndex(this.f13952a.size()) != null;
    }

    @Override // com.appodeal.ads.network.AppodealEndpoint
    public final void init(String defaultBaseUrl, IndexProvider indexProvider) {
        Intrinsics.checkNotNullParameter(defaultBaseUrl, "defaultBaseUrl");
        Intrinsics.checkNotNullParameter(indexProvider, "indexProvider");
        this.f13953b = defaultBaseUrl;
        this.f13954c = indexProvider;
        this.f13952a.add(defaultBaseUrl);
        this.f13952a.addAll(CollectionsKt.distinct(b()));
        int i10 = 0;
        for (Object obj : this.f13952a) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            LogExtKt.logInternal$default("@AppodealEndpointImpl", "Generated index: " + i10 + ", host: " + ((String) obj), null, 4, null);
            i10 = i11;
        }
    }

    @Override // com.appodeal.ads.network.AppodealEndpoint
    public final void notifySuccessEndpoint() {
        this.f13954c.saveIndex();
    }
}
