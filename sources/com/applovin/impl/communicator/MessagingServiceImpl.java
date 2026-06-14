package com.applovin.impl.communicator;

import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes6.dex */
public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ScheduledThreadPoolExecutor f8527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8528b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f8529c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f8530d = new Object();

    private Queue a(String str) {
        LinkedList linkedList;
        synchronized (this.f8530d) {
            try {
                Queue queue = (Queue) this.f8529c.get(str);
                linkedList = queue != null ? new LinkedList(queue) : new LinkedList();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return linkedList;
    }

    private void b(CommunicatorMessageImpl communicatorMessageImpl) {
        if (communicatorMessageImpl.sticky) {
            synchronized (this.f8530d) {
                try {
                    Queue queue = (Queue) this.f8529c.get(communicatorMessageImpl.getTopic());
                    if (queue != null) {
                        queue.add(communicatorMessageImpl);
                        if (queue.size() > 10) {
                            queue.remove();
                        }
                    } else {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(communicatorMessageImpl);
                        this.f8529c.put(communicatorMessageImpl.getTopic(), linkedList);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void c(final CommunicatorMessageImpl communicatorMessageImpl) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutorA = a();
        this.f8527a = scheduledThreadPoolExecutorA;
        scheduledThreadPoolExecutorA.execute(new Runnable() { // from class: com.applovin.impl.communicator.b
            @Override // java.lang.Runnable
            public final void run() {
                AppLovinBroadcastManager.sendBroadcastSync(communicatorMessageImpl, null);
            }
        });
    }

    public void maybeSendStickyMessages(String str) {
        Iterator it = a(str).iterator();
        while (it.hasNext()) {
            c((CommunicatorMessageImpl) it.next());
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorMessagingService
    public void publish(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        c(appLovinCommunicatorMessage);
        b(appLovinCommunicatorMessage);
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }

    private ScheduledThreadPoolExecutor a() {
        synchronized (this.f8528b) {
            try {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f8527a;
                if (scheduledThreadPoolExecutor != null) {
                    return scheduledThreadPoolExecutor;
                }
                return new ScheduledThreadPoolExecutor(1, new ThreadFactory() { // from class: com.applovin.impl.communicator.a
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        return MessagingServiceImpl.a(runnable);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread a(Runnable runnable) {
        Thread thread = new Thread(runnable, "AppLovinSdk:communicator");
        thread.setPriority(1);
        thread.setDaemon(true);
        return thread;
    }
}
