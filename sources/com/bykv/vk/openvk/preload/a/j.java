package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.i;
import com.bykv.vk.openvk.preload.a.l;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class j<IN, OUT> extends l<IN, OUT> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f15695d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in) throws Throwable {
        new m(bVar);
        this.f15695d = a(in);
        l.a aVar = a().get(this.f15695d);
        while (aVar != null) {
            List<h> list = aVar.f15698a;
            try {
                Object objA = c.a(list, bVar.f15691a, this).a(in);
                return !l.a(list) ? objA : bVar.a(objA);
            } catch (i.a e10) {
                Throwable cause = e10.getCause();
                new m(bVar);
                this.f15695d = a(in, cause, this.f15695d);
                aVar = a().get(this.f15695d);
            } catch (Throwable th2) {
                new m(bVar);
                this.f15695d = a(in, th2, this.f15695d);
                aVar = a().get(this.f15695d);
            }
        }
        throw new IllegalArgumentException("can not found branch，branch name is：" + this.f15695d);
    }

    protected abstract String a(IN in);

    protected abstract String a(IN in, Throwable th2, String str);
}
