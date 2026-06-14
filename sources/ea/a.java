package ea;

import cb.h;

/* JADX INFO: loaded from: classes12.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f69000a = new C0866a();

    /* JADX INFO: renamed from: ea.a$a, reason: collision with other inner class name */
    class C0866a implements a {
        C0866a() {
        }

        @Override // ea.a
        public boolean a(io.bidmachine.media3.common.a aVar) {
            String str = aVar.f80561o;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // ea.a
        public xa.a b(io.bidmachine.media3.common.a aVar) {
            String str = aVar.f80561o;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new ya.b();
                    case "application/x-icy":
                        return new bb.a();
                    case "application/id3":
                        return new h();
                    case "application/x-emsg":
                        return new za.b();
                    case "application/x-scte35":
                        return new eb.c();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean a(io.bidmachine.media3.common.a aVar);

    xa.a b(io.bidmachine.media3.common.a aVar);
}
