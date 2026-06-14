package com.startapp.sdk.internal;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class vf implements SharedPreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f65403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c5 f65404b;

    public vf(SharedPreferences sharedPreferences) {
        this.f65403a = sharedPreferences;
        this.f65404b = null;
    }

    @Override // android.content.SharedPreferences
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final uf edit() {
        return new uf(this.f65403a.edit(), this.f65403a.getAll(), this.f65404b);
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        try {
            return this.f65403a.contains(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        try {
            return this.f65403a.getAll();
        } catch (Throwable unused) {
            return Collections.EMPTY_MAP;
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z10) {
        try {
            return this.f65403a.getBoolean(str, z10);
        } catch (Throwable unused) {
            return z10;
        }
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f10) {
        try {
            return this.f65403a.getFloat(str, f10);
        } catch (Throwable unused) {
            return f10;
        }
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i10) {
        try {
            return this.f65403a.getInt(str, i10);
        } catch (Throwable unused) {
            return i10;
        }
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j10) {
        try {
            return this.f65403a.getLong(str, j10);
        } catch (Throwable unused) {
            return j10;
        }
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        try {
            return this.f65403a.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        try {
            return this.f65403a.getStringSet(str, set);
        } catch (Throwable unused) {
            return set;
        }
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f65403a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f65403a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public vf(SharedPreferences sharedPreferences, c5 c5Var) {
        this.f65403a = sharedPreferences;
        this.f65404b = c5Var;
    }
}
