package com.skydoves.balloon;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f63604a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile d f63605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SharedPreferences f63606c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(Context context) {
            d dVar;
            Intrinsics.checkNotNullParameter(context, "context");
            d dVar2 = d.f63605b;
            if (dVar2 != null) {
                return dVar2;
            }
            synchronized (this) {
                dVar = d.f63605b;
                if (dVar == null) {
                    dVar = new d(null);
                    d.f63605b = dVar;
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.skydoves.balloon", 0);
                    Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…n\", Context.MODE_PRIVATE)");
                    d.f63606c = sharedPreferences;
                }
            }
            return dVar;
        }

        public final String b(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return "SHOWED_UP" + name;
        }

        private a() {
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int d(String str) {
        SharedPreferences sharedPreferences = f63606c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferenceManager");
            sharedPreferences = null;
        }
        return sharedPreferences.getInt(f63604a.b(str), 0);
    }

    private final void e(String str, int i10) {
        SharedPreferences sharedPreferences = f63606c;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferenceManager");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        editor.putInt(f63604a.b(str), i10);
        editor.apply();
    }

    public final void f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        e(name, d(name) + 1);
    }

    public final boolean g(String name, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        return d(name) < i10;
    }

    private d() {
    }
}
