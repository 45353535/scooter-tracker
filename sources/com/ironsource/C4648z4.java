package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.z4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4648z4 implements C4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f45960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences.Editor f45961b;

    public C4648z4(@NotNull Context context, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        SharedPreferences sharedPreferences = context.getSharedPreferences(fileName, 0);
        this.f45960a = sharedPreferences;
        this.f45961b = sharedPreferences.edit();
    }

    @Override // com.ironsource.C4
    @Nullable
    public String a(@NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return this.f45960a.getString(key, str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ironsource.C4
    @NotNull
    public Map<String, ?> allData() {
        Map<String, ?> all = this.f45960a.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "sharedPreferences.all");
        return all;
    }

    @Override // com.ironsource.C4
    public void b(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f45961b.putString(key, value).apply();
    }

    @Override // com.ironsource.C4
    public void a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f45961b.remove(key).apply();
    }
}
