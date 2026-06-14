package com.startapp.sdk.internal;

import java.util.LinkedHashSet;
import java.util.Locale;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes11.dex */
public final class ac implements ue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f64265a;

    public ac(LinkedHashSet linkedHashSet) {
        this.f64265a = linkedHashSet;
    }

    @Override // com.startapp.sdk.internal.ue
    public final JSONArray a() {
        LinkedHashSet<Locale> linkedHashSet = this.f64265a;
        JSONArray jSONArray = new JSONArray();
        for (Locale locale : linkedHashSet) {
            if (locale != null) {
                jSONArray.put(locale.toString());
            }
        }
        return jSONArray;
    }

    @Override // com.startapp.sdk.internal.ue
    public final String b() {
        return bc.a(null, this.f64265a, ';');
    }
}
