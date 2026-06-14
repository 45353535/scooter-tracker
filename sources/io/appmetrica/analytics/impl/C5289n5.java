package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5289n5 implements Do {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f77807a;

    public C5289n5(@NotNull List<? extends Pair<String, ? extends Do>> list) {
        this.f77807a = list;
    }

    @Override // io.appmetrica.analytics.impl.Do
    @Nullable
    public final String a() {
        Iterator it = this.f77807a.iterator();
        while (it.hasNext()) {
            String strA = ((Do) ((Pair) it.next()).getSecond()).a();
            if (strA != null && strA.length() > 0) {
                return strA;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final void a(@NotNull String str) {
        Iterator it = this.f77807a.iterator();
        while (it.hasNext()) {
            ((Do) ((Pair) it.next()).getSecond()).a(str);
        }
    }
}
