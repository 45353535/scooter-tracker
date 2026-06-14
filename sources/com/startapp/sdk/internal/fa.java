package com.startapp.sdk.internal;

import java.util.Collection;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public final class fa implements ue {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fa f64492b = new fa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f64493a;

    public fa(Set languages) {
        Intrinsics.checkNotNullParameter(languages, "languages");
        this.f64493a = languages;
    }

    @Override // com.startapp.sdk.internal.ue
    public final JSONArray a() {
        if (this.f64493a != null) {
            return new JSONArray((Collection) this.f64493a);
        }
        return null;
    }

    @Override // com.startapp.sdk.internal.ue
    public final String b() {
        Set set = this.f64493a;
        if (set == null) {
            return null;
        }
        WeakHashMap weakHashMap = vi.f65408a;
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        for (Object obj : set) {
            if (z10) {
                sb2.append(";");
            }
            sb2.append(obj);
            z10 = true;
        }
        return sb2.toString();
    }

    public fa() {
        this.f64493a = null;
    }
}
