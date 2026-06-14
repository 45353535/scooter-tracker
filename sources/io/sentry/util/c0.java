package io.sentry.util;

import io.sentry.p7;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f84294a = new ConcurrentHashMap();

    public static List a(p7 p7Var) {
        ArrayList arrayList = new ArrayList();
        p7 p7Var2 = p7.AGENT;
        if (p7Var2 == p7Var || p7.AGENTLESS_SPRING == p7Var) {
            arrayList.add("auto.http.spring_jakarta.webmvc");
            arrayList.add("auto.http.spring.webmvc");
            arrayList.add("auto.http.spring7.webmvc");
            arrayList.add("auto.spring_jakarta.webflux");
            arrayList.add("auto.spring.webflux");
            arrayList.add("auto.spring7.webflux");
            arrayList.add("auto.db.jdbc");
            arrayList.add("auto.http.spring_jakarta.webclient");
            arrayList.add("auto.http.spring.webclient");
            arrayList.add("auto.http.spring7.webclient");
            arrayList.add("auto.http.spring_jakarta.restclient");
            arrayList.add("auto.http.spring.restclient");
            arrayList.add("auto.http.spring7.restclient");
            arrayList.add("auto.http.spring_jakarta.resttemplate");
            arrayList.add("auto.http.spring.resttemplate");
            arrayList.add("auto.http.spring7.resttemplate");
            arrayList.add("auto.http.openfeign");
            arrayList.add("auto.http.ktor-client");
        }
        if (p7Var2 == p7Var) {
            arrayList.add("auto.graphql.graphql");
            arrayList.add("auto.graphql.graphql22");
        }
        return arrayList;
    }

    public static boolean b(List list, String str) {
        if (str != null && list != null && !list.isEmpty()) {
            Map map = f84294a;
            if (map.containsKey(str)) {
                return ((Boolean) map.get(str)).booleanValue();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((io.sentry.g0) it.next()).a().equalsIgnoreCase(str)) {
                    f84294a.put(str, Boolean.TRUE);
                    return true;
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    if (((io.sentry.g0) it2.next()).b(str)) {
                        f84294a.put(str, Boolean.TRUE);
                        return true;
                    }
                    continue;
                } catch (Throwable unused) {
                }
            }
            f84294a.put(str, Boolean.FALSE);
        }
        return false;
    }
}
