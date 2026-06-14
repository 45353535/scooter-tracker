package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C4500q8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class W4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, V4> f41940a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, V4> f41941b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, V4> f41942c = new LinkedHashMap();

    private Map<String, V4> b(C4500q8.e eVar) {
        if (eVar.name().equalsIgnoreCase(C4500q8.e.RewardedVideo.name())) {
            return this.f41940a;
        }
        if (eVar.name().equalsIgnoreCase(C4500q8.e.Interstitial.name())) {
            return this.f41941b;
        }
        if (eVar.name().equalsIgnoreCase(C4500q8.e.Banner.name())) {
            return this.f41942c;
        }
        return null;
    }

    public Collection<V4> a(C4500q8.e eVar) {
        Map<String, V4> mapB = b(eVar);
        return mapB != null ? mapB.values() : new ArrayList();
    }

    public V4 a(C4500q8.e eVar, String str) {
        Map<String, V4> mapB;
        if (TextUtils.isEmpty(str) || (mapB = b(eVar)) == null) {
            return null;
        }
        return mapB.get(str);
    }

    private void a(C4500q8.e eVar, String str, V4 v42) {
        Map<String, V4> mapB;
        if (TextUtils.isEmpty(str) || v42 == null || (mapB = b(eVar)) == null) {
            return;
        }
        mapB.put(str, v42);
    }

    public void b(C4500q8.e eVar, String str) {
        Map<String, V4> mapB;
        V4 v4Remove;
        if (TextUtils.isEmpty(str) || (mapB = b(eVar)) == null || (v4Remove = mapB.remove(str)) == null) {
            return;
        }
        v4Remove.a();
    }

    public V4 a(C4500q8.e eVar, L9 l92) {
        V4 v42 = new V4(l92);
        a(eVar, l92.e(), v42);
        return v42;
    }

    public V4 a(C4500q8.e eVar, String str, Map<String, String> map, Ec ec2) {
        V4 v42 = new V4(str, str, map, ec2);
        a(eVar, str, v42);
        return v42;
    }
}
