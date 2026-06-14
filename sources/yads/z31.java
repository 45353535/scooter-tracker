package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class z31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f118533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f118534b = 0;

    public z31(int i10) {
        this.f118533a = new Object[i10 * 2];
    }

    public final sk2 a() {
        return sk2.a(this.f118534b, this.f118533a);
    }

    public final void a(int i10) {
        int i11 = i10 * 2;
        Object[] objArr = this.f118533a;
        if (i11 > objArr.length) {
            this.f118533a = Arrays.copyOf(objArr, r31.a(objArr.length, i11));
        }
    }

    public final z31 a(Object obj, Object obj2) {
        a(this.f118534b + 1);
        uw.a(obj, obj2);
        Object[] objArr = this.f118533a;
        int i10 = this.f118534b;
        int i11 = i10 * 2;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        this.f118534b = i10 + 1;
        return this;
    }
}
