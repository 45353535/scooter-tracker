package com.ironsource;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class Nf extends AbstractC4303f<a> {

    public interface a {
        void a();
    }

    public Nf(long j10) {
        super(j10);
    }

    public final void a(@Nullable a aVar) {
        a(aVar);
    }

    @Override // com.ironsource.AbstractC4303f
    protected void b() {
        a aVar = (a) this.f43065d;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void e() {
        c();
    }
}
