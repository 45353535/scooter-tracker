package j$.time.zone;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CopyOnWriteArrayList f84769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f84770c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f84771a;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f84769b = copyOnWriteArrayList;
        f84770c = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new h(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f a(String str) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = f84770c;
        i iVar = (i) concurrentHashMap.get(str);
        if (iVar == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new g("No time-zone data files registered");
            }
            throw new g("Unknown time-zone ID: " + str);
        }
        if (iVar.f84771a.contains(str)) {
            return new f(TimeZone.getTimeZone(str));
        }
        throw new g("Not a built-in time zone: " + str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(i iVar) {
        Objects.requireNonNull(iVar, IronSourceConstants.EVENTS_PROVIDER);
        synchronized (i.class) {
            try {
                for (String str : iVar.f84771a) {
                    Objects.requireNonNull(str, "zoneId");
                    if (((i) f84770c.putIfAbsent(str, iVar)) != null) {
                        throw new g("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + iVar);
                    }
                }
                Collections.unmodifiableSet(new HashSet(f84770c.keySet()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f84769b.add(iVar);
    }

    public i() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.f84771a = Collections.unmodifiableSet(linkedHashSet);
    }
}
