package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
class CycleDetector {

    private static class ComponentNode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Component f31794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f31795b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set f31796c = new HashSet();

        ComponentNode(Component component) {
            this.f31794a = component;
        }

        void a(ComponentNode componentNode) {
            this.f31795b.add(componentNode);
        }

        void b(ComponentNode componentNode) {
            this.f31796c.add(componentNode);
        }

        Component c() {
            return this.f31794a;
        }

        Set d() {
            return this.f31795b;
        }

        boolean e() {
            return this.f31795b.isEmpty();
        }

        boolean f() {
            return this.f31796c.isEmpty();
        }

        void g(ComponentNode componentNode) {
            this.f31796c.remove(componentNode);
        }
    }

    private static class Dep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Qualified f31797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f31798b;

        public boolean equals(Object obj) {
            if (obj instanceof Dep) {
                Dep dep = (Dep) obj;
                if (dep.f31797a.equals(this.f31797a) && dep.f31798b == this.f31798b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.f31797a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f31798b).hashCode();
        }

        private Dep(Qualified qualified, boolean z10) {
            this.f31797a = qualified;
            this.f31798b = z10;
        }
    }

    static void a(List list) {
        Set<ComponentNode> setC = c(list);
        Set setB = b(setC);
        int i10 = 0;
        while (!setB.isEmpty()) {
            ComponentNode componentNode = (ComponentNode) setB.iterator().next();
            setB.remove(componentNode);
            i10++;
            for (ComponentNode componentNode2 : componentNode.d()) {
                componentNode2.g(componentNode);
                if (componentNode2.f()) {
                    setB.add(componentNode2);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ComponentNode componentNode3 : setC) {
            if (!componentNode3.f() && !componentNode3.e()) {
                arrayList.add(componentNode3.c());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    private static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ComponentNode componentNode = (ComponentNode) it.next();
            if (componentNode.f()) {
                hashSet.add(componentNode);
            }
        }
        return hashSet;
    }

    private static Set c(List list) {
        Set<ComponentNode> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (ComponentNode componentNode : (Set) it2.next()) {
                        for (Dependency dependency : componentNode.c().getDependencies()) {
                            if (dependency.isDirectInjection() && (set = (Set) map.get(new Dep(dependency.getInterface(), dependency.isSet()))) != null) {
                                for (ComponentNode componentNode2 : set) {
                                    componentNode.a(componentNode2);
                                    componentNode2.b(componentNode);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            Component component = (Component) it.next();
            ComponentNode componentNode3 = new ComponentNode(component);
            for (Qualified qualified : component.getProvidedInterfaces()) {
                Dep dep = new Dep(qualified, !component.isValue());
                if (!map.containsKey(dep)) {
                    map.put(dep, new HashSet());
                }
                Set set2 = (Set) map.get(dep);
                if (!set2.isEmpty() && !dep.f31798b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", qualified));
                }
                set2.add(componentNode3);
            }
        }
    }
}
