package com.bytedance.adsdk.ud;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class fs<V> {
    private final V qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final Throwable f15984ud;

    public fs(V v10) {
        this.qdl = v10;
        this.f15984ud = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs)) {
            return false;
        }
        fs fsVar = (fs) obj;
        if (qdl() != null && qdl().equals(fsVar.qdl())) {
            return true;
        }
        if (ud() == null || fsVar.ud() == null) {
            return false;
        }
        return ud().toString().equals(ud().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{qdl(), ud()});
    }

    public V qdl() {
        return this.qdl;
    }

    public Throwable ud() {
        return this.f15984ud;
    }

    public fs(Throwable th2) {
        this.f15984ud = th2;
        this.qdl = null;
    }
}
