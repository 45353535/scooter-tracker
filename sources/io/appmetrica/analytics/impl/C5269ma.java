package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5269ma implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC5447te f77755a;

    public C5269ma() {
        this(new Wl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5505vm fromModel(@NonNull C5412s4 c5412s4) {
        C5505vm c5505vm = new C5505vm();
        c5505vm.f78467b = c5412s4.f78209b;
        c5505vm.f78466a = c5412s4.f78208a;
        c5505vm.f78468c = c5412s4.f78210c;
        c5505vm.f78469d = c5412s4.f78211d;
        c5505vm.f78470e = c5412s4.f78212e;
        c5505vm.f78471f = this.f77755a.a(c5412s4.f78213f);
        return c5505vm;
    }

    public C5269ma(Wl wl) {
        this.f77755a = wl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5412s4 toModel(@NonNull C5505vm c5505vm) {
        C5363q4 c5363q4 = new C5363q4();
        c5363q4.f78029d = c5505vm.f78469d;
        c5363q4.f78028c = c5505vm.f78468c;
        c5363q4.f78027b = c5505vm.f78467b;
        c5363q4.f78026a = c5505vm.f78466a;
        c5363q4.f78030e = c5505vm.f78470e;
        c5363q4.f78031f = this.f77755a.a(c5505vm.f78471f);
        return new C5412s4(c5363q4);
    }
}
