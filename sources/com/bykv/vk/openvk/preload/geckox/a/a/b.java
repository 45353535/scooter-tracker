package com.bykv.vk.openvk.preload.geckox.a.a;

import android.annotation.SuppressLint;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"CI_StaticFieldLeak"})
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f15731a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f15732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected a f15733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected File f15734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected List<String> f15735e;

    static {
        new f();
        f15732b = new e();
    }

    public abstract void a();

    public void a(a aVar, File file, List<String> list) {
        this.f15733c = aVar;
        this.f15734d = file;
        this.f15735e = list;
    }
}
