package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q31 extends r31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f114865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f114866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f114867c;

    public q31() {
        uw.a(4, "initialCapacity");
        this.f114865a = new Object[4];
        this.f114866b = 0;
    }

    public final void a(int i10) {
        Object[] objArr = this.f114865a;
        if (objArr.length < i10) {
            this.f114865a = Arrays.copyOf(objArr, r31.a(objArr.length, i10));
            this.f114867c = false;
        } else if (this.f114867c) {
            this.f114865a = (Object[]) objArr.clone();
            this.f114867c = false;
        }
    }
}
