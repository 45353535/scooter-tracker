package yads;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class qw1 implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f115184b = "YandexAds.UrlTracker";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f115185c = "YandexAds.BaseController";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f115186a;

    public qw1(String str) {
        this.f115186a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f115186a);
    }
}
