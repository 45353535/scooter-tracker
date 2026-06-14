package c9;

import io.bidmachine.iab.vast.activity.VastActivity;

/* JADX INFO: loaded from: classes12.dex */
public interface b {
    void onVastClick(VastActivity vastActivity, g gVar, b9.f fVar, String str);

    void onVastComplete(VastActivity vastActivity, g gVar);

    void onVastDismiss(VastActivity vastActivity, g gVar, boolean z10);

    void onVastShowFailed(g gVar, y8.b bVar);

    void onVastShown(VastActivity vastActivity, g gVar);
}
