package com.facebook.internal;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;

/* JADX INFO: loaded from: classes7.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f19980a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f19981b = v.class.getName();

    private v() {
    }

    public static final String a() {
        return "v16.0";
    }

    public static final String b() {
        a1 a1Var = a1.f93282a;
        String str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{com.facebook.s.u()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    public static final String c() {
        a1 a1Var = a1.f93282a;
        String str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{com.facebook.s.w()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    public static final String d(String subdomain) {
        Intrinsics.checkNotNullParameter(subdomain, "subdomain");
        a1 a1Var = a1.f93282a;
        String str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{subdomain}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    public static final String e() {
        a1 a1Var = a1.f93282a;
        String str = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{com.facebook.s.w()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }
}
