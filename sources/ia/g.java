package ia;

import j$.util.Objects;
import lb.l;
import lb.t;

/* JADX INFO: loaded from: classes12.dex */
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f73976a = new a();

    class a implements g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final lb.h f73977b = new lb.h();

        a() {
        }

        @Override // ia.g
        public boolean a(io.bidmachine.media3.common.a aVar) {
            String str = aVar.f80561o;
            return this.f73977b.a(aVar) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }

        @Override // ia.g
        public l b(io.bidmachine.media3.common.a aVar) {
            String str = aVar.f80561o;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new mb.a(str, aVar.J, 16000L);
                    case "application/cea-708":
                        return new mb.c(aVar.J, aVar.f80564r);
                }
            }
            if (!this.f73977b.a(aVar)) {
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
            }
            t tVarC = this.f73977b.c(aVar);
            return new b(tVarC.getClass().getSimpleName() + "Decoder", tVarC);
        }
    }

    boolean a(io.bidmachine.media3.common.a aVar);

    l b(io.bidmachine.media3.common.a aVar);
}
