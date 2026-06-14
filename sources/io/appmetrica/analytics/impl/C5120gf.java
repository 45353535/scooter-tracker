package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5120gf implements Cdo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f77259a;

    public C5120gf(@NotNull Cif cif) {
        boolean z10;
        List<C5146hf> list = cif.f77434b;
        if ((list instanceof Collection) && list.isEmpty()) {
            z10 = true;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C5146hf) it.next()).f77308c == Y7.f76695c) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
        }
        this.f77259a = z10;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C5146hf> invoke(@NotNull List<? extends C5146hf> list, @NotNull C5498vf c5498vf) {
        C5146hf c5146hf = new C5146hf(c5498vf.f78452a, c5498vf.f78453b, c5498vf.f78456e);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C5146hf) it.next()).f77308c == c5498vf.f78456e) {
                    if (c5146hf.f77308c == Y7.f76695c && this.f77259a) {
                        return CollectionsKt.plus((Collection<? extends C5146hf>) list, c5146hf);
                    }
                    return null;
                }
            }
        }
        return CollectionsKt.plus((Collection<? extends C5146hf>) list, c5146hf);
    }
}
