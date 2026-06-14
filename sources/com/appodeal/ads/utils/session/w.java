package com.appodeal.ads.utils.session;

import com.appodeal.ads.ext.LogExtKt;
import com.unity3d.services.UnityAdsConstants;
import hg.l0;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class w implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f15119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Job f15121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableStateFlow f15122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f15123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableStateFlow f15124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MutableStateFlow f15125g;

    public w(CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f15119a = scope;
        this.f15120b = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        this.f15122d = l0.a(t.f15111b);
        this.f15123e = 30000L;
        this.f15124f = l0.a(7);
        this.f15125g = l0.a(60000L);
    }

    @Override // com.appodeal.ads.utils.session.s
    public final long a() {
        return this.f15123e;
    }

    @Override // com.appodeal.ads.utils.session.s
    public final StateFlow c() {
        return this.f15124f;
    }

    @Override // com.appodeal.ads.utils.session.s
    public final void d() {
        Job job = this.f15121c;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.f15121c = eg.i.d(this.f15119a, null, null, new u(this, null), 3, null);
    }

    @Override // com.appodeal.ads.utils.session.s
    public final StateFlow e() {
        return this.f15125g;
    }

    @Override // com.appodeal.ads.utils.session.s
    public final void g() {
        if (this.f15122d.b(t.f15112c, t.f15113d)) {
            Job job = this.f15121c;
            if (job != null) {
                Job.a.a(job, null, 1, null);
            }
            eg.i.d(this.f15119a, null, null, new v(this, null), 3, null);
        }
    }

    @Override // com.appodeal.ads.utils.session.s
    public final void a(JSONObject jsonObject) {
        Object value;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        try {
            Result.Companion companion = Result.f93230c;
            if (jsonObject.has("session_store_size")) {
                this.f15124f.setValue(Integer.valueOf(jsonObject.optInt("session_store_size")));
                LogExtKt.logInternal$default("SessionReporter", "New session_store_size=" + this.f15124f.getValue(), null, 4, null);
            }
            if (jsonObject.has("session_report_interval")) {
                this.f15120b = jsonObject.optLong("session_report_interval");
                d();
            }
            if (jsonObject.has("session_update_interval")) {
                this.f15125g.setValue(Long.valueOf(jsonObject.optLong("session_update_interval")));
            }
            if (jsonObject.has("session_timeout_duration")) {
                this.f15123e = jsonObject.optLong("session_timeout_duration");
            }
            Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            Result.b(kotlin.d.a(th2));
        }
        MutableStateFlow mutableStateFlow = this.f15122d;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value, t.f15112c));
    }

    @Override // com.appodeal.ads.utils.session.s
    public final void b() {
        d();
    }
}
