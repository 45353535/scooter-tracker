package com.facebook.internal;

import android.util.Log;
import com.facebook.d0;
import com.taurusx.tax.y.z.w.s;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f19964e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap f19965f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f19966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StringBuilder f19968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19969d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final synchronized String f(String str) {
            String strW;
            strW = str;
            for (Map.Entry entry : r.f19965f.entrySet()) {
                strW = StringsKt.W(strW, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            return strW;
        }

        public final void a(d0 behavior, int i10, String tag, String string) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(string, "string");
            if (com.facebook.s.F(behavior)) {
                String strF = f(string);
                if (!StringsKt.a0(tag, "FacebookSDK.", false, 2, null)) {
                    tag = "FacebookSDK." + tag;
                }
                Log.println(i10, tag, strF);
                if (behavior == d0.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        public final void b(d0 behavior, String tag, String string) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(string, "string");
            a(behavior, 3, tag, string);
        }

        public final void c(d0 behavior, String tag, String format, Object... args) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (com.facebook.s.F(behavior)) {
                a1 a1Var = a1.f93282a;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String str = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                a(behavior, 3, tag, str);
            }
        }

        public final synchronized void d(String accessToken) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            if (!com.facebook.s.F(d0.INCLUDE_ACCESS_TOKENS)) {
                e(accessToken, "ACCESS_TOKEN_REMOVED");
            }
        }

        public final synchronized void e(String original, String replace) {
            Intrinsics.checkNotNullParameter(original, "original");
            Intrinsics.checkNotNullParameter(replace, "replace");
            r.f19965f.put(original, replace);
        }

        private a() {
        }
    }

    public r(d0 behavior, String tag) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f19969d = 3;
        this.f19966a = behavior;
        this.f19967b = "FacebookSDK." + a0.h(tag, s.z.f67720z);
        this.f19968c = new StringBuilder();
    }

    private final boolean g() {
        return com.facebook.s.F(this.f19966a);
    }

    public final void b(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (g()) {
            this.f19968c.append(string);
        }
    }

    public final void c(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        if (g()) {
            StringBuilder sb2 = this.f19968c;
            a1 a1Var = a1.f93282a;
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String str = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            sb2.append(str);
        }
    }

    public final void d(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        c("  %s:\t%s\n", key, value);
    }

    public final void e() {
        String string = this.f19968c.toString();
        Intrinsics.checkNotNullExpressionValue(string, "contents.toString()");
        f(string);
        this.f19968c = new StringBuilder();
    }

    public final void f(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        f19964e.a(this.f19966a, this.f19969d, this.f19967b, string);
    }
}
