package ib;

import com.google.common.primitives.ImmutableIntArray;
import oa.q0;

/* JADX INFO: loaded from: classes12.dex */
public final class x implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f74175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableIntArray f74176b;

    public x(int i10, int[] iArr) {
        this.f74175a = i10;
        this.f74176b = iArr != null ? ImmutableIntArray.copyOf(iArr) : ImmutableIntArray.of();
    }
}
