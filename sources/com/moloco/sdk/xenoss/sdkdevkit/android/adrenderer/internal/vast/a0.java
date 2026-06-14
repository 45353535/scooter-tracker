package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.ironsource.X1;
import com.moloco.sdk.service_locator.b;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f57394a = lf.i.a(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.z
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return a0.a();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Regex f57395b = new Regex("\\[ERRORCODE]");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Regex f57396c = new Regex("\\[CONTENTPLAYHEAD]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Regex f57397d = new Regex("\\[CACHEBUSTING]");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Regex f57398e = new Regex("\\[ASSETURI]");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Regex f57399f = new Regex("\\[[^]]*]");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Regex f57400g = new Regex("\\[MEDIAPLAYHEAD]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Regex f57401h = new Regex("\\[ADPLAYHEAD]");

    public static final y a() {
        return new y(b.i.f55834a.c());
    }

    public static final String b(int i10) {
        return f(i10);
    }

    public static final String c(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception unused) {
            return "";
        }
    }

    public static final x e() {
        return k();
    }

    public static final String f(int i10) {
        long j10 = i10;
        a1 a1Var = a1.f93282a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        String str = String.format("%02d:%02d:%02d.%03d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(j10)), Long.valueOf(timeUnit.toMinutes(j10) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j10) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j10 % ((long) 1000))}, 4));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final String g(String str, Integer num, Integer num2, String str2, String str3) {
        if (num != null) {
            str = f57395b.replace(str, num.toString());
        }
        if (num2 != null) {
            str = f57400g.replace(f57401h.replace(f57396c.replace(str, f(num2.intValue())), b(num2.intValue())), i(num2.intValue()));
        }
        if (str2 != null) {
            str = f57398e.replace(str, c(str2));
        }
        if (str3 != null) {
            str = f57397d.replace(str, str3);
        }
        return f57399f.replace(str, "");
    }

    public static final String i(int i10) {
        return X1.f42014f;
    }

    public static final String j() {
        a1 a1Var = a1.f93282a;
        String str = String.format("%08d", Arrays.copyOf(new Object[]{Integer.valueOf(kotlin.random.d.f93341b.k(1, 99999999))}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final y k() {
        return (y) f57394a.getValue();
    }
}
