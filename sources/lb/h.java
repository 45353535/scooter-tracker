package lb;

import j$.util.Objects;
import lb.t;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements t.a {
    @Override // lb.t.a
    public boolean a(io.bidmachine.media3.common.a aVar) {
        String str = aVar.f80561o;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // lb.t.a
    public int b(io.bidmachine.media3.common.a aVar) {
        String str = aVar.f80561o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }

    @Override // lb.t.a
    public t c(io.bidmachine.media3.common.a aVar) {
        String str = aVar.f80561o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new nb.a(aVar.f80564r);
                case "application/pgs":
                    return new ob.a();
                case "application/x-mp4-vtt":
                    return new ub.a();
                case "text/vtt":
                    return new ub.g();
                case "application/x-quicktime-tx3g":
                    return new sb.a(aVar.f80564r);
                case "text/x-ssa":
                    return new pb.b(aVar.f80564r);
                case "application/vobsub":
                    return new tb.a(aVar.f80564r);
                case "application/x-subrip":
                    return new qb.a();
                case "application/ttml+xml":
                    return new rb.d();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }
}
