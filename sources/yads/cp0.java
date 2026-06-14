package yads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface cp0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f109503d = 0;

    static {
        new cp0() { // from class: yads.y4
            @Override // yads.cp0
            public final xo0[] a() {
                return f5.b();
            }

            @Override // yads.cp0
            public /* synthetic */ xo0[] a(Uri uri, Map map) {
                return f5.a(this, uri, map);
            }
        };
    }

    xo0[] a();

    xo0[] a(Uri uri, Map map);
}
