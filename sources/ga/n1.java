package ga;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class n1 extends n9.x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f72390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImmutableList f72391e;

    public n1(String str, Uri uri, List list) {
        super(str, null, false, 1);
        this.f72390d = uri;
        this.f72391e = ImmutableList.copyOf((Collection) list);
    }
}
