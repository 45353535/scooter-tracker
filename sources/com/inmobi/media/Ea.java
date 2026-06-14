package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Ea {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f36782b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f36783a;

    public Ea(Context context, String str) {
        this.f36783a = context.getSharedPreferences(str, 0);
    }

    public static void a(Ea ea2, String key, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorEdit = ea2.f36783a.edit();
        editorEdit.putBoolean(key, z10);
        editorEdit.apply();
    }

    public final boolean a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f36783a.contains(key)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = this.f36783a.edit();
        editorEdit.remove(key);
        editorEdit.apply();
        return true;
    }

    public final void a(String key, String str, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorEdit = this.f36783a.edit();
        editorEdit.putString(key, str);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public final void a(String key, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorEdit = this.f36783a.edit();
        editorEdit.putInt(key, i10);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public final void a(String key, long j10, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorEdit = this.f36783a.edit();
        editorEdit.putLong(key, j10);
        if (z10) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }
}
