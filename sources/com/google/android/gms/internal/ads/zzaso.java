package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
final class zzaso implements Comparator {
    zzaso() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((byte[]) obj).length - ((byte[]) obj2).length;
    }
}
