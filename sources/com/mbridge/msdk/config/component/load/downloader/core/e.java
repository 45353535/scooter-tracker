package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class e<T> implements p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f46981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    com.mbridge.msdk.config.component.load.downloader.b<T> f46982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.mbridge.msdk.config.component.load.downloader.c f46983c = com.mbridge.msdk.config.component.load.downloader.c.MEDIUM;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    com.mbridge.msdk.config.component.load.downloader.h f46984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Map<String, String> f46985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    HashMap<String, List<String>> f46986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    long f46987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f46988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    long f46989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f46990j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    long f46991k;

    public e(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        this.f46982b = bVar;
    }

    public e<T> a(long j10) {
        this.f46981a = j10;
        return this;
    }

    public e<T> b(long j10) {
        this.f46987g = j10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public d<T> build() {
        return d.a(this);
    }

    public p<T> c(long j10) {
        this.f46991k = j10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p<T> withTimeout(long j10) {
        this.f46989i = j10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e<T> withHttpRetryCounter(int i10) {
        this.f46988h = i10;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p<T> a(com.mbridge.msdk.config.component.load.downloader.h hVar) {
        this.f46984d = hVar;
        return this;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.p
    public p<T> a(com.mbridge.msdk.config.component.load.downloader.c cVar) {
        this.f46983c = cVar;
        return this;
    }
}
