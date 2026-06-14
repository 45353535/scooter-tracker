package yads;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes4.dex */
public final class ou0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f114417a = new SparseBooleanArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f114418b;

    public final ou0 a(int i10) {
        if (this.f114418b) {
            throw new IllegalStateException();
        }
        this.f114417a.append(i10, true);
        return this;
    }

    public final pu0 a() {
        if (!this.f114418b) {
            this.f114418b = true;
            return new pu0(this.f114417a);
        }
        throw new IllegalStateException();
    }
}
