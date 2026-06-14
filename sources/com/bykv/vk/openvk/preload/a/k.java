package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.i;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k<IN, OUT> extends d<IN, OUT> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private IN f15696d;

    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in) throws Throwable {
        this.f15696d = in;
        try {
            return bVar.a(a());
        } catch (i.a e10) {
            return a((b) bVar, e10.getCause());
        } catch (Throwable th2) {
            return a((b) bVar, th2);
        }
    }

    protected abstract boolean a(Throwable th2);

    protected final IN g() {
        return this.f15696d;
    }

    private Object a(b<OUT> bVar, Throwable th2) throws Throwable {
        while (a(th2)) {
            try {
                return bVar.a(a());
            } catch (i.a e10) {
                th2 = e10.getCause();
            } catch (Throwable th3) {
                th2 = th3;
            }
        }
        throw th2;
    }

    protected OUT a() {
        return this.f15696d;
    }
}
