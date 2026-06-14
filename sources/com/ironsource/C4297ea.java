package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.ironsource.ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4297ea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f43002a = "_preferences";

    private C4297ea() {
    }

    public static String a(Context context, String str) {
        if (context == null) {
            return str;
        }
        return context.getPackageName() + f43002a;
    }

    public static void b(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putString(str2, str3);
        editorEdit.apply();
    }

    public static String a(Context context, String str, String str2, String str3) {
        return context == null ? str3 : context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    public static String a(Context context, String str, String str2) {
        return a(context, a(context, ""), str, str2);
    }

    public static boolean a(Context context, String str, String str2, boolean z10) {
        return context == null ? z10 : context.getSharedPreferences(str, 0).getBoolean(str2, z10);
    }

    static int a(Context context, String str, String str2, int i10) {
        return context == null ? i10 : context.getSharedPreferences(str, 0).getInt(str2, i10);
    }

    public static int a(Context context, String str, int i10) {
        return a(context, a(context, ""), str, i10);
    }
}
