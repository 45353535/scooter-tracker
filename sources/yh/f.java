package yh;

import com.ironsource.C4240b4;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.helpers.h;
import org.slf4j.helpers.j;
import org.slf4j.helpers.l;
import org.slf4j.helpers.n;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static volatile int f119114a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static volatile ai.b f119118e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final l f119115b = new l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final h f119116c = new h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f119117d = n.c("slf4j.detectLoggerNameMismatch");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f119119f = {"2.0"};

    private static final void b() {
        try {
            List listH = h();
            v(listH);
            if (listH == null || listH.isEmpty()) {
                f119114a = 4;
                n.a("No SLF4J providers were found.");
                n.a("Defaulting to no-operation (NOP) logger implementation");
                n.a("See https://www.slf4j.org/codes.html#noProviders for further details.");
                u(g());
            } else {
                f119118e = (ai.b) listH.get(0);
                f119118e.initialize();
                f119114a = 3;
                t(listH);
            }
            q();
        } catch (Exception e10) {
            f(e10);
            throw new IllegalStateException("Unexpected initialization failure", e10);
        }
    }

    private static void c(zh.d dVar, int i10) {
        if (dVar.c().e()) {
            d(i10);
        } else {
            if (dVar.c().f()) {
                return;
            }
            e();
        }
    }

    private static void d(int i10) {
        n.a("A number (" + i10 + ") of logging calls during the initialization phase have been intercepted and are");
        n.a("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        n.a("See also https://www.slf4j.org/codes.html#replay");
    }

    private static void e() {
        n.a("The following set of substitute loggers may have been accessed");
        n.a("during the initialization phase. Logging calls during this");
        n.a("phase were not honored. However, subsequent logging calls to these");
        n.a("loggers will work as normally expected.");
        n.a("See also https://www.slf4j.org/codes.html#substituteLogger");
    }

    static void f(Throwable th2) {
        f119114a = 2;
        n.b("Failed to instantiate SLF4J LoggerFactory", th2);
    }

    static Set g() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = f.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e10) {
            n.b("Error getting resources from path", e10);
        }
        return linkedHashSet;
    }

    static List h() {
        ArrayList arrayList = new ArrayList();
        ClassLoader classLoader = f.class.getClassLoader();
        ai.b bVarO = o(classLoader);
        if (bVarO != null) {
            arrayList.add(bVarO);
            return arrayList;
        }
        Iterator it = m(classLoader).iterator();
        while (it.hasNext()) {
            w(arrayList, it);
        }
        return arrayList;
    }

    private static void i() {
        l lVar = f119115b;
        synchronized (lVar) {
            try {
                lVar.c().e();
                for (j jVar : lVar.c().d()) {
                    jVar.q(k(jVar.c()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static a j() {
        return l().a();
    }

    public static d k(String str) {
        return j().a(str);
    }

    static ai.b l() {
        if (f119114a == 0) {
            synchronized (f.class) {
                try {
                    if (f119114a == 0) {
                        f119114a = 1;
                        p();
                    }
                } finally {
                }
            }
        }
        int i10 = f119114a;
        if (i10 == 1) {
            return f119115b;
        }
        if (i10 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i10 == 3) {
            return f119118e;
        }
        if (i10 == 4) {
            return f119116c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    private static ServiceLoader m(final ClassLoader classLoader) {
        return System.getSecurityManager() == null ? ServiceLoader.load(ai.b.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: yh.e
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(ai.b.class, classLoader);
            }
        });
    }

    private static boolean n(List list) {
        return list.size() > 1;
    }

    static ai.b o(ClassLoader classLoader) {
        String property = System.getProperty("slf4j.provider");
        if (property != null && !property.isEmpty()) {
            try {
                n.a(String.format("Attempting to load provider \"%s\" specified via \"%s\" system property", property, "slf4j.provider"));
                return (ai.b) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e10) {
                n.b(String.format("Specified SLF4JServiceProvider (%s) does not implement SLF4JServiceProvider interface", property), e10);
                return null;
            } catch (ClassNotFoundException e11) {
                e = e11;
                n.b(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (IllegalAccessException e12) {
                e = e12;
                n.b(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (InstantiationException e13) {
                e = e13;
                n.b(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (NoSuchMethodException e14) {
                e = e14;
                n.b(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (InvocationTargetException e15) {
                e = e15;
                n.b(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            }
        }
        return null;
    }

    private static final void p() {
        b();
        if (f119114a == 3) {
            x();
        }
    }

    private static void q() {
        i();
        r();
        f119115b.c().b();
    }

    private static void r() {
        LinkedBlockingQueue linkedBlockingQueueC = f119115b.c().c();
        int size = linkedBlockingQueueC.size();
        ArrayList<zh.d> arrayList = new ArrayList(128);
        int i10 = 0;
        while (linkedBlockingQueueC.drainTo(arrayList, 128) != 0) {
            for (zh.d dVar : arrayList) {
                s(dVar);
                int i11 = i10 + 1;
                if (i10 == 0) {
                    c(dVar, size);
                }
                i10 = i11;
            }
            arrayList.clear();
        }
    }

    private static void s(zh.d dVar) {
        if (dVar == null) {
            return;
        }
        j jVarC = dVar.c();
        String strC = jVarC.c();
        if (jVarC.o()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (jVarC.f()) {
            return;
        }
        if (!jVarC.e()) {
            n.a(strC);
        } else if (jVarC.m(dVar.b())) {
            jVarC.p(dVar);
        }
    }

    private static void t(List list) {
        if (list.isEmpty() || !n(list)) {
            return;
        }
        n.a("Actual provider is of type [" + list.get(0) + C4240b4.j.f42674e);
    }

    private static void u(Set set) {
        if (set.isEmpty()) {
            return;
        }
        n.a("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            n.a("Ignoring binding found at [" + ((URL) it.next()) + C4240b4.j.f42674e);
        }
        n.a("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    private static void v(List list) {
        if (n(list)) {
            n.a("Class path contains multiple SLF4J providers.");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n.a("Found provider [" + ((ai.b) it.next()) + C4240b4.j.f42674e);
            }
            n.a("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    private static void w(List list, Iterator it) {
        try {
            list.add((ai.b) it.next());
        } catch (ServiceConfigurationError e10) {
            n.a("A SLF4J service provider failed to instantiate:\n" + e10.getMessage());
        }
    }

    private static final void x() {
        try {
            String strB = f119118e.b();
            boolean z10 = false;
            for (String str : f119119f) {
                if (strB.startsWith(str)) {
                    z10 = true;
                }
            }
            if (z10) {
                return;
            }
            n.a("The requested version " + strB + " by your slf4j provider is not compatible with " + Arrays.asList(f119119f).toString());
            n.a("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th2) {
            n.b("Unexpected problem occurred during version sanity check", th2);
        }
    }
}
