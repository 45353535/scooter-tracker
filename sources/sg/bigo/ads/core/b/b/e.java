package sg.bigo.ads.core.b.b;

import androidx.annotation.NonNull;
import java.util.List;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends g {
    public e(@NonNull sg.bigo.ads.core.b.a.a aVar) {
        super(aVar);
    }

    @Override // sg.bigo.ads.core.b.b.g
    protected final int a() {
        return this.f103958a.f103913e;
    }

    @Override // sg.bigo.ads.core.b.b.g
    protected final List<sg.bigo.ads.common.g.b.a> b() {
        return sg.bigo.ads.common.g.c.a.a(this.f103958a.f103913e, "impression", Reporting.EventType.VIDEO_AD_CLICKED, true);
    }
}
