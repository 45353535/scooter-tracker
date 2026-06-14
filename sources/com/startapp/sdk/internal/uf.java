package com.startapp.sdk.internal;

import android.content.SharedPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class uf implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences.Editor f65346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f65347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c5 f65348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f65349d;

    public uf(SharedPreferences.Editor editor, Map map, c5 c5Var) {
        this.f65346a = editor;
        this.f65347b = map;
        this.f65348c = c5Var;
    }

    public final void a(String str, Object obj) {
        if (this.f65348c == null || vi.a(this.f65347b.get(str), obj)) {
            return;
        }
        this.f65349d = true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        this.f65346a.apply();
        c5 c5Var = this.f65348c;
        if (c5Var == null || !this.f65349d) {
            return;
        }
        this.f65349d = false;
        pg.f65112d.a(c5Var.f64337a.f64406a, MetaDataRequest$RequestReason.EXTRAS);
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        if (!this.f65347b.isEmpty()) {
            this.f65349d = true;
        }
        this.f65346a.clear();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        return this.f65346a.commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z10) {
        a(str, Boolean.valueOf(z10));
        this.f65346a.putBoolean(str, z10);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f10) {
        a(str, Float.valueOf(f10));
        this.f65346a.putFloat(str, f10);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i10) {
        a(str, Integer.valueOf(i10));
        this.f65346a.putInt(str, i10);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j10) {
        a(str, Long.valueOf(j10));
        this.f65346a.putLong(str, j10);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        this.f65346a.putString(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(str, set);
        this.f65346a.putStringSet(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        if (this.f65347b.containsKey(str)) {
            this.f65349d = true;
        }
        this.f65346a.remove(str);
        return this;
    }
}
