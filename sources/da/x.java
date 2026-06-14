package da;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public interface x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f68600a = new x() { // from class: da.u
        @Override // da.x
        public final List getDecoderInfos(String str, boolean z10, boolean z11) {
            return c0.k(str, z10, z11);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f68601b = new x() { // from class: da.v
        @Override // da.x
        public final List getDecoderInfos(String str, boolean z10, boolean z11) {
            return c0.o(x.f68600a.getDecoderInfos(str, z10, z11));
        }
    };

    List getDecoderInfos(String str, boolean z10, boolean z11);
}
