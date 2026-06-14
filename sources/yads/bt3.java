package yads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bt3 extends nt3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f109104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JSONObject f109105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f109106e;

    public bt3(mt3 mt3Var, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(mt3Var);
        this.f109104c = new HashSet(hashSet);
        this.f109105d = jSONObject;
        this.f109106e = j10;
    }
}
