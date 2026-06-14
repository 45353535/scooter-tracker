package yads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class w31 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f117302b;

    public w31(Object[] objArr) {
        this.f117302b = objArr;
    }

    public Object readResolve() {
        return y31.b(this.f117302b);
    }
}
