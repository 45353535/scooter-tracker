package androidx.test.runner.lifecycle;

/* JADX INFO: loaded from: classes5.dex */
public interface ApplicationLifecycleMonitor {
    void addLifecycleCallback(ApplicationLifecycleCallback applicationLifecycleCallback);

    void removeLifecycleCallback(ApplicationLifecycleCallback applicationLifecycleCallback);
}
