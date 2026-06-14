package yads;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class j01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f112208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f112209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f112210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InputStream f112211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f112212e;

    public j01(int i10, ArrayList arrayList, int i11, n01 n01Var) {
        this.f112208a = i10;
        this.f112209b = arrayList;
        this.f112210c = i11;
        this.f112211d = n01Var;
        this.f112212e = null;
    }

    public j01(int i10, List list, byte[] bArr) {
        this.f112208a = i10;
        this.f112209b = list;
        this.f112210c = bArr.length;
        this.f112212e = bArr;
        this.f112211d = null;
    }
}
