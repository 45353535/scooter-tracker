package com.my.tracker.obfuscated;

import android.app.Application;
import com.my.tracker.plugins.MyTrackerPlugin;
import com.my.tracker.plugins.MyTrackerPluginConfig;
import com.my.tracker.plugins.PluginEventTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f61714a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f61715b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PluginEventTracker f61716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Application f61717d;

    private n1(PluginEventTracker pluginEventTracker, Application application) {
        this.f61716c = pluginEventTracker;
        this.f61717d = application;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MyTrackerPluginConfig myTrackerPluginConfig = (MyTrackerPluginConfig) it.next();
            String pluginName = myTrackerPluginConfig.getPluginName();
            x2.c("PluginHandler: initializing plugin " + pluginName);
            try {
                MyTrackerPlugin myTrackerPlugin = (MyTrackerPlugin) Class.forName(myTrackerPluginConfig.getPluginClass()).newInstance();
                myTrackerPlugin.init(myTrackerPluginConfig, this.f61716c, this.f61717d);
                this.f61714a.add(myTrackerPlugin);
                x2.c("PluginHandler: plugin " + pluginName + " is initialized");
            } catch (Throwable th2) {
                x2.b("PluginHandler: exception occurred while initialization plugin " + pluginName, th2);
            }
        }
    }

    public static n1 a(e0 e0Var, Application application) {
        return new n1(PluginEventTracker.a(e0Var), application);
    }

    public void a(final List list) {
        if (!this.f61715b.compareAndSet(false, true)) {
            x2.a("PluginHandler: instance has already been initialized");
        } else {
            m.a(new Runnable() { // from class: com.my.tracker.obfuscated.u6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f61855b.b(list);
                }
            });
        }
    }
}
