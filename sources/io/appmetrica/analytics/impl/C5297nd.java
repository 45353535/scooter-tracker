package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5297nd extends Wg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f77835b;

    public C5297nd(@NotNull C5058e5 c5058e5) {
        super(c5058e5);
        String strB = c5058e5.b().b();
        strB = strB == null ? "empty" : strB;
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        String.format("[ModulesEventHandler-%s]", Arrays.copyOf(new Object[]{strB}, 1));
        LinkedHashMap linkedHashMapA = C5468ua.k().o().a(strB);
        ArrayList arrayList = new ArrayList(linkedHashMapA.size());
        for (Map.Entry entry : linkedHashMapA.entrySet()) {
            arrayList.add(TuplesKt.to(entry.getValue(), new C4963ad(c5058e5, (String) entry.getKey())));
        }
        this.f77835b = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(@NotNull W5 w52) {
        if (this.f76636a.f77081t.c()) {
            ArrayList<Pair> arrayList = this.f77835b;
            if (!androidx.activity.s.a(arrayList) || !arrayList.isEmpty()) {
                for (Pair pair : arrayList) {
                    ModuleServiceEventHandler moduleServiceEventHandler = (ModuleServiceEventHandler) pair.component1();
                    C4963ad c4963ad = (C4963ad) pair.component2();
                    if (moduleServiceEventHandler.handle(new C5041dd(c4963ad.f76809b, c4963ad.f76808a, new C5015cd(c4963ad.f76811d, c4963ad.f76810c, w52)), w52)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
