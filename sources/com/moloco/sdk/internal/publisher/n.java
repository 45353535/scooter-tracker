package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements i0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f54838e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f54839f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdFormatType f54840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f54841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f54842d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ n(AdFormatType adFormatType, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormatType, j10);
    }

    public final long a(long j10) {
        long jB = j10 - b();
        long jT = kotlin.time.c.t(kotlin.time.b.q(this.f54841c) - jB, cg.b.f6838e);
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AdCreateLoadTimeoutManager", this.f54840b + " timeout: " + ((Object) kotlin.time.b.L(this.f54841c)) + " , create ad duration: " + jB + " ms (createTime: " + b() + " ms, loadStartTime: " + j10 + " ms). Return value: " + ((Object) kotlin.time.b.L(jT)), false, 4, null);
        return jT;
    }

    public long b() {
        return this.f54842d;
    }

    @Override // com.moloco.sdk.internal.publisher.i0
    public void setCreateAdObjectStartTime(long j10) {
        this.f54842d = j10;
    }

    public n(AdFormatType adFormatType, long j10) {
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        this.f54840b = adFormatType;
        this.f54841c = j10;
    }
}
