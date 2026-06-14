package com.mbridge.msdk.config.component.common.express.operator.parts;

import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.express.e;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f46748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private e f46749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.express.node.d f46750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a f46751d;

    public b(d dVar, e eVar, com.mbridge.msdk.config.component.common.express.node.d dVar2, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        this.f46750c = dVar2;
        this.f46748a = dVar;
        this.f46749b = eVar;
        this.f46751d = aVar;
    }

    public void a(Object obj) {
        this.f46751d.a("this", obj);
    }

    @Override // java.util.concurrent.Callable
    public Object call() throws Exception {
        return this.f46750c.a(this.f46748a, this.f46749b, this.f46751d);
    }
}
