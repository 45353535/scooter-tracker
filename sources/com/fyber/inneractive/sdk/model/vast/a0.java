package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.w1;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f21160i;

    public a0() {
        this.f21198f = 1;
    }

    public static a0 c(Node node) {
        a0 a0Var = new a0();
        super.b(node);
        a0Var.f21160i = w1.a(w1.d(node, com.taurusx.tax.f.n.f66007g));
        return a0Var;
    }
}
