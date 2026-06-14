package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.g7;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Pattern f83634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Pattern f83635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ClassLoader f83636g;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f83637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f83638b;

        public a(String str, String str2) {
            this.f83637a = str;
            this.f83638b = str2;
        }
    }

    public c(ILogger iLogger) {
        this(c.class.getClassLoader(), iLogger);
    }

    private a d(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f83635f.matcher(str);
        if (matcher.matches() && matcher.groupCount() == 2) {
            return new a(matcher.group(1), matcher.group(2));
        }
        return null;
    }

    private List e() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f83636g.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                a aVarD = d(f(resources.nextElement()));
                if (aVarD != null) {
                    arrayList.add(aVarD);
                }
            }
        } catch (Throwable th2) {
            this.f83640a.a(g7.ERROR, "Unable to detect modules via manifest files.", th2);
        }
        return arrayList;
    }

    private String f(URL url) {
        Matcher matcher = this.f83634e.matcher(url.toString());
        if (matcher.matches() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        return null;
    }

    @Override // io.sentry.internal.modules.d
    protected Map b() {
        HashMap map = new HashMap();
        for (a aVar : e()) {
            map.put(aVar.f83637a, aVar.f83638b);
        }
        return map;
    }

    c(ClassLoader classLoader, ILogger iLogger) {
        super(iLogger);
        this.f83634e = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.f83635f = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.f83636g = io.sentry.util.b.a(classLoader);
    }
}
