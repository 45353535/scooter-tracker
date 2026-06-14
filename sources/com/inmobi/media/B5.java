package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes9.dex */
public final class B5 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H5 f36611a;

    public B5(H5 h52) {
        this.f36611a = h52;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f36611a) {
            try {
                H5 h52 = this.f36611a;
                if (h52.f36989l == null) {
                    return null;
                }
                while (h52.f36988k > h52.f36987j) {
                    h52.d((String) ((Map.Entry) h52.f36986i.entrySet().iterator().next()).getKey());
                }
                H5 h53 = this.f36611a;
                int i10 = h53.f36990m;
                if (i10 >= 2000 && i10 >= h53.f36986i.size()) {
                    this.f36611a.c();
                    this.f36611a.f36990m = 0;
                }
                return null;
            } finally {
            }
        }
    }
}
