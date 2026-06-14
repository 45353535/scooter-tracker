package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.e;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    static <IN> b<IN> a(List<h> list, e eVar, d dVar) {
        if (list == null) {
            throw new IllegalArgumentException("interceptors == null !");
        }
        if (eVar == null) {
            eVar = new e.a();
        }
        return new i(DesugarCollections.unmodifiableList(new ArrayList(list)), 0, eVar, dVar);
    }

    public static <IN> b<IN> a(List<h> list, e eVar) {
        return a(list, eVar, null);
    }
}
