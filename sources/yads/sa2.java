package yads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class sa2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f115730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f115731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f115732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f115733d;

    public sa2(String str, long j10, ArrayList arrayList, List list) {
        this.f115730a = str;
        this.f115731b = j10;
        this.f115732c = DesugarCollections.unmodifiableList(arrayList);
        this.f115733d = DesugarCollections.unmodifiableList(list);
    }
}
