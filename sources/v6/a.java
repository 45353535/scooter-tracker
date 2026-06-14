package v6;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* JADX INFO: loaded from: classes11.dex */
public class a extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f105761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n6.a f105762c;

    public a(String str, n6.a aVar) {
        this.f105761b = str;
        this.f105762c = aVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onFailure(String str) {
        this.f105762c.onFailure(str);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public void onSuccess(QueryInfo queryInfo) {
        this.f105762c.a(this.f105761b, queryInfo.getQuery(), queryInfo);
    }
}
