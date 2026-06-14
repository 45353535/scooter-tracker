package s9;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class t extends r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f99887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f99888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f99889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f99890h;

    public t(int i10, String str, IOException iOException, Map map, k kVar, byte[] bArr) {
        super("Response code: " + i10, iOException, kVar, 2004, 1);
        this.f99887e = i10;
        this.f99888f = str;
        this.f99889g = map;
        this.f99890h = bArr;
    }
}
