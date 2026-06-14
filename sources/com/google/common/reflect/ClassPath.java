package com.google.common.reflect;

import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Splitter;
import com.google.common.base.StandardSystemProperty;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.io.ByteSource;
import com.google.common.io.CharSource;
import com.google.common.io.Resources;
import com.google.common.reflect.ClassPath;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
public final class ClassPath {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f31149b = Logger.getLogger(ClassPath.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Splitter f31150c = Splitter.on(" ").omitEmptyStrings();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImmutableSet f31151a;

    public static final class ClassInfo extends ResourceInfo {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f31152d;

        ClassInfo(File file, String str, ClassLoader classLoader) {
            super(file, str, classLoader);
            this.f31152d = ClassPath.c(str);
        }

        public String getName() {
            return this.f31152d;
        }

        public String getPackageName() {
            return Reflection.getPackageName(this.f31152d);
        }

        public String getSimpleName() {
            int iLastIndexOf = this.f31152d.lastIndexOf(36);
            if (iLastIndexOf != -1) {
                return CharMatcher.inRange('0', '9').trimLeadingFrom(this.f31152d.substring(iLastIndexOf + 1));
            }
            String packageName = getPackageName();
            return packageName.isEmpty() ? this.f31152d : this.f31152d.substring(packageName.length() + 1);
        }

        public boolean isTopLevel() {
            return this.f31152d.indexOf(36) == -1;
        }

        public Class<?> load() {
            try {
                return this.f31157c.loadClass(this.f31152d);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException(e10);
            }
        }

        @Override // com.google.common.reflect.ClassPath.ResourceInfo
        public String toString() {
            return this.f31152d;
        }
    }

    static final class LocationInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final File f31153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ClassLoader f31154b;

        LocationInfo(File file, ClassLoader classLoader) {
            this.f31153a = (File) Preconditions.checkNotNull(file);
            this.f31154b = (ClassLoader) Preconditions.checkNotNull(classLoader);
        }

        private void a(File file, Set set, ImmutableSet.Builder builder) throws IOException {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        b(file, builder);
                    } else {
                        d(file, set, builder);
                    }
                }
            } catch (SecurityException e10) {
                ClassPath.f31149b.warning("Cannot access " + file + ": " + e10);
            }
        }

        private void b(File file, ImmutableSet.Builder builder) throws IOException {
            HashSet hashSet = new HashSet();
            hashSet.add(file.getCanonicalFile());
            c(file, "", hashSet, builder);
        }

        private void c(File file, String str, Set set, ImmutableSet.Builder builder) throws IOException {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                ClassPath.f31149b.warning("Cannot read directory " + file);
                return;
            }
            for (File file2 : fileArrListFiles) {
                String name = file2.getName();
                if (file2.isDirectory()) {
                    File canonicalFile = file2.getCanonicalFile();
                    if (set.add(canonicalFile)) {
                        c(canonicalFile, str + name + "/", set, builder);
                        set.remove(canonicalFile);
                    }
                } else {
                    String str2 = str + name;
                    if (!str2.equals("META-INF/MANIFEST.MF")) {
                        builder.add(ResourceInfo.a(file2, str2, this.f31154b));
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void d(File file, Set set, ImmutableSet.Builder builder) {
            try {
                JarFile jarFile = new JarFile(file);
                try {
                    UnmodifiableIterator it = ClassPath.f(file, jarFile.getManifest()).iterator();
                    while (it.hasNext()) {
                        File file2 = (File) it.next();
                        if (set.add(file2.getCanonicalFile())) {
                            a(file2, set, builder);
                        }
                    }
                    e(jarFile, builder);
                    jarFile.close();
                } catch (Throwable th2) {
                    try {
                        jarFile.close();
                    } catch (IOException unused) {
                    }
                    throw th2;
                }
            } catch (IOException unused2) {
            }
        }

        private void e(JarFile jarFile, ImmutableSet.Builder builder) {
            Enumeration<JarEntry> enumerationEntries = jarFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                JarEntry jarEntryNextElement = enumerationEntries.nextElement();
                if (!jarEntryNextElement.isDirectory() && !jarEntryNextElement.getName().equals("META-INF/MANIFEST.MF")) {
                    builder.add(ResourceInfo.a(new File(jarFile.getName()), jarEntryNextElement.getName(), this.f31154b));
                }
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof LocationInfo) {
                LocationInfo locationInfo = (LocationInfo) obj;
                if (this.f31153a.equals(locationInfo.f31153a) && this.f31154b.equals(locationInfo.f31154b)) {
                    return true;
                }
            }
            return false;
        }

        public final File file() {
            return this.f31153a;
        }

        public int hashCode() {
            return this.f31153a.hashCode();
        }

        public ImmutableSet<ResourceInfo> scanResources() throws IOException {
            return scanResources(new HashSet());
        }

        public String toString() {
            return this.f31153a.toString();
        }

        public ImmutableSet<ResourceInfo> scanResources(Set<File> set) throws IOException {
            ImmutableSet.Builder builder = ImmutableSet.builder();
            set.add(this.f31153a);
            a(this.f31153a, set, builder);
            return builder.build();
        }
    }

    public static class ResourceInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f31155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f31156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ClassLoader f31157c;

        ResourceInfo(File file, String str, ClassLoader classLoader) {
            this.f31155a = (File) Preconditions.checkNotNull(file);
            this.f31156b = (String) Preconditions.checkNotNull(str);
            this.f31157c = (ClassLoader) Preconditions.checkNotNull(classLoader);
        }

        static ResourceInfo a(File file, String str, ClassLoader classLoader) {
            return str.endsWith(".class") ? new ClassInfo(file, str, classLoader) : new ResourceInfo(file, str, classLoader);
        }

        public final ByteSource asByteSource() {
            return Resources.asByteSource(url());
        }

        public final CharSource asCharSource(Charset charset) {
            return Resources.asCharSource(url(), charset);
        }

        public boolean equals(Object obj) {
            if (obj instanceof ResourceInfo) {
                ResourceInfo resourceInfo = (ResourceInfo) obj;
                if (this.f31156b.equals(resourceInfo.f31156b) && this.f31157c == resourceInfo.f31157c) {
                    return true;
                }
            }
            return false;
        }

        public final String getResourceName() {
            return this.f31156b;
        }

        public int hashCode() {
            return this.f31156b.hashCode();
        }

        public String toString() {
            return this.f31156b;
        }

        public final URL url() {
            URL resource = this.f31157c.getResource(this.f31156b);
            if (resource != null) {
                return resource;
            }
            throw new NoSuchElementException(this.f31156b);
        }
    }

    private ClassPath(ImmutableSet immutableSet) {
        this.f31151a = immutableSet;
    }

    private static ImmutableList b(ClassLoader classLoader) {
        return classLoader instanceof URLClassLoader ? ImmutableList.copyOf(((URLClassLoader) classLoader).getURLs()) : classLoader.equals(ClassLoader.getSystemClassLoader()) ? h() : ImmutableList.of();
    }

    static String c(String str) {
        return str.substring(0, str.length() - 6).replace(IOUtils.DIR_SEPARATOR_UNIX, '.');
    }

    /* JADX WARN: Multi-variable type inference failed */
    static ImmutableMap d(ClassLoader classLoader) {
        LinkedHashMap linkedHashMapNewLinkedHashMap = Maps.newLinkedHashMap();
        ClassLoader parent = classLoader.getParent();
        if (parent != null) {
            linkedHashMapNewLinkedHashMap.putAll(d(parent));
        }
        UnmodifiableIterator it = b(classLoader).iterator();
        while (it.hasNext()) {
            URL url = (URL) it.next();
            if (url.getProtocol().equals(C4240b4.i.f42616b)) {
                File fileI = i(url);
                if (!linkedHashMapNewLinkedHashMap.containsKey(fileI)) {
                    linkedHashMapNewLinkedHashMap.put(fileI, classLoader);
                }
            }
        }
        return ImmutableMap.copyOf((Map) linkedHashMapNewLinkedHashMap);
    }

    static URL e(File file, String str) {
        return new URL(file.toURI().toURL(), str);
    }

    static ImmutableSet f(File file, Manifest manifest) {
        if (manifest == null) {
            return ImmutableSet.of();
        }
        ImmutableSet.Builder builder = ImmutableSet.builder();
        String value = manifest.getMainAttributes().getValue(Attributes.Name.CLASS_PATH.toString());
        if (value != null) {
            for (String str : f31150c.split(value)) {
                try {
                    URL urlE = e(file, str);
                    if (urlE.getProtocol().equals(C4240b4.i.f42616b)) {
                        builder.add(i(urlE));
                    }
                } catch (MalformedURLException unused) {
                    f31149b.warning("Invalid Class-Path entry: " + str);
                }
            }
        }
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ClassPath from(ClassLoader classLoader) throws IOException {
        ImmutableSet immutableSetG = g(classLoader);
        HashSet hashSet = new HashSet();
        UnmodifiableIterator it = immutableSetG.iterator();
        while (it.hasNext()) {
            hashSet.add(((LocationInfo) it.next()).file());
        }
        ImmutableSet.Builder builder = ImmutableSet.builder();
        UnmodifiableIterator it2 = immutableSetG.iterator();
        while (it2.hasNext()) {
            builder.addAll((Iterable) ((LocationInfo) it2.next()).scanResources(hashSet));
        }
        return new ClassPath(builder.build());
    }

    static ImmutableSet g(ClassLoader classLoader) {
        ImmutableSet.Builder builder = ImmutableSet.builder();
        UnmodifiableIterator it = d(classLoader).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.add(new LocationInfo((File) entry.getKey(), (ClassLoader) entry.getValue()));
        }
        return builder.build();
    }

    static ImmutableList h() {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (String str : Splitter.on(StandardSystemProperty.PATH_SEPARATOR.value()).split(StandardSystemProperty.JAVA_CLASS_PATH.value())) {
            try {
                try {
                    builder.add(new File(str).toURI().toURL());
                } catch (SecurityException unused) {
                    builder.add(new URL(C4240b4.i.f42616b, (String) null, new File(str).getAbsolutePath()));
                }
            } catch (MalformedURLException e10) {
                f31149b.log(Level.WARNING, "malformed classpath entry: " + str, (Throwable) e10);
            }
        }
        return builder.build();
    }

    static File i(URL url) {
        Preconditions.checkArgument(url.getProtocol().equals(C4240b4.i.f42616b));
        try {
            return new File(url.toURI());
        } catch (URISyntaxException unused) {
            return new File(url.getPath());
        }
    }

    public ImmutableSet<ClassInfo> getAllClasses() {
        return FluentIterable.from(this.f31151a).filter(ClassInfo.class).toSet();
    }

    public ImmutableSet<ResourceInfo> getResources() {
        return this.f31151a;
    }

    public ImmutableSet<ClassInfo> getTopLevelClasses() {
        return FluentIterable.from(this.f31151a).filter(ClassInfo.class).filter(new Predicate() { // from class: com.google.common.reflect.a
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return ((ClassPath.ClassInfo) obj).isTopLevel();
            }
        }).toSet();
    }

    public ImmutableSet<ClassInfo> getTopLevelClassesRecursive(String str) {
        Preconditions.checkNotNull(str);
        String str2 = str + '.';
        ImmutableSet.Builder builder = ImmutableSet.builder();
        UnmodifiableIterator<ClassInfo> it = getTopLevelClasses().iterator();
        while (it.hasNext()) {
            ClassInfo next = it.next();
            if (next.getName().startsWith(str2)) {
                builder.add(next);
            }
        }
        return builder.build();
    }

    public ImmutableSet<ClassInfo> getTopLevelClasses(String str) {
        Preconditions.checkNotNull(str);
        ImmutableSet.Builder builder = ImmutableSet.builder();
        UnmodifiableIterator<ClassInfo> it = getTopLevelClasses().iterator();
        while (it.hasNext()) {
            ClassInfo next = it.next();
            if (next.getPackageName().equals(str)) {
                builder.add(next);
            }
        }
        return builder.build();
    }
}
