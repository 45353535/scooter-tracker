package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.ma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4432ma {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C4432ma f43725c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet<ImpressionDataListener> f43726a = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap<String, List<String>> f43727b = new ConcurrentHashMap<>();

    C4432ma() {
    }

    public static synchronized C4432ma b() {
        try {
            if (f43725c == null) {
                f43725c = new C4432ma();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f43725c;
    }

    public HashSet<ImpressionDataListener> a() {
        return this.f43726a;
    }

    public ConcurrentHashMap<String, List<String>> c() {
        return this.f43727b;
    }

    public void d() {
        synchronized (this) {
            this.f43726a.clear();
        }
    }

    public void a(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f43726a.add(impressionDataListener);
        }
    }

    public void b(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f43726a.remove(impressionDataListener);
        }
    }

    public void a(String str, List<String> list) {
        this.f43727b.put(str, list);
    }
}
