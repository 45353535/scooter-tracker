package r6;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: loaded from: classes11.dex */
public class a extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f99220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n6.a f99221c;

    public a(String str, n6.a aVar) {
        this.f99220b = str;
        this.f99221c = aVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f99221c.onFailure(str);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f99221c.a(this.f99220b, queryInfo.getQuery(), queryInfo);
    }
}
