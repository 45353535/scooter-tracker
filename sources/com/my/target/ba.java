package com.my.target;

import android.content.Context;
import com.my.target.ba;
import com.my.target.v8;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f59295a;

    static {
        if (w5.a()) {
            f59295a |= 2;
        }
        if (b()) {
            f59295a |= 1;
        }
    }

    public static void b(final Context context) {
        f0.e(new Runnable() { // from class: k5.i
            @Override // java.lang.Runnable
            public final void run() {
                v8.a(context).b(ba.f59295a);
            }
        });
    }

    public static void c() {
        f59295a |= 8;
    }

    public static void d() {
        f59295a |= 4;
    }

    public static void e() {
        f59295a |= 64;
    }

    public static void f() {
        f59295a |= 128;
    }

    public static void g() {
        f59295a &= -3;
    }

    public static int a() {
        return f59295a;
    }

    public static void b(boolean z10) {
        if (z10) {
            f59295a |= 32;
        } else {
            f59295a &= -33;
        }
    }

    public static void a(boolean z10) {
        if (z10) {
            f59295a |= 16;
        } else {
            f59295a &= -17;
        }
    }

    public static boolean b() {
        try {
            try {
                Class.forName("com.unity3d.player.UnityPlayerActivity");
                return true;
            } catch (Throwable unused) {
                Runtime.getRuntime().loadLibrary("unity");
                return true;
            }
        } catch (Throwable unused2) {
            return false;
        }
    }
}
