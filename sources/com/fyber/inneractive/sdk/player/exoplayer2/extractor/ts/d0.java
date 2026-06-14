package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f22446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f22447c;

    public d0(int i10, String str, ArrayList arrayList, byte[] bArr) {
        this.f22445a = str;
        this.f22446b = arrayList == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList);
        this.f22447c = bArr;
    }
}
