package com.ironsource;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.File;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.y7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC4634y7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f45876a = "uuidEnabled";

    /* JADX INFO: renamed from: com.ironsource.y7$a */
    public interface a {
        void a(Context context, long j10);
    }

    String A(Context context);

    File B(Context context);

    boolean C(Context context);

    int D(Context context);

    float E(Context context);

    String F(Context context);

    String G(Context context);

    List<ApplicationInfo> H(Context context);

    @Nullable
    String I(Context context);

    boolean J(Context context);

    int K(Context context);

    @Nullable
    String L(Context context);

    String M(Context context);

    int N(Context context);

    long a();

    long a(String str);

    @Nullable
    Long a(@Nullable ActivityManager.MemoryInfo memoryInfo);

    boolean a(Activity activity);

    boolean a(Context context);

    int b();

    @Nullable
    Boolean b(@Nullable ActivityManager.MemoryInfo memoryInfo);

    @Nullable
    String b(Context context);

    int c();

    @Nullable
    Long c(@Nullable ActivityManager.MemoryInfo memoryInfo);

    String c(Context context);

    String d();

    String d(Context context);

    int e();

    boolean e(Context context);

    File f(Context context);

    String f();

    long g();

    boolean g(Context context);

    long h();

    boolean h(Context context);

    String i();

    String i(Context context);

    File j(Context context);

    boolean j();

    int k();

    int k(Context context);

    File l(Context context);

    String l();

    int m();

    String m(Context context);

    @Nullable
    ActivityManager.MemoryInfo n(Context context);

    boolean n();

    int o();

    int o(Context context);

    boolean p();

    boolean p(Context context);

    long q(Context context);

    String q();

    float r();

    String r(Context context);

    int s(Context context);

    String s();

    int t(Context context);

    @Nullable
    String t();

    String u(Context context);

    String v(Context context);

    boolean w(Context context);

    String x(Context context);

    String y(Context context);

    int z(Context context);
}
