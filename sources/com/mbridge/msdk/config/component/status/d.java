package com.mbridge.msdk.config.component.status;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f47256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f47257b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<com.mbridge.msdk.config.component.status.a> f47258c = new ArrayList<>(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    SharedPreferences.OnSharedPreferenceChangeListener f47259d = new a();

    class a implements SharedPreferences.OnSharedPreferenceChangeListener {
        a() {
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            if (d.this.f47256a == null || !d.this.f47256a.contains(str)) {
                return;
            }
            com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
            bVar.b("AppPreferencesChanged");
            HashMap map = new HashMap();
            try {
                Object obj = d.this.f47256a.getAll().get(str);
                map.put("Key", str);
                map.put("Value", obj);
            } catch (Exception unused) {
                map.put("Key", str);
                map.put("Value", d.this.f47256a.getString(str, ""));
            }
            if (d.this.f47257b.isEmpty()) {
                bVar.a(map);
                d.this.a(bVar);
            } else if (d.this.f47257b.contains(str)) {
                bVar.a(map);
                d.this.a(bVar);
            }
        }
    }

    public d(String str) {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD == null) {
            return;
        }
        Context applicationContext = contextD.getApplicationContext();
        if (TextUtils.isEmpty(str)) {
            str = applicationContext.getPackageName() + "_preferences";
        }
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(str, 0);
        this.f47256a = sharedPreferences;
        if (sharedPreferences != null) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.f47259d);
        }
    }

    public void b(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.f47258c.remove(aVar);
        }
    }

    public void a(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.f47258c.add(aVar);
        }
    }

    public void a(List<String> list) {
        if (list != null) {
            this.f47257b.addAll(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.config.component.base.b bVar) {
        Iterator<com.mbridge.msdk.config.component.status.a> it = this.f47258c.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }
}
