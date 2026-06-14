package yads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class c41 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f109210b;

    public c41(Object[] objArr) {
        this.f109210b = objArr;
    }

    public Object readResolve() {
        Object[] objArr = this.f109210b;
        int length = objArr.length;
        return length != 0 ? length != 1 ? d41.b(objArr.length, (Object[]) objArr.clone()) : new jx2(objArr[0]) : tk2.f116278j;
    }
}
