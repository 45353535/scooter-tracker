package yads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class w63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f117326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f117327c;

    public w63(int i10, String str, ArrayList arrayList, byte[] bArr) {
        this.f117325a = str;
        this.f117326b = arrayList == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList);
        this.f117327c = bArr;
    }
}
