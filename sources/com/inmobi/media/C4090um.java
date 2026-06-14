package com.inmobi.media;

import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: renamed from: com.inmobi.media.um, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4090um implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        System.out.println((Object) (((C3965pl) pair.getFirst()).f39300c + " " + pair.getSecond()));
        Double d10 = (Double) pair.getSecond();
        Pair pair2 = (Pair) obj2;
        System.out.println((Object) (((C3965pl) pair2.getFirst()).f39300c + " " + pair2.getSecond()));
        return mf.a.d(d10, (Double) pair2.getSecond());
    }
}
