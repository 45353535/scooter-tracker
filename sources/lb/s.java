package lb;

import com.google.common.collect.ImmutableList;
import j$.util.Objects;
import lb.t;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class s {
    public static k a(t tVar, byte[] bArr, int i10, int i11) {
        final ImmutableList.Builder builder = ImmutableList.builder();
        t.b bVar = t.b.f94120c;
        Objects.requireNonNull(builder);
        tVar.a(bArr, i10, i11, bVar, new q9.l() { // from class: lb.r
            @Override // q9.l
            public final void accept(Object obj) {
                builder.add((e) obj);
            }
        });
        return new g(builder.build());
    }

    public static void b(t tVar) {
    }
}
